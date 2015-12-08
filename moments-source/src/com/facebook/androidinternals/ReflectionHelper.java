// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.androidinternals;

import java.lang.reflect.InvocationTargetException;

public final class ReflectionHelper
{

    private ReflectionHelper()
    {
    }

    public static void a(InvocationTargetException invocationtargetexception)
    {
        invocationtargetexception = invocationtargetexception.getTargetException();
        if (invocationtargetexception instanceof RuntimeException)
        {
            throw (RuntimeException)invocationtargetexception;
        }
        if (invocationtargetexception instanceof Error)
        {
            throw (Error)invocationtargetexception;
        } else
        {
            return;
        }
    }
}
