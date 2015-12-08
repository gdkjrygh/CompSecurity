// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.a;


public final class a extends Enum
{

    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;
    public static final a o;
    public static final a p;
    public static final a q;
    public static final a r;
    public static final a s;
    public static final a t;
    public static final a u;
    private static final a w[];
    private final int v;

    private a(String s1, int i1, int j1)
    {
        super(s1, i1);
        v = j1;
    }

    public static a valueOf(String s1)
    {
        return (a)Enum.valueOf(com/microsoft/a/a, s1);
    }

    public static a[] values()
    {
        return (a[])w.clone();
    }

    public final int a()
    {
        return v;
    }

    static 
    {
        a = new a("BT_STOP", 0, 0);
        b = new a("BT_STOP_BASE", 1, 1);
        c = new a("BT_BOOL", 2, 2);
        d = new a("BT_UINT8", 3, 3);
        e = new a("BT_UINT16", 4, 4);
        f = new a("BT_UINT32", 5, 5);
        g = new a("BT_UINT64", 6, 6);
        h = new a("BT_FLOAT", 7, 7);
        i = new a("BT_DOUBLE", 8, 8);
        j = new a("BT_STRING", 9, 9);
        k = new a("BT_STRUCT", 10, 10);
        l = new a("BT_LIST", 11, 11);
        m = new a("BT_SET", 12, 12);
        n = new a("BT_MAP", 13, 13);
        o = new a("BT_INT8", 14, 14);
        p = new a("BT_INT16", 15, 15);
        q = new a("BT_INT32", 16, 16);
        r = new a("BT_INT64", 17, 17);
        s = new a("BT_WSTRING", 18, 18);
        t = new a("BT_UNAVAILABLE", 19, 127);
        u = new a("__INVALID_ENUM_VALUE", 20, 128);
        w = (new a[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u
        });
    }
}
