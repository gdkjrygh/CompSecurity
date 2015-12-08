// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.android;


public final class FlurrySyndicationEventName extends Enum
{

    public static final FlurrySyndicationEventName FAST_REBLOG;
    public static final FlurrySyndicationEventName LIKE;
    public static final FlurrySyndicationEventName REBLOG;
    public static final FlurrySyndicationEventName SOURCE_LINK;
    private static final FlurrySyndicationEventName b[];
    private String a;

    private FlurrySyndicationEventName(String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }

    public static FlurrySyndicationEventName valueOf(String s)
    {
        return (FlurrySyndicationEventName)Enum.valueOf(com/flurry/android/FlurrySyndicationEventName, s);
    }

    public static FlurrySyndicationEventName[] values()
    {
        return (FlurrySyndicationEventName[])b.clone();
    }

    public final String toString()
    {
        return a;
    }

    static 
    {
        REBLOG = new FlurrySyndicationEventName("REBLOG", 0, "Reblog");
        FAST_REBLOG = new FlurrySyndicationEventName("FAST_REBLOG", 1, "FastReblog");
        SOURCE_LINK = new FlurrySyndicationEventName("SOURCE_LINK", 2, "SourceClick");
        LIKE = new FlurrySyndicationEventName("LIKE", 3, "Like");
        b = (new FlurrySyndicationEventName[] {
            REBLOG, FAST_REBLOG, SOURCE_LINK, LIKE
        });
    }
}
