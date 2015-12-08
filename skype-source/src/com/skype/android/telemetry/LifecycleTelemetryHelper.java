// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.telemetry;

import android.app.Application;
import android.os.Build;
import com.skype.Account;
import com.skype.android.SkypeApplication;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.config.ecs.EcsClient;
import com.skype.android.util.NetworkUtil;
import java.util.TimeZone;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.telemetry:
//            TelemetryHelper, RecordBuilder, a, SCTManager

public class LifecycleTelemetryHelper extends TelemetryHelper
{

    private static final Logger a = Logger.getLogger("LifecycleTelemetryHelper");

    public LifecycleTelemetryHelper(Application application, SCTManager sctmanager, EcsClient ecsclient, NetworkUtil networkutil, AnalyticsPersistentStorage analyticspersistentstorage)
    {
        super(application, sctmanager, ecsclient, networkutil, analyticspersistentstorage);
    }

    public final void a(String s, String s1, Account account, long l, long l1, 
            long l2)
    {
        a a1 = getDeviceAttributes();
        s = startBuildingRecord(false).a(account).a("android_inapp_activity_end").b("AppEntryPoint", s).b("AppExitPoint", s1).b("PlatformId", SkypeApplication.g()).b("NetworkType", a1.a()).b("OSName", "android").b("OSVersion", String.valueOf(android.os.Build.VERSION.SDK_INT)).b("UiVersion", SkypeApplication.d()).b("OSArchitectureType", System.getProperty("os.arch")).b("SystemManufacturer", Build.MANUFACTURER).b("SystemProductName", Build.MODEL);
        int i;
        if (a1.b())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        s1 = s.b("TouchAvailable", Integer.valueOf(i)).b("KeyboardAvailable", Integer.valueOf(0)).b("MouseAvailable", Integer.valueOf(0)).b("PrimaryScreenWidth", Integer.valueOf(a1.c())).b("PrimaryScreenPpiX", Float.valueOf(a1.d())).b("PrimaryScreenHeight", Integer.valueOf(a1.e())).b("PrimaryScreenPpiY", Float.valueOf(a1.f())).b("ForegroundStartTime", Long.valueOf(l)).b("ForegroundEndTime", Long.valueOf(l1)).b("ForegroundDurationInSeconds", Long.valueOf(l2));
        l1 = TimeZone.getDefault().getRawOffset();
        if (l1 < 0L)
        {
            s = "-";
        } else
        {
            s = "+";
        }
        l = l1;
        if (l1 < 0L)
        {
            l = l1 * -1L;
        }
        l1 = l / 1000L / 60L / 60L;
        sendRecord(s1.b("TimeZone", String.format("%s%02d:%02d", new Object[] {
            s, Long.valueOf(l1), Long.valueOf((l - 1000L * l1 * 60L * 60L) / 1000L / 60L)
        })).b("DeviceId", analyticsPersistentStorage.b()));
    }

}
