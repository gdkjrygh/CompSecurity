// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.viewmodel;

import android.widget.ListView;
import com.thetransitapp.droid.widget.route.RouteAdapter;
import com.thetransitapp.droid.widget.route.RouteItem;

// Referenced classes of package com.thetransitapp.droid.model.viewmodel:
//            MergedItinerary

class val.item
    implements com.thetransitapp.droid.model.realtime.urce.RealTimeCallback
{

    final MergedItinerary this$0;
    private final RouteItem val$item;
    private final ListView val$listView;

    public void didAssignRealTime()
    {
        MergedItinerary.access$0(MergedItinerary.this, null);
        loadOngoingScheduleItems();
        int i = ((RouteAdapter)val$listView.getAdapter()).getPosition(val$item);
        if (i >= val$listView.getFirstVisiblePosition() && i <= val$listView.getLastVisiblePosition())
        {
            val$item.refreshView();
        }
    }

    rce.RealTimeCallback()
    {
        this$0 = final_mergeditinerary;
        val$listView = listview;
        val$item = RouteItem.this;
        super();
    }
}
