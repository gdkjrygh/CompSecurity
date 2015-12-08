// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;


// Referenced classes of package org.bouncycastle.crypto:
//            BlockCipher, DataLengthException, InvalidCipherTextException, CipherParameters

public class BufferedBlockCipher
{

    protected byte buf[];
    protected int bufOff;
    protected BlockCipher cipher;
    protected boolean forEncryption;
    protected boolean partialBlockOkay;
    protected boolean pgpCFB;

    protected BufferedBlockCipher()
    {
    }

    public BufferedBlockCipher(BlockCipher blockcipher)
    {
        int i;
        boolean flag2;
        flag2 = true;
        super();
        cipher = blockcipher;
        buf = new byte[blockcipher.getBlockSize()];
        bufOff = 0;
        blockcipher = blockcipher.getAlgorithmName();
        i = blockcipher.indexOf('/') + 1;
        boolean flag;
        if (i > 0 && blockcipher.startsWith("PGP", i))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        pgpCFB = flag;
        if (pgpCFB)
        {
            partialBlockOkay = true;
            return;
        }
        if (i <= 0) goto _L2; else goto _L1
_L1:
        boolean flag1 = flag2;
        if (blockcipher.startsWith("CFB", i)) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
        if (blockcipher.startsWith("OFB", i)) goto _L4; else goto _L5
_L5:
        flag1 = flag2;
        if (blockcipher.startsWith("OpenPGP", i)) goto _L4; else goto _L6
_L6:
        flag1 = flag2;
        if (blockcipher.startsWith("SIC", i)) goto _L4; else goto _L7
_L7:
        if (!blockcipher.startsWith("GCTR", i)) goto _L2; else goto _L8
_L8:
        flag1 = flag2;
_L4:
        partialBlockOkay = flag1;
        return;
_L2:
        flag1 = false;
        if (true) goto _L4; else goto _L9
_L9:
    }

    public int doFinal(byte abyte0[], int i)
        throws DataLengthException, IllegalStateException, InvalidCipherTextException
    {
        int j = 0;
        if (bufOff + i > abyte0.length)
        {
            throw new DataLengthException("output buffer too short for doFinal()");
        }
        break MISSING_BLOCK_LABEL_30;
        abyte0;
        reset();
        throw abyte0;
        if (bufOff != 0)
        {
            if (!partialBlockOkay)
            {
                throw new DataLengthException("data not block size aligned");
            }
            cipher.processBlock(buf, 0, buf, 0);
            j = bufOff;
            bufOff = 0;
            System.arraycopy(buf, 0, abyte0, i, j);
        }
        reset();
        return j;
    }

    public int getBlockSize()
    {
        return cipher.getBlockSize();
    }

    public int getOutputSize(int i)
    {
        return bufOff + i;
    }

    public BlockCipher getUnderlyingCipher()
    {
        return cipher;
    }

    public int getUpdateOutputSize(int i)
    {
        int j = i + bufOff;
        if (pgpCFB)
        {
            i = j % buf.length - (cipher.getBlockSize() + 2);
        } else
        {
            i = j % buf.length;
        }
        return j - i;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
        throws IllegalArgumentException
    {
        forEncryption = flag;
        reset();
        cipher.init(flag, cipherparameters);
    }

    public int processByte(byte byte0, byte abyte0[], int i)
        throws DataLengthException, IllegalStateException
    {
        byte abyte1[] = buf;
        int j = bufOff;
        bufOff = j + 1;
        abyte1[j] = byte0;
        if (bufOff == buf.length)
        {
            i = cipher.processBlock(buf, 0, abyte0, i);
            bufOff = 0;
            return i;
        } else
        {
            return 0;
        }
    }

    public int processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
        throws DataLengthException, IllegalStateException
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
        int j1 = buf.length - bufOff;
        int k1;
        int l1;
        if (j > j1)
        {
            System.arraycopy(abyte0, i, buf, bufOff, j1);
            int i1 = cipher.processBlock(buf, 0, abyte1, k) + 0;
            bufOff = 0;
            j -= j1;
            i = j1 + i;
            do
            {
                j1 = i1;
                l1 = j;
                k1 = i;
                if (j <= buf.length)
                {
                    break;
                }
                i1 += cipher.processBlock(abyte0, i, abyte1, k + i1);
                j -= i2;
                i += i2;
            } while (true);
        } else
        {
            j1 = 0;
            k1 = i;
            l1 = j;
        }
        System.arraycopy(abyte0, k1, buf, bufOff, l1);
        bufOff = l1 + bufOff;
        i = j1;
        if (bufOff == buf.length)
        {
            i = j1 + cipher.processBlock(buf, 0, abyte1, k + j1);
            bufOff = 0;
        }
        return i;
    }

    public void reset()
    {
        for (int i = 0; i < buf.length; i++)
        {
            buf[i] = 0;
        }

        bufOff = 0;
        cipher.reset();
    }
}
