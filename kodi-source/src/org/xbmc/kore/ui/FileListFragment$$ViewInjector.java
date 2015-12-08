// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.astuetz.PagerSlidingTabStrip;

// Referenced classes of package org.xbmc.kore.ui:
//            FileListFragment

public class 
    implements butterknife.ctor
{

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (FileListFragment)obj, obj1);
    }

    public void inject(butterknife.ctor ctor, FileListFragment filelistfragment, Object obj)
    {
        filelistfragment.pagerTabStrip = (PagerSlidingTabStrip)ctor.trip((View)ctor.View(obj, 0x7f0e008d, "field 'pagerTabStrip'"), 0x7f0e008d, "field 'pagerTabStrip'");
        filelistfragment.viewPager = (ViewPager)ctor.((View)ctor.View(obj, 0x7f0e0057, "field 'viewPager'"), 0x7f0e0057, "field 'viewPager'");
    }

    public volatile void reset(Object obj)
    {
        reset((FileListFragment)obj);
    }

    public void reset(FileListFragment filelistfragment)
    {
        filelistfragment.pagerTabStrip = null;
        filelistfragment.viewPager = null;
    }

    public ()
    {
    }
}
