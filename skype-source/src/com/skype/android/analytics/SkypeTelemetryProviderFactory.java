// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.microsoft.applications.telemetry.LogConfiguration;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import com.skype.telemetry.TelemetryConfiguration;
import com.skype.telemetry.TelemetryProviderFactory;
import com.skype.telemetry.provider.AriaTelemetryProvider;
import com.skype.telemetry.provider.FlurryTelemetryProvider;
import com.skype.telemetry.sdk.AriaAccessInterface;
import com.skype.telemetry.sdk.FlurryAccessInterface;
import java.util.HashMap;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.analytics:
//            AriaAccess, SkypeTelemetryConfiguration

public class SkypeTelemetryProviderFactory
    implements TelemetryProviderFactory
{

    private final AccountProvider accountProvider;
    private final Application application;
    private AriaAccessInterface aria;
    private final AsyncService async;
    private final EcsConfiguration ecsConfiguration;
    private final FlurryAccessInterface flurry;

    public SkypeTelemetryProviderFactory(Application application1, AsyncService asyncservice, FlurryAccessInterface flurryaccessinterface, AccountProvider accountprovider, EcsConfiguration ecsconfiguration)
    {
        application = application1;
        async = asyncservice;
        flurry = flurryaccessinterface;
        accountProvider = accountprovider;
        ecsConfiguration = ecsconfiguration;
    }

    private AriaAccessInterface getAriaInstance()
    {
        String s;
        String s1;
        String s2;
        Logger logger;
        if (aria != null)
        {
            return aria;
        }
        logger = Logger.getLogger("AriaAccessInterface");
        s1 = null;
        s2 = null;
        s = s1;
        Object obj = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
        s = s1;
        s1 = ((Bundle) (obj)).getString("com.microsoft.applications.telemetry.tenantToken");
        s = s1;
        obj = ((Bundle) (obj)).getString("com.microsoft.applications.telemetry.eventCollectorUri");
        s2 = ((String) (obj));
        s = s1;
_L2:
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException(String.format("An tenantToken is required! Please provide a token via metadata in the application manifest: '<meta-data android:name=\"com.microsoft.applications.telemetry.tenantToken\" android:value=\"[yourtoken]\"' />", new Object[0]));
        }
        break; /* Loop/switch isn't completed */
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        logger.warning((new StringBuilder("Error getting application info from package name: '")).append(application.getPackageName()).append("'").toString());
        if (true) goto _L2; else goto _L1
_L1:
        LogConfiguration logconfiguration = LogConfiguration.getDefaultConfiguration(application.getApplicationContext());
        if (s2 != null)
        {
            logconfiguration.eventCollectorUri = s2;
        }
        aria = new AriaAccess(application, async, s, logconfiguration, accountProvider, ecsConfiguration);
        return aria;
    }

    public TelemetryConfiguration createConfiguration()
    {
        return new SkypeTelemetryConfiguration(ecsConfiguration);
    }

    public HashMap createProviders()
    {
        HashMap hashmap = new HashMap();
        hashmap.put(com/skype/telemetry/provider/FlurryTelemetryProvider, new FlurryTelemetryProvider(flurry));
        hashmap.put(com/skype/telemetry/provider/AriaTelemetryProvider, new AriaTelemetryProvider(getAriaInstance()));
        return hashmap;
    }
}
