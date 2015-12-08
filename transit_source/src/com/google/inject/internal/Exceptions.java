// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import java.lang.reflect.InvocationTargetException;

class Exceptions
{
    static class UnhandledCheckedUserException extends RuntimeException
    {

        public UnhandledCheckedUserException(Throwable throwable)
        {
            super(throwable);
        }
    }


    Exceptions()
    {
    }

    public static RuntimeException throwCleanly(InvocationTargetException invocationtargetexception)
    {
        Object obj = invocationtargetexception;
        if (invocationtargetexception.getCause() != null)
        {
            obj = invocationtargetexception.getCause();
        }
        if (obj instanceof RuntimeException)
        {
            throw (RuntimeException)obj;
        }
        if (obj instanceof Error)
        {
            throw (Error)obj;
        } else
        {
            throw new UnhandledCheckedUserException(((Throwable) (obj)));
        }
    }
}
