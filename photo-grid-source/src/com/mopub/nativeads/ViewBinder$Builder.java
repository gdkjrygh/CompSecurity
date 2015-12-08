// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.mopub.nativeads:
//            ViewBinder

public final class g
{

    private final int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private Map g;

    static int a(g g1)
    {
        return g1.a;
    }

    static int b(a a1)
    {
        return a1.b;
    }

    static int c(b b1)
    {
        return b1.c;
    }

    static int d(c c1)
    {
        return c1.d;
    }

    static int e(d d1)
    {
        return d1.e;
    }

    static int f(e e1)
    {
        return e1.f;
    }

    static Map g(f f1)
    {
        return f1.g;
    }

    public final g addExtra(String s, int i)
    {
        g.put(s, Integer.valueOf(i));
        return this;
    }

    public final g addExtras(Map map)
    {
        g = new HashMap(map);
        return this;
    }

    public final ViewBinder build()
    {
        return new ViewBinder(this, (byte)0);
    }

    public final g callToActionId(int i)
    {
        d = i;
        return this;
    }

    public final d iconImageId(int i)
    {
        f = i;
        return this;
    }

    public final f mainImageId(int i)
    {
        e = i;
        return this;
    }

    public final e textId(int i)
    {
        c = i;
        return this;
    }

    public final c titleId(int i)
    {
        b = i;
        return this;
    }

    public (int i)
    {
        g = Collections.emptyMap();
        a = i;
        g = new HashMap();
    }
}
