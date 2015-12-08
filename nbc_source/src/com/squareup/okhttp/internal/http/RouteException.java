// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class RouteException extends Exception
{

    private static final Method addSuppressedExceptionMethod;
    private IOException lastException;

    public RouteException(IOException ioexception)
    {
        super(ioexception);
        lastException = ioexception;
    }

    private void addSuppressedIfPossible(IOException ioexception, IOException ioexception1)
    {
        if (addSuppressedExceptionMethod == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        addSuppressedExceptionMethod.invoke(ioexception, new Object[] {
            ioexception1
        });
        return;
        ioexception;
        return;
        ioexception;
    }

    public void addConnectException(IOException ioexception)
    {
        addSuppressedIfPossible(ioexception, lastException);
        lastException = ioexception;
    }

    public IOException getLastConnectException()
    {
        return lastException;
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
        addSuppressedExceptionMethod = method;
    }
}
