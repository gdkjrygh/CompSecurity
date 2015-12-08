// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.androidinternals.android.os;

import com.facebook.androidinternals.ReflectionHelper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class TraceInternal
{

    public static final boolean a;
    public static final long b;
    private static final Method c;
    private static final Method d;
    private static volatile boolean e;

    private TraceInternal()
    {
    }

    private static transient Object a(Method method, Object aobj[])
    {
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

    public static void a(boolean flag)
    {
        if (!e)
        {
            return;
        } else
        {
            a(d, new Object[] {
                Boolean.valueOf(true)
            });
            return;
        }
    }

    public static boolean a(long l)
    {
        if (!e)
        {
            return false;
        }
        Boolean boolean1 = (Boolean)a(c, new Object[] {
            Long.valueOf(l)
        });
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    static 
    {
        SystraceHiddenMembers systracehiddenmembers;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        if (a)
        {
            systracehiddenmembers = SystraceHiddenMembers.a();
        } else
        {
            systracehiddenmembers = null;
        }
        if (systracehiddenmembers != null)
        {
            c = systracehiddenmembers.a;
            d = systracehiddenmembers.b;
            b = systracehiddenmembers.c;
            e = true;
            return;
        } else
        {
            c = null;
            d = null;
            b = 0L;
            e = false;
            return;
        }
    }

    private class SystraceHiddenMembers
    {

        public final Method a;
        public final Method b;
        public final long c;

        public static SystraceHiddenMembers a()
        {
            Object obj;
            Method method;
            Field field;
            obj = android/os/Trace.getMethod("isTagEnabled", new Class[] {
                Long.TYPE
            });
            method = android/os/Trace.getMethod("setAppTracingAllowed", new Class[] {
                Boolean.TYPE
            });
            field = android/os/Trace.getField("TRACE_TAG_APP");
            if (field.getType() != Long.TYPE)
            {
                return null;
            }
            try
            {
                obj = new SystraceHiddenMembers(((Method) (obj)), method, field.getLong(null));
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                return null;
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                return null;
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                return null;
            }
            return ((SystraceHiddenMembers) (obj));
        }

        private SystraceHiddenMembers(Method method, Method method1, long l)
        {
            a = method;
            b = method1;
            c = l;
        }
    }

}
