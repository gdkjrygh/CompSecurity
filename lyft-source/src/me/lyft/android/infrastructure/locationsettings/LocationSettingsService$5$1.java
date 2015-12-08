// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.locationsettings;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.SettingsApi;
import me.lyft.android.common.Unit;
import me.lyft.android.logging.L;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.infrastructure.locationsettings:
//            LocationSettingsService

class val.subscriber
    implements ResultCallback
{

    final is._cls0 this$1;
    final Subscriber val$subscriber;

    public volatile void onResult(Result result)
    {
        onResult((LocationSettingsResult)result);
    }

    public void onResult(LocationSettingsResult locationsettingsresult)
    {
        locationsettingsresult = locationsettingsresult.a();
        locationsettingsresult.g();
        JVM INSTR lookupswitch 2: default 36
    //                   0: 44
    //                   6: 57;
           goto _L1 _L2 _L3
_L1:
        val$subscriber.onCompleted();
        return;
_L2:
        val$subscriber.onNext(Unit.create());
        continue; /* Loop/switch isn't completed */
_L3:
        try
        {
            locationsettingsresult.a(LocationSettingsService.access$500(_fld0), 23);
        }
        // Misplaced declaration of an exception variable
        catch (LocationSettingsResult locationsettingsresult)
        {
            L.e(locationsettingsresult, "Failure to display location settings.", new Object[0]);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$subscriber = Subscriber.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/infrastructure/locationsettings/LocationSettingsService$5

/* anonymous class */
    class LocationSettingsService._cls5
        implements rx.Observable.OnSubscribe
    {

        final LocationSettingsService this$0;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber1)
        {
            LocationServices.d.a(LocationSettingsService.access$300(LocationSettingsService.this), LocationSettingsService.access$400(LocationSettingsService.this)).a(subscriber1. new LocationSettingsService._cls5._cls1());
        }

            
            {
                this$0 = LocationSettingsService.this;
                super();
            }
    }

}
