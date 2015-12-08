// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.util;

import java.io.PrintStream;

public class Base64
{

    private static char a[];
    private static byte b[];

    public Base64()
    {
    }

    private static byte[] a(String s)
    {
        int k = 0;
        s = s.toCharArray();
        int l = s.length;
        int j = (l / 4) * 3;
        int i = j;
        if (s[l - 1] == '=')
        {
            i = j - 1;
        }
        j = i;
        if (s[l - 2] == '=')
        {
            j = i - 1;
        }
        byte abyte0[] = new byte[j];
        i = 0;
        while (k < l) 
        {
            byte abyte1[] = b;
            int i1 = k + 1;
            byte byte2 = abyte1[s[k]];
            abyte1 = b;
            k = i1 + 1;
            byte byte3 = abyte1[s[i1]];
            abyte1 = b;
            i1 = k + 1;
            byte byte0 = abyte1[s[k]];
            byte byte1 = b[s[i1]];
            k = i + 1;
            abyte0[i] = (byte)(byte3 >>> 4 | byte2 << 2);
            if (k < j)
            {
                i = k + 1;
                abyte0[k] = (byte)(byte0 >>> 2 | byte3 << 4);
            } else
            {
                i = k;
            }
            if (i < j)
            {
                k = i + 1;
                abyte0[i] = (byte)(byte0 << 6 | byte1);
                i = k;
            }
            k = i1 + 1;
        }
        return abyte0;
    }

    public static void main(String args[])
    {
        String s = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure";
        if (args.length > 0)
        {
            s = args[0];
        }
        System.out.println(s);
        args = s.getBytes();
        int k1 = args.length;
        int l1 = (k1 * 4 + 2) / 3;
        char ac[] = new char[((k1 + 2) / 3) * 4];
        int j = 0;
        int i = 0;
        while (i < k1) 
        {
            int k = i + 1;
            int i2 = args[i];
            char c;
            int i1;
            int j1;
            if (k < k1)
            {
                i = args[k];
                int l = k + 1;
                k = i;
                i = l;
            } else
            {
                i1 = 0;
                i = k;
                k = i1;
            }
            if (i < k1)
            {
                i1 = i + 1;
                String s1 = args[i];
                i = i1;
                i1 = s1;
            } else
            {
                i1 = 0;
            }
            j1 = j + 1;
            ac[j] = a[i2 >>> 2];
            j = j1 + 1;
            ac[j1] = a[(i2 << 4 | k >> 4) & 0x3f];
            if (j < l1)
            {
                c = a[(k << 2 | i1 >>> 6) & 0x3f];
            } else
            {
                c = '=';
            }
            ac[j] = c;
            j++;
            if (j < l1)
            {
                c = a[i1 & 0x3f];
            } else
            {
                c = '=';
            }
            ac[j] = c;
            j++;
        }
        args = new String(ac);
        System.out.println(args);
        args = new String(a(args));
        System.out.println(args);
    }

    static 
    {
        a = new char[64];
        b = new byte[123];
        char c = 'A';
        byte byte0;
        byte byte1;
        for (byte0 = 0; c <= 'Z'; byte0 = byte1)
        {
            b[c] = byte0;
            char ac[] = a;
            byte1 = (byte)(byte0 + 1);
            ac[byte0] = c;
            c++;
        }

        for (char c1 = 'a'; c1 <= 'z';)
        {
            b[c1] = byte0;
            char ac1[] = a;
            byte byte2 = (byte)(byte0 + 1);
            ac1[byte0] = c1;
            c1++;
            byte0 = byte2;
        }

        for (char c2 = '0'; c2 <= '9';)
        {
            b[c2] = byte0;
            char ac2[] = a;
            byte byte3 = (byte)(byte0 + 1);
            ac2[byte0] = c2;
            c2++;
            byte0 = byte3;
        }

        b[43] = byte0;
        char ac3[] = a;
        byte byte4 = (byte)(byte0 + 1);
        ac3[byte0] = '+';
        b[47] = byte4;
        a[byte4] = '/';
        b[61] = 0;
    }
}
