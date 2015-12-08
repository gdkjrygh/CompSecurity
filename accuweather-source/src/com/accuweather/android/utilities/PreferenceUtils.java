// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PreferenceUtils
{

    public PreferenceUtils()
    {
    }

    public static int get(Context context, String s, int i)
    {
        int j;
        try
        {
            j = getSharedPreferences(context).getInt(s, i);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return i;
        }
        return j;
    }

    public static String get(Context context, String s, String s1)
    {
        return getSharedPreferences(context).getString(s, s1);
    }

    public static boolean get(Context context, String s, boolean flag)
    {
        return getSharedPreferences(context).getBoolean(s, flag);
    }

    public static long getLong(Context context, String s, long l)
    {
        return getSharedPreferences(context).getLong(s, l);
    }

    private static SharedPreferences getSharedPreferences(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    private static void persist(android.content.SharedPreferences.Editor editor)
    {
        editor.commit();
    }

    public static void save(Context context, String s, int i)
    {
        persist(getSharedPreferences(context).edit().putInt(s, i));
    }

    public static void save(Context context, String s, long l)
    {
        persist(getSharedPreferences(context).edit().putLong(s, l));
    }

    public static void save(Context context, String s, String s1)
    {
        persist(getSharedPreferences(context).edit().putString(s, s1));
    }

    public static void save(Context context, String s, boolean flag)
    {
        persist(getSharedPreferences(context).edit().putBoolean(s, flag));
    }

    public static void save(Context context, Map map)
    {
        context = getSharedPreferences(context).edit();
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            Object obj = map.get(s);
            if (obj instanceof String)
            {
                context.putString(s, (String)obj);
            } else
            if (obj instanceof Boolean)
            {
                context.putBoolean(s, ((Boolean)obj).booleanValue());
            } else
            if (obj instanceof Integer)
            {
                context.putInt(s, ((Integer)obj).intValue());
            } else
            if (obj instanceof Long)
            {
                context.putLong(s, ((Long)obj).longValue());
            } else
            if (obj instanceof Float)
            {
                context.putFloat(s, ((Float)obj).floatValue());
            }
        } while (true);
        context.commit();
    }
}
