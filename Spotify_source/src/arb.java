// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.facebook.LoggingBehavior;
import java.util.HashMap;

public final class arb
{

    private static final HashMap a = new HashMap();
    private StringBuilder b;

    public arb(LoggingBehavior loggingbehavior, String s)
    {
        ars.a(s, "tag");
        (new StringBuilder("FacebookSDK.")).append(s);
        b = new StringBuilder();
    }

    public static void a()
    {
        aph.a();
    }

    public static void a(String s)
    {
        arb;
        JVM INSTR monitorenter ;
        LoggingBehavior loggingbehavior = LoggingBehavior.b;
        aph.a();
        a(s, "ACCESS_TOKEN_REMOVED");
        arb;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public static void a(String s, Object obj)
    {
        aph.a();
    }

    private static void a(String s, String s1)
    {
        arb;
        JVM INSTR monitorenter ;
        a.put(s, s1);
        arb;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public static transient void b()
    {
        aph.a();
    }

    public static void c()
    {
        aph.a();
    }

    public final void d()
    {
        aph.a();
        b = new StringBuilder();
    }

}
