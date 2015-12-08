// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class LoggingBehavior extends Enum
{

    private static final LoggingBehavior $VALUES[];
    public static final LoggingBehavior CACHE;
    public static final LoggingBehavior DEVELOPER_ERRORS;
    public static final LoggingBehavior INCLUDE_ACCESS_TOKENS;
    public static final LoggingBehavior INCLUDE_RAW_RESPONSES;
    public static final LoggingBehavior REQUESTS;

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
        return (LoggingBehavior[])$VALUES.clone();
    }

    static 
    {
        REQUESTS = new LoggingBehavior("REQUESTS", 0);
        INCLUDE_ACCESS_TOKENS = new LoggingBehavior("INCLUDE_ACCESS_TOKENS", 1);
        INCLUDE_RAW_RESPONSES = new LoggingBehavior("INCLUDE_RAW_RESPONSES", 2);
        CACHE = new LoggingBehavior("CACHE", 3);
        DEVELOPER_ERRORS = new LoggingBehavior("DEVELOPER_ERRORS", 4);
        $VALUES = (new LoggingBehavior[] {
            REQUESTS, INCLUDE_ACCESS_TOKENS, INCLUDE_RAW_RESPONSES, CACHE, DEVELOPER_ERRORS
        });
    }
}
