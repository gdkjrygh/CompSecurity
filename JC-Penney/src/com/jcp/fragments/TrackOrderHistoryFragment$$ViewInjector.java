// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

// Referenced classes of package com.jcp.fragments:
//            TrackOrderHistoryFragment

public class 
    implements butterknife.ector
{

    public void inject(butterknife.ector ector, TrackOrderHistoryFragment trackorderhistoryfragment, Object obj)
    {
        trackorderhistoryfragment.orderHistoryHeaderTextView = (TextView)ector.toryHeaderTextView((View)ector.toryHeaderTextView(obj, 0x7f0e0282, "field 'orderHistoryHeaderTextView'"), 0x7f0e0282, "field 'orderHistoryHeaderTextView'");
        trackorderhistoryfragment.orderHistoryListView = (ListView)ector.toryListView((View)ector.toryListView(obj, 0x7f0e0283, "field 'orderHistoryListView'"), 0x7f0e0283, "field 'orderHistoryListView'");
    }

    public volatile void inject(butterknife.ector ector, Object obj, Object obj1)
    {
        inject(ector, (TrackOrderHistoryFragment)obj, obj1);
    }

    public void reset(TrackOrderHistoryFragment trackorderhistoryfragment)
    {
        trackorderhistoryfragment.orderHistoryHeaderTextView = null;
        trackorderhistoryfragment.orderHistoryListView = null;
    }

    public volatile void reset(Object obj)
    {
        reset((TrackOrderHistoryFragment)obj);
    }

    public ()
    {
    }
}
