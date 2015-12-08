// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package me.lyft.android.ui.driver:
//            ViewPagerTabLayout

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (ViewPagerTabLayout)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, ViewPagerTabLayout viewpagertablayout, Object obj)
    {
        viewpagertablayout.tabButtonsContainer = (ViewGroup)viewinjector.tabButtonsContainer((View)viewinjector.tabButtonsContainer(obj, 0x7f0d01f0, "field 'tabButtonsContainer'"), 0x7f0d01f0, "field 'tabButtonsContainer'");
        viewpagertablayout.selectedTabIndicator = (View)viewinjector.selectedTabIndicator(obj, 0x7f0d01f3, "field 'selectedTabIndicator'");
    }

    public volatile void reset(Object obj)
    {
        reset((ViewPagerTabLayout)obj);
    }

    public void reset(ViewPagerTabLayout viewpagertablayout)
    {
        viewpagertablayout.tabButtonsContainer = null;
        viewpagertablayout.selectedTabIndicator = null;
    }

    public ()
    {
    }
}
