// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.b;

import android.net.Uri;
import com.facebook.ui.images.base.b;
import com.facebook.ui.images.cache.d;
import com.facebook.ui.images.cache.e;
import com.facebook.ui.images.d.h;

// Referenced classes of package com.facebook.ui.images.b:
//            m, n

public class o
{

    private final Uri a;
    private b b;
    private h c;
    private e d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;

    private o(Uri uri)
    {
        d = d.a;
        a = uri;
    }

    o(Uri uri, n n)
    {
        this(uri);
    }

    private o(m m1)
    {
        d = d.a;
        a = m1.a();
        b = m1.b();
        c = m1.c();
        d = m1.d();
        e = m1.e();
        f = m1.f();
        g = m1.g();
        h = m1.h();
    }

    o(m m1, n n)
    {
        this(m1);
    }

    static Uri a(o o1)
    {
        return o1.a;
    }

    static e b(o o1)
    {
        return o1.d;
    }

    static b c(o o1)
    {
        return o1.b;
    }

    static h d(o o1)
    {
        return o1.c;
    }

    static boolean e(o o1)
    {
        return o1.e;
    }

    static boolean f(o o1)
    {
        return o1.f;
    }

    static boolean g(o o1)
    {
        return o1.g;
    }

    static boolean h(o o1)
    {
        return o1.h;
    }

    public m a()
    {
        return new m(this, null);
    }

    public o a(b b1)
    {
        b = b1;
        return this;
    }

    public o a(e e1)
    {
        d = e1;
        return this;
    }

    public o a(h h1)
    {
        c = h1;
        return this;
    }

    public o a(boolean flag)
    {
        e = flag;
        return this;
    }
}
