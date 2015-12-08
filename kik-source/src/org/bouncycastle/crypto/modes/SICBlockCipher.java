// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class SICBlockCipher
    implements BlockCipher
{

    private final BlockCipher a;
    private final int b;
    private byte c[];
    private byte d[];
    private byte e[];

    public SICBlockCipher(BlockCipher blockcipher)
    {
        a = blockcipher;
        b = a.getBlockSize();
        c = new byte[b];
        d = new byte[b];
        e = new byte[b];
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(a.getAlgorithmName()).append("/SIC").toString();
    }

    public int getBlockSize()
    {
        return a.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher()
    {
        return a;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            System.arraycopy(cipherparameters.getIV(), 0, c, 0, c.length);
            reset();
            a.init(true, cipherparameters.getParameters());
            return;
        } else
        {
            throw new IllegalArgumentException("SIC mode requires ParametersWithIV");
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        a.processBlock(d, 0, e, 0);
        for (int k = 0; k < e.length; k++)
        {
            abyte1[j + k] = (byte)(e[k] ^ abyte0[i + k]);
        }

        j = d.length - 1;
        i = 1;
        while (j >= 0) 
        {
            int l = (d[j] & 0xff) + i;
            if (l > 255)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            d[j] = (byte)l;
            j--;
        }
        return d.length;
    }

    public void reset()
    {
        System.arraycopy(c, 0, d, 0, d.length);
        a.reset();
    }
}
