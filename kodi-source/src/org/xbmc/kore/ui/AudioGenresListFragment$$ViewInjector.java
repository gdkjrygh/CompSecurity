// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

// Referenced classes of package org.xbmc.kore.ui:
//            AudioGenresListFragment

public class 
    implements butterknife.ctor
{

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (AudioGenresListFragment)obj, obj1);
    }

    public void inject(butterknife.ctor ctor, AudioGenresListFragment audiogenreslistfragment, Object obj)
    {
        audiogenreslistfragment.audioGenresGridView = (GridView)ctor.esGridView((View)ctor.esGridView(obj, 0x7f0e006e, "field 'audioGenresGridView'"), 0x7f0e006e, "field 'audioGenresGridView'");
        audiogenreslistfragment.swipeRefreshLayout = (SwipeRefreshLayout)ctor.eshLayout((View)ctor.eshLayout(obj, 0x7f0e0086, "field 'swipeRefreshLayout'"), 0x7f0e0086, "field 'swipeRefreshLayout'");
        audiogenreslistfragment.emptyView = (TextView)ctor.((View)ctor.(obj, 0x1020004, "field 'emptyView'"), 0x1020004, "field 'emptyView'");
    }

    public volatile void reset(Object obj)
    {
        reset((AudioGenresListFragment)obj);
    }

    public void reset(AudioGenresListFragment audiogenreslistfragment)
    {
        audiogenreslistfragment.audioGenresGridView = null;
        audiogenreslistfragment.swipeRefreshLayout = null;
        audiogenreslistfragment.emptyView = null;
    }

    public ()
    {
    }
}
