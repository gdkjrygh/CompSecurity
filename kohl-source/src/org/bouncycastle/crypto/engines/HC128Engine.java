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

    private byte buf[];
    private int cnt;
    private int idx;
    private boolean initialised;
    private byte iv[];
    private byte key[];
    private int p[];
    private int q[];

    public HC128Engine()
    {
        p = new int[512];
        q = new int[512];
        cnt = 0;
        buf = new byte[4];
        idx = 0;
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
        if (idx == 0)
        {
            int i = step();
            buf[0] = (byte)(i & 0xff);
            i >>= 8;
            buf[1] = (byte)(i & 0xff);
            i >>= 8;
            buf[2] = (byte)(i & 0xff);
            buf[3] = (byte)(i >> 8 & 0xff);
        }
        byte byte0 = buf[idx];
        idx = idx + 1 & 3;
        return byte0;
    }

    private int h1(int i)
    {
        return q[i & 0xff] + q[(i >> 16 & 0xff) + 256];
    }

    private int h2(int i)
    {
        return p[i & 0xff] + p[(i >> 16 & 0xff) + 256];
    }

    private void init()
    {
        if (key.length != 16)
        {
            throw new IllegalArgumentException("The key must be 128 bits long");
        }
        cnt = 0;
        int ai[] = new int[1280];
        for (int i = 0; i < 16; i++)
        {
            int j1 = i >> 2;
            ai[j1] = ai[j1] | (key[i] & 0xff) << (i & 3) * 8;
        }

        System.arraycopy(ai, 0, ai, 4, 4);
        for (int j = 0; j < iv.length && j < 16; j++)
        {
            int k1 = (j >> 2) + 8;
            ai[k1] = ai[k1] | (iv[j] & 0xff) << (j & 3) * 8;
        }

        System.arraycopy(ai, 8, ai, 12, 4);
        for (int k = 16; k < 1280; k++)
        {
            ai[k] = f2(ai[k - 2]) + ai[k - 7] + f1(ai[k - 15]) + ai[k - 16] + k;
        }

        System.arraycopy(ai, 256, p, 0, 512);
        System.arraycopy(ai, 768, q, 0, 512);
        for (int l = 0; l < 512; l++)
        {
            p[l] = step();
        }

        for (int i1 = 0; i1 < 512; i1++)
        {
            q[i1] = step();
        }

        cnt = 0;
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
        int i = mod512(cnt);
        if (cnt < 512)
        {
            int ai[] = p;
            ai[i] = ai[i] + g1(p[dim(i, 3)], p[dim(i, 10)], p[dim(i, 511)]);
            int j = h1(p[dim(i, 12)]);
            i = p[i] ^ j;
        } else
        {
            int ai1[] = q;
            ai1[i] = ai1[i] + g2(q[dim(i, 3)], q[dim(i, 10)], q[dim(i, 511)]);
            int k = h2(q[dim(i, 12)]);
            i = q[i] ^ k;
        }
        cnt = mod1024(cnt + 1);
        return i;
    }

    public String getAlgorithmName()
    {
        return "HC-128";
    }

    public void init(boolean flag, CipherParameters cipherparameters)
        throws IllegalArgumentException
    {
        CipherParameters cipherparameters1;
        if (cipherparameters instanceof ParametersWithIV)
        {
            iv = ((ParametersWithIV)cipherparameters).getIV();
            cipherparameters1 = ((ParametersWithIV)cipherparameters).getParameters();
        } else
        {
            iv = new byte[0];
            cipherparameters1 = cipherparameters;
        }
        if (cipherparameters1 instanceof KeyParameter)
        {
            key = ((KeyParameter)cipherparameters1).getKey();
            init();
            initialised = true;
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid parameter passed to HC128 init - ").append(cipherparameters.getClass().getName()).toString());
        }
    }

    public void processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
        throws DataLengthException
    {
        if (!initialised)
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
        idx = 0;
        init();
    }

    public byte returnByte(byte byte0)
    {
        return (byte)(getByte() ^ byte0);
    }
}
