// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            AdvertisingInfoStrategy, AdvertisingInfo, AdvertisingInfoReflectionStrategy, AdvertisingInfoServiceStrategy, 
//            BackgroundPriorityRunnable

class AdvertisingInfoProvider
{

    private static final String ADVERTISING_INFO_PREFERENCES = "TwitterAdvertisingInfoPreferences";
    private static final String PREFKEY_ADVERTISING_ID = "advertising_id";
    private static final String PREFKEY_LIMIT_AD_TRACKING = "limit_ad_tracking_enabled";
    private final Context context;
    private final PreferenceStore preferenceStore;

    public AdvertisingInfoProvider(Context context1)
    {
        context = context1.getApplicationContext();
        preferenceStore = new PreferenceStoreImpl(context1, "TwitterAdvertisingInfoPreferences");
    }

    private AdvertisingInfo getAdvertisingInfoFromStrategies()
    {
        AdvertisingInfo advertisinginfo = getReflectionStrategy().getAdvertisingInfo();
        if (!isInfoValid(advertisinginfo))
        {
            advertisinginfo = getServiceStrategy().getAdvertisingInfo();
            if (!isInfoValid(advertisinginfo))
            {
                Fabric.getLogger().d("Fabric", "AdvertisingInfo not present");
                return advertisinginfo;
            } else
            {
                Fabric.getLogger().d("Fabric", "Using AdvertisingInfo from Service Provider");
                return advertisinginfo;
            }
        } else
        {
            Fabric.getLogger().d("Fabric", "Using AdvertisingInfo from Reflection Provider");
            return advertisinginfo;
        }
    }

    private boolean isInfoValid(AdvertisingInfo advertisinginfo)
    {
        return advertisinginfo != null && !TextUtils.isEmpty(advertisinginfo.advertisingId);
    }

    private void refreshInfoIfNeededAsync(final AdvertisingInfo advertisingInfo)
    {
        (new Thread(new BackgroundPriorityRunnable() {

            final AdvertisingInfoProvider this$0;
            final AdvertisingInfo val$advertisingInfo;

            public void onRun()
            {
                AdvertisingInfo advertisinginfo = getAdvertisingInfoFromStrategies();
                if (!advertisingInfo.equals(advertisinginfo))
                {
                    Fabric.getLogger().d("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
                    storeInfoToPreferences(advertisinginfo);
                }
            }

            
            {
                this$0 = AdvertisingInfoProvider.this;
                advertisingInfo = advertisinginfo;
                super();
            }
        })).start();
    }

    private void storeInfoToPreferences(AdvertisingInfo advertisinginfo)
    {
        if (isInfoValid(advertisinginfo))
        {
            preferenceStore.save(preferenceStore.edit().putString("advertising_id", advertisinginfo.advertisingId).putBoolean("limit_ad_tracking_enabled", advertisinginfo.limitAdTrackingEnabled));
            return;
        } else
        {
            preferenceStore.save(preferenceStore.edit().remove("advertising_id").remove("limit_ad_tracking_enabled"));
            return;
        }
    }

    public AdvertisingInfo getAdvertisingInfo()
    {
        AdvertisingInfo advertisinginfo = getInfoFromPreferences();
        if (isInfoValid(advertisinginfo))
        {
            Fabric.getLogger().d("Fabric", "Using AdvertisingInfo from Preference Store");
            refreshInfoIfNeededAsync(advertisinginfo);
            return advertisinginfo;
        } else
        {
            AdvertisingInfo advertisinginfo1 = getAdvertisingInfoFromStrategies();
            storeInfoToPreferences(advertisinginfo1);
            return advertisinginfo1;
        }
    }

    protected AdvertisingInfo getInfoFromPreferences()
    {
        return new AdvertisingInfo(preferenceStore.get().getString("advertising_id", ""), preferenceStore.get().getBoolean("limit_ad_tracking_enabled", false));
    }

    public AdvertisingInfoStrategy getReflectionStrategy()
    {
        return new AdvertisingInfoReflectionStrategy(context);
    }

    public AdvertisingInfoStrategy getServiceStrategy()
    {
        return new AdvertisingInfoServiceStrategy(context);
    }


}
