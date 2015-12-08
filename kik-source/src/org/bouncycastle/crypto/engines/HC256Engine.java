// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class HC256Engine
    implements StreamCipher
{

    private int a[];
    private int b[];
    private int c;
    private byte d[];
    private byte e[];
    private boolean f;
    private byte g[];
    private int h;

    public HC256Engine()
    {
        a = new int[1024];
        b = new int[1024];
        c = 0;
        g = new byte[4];
        h = 0;
    }

    private byte getByte()
    {
        if (h == 0)
        {
            int i = step();
            g[0] = (byte)(i & 0xff);
            i >>= 8;
            g[1] = (byte)(i & 0xff);
            i >>= 8;
            g[2] = (byte)(i & 0xff);
            g[3] = (byte)(i >> 8 & 0xff);
        }
        byte byte0 = g[h];
        h = h + 1 & 3;
        return byte0;
    }

    private void init()
    {
        byte byte0 = 16;
        if (d.length != 32 && d.length != 16)
        {
            throw new IllegalArgumentException("The key must be 128/256 bits long");
        }
        if (e.length < 16)
        {
            throw new IllegalArgumentException("The IV must be at least 128 bits long");
        }
        if (d.length != 32)
        {
            byte abyte0[] = new byte[32];
            System.arraycopy(d, 0, abyte0, 0, d.length);
            System.arraycopy(d, 0, abyte0, 16, d.length);
            d = abyte0;
        }
        if (e.length < 32)
        {
            byte abyte1[] = new byte[32];
            System.arraycopy(e, 0, abyte1, 0, e.length);
            System.arraycopy(e, 0, abyte1, e.length, 32 - e.length);
            e = abyte1;
        }
        c = 0;
        int ai[] = new int[2560];
        for (int i = 0; i < 32; i++)
        {
            int l = i >> 2;
            ai[l] = ai[l] | (d[i] & 0xff) << (i & 3) * 8;
        }

        int i1 = 0;
        int j;
        do
        {
            j = byte0;
            if (i1 >= 32)
            {
                break;
            }
            j = (i1 >> 2) + 8;
            ai[j] = ai[j] | (e[i1] & 0xff) << (i1 & 3) * 8;
            i1++;
        } while (true);
        for (; j < 2560; j++)
        {
            int j1 = ai[j - 2];
            int k1 = ai[j - 15];
            ai[j] = (j1 >>> 10 ^ (rotateRight(j1, 17) ^ rotateRight(j1, 19))) + ai[j - 7] + (k1 >>> 3 ^ (rotateRight(k1, 7) ^ rotateRight(k1, 18))) + ai[j - 16] + j;
        }

        System.arraycopy(ai, 512, a, 0, 1024);
        System.arraycopy(ai, 1536, b, 0, 1024);
        for (int k = 0; k < 4096; k++)
        {
            step();
        }

        c = 0;
    }

    private static int rotateRight(int i, int j)
    {
        return i >>> j | i << -j;
    }

    private int step()
    {
        int i = c & 0x3ff;
        if (c < 1024)
        {
            int j = a[i - 3 & 0x3ff];
            int l = a[i - 1023 & 0x3ff];
            int ai[] = a;
            int j1 = ai[i];
            int l1 = a[i - 10 & 0x3ff];
            int j2 = rotateRight(j, 10);
            int l2 = rotateRight(l, 23);
            ai[i] = b[(j ^ l) & 0x3ff] + (l1 + (j2 ^ l2)) + j1;
            l1 = a[i - 12 & 0x3ff];
            j = b[l1 & 0xff];
            l = b[(l1 >> 8 & 0xff) + 256];
            j1 = b[(l1 >> 16 & 0xff) + 512];
            l1 = b[(l1 >> 24 & 0xff) + 768];
            i = a[i] ^ l1 + (j + l + j1);
        } else
        {
            int k = b[i - 3 & 0x3ff];
            int i1 = b[i - 1023 & 0x3ff];
            int ai1[] = b;
            int k1 = ai1[i];
            int i2 = b[i - 10 & 0x3ff];
            int k2 = rotateRight(k, 10);
            int i3 = rotateRight(i1, 23);
            ai1[i] = a[(k ^ i1) & 0x3ff] + (i2 + (k2 ^ i3)) + k1;
            i2 = b[i - 12 & 0x3ff];
            k = a[i2 & 0xff];
            i1 = a[(i2 >> 8 & 0xff) + 256];
            k1 = a[(i2 >> 16 & 0xff) + 512];
            i2 = a[(i2 >> 24 & 0xff) + 768];
            i = b[i] ^ i2 + (k + i1 + k1);
        }
        c = c + 1 & 0x7ff;
        return i;
    }

    public String getAlgorithmName()
    {
        return "HC-256";
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        CipherParameters cipherparameters1;
        if (cipherparameters instanceof ParametersWithIV)
        {
            e = ((ParametersWithIV)cipherparameters).getIV();
            cipherparameters1 = ((ParametersWithIV)cipherparameters).getParameters();
        } else
        {
            e = new byte[0];
            cipherparameters1 = cipherparameters;
        }
        if (cipherparameters1 instanceof KeyParameter)
        {
            d = ((KeyParameter)cipherparameters1).getKey();
            init();
            f = true;
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid parameter passed to HC256 init - ")).append(cipherparameters.getClass().getName()).toString());
        }
    }

    public void processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        if (!f)
        {
            throw new IllegalStateException((new StringBuilder()).append(getAlgorithmName()).append(" not initialised").toString());
        }
        if (i + j > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (k + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        for (int l = 0; l < j; l++)
        {
            abyte1[k + l] = (byte)(abyte0[i + l] ^ getByte());
        }

    }

    public void reset()
    {
        h = 0;
        init();
    }

    public byte returnByte(byte byte0)
    {
        return (byte)(getByte() ^ byte0);
    }
}
