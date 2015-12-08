// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.c;


final class c
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

    public final int a(int j, int k, int l)
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

    public final byte[] a()
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

    public final void b()
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

    public final void c()
    {
        char c1;
        int i1;
        int k1;
        int l1;
        int i3;
        int j3;
        int k3;
        int k5;
        if (c < 1509)
        {
            d = 1;
        }
        a = (d - 1) / 3 + 30;
        byte abyte0[] = b;
        k5 = c;
        int l5 = c / (d * 3);
        i1 = l5 / 100;
        for (int j = 0; j < 32; j++)
        {
            i[j] = (((1024 - j * j) * 256) / 1024) * 1024;
        }

        int ai[];
        int k;
        int i2;
        int l3;
        int k4;
        int i5;
        int j5;
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
        l1 = 0;
        j3 = 1024;
        k3 = 32;
        i3 = 2048;
        k1 = 0;
_L7:
        if (k1 >= l5) goto _L2; else goto _L1
_L1:
        int i6 = (abyte0[l1 + 0] & 0xff) << 4;
        int j6 = (abyte0[l1 + 1] & 0xff) << 4;
        int k6 = (abyte0[l1 + 2] & 0xff) << 4;
        int l2 = 0x7fffffff;
        i2 = 0x7fffffff;
        int k2 = -1;
        int j1 = -1;
        k = 0;
        while (k < 256) 
        {
            ai = e[k];
            k4 = ai[0] - i6;
            l3 = k4;
            if (k4 < 0)
            {
                l3 = -k4;
            }
            i5 = ai[1] - j6;
            k4 = i5;
            if (i5 < 0)
            {
                k4 = -i5;
            }
            j5 = ai[2] - k6;
            i5 = j5;
            if (j5 < 0)
            {
                i5 = -j5;
            }
            k4 = k4 + l3 + i5;
            Object obj;
            int ai1[];
            Exception exception;
            int l;
            int j2;
            int i4;
            int l4;
            if (k4 < l2)
            {
                k2 = k4;
                l2 = k;
            } else
            {
                int j4 = k2;
                k2 = l2;
                l2 = j4;
            }
            l3 = k4 - (g[k] >> 12);
            if (l3 < i2)
            {
                j1 = k;
                i2 = l3;
            }
            l3 = h[k] >> 10;
            ai = h;
            ai[k] = ai[k] - l3;
            ai = g;
            ai[k] = (l3 << 10) + ai[k];
            k++;
            l3 = l2;
            l2 = k2;
            k2 = l3;
        }
        obj = h;
        obj[k2] = obj[k2] + 64;
        obj = g;
        obj[k2] = obj[k2] - 0x10000;
        obj = e[j1];
        obj[0] = obj[0] - ((obj[0] - i6) * j3) / 1024;
        obj[1] = obj[1] - ((obj[1] - j6) * j3) / 1024;
        obj[2] = obj[2] - ((obj[2] - k6) * j3) / 1024;
        if (k3 == 0) goto _L4; else goto _L3
_L3:
        l2 = j1 - k3;
        if (l2 < -1)
        {
            l2 = -1;
        }
        l = j1 + k3;
        i4 = l;
        if (l > 256)
        {
            i4 = 256;
        }
        j2 = 1;
        k2 = j1 - 1;
        l = j1 + 1;
        j1 = j2;
_L6:
        if (l >= i4 && k2 <= l2) goto _L4; else goto _L5
_L5:
        obj = i;
        j2 = j1 + 1;
        l4 = obj[j1];
        if (l >= i4)
        {
            break MISSING_BLOCK_LABEL_744;
        }
        obj = e;
        j1 = l + 1;
        obj = obj[l];
        obj[0] = obj[0] - ((obj[0] - i6) * l4) / 0x40000;
        obj[1] = obj[1] - ((obj[1] - j6) * l4) / 0x40000;
        obj[2] = obj[2] - ((obj[2] - k6) * l4) / 0x40000;
        l = j1;
_L8:
        if (k2 <= l2)
        {
            break MISSING_BLOCK_LABEL_1019;
        }
        obj = e;
        j1 = k2 - 1;
        ai1 = obj[k2];
        ai1[0] = ai1[0] - ((ai1[0] - i6) * l4) / 0x40000;
        ai1[1] = ai1[1] - ((ai1[1] - j6) * l4) / 0x40000;
        ai1[2] = ai1[2] - (l4 * (ai1[2] - k6)) / 0x40000;
        k2 = j1;
        j1 = j2;
          goto _L6
        exception;
        k2 = j1;
        j1 = j2;
          goto _L6
_L4:
        l = l1 + c1;
        if (l >= k5)
        {
            l -= c;
        }
        k1++;
        if (i1 == 0)
        {
            i1 = 1;
        }
        if (k1 % i1 == 0)
        {
            j3 -= j3 / a;
            i3 -= i3 / 30;
            l1 = i3 >> 6;
            j1 = l1;
            if (l1 <= 1)
            {
                j1 = 0;
            }
            for (l1 = 0; l1 < j1; l1++)
            {
                i[l1] = (((j1 * j1 - l1 * l1) * 256) / (j1 * j1)) * j3;
            }

            l1 = l;
            k3 = j1;
        } else
        {
            l1 = l;
        }
          goto _L7
_L2:
        return;
        exception;
        l = j1;
          goto _L8
        j1 = j2;
          goto _L6
    }

    public final void d()
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
