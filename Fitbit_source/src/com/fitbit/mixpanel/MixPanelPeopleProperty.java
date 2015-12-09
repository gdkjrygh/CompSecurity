// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.mixpanel;


public final class MixPanelPeopleProperty extends Enum
{

    public static final MixPanelPeopleProperty a;
    public static final MixPanelPeopleProperty b;
    private static final MixPanelPeopleProperty c[];
    private String name;

    private MixPanelPeopleProperty(String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }

    public static MixPanelPeopleProperty valueOf(String s)
    {
        return (MixPanelPeopleProperty)Enum.valueOf(com/fitbit/mixpanel/MixPanelPeopleProperty, s);
    }

    public static MixPanelPeopleProperty[] values()
    {
        return (MixPanelPeopleProperty[])c.clone();
    }

    public String toString()
    {
        return name;
    }

    static 
    {
        a = new MixPanelPeopleProperty("LAST_BONDED", 0, "Devices: Last Bonded");
        b = new MixPanelPeopleProperty("MOBILE_NOTIFICATIONS", 1, "Devices: Mobile Notifications");
        c = (new MixPanelPeopleProperty[] {
            a, b
        });
    }
}
