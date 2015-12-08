// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;

public class CMac
    implements Mac
{

    private byte a[];
    private byte b[];
    private byte c[];
    private int d;
    private BlockCipher e;
    private int f;
    private byte g[];
    private byte h[];
    private byte i[];

    public CMac(BlockCipher blockcipher)
    {
        this(blockcipher, blockcipher.getBlockSize() * 8);
    }

    public CMac(BlockCipher blockcipher, int j)
    {
        if (j % 8 != 0)
        {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (j > blockcipher.getBlockSize() * 8)
        {
            throw new IllegalArgumentException((new StringBuilder("MAC size must be less or equal to ")).append(blockcipher.getBlockSize() * 8).toString());
        }
        if (blockcipher.getBlockSize() != 8 && blockcipher.getBlockSize() != 16)
        {
            throw new IllegalArgumentException("Block size must be either 64 or 128 bits");
        } else
        {
            e = new CBCBlockCipher(blockcipher);
            f = j / 8;
            b = new byte[blockcipher.getBlockSize()];
            c = new byte[blockcipher.getBlockSize()];
            a = new byte[blockcipher.getBlockSize()];
            d = 0;
            return;
        }
    }

    private byte[] doubleLu(byte abyte0[])
    {
        int j = 0;
        byte byte1 = abyte0[0];
        byte abyte1[] = new byte[abyte0.length];
        for (; j < abyte0.length - 1; j++)
        {
            abyte1[j] = (byte)((abyte0[j] << 1) + ((abyte0[j + 1] & 0xff) >> 7));
        }

        abyte1[abyte0.length - 1] = (byte)(abyte0[abyte0.length - 1] << 1);
        if ((byte1 & 0xff) >> 7 == 1)
        {
            int k = abyte0.length - 1;
            byte byte2 = abyte1[k];
            byte byte0;
            if (abyte0.length == 16)
            {
                byte0 = -121;
            } else
            {
                byte0 = 27;
            }
            abyte1[k] = (byte)(byte0 ^ byte2);
        }
        return abyte1;
    }

    public int doFinal(byte abyte0[], int j)
    {
        int k = e.getBlockSize();
        byte abyte1[];
        if (d == k)
        {
            abyte1 = h;
        } else
        {
            (new ISO7816d4Padding()).addPadding(c, d);
            abyte1 = i;
        }
        for (k = 0; k < b.length; k++)
        {
            byte abyte2[] = c;
            abyte2[k] = (byte)(abyte2[k] ^ abyte1[k]);
        }

        e.processBlock(c, 0, b, 0);
        System.arraycopy(b, 0, abyte0, j, f);
        reset();
        return f;
    }

    public String getAlgorithmName()
    {
        return e.getAlgorithmName();
    }

    public int getMacSize()
    {
        return f;
    }

    public void init(CipherParameters cipherparameters)
    {
        reset();
        e.init(true, cipherparameters);
        g = new byte[a.length];
        e.processBlock(a, 0, g, 0);
        h = doubleLu(g);
        i = doubleLu(h);
        e.init(true, cipherparameters);
    }

    public void reset()
    {
        for (int j = 0; j < c.length; j++)
        {
            c[j] = 0;
        }

        d = 0;
        e.reset();
    }

    public void update(byte byte0)
    {
        if (d == c.length)
        {
            e.processBlock(c, 0, b, 0);
            d = 0;
        }
        byte abyte0[] = c;
        int j = d;
        d = j + 1;
        abyte0[j] = byte0;
    }

    public void update(byte abyte0[], int j, int k)
    {
        if (k < 0)
        {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int j1 = e.getBlockSize();
        int k1 = j1 - d;
        int l = j;
        int i1 = k;
        if (k > k1)
        {
            System.arraycopy(abyte0, j, c, d, k1);
            e.processBlock(c, 0, b, 0);
            d = 0;
            k -= k1;
            j += k1;
            do
            {
                l = j;
                i1 = k;
                if (k <= j1)
                {
                    break;
                }
                e.processBlock(abyte0, j, b, 0);
                k -= j1;
                j += j1;
            } while (true);
        }
        System.arraycopy(abyte0, l, c, d, i1);
        d = d + i1;
    }
}
