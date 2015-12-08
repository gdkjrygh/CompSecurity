// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.res.Resources;
import android.widget.TextView;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.utils.Navigator;
import me.lyft.android.utils.TextToSpeech;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            AutoNavigationToastView

class this._cls0
    implements Action1
{

    final AutoNavigationToastView this$0;

    public void call(Long long1)
    {
        Stop stop;
        autoNavigateCountdownTextView.setText(getResources().getString(0x7f070120, new Object[] {
            long1
        }));
        stop = routeProvider.getDriverRide().getCurrentStop();
        if (long1.longValue() != 3L) goto _L2; else goto _L1
_L1:
        long1 = routeProvider.getDriverRide().getCurrentPassenger().getFirstName();
        int i;
        if (stop.isPickup())
        {
            i = 0x7f0702aa;
        } else
        {
            i = 0x7f070163;
        }
        if (!Strings.isNullOrEmpty(long1))
        {
            long1 = getResources().getString(i, new Object[] {
                long1
            });
        } else
        {
            long1 = getResources().getString(0x7f070206);
        }
        textToSpeech.speak(long1);
_L4:
        return;
_L2:
        if (long1.longValue() != 0L) goto _L4; else goto _L3
_L3:
        if (!routeProvider.getDriverRide().isTrainingRide()) goto _L6; else goto _L5
_L5:
        dialogFlow.queue(new NavigationDialog());
_L8:
        dialogFlow.dismiss();
        return;
_L6:
        if (!stop.getLocation().isNull())
        {
            navigator.navigate(stop.getLocation());
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public volatile void call(Object obj)
    {
        call((Long)obj);
    }

    NavigationDialog()
    {
        this$0 = AutoNavigationToastView.this;
        super();
    }
}
