// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.help;

import android.support.v4.view.ViewPager;
import android.support.v4.view.de;
import android.view.View;

// Referenced classes of package com.google.android.apps.translate.help:
//            e, TourActivity, c

final class d extends e
    implements de
{

    final TourActivity a;

    public d(TourActivity touractivity, View view)
    {
        a = touractivity;
        super(touractivity, view);
    }

    private int d(int i)
    {
        return TourActivity.a(a).length - i - 1;
    }

    protected final void a()
    {
        b.setAdapter(new c(a, a.c(), TourActivity.a(a).length));
        b.setOnPageChangeListener(this);
    }

    public final void a(int i)
    {
        a.a(d(i));
    }

    public final void a(int i, float f)
    {
        if (f == 0.0F)
        {
            d(i);
            return;
        } else
        {
            d(i + 1);
            return;
        }
    }

    public final int b()
    {
        return d(super.b());
    }

    public final void b(int i)
    {
    }

    public final void c(int i)
    {
        super.c(d(i));
    }
}
