// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.b;

import java.util.List;

// Referenced classes of package com.google.android.gms.ads.b:
//            g

public abstract class i extends g
{

    private String d;
    private List e;
    private String f;
    private com.google.android.gms.ads.formats.a.a g;
    private String h;
    private String i;

    public i()
    {
    }

    public final void a(com.google.android.gms.ads.formats.a.a a1)
    {
        g = a1;
    }

    public final void a(String s)
    {
        d = s;
    }

    public final void a(List list)
    {
        e = list;
    }

    public final void b(String s)
    {
        f = s;
    }

    public final void c(String s)
    {
        h = s;
    }

    public final void d(String s)
    {
        i = s;
    }

    public final String f()
    {
        return d;
    }

    public final List g()
    {
        return e;
    }

    public final String h()
    {
        return f;
    }

    public final com.google.android.gms.ads.formats.a.a i()
    {
        return g;
    }

    public final String j()
    {
        return h;
    }

    public final String k()
    {
        return i;
    }
}
