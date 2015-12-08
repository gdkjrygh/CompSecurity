// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

// Referenced classes of package org.xbmc.kore.ui:
//            ArtistListFragment

public class 
    implements butterknife.ctor
{

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (ArtistListFragment)obj, obj1);
    }

    public void inject(butterknife.ctor ctor, ArtistListFragment artistlistfragment, Object obj)
    {
        artistlistfragment.artistsGridView = (GridView)ctor.idView((View)ctor.ew(obj, 0x7f0e006e, "field 'artistsGridView'"), 0x7f0e006e, "field 'artistsGridView'");
        artistlistfragment.swipeRefreshLayout = (SwipeRefreshLayout)ctor.eshLayout((View)ctor.ew(obj, 0x7f0e0086, "field 'swipeRefreshLayout'"), 0x7f0e0086, "field 'swipeRefreshLayout'");
        artistlistfragment.emptyView = (TextView)ctor.((View)ctor.ew(obj, 0x1020004, "field 'emptyView'"), 0x1020004, "field 'emptyView'");
    }

    public volatile void reset(Object obj)
    {
        reset((ArtistListFragment)obj);
    }

    public void reset(ArtistListFragment artistlistfragment)
    {
        artistlistfragment.artistsGridView = null;
        artistlistfragment.swipeRefreshLayout = null;
        artistlistfragment.emptyView = null;
    }

    public ()
    {
    }
}
