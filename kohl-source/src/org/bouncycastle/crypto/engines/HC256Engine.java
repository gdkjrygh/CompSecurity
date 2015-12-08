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

    private byte buf[];
    private int cnt;
    private int idx;
    private boolean initialised;
    private byte iv[];
    private byte key[];
    private int p[];
    private int q[];

    public HC256Engine()
    {
        p = new int[1024];
        q = new int[1024];
        cnt = 0;
        buf = new byte[4];
        idx = 0;
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

    private void init()
    {
        byte byte0 = 16;
        if (key.length != 32 && key.length != 16)
        {
            throw new IllegalArgumentException("The key must be 128/256 bits long");
        }
        if (iv.length < 16)
        {
            throw new IllegalArgumentException("The IV must be at least 128 bits long");
        }
        if (key.length != 32)
        {
            byte abyte0[] = new byte[32];
            System.arraycopy(key, 0, abyte0, 0, key.length);
            System.arraycopy(key, 0, abyte0, 16, key.length);
            key = abyte0;
        }
        if (iv.length < 32)
        {
            byte abyte1[] = new byte[32];
            System.arraycopy(iv, 0, abyte1, 0, iv.length);
            System.arraycopy(iv, 0, abyte1, iv.length, abyte1.length - iv.length);
            iv = abyte1;
        }
        cnt = 0;
        int ai[] = new int[2560];
        for (int i = 0; i < 32; i++)
        {
            int l = i >> 2;
            ai[l] = ai[l] | (key[i] & 0xff) << (i & 3) * 8;
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
            ai[j] = ai[j] | (iv[i1] & 0xff) << (i1 & 3) * 8;
            i1++;
        } while (true);
        for (; j < 2560; j++)
        {
            int j1 = ai[j - 2];
            int k1 = ai[j - 15];
            ai[j] = (j1 >>> 10 ^ (rotateRight(j1, 17) ^ rotateRight(j1, 19))) + ai[j - 7] + (k1 >>> 3 ^ (rotateRight(k1, 7) ^ rotateRight(k1, 18))) + ai[j - 16] + j;
        }

        System.arraycopy(ai, 512, p, 0, 1024);
        System.arraycopy(ai, 1536, q, 0, 1024);
        for (int k = 0; k < 4096; k++)
        {
            step();
        }

        cnt = 0;
    }

    private static int rotateRight(int i, int j)
    {
        return i >>> j | i << -j;
    }

    private int step()
    {
        int i = cnt & 0x3ff;
        if (cnt < 1024)
        {
            int j = p[i - 3 & 0x3ff];
            int l = p[i - 1023 & 0x3ff];
            int ai[] = p;
            int j1 = ai[i];
            int l1 = p[i - 10 & 0x3ff];
            int j2 = rotateRight(j, 10);
            int l2 = rotateRight(l, 23);
            ai[i] = q[(j ^ l) & 0x3ff] + (l1 + (j2 ^ l2)) + j1;
            l1 = p[i - 12 & 0x3ff];
            j = q[l1 & 0xff];
            l = q[(l1 >> 8 & 0xff) + 256];
            j1 = q[(l1 >> 16 & 0xff) + 512];
            l1 = q[(l1 >> 24 & 0xff) + 768];
            i = p[i] ^ l1 + (j + l + j1);
        } else
        {
            int k = q[i - 3 & 0x3ff];
            int i1 = q[i - 1023 & 0x3ff];
            int ai1[] = q;
            int k1 = ai1[i];
            int i2 = q[i - 10 & 0x3ff];
            int k2 = rotateRight(k, 10);
            int i3 = rotateRight(i1, 23);
            ai1[i] = p[(k ^ i1) & 0x3ff] + (i2 + (k2 ^ i3)) + k1;
            i2 = q[i - 12 & 0x3ff];
            k = p[i2 & 0xff];
            i1 = p[(i2 >> 8 & 0xff) + 256];
            k1 = p[(i2 >> 16 & 0xff) + 512];
            i2 = p[(i2 >> 24 & 0xff) + 768];
            i = q[i] ^ i2 + (k + i1 + k1);
        }
        cnt = cnt + 1 & 0x7ff;
        return i;
    }

    public String getAlgorithmName()
    {
        return "HC-256";
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
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid parameter passed to HC256 init - ").append(cipherparameters.getClass().getName()).toString());
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
