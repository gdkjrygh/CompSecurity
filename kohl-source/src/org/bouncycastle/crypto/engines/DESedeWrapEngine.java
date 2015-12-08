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
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.engines:
//            DESedeEngine

public class DESedeWrapEngine
    implements Wrapper
{

    private static final byte IV2[] = {
        74, -35, -94, 44, 121, -24, 33, 5
    };
    byte digest[];
    private CBCBlockCipher engine;
    private boolean forWrapping;
    private byte iv[];
    private KeyParameter param;
    private ParametersWithIV paramPlusIV;
    Digest sha1;

    public DESedeWrapEngine()
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

    private static byte[] reverse(byte abyte0[])
    {
        byte abyte1[] = new byte[abyte0.length];
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte1[i] = abyte0[abyte0.length - (i + 1)];
        }

        return abyte1;
    }

    public String getAlgorithmName()
    {
        return "DESede";
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        forWrapping = flag;
        engine = new CBCBlockCipher(new DESedeEngine());
        Object obj;
        if (cipherparameters instanceof ParametersWithRandom)
        {
            obj = (ParametersWithRandom)cipherparameters;
            cipherparameters = ((ParametersWithRandom) (obj)).getParameters();
            obj = ((ParametersWithRandom) (obj)).getRandom();
        } else
        {
            obj = new SecureRandom();
        }
        if (cipherparameters instanceof KeyParameter)
        {
            param = (KeyParameter)cipherparameters;
            if (forWrapping)
            {
                iv = new byte[8];
                ((SecureRandom) (obj)).nextBytes(iv);
                paramPlusIV = new ParametersWithIV(param, iv);
            }
        } else
        if (cipherparameters instanceof ParametersWithIV)
        {
            paramPlusIV = (ParametersWithIV)cipherparameters;
            iv = paramPlusIV.getIV();
            param = (KeyParameter)paramPlusIV.getParameters();
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
        int l = engine.getBlockSize();
        if (j % l != 0)
        {
            throw new InvalidCipherTextException((new StringBuilder()).append("Ciphertext not multiple of ").append(l).toString());
        }
        ParametersWithIV parameterswithiv = new ParametersWithIV(param, IV2);
        engine.init(false, parameterswithiv);
        byte abyte1[] = new byte[j];
        for (int k = 0; k != j; k += l)
        {
            engine.processBlock(abyte0, i + k, abyte1, k);
        }

        abyte0 = reverse(abyte1);
        iv = new byte[8];
        abyte1 = new byte[abyte0.length - 8];
        System.arraycopy(abyte0, 0, iv, 0, 8);
        System.arraycopy(abyte0, 8, abyte1, 0, abyte0.length - 8);
        paramPlusIV = new ParametersWithIV(param, iv);
        engine.init(false, paramPlusIV);
        abyte0 = new byte[abyte1.length];
        for (i = 0; i != abyte0.length; i += l)
        {
            engine.processBlock(abyte1, i, abyte0, i);
        }

        abyte1 = new byte[abyte0.length - 8];
        byte abyte2[] = new byte[8];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length - 8);
        System.arraycopy(abyte0, abyte0.length - 8, abyte2, 0, 8);
        if (!checkCMSKeyChecksum(abyte1, abyte2))
        {
            throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
        } else
        {
            return abyte1;
        }
    }

    public byte[] wrap(byte abyte0[], int i, int j)
    {
        boolean flag = false;
        if (!forWrapping)
        {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        byte abyte1[] = new byte[j];
        System.arraycopy(abyte0, i, abyte1, 0, j);
        byte abyte2[] = calculateCMSKeyChecksum(abyte1);
        abyte0 = new byte[abyte1.length + abyte2.length];
        System.arraycopy(abyte1, 0, abyte0, 0, abyte1.length);
        System.arraycopy(abyte2, 0, abyte0, abyte1.length, abyte2.length);
        j = engine.getBlockSize();
        if (abyte0.length % j != 0)
        {
            throw new IllegalStateException("Not multiple of block length");
        }
        engine.init(true, paramPlusIV);
        abyte1 = new byte[abyte0.length];
        for (i = 0; i != abyte0.length; i += j)
        {
            engine.processBlock(abyte0, i, abyte1, i);
        }

        abyte0 = new byte[iv.length + abyte1.length];
        System.arraycopy(iv, 0, abyte0, 0, iv.length);
        System.arraycopy(abyte1, 0, abyte0, iv.length, abyte1.length);
        abyte0 = reverse(abyte0);
        ParametersWithIV parameterswithiv = new ParametersWithIV(param, IV2);
        engine.init(true, parameterswithiv);
        for (i = ((flag) ? 1 : 0); i != abyte0.length; i += j)
        {
            engine.processBlock(abyte0, i, abyte0, i);
        }

        return abyte0;
    }

}
