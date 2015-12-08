// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;


public final class ag
{

    public static void a(Throwable throwable, Class class1)
    {
        b(throwable, class1);
        b(throwable, java/lang/Error);
        b(throwable, java/lang/RuntimeException);
    }

    private static void b(Throwable throwable, Class class1)
    {
        if (throwable != null && class1.isInstance(throwable))
        {
            throw (Throwable)class1.cast(throwable);
        } else
        {
            return;
        }
    }
}
