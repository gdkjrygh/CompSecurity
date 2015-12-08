// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

// Referenced classes of package org.xbmc.kore.ui:
//            MediaFileListFragment

public class 
    implements butterknife.ctor
{

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (MediaFileListFragment)obj, obj1);
    }

    public void inject(butterknife.ctor ctor, MediaFileListFragment mediafilelistfragment, Object obj)
    {
        mediafilelistfragment.folderGridView = (GridView)ctor.dView((View)ctor.dView(obj, 0x7f0e006e, "field 'folderGridView'"), 0x7f0e006e, "field 'folderGridView'");
        mediafilelistfragment.swipeRefreshLayout = (SwipeRefreshLayout)ctor.eshLayout((View)ctor.eshLayout(obj, 0x7f0e0086, "field 'swipeRefreshLayout'"), 0x7f0e0086, "field 'swipeRefreshLayout'");
        mediafilelistfragment.emptyView = (TextView)ctor.((View)ctor.(obj, 0x1020004, "field 'emptyView'"), 0x1020004, "field 'emptyView'");
    }

    public volatile void reset(Object obj)
    {
        reset((MediaFileListFragment)obj);
    }

    public void reset(MediaFileListFragment mediafilelistfragment)
    {
        mediafilelistfragment.folderGridView = null;
        mediafilelistfragment.swipeRefreshLayout = null;
        mediafilelistfragment.emptyView = null;
    }

    public ()
    {
    }
}
