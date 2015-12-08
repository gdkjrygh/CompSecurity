// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget.route;

import android.view.View;
import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;

// Referenced classes of package com.thetransitapp.droid.widget.route:
//            RouteAdapter, RouteItem

public static interface 
{

    public abstract void menuExpanded(RouteItem routeitem);

    public abstract void showDirectionPopover(NearbyRouteViewModel nearbyrouteviewmodel, View view);

    public abstract void showItinerary(NearbyRouteViewModel nearbyrouteviewmodel);

    public abstract void showSchedules(NearbyRouteViewModel nearbyrouteviewmodel);

    public abstract void showTimePopover(NearbyRouteViewModel nearbyrouteviewmodel, View view);

    public abstract void toggleFavorite(NearbyRouteViewModel nearbyrouteviewmodel);

    public abstract void toggleInactiveRoute();

    public abstract void viewMovedSideway();
}
