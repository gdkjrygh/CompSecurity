// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.soundcloud.java.hashing.Hashing;
import com.soundcloud.java.objects.MoreObjects;
import com.soundcloud.java.strings.Strings;

// Referenced classes of package com.soundcloud.android.utils:
//            BuildHelper

public class DeviceHelper
{

    private static final String MISSING_DEVICE_NAME = "unknown device";
    private static final String MISSING_UDID = "unknown";
    private final BuildHelper buildHelper;
    private final Context context;
    private final String udid;

    public DeviceHelper(Context context1, BuildHelper buildhelper)
    {
        context = context1;
        buildHelper = buildhelper;
        context1 = getUniqueDeviceId();
        if (context1 != null)
        {
            udid = Hashing.md5(context1);
            return;
        } else
        {
            udid = "unknown";
            return;
        }
    }

    public static String getBuildInfo()
    {
        return MoreObjects.toStringHelper("Build").add("Brand", Build.BRAND).add("Device", Build.DEVICE).add("Hardware", Build.HARDWARE).add("Manufacturer", Build.MANUFACTURER).add("Model", Build.MODEL).add("Product", Build.PRODUCT).add("Type", Build.TYPE).toString();
    }

    private String getUniqueDeviceId()
    {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public String getAppVersion()
    {
        return "2015.11.20-release";
    }

    public int getCurrentOrientation()
    {
        return context.getResources().getConfiguration().orientation;
    }

    public String getDeviceName()
    {
        String s = buildHelper.getManufacturer();
        String s1 = buildHelper.getModel();
        if (Strings.isNotBlank(s1))
        {
            if (!Strings.isNotBlank(s) || s1.startsWith(s))
            {
                return s1;
            } else
            {
                return (new StringBuilder()).append(s).append(" ").append(s1).toString();
            }
        }
        if (Strings.isNotBlank(s))
        {
            return s;
        } else
        {
            return "unknown device";
        }
    }

    public String getPackageName()
    {
        return context.getPackageName();
    }

    public String getUdid()
    {
        return udid;
    }

    public String getUserAgent()
    {
        return String.format("SoundCloud-Android/%s (Android %s; %s)", new Object[] {
            "2015.11.20-release", String.valueOf(buildHelper.getAndroidReleaseVersion()), getDeviceName()
        });
    }

    public boolean hasMicrophone()
    {
        PackageManager packagemanager = context.getPackageManager();
        return packagemanager != null && packagemanager.hasSystemFeature("android.hardware.microphone");
    }
}
