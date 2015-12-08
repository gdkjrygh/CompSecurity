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

    private static final byte i[] = {
        74, -35, -94, 44, 121, -24, 33, 5
    };
    Digest a;
    byte b[];
    private CBCBlockCipher c;
    private CipherParameters d;
    private ParametersWithIV e;
    private byte f[];
    private boolean g;
    private SecureRandom h;

    public RC2WrapEngine()
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

    public String getAlgorithmName()
    {
        return "RC2";
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        g = flag;
        c = new CBCBlockCipher(new RC2Engine());
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (ParametersWithRandom)cipherparameters;
            h = cipherparameters.getRandom();
            cipherparameters = cipherparameters.getParameters();
        } else
        {
            h = new SecureRandom();
        }
        if (cipherparameters instanceof ParametersWithIV)
        {
            e = (ParametersWithIV)cipherparameters;
            f = e.getIV();
            d = e.getParameters();
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
        } else
        {
            d = cipherparameters;
            if (g)
            {
                f = new byte[8];
                h.nextBytes(f);
                e = new ParametersWithIV(d, f);
            }
        }
    }

    public byte[] unwrap(byte abyte0[], int j, int k)
    {
        if (g)
        {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (abyte0 == null)
        {
            throw new InvalidCipherTextException("Null pointer as ciphertext");
        }
        if (k % c.getBlockSize() != 0)
        {
            throw new InvalidCipherTextException((new StringBuilder("Ciphertext not multiple of ")).append(c.getBlockSize()).toString());
        }
        ParametersWithIV parameterswithiv = new ParametersWithIV(d, i);
        c.init(false, parameterswithiv);
        byte abyte1[] = new byte[k];
        System.arraycopy(abyte0, j, abyte1, 0, k);
        for (j = 0; j < k / c.getBlockSize(); j++)
        {
            int l = c.getBlockSize() * j;
            c.processBlock(abyte1, l, abyte1, l);
        }

        abyte0 = new byte[k];
        for (j = 0; j < k; j++)
        {
            abyte0[j] = abyte1[k - (j + 1)];
        }

        f = new byte[8];
        abyte1 = new byte[k - 8];
        System.arraycopy(abyte0, 0, f, 0, 8);
        System.arraycopy(abyte0, 8, abyte1, 0, k - 8);
        e = new ParametersWithIV(d, f);
        c.init(false, e);
        abyte0 = new byte[abyte1.length];
        System.arraycopy(abyte1, 0, abyte0, 0, abyte1.length);
        for (j = 0; j < abyte0.length / c.getBlockSize(); j++)
        {
            k = c.getBlockSize() * j;
            c.processBlock(abyte0, k, abyte0, k);
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
            throw new InvalidCipherTextException((new StringBuilder("too many pad bytes (")).append(abyte1.length - ((abyte1[0] & 0xff) + 1)).append(")").toString());
        } else
        {
            abyte0 = new byte[abyte1[0]];
            System.arraycopy(abyte1, 1, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }

    public byte[] wrap(byte abyte0[], int j, int k)
    {
        boolean flag = false;
        if (!g)
        {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        int k1 = k + 1;
        int l = k1;
        if (k1 % 8 != 0)
        {
            l = k1 + (8 - k1 % 8);
        }
        byte abyte1[] = new byte[l];
        abyte1[0] = (byte)k;
        System.arraycopy(abyte0, j, abyte1, 1, k);
        abyte0 = new byte[abyte1.length - k - 1];
        if (abyte0.length > 0)
        {
            h.nextBytes(abyte0);
            System.arraycopy(abyte0, 0, abyte1, k + 1, abyte0.length);
        }
        byte abyte2[] = calculateCMSKeyChecksum(abyte1);
        abyte0 = new byte[abyte1.length + abyte2.length];
        System.arraycopy(abyte1, 0, abyte0, 0, abyte1.length);
        System.arraycopy(abyte2, 0, abyte0, abyte1.length, abyte2.length);
        abyte1 = new byte[abyte0.length];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
        k = abyte0.length / c.getBlockSize();
        if (abyte0.length % c.getBlockSize() != 0)
        {
            throw new IllegalStateException("Not multiple of block length");
        }
        c.init(true, e);
        for (j = 0; j < k; j++)
        {
            int i1 = c.getBlockSize() * j;
            c.processBlock(abyte1, i1, abyte1, i1);
        }

        abyte0 = new byte[f.length + abyte1.length];
        System.arraycopy(f, 0, abyte0, 0, f.length);
        System.arraycopy(abyte1, 0, abyte0, f.length, abyte1.length);
        abyte1 = new byte[abyte0.length];
        for (j = 0; j < abyte0.length; j++)
        {
            abyte1[j] = abyte0[abyte0.length - (j + 1)];
        }

        abyte0 = new ParametersWithIV(d, i);
        c.init(true, abyte0);
        for (j = ((flag) ? 1 : 0); j < k + 1; j++)
        {
            int j1 = c.getBlockSize() * j;
            c.processBlock(abyte1, j1, abyte1, j1);
        }

        return abyte1;
    }

}
