// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.titlebar;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.facebook.widget.titlebar:
//            e

public class d
{

    private final int a;
    private final Drawable b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final String f;
    private final int g;
    private final String h;
    private final int i;
    private final String j;
    private boolean k;

    public d(e e1)
    {
        a = e1.a();
        b = e1.b();
        c = e1.c();
        d = e1.d();
        e = e1.e();
        f = e1.f();
        g = e1.g();
        h = e1.h();
        i = e1.i();
        j = e1.j();
    }

    public static e newBuilder()
    {
        return new e();
    }

    public int a()
    {
        return a;
    }

    public void a(boolean flag)
    {
        k = flag;
    }

    public Drawable b()
    {
        return b;
    }

    public boolean c()
    {
        return c;
    }

    public boolean d()
    {
        return d;
    }

    public boolean e()
    {
        return k;
    }

    public boolean f()
    {
        return e;
    }

    public String g()
    {
        return f;
    }

    public String h()
    {
        return h;
    }

    public int i()
    {
        return i;
    }
}
