// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.help;

import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package com.google.android.apps.translate.help:
//            f, TourActivity

class e
{

    public final ViewPager b;
    final TourActivity c;

    public e(TourActivity touractivity, View view)
    {
        c = touractivity;
        super();
        b = (ViewPager)view;
        a();
    }

    protected void a()
    {
        b.setAdapter(new f(c, c.c(), TourActivity.a(c).length));
        b.setOnPageChangeListener(c);
    }

    public int b()
    {
        return b.getCurrentItem();
    }

    public void c(int i)
    {
        b.setCurrentItem(i);
    }
}
