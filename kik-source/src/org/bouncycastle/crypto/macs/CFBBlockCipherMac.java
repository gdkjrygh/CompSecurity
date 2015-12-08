// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;

// Referenced classes of package org.bouncycastle.crypto.macs:
//            a

public class CFBBlockCipherMac
    implements Mac
{

    private byte a[];
    private byte b[];
    private int c;
    private a d;
    private BlockCipherPadding e;
    private int f;

    public CFBBlockCipherMac(BlockCipher blockcipher)
    {
        this(blockcipher, 8, (blockcipher.getBlockSize() * 8) / 2, null);
    }

    public CFBBlockCipherMac(BlockCipher blockcipher, int i, int j)
    {
        this(blockcipher, i, j, null);
    }

    public CFBBlockCipherMac(BlockCipher blockcipher, int i, int j, BlockCipherPadding blockcipherpadding)
    {
        e = null;
        if (j % 8 != 0)
        {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        } else
        {
            a = new byte[blockcipher.getBlockSize()];
            d = new a(blockcipher, i);
            e = blockcipherpadding;
            f = j / 8;
            b = new byte[d.getBlockSize()];
            c = 0;
            return;
        }
    }

    public CFBBlockCipherMac(BlockCipher blockcipher, BlockCipherPadding blockcipherpadding)
    {
        this(blockcipher, 8, (blockcipher.getBlockSize() * 8) / 2, blockcipherpadding);
    }

    public int doFinal(byte abyte0[], int i)
    {
        int j = d.getBlockSize();
        if (e == null)
        {
            for (; c < j; c = c + 1)
            {
                b[c] = 0;
            }

        } else
        {
            e.addPadding(b, c);
        }
        d.processBlock(b, 0, a, 0);
        d.getMacBlock(a);
        System.arraycopy(a, 0, abyte0, i, f);
        reset();
        return f;
    }

    public String getAlgorithmName()
    {
        return d.getAlgorithmName();
    }

    public int getMacSize()
    {
        return f;
    }

    public void init(CipherParameters cipherparameters)
    {
        reset();
        d.init(cipherparameters);
    }

    public void reset()
    {
        for (int i = 0; i < b.length; i++)
        {
            b[i] = 0;
        }

        c = 0;
        d.reset();
    }

    public void update(byte byte0)
    {
        if (c == b.length)
        {
            d.processBlock(b, 0, a, 0);
            c = 0;
        }
        byte abyte0[] = b;
        int i = c;
        c = i + 1;
        abyte0[i] = byte0;
    }

    public void update(byte abyte0[], int i, int j)
    {
        if (j < 0)
        {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i1 = d.getBlockSize();
        int j1 = i1 - c;
        int k = i;
        int l = j;
        if (j > j1)
        {
            System.arraycopy(abyte0, i, b, c, j1);
            d.processBlock(b, 0, a, 0);
            c = 0;
            j -= j1;
            i += j1;
            do
            {
                k = i;
                l = j;
                if (j <= i1)
                {
                    break;
                }
                d.processBlock(abyte0, i, a, 0);
                j -= i1;
                i += i1;
            } while (true);
        }
        System.arraycopy(abyte0, k, b, c, l);
        c = c + l;
    }
}
