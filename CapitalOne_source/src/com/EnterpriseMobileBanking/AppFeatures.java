// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.EnterpriseMobileBanking.Utils.Log;
import org.json.JSONObject;

public class AppFeatures
{

    private static final String TAG = "AppFeatures";
    private static final AppFeatures instance = new AppFeatures();
    private static JSONObject platformFeatures;

    private AppFeatures()
    {
    }

    public static AppFeatures getInstance()
    {
        return instance;
    }

    public static void setPlatformFeatures(JSONObject jsonobject)
    {
        com/EnterpriseMobileBanking/AppFeatures;
        JVM INSTR monitorenter ;
        platformFeatures = jsonobject;
        com/EnterpriseMobileBanking/AppFeatures;
        JVM INSTR monitorexit ;
        return;
        jsonobject;
        throw jsonobject;
    }

    public boolean getPlatformFeature(String s)
    {
        if (platformFeatures == null)
        {
            return false;
        } else
        {
            return platformFeatures.optBoolean(s, false);
        }
    }

    public JSONObject getPlatformFeatures()
    {
        return platformFeatures;
    }

    public boolean isFeatureEnabled(Context context, String s)
    {
        boolean flag;
        try
        {
            flag = PreferenceManager.getDefaultSharedPreferences(context).getBoolean(s, false);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("AppFeatures", (new StringBuilder()).append("isFeatureEnabled: ").append(context).toString());
            return false;
        }
        return flag;
    }

    public void setFeatureEnabled(Context context, String s, boolean flag)
    {
        try
        {
            context = PreferenceManager.getDefaultSharedPreferences(context).edit();
            context.putBoolean(s, flag);
            context.commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("AppFeatures", (new StringBuilder()).append("setFeatureEnabled: ").append(context).toString());
        }
    }

}
