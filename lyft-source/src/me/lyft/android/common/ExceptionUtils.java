// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import java.io.IOException;
import java.io.InterruptedIOException;

public class ExceptionUtils
{

    public ExceptionUtils()
    {
    }

    public static boolean isInterruptedException(Throwable throwable)
    {
        if (throwable.getCause() != null)
        {
            throwable = throwable.getCause();
        }
        return java/lang/InterruptedException.isAssignableFrom(throwable.getClass()) || java/io/InterruptedIOException.isAssignableFrom(throwable.getClass());
    }

    public static boolean isNetworkException(Throwable throwable)
    {
        return java/io/IOException.isAssignableFrom(throwable.getClass());
    }
}
