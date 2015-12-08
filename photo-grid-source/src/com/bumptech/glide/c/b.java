// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.c;

import java.io.OutputStream;

final class b
{

    int a;
    int b;
    int c;
    int d;
    int e[];
    int f[];
    int g;
    int h;
    boolean i;
    int j;
    int k;
    int l;
    int m;
    int n;
    int o[] = {
        0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 
        1023, 2047, 4095, 8191, 16383, 32767, 65535
    };
    int p;
    byte q[];
    private int r;
    private int s;
    private byte t[];
    private int u;
    private int v;
    private int w;

    b(int i1, int j1, byte abyte0[], int k1)
    {
        b = 12;
        d = 4096;
        e = new int[5003];
        f = new int[5003];
        g = 5003;
        h = 0;
        i = false;
        m = 0;
        n = 0;
        q = new byte[256];
        r = i1;
        s = j1;
        t = abyte0;
        u = Math.max(2, k1);
    }

    private int a()
    {
        if (v == 0)
        {
            return -1;
        } else
        {
            v = v - 1;
            byte abyte0[] = t;
            int i1 = w;
            w = i1 + 1;
            return abyte0[i1] & 0xff;
        }
    }

    private void a(byte byte0, OutputStream outputstream)
    {
        byte abyte0[] = q;
        int i1 = p;
        p = i1 + 1;
        abyte0[i1] = byte0;
        if (p >= 254)
        {
            b(outputstream);
        }
    }

    private void a(int i1)
    {
        for (int j1 = 0; j1 < i1; j1++)
        {
            e[j1] = -1;
        }

    }

    private void a(int i1, OutputStream outputstream)
    {
        m = m & o[n];
        if (n > 0)
        {
            m = m | i1 << n;
        } else
        {
            m = i1;
        }
        for (n = n + a; n >= 8; n = n - 8)
        {
            a((byte)(m & 0xff), outputstream);
            m = m >> 8;
        }

        if (h > c || i)
        {
            if (i)
            {
                int j1 = j;
                a = j1;
                c = (1 << j1) - 1;
                i = false;
            } else
            {
                a = a + 1;
                if (a == b)
                {
                    c = d;
                } else
                {
                    c = (1 << a) - 1;
                }
            }
        }
        if (i1 == l)
        {
            for (; n > 0; n = n - 8)
            {
                a((byte)(m & 0xff), outputstream);
                m = m >> 8;
            }

            b(outputstream);
        }
    }

    private void b(OutputStream outputstream)
    {
        if (p > 0)
        {
            outputstream.write(p);
            outputstream.write(q, 0, p);
            p = 0;
        }
    }

    final void a(OutputStream outputstream)
    {
        outputstream.write(u);
        v = r * s;
        w = 0;
        int i1 = u + 1;
        j = i1;
        i = false;
        a = j;
        c = (1 << a) - 1;
        k = 1 << i1 - 1;
        l = k + 1;
        h = k + 2;
        p = 0;
        int j1 = a();
        i1 = g;
        int l1 = 0;
        for (; i1 < 0x10000; i1 *= 2)
        {
            l1++;
        }

        int l2 = g;
        a(l2);
        a(k, outputstream);
        i1 = j1;
label0:
        do
        {
            int i2 = a();
            if (i2 == -1)
            {
                break;
            }
            int i3 = (i2 << b) + i1;
            int k1 = i2 << 8 - l1 ^ i1;
            if (e[k1] == i3)
            {
                i1 = f[k1];
                continue;
            }
            int j2 = k1;
            if (e[k1] >= 0)
            {
                j2 = l2 - k1;
                int k2 = k1;
                if (k1 == 0)
                {
                    j2 = 1;
                    k2 = k1;
                }
                do
                {
                    k2 -= j2;
                    k1 = k2;
                    if (k2 < 0)
                    {
                        k1 = k2 + l2;
                    }
                    if (e[k1] == i3)
                    {
                        i1 = f[k1];
                        continue label0;
                    }
                    k2 = k1;
                } while (e[k1] >= 0);
                j2 = k1;
            }
            a(i1, outputstream);
            if (h < d)
            {
                int ai[] = f;
                i1 = h;
                h = i1 + 1;
                ai[j2] = i1;
                e[j2] = i3;
                i1 = i2;
            } else
            {
                a(g);
                h = k + 2;
                i = true;
                a(k, outputstream);
                i1 = i2;
            }
        } while (true);
        a(i1, outputstream);
        a(l, outputstream);
        outputstream.write(0);
    }
}
