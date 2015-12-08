// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.support.v4.view.bp;

// Referenced classes of package android.support.v4.widget:
//            a, b

final class c
    implements Runnable
{

    final a a;

    private c(a a1)
    {
        a = a1;
        super();
    }

    c(a a1, byte byte0)
    {
        this(a1);
    }

    public final void run()
    {
        if (!android.support.v4.widget.a.a(a))
        {
            return;
        }
        if (android.support.v4.widget.a.b(a))
        {
            android.support.v4.widget.a.c(a);
            android.support.v4.widget.a.d(a).c();
        }
        b b1 = android.support.v4.widget.a.d(a);
        if (b1.e() || !android.support.v4.widget.a.e(a))
        {
            android.support.v4.widget.a.f(a);
            return;
        }
        if (android.support.v4.widget.a.g(a))
        {
            android.support.v4.widget.a.h(a);
            android.support.v4.widget.a.i(a);
        }
        b1.f();
        int i = b1.i();
        a.a(i);
        bp.a(android.support.v4.widget.a.j(a), this);
    }
}
