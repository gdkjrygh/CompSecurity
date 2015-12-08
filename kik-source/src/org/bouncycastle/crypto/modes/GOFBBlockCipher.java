// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class GOFBBlockCipher
    implements BlockCipher
{

    boolean a;
    int b;
    int c;
    private byte d[];
    private byte e[];
    private byte f[];
    private final int g;
    private final BlockCipher h;

    public GOFBBlockCipher(BlockCipher blockcipher)
    {
        a = true;
        h = blockcipher;
        g = blockcipher.getBlockSize();
        if (g != 8)
        {
            throw new IllegalArgumentException("GCTR only for 64 bit block ciphers");
        } else
        {
            d = new byte[blockcipher.getBlockSize()];
            e = new byte[blockcipher.getBlockSize()];
            f = new byte[blockcipher.getBlockSize()];
            return;
        }
    }

    private int bytesToint(byte abyte0[], int i)
    {
        return (abyte0[i + 3] << 24 & 0xff000000) + (abyte0[i + 2] << 16 & 0xff0000) + (abyte0[i + 1] << 8 & 0xff00) + (abyte0[i] & 0xff);
    }

    private void intTobytes(int i, byte abyte0[], int j)
    {
        abyte0[j + 3] = (byte)(i >>> 24);
        abyte0[j + 2] = (byte)(i >>> 16);
        abyte0[j + 1] = (byte)(i >>> 8);
        abyte0[j] = (byte)i;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(h.getAlgorithmName()).append("/GCTR").toString();
    }

    public int getBlockSize()
    {
        return g;
    }

    public BlockCipher getUnderlyingCipher()
    {
        return h;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        a = true;
        b = 0;
        c = 0;
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            byte abyte0[] = cipherparameters.getIV();
            if (abyte0.length < d.length)
            {
                System.arraycopy(abyte0, 0, d, d.length - abyte0.length, abyte0.length);
                for (int i = 0; i < d.length - abyte0.length; i++)
                {
                    d[i] = 0;
                }

            } else
            {
                System.arraycopy(abyte0, 0, d, 0, d.length);
            }
            reset();
            h.init(true, cipherparameters.getParameters());
            return;
        } else
        {
            reset();
            h.init(true, cipherparameters);
            return;
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (g + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (g + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (a)
        {
            a = false;
            h.processBlock(e, 0, f, 0);
            b = bytesToint(f, 0);
            c = bytesToint(f, 4);
        }
        b = b + 0x1010101;
        c = c + 0x1010104;
        intTobytes(b, e, 0);
        intTobytes(c, e, 4);
        h.processBlock(e, 0, f, 0);
        for (int k = 0; k < g; k++)
        {
            abyte1[j + k] = (byte)(f[k] ^ abyte0[i + k]);
        }

        System.arraycopy(e, g, e, 0, e.length - g);
        System.arraycopy(f, 0, e, e.length - g, g);
        return g;
    }

    public void reset()
    {
        System.arraycopy(d, 0, e, 0, d.length);
        h.reset();
    }
}
