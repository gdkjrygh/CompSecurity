// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Locale;
import java.util.TimeZone;

public class jf
{

    private static jf a;

    private jf()
    {
    }

    public static jf a()
    {
        com/flurry/sdk/jf;
        JVM INSTR monitorenter ;
        jf jf1;
        if (a == null)
        {
            a = new jf();
        }
        jf1 = a;
        com/flurry/sdk/jf;
        JVM INSTR monitorexit ;
        return jf1;
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
