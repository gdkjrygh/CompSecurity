// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;


final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR ERROR;
    public static final ERROR HISTORY;
    public static final ERROR LOADING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(me/lyft/android/ui/ridehistory/PassengerRideHistoryAdapter$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LOADING = new <init>("LOADING", 0);
        HISTORY = new <init>("HISTORY", 1);
        ERROR = new <init>("ERROR", 2);
        $VALUES = (new .VALUES[] {
            LOADING, HISTORY, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
