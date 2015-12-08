// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.b.a;


public final class b extends RuntimeException
{

    Throwable a;

    public b()
    {
    }

    public b(String s, Throwable throwable)
    {
        if (throwable != null)
        {
            s = "Exception while initializing " + s + ": " + throwable;
        }
        super(s);
        a = throwable;
    }

    public final Throwable getCause()
    {
        return a;
    }
}
