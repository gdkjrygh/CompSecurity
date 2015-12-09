// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.views;

import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package com.fitbit.ui.views:
//            ViewPagerTabIndicator

class a
    implements android.view.ator._cls1
{

    final ViewPagerTabIndicator a;

    public void onClick(View view)
    {
        view = (a)view;
        ViewPagerTabIndicator.a(a).setCurrentItem(view.a());
    }

    (ViewPagerTabIndicator viewpagertabindicator)
    {
        a = viewpagertabindicator;
        super();
    }
}
