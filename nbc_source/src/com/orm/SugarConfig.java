// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.orm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SugarConfig
{

    static Map fields = new HashMap();

    public SugarConfig()
    {
    }

    public static void clearCache()
    {
        fields.clear();
        fields = new HashMap();
    }

    public static String getDatabaseName(Context context)
    {
        String s = getMetaDataString(context, "DATABASE");
        context = s;
        if (s == null)
        {
            context = "Sugar.db";
        }
        return context;
    }

    public static int getDatabaseVersion(Context context)
    {
label0:
        {
            Integer integer = getMetaDataInteger(context, "VERSION");
            if (integer != null)
            {
                context = integer;
                if (integer.intValue() != 0)
                {
                    break label0;
                }
            }
            context = Integer.valueOf(1);
        }
        return context.intValue();
    }

    public static boolean getDebugEnabled(Context context)
    {
        return getMetaDataBoolean(context, "QUERY_LOG").booleanValue();
    }

    public static String getDomainPackageName(Context context)
    {
        String s = getMetaDataString(context, "DOMAIN_PACKAGE_NAME");
        context = s;
        if (s == null)
        {
            context = "";
        }
        return context;
    }

    public static List getFields(Class class1)
    {
        if (fields.containsKey(class1))
        {
            return Collections.synchronizedList((List)fields.get(class1));
        } else
        {
            return null;
        }
    }

    public static Boolean getMetaDataBoolean(Context context, String s)
    {
        PackageManager packagemanager = context.getPackageManager();
        boolean flag;
        try
        {
            flag = packagemanager.getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.d("sugar", (new StringBuilder()).append("Couldn't find config value: ").append(s).toString());
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public static Integer getMetaDataInteger(Context context, String s)
    {
        PackageManager packagemanager = context.getPackageManager();
        int i;
        try
        {
            i = packagemanager.getApplicationInfo(context.getPackageName(), 128).metaData.getInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.d("sugar", (new StringBuilder()).append("Couldn't find config value: ").append(s).toString());
            return null;
        }
        return Integer.valueOf(i);
    }

    public static String getMetaDataString(Context context, String s)
    {
        PackageManager packagemanager = context.getPackageManager();
        try
        {
            context = packagemanager.getApplicationInfo(context.getPackageName(), 128).metaData.getString(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.d("sugar", (new StringBuilder()).append("Couldn't find config value: ").append(s).toString());
            return null;
        }
        return context;
    }

    public static void setFields(Class class1, List list)
    {
        fields.put(class1, list);
    }

}
