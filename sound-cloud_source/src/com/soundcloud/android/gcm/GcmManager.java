// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.gcm;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.soundcloud.android.ServiceInitiator;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.utils.GooglePlayServicesWrapper;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

// Referenced classes of package com.soundcloud.android.gcm:
//            GcmStorage

public class GcmManager extends DefaultActivityLightCycle
{

    private static final String TAG = "GcmHelper";
    private final FeatureFlags featureFlags;
    private final GcmStorage gcmStorage;
    private final GooglePlayServicesWrapper googlePlayServices;
    private final ServiceInitiator serviceInitiator;

    public GcmManager(GcmStorage gcmstorage, GooglePlayServicesWrapper googleplayserviceswrapper, ServiceInitiator serviceinitiator, FeatureFlags featureflags)
    {
        gcmStorage = gcmstorage;
        googlePlayServices = googleplayserviceswrapper;
        serviceInitiator = serviceinitiator;
        featureFlags = featureflags;
    }

    private void ensureRegistrationTokenStored(AppCompatActivity appcompatactivity)
    {
        if (!gcmStorage.hasToken())
        {
            serviceInitiator.startGcmService(appcompatactivity);
            return;
        } else
        {
            (new StringBuilder("GcmToken found ")).append(gcmStorage.getToken());
            return;
        }
    }

    private void handlePlayServicesUnavailable(AppCompatActivity appcompatactivity, int i)
    {
        if (googlePlayServices.isUserRecoverableError(i))
        {
            googlePlayServices.showUnrecoverableErrorDialog(appcompatactivity, i);
        }
    }

    public volatile void onCreate(Activity activity, Bundle bundle)
    {
        onCreate((AppCompatActivity)activity, bundle);
    }

    public void onCreate(AppCompatActivity appcompatactivity, Bundle bundle)
    {
        int i;
label0:
        {
            super.onCreate(appcompatactivity, bundle);
            if (bundle == null)
            {
                i = googlePlayServices.isPlayServicesAvailable(appcompatactivity);
                if (i != 0)
                {
                    break label0;
                }
                ensureRegistrationTokenStored(appcompatactivity);
            }
            return;
        }
        handlePlayServicesUnavailable(appcompatactivity, i);
    }
}
