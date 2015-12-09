// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.androidinternals.android.os;

import com.facebook.androidinternals.ReflectionHelper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class SystemPropertiesInternal
{

    private static final Method a;
    private static final Method b;
    private static final Method c;
    private static final Method d;
    private static volatile boolean e;

    private SystemPropertiesInternal()
    {
    }

    private static transient Object a(Method method, Object aobj[])
    {
        if (method == null)
        {
            return null;
        }
        try
        {
            method = ((Method) (method.invoke(null, (Object[])aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            e = false;
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            ReflectionHelper.a(method);
            return null;
        }
        return method;
    }

    public static String a(String s)
    {
        if (!e)
        {
            s = "";
        } else
        {
            String s1 = (String)a(a, new Object[] {
                s
            });
            s = s1;
            if (s1 == null)
            {
                return "";
            }
        }
        return s;
    }

    public static void a(Runnable runnable)
    {
        if (!e)
        {
            return;
        } else
        {
            a(d, new Object[] {
                runnable
            });
            return;
        }
    }

    public static long b(String s)
    {
        if (!e)
        {
            return 0L;
        }
        s = (Long)a(b, new Object[] {
            s, Long.valueOf(0L)
        });
        if (s == null)
        {
            return 0L;
        } else
        {
            return s.longValue();
        }
    }

    static 
    {
        SystemPropertiesHiddenMembers systempropertieshiddenmembers = SystemPropertiesHiddenMembers.a();
        if (systempropertieshiddenmembers != null)
        {
            d = systempropertieshiddenmembers.a;
            a = systempropertieshiddenmembers.b;
            b = systempropertieshiddenmembers.c;
            c = systempropertieshiddenmembers.d;
            e = true;
        } else
        {
            d = null;
            a = null;
            b = null;
            c = null;
            e = false;
        }
    }

    private class SystemPropertiesHiddenMembers
    {

        public final Method a;
        public final Method b;
        public final Method c;
        public final Method d;

        public static SystemPropertiesHiddenMembers a()
        {
            Object obj;
            Method method;
            Method method1;
            Method method2;
            obj = Class.forName("android.os.SystemProperties");
            method = ((Class) (obj)).getMethod("get", new Class[] {
                java/lang/String
            });
            method1 = ((Class) (obj)).getMethod("getLong", new Class[] {
                java/lang/String, Long.TYPE
            });
            method2 = ((Class) (obj)).getMethod("set", new Class[] {
                java/lang/String, java/lang/String
            });
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            obj = ((Class) (obj)).getMethod("addChangeCallback", new Class[] {
                java/lang/Runnable
            });
_L1:
            obj = new SystemPropertiesHiddenMembers(((Method) (obj)), method, method1, method2);
            return ((SystemPropertiesHiddenMembers) (obj));
            obj = null;
              goto _L1
            Object obj1;
            obj1;
            return null;
            obj1;
            return null;
        }

        private SystemPropertiesHiddenMembers(Method method, Method method1, Method method2, Method method3)
        {
            a = method;
            b = method1;
            c = method2;
            d = method3;
        }
    }

}
