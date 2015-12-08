// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.FitBitApplication;
import com.fitbit.e.a;
import com.fitbit.pedometer.j;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

public class s
{

    public static final String a = "com.fitbit.SavedState.SoftTrackerData.ACTION_LIVE_DATA_OFFSET_CHANGED";
    public static final String b = "com.fitbit.SavedState.SoftTrackerData.ACTION_SYNC_BACKOFF_STATE_CHANGED";
    public static final String c = "soft_tracker_data_offset_date_milliseconds_key";
    public static final String d = "soft_tracker_data_offset_steps_key";
    public static final String e = "soft_tracker_data_offset_calories_key";
    public static final String f = "soft_tracker_data_offset_distance_key";
    public static final String g = "soft_tracker_minute_data";
    public static final String h = "soft_tracker_uncompleted_minute_data_key";
    public static final String i = "soft_tracker_last_complete_minute_key";
    public static final String j = "soft_tracker_backoff_sync_till_date";
    public static final String k = "soft_tracker_backoff_sync_message";
    private static final String l = "SoftTrackerSavedState";
    private static final String m = "soft_tracker_wire_id_key";
    private static final String n = "soft_tracker_id_key";
    private static String o;
    private static String p;
    private static Map q;

    public s()
    {
    }

    public static String a()
    {
        if (o != null)
        {
            return o;
        } else
        {
            o = PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a()).getString("soft_tracker_wire_id_key", null);
            return o;
        }
    }

    public static void a(int i1, String s1)
    {
        com/fitbit/savedstate/s;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("SoftTrackerSavedState", "MOBILETRACK BACKOFF: Sync back off is turned on for %s sec", new Object[] {
            Integer.valueOf(i1)
        });
        android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a()).edit();
        editor.putLong("soft_tracker_backoff_sync_till_date", System.currentTimeMillis() + (long)i1 * 1000L);
        editor.putString("soft_tracker_backoff_sync_message", s1);
        editor.apply();
        l();
        com/fitbit/savedstate/s;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public static void a(long l1)
    {
        android.content.SharedPreferences.Editor editor = FitBitApplication.a().getSharedPreferences("soft_tracker_last_complete_minute_key", 0).edit();
        editor.putLong("soft_tracker_last_complete_minute_key", l1);
        editor.apply();
    }

    public static void a(String s1)
    {
        o = s1;
        s1 = PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a()).edit();
        s1.putString("soft_tracker_wire_id_key", o);
        s1.apply();
    }

    public static void a(List list)
    {
        Object obj = new JSONArray();
        try
        {
            for (list = list.iterator(); list.hasNext(); ((JSONArray) (obj)).put(((j)list.next()).e())) { }
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            com.fitbit.e.a.a("SoftTrackerSavedState", "Unable to store uncompleted minutes", list, new Object[0]);
        }
        list = ((JSONArray) (obj)).toString();
        obj = FitBitApplication.a().getSharedPreferences("soft_tracker_minute_data", 0).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putString("soft_tracker_uncompleted_minute_data_key", list);
        ((android.content.SharedPreferences.Editor) (obj)).apply();
    }

    public static void a(Map map)
    {
        q = map;
        map = PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a()).edit();
        map.putLong("soft_tracker_data_offset_date_milliseconds_key", ((Number)q.get("soft_tracker_data_offset_date_milliseconds_key")).longValue());
        map.putInt("soft_tracker_data_offset_steps_key", ((Number)q.get("soft_tracker_data_offset_steps_key")).intValue());
        map.putFloat("soft_tracker_data_offset_calories_key", ((Number)q.get("soft_tracker_data_offset_calories_key")).floatValue());
        map.putFloat("soft_tracker_data_offset_distance_key", ((Number)q.get("soft_tracker_data_offset_distance_key")).floatValue());
        map.apply();
        k();
    }

    public static String b()
    {
        if (p != null)
        {
            return p;
        } else
        {
            p = PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a()).getString("soft_tracker_id_key", null);
            return p;
        }
    }

    public static void b(String s1)
    {
        p = s1;
        s1 = PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a()).edit();
        s1.putString("soft_tracker_id_key", p);
        s1.apply();
    }

    public static Map c()
    {
        if (q != null)
        {
            return q;
        }
        Object obj = FitBitApplication.a();
        HashMap hashmap = new HashMap();
        obj = PreferenceManager.getDefaultSharedPreferences(((Context) (obj)));
        boolean flag;
        if (((SharedPreferences) (obj)).contains("soft_tracker_data_offset_date_milliseconds_key"))
        {
            hashmap.put("soft_tracker_data_offset_date_milliseconds_key", Long.valueOf(((SharedPreferences) (obj)).getLong("soft_tracker_data_offset_date_milliseconds_key", 0L)));
            flag = true;
        } else
        {
            flag = false;
        }
        if (((SharedPreferences) (obj)).contains("soft_tracker_data_offset_steps_key"))
        {
            hashmap.put("soft_tracker_data_offset_steps_key", Integer.valueOf(((SharedPreferences) (obj)).getInt("soft_tracker_data_offset_steps_key", 0)));
        }
        if (((SharedPreferences) (obj)).contains("soft_tracker_data_offset_calories_key"))
        {
            hashmap.put("soft_tracker_data_offset_calories_key", Float.valueOf(((SharedPreferences) (obj)).getFloat("soft_tracker_data_offset_calories_key", 0.0F)));
        }
        if (((SharedPreferences) (obj)).contains("soft_tracker_data_offset_distance_key"))
        {
            hashmap.put("soft_tracker_data_offset_distance_key", Float.valueOf(((SharedPreferences) (obj)).getFloat("soft_tracker_data_offset_distance_key", 0.0F)));
        }
        if (flag)
        {
            q = hashmap;
        }
        return q;
    }

    public static List d()
    {
        ArrayList arraylist;
        Object obj;
        arraylist = new ArrayList();
        obj = FitBitApplication.a().getSharedPreferences("soft_tracker_minute_data", 0).getString("soft_tracker_uncompleted_minute_data_key", "[]");
        obj = new JSONArray(((String) (obj)));
        int i1 = 0;
_L2:
        if (i1 >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(com.fitbit.pedometer.j.a(((JSONArray) (obj)).getJSONObject(i1)));
        i1++;
        if (true) goto _L2; else goto _L1
        JSONException jsonexception;
        jsonexception;
        com.fitbit.e.a.a("SoftTrackerSavedState", "Unable to restore uncompleted minutes", jsonexception, new Object[0]);
_L1:
        return arraylist;
    }

    public static boolean e()
    {
        com/fitbit/savedstate/s;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        l1 = PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a()).getLong("soft_tracker_backoff_sync_till_date", 0L);
        l2 = Calendar.getInstance().getTimeInMillis();
        boolean flag;
        if (l2 < l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com/fitbit/savedstate/s;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static long f()
    {
        com/fitbit/savedstate/s;
        JVM INSTR monitorenter ;
        long l1 = PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a()).getLong("soft_tracker_backoff_sync_till_date", 0L);
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        long l2 = Calendar.getInstance().getTimeInMillis();
        l1 -= l2;
_L1:
        if (l1 <= 0L)
        {
            l1 = 0L;
        }
        return l1;
        l1 = 0L;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    public static String g()
    {
        com/fitbit/savedstate/s;
        JVM INSTR monitorenter ;
        String s1 = PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a()).getString("soft_tracker_backoff_sync_message", null);
        com/fitbit/savedstate/s;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void h()
    {
        com/fitbit/savedstate/s;
        JVM INSTR monitorenter ;
        boolean flag;
        com.fitbit.e.a.a("SoftTrackerSavedState", "MOBILETRACK BACKOFF: Sync back off is turned off.", new Object[0]);
        Object obj = PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a());
        flag = ((SharedPreferences) (obj)).contains("soft_tracker_backoff_sync_till_date");
        obj = ((SharedPreferences) (obj)).edit();
        ((android.content.SharedPreferences.Editor) (obj)).remove("soft_tracker_backoff_sync_till_date");
        ((android.content.SharedPreferences.Editor) (obj)).remove("soft_tracker_backoff_sync_message");
        ((android.content.SharedPreferences.Editor) (obj)).apply();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        l();
        com/fitbit/savedstate/s;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static long i()
    {
        return FitBitApplication.a().getSharedPreferences("soft_tracker_last_complete_minute_key", 0).getLong("soft_tracker_last_complete_minute_key", 0L);
    }

    public static void j()
    {
        q = null;
        Object obj = FitBitApplication.a();
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(((Context) (obj)));
        ((Context) (obj)).getSharedPreferences("soft_tracker_minute_data", 0).edit().remove("soft_tracker_uncompleted_minute_data_key").apply();
        obj = sharedpreferences.edit();
        ((android.content.SharedPreferences.Editor) (obj)).remove("soft_tracker_data_offset_date_milliseconds_key");
        ((android.content.SharedPreferences.Editor) (obj)).remove("soft_tracker_data_offset_steps_key");
        ((android.content.SharedPreferences.Editor) (obj)).remove("soft_tracker_data_offset_calories_key");
        ((android.content.SharedPreferences.Editor) (obj)).remove("soft_tracker_data_offset_distance_key");
        ((android.content.SharedPreferences.Editor) (obj)).remove("soft_tracker_last_complete_minute_key");
        ((android.content.SharedPreferences.Editor) (obj)).apply();
        h();
    }

    private static void k()
    {
        LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcast(new Intent("com.fitbit.SavedState.SoftTrackerData.ACTION_LIVE_DATA_OFFSET_CHANGED"));
    }

    private static void l()
    {
        LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcast(new Intent("com.fitbit.SavedState.SoftTrackerData.ACTION_SYNC_BACKOFF_STATE_CHANGED"));
    }
}
