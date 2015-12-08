// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.support.v4.view.bq;

// Referenced classes of package android.support.v4.widget:
//            a, c, b

class d
    implements Runnable
{

    final a a;

    private d(a a1)
    {
        a = a1;
        super();
    }

    d(a a1, b b)
    {
        this(a1);
    }

    public void run()
    {
        if (!android.support.v4.widget.a.a(a))
        {
            return;
        }
        if (android.support.v4.widget.a.b(a))
        {
            android.support.v4.widget.a.a(a, false);
            android.support.v4.widget.a.c(a).a();
        }
        c c1 = android.support.v4.widget.a.c(a);
        if (c1.c() || !android.support.v4.widget.a.d(a))
        {
            android.support.v4.widget.a.b(a, false);
            return;
        }
        if (android.support.v4.widget.a.e(a))
        {
            android.support.v4.widget.a.c(a, false);
            android.support.v4.widget.a.f(a);
        }
        c1.d();
        int i = c1.g();
        int j = c1.h();
        a.a(i, j);
        bq.a(android.support.v4.widget.a.g(a), this);
    }
}
