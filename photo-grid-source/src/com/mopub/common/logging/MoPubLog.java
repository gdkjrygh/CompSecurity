// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.logging;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

// Referenced classes of package com.mopub.common.logging:
//            a

public class MoPubLog
{

    private static final Logger a;
    private static final a b;

    private MoPubLog()
    {
    }

    public static void c(String s)
    {
        c(s, null);
    }

    public static void c(String s, Throwable throwable)
    {
        a.log(Level.FINEST, s, throwable);
    }

    public static void d(String s)
    {
        d(s, null);
    }

    public static void d(String s, Throwable throwable)
    {
        a.log(Level.CONFIG, s, throwable);
    }

    public static void e(String s)
    {
        e(s, null);
    }

    public static void e(String s, Throwable throwable)
    {
        a.log(Level.SEVERE, s, throwable);
    }

    public static void i(String s)
    {
        i(s, null);
    }

    public static void i(String s, Throwable throwable)
    {
        a.log(Level.INFO, s, throwable);
    }

    public static void v(String s)
    {
        v(s, null);
    }

    public static void v(String s, Throwable throwable)
    {
        a.log(Level.FINE, s, throwable);
    }

    public static void w(String s)
    {
        w(s, null);
    }

    public static void w(String s, Throwable throwable)
    {
        a.log(Level.WARNING, s, throwable);
    }

    static 
    {
        a = Logger.getLogger("com.mopub");
        b = new a((byte)0);
        LogManager.getLogManager().addLogger(a);
        a.addHandler(b);
        a.setLevel(Level.FINE);
    }
}
