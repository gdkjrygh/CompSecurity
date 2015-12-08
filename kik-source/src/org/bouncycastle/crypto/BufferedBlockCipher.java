// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;


// Referenced classes of package org.bouncycastle.crypto:
//            BlockCipher, DataLengthException, CipherParameters

public class BufferedBlockCipher
{

    protected byte a[];
    protected int b;
    protected boolean c;
    protected BlockCipher d;
    protected boolean e;
    protected boolean f;

    protected BufferedBlockCipher()
    {
    }

    public BufferedBlockCipher(BlockCipher blockcipher)
    {
        int i;
        boolean flag;
        boolean flag1;
        flag1 = true;
        super();
        d = blockcipher;
        a = new byte[blockcipher.getBlockSize()];
        b = 0;
        blockcipher = blockcipher.getAlgorithmName();
        i = blockcipher.indexOf('/') + 1;
        if (i > 0 && blockcipher.startsWith("PGP", i))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        if (!f) goto _L2; else goto _L1
_L1:
        flag = flag1;
_L4:
        e = flag;
        return;
_L2:
        if (i > 0)
        {
            flag = flag1;
            if (blockcipher.startsWith("CFB", i))
            {
                continue; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (blockcipher.startsWith("OFB", i))
            {
                continue; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (blockcipher.startsWith("OpenPGP", i))
            {
                continue; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (blockcipher.startsWith("SIC", i))
            {
                continue; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (blockcipher.startsWith("GCTR", i))
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int doFinal(byte abyte0[], int i)
    {
        int j = 0;
        if (b + i > abyte0.length)
        {
            throw new DataLengthException("output buffer too short for doFinal()");
        }
        break MISSING_BLOCK_LABEL_30;
        abyte0;
        reset();
        throw abyte0;
        if (b != 0)
        {
            if (!e)
            {
                throw new DataLengthException("data not block size aligned");
            }
            d.processBlock(a, 0, a, 0);
            j = b;
            b = 0;
            System.arraycopy(a, 0, abyte0, i, j);
        }
        reset();
        return j;
    }

    public int getBlockSize()
    {
        return d.getBlockSize();
    }

    public int getOutputSize(int i)
    {
        return b + i;
    }

    public BlockCipher getUnderlyingCipher()
    {
        return d;
    }

    public int getUpdateOutputSize(int i)
    {
        int j = i + b;
        if (f)
        {
            i = j % a.length - (d.getBlockSize() + 2);
        } else
        {
            i = j % a.length;
        }
        return j - i;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        c = flag;
        reset();
        d.init(flag, cipherparameters);
    }

    public int processByte(byte byte0, byte abyte0[], int i)
    {
        byte abyte1[] = a;
        int j = b;
        b = j + 1;
        abyte1[j] = byte0;
        if (b == a.length)
        {
            i = d.processBlock(a, 0, abyte0, i);
            b = 0;
            return i;
        } else
        {
            return 0;
        }
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
                j1 = i1;
                l1 = j;
                k1 = i;
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
            j1 = 0;
            k1 = i;
            l1 = j;
        }
        System.arraycopy(abyte0, k1, a, b, l1);
        b = l1 + b;
        i = j1;
        if (b == a.length)
        {
            i = j1 + d.processBlock(a, 0, abyte1, k + j1);
            b = 0;
        }
        return i;
    }

    public void reset()
    {
        for (int i = 0; i < a.length; i++)
        {
            a[i] = 0;
        }

        b = 0;
        d.reset();
    }
}
