// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import java.nio.ByteBuffer;
import org.apache.log4j.Logger;
import org.keyczar.enums.KeyPurpose;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.exceptions.NoPrimaryKeyException;
import org.keyczar.interfaces.KeyczarReader;
import org.keyczar.interfaces.SigningStream;
import org.keyczar.util.Util;

// Referenced classes of package org.keyczar:
//            Verifier, StreamQueue, KeyczarKey

public class Signer extends Verifier
{

    private static final Logger LOG = Logger.getLogger(org/keyczar/Signer);
    private final StreamQueue SIGN_QUEUE = new StreamQueue();

    public Signer(KeyczarReader keyczarreader)
        throws KeyczarException
    {
        super(keyczarreader);
    }

    public final byte[] attachedSign(byte abyte0[], byte abyte1[])
        throws KeyczarException
    {
        KeyczarKey keyczarkey = getPrimaryKey();
        if (keyczarkey == null)
        {
            throw new NoPrimaryKeyException();
        }
        SigningStream signingstream1 = (SigningStream)SIGN_QUEUE.poll();
        SigningStream signingstream = signingstream1;
        if (signingstream1 == null)
        {
            signingstream = (SigningStream)keyczarkey.getStream();
        }
        signingstream.initSign();
        byte abyte2[] = Util.fromInt(0);
        if (abyte1.length > 0)
        {
            abyte2 = Util.lenPrefix(abyte1);
        }
        signingstream.updateSign(ByteBuffer.wrap(abyte0));
        signingstream.updateSign(ByteBuffer.wrap(abyte2));
        signingstream.updateSign(ByteBuffer.wrap(FORMAT_BYTES));
        abyte1 = ByteBuffer.allocate(signingstream.digestSize());
        abyte1.mark();
        signingstream.sign(abyte1);
        abyte1.limit(abyte1.position());
        abyte0 = Util.cat(new byte[][] {
            FORMAT_BYTES, keyczarkey.hash(), Util.lenPrefix(abyte0), abyte1.array()
        });
        SIGN_QUEUE.add(signingstream);
        return abyte0;
    }

    final boolean isAcceptablePurpose(KeyPurpose keypurpose)
    {
        return keypurpose == KeyPurpose.SIGN_AND_VERIFY;
    }

}
