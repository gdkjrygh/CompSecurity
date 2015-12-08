// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.content.Context;

// Referenced classes of package com.adjust.sdk:
//            LogLevel, AdjustFactory, ILogger, Util, 
//            OnAttributionChangedListener

public class AdjustConfig
{

    public static final String ENVIRONMENT_PRODUCTION = "production";
    public static final String ENVIRONMENT_SANDBOX = "sandbox";
    String appToken;
    Context context;
    String defaultTracker;
    String environment;
    Boolean eventBufferingEnabled;
    Boolean knownDevice;
    LogLevel logLevel;
    OnAttributionChangedListener onAttributionChangedListener;
    String processName;
    String referrer;
    long referrerClickTime;
    String sdkPrefix;

    public AdjustConfig(Context context1, String s, String s1)
    {
        if (!isValid(context1, s, s1))
        {
            return;
        } else
        {
            context = context1.getApplicationContext();
            appToken = s;
            environment = s1;
            logLevel = LogLevel.INFO;
            eventBufferingEnabled = Boolean.valueOf(false);
            return;
        }
    }

    private static boolean checkAppToken(String s)
    {
        ILogger ilogger = AdjustFactory.getLogger();
        if (s == null)
        {
            ilogger.error("Missing App Token", new Object[0]);
            return false;
        }
        if (s.length() != 12)
        {
            ilogger.error("Malformed App Token '%s'", new Object[] {
                s
            });
            return false;
        } else
        {
            return true;
        }
    }

    private static boolean checkContext(Context context1)
    {
        ILogger ilogger = AdjustFactory.getLogger();
        if (context1 == null)
        {
            ilogger.error("Missing context", new Object[0]);
            return false;
        }
        if (!Util.checkPermission(context1, "android.permission.INTERNET"))
        {
            ilogger.error("Missing permission: INTERNET", new Object[0]);
            return false;
        } else
        {
            return true;
        }
    }

    private static boolean checkEnvironment(String s)
    {
        ILogger ilogger = AdjustFactory.getLogger();
        if (s == null)
        {
            ilogger.error("Missing environment", new Object[0]);
            return false;
        }
        if (s.equals("sandbox"))
        {
            ilogger.Assert("SANDBOX: Adjust is running in Sandbox mode. Use this setting for testing. Don't forget to set the environment to `production` before publishing!", new Object[0]);
            return true;
        }
        if (s.equals("production"))
        {
            ilogger.Assert("PRODUCTION: Adjust is running in Production mode. Use this setting only for the build that you want to publish. Set the environment to `sandbox` if you want to test your app!", new Object[0]);
            return true;
        } else
        {
            ilogger.error("Unknown environment '%s'", new Object[] {
                s
            });
            return false;
        }
    }

    private boolean isValid(Context context1, String s, String s1)
    {
        while (!checkAppToken(s) || !checkEnvironment(s1) || !checkContext(context1)) 
        {
            return false;
        }
        return true;
    }

    public boolean hasListener()
    {
        return onAttributionChangedListener != null;
    }

    public boolean isValid()
    {
        return appToken != null;
    }

    public void setDefaultTracker(String s)
    {
        defaultTracker = s;
    }

    public void setEventBufferingEnabled(Boolean boolean1)
    {
        eventBufferingEnabled = boolean1;
    }

    public void setLogLevel(LogLevel loglevel)
    {
        logLevel = loglevel;
    }

    public void setOnAttributionChangedListener(OnAttributionChangedListener onattributionchangedlistener)
    {
        onAttributionChangedListener = onattributionchangedlistener;
    }

    public void setProcessName(String s)
    {
        processName = s;
    }

    public void setSdkPrefix(String s)
    {
        sdkPrefix = s;
    }
}
