// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.common.Log;
import com.umeng.common.b;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;

class h
{

    h()
    {
    }

    static SharedPreferences a(Context context)
    {
        return context.getSharedPreferences((new StringBuilder("mobclick_agent_user_")).append(context.getPackageName()).toString(), 0);
    }

    static void a(Context context, JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return;
        }
        String s = g(context);
        try
        {
            jsonobject.put("cache_version", com.umeng.common.b.d(context));
            context = context.openFileOutput(s, 0);
            context.write(jsonobject.toString().getBytes());
            context.flush();
            context.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.b("MobclickAgent", "cache message error", context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.b("MobclickAgent", "cache message error", context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.b("MobclickAgent", "message is null", context);
        }
    }

    static SharedPreferences b(Context context)
    {
        return context.getSharedPreferences((new StringBuilder("mobclick_agent_online_setting_")).append(context.getPackageName()).toString(), 0);
    }

    static void b(Context context, JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return;
        }
        Object obj = null;
        try
        {
            jsonobject = jsonobject.optJSONObject("body");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            jsonobject = obj;
        }
        a(context, jsonobject);
    }

    static SharedPreferences c(Context context)
    {
        return context.getSharedPreferences((new StringBuilder("mobclick_agent_header_")).append(context.getPackageName()).toString(), 0);
    }

    static SharedPreferences d(Context context)
    {
        return context.getSharedPreferences((new StringBuilder("mobclick_agent_update_")).append(context.getPackageName()).toString(), 0);
    }

    static SharedPreferences e(Context context)
    {
        return context.getSharedPreferences((new StringBuilder("mobclick_agent_state_")).append(context.getPackageName()).toString(), 0);
    }

    static String f(Context context)
    {
        return (new StringBuilder("mobclick_agent_header_")).append(context.getPackageName()).toString();
    }

    static String g(Context context)
    {
        return (new StringBuilder("mobclick_agent_cached_")).append(context.getPackageName()).toString();
    }

    static JSONObject h(Context context)
    {
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        context = a(context);
        int k;
        if (context.getInt("gender", -1) != -1)
        {
            jsonobject.put("sex", context.getInt("gender", -1));
        }
        if (context.getInt("age", -1) != -1)
        {
            jsonobject.put("age", context.getInt("age", -1));
        }
        if (!"".equals(context.getString("user_id", "")))
        {
            jsonobject.put("id", context.getString("user_id", ""));
        }
        if (!"".equals(context.getString("id_source", "")))
        {
            jsonobject.put("url", URLEncoder.encode(context.getString("id_source", "")));
        }
        k = jsonobject.length();
        if (k > 0)
        {
            return jsonobject;
        }
        break MISSING_BLOCK_LABEL_160;
        context;
        context.printStackTrace();
        return null;
    }

    static JSONObject i(Context context)
    {
        Object obj = g(context);
        JSONException jsonexception;
        FileInputStream fileinputstream;
        byte abyte0[];
        int k;
        try
        {
            fileinputstream = context.openFileInput(((String) (obj)));
            abyte0 = new byte[1024];
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        obj = "";
        k = fileinputstream.read(abyte0);
        if (k != -1)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        fileinputstream.close();
        if (((String) (obj)).length() == 0)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_78;
        obj = (new StringBuilder(String.valueOf(obj))).append(new String(abyte0, 0, k)).toString();
        break MISSING_BLOCK_LABEL_20;
        obj = new JSONObject(((String) (obj)));
        return ((JSONObject) (obj));
        jsonexception;
        j(context);
        jsonexception.printStackTrace();
        return null;
    }

    static void j(Context context)
    {
        context.deleteFile(f(context));
        context.deleteFile(g(context));
    }
}
