// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.support.v4.view.ViewPager;
import android.view.ViewTreeObserver;

// Referenced classes of package com.qihoo.security.widget:
//            TabPageIndicator

class a
    implements android.view.GlobalLayoutListener
{

    final TabPageIndicator a;

    public void onGlobalLayout()
    {
        a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        TabPageIndicator.a(a, TabPageIndicator.a(a).getCurrentItem());
        TabPageIndicator.a(a, TabPageIndicator.b(a), 0);
    }

    istener(TabPageIndicator tabpageindicator)
    {
        a = tabpageindicator;
        super();
    }
}
