// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;

public class CBCBlockCipherMac
    implements Mac
{

    private byte a[];
    private byte b[];
    private int c;
    private BlockCipher d;
    private BlockCipherPadding e;
    private int f;

    public CBCBlockCipherMac(BlockCipher blockcipher)
    {
        this(blockcipher, (blockcipher.getBlockSize() * 8) / 2, null);
    }

    public CBCBlockCipherMac(BlockCipher blockcipher, int i)
    {
        this(blockcipher, i, null);
    }

    public CBCBlockCipherMac(BlockCipher blockcipher, int i, BlockCipherPadding blockcipherpadding)
    {
        if (i % 8 != 0)
        {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        } else
        {
            d = new CBCBlockCipher(blockcipher);
            e = blockcipherpadding;
            f = i / 8;
            a = new byte[blockcipher.getBlockSize()];
            b = new byte[blockcipher.getBlockSize()];
            c = 0;
            return;
        }
    }

    public CBCBlockCipherMac(BlockCipher blockcipher, BlockCipherPadding blockcipherpadding)
    {
        this(blockcipher, (blockcipher.getBlockSize() * 8) / 2, blockcipherpadding);
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
            if (c == j)
            {
                d.processBlock(b, 0, a, 0);
                c = 0;
            }
            e.addPadding(b, c);
        }
        d.processBlock(b, 0, a, 0);
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
        d.init(true, cipherparameters);
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
