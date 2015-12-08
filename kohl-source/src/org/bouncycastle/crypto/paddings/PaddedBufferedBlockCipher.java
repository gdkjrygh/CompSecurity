// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.paddings;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;

// Referenced classes of package org.bouncycastle.crypto.paddings:
//            PKCS7Padding, BlockCipherPadding

public class PaddedBufferedBlockCipher extends BufferedBlockCipher
{

    BlockCipherPadding padding;

    public PaddedBufferedBlockCipher(BlockCipher blockcipher)
    {
        this(blockcipher, ((BlockCipherPadding) (new PKCS7Padding())));
    }

    public PaddedBufferedBlockCipher(BlockCipher blockcipher, BlockCipherPadding blockcipherpadding)
    {
        cipher = blockcipher;
        padding = blockcipherpadding;
        buf = new byte[blockcipher.getBlockSize()];
        bufOff = 0;
    }

    public int doFinal(byte abyte0[], int i)
        throws DataLengthException, IllegalStateException, InvalidCipherTextException
    {
        int j = cipher.getBlockSize();
        if (forEncryption)
        {
            if (bufOff == j)
            {
                if (j * 2 + i > abyte0.length)
                {
                    reset();
                    throw new DataLengthException("output buffer too short");
                }
                j = cipher.processBlock(buf, 0, abyte0, i);
                bufOff = 0;
            } else
            {
                j = 0;
            }
            padding.addPadding(buf, bufOff);
            i = cipher.processBlock(buf, 0, abyte0, i + j);
            reset();
            return j + i;
        }
        if (bufOff != j)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        j = cipher.processBlock(buf, 0, buf, 0);
        bufOff = 0;
        j -= padding.padCount(buf);
        System.arraycopy(buf, 0, abyte0, i, j);
        reset();
        return j;
        reset();
        throw new DataLengthException("last block incomplete in decryption");
        abyte0;
        reset();
        throw abyte0;
    }

    public int getOutputSize(int i)
    {
        int j = bufOff + i;
        i = j % buf.length;
        if (i == 0)
        {
            i = j;
            if (forEncryption)
            {
                i = j + buf.length;
            }
            return i;
        } else
        {
            return (j - i) + buf.length;
        }
    }

    public int getUpdateOutputSize(int i)
    {
        i = bufOff + i;
        int j = i % buf.length;
        if (j == 0)
        {
            return i - buf.length;
        } else
        {
            return i - j;
        }
    }

    public void init(boolean flag, CipherParameters cipherparameters)
        throws IllegalArgumentException
    {
        forEncryption = flag;
        reset();
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (ParametersWithRandom)cipherparameters;
            padding.init(cipherparameters.getRandom());
            cipher.init(flag, cipherparameters.getParameters());
            return;
        } else
        {
            padding.init(null);
            cipher.init(flag, cipherparameters);
            return;
        }
    }

    public int processByte(byte byte0, byte abyte0[], int i)
        throws DataLengthException, IllegalStateException
    {
        int j;
        if (bufOff == buf.length)
        {
            i = cipher.processBlock(buf, 0, abyte0, i);
            bufOff = 0;
        } else
        {
            i = 0;
        }
        abyte0 = buf;
        j = bufOff;
        bufOff = j + 1;
        abyte0[j] = byte0;
        return i;
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
                l1 = i1;
                k1 = j;
                j1 = i;
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
            l1 = 0;
            j1 = i;
            k1 = j;
        }
        System.arraycopy(abyte0, j1, buf, bufOff, k1);
        bufOff = k1 + bufOff;
        return l1;
    }
}
