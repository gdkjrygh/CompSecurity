// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;


public final class  extends Enum
{

    private static final CONFIRM_REQUEST $VALUES[];
    public static final CONFIRM_REQUEST CONFIRM_REQUEST;
    public static final CONFIRM_REQUEST SET_DROPOFF;
    public static final CONFIRM_REQUEST SET_PICKUP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(me/lyft/android/domain/ride/PassengerRideRequest$RideStep, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SET_PICKUP = new <init>("SET_PICKUP", 0);
        SET_DROPOFF = new <init>("SET_DROPOFF", 1);
        CONFIRM_REQUEST = new <init>("CONFIRM_REQUEST", 2);
        $VALUES = (new .VALUES[] {
            SET_PICKUP, SET_DROPOFF, CONFIRM_REQUEST
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
