// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;


public abstract class p extends Exception
{

    protected static final boolean a;

    p()
    {
    }

    p(Throwable throwable)
    {
        super(throwable);
    }

    public final Throwable fillInStackTrace()
    {
        return null;
    }

    static 
    {
        boolean flag;
        if (System.getProperty("surefire.test.class.path") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
