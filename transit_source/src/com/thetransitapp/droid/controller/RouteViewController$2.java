// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.controller;

import com.thetransitapp.droid.model.ScheduleItem;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;
import com.thetransitapp.droid.widget.route.RouteItem;
import java.util.Comparator;

// Referenced classes of package com.thetransitapp.droid.controller:
//            RouteViewController

class this._cls0
    implements Comparator
{

    final RouteViewController this$0;

    public int compare(RouteItem routeitem, RouteItem routeitem1)
    {
        int j = (int)(routeitem.getViewModel().getPoint() - routeitem1.getViewModel().getPoint());
        int i = j;
        if (j == 0)
        {
            i = routeitem.getViewModel().getCurrentItinerary().getCurrentScheduleItem().compareTo(routeitem1.getViewModel().getCurrentItinerary().getCurrentScheduleItem());
        }
        return i;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((RouteItem)obj, (RouteItem)obj1);
    }

    del()
    {
        this$0 = RouteViewController.this;
        super();
    }
}
