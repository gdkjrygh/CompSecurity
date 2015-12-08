// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ada
{

    private static Class a(String s)
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

    private static Object a(Class class1)
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

    private static transient Object a(Class class1, String s, Object obj, Class aclass[], Object aobj[])
    {
        return class1.getMethod(s, aclass).invoke(obj, aobj);
    }

    private static transient Object a(Object obj, String s, Object aobj[])
    {
        return a(obj.getClass(), s, obj, null, aobj);
    }

    private static transient Object a(String s, String s1, Class aclass[], Object aobj[])
    {
        return a(Class.forName(s), s1, null, aclass, aobj);
    }

    public static String a(Context context)
    {
        try
        {
            context = (String)a(e(context), "getId", new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static Map a()
    {
        HashMap hashmap = new HashMap();
        Iterator iterator = b().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = ((adg)iterator.next()).a();
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

    public static Boolean b(Context context)
    {
        boolean flag;
        if (!((Boolean)a(e(context), "isLimitAdTrackingEnabled", new Object[0])).booleanValue())
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

    private static List b()
    {
        ArrayList arraylist = new ArrayList(acp.a.size());
        Iterator iterator = acp.a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = a(a((String)iterator.next()));
            if (obj != null && (obj instanceof adg))
            {
                arraylist.add((adg)obj);
            }
        } while (true);
        return arraylist;
    }

    public static String c(Context context)
    {
        try
        {
            context = (String)a("com.adjust.sdk.plugin.MacAddressUtil", "getMacAddress", new Class[] {
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

    public static String d(Context context)
    {
        try
        {
            context = (String)a("com.adjust.sdk.plugin.AndroidIdUtil", "getAndroidId", new Class[] {
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

    private static Object e(Context context)
    {
        return a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] {
            android/content/Context
        }, new Object[] {
            context
        });
    }
}
