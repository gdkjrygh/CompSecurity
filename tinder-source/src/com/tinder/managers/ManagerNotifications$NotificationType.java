// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;


// Referenced classes of package com.tinder.managers:
//            ManagerNotifications

public static final class h extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g i[];
    int h;

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/tinder/managers/ManagerNotifications$NotificationType, s);
    }

    public static h[] values()
    {
        return (h[])i.clone();
    }

    static 
    {
        a = new <init>("MATCH_NEW", 0, 0xff39ca77);
        b = new <init>("MESSAGE_NEW", 1, 0xff318ff6);
        c = new <init>("MESSAGE_FAILED", 2, 0xffee6146);
        d = new <init>("SUPER_LIKE", 3, 0xff2494a7);
        e = new <init>("ALERT", 4, 0xffeb6a4f);
        f = new <init>("ID_TAKEN", 5, 0xffee6146);
        g = new <init>("ID_ACCEPTED", 6, 0xff39ca77);
        i = (new i[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int j, int k)
    {
        super(s, j);
        h = k;
    }
}
