// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithSBox;

public class GOST28147Mac
    implements Mac
{

    private int a;
    private int b;
    private int c;
    private byte d[];
    private byte e[];
    private boolean f;
    private int g[];
    private byte h[] = {
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

    public GOST28147Mac()
    {
        a = 8;
        b = 4;
        f = true;
        g = null;
        e = new byte[a];
        d = new byte[a];
        c = 0;
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
        int i1 = bytesToint(abyte0, i);
        int k = bytesToint(abyte0, i + 4);
        int l = 0;
        i = i1;
        for (; l < 2; l++)
        {
            for (int j1 = 0; j1 < 8;)
            {
                int l1 = gost28147_mainStep(i, ai[j1]);
                j1++;
                int k1 = i;
                i = k ^ l1;
                k = k1;
            }

        }

        intTobytes(i, abyte1, j);
        intTobytes(k, abyte1, j + 4);
    }

    private int gost28147_mainStep(int i, int j)
    {
        i = j + i;
        j = h[(i >> 0 & 0xf) + 0];
        byte byte0 = h[(i >> 4 & 0xf) + 16];
        byte byte1 = h[(i >> 8 & 0xf) + 32];
        byte byte2 = h[(i >> 12 & 0xf) + 48];
        byte byte3 = h[(i >> 16 & 0xf) + 64];
        byte byte4 = h[(i >> 20 & 0xf) + 80];
        byte byte5 = h[(i >> 24 & 0xf) + 96];
        i = (h[(i >> 28 & 0xf) + 112] << 28) + ((j << 0) + (byte0 << 4) + (byte1 << 8) + (byte2 << 12) + (byte3 << 16) + (byte4 << 20) + (byte5 << 24));
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
    {
        for (; c < a; c = c + 1)
        {
            d[c] = 0;
        }

        byte abyte1[] = new byte[d.length];
        System.arraycopy(d, 0, abyte1, 0, e.length);
        if (f)
        {
            f = false;
        } else
        {
            abyte1 = CM5func(d, 0, e);
        }
        gost28147MacFunc(g, abyte1, 0, e, 0);
        System.arraycopy(e, e.length / 2 - b, abyte0, i, b);
        reset();
        return b;
    }

    public String getAlgorithmName()
    {
        return "GOST28147Mac";
    }

    public int getMacSize()
    {
        return b;
    }

    public void init(CipherParameters cipherparameters)
    {
        reset();
        d = new byte[a];
        if (cipherparameters instanceof ParametersWithSBox)
        {
            cipherparameters = (ParametersWithSBox)cipherparameters;
            System.arraycopy(cipherparameters.getSBox(), 0, h, 0, cipherparameters.getSBox().length);
            if (cipherparameters.getParameters() != null)
            {
                g = generateWorkingKey(((KeyParameter)cipherparameters.getParameters()).getKey());
            }
            return;
        }
        if (cipherparameters instanceof KeyParameter)
        {
            g = generateWorkingKey(((KeyParameter)cipherparameters).getKey());
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to GOST28147 init - ")).append(cipherparameters.getClass().getName()).toString());
        }
    }

    public void reset()
    {
        for (int i = 0; i < d.length; i++)
        {
            d[i] = 0;
        }

        c = 0;
        f = true;
    }

    public void update(byte byte0)
    {
        if (c == d.length)
        {
            byte abyte0[] = new byte[d.length];
            System.arraycopy(d, 0, abyte0, 0, e.length);
            int i;
            if (f)
            {
                f = false;
            } else
            {
                abyte0 = CM5func(d, 0, e);
            }
            gost28147MacFunc(g, abyte0, 0, e, 0);
            c = 0;
        }
        abyte0 = d;
        i = c;
        c = i + 1;
        abyte0[i] = byte0;
    }

    public void update(byte abyte0[], int i, int j)
    {
        if (j < 0)
        {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int k = a - c;
        int l;
        if (j > k)
        {
            System.arraycopy(abyte0, i, d, c, k);
            byte abyte1[] = new byte[d.length];
            System.arraycopy(d, 0, abyte1, 0, e.length);
            if (f)
            {
                f = false;
            } else
            {
                abyte1 = CM5func(d, 0, e);
            }
            gost28147MacFunc(g, abyte1, 0, e, 0);
            c = 0;
            j -= k;
            i += k;
            do
            {
                l = j;
                k = i;
                if (j <= a)
                {
                    break;
                }
                abyte1 = CM5func(abyte0, i, e);
                gost28147MacFunc(g, abyte1, 0, e, 0);
                l = a;
                k = a;
                j -= l;
                i = k + i;
            } while (true);
        } else
        {
            k = i;
            l = j;
        }
        System.arraycopy(abyte0, k, d, c, l);
        c = c + l;
    }
}
