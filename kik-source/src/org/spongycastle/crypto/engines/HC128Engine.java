// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

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

    private static int a(int i, int j)
    {
        return i << j | i >>> -j;
    }

    private static int b(int i, int j)
    {
        return i >>> j | i << -j;
    }

    private int c()
    {
        int i = c & 0x1ff;
        if (c < 512)
        {
            int ai[] = a;
            int j = ai[i];
            int l = a[i - 3 & 0x1ff];
            int j1 = a[i - 10 & 0x1ff];
            int l1 = a[i - 511 & 0x1ff];
            ai[i] = j + ((b(l, 10) ^ b(l1, 23)) + b(j1, 8));
            l = a[i - 12 & 0x1ff];
            j = b[l & 0xff];
            l = b[(l >> 16 & 0xff) + 256];
            i = a[i] ^ l + j;
        } else
        {
            int ai1[] = b;
            int k = ai1[i];
            int i1 = b[i - 3 & 0x1ff];
            int k1 = b[i - 10 & 0x1ff];
            int i2 = b[i - 511 & 0x1ff];
            ai1[i] = k + ((a(i1, 10) ^ a(i2, 23)) + a(k1, 8));
            i1 = b[i - 12 & 0x1ff];
            k = a[i1 & 0xff];
            i1 = a[(i1 >> 16 & 0xff) + 256];
            i = b[i] ^ i1 + k;
        }
        c = c + 1 & 0x3ff;
        return i;
    }

    private void d()
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
            int l1 = ai[k - 2];
            int i2 = b(l1, 17);
            int j2 = b(l1, 19);
            int k2 = ai[k - 7];
            int l2 = ai[k - 15];
            ai[k] = (l1 >>> 10 ^ (i2 ^ j2)) + k2 + (l2 >>> 3 ^ (b(l2, 7) ^ b(l2, 18))) + ai[k - 16] + k;
        }

        System.arraycopy(ai, 256, a, 0, 512);
        System.arraycopy(ai, 768, b, 0, 512);
        for (int l = 0; l < 512; l++)
        {
            a[l] = c();
        }

        for (int i1 = 0; i1 < 512; i1++)
        {
            b[i1] = c();
        }

        c = 0;
    }

    private byte e()
    {
        if (h == 0)
        {
            int i = c();
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

    public final byte a(byte byte0)
    {
        return (byte)(e() ^ byte0);
    }

    public final String a()
    {
        return "HC-128";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        CipherParameters cipherparameters1;
        if (cipherparameters instanceof ParametersWithIV)
        {
            e = ((ParametersWithIV)cipherparameters).a();
            cipherparameters1 = ((ParametersWithIV)cipherparameters).b();
        } else
        {
            e = new byte[0];
            cipherparameters1 = cipherparameters;
        }
        if (cipherparameters1 instanceof KeyParameter)
        {
            d = ((KeyParameter)cipherparameters1).a();
            d();
            f = true;
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid parameter passed to HC128 init - ")).append(cipherparameters.getClass().getName()).toString());
        }
    }

    public final void a(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        if (!f)
        {
            throw new IllegalStateException("HC-128 not initialised");
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
            abyte1[k + l] = (byte)(abyte0[i + l] ^ e());
        }

    }

    public final void b()
    {
        h = 0;
        d();
    }
}
