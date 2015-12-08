// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


// Referenced classes of package com.microsoft.advertising.android:
//            DefaultAdFactory, af, DefaultAdViewFactory, al, 
//            av, bx, bi, AdViewFactory, 
//            IAdFactory

final class ag
{

    private static final ag a = new ag();
    private al b;
    private al c;
    private al d;
    private volatile bx e;
    private bi f;
    private AdViewFactory g;

    ag()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
    }

    public static ag a()
    {
        return a;
    }

    public static IAdFactory b()
    {
        return DefaultAdFactory.get();
    }

    public final bi a(String s)
    {
        if (f != null && (af.a() || s != null && s.startsWith("AdSdkLocal?")))
        {
            return f;
        } else
        {
            return bi.a.a();
        }
    }

    public final AdViewFactory c()
    {
        if (af.a() && g != null)
        {
            return g;
        } else
        {
            return DefaultAdViewFactory.get();
        }
    }

    public final al d()
    {
        if (af.a() && b != null)
        {
            return b;
        } else
        {
            return al.a();
        }
    }

    public final al e()
    {
        if (af.a())
        {
            if (f != null)
            {
                av.a("Overrides", "using override manager image getter");
            } else
            if (c != null)
            {
                return c;
            }
        }
        av.a("Overrides", "using normal image getter");
        return al.a();
    }

    public final al f()
    {
        if (af.a() && d != null)
        {
            return d;
        } else
        {
            return al.a();
        }
    }

    public final bx g()
    {
        if (af.a() && e != null)
        {
            return e;
        } else
        {
            return null;
        }
    }

}
