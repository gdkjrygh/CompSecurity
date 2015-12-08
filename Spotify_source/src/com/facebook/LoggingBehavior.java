// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class LoggingBehavior extends Enum
{

    public static final LoggingBehavior a;
    public static final LoggingBehavior b;
    public static final LoggingBehavior c;
    public static final LoggingBehavior d;
    public static final LoggingBehavior e;
    public static final LoggingBehavior f;
    private static final LoggingBehavior g[];

    private LoggingBehavior(String s, int i)
    {
        super(s, i);
    }

    public static LoggingBehavior valueOf(String s)
    {
        return (LoggingBehavior)Enum.valueOf(com/facebook/LoggingBehavior, s);
    }

    public static LoggingBehavior[] values()
    {
        return (LoggingBehavior[])g.clone();
    }

    static 
    {
        a = new LoggingBehavior("REQUESTS", 0);
        b = new LoggingBehavior("INCLUDE_ACCESS_TOKENS", 1);
        c = new LoggingBehavior("INCLUDE_RAW_RESPONSES", 2);
        d = new LoggingBehavior("CACHE", 3);
        e = new LoggingBehavior("APP_EVENTS", 4);
        f = new LoggingBehavior("DEVELOPER_ERRORS", 5);
        g = (new LoggingBehavior[] {
            a, b, c, d, e, f
        });
    }
}
