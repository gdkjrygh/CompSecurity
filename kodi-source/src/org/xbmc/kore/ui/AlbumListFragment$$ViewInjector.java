// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

// Referenced classes of package org.xbmc.kore.ui:
//            AlbumListFragment

public class 
    implements butterknife.ctor
{

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (AlbumListFragment)obj, obj1);
    }

    public void inject(butterknife.ctor ctor, AlbumListFragment albumlistfragment, Object obj)
    {
        albumlistfragment.albumsGridView = (GridView)ctor.dView((View)ctor.iew(obj, 0x7f0e006e, "field 'albumsGridView'"), 0x7f0e006e, "field 'albumsGridView'");
        albumlistfragment.swipeRefreshLayout = (SwipeRefreshLayout)ctor.((View)ctor.iew(obj, 0x7f0e0086, "field 'swipeRefreshLayout'"), 0x7f0e0086, "field 'swipeRefreshLayout'");
        albumlistfragment.emptyView = (TextView)ctor.((View)ctor.iew(obj, 0x1020004, "field 'emptyView'"), 0x1020004, "field 'emptyView'");
    }

    public volatile void reset(Object obj)
    {
        reset((AlbumListFragment)obj);
    }

    public void reset(AlbumListFragment albumlistfragment)
    {
        albumlistfragment.albumsGridView = null;
        albumlistfragment.swipeRefreshLayout = null;
        albumlistfragment.emptyView = null;
    }

    public ()
    {
    }
}
