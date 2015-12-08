// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.worklight.common.Logger;
import org.json.JSONException;
import org.json.JSONObject;

public final class LoggerServerConfigProcessor
{

    public LoggerServerConfigProcessor()
    {
    }

    public static void processLoggerServerConfig(JSONObject jsonobject, Context context)
        throws JSONException
    {
        if (jsonobject.has("capture"))
        {
            context.getSharedPreferences(Logger.SHARED_PREF_KEY, 0).edit().putBoolean("logPersistenceFromServer", jsonobject.getBoolean("capture")).commit();
        }
        if (jsonobject.has("level"))
        {
            context.getSharedPreferences(Logger.SHARED_PREF_KEY, 0).edit().putString("levelFromServer", jsonobject.getString("level")).commit();
        }
        if (jsonobject.has("filters"))
        {
            jsonobject = jsonobject.getJSONObject("filters");
            context = context.getSharedPreferences(Logger.SHARED_PREF_KEY, 0).edit();
            if (jsonobject == null)
            {
                jsonobject = "{}";
            } else
            {
                jsonobject = jsonobject.toString();
            }
            context.putString("filtersFromServer", jsonobject).commit();
            return;
        } else
        {
            context.getSharedPreferences(Logger.SHARED_PREF_KEY, 0).edit().putString("filtersFromServer", "{}").commit();
            return;
        }
    }

    public static void removeServerLoggerConfigOverrides(Context context)
    {
        context = context.getSharedPreferences(Logger.SHARED_PREF_KEY, 0);
        android.content.SharedPreferences.Editor editor = context.edit();
        editor.remove("logPersistenceFromServer");
        editor.remove("levelFromServer");
        editor.remove("filtersFromServer");
        editor.commit();
        Logger.setLevel(com.worklight.common.Logger.LEVEL.fromString(context.getString("level", Logger.getLevelDefault().toString())));
        Logger.setCapture(context.getBoolean("logPersistence", true));
        try
        {
            Logger.setFilters(Logger.JSONObjectToHashMap(new JSONObject(context.getString("filters", "{}"))));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }
}
