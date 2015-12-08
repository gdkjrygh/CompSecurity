// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ci, gs, ch, shelduck

public final class hi
{

    private static Random a;

    public static double a(double d)
    {
        if (a == null)
        {
            a = new Random();
        }
        return a.nextDouble() * d;
    }

    public static String a()
    {
        String s;
        try
        {
            s = ci.b().u.getPackageManager().getPackageInfo(ci.b().u.getPackageName(), 0).versionName;
        }
        catch (Exception exception)
        {
            gs.b("appVersion error", exception);
            return "";
        }
        return s;
    }

    public static void a(Runnable runnable)
    {
        if (ci.b().v != null)
        {
            ci.b().v.runOnUiThread(runnable);
            return;
        } else
        {
            (new Handler(Looper.getMainLooper())).post(runnable);
            return;
        }
    }

    public static void a(Map map, StringBuilder stringbuilder)
    {
        if (map != null && stringbuilder != null)
        {
            boolean flag = stringbuilder.toString().contains("?");
            Iterator iterator = map.entrySet().iterator();
            map = Integer.valueOf(0);
            while (iterator.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (map.intValue() == 0 && !flag)
                {
                    stringbuilder.append("?");
                } else
                {
                    stringbuilder.append("&");
                }
                stringbuilder.append((String)entry.getKey()).append("=").append(entry.getValue().toString());
                map = Integer.valueOf(map.intValue() + 1);
            }
        }
    }

    public static boolean a(Context context, String s)
    {
        return context.checkCallingOrSelfPermission(s) == 0;
    }

    public static boolean a(shelduck shelduck1)
    {
        return ch.a().a.contains(shelduck1.B);
    }

    public static boolean a(String s)
    {
        try
        {
            new JSONObject(s);
        }
        catch (JSONException jsonexception)
        {
            try
            {
                new JSONArray(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return false;
            }
        }
        return true;
    }

    public static int b()
    {
        int i;
        try
        {
            i = ci.b().u.getPackageManager().getPackageInfo(ci.b().u.getPackageName(), 0).versionCode;
        }
        catch (Exception exception)
        {
            gs.b("appVersion error", exception);
            return 0;
        }
        return i;
    }
}
