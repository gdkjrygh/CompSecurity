// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;

// Referenced classes of package com.microsoft.advertising.android:
//            b, AdWebView, g, aw

public abstract class AbstractWebBasedAdView extends b
{

    protected AdWebView e;

    protected AbstractWebBasedAdView(Context context, g g, aw aw)
    {
        super(context, g, aw);
        e = null;
    }

    public final volatile void a(String s1)
    {
        super.a(s1);
    }

    public final volatile void a(String s1, int i1)
    {
        super.a(s1, i1);
    }

    public volatile boolean a()
    {
        return super.a();
    }

    public final volatile boolean a(boolean flag)
    {
        return super.a(flag);
    }

    public final volatile void b()
    {
        super.b();
    }

    public volatile void c()
    {
        super.c();
    }

    public volatile boolean i()
    {
        return super.i();
    }

    public final void j()
    {
        if (e != null)
        {
            e.s();
        }
    }

    public final volatile void k()
    {
        super.k();
    }

    public final volatile long l()
    {
        return super.l();
    }

    public final volatile boolean m()
    {
        return super.m();
    }

    public final volatile b.b o()
    {
        return super.o();
    }

    public final void s()
    {
        e.l();
    }

    public void u()
    {
        if (e != null)
        {
            e.invalidate();
        }
    }
}
