// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.support.v4.app.h;
import android.support.v4.app.k;
import android.support.v4.view.ViewPager;
import android.view.View;
import p.ca.x;

// Referenced classes of package com.pandora.android.activity:
//            HomeTabsActivity, g

class a
    implements android.support.v4.app.ity._cls4
{

    final HomeTabsActivity a;

    public void a()
    {
        a.f((new StringBuilder()).append("onBackStackChanged, current count: ").append(HomeTabsActivity.f(a).e()).toString());
        if (HomeTabsActivity.f(a).e() <= 0)
        {
            HomeTabsActivity.g(a).setVisibility(8);
            com.pandora.android.activity.HomeTabsActivity.h(a).setVisibility(0);
            k k1 = HomeTabsActivity.f(a).a();
            android.support.v4.app.Fragment fragment = HomeTabsActivity.a(a).d();
            k1.c(fragment);
            k1.b();
            HomeTabsActivity.a(a, (x)fragment, false);
        } else
        {
            com.pandora.android.activity.HomeTabsActivity.h(a).setVisibility(8);
            HomeTabsActivity.g(a).setVisibility(0);
        }
        a.ae();
        a.af();
        a.invalidateOptionsMenu();
    }

    (HomeTabsActivity hometabsactivity)
    {
        a = hometabsactivity;
        super();
    }
}
