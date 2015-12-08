// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.cache.MemoryValueCache;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeviceIdentifierProvider;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.SystemCurrentTimeProvider;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import io.fabric.sdk.android.services.settings.BetaSettingsData;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.crashlytics.android.beta:
//            DeviceTokenLoader, CheckForUpdatesController, BuildProperties

public class Beta extends Kit
    implements DeviceIdentifierProvider
{

    private static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    private static final String CRASHLYTICS_BUILD_PROPERTIES = "crashlytics-build.properties";
    static final String NO_DEVICE_TOKEN = "";
    public static final String TAG = "Beta";
    private final MemoryValueCache deviceTokenCache = new MemoryValueCache();
    private final DeviceTokenLoader deviceTokenLoader = new DeviceTokenLoader();

    public Beta()
    {
    }

    private void checkForUpdates(Context context, IdManager idmanager, BetaSettingsData betasettingsdata, BuildProperties buildproperties)
    {
        (new CheckForUpdatesController(context, this, idmanager, betasettingsdata, buildproperties, new PreferenceStoreImpl(Fabric.getKit(com/crashlytics/android/beta/Beta)), new SystemCurrentTimeProvider(), new DefaultHttpRequestFactory(Fabric.getLogger()))).checkForUpdates();
    }

    private String getBetaDeviceToken(Context context, String s)
    {
        if (isAppPossiblyInstalledByBeta(s, android.os.Build.VERSION.SDK_INT))
        {
            Fabric.getLogger().d("Beta", "App was installed by Beta. Getting device token");
            boolean flag;
            try
            {
                context = (String)deviceTokenCache.get(context, deviceTokenLoader);
                flag = "".equals(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Fabric.getLogger().e("Beta", "Failed to load the Beta device token", context);
                return null;
            }
            if (flag)
            {
                return null;
            } else
            {
                return context;
            }
        } else
        {
            Fabric.getLogger().d("Beta", "App was not installed by Beta. Skipping device token");
            return null;
        }
    }

    private BetaSettingsData getBetaSettingsData()
    {
        SettingsData settingsdata = Settings.getInstance().awaitSettingsData();
        if (settingsdata != null)
        {
            return settingsdata.betaSettingsData;
        } else
        {
            return null;
        }
    }

    public static Beta getInstance()
    {
        return (Beta)Fabric.getKit(com/crashlytics/android/beta/Beta);
    }

    private BuildProperties loadBuildProperties(Context context)
    {
        Object obj;
        InputStream inputstream;
        Object obj1;
        Object obj2;
        Object obj3;
        obj1 = null;
        inputstream = null;
        obj2 = null;
        obj3 = null;
        obj = obj2;
        InputStream inputstream1 = context.getAssets().open("crashlytics-build.properties");
        context = obj3;
        if (inputstream1 == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        obj = obj2;
        inputstream = inputstream1;
        obj1 = inputstream1;
        context = BuildProperties.fromPropertiesStream(inputstream1);
        obj = context;
        inputstream = inputstream1;
        obj1 = inputstream1;
        Fabric.getLogger().d("Beta", (new StringBuilder()).append(((BuildProperties) (context)).packageName).append(" build properties: ").append(((BuildProperties) (context)).versionName).append(" (").append(((BuildProperties) (context)).versionCode).append(")").append(" - ").append(((BuildProperties) (context)).buildId).toString());
        obj1 = context;
        if (inputstream1 != null)
        {
            try
            {
                inputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Fabric.getLogger().e("Beta", "Error closing Beta build properties asset", ((Throwable) (obj)));
                return context;
            }
            obj1 = context;
        }
_L2:
        return ((BuildProperties) (obj1));
        context;
        obj1 = inputstream;
        Fabric.getLogger().e("Beta", "Error reading Beta build properties", context);
        obj1 = obj;
        if (inputstream == null) goto _L2; else goto _L1
_L1:
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Fabric.getLogger().e("Beta", "Error closing Beta build properties asset", context);
            return ((BuildProperties) (obj));
        }
        return ((BuildProperties) (obj));
        context;
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            catch (IOException ioexception)
            {
                Fabric.getLogger().e("Beta", "Error closing Beta build properties asset", ioexception);
            }
        }
        throw context;
    }

    boolean canCheckForUpdates(BetaSettingsData betasettingsdata, BuildProperties buildproperties)
    {
        return betasettingsdata != null && !TextUtils.isEmpty(betasettingsdata.updateUrl) && buildproperties != null;
    }

    protected Boolean doInBackground()
    {
        Fabric.getLogger().d("Beta", "Beta kit initializing...");
        Context context = getContext();
        IdManager idmanager = getIdManager();
        if (TextUtils.isEmpty(getBetaDeviceToken(context, idmanager.getInstallerPackageName())))
        {
            Fabric.getLogger().d("Beta", "A Beta device token was not found for this app");
            return Boolean.valueOf(false);
        }
        Fabric.getLogger().d("Beta", "Beta device token is present, checking for app updates.");
        BetaSettingsData betasettingsdata = getBetaSettingsData();
        BuildProperties buildproperties = loadBuildProperties(context);
        if (canCheckForUpdates(betasettingsdata, buildproperties))
        {
            checkForUpdates(context, idmanager, betasettingsdata, buildproperties);
        }
        return Boolean.valueOf(true);
    }

    protected volatile Object doInBackground()
    {
        return doInBackground();
    }

    public Map getDeviceIdentifiers()
    {
        String s = getIdManager().getInstallerPackageName();
        s = getBetaDeviceToken(getContext(), s);
        HashMap hashmap = new HashMap();
        if (!TextUtils.isEmpty(s))
        {
            hashmap.put(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.FONT_TOKEN, s);
        }
        return hashmap;
    }

    public String getIdentifier()
    {
        return "com.crashlytics.sdk.android:beta";
    }

    String getOverridenSpiEndpoint()
    {
        return CommonUtils.getStringsFileValue(getContext(), "com.crashlytics.ApiEndpoint");
    }

    public String getVersion()
    {
        return "1.1.2.37";
    }

    boolean isAppPossiblyInstalledByBeta(String s, int i)
    {
        if (i < 11)
        {
            return s == null;
        } else
        {
            return "io.crash.air".equals(s);
        }
    }
}
