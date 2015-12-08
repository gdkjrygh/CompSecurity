// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googleplay;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.wallet.Wallet;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.analytics.Analytics;
import me.lyft.android.analytics.DeveloperEvent;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.activity.ActivityResult;
import me.lyft.android.infrastructure.activity.ActivityService;
import rx.Observable;
import rx.functions.Func1;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.infrastructure.googleplay:
//            IGoogleApiProvider

public class GoogleApiProvider extends ActivityService
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, IGoogleApiProvider
{

    private static final String STATE_RESOLVING_ERROR = "resolving_error";
    private GoogleApiClient googleApiClient;
    private final ILyftPreferences lyftPreferences;
    private final BehaviorSubject readySubject = BehaviorSubject.create();
    private boolean resolvingError;

    public GoogleApiProvider(ILyftPreferences ilyftpreferences)
    {
        resolvingError = false;
        lyftPreferences = ilyftpreferences;
    }

    private void trackGooglePlayServiceUnavailable(int i)
    {
        Analytics.track((new DeveloperEvent("play_services_not_available")).setLabel(String.valueOf(i)));
    }

    public boolean checkGooglePlayServicesAvailable()
    {
        int i = GooglePlayServicesUtil.a(getCurrentActivity());
        if (i == 0)
        {
            return true;
        } else
        {
            trackGooglePlayServiceUnavailable(i);
            showGooglePlayErrorDialog(i);
            return false;
        }
    }

    public GoogleApiClient getApi()
    {
        return googleApiClient;
    }

    public boolean isConnected()
    {
        return googleApiClient.d();
    }

    public Observable observeReady()
    {
        if (!googleApiClient.d())
        {
            googleApiClient.b();
        }
        return readySubject.first(new Func1() {

            final GoogleApiProvider this$0;

            public Boolean call(Boolean boolean1)
            {
                return boolean1;
            }

            public volatile Object call(Object obj)
            {
                return call((Boolean)obj);
            }

            
            {
                this$0 = GoogleApiProvider.this;
                super();
            }
        }).map(Unit.func1()).asObservable();
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        boolean flag = true;
        super.onActivityCreated(activity, bundle);
        readySubject.onNext(Boolean.valueOf(false));
        int i;
        if (lyftPreferences.isProductionEnvironment())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        googleApiClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(activity)).a(this).a(this).a(Wallet.a, (new com.google.android.gms.wallet.Wallet.WalletOptions.Builder()).a(i).b(1).a()).a(LocationServices.a).a(Places.c).a(Places.d).b();
        if (bundle == null || !bundle.getBoolean("resolving_error", false))
        {
            flag = false;
        }
        resolvingError = flag;
    }

    public void onActivityDestroyed(Activity activity)
    {
        super.onActivityDestroyed(activity);
        googleApiClient = null;
        readySubject.onNext(Boolean.valueOf(false));
    }

    public void onActivityResult(Activity activity, ActivityResult activityresult)
    {
        super.onActivityResult(activity, activityresult);
        if (activityresult.getRequestCode() == 17)
        {
            resolvingError = false;
            if (activityresult.getResultCode() == -1 && !googleApiClient.e() && !googleApiClient.d())
            {
                googleApiClient.b();
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        super.onActivitySaveInstanceState(activity, bundle);
        bundle.putBoolean("resolving_error", resolvingError);
    }

    public void onActivityStarted(Activity activity)
    {
        super.onActivityStarted(activity);
        if (!resolvingError)
        {
            googleApiClient.b();
        }
    }

    public void onActivityStopped(Activity activity)
    {
        super.onActivityStopped(activity);
        readySubject.onNext(null);
        googleApiClient.c();
    }

    public void onConnected(Bundle bundle)
    {
        readySubject.onNext(Boolean.valueOf(true));
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        if (resolvingError)
        {
            return;
        }
        if (connectionresult.a())
        {
            try
            {
                resolvingError = true;
                connectionresult.a(getCurrentActivity(), 17);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ConnectionResult connectionresult)
            {
                googleApiClient.b();
            }
            return;
        } else
        {
            showGooglePlayErrorDialog(connectionresult.c());
            resolvingError = true;
            return;
        }
    }

    public void onConnectionSuspended(int i)
    {
        readySubject.onNext(Boolean.valueOf(false));
    }

    public void showGooglePlayErrorDialog(int i)
    {
        Dialog dialog = GooglePlayServicesUtil.a(i, getCurrentActivity(), 17);
        dialog.setCancelable(true);
        dialog.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final GoogleApiProvider this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                getCurrentActivity().finish();
            }

            
            {
                this$0 = GoogleApiProvider.this;
                super();
            }
        });
        dialog.show();
    }

}
