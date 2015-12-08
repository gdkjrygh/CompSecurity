// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Wrapper;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.util.Arrays;

public class RFC3394WrapEngine
    implements Wrapper
{

    private BlockCipher a;
    private KeyParameter b;
    private boolean c;
    private byte d[] = {
        -90, -90, -90, -90, -90, -90, -90, -90
    };

    public RFC3394WrapEngine(BlockCipher blockcipher)
    {
        a = blockcipher;
    }

    public final String a()
    {
        return a.a();
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        c = flag;
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = ((ParametersWithRandom)cipherparameters).b();
        }
        if (cipherparameters instanceof KeyParameter)
        {
            b = (KeyParameter)cipherparameters;
        } else
        if (cipherparameters instanceof ParametersWithIV)
        {
            d = ((ParametersWithIV)cipherparameters).a();
            b = (KeyParameter)((ParametersWithIV)cipherparameters).b();
            if (d.length != 8)
            {
                throw new IllegalArgumentException("IV not equal to 8");
            }
        }
    }

    public final byte[] a(byte abyte0[], int i)
    {
        if (!c)
        {
            throw new IllegalStateException("not set for wrapping");
        }
        int i1 = i / 8;
        if (i1 * 8 != i)
        {
            throw new DataLengthException("wrap data must be a multiple of 8 bytes");
        }
        byte abyte1[] = new byte[d.length + i];
        byte abyte2[] = new byte[d.length + 8];
        System.arraycopy(d, 0, abyte1, 0, d.length);
        System.arraycopy(abyte0, 0, abyte1, d.length, i);
        a.a(true, b);
        for (i = 0; i != 6; i++)
        {
            for (int j = 1; j <= i1; j++)
            {
                System.arraycopy(abyte1, 0, abyte2, 0, d.length);
                System.arraycopy(abyte1, j * 8, abyte2, d.length, 8);
                a.a(abyte2, 0, abyte2, 0);
                int l = i1 * i + j;
                for (int k = 1; l != 0; k++)
                {
                    byte byte0 = (byte)l;
                    int j1 = d.length - k;
                    abyte2[j1] = (byte)(byte0 ^ abyte2[j1]);
                    l >>>= 8;
                }

                System.arraycopy(abyte2, 0, abyte1, 0, 8);
                System.arraycopy(abyte2, 8, abyte1, j * 8, 8);
            }

        }

        return abyte1;
    }

    public final byte[] b(byte abyte0[], int i)
    {
        if (c)
        {
            throw new IllegalStateException("not set for unwrapping");
        }
        int j = i / 8;
        if (j * 8 != i)
        {
            throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
        }
        byte abyte1[] = new byte[i - d.length];
        byte abyte2[] = new byte[d.length];
        byte abyte3[] = new byte[d.length + 8];
        System.arraycopy(abyte0, 0, abyte2, 0, d.length);
        System.arraycopy(abyte0, d.length, abyte1, 0, i - d.length);
        a.a(false, b);
        int j1 = j - 1;
        for (i = 5; i >= 0; i--)
        {
            for (int k = j1; k > 0; k--)
            {
                System.arraycopy(abyte2, 0, abyte3, 0, d.length);
                System.arraycopy(abyte1, (k - 1) * 8, abyte3, d.length, 8);
                int i1 = j1 * i + k;
                for (int l = 1; i1 != 0; l++)
                {
                    byte byte0 = (byte)i1;
                    int k1 = d.length - l;
                    abyte3[k1] = (byte)(byte0 ^ abyte3[k1]);
                    i1 >>>= 8;
                }

                a.a(abyte3, 0, abyte3, 0);
                System.arraycopy(abyte3, 0, abyte2, 0, 8);
                System.arraycopy(abyte3, 8, abyte1, (k - 1) * 8, 8);
            }

        }

        if (!Arrays.b(abyte2, d))
        {
            throw new InvalidCipherTextException("checksum failed");
        } else
        {
            return abyte1;
        }
    }
}
