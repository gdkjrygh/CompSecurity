// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import java.nio.ByteBuffer;
import org.apache.log4j.Logger;
import org.keyczar.enums.KeyPurpose;
import org.keyczar.exceptions.BadVersionException;
import org.keyczar.exceptions.InvalidSignatureException;
import org.keyczar.exceptions.KeyNotFoundException;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.exceptions.ShortCiphertextException;
import org.keyczar.i18n.Messages;
import org.keyczar.interfaces.DecryptingStream;
import org.keyczar.interfaces.KeyczarReader;
import org.keyczar.interfaces.VerifyingStream;

// Referenced classes of package org.keyczar:
//            Encrypter, StreamCache, KeyczarKey

public class Crypter extends Encrypter
{

    private static final Logger LOG = Logger.getLogger(org/keyczar/Crypter);
    private final StreamCache CRYPT_CACHE = new StreamCache();

    public Crypter(KeyczarReader keyczarreader)
        throws KeyczarException
    {
        super(keyczarreader);
    }

    private void decrypt(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
        throws KeyczarException
    {
        ByteBuffer bytebuffer2 = bytebuffer.asReadOnlyBuffer();
        LOG.debug(Messages.getString("Crypter.Decrypting", new Object[] {
            Integer.valueOf(bytebuffer2.remaining())
        }));
        if (bytebuffer2.remaining() < 5)
        {
            throw new ShortCiphertextException(bytebuffer2.remaining());
        }
        byte byte0 = bytebuffer2.get();
        if (byte0 != 0)
        {
            throw new BadVersionException(byte0);
        }
        byte abyte0[] = new byte[4];
        bytebuffer2.get(abyte0);
        KeyczarKey keyczarkey = getKey(abyte0);
        if (keyczarkey == null)
        {
            throw new KeyNotFoundException(abyte0);
        }
        bytebuffer2.mark();
        Object obj = (DecryptingStream)CRYPT_CACHE.get(keyczarkey);
        DecryptingStream decryptingstream = ((DecryptingStream) (obj));
        if (obj == null)
        {
            decryptingstream = (DecryptingStream)keyczarkey.getStream();
        }
        obj = decryptingstream.getVerifyingStream();
        if (bytebuffer2.remaining() < ((VerifyingStream) (obj)).digestSize())
        {
            throw new ShortCiphertextException(bytebuffer2.remaining());
        }
        bytebuffer2.position(bytebuffer2.limit() - ((VerifyingStream) (obj)).digestSize());
        ByteBuffer bytebuffer3 = bytebuffer2.slice();
        bytebuffer2.reset();
        bytebuffer2.limit(bytebuffer2.limit() - ((VerifyingStream) (obj)).digestSize());
        decryptingstream.initDecrypt(bytebuffer2);
        bytebuffer = bytebuffer.asReadOnlyBuffer();
        bytebuffer.limit(bytebuffer2.position());
        ((VerifyingStream) (obj)).initVerify();
        ((VerifyingStream) (obj)).updateVerify(bytebuffer);
        bytebuffer1.mark();
        for (; bytebuffer2.remaining() > 1024; bytebuffer2.position(bytebuffer2.position() + 1024))
        {
            bytebuffer = bytebuffer2.slice();
            bytebuffer.limit(1024);
            decryptingstream.updateDecrypt(bytebuffer, bytebuffer1);
            bytebuffer.rewind();
            ((VerifyingStream) (obj)).updateVerify(bytebuffer);
        }

        bytebuffer2.mark();
        ((VerifyingStream) (obj)).updateVerify(bytebuffer2);
        if (!((VerifyingStream) (obj)).verify(bytebuffer3))
        {
            throw new InvalidSignatureException();
        } else
        {
            bytebuffer2.reset();
            decryptingstream.doFinalDecrypt(bytebuffer2, bytebuffer1);
            bytebuffer1.limit(bytebuffer1.position());
            CRYPT_CACHE.put(keyczarkey, decryptingstream);
            return;
        }
    }

    public final byte[] decrypt(byte abyte0[])
        throws KeyczarException
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(abyte0.length);
        decrypt(ByteBuffer.wrap(abyte0), bytebuffer);
        bytebuffer.reset();
        abyte0 = new byte[bytebuffer.remaining()];
        bytebuffer.get(abyte0);
        return abyte0;
    }

    final boolean isAcceptablePurpose(KeyPurpose keypurpose)
    {
        return keypurpose == KeyPurpose.DECRYPT_AND_ENCRYPT;
    }

}
