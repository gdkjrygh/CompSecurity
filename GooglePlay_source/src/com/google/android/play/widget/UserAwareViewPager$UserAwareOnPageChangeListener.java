// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.widget;


// Referenced classes of package com.google.android.play.widget:
//            UserAwareViewPager

public static class viewPager extends android.support.v4.view.stener
{

    private final UserAwareViewPager viewPager;

    public final void onPageSelected(int i)
    {
        boolean flag;
        if (!viewPager.isSettingCurrentItem())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        onPageSelected(i, flag);
    }

    public void onPageSelected(int i, boolean flag)
    {
    }

    public (UserAwareViewPager userawareviewpager)
    {
        viewPager = userawareviewpager;
    }
}
