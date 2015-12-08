// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithSBox;

public class GOST28147Mac
    implements Mac
{

    private byte S[] = {
        9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 
        14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 
        8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 
        13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 
        12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 
        10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 
        15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 
        15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 
        3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 
        9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 
        7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 
        11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 
        6, 2, 3, 9, 1, 7, 13, 4
    };
    private int blockSize;
    private byte buf[];
    private int bufOff;
    private boolean firstStep;
    private byte mac[];
    private int macSize;
    private int workingKey[];

    public GOST28147Mac()
    {
        blockSize = 8;
        macSize = 4;
        firstStep = true;
        workingKey = null;
        mac = new byte[blockSize];
        buf = new byte[blockSize];
        bufOff = 0;
    }

    private byte[] CM5func(byte abyte0[], int i, byte abyte1[])
    {
        boolean flag = false;
        byte abyte2[] = new byte[abyte0.length - i];
        System.arraycopy(abyte0, i, abyte2, 0, abyte1.length);
        for (i = ((flag) ? 1 : 0); i != abyte1.length; i++)
        {
            abyte2[i] = (byte)(abyte2[i] ^ abyte1[i]);
        }

        return abyte2;
    }

    private int bytesToint(byte abyte0[], int i)
    {
        return (abyte0[i + 3] << 24 & 0xff000000) + (abyte0[i + 2] << 16 & 0xff0000) + (abyte0[i + 1] << 8 & 0xff00) + (abyte0[i] & 0xff);
    }

    private int[] generateWorkingKey(byte abyte0[])
    {
        if (abyte0.length != 32)
        {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        int ai[] = new int[8];
        for (int i = 0; i != 8; i++)
        {
            ai[i] = bytesToint(abyte0, i * 4);
        }

        return ai;
    }

    private void gost28147MacFunc(int ai[], byte abyte0[], int i, byte abyte1[], int j)
    {
        int k = bytesToint(abyte0, i);
        i = bytesToint(abyte0, i + 4);
        for (int l = 0; l < 2; l++)
        {
            for (int i1 = 0; i1 < 8;)
            {
                int j1 = gost28147_mainStep(k, ai[i1]);
                i1++;
                j1 = i ^ j1;
                i = k;
                k = j1;
            }

        }

        intTobytes(k, abyte1, j);
        intTobytes(i, abyte1, j + 4);
    }

    private int gost28147_mainStep(int i, int j)
    {
        i = j + i;
        j = S[(i >> 0 & 0xf) + 0];
        byte byte0 = S[(i >> 4 & 0xf) + 16];
        byte byte1 = S[(i >> 8 & 0xf) + 32];
        byte byte2 = S[(i >> 12 & 0xf) + 48];
        byte byte3 = S[(i >> 16 & 0xf) + 64];
        byte byte4 = S[(i >> 20 & 0xf) + 80];
        byte byte5 = S[(i >> 24 & 0xf) + 96];
        i = (S[(i >> 28 & 0xf) + 112] << 28) + ((j << 0) + (byte0 << 4) + (byte1 << 8) + (byte2 << 12) + (byte3 << 16) + (byte4 << 20) + (byte5 << 24));
        return i >>> 21 | i << 11;
    }

    private void intTobytes(int i, byte abyte0[], int j)
    {
        abyte0[j + 3] = (byte)(i >>> 24);
        abyte0[j + 2] = (byte)(i >>> 16);
        abyte0[j + 1] = (byte)(i >>> 8);
        abyte0[j] = (byte)i;
    }

    public int doFinal(byte abyte0[], int i)
        throws DataLengthException, IllegalStateException
    {
        for (; bufOff < blockSize; bufOff = bufOff + 1)
        {
            buf[bufOff] = 0;
        }

        byte abyte1[] = new byte[buf.length];
        System.arraycopy(buf, 0, abyte1, 0, mac.length);
        if (firstStep)
        {
            firstStep = false;
        } else
        {
            abyte1 = CM5func(buf, 0, mac);
        }
        gost28147MacFunc(workingKey, abyte1, 0, mac, 0);
        System.arraycopy(mac, mac.length / 2 - macSize, abyte0, i, macSize);
        reset();
        return macSize;
    }

    public String getAlgorithmName()
    {
        return "GOST28147Mac";
    }

    public int getMacSize()
    {
        return macSize;
    }

    public void init(CipherParameters cipherparameters)
        throws IllegalArgumentException
    {
        reset();
        buf = new byte[blockSize];
        if (cipherparameters instanceof ParametersWithSBox)
        {
            cipherparameters = (ParametersWithSBox)cipherparameters;
            System.arraycopy(cipherparameters.getSBox(), 0, S, 0, cipherparameters.getSBox().length);
            if (cipherparameters.getParameters() != null)
            {
                workingKey = generateWorkingKey(((KeyParameter)cipherparameters.getParameters()).getKey());
            }
            return;
        }
        if (cipherparameters instanceof KeyParameter)
        {
            workingKey = generateWorkingKey(((KeyParameter)cipherparameters).getKey());
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid parameter passed to GOST28147 init - ").append(cipherparameters.getClass().getName()).toString());
        }
    }

    public void reset()
    {
        for (int i = 0; i < buf.length; i++)
        {
            buf[i] = 0;
        }

        bufOff = 0;
        firstStep = true;
    }

    public void update(byte byte0)
        throws IllegalStateException
    {
        if (bufOff == buf.length)
        {
            byte abyte0[] = new byte[buf.length];
            System.arraycopy(buf, 0, abyte0, 0, mac.length);
            int i;
            if (firstStep)
            {
                firstStep = false;
            } else
            {
                abyte0 = CM5func(buf, 0, mac);
            }
            gost28147MacFunc(workingKey, abyte0, 0, mac, 0);
            bufOff = 0;
        }
        abyte0 = buf;
        i = bufOff;
        bufOff = i + 1;
        abyte0[i] = byte0;
    }

    public void update(byte abyte0[], int i, int j)
        throws DataLengthException, IllegalStateException
    {
        if (j < 0)
        {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int k = blockSize - bufOff;
        int l;
        if (j > k)
        {
            System.arraycopy(abyte0, i, buf, bufOff, k);
            byte abyte1[] = new byte[buf.length];
            System.arraycopy(buf, 0, abyte1, 0, mac.length);
            if (firstStep)
            {
                firstStep = false;
            } else
            {
                abyte1 = CM5func(buf, 0, mac);
            }
            gost28147MacFunc(workingKey, abyte1, 0, mac, 0);
            bufOff = 0;
            j -= k;
            i += k;
            do
            {
                l = j;
                k = i;
                if (j <= blockSize)
                {
                    break;
                }
                abyte1 = CM5func(abyte0, i, mac);
                gost28147MacFunc(workingKey, abyte1, 0, mac, 0);
                l = blockSize;
                k = blockSize;
                j -= l;
                i = k + i;
            } while (true);
        } else
        {
            k = i;
            l = j;
        }
        System.arraycopy(abyte0, k, buf, bufOff, l);
        bufOff = bufOff + l;
    }
}
