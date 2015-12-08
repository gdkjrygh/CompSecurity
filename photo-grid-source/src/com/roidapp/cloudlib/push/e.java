// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.push;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.b;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.d.a;
import com.roidapp.cloudlib.ads.q;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.notification.x;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.push:
//            GcmBroadcastReceiver, f

public final class e
{

    static String a(Context context)
    {
        Object obj;
        try
        {
            context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        obj = context;
        if (context == null)
        {
            obj = "Unknown";
        }
        return ((String) (obj));
    }

    private static String a(String s, Map map)
    {
        Object obj;
        URL url;
        byte abyte0[];
        try
        {
            url = new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid url: ")).append(s).toString());
        }
        s = new StringBuilder();
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            s.append((String)entry.getKey()).append('=').append((String)entry.getValue());
            if (map.hasNext())
            {
                s.append('&');
            }
        } while (true);
        abyte0 = s.toString().getBytes();
        s = null;
        obj = null;
        map = (HttpURLConnection)url.openConnection();
        int i;
        map.setDoOutput(true);
        map.setUseCaches(false);
        map.setFixedLengthStreamingMode(abyte0.length);
        map.setRequestMethod("POST");
        map.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        s = map.getOutputStream();
        s.write(abyte0);
        s.close();
        i = map.getResponseCode();
        if (i == 200) goto _L2; else goto _L1
_L1:
        try
        {
            throw new IOException((new StringBuilder("Post failed with error code ")).append(i).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            s = map;
        }
        finally { }
        map = ((Map) (obj));
_L4:
        throw new IOException(map.getMessage());
        obj;
        map = s;
        s = ((String) (obj));
        if (map != null)
        {
            try
            {
                map.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (Map map) { }
        }
        throw s;
_L2:
        s = com.roidapp.baselib.d.a.a(map.getInputStream(), "UTF-8");
        if (map != null)
        {
            try
            {
                map.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                return s;
            }
        }
        return s;
        map;
        s = ((String) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String a(Locale locale)
    {
        if (locale == null)
        {
            locale = "en";
        } else
        {
            String s = locale.getLanguage();
            locale = s;
            if ("zh".equals(s))
            {
                if ("CN".equals(Locale.getDefault().getCountry()))
                {
                    return "zh_CN";
                } else
                {
                    return "zh_TW";
                }
            }
        }
        return locale;
    }

    static boolean a(String s, int i, String s1, String s2)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("regid", s2);
        hashmap.put("appflag", "photogrid");
        hashmap.put("aid", s1);
        hashmap.put("access_token", s);
        hashmap.put("action", String.valueOf(i));
        boolean flag;
        s = a("http://cm.gcm.ksmobile.com/rpc/user/device", ((Map) (hashmap)));
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_114;
        }
        flag = "0".equals((new JSONObject(s)).getString("code"));
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_114;
        s;
        throw s;
        s;
_L2:
        return false;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static f[] a(Context context, String s)
    {
        if (s != null && context != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Bundle bundle;
        Object obj;
        int i;
        obj = new JSONObject(s);
        i = ((JSONObject) (obj)).optInt("type", 0);
        s = ((JSONObject) (obj)).getString("pushid");
        bundle = new Bundle();
        bundle.putInt("pushType", i);
        bundle.putString("pushid", s);
        com.roidapp.baselib.c.b.b("receive", s);
        if (al.g().c(context))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        com.roidapp.baselib.c.b.b("pushoff", s);
        return null;
        i;
        JVM INSTR tableswitch 1 13: default 160
    //                   1 162
    //                   2 246
    //                   3 274
    //                   4 370
    //                   5 8
    //                   6 8
    //                   7 8
    //                   8 8
    //                   9 400
    //                   10 433
    //                   11 486
    //                   12 515
    //                   13 522;
           goto _L3 _L4 _L5 _L6 _L7 _L1 _L1 _L1 _L1 _L8 _L9 _L10 _L11 _L12
_L12:
        continue; /* Loop/switch isn't completed */
_L3:
        return null;
_L4:
        i = ((JSONObject) (obj)).optInt("version", -1);
        if (n.c(context) >= i) goto _L1; else goto _L13
_L13:
        bundle.putInt("version", i);
        i = 0;
_L15:
        try
        {
            context = ((JSONObject) (obj)).getString("title");
            obj = ((JSONObject) (obj)).getString("content");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        String s1;
        String s2;
        String s3;
        long l;
        boolean flag;
        if (i != 0)
        {
            i = com.roidapp.cloudlib.push.GcmBroadcastReceiver.b;
        } else
        {
            i = com.roidapp.cloudlib.push.GcmBroadcastReceiver.a;
        }
        return (new f[] {
            new f(4, i, GcmBroadcastReceiver.c, s, context, ((String) (obj)), bundle, null, true)
        });
_L5:
        if (b(context)) goto _L1; else goto _L14
_L14:
        bundle.putInt("page", ((JSONObject) (obj)).optInt("page", 0));
        i = 1;
          goto _L15
_L6:
        s1 = ((JSONObject) (obj)).optString("package", null);
        s2 = ((JSONObject) (obj)).optString("url", null);
        s3 = ((JSONObject) (obj)).optString("playUrl", null);
        if (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2) && TextUtils.isEmpty(s3) || n.a(context, s1)) goto _L1; else goto _L16
_L16:
        bundle.putString("package", s1);
        bundle.putString("url", s2);
        bundle.putString("playUrl", s3);
        i = 0;
          goto _L15
_L7:
        context = ((JSONObject) (obj)).optString("url", null);
        if (TextUtils.isEmpty(context)) goto _L1; else goto _L17
_L17:
        bundle.putString("url", context);
        i = 0;
          goto _L15
_L8:
        if (!context.getSharedPreferences("MainPage", 0).getBoolean("mother's_day", true) || b(context)) goto _L1; else goto _L18
_L18:
        i = 1;
          goto _L15
_L9:
        l = ((JSONObject) (obj)).optLong("templateID", -1L);
        if (l == -1L) goto _L1; else goto _L19
_L19:
        if (l <= PreferenceManager.getDefaultSharedPreferences(context).getLong("newestHotID", 0L) || b(context)) goto _L1; else goto _L20
_L20:
        i = 0;
          goto _L15
_L10:
        context = q.b().a(((JSONObject) (obj)));
        if (!q.b(context)) goto _L1; else goto _L21
_L21:
        bundle.putAll(q.a(context));
        i = 0;
          goto _L15
_L11:
        return x.a(context, ((JSONObject) (obj)), bundle);
        if (af.a(aj.a()) || PreferenceManager.getDefaultSharedPreferences(context).getBoolean("QPicShow", false)) goto _L1; else goto _L22
_L22:
        flag = b(context);
        if (flag) goto _L1; else goto _L23
_L23:
        i = 0;
          goto _L15
    }

    private static boolean b(Context context)
    {
label0:
        {
            context = (ActivityManager)context.getSystemService("activity");
            if (context == null)
            {
                break label0;
            }
            context = context.getRunningTasks(100);
            if (context == null)
            {
                break label0;
            }
            context = context.iterator();
            do
            {
                if (!context.hasNext())
                {
                    break label0;
                }
            } while (!"com.roidapp.photogrid".equals(((android.app.ActivityManager.RunningTaskInfo)context.next()).baseActivity.getPackageName()));
            return true;
        }
        return false;
    }

    static boolean b(Context context, String s)
    {
        if (context != null && !TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        HashMap hashmap;
        String s1 = a(context);
        hashmap = new HashMap();
        hashmap.put("regid", s);
        hashmap.put("appflag", "photogrid");
        hashmap.put("aid", s1);
        hashmap.put("apkversion", String.valueOf(n.c(context)));
        hashmap.put("manufacture", Build.MANUFACTURER);
        hashmap.put("cl", a(Locale.getDefault()));
        hashmap.put("phonelanguage", a(context.getResources().getConfiguration().locale));
        hashmap.put("timezone", TimeZone.getDefault().getID());
        hashmap.put("country", Locale.getDefault().getCountry());
        context = a("http://cm.gcm.ksmobile.com/rpc/gcm/report", hashmap);
        if (TextUtils.isEmpty(context)) goto _L1; else goto _L3
_L3:
        boolean flag = "0".equals((new JSONObject(context)).getString("code"));
        if (!flag) goto _L1; else goto _L4
_L4:
        return true;
        context;
        throw context;
        context;
        return false;
        context;
        return false;
    }
}
