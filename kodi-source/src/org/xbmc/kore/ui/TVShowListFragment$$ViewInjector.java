// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

// Referenced classes of package org.xbmc.kore.ui:
//            TVShowListFragment

public class 
    implements butterknife.ctor
{

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (TVShowListFragment)obj, obj1);
    }

    public void inject(butterknife.ctor ctor, TVShowListFragment tvshowlistfragment, Object obj)
    {
        tvshowlistfragment.tvshowsGridView = (GridView)ctor.idView((View)ctor.ew(obj, 0x7f0e006e, "field 'tvshowsGridView'"), 0x7f0e006e, "field 'tvshowsGridView'");
        tvshowlistfragment.swipeRefreshLayout = (SwipeRefreshLayout)ctor.eshLayout((View)ctor.ew(obj, 0x7f0e0086, "field 'swipeRefreshLayout'"), 0x7f0e0086, "field 'swipeRefreshLayout'");
        tvshowlistfragment.emptyView = (TextView)ctor.((View)ctor.ew(obj, 0x1020004, "field 'emptyView'"), 0x1020004, "field 'emptyView'");
    }

    public volatile void reset(Object obj)
    {
        reset((TVShowListFragment)obj);
    }

    public void reset(TVShowListFragment tvshowlistfragment)
    {
        tvshowlistfragment.tvshowsGridView = null;
        tvshowlistfragment.swipeRefreshLayout = null;
        tvshowlistfragment.emptyView = null;
    }

    public ()
    {
    }
}
