// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.c;


class c
{

    protected int a;
    protected byte b[];
    protected int c;
    protected int d;
    protected int e[][];
    protected int f[];
    protected int g[];
    protected int h[];
    protected int i[];

    public c(byte abyte0[], int j, int k)
    {
        f = new int[256];
        g = new int[256];
        h = new int[256];
        i = new int[32];
        b = abyte0;
        c = j;
        d = k;
        e = new int[256][];
        for (j = 0; j < 256; j++)
        {
            e[j] = new int[4];
            abyte0 = e[j];
            k = (j << 12) / 256;
            abyte0[2] = k;
            abyte0[1] = k;
            abyte0[0] = k;
            h[j] = 256;
            g[j] = 0;
        }

    }

    public int a(int j, int k, int l)
    {
        int i1;
        int j1;
        int k1;
        int l1;
        k1 = f[k];
        i1 = -1;
        j1 = 1000;
        l1 = k1 - 1;
_L9:
        if (k1 >= 256 && l1 < 0) goto _L2; else goto _L1
_L1:
        int ai[];
        int i2;
        if (k1 >= 256)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        ai = e[k1];
        i2 = ai[1] - k;
        if (i2 < j1) goto _L4; else goto _L3
_L3:
        i2 = 256;
        k1 = i1;
        i1 = i2;
_L13:
        i2 = l1;
        if (l1 < 0) goto _L6; else goto _L5
_L5:
        int k2;
        ai = e[l1];
        k2 = k - ai[1];
        if (k2 < j1) goto _L8; else goto _L7
_L7:
        i2 = -1;
        l1 = i1;
        i1 = k1;
        k1 = l1;
        l1 = i2;
          goto _L9
_L4:
        int l2;
        k2 = k1 + 1;
        k1 = i2;
        if (i2 < 0)
        {
            k1 = -i2;
        }
        l2 = ai[0] - j;
        i2 = l2;
        if (l2 < 0)
        {
            i2 = -l2;
        }
        l2 = i2 + k1;
        if (l2 >= j1) goto _L11; else goto _L10
_L10:
        i2 = ai[2] - l;
        k1 = i2;
        if (i2 < 0)
        {
            k1 = -i2;
        }
        i2 = l2 + k1;
        if (i2 >= j1) goto _L11; else goto _L12
_L12:
        k1 = ai[3];
        j1 = i2;
        i1 = k2;
          goto _L13
_L8:
        l1--;
        i2 = k2;
        if (k2 < 0)
        {
            i2 = -k2;
        }
        l2 = ai[0] - j;
        k2 = l2;
        if (l2 < 0)
        {
            k2 = -l2;
        }
        l2 = k2 + i2;
        i2 = l1;
        if (l2 >= j1) goto _L6; else goto _L14
_L14:
        k2 = ai[2] - l;
        i2 = k2;
        if (k2 < 0)
        {
            i2 = -k2;
        }
        k2 = i2 + l2;
        i2 = l1;
        if (k2 >= j1) goto _L6; else goto _L15
_L15:
        i2 = ai[3];
        k1 = i1;
        j1 = k2;
        i1 = i2;
          goto _L9
_L2:
        return i1;
_L6:
        l1 = i1;
        i1 = k1;
        k1 = l1;
        l1 = i2;
          goto _L9
_L11:
        k1 = i1;
        i1 = k2;
          goto _L13
        int j2 = k1;
        k1 = i1;
        i1 = j2;
          goto _L13
    }

    protected void a(int j, int k, int l, int i1, int j1)
    {
        int l1;
        int i2;
        int j2;
        i2 = k - j;
        if (i2 < -1)
        {
            i2 = -1;
        }
        j = k + j;
        j2 = j;
        if (j > 256)
        {
            j2 = 256;
        }
        boolean flag = true;
        l1 = k - 1;
        j = k + 1;
        k = ((flag) ? 1 : 0);
_L6:
        if (j >= j2 && l1 <= i2) goto _L2; else goto _L1
_L1:
        int ai[];
        int k1;
        int k2;
        Object obj = i;
        k1 = k + 1;
        k2 = obj[k];
        if (j >= j2)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        obj = e;
        k = j + 1;
        ai = obj[j];
        ai[0] = ai[0] - ((ai[0] - l) * k2) / 0x40000;
        ai[1] = ai[1] - ((ai[1] - i1) * k2) / 0x40000;
        ai[2] = ai[2] - ((ai[2] - j1) * k2) / 0x40000;
        j = k;
_L4:
        if (l1 <= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = e;
        k = l1 - 1;
        obj1 = obj1[l1];
        try
        {
            obj1[0] = obj1[0] - ((obj1[0] - l) * k2) / 0x40000;
            obj1[1] = obj1[1] - ((obj1[1] - i1) * k2) / 0x40000;
            obj1[2] = obj1[2] - (k2 * (obj1[2] - j1)) / 0x40000;
        }
        catch (Exception exception)
        {
            l1 = k;
            k = k1;
            continue; /* Loop/switch isn't completed */
        }
        l1 = k;
        k = k1;
        continue; /* Loop/switch isn't completed */
_L2:
        return;
        Exception exception1;
        exception1;
        j = k;
        if (true) goto _L4; else goto _L3
_L3:
        k = k1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public byte[] a()
    {
        byte abyte0[] = new byte[768];
        int ai[] = new int[256];
        for (int j = 0; j < 256; j++)
        {
            ai[e[j][3]] = j;
        }

        int k = 0;
        int l = 0;
        for (; k < 256; k++)
        {
            int i1 = ai[k];
            int j1 = l + 1;
            abyte0[l] = (byte)e[i1][0];
            int k1 = j1 + 1;
            abyte0[j1] = (byte)e[i1][1];
            l = k1 + 1;
            abyte0[k1] = (byte)e[i1][2];
        }

        return abyte0;
    }

    protected int b(int j, int k, int l)
    {
        int k1 = 0x7fffffff;
        int j1 = -1;
        int i2 = 0x7fffffff;
        int l1 = -1;
        int i1 = 0;
        while (i1 < 256) 
        {
            int ai[] = e[i1];
            int l2 = ai[0] - j;
            int j2 = l2;
            if (l2 < 0)
            {
                j2 = -l2;
            }
            int i3 = ai[1] - k;
            l2 = i3;
            if (i3 < 0)
            {
                l2 = -i3;
            }
            int j3 = ai[2] - l;
            i3 = j3;
            if (j3 < 0)
            {
                i3 = -j3;
            }
            l2 = l2 + j2 + i3;
            if (l2 < i2)
            {
                l1 = l2;
                i2 = i1;
            } else
            {
                int k2 = l1;
                l1 = i2;
                i2 = k2;
            }
            j2 = l2 - (g[i1] >> 12);
            if (j2 < k1)
            {
                j1 = i1;
                k1 = j2;
            }
            j2 = h[i1] >> 10;
            ai = h;
            ai[i1] = ai[i1] - j2;
            ai = g;
            ai[i1] = (j2 << 10) + ai[i1];
            i1++;
            j2 = i2;
            i2 = l1;
            l1 = j2;
        }
        ai = h;
        ai[l1] = ai[l1] + 64;
        ai = g;
        ai[l1] = ai[l1] - 0x10000;
        return j1;
    }

    public void b()
    {
        int i1 = 0;
        int l = 0;
        for (int j = 0; j < 256; j++)
        {
            int ai[] = e[j];
            int j1 = ai[1];
            int k1 = j + 1;
            int i2 = j;
            while (k1 < 256) 
            {
                int ai1[] = e[k1];
                int j2 = j1;
                if (ai1[1] < j1)
                {
                    j2 = ai1[1];
                    i2 = k1;
                }
                k1++;
                j1 = j2;
            }
            int ai2[] = e[i2];
            if (j != i2)
            {
                int l1 = ai2[0];
                ai2[0] = ai[0];
                ai[0] = l1;
                l1 = ai2[1];
                ai2[1] = ai[1];
                ai[1] = l1;
                l1 = ai2[2];
                ai2[2] = ai[2];
                ai[2] = l1;
                l1 = ai2[3];
                ai2[3] = ai[3];
                ai[3] = l1;
            }
            if (j1 == l)
            {
                continue;
            }
            f[l] = i1 + j >> 1;
            for (l++; l < j1; l++)
            {
                f[l] = j;
            }

            l = j1;
            i1 = j;
        }

        f[l] = i1 + 255 >> 1;
        for (int k = l + 1; k < 256; k++)
        {
            f[k] = 255;
        }

    }

    protected void b(int j, int k, int l, int i1, int j1)
    {
        int ai[] = e[k];
        ai[0] = ai[0] - ((ai[0] - l) * j) / 1024;
        ai[1] = ai[1] - ((ai[1] - i1) * j) / 1024;
        ai[2] = ai[2] - ((ai[2] - j1) * j) / 1024;
    }

    public void c()
    {
        if (c < 1509)
        {
            d = 1;
        }
        a = (d - 1) / 3 + 30;
        byte abyte0[] = b;
        int k2 = c;
        int l2 = c / (d * 3);
        int k = l2 / 100;
        for (int j = 0; j < 32; j++)
        {
            i[j] = (((1024 - j * j) * 256) / 1024) * 1024;
        }

        char c1;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        if (c < 1509)
        {
            c1 = '\003';
        } else
        if (c % 499 != 0)
        {
            c1 = '\u05D9';
        } else
        if (c % 491 != 0)
        {
            c1 = '\u05C1';
        } else
        if (c % 487 != 0)
        {
            c1 = '\u05B5';
        } else
        {
            c1 = '\u05E5';
        }
        l = 0;
        l1 = 32;
        j1 = 2048;
        i1 = 0;
        k1 = 1024;
        do
        {
            int i2;
label0:
            {
                int j2;
                if (i1 < l2)
                {
                    i2 = (abyte0[l + 0] & 0xff) << 4;
                    j2 = (abyte0[l + 1] & 0xff) << 4;
                    int i3 = (abyte0[l + 2] & 0xff) << 4;
                    int j3 = b(i2, j2, i3);
                    b(k1, j3, i2, j2, i3);
                    if (l1 != 0)
                    {
                        a(l1, j3, i2, j2, i3);
                    }
                    l += c1;
                    if (l >= k2)
                    {
                        l -= c;
                    }
                    i2 = i1 + 1;
                    if (k == 0)
                    {
                        k = 1;
                    }
                    if (i2 % k != 0)
                    {
                        break label0;
                    }
                    k1 -= k1 / a;
                    j2 = j1 - j1 / 30;
                    j1 = j2 >> 6;
                    i1 = j1;
                    if (j1 <= 1)
                    {
                        i1 = 0;
                    }
                    for (j1 = 0; j1 < i1; j1++)
                    {
                        i[j1] = (((i1 * i1 - j1 * j1) * 256) / (i1 * i1)) * k1;
                    }

                } else
                {
                    return;
                }
                l1 = i1;
                j1 = j2;
                i1 = i2;
                continue;
            }
            i1 = i2;
        } while (true);
    }

    public byte[] d()
    {
        c();
        e();
        b();
        return a();
    }

    public void e()
    {
        for (int j = 0; j < 256; j++)
        {
            int ai[] = e[j];
            ai[0] = ai[0] >> 4;
            ai = e[j];
            ai[1] = ai[1] >> 4;
            ai = e[j];
            ai[2] = ai[2] >> 4;
            e[j][3] = j;
        }

    }
}
