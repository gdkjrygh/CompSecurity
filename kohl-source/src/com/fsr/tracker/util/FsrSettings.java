// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.util;

import com.fsr.tracker.FsrSettingsProvider;
import java.util.ResourceBundle;

public class FsrSettings
    implements FsrSettingsProvider
{

    public static final String ENV_DEV = "DEV";
    public static final String ENV_KEY = "env";
    public static final String ENV_PROD = "PROD";
    public static final String ENV_QA = "QA";
    private ResourceBundle bundle;

    public FsrSettings()
    {
        bundle = ResourceBundle.getBundle("tracker");
    }

    public String getAppRevision()
    {
        return ResourceBundle.getBundle("version").getString("appRevision");
    }

    public String getOnExitSurveyUrl(String s, String s1, String s2)
    {
        return String.format(bundle.getString("onExitSurveyUrlTemplate"), new Object[] {
            getOnExitUrlBase(), s, s1, s2
        });
    }

    public String getOnExitUrlBase()
    {
        String s = bundle.getString("env");
        if (s != null)
        {
            s = s.toUpperCase();
            if (s.equals("DEV"))
            {
                return bundle.getString("onExitServiceDev");
            }
            if (s.equals("QA"))
            {
                return bundle.getString("onExitServiceQa");
            }
            if (s.equals("PROD"))
            {
                return bundle.getString("onExitServiceProd");
            }
        }
        return bundle.getString("onExitServiceDev");
    }

    public String getTriggerVersion()
    {
        return ResourceBundle.getBundle("version").getString("triggerVersion");
    }
}
