// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import java.io.IOException;
import org.apache.http.client.HttpResponseException;

public class ax
{

    public ax()
    {
    }

    public static boolean a(Throwable throwable)
    {
        throwable = f(throwable);
        return throwable != null && throwable.getStatusCode() == 401;
    }

    private static boolean a(Throwable throwable, Class class1)
    {
        for (Throwable throwable1 = throwable; throwable1 != null; throwable1 = throwable1.getCause())
        {
            if (class1.isInstance(throwable))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean b(Throwable throwable)
    {
        throwable = f(throwable);
        return throwable != null && throwable.getStatusCode() >= 400 && throwable.getStatusCode() < 500;
    }

    public static boolean c(Throwable throwable)
    {
        throwable = f(throwable);
        return throwable != null && throwable.getStatusCode() >= 500 && throwable.getStatusCode() < 600;
    }

    public static boolean d(Throwable throwable)
    {
        return a(throwable, java/io/IOException);
    }

    public static boolean e(Throwable throwable)
    {
        return a(throwable, java/lang/OutOfMemoryError);
    }

    public static HttpResponseException f(Throwable throwable)
    {
        for (; throwable != null; throwable = throwable.getCause())
        {
            if (throwable instanceof HttpResponseException)
            {
                return (HttpResponseException)throwable;
            }
        }

        return null;
    }
}
