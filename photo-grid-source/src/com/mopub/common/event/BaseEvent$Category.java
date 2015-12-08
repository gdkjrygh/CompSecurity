// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.event;


public final class a extends Enum
{

    public static final REQUESTS REQUESTS;
    private static final REQUESTS b[];
    private final String a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/mopub/common/event/BaseEvent$Category, s);
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
        REQUESTS = new <init>("REQUESTS", "requests");
        b = (new b[] {
            REQUESTS
        });
    }

    private (String s, String s1)
    {
        super(s, 0);
        a = s1;
    }
}
