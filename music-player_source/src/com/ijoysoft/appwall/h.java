// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import android.graphics.Bitmap;

// Referenced classes of package com.ijoysoft.appwall:
//            d, g

public final class h
{

    final d a;
    private String b;
    private String c;
    private Bitmap d;
    private g e;
    private String f;

    public h(d d1)
    {
        a = d1;
        super();
    }

    static g a(h h1)
    {
        return h1.e;
    }

    static void a(h h1, Bitmap bitmap)
    {
        h1.d = bitmap;
    }

    static void a(h h1, g g)
    {
        h1.e = g;
    }

    static void a(h h1, String s)
    {
        h1.b = s;
    }

    static String b(h h1)
    {
        return h1.b;
    }

    static void b(h h1, String s)
    {
        h1.c = s;
    }

    static Bitmap c(h h1)
    {
        return h1.d;
    }

    static void c(h h1, String s)
    {
        h1.f = s;
    }

    static String d(h h1)
    {
        return h1.f;
    }

    public final boolean equals(Object obj)
    {
        obj = (h)obj;
        return b.equals(((h) (obj)).b);
    }
}
