// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.inmobi.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.inmobi.ads:
//            b

public static final class List
{

    private int a;
    private int b;
    private int c;
    private int d;
    private String e;
    private int f;
    private int g;
    private int h;
    private long i;
    private ArrayList j;

    static int a(List list, int k)
    {
        list.a = k;
        return k;
    }

    static long a(a a1, long l)
    {
        a1.i = l;
        return l;
    }

    static String a(i k, String s)
    {
        k.e = s;
        return s;
    }

    static ArrayList a(e e1)
    {
        return e1.j;
    }

    static int b(j j1, int k)
    {
        j1.c = k;
        return k;
    }

    static String b(c c1)
    {
        return c1.e;
    }

    static int c(e e1, int k)
    {
        e1.b = k;
        return k;
    }

    static int d(b b1, int k)
    {
        b1.d = k;
        return k;
    }

    static int e(d d1, int k)
    {
        d1.g = k;
        return k;
    }

    static int f(g g1, int k)
    {
        g1.h = k;
        return k;
    }

    static int g(h h1, int k)
    {
        h1.f = k;
        return k;
    }

    public int a()
    {
        return b;
    }

    public int b()
    {
        return c;
    }

    public int c()
    {
        return d;
    }

    public int d()
    {
        return f;
    }

    public int e()
    {
        return g;
    }

    public int f()
    {
        return h;
    }

    public long g()
    {
        return i;
    }

    public ArrayList h()
    {
        return j;
    }

    public int i()
    {
        return a;
    }

    public n()
    {
        a = 60;
        b = 320;
        c = 480;
        d = 100;
        e = "#00000000";
        f = Color.parseColor("#00000000");
        g = 5;
        h = 20;
        i = 0x500000L;
        j = new ArrayList(Arrays.asList(new String[] {
            "video/mp4"
        }));
    }
}
