// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.util;

import java.lang.reflect.Method;

public final class ExceptionUtils
{

    private static final Method INIT_CAUSE_METHOD = getInitCauseMethod();

    private ExceptionUtils()
    {
    }

    private static Method getInitCauseMethod()
    {
        Method method;
        try
        {
            method = java/lang/Throwable.getMethod("initCause", new Class[] {
                java/lang/Throwable
            });
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            return null;
        }
        return method;
    }

    public static void initCause(Throwable throwable, Throwable throwable1)
    {
        if (INIT_CAUSE_METHOD == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        INIT_CAUSE_METHOD.invoke(throwable, new Object[] {
            throwable1
        });
        return;
        throwable;
    }

}
