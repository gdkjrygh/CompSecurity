// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.astuetz.PagerSlidingTabStrip;

// Referenced classes of package org.xbmc.kore.ui:
//            MusicListFragment

public class 
    implements butterknife.ctor
{

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (MusicListFragment)obj, obj1);
    }

    public void inject(butterknife.ctor ctor, MusicListFragment musiclistfragment, Object obj)
    {
        musiclistfragment.pagerTabStrip = (PagerSlidingTabStrip)ctor.trip((View)ctor.iew(obj, 0x7f0e008d, "field 'pagerTabStrip'"), 0x7f0e008d, "field 'pagerTabStrip'");
        musiclistfragment.viewPager = (ViewPager)ctor.((View)ctor.iew(obj, 0x7f0e0057, "field 'viewPager'"), 0x7f0e0057, "field 'viewPager'");
    }

    public volatile void reset(Object obj)
    {
        reset((MusicListFragment)obj);
    }

    public void reset(MusicListFragment musiclistfragment)
    {
        musiclistfragment.pagerTabStrip = null;
        musiclistfragment.viewPager = null;
    }

    public ()
    {
    }
}
