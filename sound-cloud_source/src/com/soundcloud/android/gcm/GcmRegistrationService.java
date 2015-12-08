// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.gcm;

import android.app.IntentService;
import android.content.Intent;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.analytics.appboy.AppboyWrapper;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import dagger.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.gcm:
//            InstanceIdWrapper, GcmStorage

public class GcmRegistrationService extends IntentService
{

    private static final String TAG = "GcmRegistrationService";
    private static final String TOPICS[] = {
        "global"
    };
    Provider appboyWrapperProvider;
    FeatureFlags featureFlags;
    GcmStorage gcmStorage;
    InstanceIdWrapper instanceId;

    public GcmRegistrationService()
    {
        super("GcmRegistrationService");
        SoundCloudApplication.getObjectGraph().a(this);
    }

    GcmRegistrationService(GcmStorage gcmstorage, InstanceIdWrapper instanceidwrapper, FeatureFlags featureflags, Provider provider)
    {
        super("GcmRegistrationService");
        gcmStorage = gcmstorage;
        instanceId = instanceidwrapper;
        featureFlags = featureflags;
        appboyWrapperProvider = provider;
    }

    protected void onHandleIntent(Intent intent)
    {
        try
        {
            intent = instanceId.getToken(this, getString(0x7f0702b1), "GCM");
            if (featureFlags.isEnabled(Flag.APPBOY))
            {
                ((AppboyWrapper)appboyWrapperProvider.get()).handleRegistration(intent);
            }
            gcmStorage.storeToken(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            gcmStorage.clearToken();
        }
    }

}
