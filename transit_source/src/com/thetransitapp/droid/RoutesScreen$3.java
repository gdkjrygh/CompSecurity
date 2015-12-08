// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.location.Location;
import android.widget.TextView;
import com.thetransitapp.droid.model.SimplePlacemark;
import com.thetransitapp.droid.model.Stop;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;
import com.thetransitapp.droid.ui.CompassView;

// Referenced classes of package com.thetransitapp.droid:
//            RoutesScreen

class val.distance
    implements com.google.android.gms.maps.ocationChangeListener
{

    final RoutesScreen this$0;
    private final CompassView val$compass;
    private final TextView val$distance;
    private final NearbyRouteViewModel val$route;

    public void onMyLocationChange(Location location)
    {
        RoutesScreen.access$0(RoutesScreen.this, location);
        val$compass.setCurrent(location);
        int i = (int)val$route.getCurrentItinerary().getClosestStop().getDistance(new SimplePlacemark(RoutesScreen.access$1(RoutesScreen.this)));
        val$distance.setText((new StringBuilder(String.valueOf(i))).append(" m").toString());
    }

    .NearbyRouteViewModel()
    {
        this$0 = final_routesscreen;
        val$compass = compassview;
        val$route = nearbyrouteviewmodel;
        val$distance = TextView.this;
        super();
    }
}
