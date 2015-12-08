// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.b;


public final class g extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    public static final g h;
    public static final g i;
    public static final g j;
    public static final g k;
    public static final g l;
    public static final g m;
    public static final g n;
    public static final g o;
    private static final g q[];
    private String p;

    private g(String s, int i1, String s1)
    {
        super(s, i1);
        p = s1;
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/roidapp/photogrid/b/g, s);
    }

    public static g[] values()
    {
        return (g[])q.clone();
    }

    final String a()
    {
        return p;
    }

    static 
    {
        a = new g("Single", 0, "Single");
        b = new g("Grid", 1, "Grid");
        c = new g("Free", 2, "Free");
        d = new g("Video", 3, "Video");
        e = new g("Template", 4, "Template");
        f = new g("Filmstrip", 5, "Filmstrip");
        g = new g("HomeCamera", 6, "HomeCamera");
        h = new g("HomeGallery", 7, "HomeGallery");
        i = new g("HomeFolders", 8, "HomeFolders");
        j = new g("SysInstaSize", 9, "SysInstaSize");
        k = new g("SysFree", 10, "SysFree");
        l = new g("SysGrid", 11, "SysGrid");
        m = new g("SysFilter", 12, "SysFilter");
        n = new g("SysVideo", 13, "SysVideo");
        o = new g("Crash", 14, "Crash");
        q = (new g[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o
        });
    }
}
