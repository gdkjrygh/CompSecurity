// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.mixpanel;


// Referenced classes of package com.fitbit.mixpanel:
//            MixPanelTrackingHelper

public static final class description extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];
    private String description;

    public static description valueOf(String s)
    {
        return (description)Enum.valueOf(com/fitbit/mixpanel/MixPanelTrackingHelper$PairingStatus, s);
    }

    public static description[] values()
    {
        return (description[])d.clone();
    }

    public String a()
    {
        return description;
    }

    static 
    {
        a = new <init>("CANCEL", 0, "CANCEL");
        b = new <init>("SUCCESS", 1, "SUCCESS");
        c = new <init>("INCOMPLETE", 2, "INCOMPLETE");
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        description = s1;
    }
}
