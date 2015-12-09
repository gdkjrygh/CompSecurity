// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.configuration;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.util.PreferenceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Configuration
{

    public static final String BOOKMARK_END_MARK = "bookmark-end-mark";
    public static final String BOOKMARK_START_MARK = "bookmark-start-mark";
    public static final String CRASH_REPORTING_SERVICE = "crash-reporting";
    private static final String PARAMETERS[] = {
        "ui_loading_workflow_type", "bookmark-start-mark", "bookmark-end-mark", "crash-reporting"
    };
    private static final String TAG = "ConfigurationAPI";
    public static final String UI_LOADING_WORKFLOW_TYPE = "ui_loading_workflow_type";
    private static Map appConfiguration = new HashMap();

    private Configuration()
    {
    }

    public static String getApplicationConfigData(String s)
    {
        com/netflix/mediaclient/configuration/Configuration;
        JVM INSTR monitorenter ;
        s = (String)appConfiguration.get(s);
        com/netflix/mediaclient/configuration/Configuration;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public static String[] getConfigList()
    {
        com/netflix/mediaclient/configuration/Configuration;
        JVM INSTR monitorenter ;
        String as[];
        ArrayList arraylist = new ArrayList();
        arraylist.add("bookmark-start-mark");
        arraylist.add("bookmark-end-mark");
        as = (String[])arraylist.toArray(new String[arraylist.size()]);
        com/netflix/mediaclient/configuration/Configuration;
        JVM INSTR monitorexit ;
        return as;
        Exception exception;
        exception;
        throw exception;
    }

    private static boolean isApplicationConfiguration(String s)
    {
        for (int i = 0; i < PARAMETERS.length; i++)
        {
            if (PARAMETERS[i].equals(s))
            {
                return true;
            }
        }

        return false;
    }

    public static void load(Context context)
    {
        com/netflix/mediaclient/configuration/Configuration;
        JVM INSTR monitorenter ;
        context = PreferenceUtils.getStringPref(context, "ui_loading_workflow_type", null);
        if (context != null) goto _L2; else goto _L1
_L1:
        Log.d("ConfigurationAPI", "UI load workflow type NOT found in preferences.");
_L4:
        com/netflix/mediaclient/configuration/Configuration;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (Log.isLoggable("ConfigurationAPI", 3))
        {
            Log.d("ConfigurationAPI", (new StringBuilder()).append("UI load workflow type found in preferences with value: ").append(context).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    public static void setConfigData(NetflixApplication netflixapplication, String s, String s1)
    {
        com/netflix/mediaclient/configuration/Configuration;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("ConfigurationAPI", 3))
        {
            Log.d("ConfigurationAPI", (new StringBuilder()).append("nrdp.setConfigData: type =  ").append(s).append(", data = ").append(s1).toString());
        }
          goto _L1
_L3:
        Log.e("ConfigurationAPI", "PArameteres can not be null!");
_L2:
        com/netflix/mediaclient/configuration/Configuration;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (!isApplicationConfiguration(s))
        {
            break MISSING_BLOCK_LABEL_96;
        }
        Log.d("ConfigurationAPI", "nrdp.setConfigData: application bookmark");
        appConfiguration.put(s, s1);
          goto _L2
        netflixapplication;
        throw netflixapplication;
        Log.e("ConfigurationAPI", "Uknown property");
          goto _L2
_L1:
        if (s != null && s1 != null) goto _L4; else goto _L3
    }

    public static void updateConfigData(Context context, Map map)
    {
        com/netflix/mediaclient/configuration/Configuration;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("ConfigurationAPI", 3))
        {
            Log.d("ConfigurationAPI", (new StringBuilder()).append("updateConfigData: parameters found:  ").append(map.size()).toString());
        }
        String s1;
        for (Iterator iterator = appConfiguration.keySet().iterator(); iterator.hasNext(); PreferenceUtils.removePref(context, s1))
        {
            s1 = (String)iterator.next();
            if (Log.isLoggable("ConfigurationAPI", 3))
            {
                Log.d("ConfigurationAPI", (new StringBuilder()).append("updateConfigData: Removing: ").append(s1).toString());
            }
        }

        break MISSING_BLOCK_LABEL_124;
        context;
        throw context;
        String s;
        String s2;
        s = (String)appConfiguration.get("bookmark-start-mark");
        s2 = (String)appConfiguration.get("bookmark-end-mark");
        appConfiguration.clear();
        if (map.size() > 0)
        {
            appConfiguration.putAll(map);
            String s3;
            String s4;
            for (Iterator iterator1 = map.keySet().iterator(); iterator1.hasNext(); PreferenceUtils.putStringPref(context, s3, s4))
            {
                s3 = (String)iterator1.next();
                s4 = (String)map.get(s3);
                if (Log.isLoggable("ConfigurationAPI", 3))
                {
                    Log.d("ConfigurationAPI", (new StringBuilder()).append("updateConfigData: add parameter: ").append(s3).append(" with value ").append(s4).toString());
                }
            }

        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_333;
        }
        if (Log.isLoggable("ConfigurationAPI", 3))
        {
            Log.d("ConfigurationAPI", (new StringBuilder()).append("updateConfigData: add parameter: bookmark-start-mark with value ").append(s).toString());
        }
        appConfiguration.put("bookmark-start-mark", s);
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_383;
        }
        if (Log.isLoggable("ConfigurationAPI", 3))
        {
            Log.d("ConfigurationAPI", (new StringBuilder()).append("updateConfigData: add parameter: bookmark-end-mark with value ").append(s2).toString());
        }
        appConfiguration.put("bookmark-end-mark", s2);
        com/netflix/mediaclient/configuration/Configuration;
        JVM INSTR monitorexit ;
    }

}
