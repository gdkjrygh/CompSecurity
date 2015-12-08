// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;


public final class PurchaseExperience extends Enum
{

    public static final PurchaseExperience DIRECT_WITH_DETAIL;
    public static final PurchaseExperience DIRECT_WITH_PREVIEW;
    public static final PurchaseExperience IN_APP;
    private static final PurchaseExperience a[];

    private PurchaseExperience(String s, int i)
    {
        super(s, i);
    }

    public static PurchaseExperience valueOf(String s)
    {
        return (PurchaseExperience)Enum.valueOf(com/amazon/device/associates/PurchaseExperience, s);
    }

    public static PurchaseExperience[] values()
    {
        return (PurchaseExperience[])a.clone();
    }

    static 
    {
        IN_APP = new PurchaseExperience("IN_APP", 0);
        DIRECT_WITH_DETAIL = new PurchaseExperience("DIRECT_WITH_DETAIL", 1);
        DIRECT_WITH_PREVIEW = new PurchaseExperience("DIRECT_WITH_PREVIEW", 2);
        a = (new PurchaseExperience[] {
            IN_APP, DIRECT_WITH_DETAIL, DIRECT_WITH_PREVIEW
        });
    }
}
