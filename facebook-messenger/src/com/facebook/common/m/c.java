// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.m;


public final class c extends Enum
{

    private static final c $VALUES[];
    public static final c SecurityException;
    public static final c Success;
    public static final c TimedOut;
    public static final c UnknownHost;

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/facebook/common/m/c, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
    }

    static 
    {
        Success = new c("Success", 0);
        TimedOut = new c("TimedOut", 1);
        UnknownHost = new c("UnknownHost", 2);
        SecurityException = new c("SecurityException", 3);
        $VALUES = (new c[] {
            Success, TimedOut, UnknownHost, SecurityException
        });
    }
}
