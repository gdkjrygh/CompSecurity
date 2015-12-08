// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

// Referenced classes of package org.xbmc.kore.ui:
//            AddonListFragment

public class 
    implements butterknife.ctor
{

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (AddonListFragment)obj, obj1);
    }

    public void inject(butterknife.ctor ctor, AddonListFragment addonlistfragment, Object obj)
    {
        addonlistfragment.addonsGridView = (GridView)ctor.dView((View)ctor.iew(obj, 0x7f0e006e, "field 'addonsGridView'"), 0x7f0e006e, "field 'addonsGridView'");
        addonlistfragment.swipeRefreshLayout = (SwipeRefreshLayout)ctor.((View)ctor.iew(obj, 0x7f0e0086, "field 'swipeRefreshLayout'"), 0x7f0e0086, "field 'swipeRefreshLayout'");
        addonlistfragment.emptyView = (TextView)ctor.((View)ctor.iew(obj, 0x1020004, "field 'emptyView'"), 0x1020004, "field 'emptyView'");
    }

    public volatile void reset(Object obj)
    {
        reset((AddonListFragment)obj);
    }

    public void reset(AddonListFragment addonlistfragment)
    {
        addonlistfragment.addonsGridView = null;
        addonlistfragment.swipeRefreshLayout = null;
        addonlistfragment.emptyView = null;
    }

    public ()
    {
    }
}
