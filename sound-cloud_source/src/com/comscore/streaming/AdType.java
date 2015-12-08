// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;


public final class AdType extends Enum
{

    public static final AdType LinearLive;
    public static final AdType LinearOnDemandMidRoll;
    public static final AdType LinearOnDemandPostRoll;
    public static final AdType LinearOnDemandPreRoll;
    public static final AdType Other;
    private static final AdType b[];
    private final String a;

    private AdType(String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }

    public static AdType valueOf(String s)
    {
        return (AdType)Enum.valueOf(com/comscore/streaming/AdType, s);
    }

    public static AdType[] values()
    {
        return (AdType[])b.clone();
    }

    protected final String a()
    {
        return a;
    }

    static 
    {
        LinearOnDemandPreRoll = new AdType("LinearOnDemandPreRoll", 0, "a11");
        LinearOnDemandMidRoll = new AdType("LinearOnDemandMidRoll", 1, "a12");
        LinearOnDemandPostRoll = new AdType("LinearOnDemandPostRoll", 2, "a13");
        LinearLive = new AdType("LinearLive", 3, "a21");
        Other = new AdType("Other", 4, "a00");
        b = (new AdType[] {
            LinearOnDemandPreRoll, LinearOnDemandMidRoll, LinearOnDemandPostRoll, LinearLive, Other
        });
    }
}
