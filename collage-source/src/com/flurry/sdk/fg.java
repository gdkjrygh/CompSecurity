// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Locale;
import java.util.TimeZone;

public class fg
{

    private static fg a;

    private fg()
    {
    }

    public static fg a()
    {
        com/flurry/sdk/fg;
        JVM INSTR monitorenter ;
        fg fg1;
        if (a == null)
        {
            a = new fg();
        }
        fg1 = a;
        com/flurry/sdk/fg;
        JVM INSTR monitorexit ;
        return fg1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b()
    {
        a = null;
    }

    public String c()
    {
        return (new StringBuilder()).append(Locale.getDefault().getLanguage()).append("_").append(Locale.getDefault().getCountry()).toString();
    }

    public String d()
    {
        return TimeZone.getDefault().getID();
    }
}
