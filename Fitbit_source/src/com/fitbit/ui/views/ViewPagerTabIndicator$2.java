// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.views;

import android.view.View;

// Referenced classes of package com.fitbit.ui.views:
//            ViewPagerTabIndicator

class a
    implements Runnable
{

    final View a;
    final ViewPagerTabIndicator b;

    public void run()
    {
        int i = a.getLeft();
        int j = (b.getWidth() - a.getWidth()) / 2;
        b.smoothScrollTo(i - j, 0);
        ViewPagerTabIndicator.a(b, null);
    }

    (ViewPagerTabIndicator viewpagertabindicator, View view)
    {
        b = viewpagertabindicator;
        a = view;
        super();
    }
}
