// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;
import org.keyczar.enums.KeyPurpose;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.exceptions.NoPrimaryKeyException;
import org.keyczar.i18n.Messages;
import org.keyczar.interfaces.EncryptingStream;
import org.keyczar.interfaces.KeyczarReader;
import org.keyczar.interfaces.SigningStream;
import org.keyczar.util.Base64Coder;

// Referenced classes of package org.keyczar:
//            Keyczar, StreamQueue, KeyczarKey

public class Encrypter extends Keyczar
{

    private static final Logger LOG = Logger.getLogger(org/keyczar/Encrypter);
    private final StreamQueue ENCRYPT_QUEUE = new StreamQueue();

    public Encrypter(KeyczarReader keyczarreader)
        throws KeyczarException
    {
        super(keyczarreader);
    }

    private int ciphertextSize(int i)
        throws KeyczarException
    {
        Object obj1 = (EncryptingStream)ENCRYPT_QUEUE.poll();
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = getPrimaryKey();
            if (obj == null)
            {
                throw new NoPrimaryKeyException();
            }
            obj = (EncryptingStream)((KeyczarKey) (obj)).getStream();
        }
        obj1 = ((EncryptingStream) (obj)).getSigningStream();
        i = ((EncryptingStream) (obj)).maxOutputSize(i);
        int j = ((SigningStream) (obj1)).digestSize();
        ENCRYPT_QUEUE.add(obj);
        return i + 5 + j;
    }

    private void encrypt(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
        throws KeyczarException
    {
        LOG.debug(Messages.getString("Encrypter.Encrypting", new Object[] {
            Integer.valueOf(bytebuffer.remaining())
        }));
        KeyczarKey keyczarkey = getPrimaryKey();
        if (keyczarkey == null)
        {
            throw new NoPrimaryKeyException();
        }
        Object obj = (EncryptingStream)ENCRYPT_QUEUE.poll();
        EncryptingStream encryptingstream = ((EncryptingStream) (obj));
        if (obj == null)
        {
            encryptingstream = (EncryptingStream)keyczarkey.getStream();
        }
        obj = encryptingstream.getSigningStream();
        ((SigningStream) (obj)).initSign();
        bytebuffer1.mark();
        ByteBuffer bytebuffer3 = bytebuffer1.asReadOnlyBuffer();
        keyczarkey.copyHeader(bytebuffer1);
        encryptingstream.initEncrypt(bytebuffer1);
        for (bytebuffer = bytebuffer.asReadOnlyBuffer(); bytebuffer.remaining() > 1024; bytebuffer3.position(bytebuffer1.position()))
        {
            ByteBuffer bytebuffer2 = bytebuffer.slice();
            bytebuffer2.limit(1024);
            encryptingstream.updateEncrypt(bytebuffer2, bytebuffer1);
            bytebuffer.position(bytebuffer.position() + 1024);
            bytebuffer3.limit(bytebuffer1.position());
            ((SigningStream) (obj)).updateSign(bytebuffer3);
        }

        encryptingstream.doFinalEncrypt(bytebuffer, bytebuffer1);
        bytebuffer1.limit(bytebuffer1.position() + ((SigningStream) (obj)).digestSize());
        bytebuffer3.limit(bytebuffer1.position());
        ((SigningStream) (obj)).updateSign(bytebuffer3);
        ((SigningStream) (obj)).sign(bytebuffer1);
        ENCRYPT_QUEUE.add(encryptingstream);
    }

    public final String encrypt(String s)
        throws KeyczarException
    {
        try
        {
            s = Base64Coder.encodeWebSafe(encrypt(s.getBytes("UTF-8")));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new KeyczarException(s);
        }
        return s;
    }

    public final byte[] encrypt(byte abyte0[])
        throws KeyczarException
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(ciphertextSize(abyte0.length));
        encrypt(ByteBuffer.wrap(abyte0), bytebuffer);
        bytebuffer.reset();
        abyte0 = new byte[bytebuffer.remaining()];
        bytebuffer.get(abyte0);
        return abyte0;
    }

    boolean isAcceptablePurpose(KeyPurpose keypurpose)
    {
        return keypurpose == KeyPurpose.ENCRYPT || keypurpose == KeyPurpose.DECRYPT_AND_ENCRYPT;
    }

}
