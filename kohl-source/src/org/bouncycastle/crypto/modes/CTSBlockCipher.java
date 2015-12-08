// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

// Referenced classes of package org.bouncycastle.crypto.modes:
//            OFBBlockCipher, CFBBlockCipher, CBCBlockCipher

public class CTSBlockCipher extends BufferedBlockCipher
{

    private int blockSize;

    public CTSBlockCipher(BlockCipher blockcipher)
    {
        if ((blockcipher instanceof OFBBlockCipher) || (blockcipher instanceof CFBBlockCipher))
        {
            throw new IllegalArgumentException("CTSBlockCipher can only accept ECB, or CBC ciphers");
        } else
        {
            cipher = blockcipher;
            blockSize = blockcipher.getBlockSize();
            buf = new byte[blockSize * 2];
            bufOff = 0;
            return;
        }
    }

    public int doFinal(byte abyte0[], int i)
        throws DataLengthException, IllegalStateException, InvalidCipherTextException
    {
        if (bufOff + i > abyte0.length)
        {
            throw new DataLengthException("output buffer to small in doFinal");
        }
        int j = cipher.getBlockSize();
        int j1 = bufOff - j;
        byte abyte1[] = new byte[j];
        if (forEncryption)
        {
            cipher.processBlock(buf, 0, abyte1, 0);
            if (bufOff < j)
            {
                throw new DataLengthException("need at least one block of input for CTS");
            }
            for (int k = bufOff; k != buf.length; k++)
            {
                buf[k] = abyte1[k - j];
            }

            for (int l = j; l != bufOff; l++)
            {
                byte abyte2[] = buf;
                abyte2[l] = (byte)(abyte2[l] ^ abyte1[l - j]);
            }

            if (cipher instanceof CBCBlockCipher)
            {
                ((CBCBlockCipher)cipher).getUnderlyingCipher().processBlock(buf, j, abyte0, i);
            } else
            {
                cipher.processBlock(buf, j, abyte0, i);
            }
            System.arraycopy(abyte1, 0, abyte0, i + j, j1);
        } else
        {
            byte abyte3[] = new byte[j];
            int i1;
            if (cipher instanceof CBCBlockCipher)
            {
                ((CBCBlockCipher)cipher).getUnderlyingCipher().processBlock(buf, 0, abyte1, 0);
            } else
            {
                cipher.processBlock(buf, 0, abyte1, 0);
            }
            for (i1 = j; i1 != bufOff; i1++)
            {
                abyte3[i1 - j] = (byte)(abyte1[i1 - j] ^ buf[i1]);
            }

            System.arraycopy(buf, j, abyte1, 0, j1);
            cipher.processBlock(abyte1, 0, abyte0, i);
            System.arraycopy(abyte3, 0, abyte0, i + j, j1);
        }
        i = bufOff;
        reset();
        return i;
    }

    public int getOutputSize(int i)
    {
        return bufOff + i;
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

    public int processByte(byte byte0, byte abyte0[], int i)
        throws DataLengthException, IllegalStateException
    {
        int j;
        if (bufOff == buf.length)
        {
            i = cipher.processBlock(buf, 0, abyte0, i);
            System.arraycopy(buf, blockSize, buf, 0, blockSize);
            bufOff = blockSize;
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
            System.arraycopy(buf, i2, buf, 0, i2);
            bufOff = i2;
            j -= j1;
            i += j1;
            do
            {
                l1 = i1;
                k1 = i;
                j1 = j;
                if (j <= i2)
                {
                    break;
                }
                System.arraycopy(abyte0, i, buf, bufOff, i2);
                i1 += cipher.processBlock(buf, 0, abyte1, k + i1);
                System.arraycopy(buf, i2, buf, 0, i2);
                j -= i2;
                i += i2;
            } while (true);
        } else
        {
            l1 = 0;
            j1 = j;
            k1 = i;
        }
        System.arraycopy(abyte0, k1, buf, bufOff, j1);
        bufOff = bufOff + j1;
        return l1;
    }
}
