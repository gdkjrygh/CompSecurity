// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package com.qihoo.security.widget:
//            TabPageIndicator

class a
    implements android.view.r
{

    final int a;
    final TabPageIndicator b;

    public void onClick(View view)
    {
        if (TabPageIndicator.c(b))
        {
            TabPageIndicator.a(b).a(a, true);
        } else
        {
            TabPageIndicator.a(b).a(a, false);
        }
        if (TabPageIndicator.d(b) != null)
        {
            TabPageIndicator.d(b).a(a, view);
        }
    }

    (TabPageIndicator tabpageindicator, int i)
    {
        b = tabpageindicator;
        a = i;
        super();
    }
}
