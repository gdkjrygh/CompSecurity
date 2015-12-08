// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

// Referenced classes of package com.skype.android.config:
//            PropertiesApplicable

public class LoggingConfig
    implements PropertiesApplicable
{

    public static final String KEY_FILTERS = "app.log.filters";
    public static final String KEY_SAVE_APP_LOGS = "app.logs.enable";
    public static final String KEY_SAVE_CL_LOGS = "corelib.logs.enable";
    private List filters;
    private boolean saveAppLogs;
    private boolean saveCorelibLogs;

    public LoggingConfig()
    {
    }

    public void applyFrom(Properties properties)
    {
        saveAppLogs = Boolean.valueOf(properties.getProperty("app.logs.enable")).booleanValue();
        saveCorelibLogs = Boolean.valueOf(properties.getProperty("corelib.logs.enable")).booleanValue();
        properties = properties.getProperty("app.log.filters");
        if (properties != null)
        {
            if (filters == null)
            {
                filters = new ArrayList();
            }
            properties = properties.split(",");
            if (properties != null)
            {
                int j = properties.length;
                for (int i = 0; i < j; i++)
                {
                    String s = properties[i];
                    filters.add(s.trim());
                }

            }
        }
    }

    public void applyTo(Properties properties)
    {
        properties.put("app.logs.enable", String.valueOf(saveAppLogs));
        properties.put("corelib.logs.enable", String.valueOf(saveCorelibLogs));
    }

    public List getFilters()
    {
        return filters;
    }

    public boolean saveAppLogs()
    {
        return saveAppLogs;
    }

    public boolean saveCorelibLogs()
    {
        return saveCorelibLogs;
    }

    public void setFilters(List list)
    {
        filters = list;
    }

    public void setSaveAppLogs(boolean flag)
    {
        saveAppLogs = flag;
    }

    public void setSaveCorelibLogs(boolean flag)
    {
        saveCorelibLogs = flag;
    }
}
