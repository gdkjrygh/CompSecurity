// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import java.security.SecureRandom;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;

public class RFC3211WrapEngine
    implements Wrapper
{

    private CBCBlockCipher a;
    private ParametersWithIV b;
    private boolean c;
    private SecureRandom d;

    public RFC3211WrapEngine(BlockCipher blockcipher)
    {
        a = new CBCBlockCipher(blockcipher);
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(a.getUnderlyingCipher().getAlgorithmName()).append("/RFC3211Wrap").toString();
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        c = flag;
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (ParametersWithRandom)cipherparameters;
            d = cipherparameters.getRandom();
            b = (ParametersWithIV)cipherparameters.getParameters();
            return;
        }
        if (flag)
        {
            d = new SecureRandom();
        }
        b = (ParametersWithIV)cipherparameters;
    }

    public byte[] unwrap(byte abyte0[], int i, int j)
    {
        boolean flag = false;
        if (c)
        {
            throw new IllegalStateException("not set for unwrapping");
        }
        int k = a.getBlockSize();
        if (j < k * 2)
        {
            throw new InvalidCipherTextException("input too short");
        }
        byte abyte1[] = new byte[j];
        byte abyte2[] = new byte[k];
        System.arraycopy(abyte0, i, abyte1, 0, j);
        System.arraycopy(abyte0, i, abyte2, 0, k);
        a.init(false, new ParametersWithIV(b.getParameters(), abyte2));
        for (i = k; i < j; i += k)
        {
            a.processBlock(abyte1, i, abyte1, i);
        }

        System.arraycopy(abyte1, j - k, abyte2, 0, k);
        a.init(false, new ParametersWithIV(b.getParameters(), abyte2));
        a.processBlock(abyte1, 0, abyte1, 0);
        a.init(false, b);
        for (i = 0; i < j; i += k)
        {
            a.processBlock(abyte1, i, abyte1, i);
        }

        if ((abyte1[0] & 0xff) > j - 4)
        {
            throw new InvalidCipherTextException("wrapped key corrupted");
        }
        abyte0 = new byte[abyte1[0] & 0xff];
        System.arraycopy(abyte1, 4, abyte0, 0, abyte1[0]);
        j = 0;
        for (i = ((flag) ? 1 : 0); i != 3; i++)
        {
            j |= (byte)(~abyte1[i + 1]) ^ abyte0[i];
        }

        if (j != 0)
        {
            throw new InvalidCipherTextException("wrapped key fails checksum");
        } else
        {
            return abyte0;
        }
    }

    public byte[] wrap(byte abyte0[], int i, int j)
    {
        boolean flag = false;
        if (!c)
        {
            throw new IllegalStateException("not set for wrapping");
        }
        a.init(true, b);
        int l = a.getBlockSize();
        byte abyte1[];
        int k;
        if (j + 4 < l * 2)
        {
            k = l * 2;
        } else
        if ((j + 4) % l == 0)
        {
            k = j + 4;
        } else
        {
            k = ((j + 4) / l + 1) * l;
        }
        abyte1 = new byte[k];
        abyte1[0] = (byte)j;
        abyte1[1] = (byte)(~abyte0[i]);
        abyte1[2] = (byte)(~abyte0[i + 1]);
        abyte1[3] = (byte)(~abyte0[i + 2]);
        System.arraycopy(abyte0, i, abyte1, 4, j);
        for (i = j + 4; i < abyte1.length; i++)
        {
            abyte1[i] = (byte)d.nextInt();
        }

        i = 0;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i >= abyte1.length)
            {
                break;
            }
            a.processBlock(abyte1, i, abyte1, i);
            i += l;
        } while (true);
        for (; j < abyte1.length; j += l)
        {
            a.processBlock(abyte1, j, abyte1, j);
        }

        return abyte1;
    }
}
