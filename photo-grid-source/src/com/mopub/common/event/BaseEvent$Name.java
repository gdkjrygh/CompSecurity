// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.event;


public final class a extends Enum
{

    public static final CLICK_REQUEST AD_REQUEST;
    public static final CLICK_REQUEST CLICK_REQUEST;
    public static final CLICK_REQUEST IMPRESSION_REQUEST;
    private static final CLICK_REQUEST b[];
    private final String a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/mopub/common/event/BaseEvent$Name, s);
    }

    public static a[] values()
    {
        return (a[])b.clone();
    }

    public final String getName()
    {
        return a;
    }

    static 
    {
        AD_REQUEST = new <init>("AD_REQUEST", 0, "ad_request");
        IMPRESSION_REQUEST = new <init>("IMPRESSION_REQUEST", 1, "impression_request");
        CLICK_REQUEST = new <init>("CLICK_REQUEST", 2, "click_request");
        b = (new b[] {
            AD_REQUEST, IMPRESSION_REQUEST, CLICK_REQUEST
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }
}
