// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.util;


public class b
{

    private static char a[];
    private static byte b[];

    public b()
    {
    }

    public static String a(String s)
    {
        return new String(a(s.getBytes()));
    }

    public static byte[] a(char ac[])
    {
        int i = 0;
        int k = ac.length;
        if (k % 4 != 0)
        {
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        }
        for (; k > 0 && ac[k - 1] == '='; k--) { }
        int i1 = (k * 3) / 4;
        byte abyte0[] = new byte[i1];
        int j = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            int l = i + 1;
            char c2 = ac[i];
            i = l + 1;
            char c3 = ac[l];
            char c1;
            if (i < k)
            {
                l = ac[i];
                i++;
            } else
            {
                l = 65;
            }
            if (i < k)
            {
                c1 = ac[i];
                i++;
            } else
            {
                c1 = 'A';
            }
            if (c2 > '\177' || c3 > '\177' || l > '\177' || c1 > '\177')
            {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            byte byte0 = b[c2];
            c3 = b[c3];
            c2 = b[l];
            c1 = b[c1];
            if (byte0 < 0 || c3 < 0 || c2 < 0 || c1 < 0)
            {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            l = j + 1;
            abyte0[j] = (byte)(byte0 << 2 | c3 >>> 4);
            if (l < i1)
            {
                j = l + 1;
                abyte0[l] = (byte)((c3 & 0xf) << 4 | c2 >>> 2);
            } else
            {
                j = l;
            }
            if (j < i1)
            {
                l = j + 1;
                abyte0[j] = (byte)((c2 & 3) << 6 | c1);
                j = l;
            }
        } while (true);
        return abyte0;
    }

    public static char[] a(byte abyte0[])
    {
        return a(abyte0, abyte0.length);
    }

    public static char[] a(byte abyte0[], int i)
    {
        int i2 = (i * 4 + 2) / 3;
        char ac[] = new char[((i + 2) / 3) * 4];
        int k = 0;
        int j = 0;
        while (j < i) 
        {
            int l = j + 1;
            int j2 = abyte0[j] & 0xff;
            char c1;
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
                c1 = a[(l & 0xf) << 2 | j1 >>> 6];
            } else
            {
                c1 = '=';
            }
            ac[k] = c1;
            k++;
            if (k < i2)
            {
                c1 = a[j1 & 0x3f];
            } else
            {
                c1 = '=';
            }
            ac[k] = c1;
            k++;
        }
        return ac;
    }

    public static String b(String s)
    {
        return new String(c(s));
    }

    public static byte[] c(String s)
    {
        return a(s.toCharArray());
    }

    static 
    {
        boolean flag = false;
        a = new char[64];
        char c1 = 'A';
        int i;
        for (i = 0; c1 <= 'Z'; i++)
        {
            a[i] = c1;
            c1++;
        }

        for (char c2 = 'a'; c2 <= 'z';)
        {
            a[i] = c2;
            c2++;
            i++;
        }

        for (char c3 = '0'; c3 <= '9';)
        {
            a[i] = c3;
            c3++;
            i++;
        }

        char ac[] = a;
        int j = i + 1;
        ac[i] = '+';
        a[j] = '/';
        b = new byte[128];
        i = 0;
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
