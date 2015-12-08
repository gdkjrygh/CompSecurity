// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.event;


public final class a extends Enum
{

    public static final EXCHANGE_CLIENT_ERROR EXCHANGE_CLIENT_ERROR;
    public static final EXCHANGE_CLIENT_ERROR EXCHANGE_CLIENT_EVENT;
    private static final EXCHANGE_CLIENT_ERROR b[];
    private final String a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/mopub/common/event/BaseEvent$ScribeCategory, s);
    }

    public static a[] values()
    {
        return (a[])b.clone();
    }

    public final String getCategory()
    {
        return a;
    }

    static 
    {
        EXCHANGE_CLIENT_EVENT = new <init>("EXCHANGE_CLIENT_EVENT", 0, "exchange_client_event");
        EXCHANGE_CLIENT_ERROR = new <init>("EXCHANGE_CLIENT_ERROR", 1, "exchange_client_error");
        b = (new b[] {
            EXCHANGE_CLIENT_EVENT, EXCHANGE_CLIENT_ERROR
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }
}
