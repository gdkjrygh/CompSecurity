// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.content.Context;
import com.adjust.sdk.plugin.Plugin;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.adjust.sdk:
//            Constants

public class Reflection
{

    public Reflection()
    {
    }

    public static Object createDefaultInstance(Class class1)
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

    public static Object createDefaultInstance(String s)
    {
        return createDefaultInstance(forName(s));
    }

    public static transient Object createInstance(String s, Class aclass[], Object aobj[])
    {
        try
        {
            s = ((String) (Class.forName(s).getConstructor(aclass).newInstance(aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static Class forName(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    private static Object getAdvertisingInfoObject(Context context)
        throws Exception
    {
        return invokeStaticMethod("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] {
            android/content/Context
        }, new Object[] {
            context
        });
    }

    public static String getAndroidId(Context context)
    {
        try
        {
            context = (String)invokeStaticMethod("com.adjust.sdk.plugin.AndroidIdUtil", "getAndroidId", new Class[] {
                android/content/Context
            }, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static String getMacAddress(Context context)
    {
        try
        {
            context = (String)invokeStaticMethod("com.adjust.sdk.plugin.MacAddressUtil", "getMacAddress", new Class[] {
                android/content/Context
            }, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static String getPlayAdId(Context context)
    {
        try
        {
            context = (String)invokeInstanceMethod(getAdvertisingInfoObject(context), "getId", null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static Map getPluginKeys(Context context)
    {
        HashMap hashmap = new HashMap();
        Iterator iterator = getPlugins().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = ((Plugin)iterator.next()).getParameter(context);
            if (entry != null)
            {
                hashmap.put(entry.getKey(), entry.getValue());
            }
        } while (true);
        if (hashmap.size() == 0)
        {
            return null;
        } else
        {
            return hashmap;
        }
    }

    private static List getPlugins()
    {
        ArrayList arraylist = new ArrayList(Constants.PLUGINS.size());
        Iterator iterator = Constants.PLUGINS.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = createDefaultInstance((String)iterator.next());
            if (obj != null && (obj instanceof Plugin))
            {
                arraylist.add((Plugin)obj);
            }
        } while (true);
        return arraylist;
    }

    public static transient Object invokeInstanceMethod(Object obj, String s, Class aclass[], Object aobj[])
        throws Exception
    {
        return invokeMethod(obj.getClass(), s, obj, aclass, aobj);
    }

    public static transient Object invokeMethod(Class class1, String s, Object obj, Class aclass[], Object aobj[])
        throws Exception
    {
        return class1.getMethod(s, aclass).invoke(obj, aobj);
    }

    public static transient Object invokeStaticMethod(String s, String s1, Class aclass[], Object aobj[])
        throws Exception
    {
        return invokeMethod(Class.forName(s), s1, null, aclass, aobj);
    }

    private static boolean isConnectionResultSuccess(Integer integer)
    {
        if (integer != null)
        {
            int i;
            int j;
            try
            {
                i = Class.forName("com.google.android.gms.common.ConnectionResult").getField("SUCCESS").getInt(null);
                j = integer.intValue();
            }
            // Misplaced declaration of an exception variable
            catch (Integer integer)
            {
                return false;
            }
            if (i == j)
            {
                return true;
            }
        }
        return false;
    }

    public static Boolean isPlayTrackingEnabled(Context context)
    {
        boolean flag;
        if (!((Boolean)invokeInstanceMethod(getAdvertisingInfoObject(context), "isLimitAdTrackingEnabled", null, new Object[0])).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
        context;
        return null;
    }
}
