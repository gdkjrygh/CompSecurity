// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.splunk.mint:
//            RemoteSettingsData, Logger

class RemoteSettings
{

    private static final String DEVSETTINGS = "devSettings";
    private static final String EVENTLEVEL = "eventLevel";
    private static final String HASHCODE = "hashCode";
    private static final String LOGLEVEL = "logLevel";
    private static final String NETWORKMONITORING = "netMonitoring";
    private static final String REMOTESETTINGS_API = "1";
    private static final String REMOTESETTINGS_NAME = "remSetVer";
    private static final String SESSIONTIME = "sessionTime";
    private static final String SHARED_PREFERENSES_NAME = "REMOTESETTINGSSETTINGS";

    RemoteSettings()
    {
    }

    protected static final RemoteSettingsData convertJsonToRemoteSettings(String s)
    {
        if (s != null && s.length() >= 1) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        RemoteSettingsData remotesettingsdata = new RemoteSettingsData();
        JSONObject jsonobject;
        try
        {
            jsonobject = (new JSONObject(s)).optJSONObject("remSetVer1");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.logError("Could not convert json to remote data");
            return remotesettingsdata;
        }
        s = remotesettingsdata;
        if (jsonobject == null) goto _L4; else goto _L3
_L3:
        remotesettingsdata.logLevel = Integer.valueOf(jsonobject.optInt("logLevel"));
        remotesettingsdata.eventLevel = Integer.valueOf(jsonobject.getInt("eventLevel"));
        remotesettingsdata.netMonitoring = Boolean.valueOf(jsonobject.optBoolean("netMonitoring"));
        remotesettingsdata.sessionTime = Integer.valueOf(jsonobject.optInt("sessionTime"));
        remotesettingsdata.devSettings = jsonobject.optJSONObject("devSettings").toString();
        remotesettingsdata.hashCode = jsonobject.optString("hash");
        return remotesettingsdata;
    }

    protected static final RemoteSettingsData loadRemoteSettings(Context context)
    {
        RemoteSettingsData remotesettingsdata = new RemoteSettingsData();
        context = context.getSharedPreferences("REMOTESETTINGSSETTINGS", 0);
        if (context == null)
        {
            return null;
        } else
        {
            remotesettingsdata.logLevel = Integer.valueOf(context.getInt("logLevel", Properties.RemoteSettingsProps.logLevel.intValue()));
            remotesettingsdata.eventLevel = Integer.valueOf(context.getInt("eventLevel", Properties.RemoteSettingsProps.eventLevel.intValue()));
            remotesettingsdata.netMonitoring = Boolean.valueOf(context.getBoolean("netMonitoring", Properties.RemoteSettingsProps.netMonitoringEnabled.booleanValue()));
            remotesettingsdata.sessionTime = Integer.valueOf(context.getInt("sessionTime", Properties.RemoteSettingsProps.sessionTime.intValue()));
            remotesettingsdata.devSettings = context.getString("devSettings", Properties.RemoteSettingsProps.devSettings.toString());
            remotesettingsdata.hashCode = context.getString("hashCode", Properties.RemoteSettingsProps.hashCode);
            return remotesettingsdata;
        }
    }

    protected static final boolean saveAndLoadRemoteSettings(Context context, RemoteSettingsData remotesettingsdata)
    {
        context = context.getSharedPreferences("REMOTESETTINGSSETTINGS", 0);
        if (context != null)
        {
            if ((context = context.edit()) != null)
            {
                if (remotesettingsdata.logLevel != null && remotesettingsdata.logLevel.intValue() > 0)
                {
                    context.putInt("logLevel", remotesettingsdata.logLevel.intValue());
                    Properties.RemoteSettingsProps.logLevel = remotesettingsdata.logLevel;
                }
                if (remotesettingsdata.eventLevel != null && remotesettingsdata.eventLevel.intValue() > 0)
                {
                    context.putInt("eventLevel", remotesettingsdata.eventLevel.intValue());
                    Properties.RemoteSettingsProps.eventLevel = remotesettingsdata.eventLevel;
                }
                if (remotesettingsdata.netMonitoring != null)
                {
                    context.putBoolean("netMonitoring", remotesettingsdata.netMonitoring.booleanValue());
                    Properties.RemoteSettingsProps.netMonitoringEnabled = remotesettingsdata.netMonitoring;
                }
                if (remotesettingsdata.sessionTime != null && remotesettingsdata.sessionTime.intValue() > 0)
                {
                    context.putInt("sessionTime", remotesettingsdata.sessionTime.intValue());
                    Properties.RemoteSettingsProps.sessionTime = remotesettingsdata.sessionTime;
                }
                if (remotesettingsdata.devSettings != null)
                {
                    context.putString("devSettings", remotesettingsdata.devSettings);
                    try
                    {
                        Properties.RemoteSettingsProps.devSettings = new JSONObject(remotesettingsdata.devSettings);
                    }
                    catch (JSONException jsonexception)
                    {
                        jsonexception.printStackTrace();
                    }
                }
                if (remotesettingsdata.hashCode != null && remotesettingsdata.hashCode.length() > 1)
                {
                    context.putString("hashCode", remotesettingsdata.hashCode);
                    Properties.RemoteSettingsProps.hashCode = remotesettingsdata.hashCode;
                }
                return context.commit();
            }
        }
        return false;
    }
}
