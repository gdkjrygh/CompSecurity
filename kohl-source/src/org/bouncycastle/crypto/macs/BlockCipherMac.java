// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;

public class BlockCipherMac
    implements Mac
{

    private byte buf[];
    private int bufOff;
    private BlockCipher cipher;
    private byte mac[];
    private int macSize;

    public BlockCipherMac(BlockCipher blockcipher)
    {
        this(blockcipher, (blockcipher.getBlockSize() * 8) / 2);
    }

    public BlockCipherMac(BlockCipher blockcipher, int i)
    {
        if (i % 8 != 0)
        {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        } else
        {
            cipher = new CBCBlockCipher(blockcipher);
            macSize = i / 8;
            mac = new byte[blockcipher.getBlockSize()];
            buf = new byte[blockcipher.getBlockSize()];
            bufOff = 0;
            return;
        }
    }

    public int doFinal(byte abyte0[], int i)
    {
        for (int j = cipher.getBlockSize(); bufOff < j; bufOff = bufOff + 1)
        {
            buf[bufOff] = 0;
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
        int j1 = cipher.getBlockSize();
        int k1 = j1 - bufOff;
        int k = i;
        int l = j;
        if (j > k1)
        {
            System.arraycopy(abyte0, i, buf, bufOff, k1);
            int i1 = cipher.processBlock(buf, 0, mac, 0) + 0;
            bufOff = 0;
            j -= k1;
            i += k1;
            do
            {
                k = i;
                l = j;
                if (j <= j1)
                {
                    break;
                }
                i1 += cipher.processBlock(abyte0, i, mac, 0);
                j -= j1;
                i += j1;
            } while (true);
        }
        System.arraycopy(abyte0, k, buf, bufOff, l);
        bufOff = bufOff + l;
    }
}
