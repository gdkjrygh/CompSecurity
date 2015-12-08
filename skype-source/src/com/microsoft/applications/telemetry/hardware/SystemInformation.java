// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry.hardware;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class SystemInformation
{

    private static final String LOG_TAG = com/microsoft/applications/telemetry/hardware/SystemInformation.getSimpleName();
    private static final String OS_VERSION;
    private static final String PLATFORM = "Android";
    private static String m_app_id = "";
    private static String m_app_language = "";
    private static String m_app_version = "";
    private static String m_os_full_version = "";
    private static String m_os_major_version = "";
    private static String m_user_advertising_id = "";
    private static String m_user_language = "";
    private static String m_user_time_zone = getCurrentTimezoneOffset();

    public SystemInformation()
    {
    }

    public static String getAppId()
    {
        String.format("getAppId|value:%s", new Object[] {
            m_app_id
        });
        return m_app_id;
    }

    public static String getAppLanguage()
    {
        String.format("getAppLanguage|value:%s", new Object[] {
            m_app_language
        });
        return m_app_language;
    }

    public static String getAppVersion()
    {
        String.format("getAppVersion|value:%s", new Object[] {
            m_app_version
        });
        return m_app_version;
    }

    private static String getCurrentTimezoneOffset()
    {
        Object obj = TimeZone.getDefault();
        int i = ((TimeZone) (obj)).getOffset(GregorianCalendar.getInstance(((TimeZone) (obj))).getTimeInMillis());
        String s = String.format("%02d:%02d", new Object[] {
            Integer.valueOf(Math.abs(i / 0x36ee80)), Integer.valueOf(Math.abs((i / 60000) % 60))
        });
        StringBuilder stringbuilder = new StringBuilder();
        if (i >= 0)
        {
            obj = "+";
        } else
        {
            obj = "-";
        }
        return stringbuilder.append(((String) (obj))).append(s).toString();
    }

    private static String getLanguageTag(Locale locale)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return locale.toLanguageTag();
        } else
        {
            return locale.toString().replace('_', '-');
        }
    }

    public static String getOsFullVersion()
    {
        String.format("getOsFullVersion|value:%s", new Object[] {
            m_os_full_version
        });
        return m_os_full_version;
    }

    public static String getOsMajorVersion()
    {
        String.format("getOsMajorVersion|value:%s", new Object[] {
            m_os_major_version
        });
        return m_os_major_version;
    }

    public static String getOsName()
    {
        String.format("getOsName|value:%s", new Object[] {
            "Android"
        });
        return "Android";
    }

    private static String getOsVersion()
    {
        String.format("getOsVersion|value:%s", new Object[] {
            OS_VERSION
        });
        return OS_VERSION;
    }

    public static String getUserAdvertisingId()
    {
        String.format("getUserAdvertisingId|value:%s", new Object[] {
            m_user_advertising_id
        });
        return m_user_advertising_id;
    }

    public static String getUserLanguage()
    {
        String.format("getUserLanguage|value:%s", new Object[] {
            m_user_language
        });
        return m_user_language;
    }

    public static String getUserTimezone()
    {
        String.format("getUserTimeZone|value:%s", new Object[] {
            m_user_time_zone
        });
        return m_user_time_zone;
    }

    public static void initializeAppInfo(Context context)
    {
        try
        {
            m_app_version = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            m_app_language = getLanguageTag(context.getResources().getConfiguration().locale);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.wtf(LOG_TAG, (new StringBuilder("This should never happen ")).append(context.getMessage()).toString());
        }
    }

    static 
    {
        OS_VERSION = android.os.Build.VERSION.RELEASE;
        m_os_major_version = getOsVersion();
        m_os_full_version = (new StringBuilder()).append(getOsVersion()).append(" ").append(android.os.Build.VERSION.RELEASE).append(" ").append(android.os.Build.VERSION.INCREMENTAL).toString();
        m_user_language = getLanguageTag(Locale.getDefault());
    }
}
