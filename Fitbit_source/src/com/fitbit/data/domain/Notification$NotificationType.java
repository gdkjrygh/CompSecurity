// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            Notification

public static final class  extends Enum
{

    private static final BADGE $VALUES[];
    public static final BADGE BADGE;
    public static final BADGE CHALLENGE_INVITE;
    public static final BADGE CHALLENGE_MESSAGE;
    public static final BADGE CHEER;
    public static final BADGE CORPORATE;
    public static final BADGE INVITE;
    public static final BADGE MESSAGE;
    public static final BADGE TAUNT;
    public static final BADGE UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/data/domain/Notification$NotificationType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0);
        MESSAGE = new <init>("MESSAGE", 1);
        CHEER = new <init>("CHEER", 2);
        TAUNT = new <init>("TAUNT", 3);
        INVITE = new <init>("INVITE", 4);
        CORPORATE = new <init>("CORPORATE", 5);
        CHALLENGE_INVITE = new <init>("CHALLENGE_INVITE", 6);
        CHALLENGE_MESSAGE = new <init>("CHALLENGE_MESSAGE", 7);
        BADGE = new <init>("BADGE", 8);
        $VALUES = (new .VALUES[] {
            UNKNOWN, MESSAGE, CHEER, TAUNT, INVITE, CORPORATE, CHALLENGE_INVITE, CHALLENGE_MESSAGE, BADGE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
