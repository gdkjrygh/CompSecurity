// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.res.Resources;
import android.text.Html;
import android.widget.TextView;
import java.util.List;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideInProgressView

class val.stop extends AsyncCall
{

    final DriverRideInProgressView this$0;
    final Stop val$stop;

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Location)obj);
    }

    public void onSuccess(Location location)
    {
        super.onSuccess(location);
        Location location1 = val$stop.getLocation();
        if (!location1.isNull())
        {
            DriverRideInProgressView.access$4300(DriverRideInProgressView.this, location, getResources().getColor(0x7f0c007e), getResources().getColor(0x7f0c0070));
            TextView textview = addressTextView;
            Object obj;
            if (Strings.isNullOrEmpty(location1.getDisplayName()))
            {
                obj = getResources().getString(0x7f070064);
            } else
            {
                obj = location1.getDisplayName();
            }
            textview.setText(((CharSequence) (obj)));
        } else
        {
            addressTextView.setText(Html.fromHtml(getResources().getString(0x7f0702ac)));
            rideMap.clearRoutes();
        }
        if (!location1.isNull())
        {
            if (!DriverRideInProgressView.access$200(DriverRideInProgressView.this).isCourier())
            {
                obj = Iterables.select(DriverRideInProgressView.access$200(DriverRideInProgressView.this).getStopsFromCurrentRoute(), Stop.toLocation());
                ((List) (obj)).add(0, location);
                rideMap.fitMapTo(((List) (obj)));
                return;
            } else
            {
                rideMap.fitMapTo(new Location[] {
                    location, val$stop.getLocation()
                });
                return;
            }
        } else
        {
            rideMap.centerToCurrentLocation(16F);
            return;
        }
    }

    ()
    {
        this$0 = final_driverrideinprogressview;
        val$stop = Stop.this;
        super();
    }
}
