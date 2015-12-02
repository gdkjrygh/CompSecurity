// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

public class AppsFlyerProperties
{

    public static final String AF_KEY = "AppsFlyerKey";
    public static final String APP_ID = "appid";
    public static final String APP_USER_ID = "AppUserId";
    public static final String CHANNEL = "channel";
    public static final String COLLECT_ANDROID_ID = "collectAndroidId";
    public static final String COLLECT_IMEI = "collectIMEI";
    public static final String COLLECT_MAC = "collectMAC";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
    public static final String IS_UPDATE = "IS_UPDATE";
    public static final String USE_HTTP_FALLBACK = "useHttpFallback";
    private static AppsFlyerProperties instance = new AppsFlyerProperties();
    private boolean isDisableLog;
    private boolean isLaunchCalled;
    private boolean isOnReceiveCalled;
    private Map properties;
    private String referrer;

    private AppsFlyerProperties()
    {
        properties = new HashMap();
    }

    public static AppsFlyerProperties getInstance()
    {
        return instance;
    }

    public void disableLogOutput(boolean flag)
    {
        isDisableLog = flag;
    }

    public String get(String s)
    {
        return (String)properties.get(s);
    }

    public boolean getBoolean(String s, boolean flag)
    {
        s = get(s);
        if (s == null)
        {
            return flag;
        } else
        {
            return Boolean.valueOf(s).booleanValue();
        }
    }

    public String getReferrer(Context context)
    {
        if (referrer != null)
        {
            return referrer;
        } else
        {
            return context.getSharedPreferences("appsflyer-data", 0).getString("referrer", null);
        }
    }

    public boolean isDisableLog()
    {
        return isDisableLog;
    }

    protected boolean isLaunchCalled()
    {
        return isLaunchCalled;
    }

    protected boolean isOnReceiveCalled()
    {
        return isOnReceiveCalled;
    }

    public void set(String s, String s1)
    {
        properties.put(s, s1);
    }

    public void set(String s, boolean flag)
    {
        properties.put(s, Boolean.toString(flag));
    }

    protected void setLaunchCalled()
    {
        isLaunchCalled = true;
    }

    protected void setOnReceiveCalled()
    {
        isOnReceiveCalled = true;
    }

    protected void setReferrer(String s)
    {
        referrer = s;
    }

}
