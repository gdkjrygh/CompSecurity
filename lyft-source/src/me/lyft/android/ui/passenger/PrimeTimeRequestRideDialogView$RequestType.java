// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;


public final class  extends Enum
{

    private static final ALERT_TIME_OUT $VALUES[];
    public static final ALERT_TIME_OUT ALERT_TIME_OUT;
    public static final ALERT_TIME_OUT CANCEL;
    public static final ALERT_TIME_OUT COURIER;
    public static final ALERT_TIME_OUT LYFT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(me/lyft/android/ui/passenger/PrimeTimeRequestRideDialogView$RequestType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public String getAnalyticName()
    {
        switch (.me.lyft.android.ui.passenger.PrimeTimeRequestRideDialogView.RequestType[ordinal()])
        {
        default:
            return "alert_time_out";

        case 1: // '\001'
            return "lyft";

        case 2: // '\002'
            return "courier";

        case 3: // '\003'
            return "cancel";
        }
    }

    static 
    {
        LYFT = new <init>("LYFT", 0);
        COURIER = new <init>("COURIER", 1);
        CANCEL = new <init>("CANCEL", 2);
        ALERT_TIME_OUT = new <init>("ALERT_TIME_OUT", 3);
        $VALUES = (new .VALUES[] {
            LYFT, COURIER, CANCEL, ALERT_TIME_OUT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
