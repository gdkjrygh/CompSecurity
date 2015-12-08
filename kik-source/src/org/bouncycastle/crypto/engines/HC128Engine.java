// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class HC128Engine
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

    public HC128Engine()
    {
        a = new int[512];
        b = new int[512];
        c = 0;
        g = new byte[4];
        h = 0;
    }

    private static int dim(int i, int j)
    {
        return mod512(i - j);
    }

    private static int f1(int i)
    {
        return rotateRight(i, 7) ^ rotateRight(i, 18) ^ i >>> 3;
    }

    private static int f2(int i)
    {
        return rotateRight(i, 17) ^ rotateRight(i, 19) ^ i >>> 10;
    }

    private int g1(int i, int j, int k)
    {
        return (rotateRight(i, 10) ^ rotateRight(k, 23)) + rotateRight(j, 8);
    }

    private int g2(int i, int j, int k)
    {
        return (rotateLeft(i, 10) ^ rotateLeft(k, 23)) + rotateLeft(j, 8);
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

    private int h1(int i)
    {
        return b[i & 0xff] + b[(i >> 16 & 0xff) + 256];
    }

    private int h2(int i)
    {
        return a[i & 0xff] + a[(i >> 16 & 0xff) + 256];
    }

    private void init()
    {
        if (d.length != 16)
        {
            throw new IllegalArgumentException("The key must be 128 bits long");
        }
        c = 0;
        int ai[] = new int[1280];
        for (int i = 0; i < 16; i++)
        {
            int j1 = i >> 2;
            ai[j1] = ai[j1] | (d[i] & 0xff) << (i & 3) * 8;
        }

        System.arraycopy(ai, 0, ai, 4, 4);
        for (int j = 0; j < e.length && j < 16; j++)
        {
            int k1 = (j >> 2) + 8;
            ai[k1] = ai[k1] | (e[j] & 0xff) << (j & 3) * 8;
        }

        System.arraycopy(ai, 8, ai, 12, 4);
        for (int k = 16; k < 1280; k++)
        {
            ai[k] = f2(ai[k - 2]) + ai[k - 7] + f1(ai[k - 15]) + ai[k - 16] + k;
        }

        System.arraycopy(ai, 256, a, 0, 512);
        System.arraycopy(ai, 768, b, 0, 512);
        for (int l = 0; l < 512; l++)
        {
            a[l] = step();
        }

        for (int i1 = 0; i1 < 512; i1++)
        {
            b[i1] = step();
        }

        c = 0;
    }

    private static int mod1024(int i)
    {
        return i & 0x3ff;
    }

    private static int mod512(int i)
    {
        return i & 0x1ff;
    }

    private static int rotateLeft(int i, int j)
    {
        return i << j | i >>> -j;
    }

    private static int rotateRight(int i, int j)
    {
        return i >>> j | i << -j;
    }

    private int step()
    {
        int i = mod512(c);
        if (c < 512)
        {
            int ai[] = a;
            ai[i] = ai[i] + g1(a[dim(i, 3)], a[dim(i, 10)], a[dim(i, 511)]);
            int j = h1(a[dim(i, 12)]);
            i = a[i] ^ j;
        } else
        {
            int ai1[] = b;
            ai1[i] = ai1[i] + g2(b[dim(i, 3)], b[dim(i, 10)], b[dim(i, 511)]);
            int k = h2(b[dim(i, 12)]);
            i = b[i] ^ k;
        }
        c = mod1024(c + 1);
        return i;
    }

    public String getAlgorithmName()
    {
        return "HC-128";
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
            throw new IllegalArgumentException((new StringBuilder("Invalid parameter passed to HC128 init - ")).append(cipherparameters.getClass().getName()).toString());
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
