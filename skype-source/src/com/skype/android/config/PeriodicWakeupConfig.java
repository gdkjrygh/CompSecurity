// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config;

import java.util.Properties;

// Referenced classes of package com.skype.android.config:
//            PropertiesApplicable

public class PeriodicWakeupConfig
    implements PropertiesApplicable
{

    private static final String KEY_BACKGROUND_ENABLED = "periodic.background.enabled";
    private static final String KEY_FOREGROUND_ENABLED = "periodic.foreground.enabled";
    private static final String KEY_PERIODIC_BACKGROUND_TIME = "periodic.background.time";
    private static final String KEY_PERIODIC_FOREGROUND_TIME = "periodic.foreground.time";
    private static final String KEY_PERIODIC_PADDING_TIME = "periodic.padding.time";
    private int awakeAdjustmentTime;
    private int backgroundAwakeTime;
    private boolean backgroundTaskEnabled;
    private int foregroundAwakeTime;
    private boolean foregroundTaskEnabled;

    PeriodicWakeupConfig()
    {
        foregroundTaskEnabled = true;
        backgroundTaskEnabled = false;
        awakeAdjustmentTime = 3000;
        foregroundAwakeTime = 0x2bf20;
        backgroundAwakeTime = 30000;
    }

    public void applyFrom(Properties properties)
    {
        String s = (String)properties.get("periodic.foreground.enabled");
        String s1 = (String)properties.get("periodic.background.enabled");
        String s2 = (String)properties.get("periodic.padding.time");
        String s3 = (String)properties.get("periodic.foreground.time");
        properties = (String)properties.get("periodic.background.time");
        if (s != null)
        {
            foregroundTaskEnabled = Boolean.parseBoolean(s);
        }
        if (s1 != null)
        {
            backgroundTaskEnabled = Boolean.parseBoolean(s1);
        }
        if (s2 != null)
        {
            awakeAdjustmentTime = Integer.parseInt(s2);
        }
        if (s3 != null)
        {
            foregroundAwakeTime = Integer.parseInt(s3);
        }
        if (properties != null)
        {
            backgroundAwakeTime = Integer.parseInt(properties);
        }
    }

    public void applyTo(Properties properties)
    {
        properties.put("periodic.foreground.enabled", String.valueOf(foregroundTaskEnabled));
        properties.put("periodic.background.enabled", String.valueOf(backgroundTaskEnabled));
        properties.put("periodic.padding.time", String.valueOf(awakeAdjustmentTime));
        properties.put("periodic.foreground.time", String.valueOf(foregroundAwakeTime));
        properties.put("periodic.background.time", String.valueOf(backgroundAwakeTime));
    }

    public int getAwakeAdjustmentTime()
    {
        return awakeAdjustmentTime;
    }

    public int getBackgroundAwakeTime()
    {
        return backgroundAwakeTime;
    }

    public int getForegroundAwakeTime()
    {
        return foregroundAwakeTime;
    }

    public boolean isBackgroundTaskEnabled()
    {
        return backgroundTaskEnabled;
    }

    public boolean isForegroundTaskEnabled()
    {
        return foregroundTaskEnabled;
    }

    public void setAwakeAdjustmentTime(int i)
    {
        awakeAdjustmentTime = i;
    }

    public void setBackgroundAwakeTime(int i)
    {
        backgroundAwakeTime = i;
    }

    public void setBackgroundTaskEnabled(boolean flag)
    {
        backgroundTaskEnabled = flag;
    }

    public void setForegroundAwakeTime(int i)
    {
        foregroundAwakeTime = i;
    }

    public void setForegroundTaskEnabled(boolean flag)
    {
        foregroundTaskEnabled = flag;
    }
}
