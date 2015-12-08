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

    private static final byte CONSTANT_128 = -121;
    private static final byte CONSTANT_64 = 27;
    private byte L[];
    private byte Lu[];
    private byte Lu2[];
    private byte ZEROES[];
    private byte buf[];
    private int bufOff;
    private BlockCipher cipher;
    private byte mac[];
    private int macSize;

    public CMac(BlockCipher blockcipher)
    {
        this(blockcipher, blockcipher.getBlockSize() * 8);
    }

    public CMac(BlockCipher blockcipher, int i)
    {
        if (i % 8 != 0)
        {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (i > blockcipher.getBlockSize() * 8)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("MAC size must be less or equal to ").append(blockcipher.getBlockSize() * 8).toString());
        }
        if (blockcipher.getBlockSize() != 8 && blockcipher.getBlockSize() != 16)
        {
            throw new IllegalArgumentException("Block size must be either 64 or 128 bits");
        } else
        {
            cipher = new CBCBlockCipher(blockcipher);
            macSize = i / 8;
            mac = new byte[blockcipher.getBlockSize()];
            buf = new byte[blockcipher.getBlockSize()];
            ZEROES = new byte[blockcipher.getBlockSize()];
            bufOff = 0;
            return;
        }
    }

    private byte[] doubleLu(byte abyte0[])
    {
        int i = 0;
        byte byte1 = abyte0[0];
        byte abyte1[] = new byte[abyte0.length];
        for (; i < abyte0.length - 1; i++)
        {
            abyte1[i] = (byte)((abyte0[i] << 1) + ((abyte0[i + 1] & 0xff) >> 7));
        }

        abyte1[abyte0.length - 1] = (byte)(abyte0[abyte0.length - 1] << 1);
        if ((byte1 & 0xff) >> 7 == 1)
        {
            int j = abyte0.length - 1;
            byte byte2 = abyte1[j];
            byte byte0;
            if (abyte0.length == 16)
            {
                byte0 = -121;
            } else
            {
                byte0 = 27;
            }
            abyte1[j] = (byte)(byte0 ^ byte2);
        }
        return abyte1;
    }

    public int doFinal(byte abyte0[], int i)
    {
        int j = cipher.getBlockSize();
        byte abyte1[];
        if (bufOff == j)
        {
            abyte1 = Lu;
        } else
        {
            (new ISO7816d4Padding()).addPadding(buf, bufOff);
            abyte1 = Lu2;
        }
        for (j = 0; j < mac.length; j++)
        {
            byte abyte2[] = buf;
            abyte2[j] = (byte)(abyte2[j] ^ abyte1[j]);
        }

        cipher.processBlock(buf, 0, mac, 0);
        System.arraycopy(mac, 0, abyte0, i, macSize);
        reset();
        return macSize;
    }

    public String getAlgorithmName()
    {
        return cipher.getAlgorithmName();
    }

    public int getMacSize()
    {
        return macSize;
    }

    public void init(CipherParameters cipherparameters)
    {
        reset();
        cipher.init(true, cipherparameters);
        L = new byte[ZEROES.length];
        cipher.processBlock(ZEROES, 0, L, 0);
        Lu = doubleLu(L);
        Lu2 = doubleLu(Lu);
        cipher.init(true, cipherparameters);
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

    public void update(byte byte0)
    {
        if (bufOff == buf.length)
        {
            cipher.processBlock(buf, 0, mac, 0);
            bufOff = 0;
        }
        byte abyte0[] = buf;
        int i = bufOff;
        bufOff = i + 1;
        abyte0[i] = byte0;
    }

    public void update(byte abyte0[], int i, int j)
    {
        if (j < 0)
        {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i1 = cipher.getBlockSize();
        int j1 = i1 - bufOff;
        int k = i;
        int l = j;
        if (j > j1)
        {
            System.arraycopy(abyte0, i, buf, bufOff, j1);
            cipher.processBlock(buf, 0, mac, 0);
            bufOff = 0;
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
                cipher.processBlock(abyte0, i, mac, 0);
                j -= i1;
                i += i1;
            } while (true);
        }
        System.arraycopy(abyte0, k, buf, bufOff, l);
        bufOff = bufOff + l;
    }
}
