// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharedPref
{

    public SharedPref()
    {
    }

    public static boolean getBoolean(Context context, String s, boolean flag)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(s, flag);
    }

    public static double getDouble(Context context, String s, double d)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context).getString(s, String.valueOf(d));
        double d1;
        try
        {
            d1 = Double.valueOf(context).doubleValue();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return d;
        }
        return d1;
    }

    public static int getInt(Context context, String s, int i)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        Object obj;
        try
        {
            obj = context.getString(s, null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            int j;
            try
            {
                j = context.getInt(s, i);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return i;
            }
            return j;
        }
        if (obj == null)
        {
            return i;
        }
        try
        {
            j = Integer.valueOf(((String) (obj))).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return i;
        }
        return j;
    }

    public static long getLong(Context context, String s, long l)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        Object obj;
        try
        {
            obj = context.getString(s, null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return context.getLong(s, l);
        }
        if (obj == null)
        {
            return l;
        }
        long l1;
        try
        {
            l1 = Long.valueOf(((String) (obj))).longValue();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return l;
        }
        return l1;
    }

    public static String getString(Context context, String s, String s1)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(s, s1);
    }

    public static void removeKey(Context context, String s)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context).edit();
        context.remove(s);
        context.commit();
    }

    public static void setBoolean(Context context, String s, boolean flag)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context).edit();
        context.putBoolean(s, flag);
        context.commit();
    }

    public static void setDouble(Context context, String s, double d)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context).edit();
        context.putString(s, String.valueOf(d));
        context.commit();
    }

    public static void setInt(Context context, String s, int i)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context).edit();
        try
        {
            context.putString(s, String.valueOf(i));
        }
        catch (Exception exception)
        {
            context.putInt(s, i);
        }
        context.commit();
    }

    public static void setString(Context context, String s, String s1)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context).edit();
        context.putString(s, s1);
        context.commit();
    }
}
