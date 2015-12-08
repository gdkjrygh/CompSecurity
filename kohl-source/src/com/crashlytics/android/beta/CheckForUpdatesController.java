// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import android.content.Context;
import android.content.SharedPreferences;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.settings.BetaSettingsData;

// Referenced classes of package com.crashlytics.android.beta:
//            BuildProperties, CheckForUpdatesRequest, Beta, CheckForUpdatesResponseTransform

class CheckForUpdatesController
{

    static final long LAST_UPDATE_CHECK_DEFAULT = 0L;
    static final String LAST_UPDATE_CHECK_KEY = "last_update_check";
    private final Beta beta;
    private final BetaSettingsData betaSettings;
    private final BuildProperties buildProps;
    private final Context context;
    private final CurrentTimeProvider currentTimeProvider;
    private final HttpRequestFactory httpRequestFactory;
    private final IdManager idManager;
    private final PreferenceStore preferenceStore;

    public CheckForUpdatesController(Context context1, Beta beta1, IdManager idmanager, BetaSettingsData betasettingsdata, BuildProperties buildproperties, PreferenceStore preferencestore, CurrentTimeProvider currenttimeprovider, 
            HttpRequestFactory httprequestfactory)
    {
        context = context1;
        beta = beta1;
        idManager = idmanager;
        betaSettings = betasettingsdata;
        buildProps = buildproperties;
        preferenceStore = preferencestore;
        currentTimeProvider = currenttimeprovider;
        httpRequestFactory = httprequestfactory;
    }

    public void checkForUpdates()
    {
        long l;
        l = currentTimeProvider.getCurrentTimeMillis();
        long l1 = betaSettings.updateSuspendDurationSeconds * 1000;
        Fabric.getLogger().d("Beta", (new StringBuilder()).append("Check for updates delay: ").append(l1).toString());
        long l2 = preferenceStore.get().getLong("last_update_check", 0L);
        Fabric.getLogger().d("Beta", (new StringBuilder()).append("Check for updates last check time: ").append(l2).toString());
        l1 = l2 + l1;
        Fabric.getLogger().d("Beta", (new StringBuilder()).append("Check for updates current time: ").append(l).append(", next check time: ").append(l1).toString());
        if (l < l1)
        {
            break MISSING_BLOCK_LABEL_295;
        }
        Fabric.getLogger().d("Beta", "Performing update check");
        String s = (new ApiKey()).getValue(context);
        String s1 = idManager.createIdHeaderValue(s, buildProps.packageName);
        (new CheckForUpdatesRequest(beta, beta.getOverridenSpiEndpoint(), betaSettings.updateUrl, httpRequestFactory, new CheckForUpdatesResponseTransform())).invoke(s, s1, buildProps);
        preferenceStore.edit().putLong("last_update_check", l).commit();
        return;
        Exception exception;
        exception;
        preferenceStore.edit().putLong("last_update_check", l).commit();
        throw exception;
        Fabric.getLogger().d("Beta", "Check for updates next check time was not passed");
        return;
    }
}
