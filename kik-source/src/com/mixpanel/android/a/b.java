// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.a;


public final class b
{

    private static char a[];
    private static byte b[];

    public static String a(String s)
    {
        s = s.getBytes();
        return new String(a(((byte []) (s)), s.length));
    }

    private static char[] a(byte abyte0[], int i)
    {
        int i2 = (i * 4 + 2) / 3;
        char ac[] = new char[((i + 2) / 3) * 4];
        int k = 0;
        int j = 0;
        while (j < i) 
        {
            int l = j + 1;
            int j2 = abyte0[j] & 0xff;
            char c;
            int j1;
            int l1;
            if (l < i)
            {
                j = abyte0[l] & 0xff;
                int i1 = l + 1;
                l = j;
                j = i1;
            } else
            {
                j1 = 0;
                j = l;
                l = j1;
            }
            if (j < i)
            {
                j1 = j + 1;
                int k1 = abyte0[j] & 0xff;
                j = j1;
                j1 = k1;
            } else
            {
                j1 = 0;
            }
            l1 = k + 1;
            ac[k] = a[j2 >>> 2];
            k = l1 + 1;
            ac[l1] = a[(j2 & 3) << 4 | l >>> 4];
            if (k < i2)
            {
                c = a[(l & 0xf) << 2 | j1 >>> 6];
            } else
            {
                c = '=';
            }
            ac[k] = c;
            k++;
            if (k < i2)
            {
                c = a[j1 & 0x3f];
            } else
            {
                c = '=';
            }
            ac[k] = c;
            k++;
        }
        return ac;
    }

    static 
    {
        boolean flag = false;
        a = new char[64];
        char c = 'A';
        int i;
        for (i = 0; c <= 'Z'; i++)
        {
            a[i] = c;
            c++;
        }

        for (char c1 = 'a'; c1 <= 'z';)
        {
            a[i] = c1;
            c1++;
            i++;
        }

        for (char c2 = '0'; c2 <= '9';)
        {
            a[i] = c2;
            c2++;
            i++;
        }

        a[i] = '+';
        a[i + 1] = '/';
        b = new byte[128];
        i = 0;
        int j;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i >= b.length)
            {
                break;
            }
            b[i] = -1;
            i++;
        } while (true);
        for (; j < 64; j++)
        {
            b[a[j]] = (byte)j;
        }

    }
}
