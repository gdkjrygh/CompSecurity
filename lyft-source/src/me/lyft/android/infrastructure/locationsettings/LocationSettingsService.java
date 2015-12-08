// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.locationsettings;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.SettingsApi;
import java.util.concurrent.atomic.AtomicInteger;
import me.lyft.android.analytics.Analytics;
import me.lyft.android.analytics.DeveloperEvent;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.activity.ActivityResult;
import me.lyft.android.infrastructure.activity.ActivityService;
import me.lyft.android.logging.L;
import me.lyft.android.utils.VersionUtils;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.infrastructure.locationsettings:
//            ILocationSettingsService

public class LocationSettingsService extends ActivityService
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, ILocationSettingsService
{

    private final BehaviorSubject connectedSubject = BehaviorSubject.create(Boolean.valueOf(false));
    private final Context context;
    private final GoogleApiClient googleApiClient;
    private final AtomicInteger subscriptionCount = new AtomicInteger(0);

    public LocationSettingsService(Context context1)
    {
        context = context1.getApplicationContext();
        googleApiClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(context, this, this)).a(LocationServices.a).b();
    }

    private LocationSettingsRequest createLocationSettingsRequest()
    {
        return (new com.google.android.gms.location.LocationSettingsRequest.Builder()).a(true).a(createLocationUpdateRequest()).a();
    }

    private LocationRequest createLocationUpdateRequest()
    {
        LocationRequest locationrequest = LocationRequest.a();
        locationrequest.a(100);
        return locationrequest;
    }

    private Observable createSettingsObservable()
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final LocationSettingsService this$0;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                LocationServices.d.a(googleApiClient, createLocationSettingsRequest()).a(subscriber. new ResultCallback() {

                    final _cls5 this$1;
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
                    //                                   0: 44
                    //                                   6: 57;
                           goto _L1 _L2 _L3
_L1:
                        subscriber.onCompleted();
                        return;
_L2:
                        subscriber.onNext(Unit.create());
                        continue; /* Loop/switch isn't completed */
_L3:
                        try
                        {
                            locationsettingsresult.a(getCurrentActivity(), 23);
                        }
                        // Misplaced declaration of an exception variable
                        catch (LocationSettingsResult locationsettingsresult)
                        {
                            L.e(locationsettingsresult, "Failure to display location settings.", new Object[0]);
                        }
                        if (true) goto _L1; else goto _L4
_L4:
                    }

            
            {
                this$1 = final__pcls5;
                subscriber = Subscriber.this;
                super();
            }
                });
            }

            
            {
                this$0 = LocationSettingsService.this;
                super();
            }
        });
    }

    private void trackPromptResponse(ActivityResult activityresult)
    {
        int i = activityresult.getResultCode();
        i;
        JVM INSTR tableswitch -1 0: default 28
    //                   -1 60
    //                   0 66;
           goto _L1 _L2 _L3
_L1:
        activityresult = (new StringBuilder()).append("location_settings_other_").append(i).toString();
_L5:
        Analytics.track(new DeveloperEvent(activityresult));
        return;
_L2:
        activityresult = "location_settings_ok";
        continue; /* Loop/switch isn't completed */
_L3:
        activityresult = "location_settings_canceled";
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void tryToConnect()
    {
        if (subscriptionCount.incrementAndGet() == 1)
        {
            googleApiClient.b();
        }
    }

    private void tryToDisconnect()
    {
        if (subscriptionCount.decrementAndGet() == 0)
        {
            connectedSubject.onNext(Boolean.valueOf(false));
            if (googleApiClient.d())
            {
                googleApiClient.c();
            }
        }
    }

    public boolean mockLocationEnabled()
    {
        while (VersionUtils.hasMarshmallow() || android.provider.Settings.Secure.getString(context.getContentResolver(), "mock_location").equals("0")) 
        {
            return false;
        }
        return true;
    }

    public Observable observeLocationSettingsEnabled()
    {
        return connectedSubject.first(new Func1() {

            final LocationSettingsService this$0;

            public Boolean call(Boolean boolean1)
            {
                return boolean1;
            }

            public volatile Object call(Object obj)
            {
                return call((Boolean)obj);
            }

            
            {
                this$0 = LocationSettingsService.this;
                super();
            }
        }).flatMap(new Func1() {

            final LocationSettingsService this$0;

            public volatile Object call(Object obj)
            {
                return call((Boolean)obj);
            }

            public Observable call(Boolean boolean1)
            {
                return createSettingsObservable();
            }

            
            {
                this$0 = LocationSettingsService.this;
                super();
            }
        }).doOnSubscribe(new Action0() {

            final LocationSettingsService this$0;

            public void call()
            {
                tryToConnect();
            }

            
            {
                this$0 = LocationSettingsService.this;
                super();
            }
        }).doOnUnsubscribe(new Action0() {

            final LocationSettingsService this$0;

            public void call()
            {
                tryToDisconnect();
            }

            
            {
                this$0 = LocationSettingsService.this;
                super();
            }
        });
    }

    public void onActivityResult(Activity activity, ActivityResult activityresult)
    {
        super.onActivityResult(activity, activityresult);
        if (activityresult.getRequestCode() == 23)
        {
            trackPromptResponse(activityresult);
        }
    }

    public void onConnected(Bundle bundle)
    {
        connectedSubject.onNext(Boolean.valueOf(true));
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
    }

    public void onConnectionSuspended(int i)
    {
        connectedSubject.onNext(Boolean.valueOf(false));
    }






}
