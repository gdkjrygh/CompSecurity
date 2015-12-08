// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.engines:
//            RC2Engine

public class RC2WrapEngine
    implements Wrapper
{

    private static final byte IV2[] = {
        74, -35, -94, 44, 121, -24, 33, 5
    };
    byte digest[];
    private CBCBlockCipher engine;
    private boolean forWrapping;
    private byte iv[];
    private CipherParameters param;
    private ParametersWithIV paramPlusIV;
    Digest sha1;
    private SecureRandom sr;

    public RC2WrapEngine()
    {
        sha1 = new SHA1Digest();
        digest = new byte[20];
    }

    private byte[] calculateCMSKeyChecksum(byte abyte0[])
    {
        byte abyte1[] = new byte[8];
        sha1.update(abyte0, 0, abyte0.length);
        sha1.doFinal(digest, 0);
        System.arraycopy(digest, 0, abyte1, 0, 8);
        return abyte1;
    }

    private boolean checkCMSKeyChecksum(byte abyte0[], byte abyte1[])
    {
        return Arrays.constantTimeAreEqual(calculateCMSKeyChecksum(abyte0), abyte1);
    }

    public String getAlgorithmName()
    {
        return "RC2";
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        forWrapping = flag;
        engine = new CBCBlockCipher(new RC2Engine());
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (ParametersWithRandom)cipherparameters;
            sr = cipherparameters.getRandom();
            cipherparameters = cipherparameters.getParameters();
        } else
        {
            sr = new SecureRandom();
        }
        if (cipherparameters instanceof ParametersWithIV)
        {
            paramPlusIV = (ParametersWithIV)cipherparameters;
            iv = paramPlusIV.getIV();
            param = paramPlusIV.getParameters();
            if (forWrapping)
            {
                if (iv == null || iv.length != 8)
                {
                    throw new IllegalArgumentException("IV is not 8 octets");
                }
            } else
            {
                throw new IllegalArgumentException("You should not supply an IV for unwrapping");
            }
        } else
        {
            param = cipherparameters;
            if (forWrapping)
            {
                iv = new byte[8];
                sr.nextBytes(iv);
                paramPlusIV = new ParametersWithIV(param, iv);
            }
        }
    }

    public byte[] unwrap(byte abyte0[], int i, int j)
        throws InvalidCipherTextException
    {
        if (forWrapping)
        {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (abyte0 == null)
        {
            throw new InvalidCipherTextException("Null pointer as ciphertext");
        }
        if (j % engine.getBlockSize() != 0)
        {
            throw new InvalidCipherTextException((new StringBuilder()).append("Ciphertext not multiple of ").append(engine.getBlockSize()).toString());
        }
        ParametersWithIV parameterswithiv = new ParametersWithIV(param, IV2);
        engine.init(false, parameterswithiv);
        byte abyte1[] = new byte[j];
        System.arraycopy(abyte0, i, abyte1, 0, j);
        for (i = 0; i < abyte1.length / engine.getBlockSize(); i++)
        {
            j = engine.getBlockSize() * i;
            engine.processBlock(abyte1, j, abyte1, j);
        }

        abyte0 = new byte[abyte1.length];
        for (i = 0; i < abyte1.length; i++)
        {
            abyte0[i] = abyte1[abyte1.length - (i + 1)];
        }

        iv = new byte[8];
        abyte1 = new byte[abyte0.length - 8];
        System.arraycopy(abyte0, 0, iv, 0, 8);
        System.arraycopy(abyte0, 8, abyte1, 0, abyte0.length - 8);
        paramPlusIV = new ParametersWithIV(param, iv);
        engine.init(false, paramPlusIV);
        abyte0 = new byte[abyte1.length];
        System.arraycopy(abyte1, 0, abyte0, 0, abyte1.length);
        for (i = 0; i < abyte0.length / engine.getBlockSize(); i++)
        {
            j = engine.getBlockSize() * i;
            engine.processBlock(abyte0, j, abyte0, j);
        }

        abyte1 = new byte[abyte0.length - 8];
        byte abyte2[] = new byte[8];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length - 8);
        System.arraycopy(abyte0, abyte0.length - 8, abyte2, 0, 8);
        if (!checkCMSKeyChecksum(abyte1, abyte2))
        {
            throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
        }
        if (abyte1.length - ((abyte1[0] & 0xff) + 1) > 7)
        {
            throw new InvalidCipherTextException((new StringBuilder()).append("too many pad bytes (").append(abyte1.length - ((abyte1[0] & 0xff) + 1)).append(")").toString());
        } else
        {
            abyte0 = new byte[abyte1[0]];
            System.arraycopy(abyte1, 1, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }

    public byte[] wrap(byte abyte0[], int i, int j)
    {
        boolean flag = false;
        if (!forWrapping)
        {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        int j1 = j + 1;
        int k = j1;
        if (j1 % 8 != 0)
        {
            k = j1 + (8 - j1 % 8);
        }
        byte abyte1[] = new byte[k];
        abyte1[0] = (byte)j;
        System.arraycopy(abyte0, i, abyte1, 1, j);
        abyte0 = new byte[abyte1.length - j - 1];
        if (abyte0.length > 0)
        {
            sr.nextBytes(abyte0);
            System.arraycopy(abyte0, 0, abyte1, j + 1, abyte0.length);
        }
        byte abyte2[] = calculateCMSKeyChecksum(abyte1);
        abyte0 = new byte[abyte1.length + abyte2.length];
        System.arraycopy(abyte1, 0, abyte0, 0, abyte1.length);
        System.arraycopy(abyte2, 0, abyte0, abyte1.length, abyte2.length);
        abyte1 = new byte[abyte0.length];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
        j = abyte0.length / engine.getBlockSize();
        if (abyte0.length % engine.getBlockSize() != 0)
        {
            throw new IllegalStateException("Not multiple of block length");
        }
        engine.init(true, paramPlusIV);
        for (i = 0; i < j; i++)
        {
            int l = engine.getBlockSize() * i;
            engine.processBlock(abyte1, l, abyte1, l);
        }

        abyte0 = new byte[iv.length + abyte1.length];
        System.arraycopy(iv, 0, abyte0, 0, iv.length);
        System.arraycopy(abyte1, 0, abyte0, iv.length, abyte1.length);
        abyte1 = new byte[abyte0.length];
        for (i = 0; i < abyte0.length; i++)
        {
            abyte1[i] = abyte0[abyte0.length - (i + 1)];
        }

        abyte0 = new ParametersWithIV(param, IV2);
        engine.init(true, abyte0);
        for (i = ((flag) ? 1 : 0); i < j + 1; i++)
        {
            int i1 = engine.getBlockSize() * i;
            engine.processBlock(abyte1, i1, abyte1, i1);
        }

        return abyte1;
    }

}
