// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;


public class NodexExceptionUtil
{

    private NodexExceptionUtil()
    {
    }

    public static Throwable a(Throwable throwable, Class class1, String s)
    {
        int i;
        for (i = 0; throwable != null && !b(throwable, class1, s) && i < 100; i++)
        {
            throwable = throwable.getCause();
        }

        if (i == 100)
        {
            throwable = null;
        }
        return throwable;
    }

    private static boolean b(Throwable throwable, Class class1, String s)
    {
        return class1.isInstance(throwable) && (s == null || throwable.getMessage() != null && throwable.getMessage().contains(s));
    }
}
