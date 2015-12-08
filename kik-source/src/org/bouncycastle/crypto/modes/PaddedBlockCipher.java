// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

public class PaddedBlockCipher extends BufferedBlockCipher
{

    public PaddedBlockCipher(BlockCipher blockcipher)
    {
        d = blockcipher;
        a = new byte[blockcipher.getBlockSize()];
        b = 0;
    }

    public int doFinal(byte abyte0[], int i)
    {
        int k = d.getBlockSize();
        if (c)
        {
            byte byte0;
            int j;
            int l;
            if (b == k)
            {
                if (k * 2 + i > abyte0.length)
                {
                    throw new DataLengthException("output buffer too short");
                }
                j = d.processBlock(a, 0, abyte0, i);
                b = 0;
            } else
            {
                j = 0;
            }
            byte0 = (byte)(k - b);
            for (; b < k; b = b + 1)
            {
                a[b] = byte0;
            }

            i = j + d.processBlock(a, 0, abyte0, i + j);
        } else
        {
            if (b == k)
            {
                j = d.processBlock(a, 0, a, 0);
                b = 0;
                l = a[k - 1] & 0xff;
                if (l < 0 || l > k)
                {
                    throw new InvalidCipherTextException("pad block corrupted");
                }
            } else
            {
                throw new DataLengthException("last block incomplete in decryption");
            }
            j -= l;
            System.arraycopy(a, 0, abyte0, i, j);
            i = j;
        }
        reset();
        return i;
    }

    public int getOutputSize(int i)
    {
        int j = b + i;
        i = j % a.length;
        if (i == 0)
        {
            i = j;
            if (c)
            {
                i = j + a.length;
            }
            return i;
        } else
        {
            return (j - i) + a.length;
        }
    }

    public int getUpdateOutputSize(int i)
    {
        i = b + i;
        int j = i % a.length;
        if (j == 0)
        {
            return i - a.length;
        } else
        {
            return i - j;
        }
    }

    public int processByte(byte byte0, byte abyte0[], int i)
    {
        int j;
        if (b == a.length)
        {
            i = d.processBlock(a, 0, abyte0, i);
            b = 0;
        } else
        {
            i = 0;
        }
        abyte0 = a;
        j = b;
        b = j + 1;
        abyte0[j] = byte0;
        return i;
    }

    public int processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        if (j < 0)
        {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i2 = getBlockSize();
        int l = getUpdateOutputSize(j);
        if (l > 0 && l + k > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        int j1 = a.length - b;
        int k1;
        int l1;
        if (j > j1)
        {
            System.arraycopy(abyte0, i, a, b, j1);
            int i1 = d.processBlock(a, 0, abyte1, k) + 0;
            b = 0;
            j -= j1;
            i = j1 + i;
            do
            {
                l1 = i1;
                k1 = j;
                j1 = i;
                if (j <= a.length)
                {
                    break;
                }
                i1 += d.processBlock(abyte0, i, abyte1, k + i1);
                j -= i2;
                i += i2;
            } while (true);
        } else
        {
            l1 = 0;
            j1 = i;
            k1 = j;
        }
        System.arraycopy(abyte0, j1, a, b, k1);
        b = k1 + b;
        return l1;
    }
}
