// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bmwgroup.connected.car.app;


public final class ApplicationType extends Enum
{

    public static final ApplicationType a;
    private static ApplicationType b;
    private static ApplicationType c;
    private static final ApplicationType d[];
    private String mCategory;

    private ApplicationType(String s, int i, String s1)
    {
        super(s, i);
        mCategory = s1;
    }

    public static ApplicationType valueOf(String s)
    {
        return (ApplicationType)Enum.valueOf(com/bmwgroup/connected/car/app/ApplicationType, s);
    }

    public static ApplicationType[] values()
    {
        return (ApplicationType[])d.clone();
    }

    public final String toString()
    {
        return mCategory;
    }

    static 
    {
        a = new ApplicationType("MULTIMEDIA", 0, "Multimedia");
        b = new ApplicationType("RADIO", 1, "Radio");
        c = new ApplicationType("ONLINESERVICES", 2, "OnlineServices");
        d = (new ApplicationType[] {
            a, b, c
        });
    }
}
