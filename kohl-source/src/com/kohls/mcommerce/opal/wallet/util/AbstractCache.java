// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.gson.Gson;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.util:
//            GsonWrapper

public abstract class AbstractCache
{

    public AbstractCache()
    {
    }

    protected static void clear(Context context, String s)
    {
        getSharedPref(context).edit().putString(s, null).commit();
    }

    protected static void commit(Context context, String s, Object obj)
    {
        Object obj1 = null;
        try
        {
            obj = (new Gson()).toJson(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
            obj = obj1;
        }
        getSharedPref(context).edit().putString(s, ((String) (obj))).commit();
    }

    public static boolean contains(Context context, String s)
    {
        return getSharedPref(context).contains(s);
    }

    protected static Object get(Context context, String s, Class class1)
    {
        if (contains(context, s))
        {
            context = PreferenceManager.getDefaultSharedPreferences(context).getString(s, null);
            if (context != null && context != null)
            {
                return GsonWrapper.fromJson(context, class1);
            }
        }
        return returnNewInstance(class1);
    }

    private static SharedPreferences getSharedPref(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    private static Object returnNewInstance(Class class1)
    {
        try
        {
            class1 = ((Class) (class1.newInstance()));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }
}
