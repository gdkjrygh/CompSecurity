// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class RouteException extends Exception
{

    private static final Method a;
    public IOException lastException;

    public RouteException(IOException ioexception)
    {
        super(ioexception);
        lastException = ioexception;
    }

    public static void a(IOException ioexception, IOException ioexception1)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        a.invoke(ioexception, new Object[] {
            ioexception1
        });
        return;
        ioexception;
        return;
        ioexception;
    }

    static 
    {
        Method method;
        try
        {
            method = java/lang/Throwable.getDeclaredMethod("addSuppressed", new Class[] {
                java/lang/Throwable
            });
        }
        catch (Exception exception)
        {
            exception = null;
        }
        a = method;
    }
}
