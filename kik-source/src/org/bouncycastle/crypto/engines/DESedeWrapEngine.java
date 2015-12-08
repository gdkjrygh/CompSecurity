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

    private static final byte h[] = {
        74, -35, -94, 44, 121, -24, 33, 5
    };
    Digest a;
    byte b[];
    private CBCBlockCipher c;
    private KeyParameter d;
    private ParametersWithIV e;
    private byte f[];
    private boolean g;

    public DESedeWrapEngine()
    {
        a = new SHA1Digest();
        b = new byte[20];
    }

    private byte[] calculateCMSKeyChecksum(byte abyte0[])
    {
        byte abyte1[] = new byte[8];
        a.update(abyte0, 0, abyte0.length);
        a.doFinal(b, 0);
        System.arraycopy(b, 0, abyte1, 0, 8);
        return abyte1;
    }

    private boolean checkCMSKeyChecksum(byte abyte0[], byte abyte1[])
    {
        return Arrays.b(calculateCMSKeyChecksum(abyte0), abyte1);
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
        g = flag;
        c = new CBCBlockCipher(new DESedeEngine());
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
            d = (KeyParameter)cipherparameters;
            if (g)
            {
                f = new byte[8];
                ((SecureRandom) (obj)).nextBytes(f);
                e = new ParametersWithIV(d, f);
            }
        } else
        if (cipherparameters instanceof ParametersWithIV)
        {
            e = (ParametersWithIV)cipherparameters;
            f = e.getIV();
            d = (KeyParameter)e.getParameters();
            if (g)
            {
                if (f == null || f.length != 8)
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
    {
        if (g)
        {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (abyte0 == null)
        {
            throw new InvalidCipherTextException("Null pointer as ciphertext");
        }
        int l = c.getBlockSize();
        if (j % l != 0)
        {
            throw new InvalidCipherTextException((new StringBuilder("Ciphertext not multiple of ")).append(l).toString());
        }
        ParametersWithIV parameterswithiv = new ParametersWithIV(d, h);
        c.init(false, parameterswithiv);
        byte abyte1[] = new byte[j];
        for (int k = 0; k != j; k += l)
        {
            c.processBlock(abyte0, i + k, abyte1, k);
        }

        abyte0 = reverse(abyte1);
        f = new byte[8];
        abyte1 = new byte[abyte0.length - 8];
        System.arraycopy(abyte0, 0, f, 0, 8);
        System.arraycopy(abyte0, 8, abyte1, 0, abyte0.length - 8);
        e = new ParametersWithIV(d, f);
        c.init(false, e);
        abyte0 = new byte[abyte1.length];
        for (i = 0; i != abyte0.length; i += l)
        {
            c.processBlock(abyte1, i, abyte0, i);
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
        if (!g)
        {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        byte abyte1[] = new byte[j];
        System.arraycopy(abyte0, i, abyte1, 0, j);
        byte abyte2[] = calculateCMSKeyChecksum(abyte1);
        abyte0 = new byte[abyte2.length + j];
        System.arraycopy(abyte1, 0, abyte0, 0, j);
        System.arraycopy(abyte2, 0, abyte0, j, abyte2.length);
        j = c.getBlockSize();
        if (abyte0.length % j != 0)
        {
            throw new IllegalStateException("Not multiple of block length");
        }
        c.init(true, e);
        abyte1 = new byte[abyte0.length];
        for (i = 0; i != abyte0.length; i += j)
        {
            c.processBlock(abyte0, i, abyte1, i);
        }

        abyte0 = new byte[f.length + abyte1.length];
        System.arraycopy(f, 0, abyte0, 0, f.length);
        System.arraycopy(abyte1, 0, abyte0, f.length, abyte1.length);
        abyte0 = reverse(abyte0);
        ParametersWithIV parameterswithiv = new ParametersWithIV(d, h);
        c.init(true, parameterswithiv);
        for (i = ((flag) ? 1 : 0); i != abyte0.length; i += j)
        {
            c.processBlock(abyte0, i, abyte0, i);
        }

        return abyte0;
    }

}
