// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import com.tinder.adapters.ActivityMainPagerAdapter;
import com.tinder.views.SkippableViewPager;

// Referenced classes of package com.tinder.activities:
//            ActivityMain

final class a
    implements Runnable
{

    final ActivityMain a;

    public final void run()
    {
        ActivityMain.e(a).setCurrentItem(ActivityMain.c(a).getCount() - 1);
    }

    Adapter(ActivityMain activitymain)
    {
        a = activitymain;
        super();
    }
}
