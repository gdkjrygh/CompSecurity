// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ap;


public final class g
{

    public static int a(String s, byte abyte0[], int i)
    {
        int j1 = s.length();
        int j = 0;
        int k = i;
        while (j < j1) 
        {
            i = s.charAt(j);
            int i1 = i;
            int l = j;
            if (i >= 55296)
            {
                i1 = i;
                l = j;
                if (i <= 57343)
                {
                    i1 = i;
                    l = j;
                    if (j + 1 < j1)
                    {
                        char c = s.charAt(j + 1);
                        i1 = i;
                        l = j;
                        if ((c & 0xfc00 ^ i & 0xfc00) == 1024)
                        {
                            l = j + 1;
                            if ((c & 0xfc00) == 55296)
                            {
                                j = i;
                                i = c;
                            } else
                            {
                                j = c;
                            }
                            i1 = 0x10000 + ((i & 0x3ff) << 10 | j & 0x3ff);
                        }
                    }
                }
            }
            if (i1 <= 127)
            {
                if (abyte0 != null)
                {
                    abyte0[k] = (byte)i1;
                }
                i = k + 1;
            } else
            if (i1 <= 2047)
            {
                if (abyte0 != null)
                {
                    abyte0[k] = (byte)(i1 >> 6 | 0xc0);
                    abyte0[k + 1] = (byte)(i1 & 0x3f | 0x80);
                }
                i = k + 2;
            } else
            if (i1 <= 65535)
            {
                if (abyte0 != null)
                {
                    abyte0[k] = (byte)(i1 >> 12 | 0xe0);
                    abyte0[k + 1] = (byte)(i1 >> 6 & 0x3f | 0x80);
                    abyte0[k + 2] = (byte)(i1 & 0x3f | 0x80);
                }
                i = k + 3;
            } else
            {
                if (abyte0 != null)
                {
                    abyte0[k] = (byte)(i1 >> 18 | 0xf0);
                    abyte0[k + 1] = (byte)(i1 >> 12 & 0x3f | 0x80);
                    abyte0[k + 2] = (byte)(i1 >> 6 & 0x3f | 0x80);
                    abyte0[k + 3] = (byte)(i1 & 0x3f | 0x80);
                }
                i = k + 4;
            }
            j = l + 1;
            k = i;
        }
        return k;
    }

    public static String a(byte abyte0[], int i)
    {
        StringBuilder stringbuilder = new StringBuilder(i + 0);
        for (int j = 0; j < i;)
        {
            int k = j + 1;
            int j1 = abyte0[j] & 0xff;
            if (j1 <= 127)
            {
                stringbuilder.append((char)j1);
                j = k;
            } else
            if (j1 >= 245)
            {
                stringbuilder.append((char)j1);
                j = k;
            } else
            {
                int i1 = 31;
                int l = 1;
                for (j = 224; j1 >= j; j = j >> 1 | 0x80)
                {
                    i1 >>= 1;
                    l++;
                }

                j1 = i1 & j1;
                i1 = 0;
                j = k;
                k = j1;
                while (i1 < l) 
                {
                    int k1 = k << 6;
                    if (j < i)
                    {
                        k = j + 1;
                        j = k1 | abyte0[j] & 0x3f;
                    } else
                    {
                        k = j;
                        j = k1;
                    }
                    k1 = i1 + 1;
                    i1 = k;
                    k = j;
                    j = i1;
                    i1 = k1;
                }
                if (k >= 55296 && k <= 57343)
                {
                    throw new IllegalArgumentException("Invalid UTF8");
                }
                if (k <= 65535)
                {
                    stringbuilder.append((char)k);
                } else
                {
                    k -= 0x10000;
                    stringbuilder.append((char)(k >> 10 | 0xd800));
                    stringbuilder.append((char)(k & 0x3ff | 0xdc00));
                }
            }
        }

        return stringbuilder.toString();
    }

    public static byte[] a(String s)
    {
        byte abyte0[] = new byte[a(s, null, 0)];
        a(s, abyte0, 0);
        return abyte0;
    }
}
