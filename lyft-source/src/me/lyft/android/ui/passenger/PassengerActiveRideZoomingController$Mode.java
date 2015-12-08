// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;


final class  extends Enum
{

    private static final USER_INTERACTION $VALUES[];
    public static final USER_INTERACTION FOLLOW;
    public static final USER_INTERACTION ROUTE_VIEW;
    public static final USER_INTERACTION USER_INTERACTION;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(me/lyft/android/ui/passenger/PassengerActiveRideZoomingController$Mode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FOLLOW = new <init>("FOLLOW", 0);
        ROUTE_VIEW = new <init>("ROUTE_VIEW", 1);
        USER_INTERACTION = new <init>("USER_INTERACTION", 2);
        $VALUES = (new .VALUES[] {
            FOLLOW, ROUTE_VIEW, USER_INTERACTION
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
