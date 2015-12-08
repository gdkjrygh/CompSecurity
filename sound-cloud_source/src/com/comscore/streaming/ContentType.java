// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;


public final class ContentType extends Enum
{

    public static final ContentType Bumper;
    public static final ContentType Live;
    public static final ContentType LongFormOnDemand;
    public static final ContentType Other;
    public static final ContentType ShortFormOnDemand;
    public static final ContentType UserGeneratedLive;
    public static final ContentType UserGeneratedLongFormOnDemand;
    public static final ContentType UserGeneratedShortFormOnDemand;
    private static final ContentType b[];
    private final String a;

    private ContentType(String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }

    public static ContentType valueOf(String s)
    {
        return (ContentType)Enum.valueOf(com/comscore/streaming/ContentType, s);
    }

    public static ContentType[] values()
    {
        return (ContentType[])b.clone();
    }

    protected final String a()
    {
        return a;
    }

    static 
    {
        LongFormOnDemand = new ContentType("LongFormOnDemand", 0, "c11");
        ShortFormOnDemand = new ContentType("ShortFormOnDemand", 1, "c12");
        Live = new ContentType("Live", 2, "c13");
        UserGeneratedLongFormOnDemand = new ContentType("UserGeneratedLongFormOnDemand", 3, "c21");
        UserGeneratedShortFormOnDemand = new ContentType("UserGeneratedShortFormOnDemand", 4, "c22");
        UserGeneratedLive = new ContentType("UserGeneratedLive", 5, "c23");
        Bumper = new ContentType("Bumper", 6, "c99");
        Other = new ContentType("Other", 7, "c00");
        b = (new ContentType[] {
            LongFormOnDemand, ShortFormOnDemand, Live, UserGeneratedLongFormOnDemand, UserGeneratedShortFormOnDemand, UserGeneratedLive, Bumper, Other
        });
    }
}
