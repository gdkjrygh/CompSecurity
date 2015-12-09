// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import java.util.Arrays;

public final class b
{

    static final int a[];
    static final int b[];
    static final int c[];
    static final int d[];
    static final int e[];
    static final int f[];
    static final int g[];
    private static final char h[];
    private static final byte i[];

    private b()
    {
    }

    public static int a(int j)
    {
        if (j > 127)
        {
            return -1;
        } else
        {
            return g[j];
        }
    }

    public static void a(StringBuilder stringbuilder, String s)
    {
        int ai[] = f;
        int k = ai.length;
        int j = 0;
        int l = s.length();
        while (j < l) 
        {
            char c1 = s.charAt(j);
            if (c1 >= k || ai[c1] == 0)
            {
                stringbuilder.append(c1);
            } else
            {
                stringbuilder.append('\\');
                int i1 = ai[c1];
                if (i1 < 0)
                {
                    stringbuilder.append('u');
                    stringbuilder.append('0');
                    stringbuilder.append('0');
                    stringbuilder.append(h[c1 >> 4]);
                    stringbuilder.append(h[c1 & 0xf]);
                } else
                {
                    stringbuilder.append((char)i1);
                }
            }
            j++;
        }
    }

    public static int[] a()
    {
        return a;
    }

    public static int[] b()
    {
        return b;
    }

    public static int[] c()
    {
        return c;
    }

    public static int[] d()
    {
        return d;
    }

    public static int[] e()
    {
        return e;
    }

    public static int[] f()
    {
        return f;
    }

    public static char[] g()
    {
        return (char[])(char[])h.clone();
    }

    public static byte[] h()
    {
        return (byte[])(byte[])i.clone();
    }

    static 
    {
        h = "0123456789ABCDEF".toCharArray();
        int l1 = h.length;
        i = new byte[l1];
        for (int j = 0; j < l1; j++)
        {
            i[j] = (byte)h[j];
        }

        int ai[] = new int[256];
        for (int k = 0; k < 32; k++)
        {
            ai[k] = -1;
        }

        ai[34] = 1;
        ai[92] = 1;
        a = ai;
        ai = new int[a.length];
        System.arraycopy(a, 0, ai, 0, a.length);
        l1 = 128;
        while (l1 < 256) 
        {
            byte byte0;
            if ((l1 & 0xe0) == 192)
            {
                byte0 = 2;
            } else
            if ((l1 & 0xf0) == 224)
            {
                byte0 = 3;
            } else
            if ((l1 & 0xf8) == 240)
            {
                byte0 = 4;
            } else
            {
                byte0 = -1;
            }
            ai[l1] = byte0;
            l1++;
        }
        b = ai;
        ai = new int[256];
        Arrays.fill(ai, -1);
        for (int l = 33; l < 256; l++)
        {
            if (Character.isJavaIdentifierPart((char)l))
            {
                ai[l] = 0;
            }
        }

        ai[64] = 0;
        ai[35] = 0;
        ai[42] = 0;
        ai[45] = 0;
        ai[43] = 0;
        c = ai;
        ai = new int[256];
        System.arraycopy(c, 0, ai, 0, c.length);
        Arrays.fill(ai, 128, 128, 0);
        d = ai;
        e = new int[256];
        System.arraycopy(b, 128, e, 128, 128);
        Arrays.fill(e, 0, 32, -1);
        e[9] = 0;
        e[10] = 10;
        e[13] = 13;
        e[42] = 42;
        ai = new int[128];
        for (int i1 = 0; i1 < 32; i1++)
        {
            ai[i1] = -1;
        }

        ai[34] = 34;
        ai[92] = 92;
        ai[8] = 98;
        ai[9] = 116;
        ai[12] = 102;
        ai[10] = 110;
        ai[13] = 114;
        f = ai;
        g = new int[128];
        Arrays.fill(g, -1);
        for (int j1 = 0; j1 < 10; j1++)
        {
            g[j1 + 48] = j1;
        }

        for (int k1 = 0; k1 < 6; k1++)
        {
            g[k1 + 97] = k1 + 10;
            g[k1 + 65] = k1 + 10;
        }

    }
}
