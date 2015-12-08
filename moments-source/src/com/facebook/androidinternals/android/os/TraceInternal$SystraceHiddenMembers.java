// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.androidinternals.android.os;

import android.os.Trace;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class c
{

    public final Method a;
    public final Method b;
    public final long c;

    public static c a()
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
            obj = new <init>(((Method) (obj)), method, field.getLong(null));
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
        return ((<init>) (obj));
    }

    private (Method method, Method method1, long l)
    {
        a = method;
        b = method1;
        c = l;
    }
}
