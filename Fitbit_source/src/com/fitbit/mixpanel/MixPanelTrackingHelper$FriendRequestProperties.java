// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.mixpanel;


// Referenced classes of package com.fitbit.mixpanel:
//            MixPanelTrackingHelper

public static final class property extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];
    public final String property;

    public static property valueOf(String s)
    {
        return (property)Enum.valueOf(com/fitbit/mixpanel/MixPanelTrackingHelper$FriendRequestProperties, s);
    }

    public static property[] values()
    {
        return (property[])e.clone();
    }

    static 
    {
        a = new <init>("PROFILE", 0, "Profile");
        b = new <init>("FACEBOOK", 1, "Facebook");
        c = new <init>("CONTACT_BOOK", 2, "ContactBook");
        d = new <init>("INVITE_BY_EMAIL", 3, "InviteByEmail");
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        property = s1;
    }
}
