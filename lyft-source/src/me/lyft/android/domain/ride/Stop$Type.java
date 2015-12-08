// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;


public final class  extends Enum
{

    private static final DROPOFF $VALUES[];
    public static final DROPOFF DROPOFF;
    public static final DROPOFF PICKUP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(me/lyft/android/domain/ride/Stop$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PICKUP = new <init>("PICKUP", 0);
        DROPOFF = new <init>("DROPOFF", 1);
        $VALUES = (new .VALUES[] {
            PICKUP, DROPOFF
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
