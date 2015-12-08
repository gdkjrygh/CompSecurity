// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


public final class AdColonyIAPEngagement extends Enum
{

    public static final AdColonyIAPEngagement AUTOMATIC;
    public static final AdColonyIAPEngagement END_CARD;
    public static final AdColonyIAPEngagement NONE;
    public static final AdColonyIAPEngagement OVERLAY;
    private static final AdColonyIAPEngagement a[];

    private AdColonyIAPEngagement(String s, int i)
    {
        super(s, i);
    }

    public static AdColonyIAPEngagement valueOf(String s)
    {
        return (AdColonyIAPEngagement)Enum.valueOf(com/jirbo/adcolony/AdColonyIAPEngagement, s);
    }

    public static AdColonyIAPEngagement[] values()
    {
        return (AdColonyIAPEngagement[])a.clone();
    }

    static 
    {
        NONE = new AdColonyIAPEngagement("NONE", 0);
        AUTOMATIC = new AdColonyIAPEngagement("AUTOMATIC", 1);
        OVERLAY = new AdColonyIAPEngagement("OVERLAY", 2);
        END_CARD = new AdColonyIAPEngagement("END_CARD", 3);
        a = (new AdColonyIAPEngagement[] {
            NONE, AUTOMATIC, OVERLAY, END_CARD
        });
    }
}
