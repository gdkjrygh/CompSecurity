// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.adjust.sdk:
//            Reflection, Util, AdjustFactory, ILogger

class DeviceInfo
{

    String androidId;
    String appVersion;
    String clientSdk;
    String country;
    String deviceManufacturer;
    String deviceName;
    String deviceType;
    String displayHeight;
    String displayWidth;
    String fbAttributionId;
    String language;
    String macSha1;
    String macShortMd5;
    String osName;
    String osVersion;
    String packageName;
    Map pluginKeys;
    String screenDensity;
    String screenFormat;
    String screenSize;

    DeviceInfo(Context context, String s)
    {
        Object obj = context.getResources();
        DisplayMetrics displaymetrics = ((Resources) (obj)).getDisplayMetrics();
        Object obj1 = ((Resources) (obj)).getConfiguration();
        obj = ((Configuration) (obj1)).locale;
        int i = ((Configuration) (obj1)).screenLayout;
        boolean flag;
        if (Reflection.getPlayAdId(context) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = getMacAddress(context, flag);
        packageName = getPackageName(context);
        appVersion = getAppVersion(context);
        deviceType = getDeviceType(i);
        deviceName = getDeviceName();
        deviceManufacturer = getDeviceManufacturer();
        osName = getOsName();
        osVersion = getOsVersion();
        language = getLanguage(((Locale) (obj)));
        country = getCountry(((Locale) (obj)));
        screenSize = getScreenSize(i);
        screenFormat = getScreenFormat(i);
        screenDensity = getScreenDensity(displaymetrics);
        displayWidth = getDisplayWidth(displaymetrics);
        displayHeight = getDisplayHeight(displaymetrics);
        clientSdk = getClientSdk(s);
        androidId = getAndroidId(context, flag);
        fbAttributionId = getFacebookAttributionId(context);
        pluginKeys = Reflection.getPluginKeys(context);
        macSha1 = getMacSha1(((String) (obj1)));
        macShortMd5 = getMacShortMd5(((String) (obj1)));
    }

    private String getAndroidId(Context context, boolean flag)
    {
        if (!flag)
        {
            return Reflection.getAndroidId(context);
        } else
        {
            return null;
        }
    }

    private String getAppVersion(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    private String getClientSdk(String s)
    {
        if (s == null)
        {
            return "android4.1.2";
        } else
        {
            return String.format(Locale.US, "%s@%s", new Object[] {
                s, "android4.1.2"
            });
        }
    }

    private String getCountry(Locale locale)
    {
        return locale.getCountry();
    }

    private String getDeviceManufacturer()
    {
        return Build.MANUFACTURER;
    }

    private String getDeviceName()
    {
        return Build.MODEL;
    }

    private String getDeviceType(int i)
    {
        switch (i & 0xf)
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
            return "phone";

        case 3: // '\003'
        case 4: // '\004'
            return "tablet";
        }
    }

    private String getDisplayHeight(DisplayMetrics displaymetrics)
    {
        return String.valueOf(displaymetrics.heightPixels);
    }

    private String getDisplayWidth(DisplayMetrics displaymetrics)
    {
        return String.valueOf(displaymetrics.widthPixels);
    }

    private String getFacebookAttributionId(Context context)
    {
        String s;
        try
        {
            context = context.getContentResolver().query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[] {
                "aid"
            }, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        if (context == null)
        {
            return null;
        }
        if (context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_48;
        }
        context.close();
        return null;
        s = context.getString(context.getColumnIndex("aid"));
        context.close();
        return s;
    }

    private String getLanguage(Locale locale)
    {
        return locale.getLanguage();
    }

    private String getMacAddress(Context context, boolean flag)
    {
        if (!flag)
        {
            if (!Util.checkPermission(context, "android.permission.ACCESS_WIFI_STATE"))
            {
                AdjustFactory.getLogger().warn("Missing permission: ACCESS_WIFI_STATE", new Object[0]);
            }
            return Reflection.getMacAddress(context);
        } else
        {
            return null;
        }
    }

    private String getMacSha1(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return Util.sha1(s);
        }
    }

    private String getMacShortMd5(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return Util.md5(s.replaceAll(":", ""));
        }
    }

    private String getOsName()
    {
        return "android";
    }

    private String getOsVersion()
    {
        String s = (new StringBuilder()).append(android.os.Build.VERSION.SDK_INT).toString();
        osVersion = s;
        return s;
    }

    private String getPackageName(Context context)
    {
        return context.getPackageName();
    }

    private String getScreenDensity(DisplayMetrics displaymetrics)
    {
        int i = displaymetrics.densityDpi;
        if (i == 0)
        {
            return null;
        }
        if (i < 140)
        {
            return "low";
        }
        if (i > 200)
        {
            return "high";
        } else
        {
            return "medium";
        }
    }

    private String getScreenFormat(int i)
    {
        switch (i & 0x30)
        {
        default:
            return null;

        case 32: // ' '
            return "long";

        case 16: // '\020'
            return "normal";
        }
    }

    private String getScreenSize(int i)
    {
        switch (i & 0xf)
        {
        default:
            return null;

        case 1: // '\001'
            return "small";

        case 2: // '\002'
            return "normal";

        case 3: // '\003'
            return "large";

        case 4: // '\004'
            return "xlarge";
        }
    }
}
