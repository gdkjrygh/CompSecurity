// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;


public final class value extends Enum
{

    private static final PROCESSED $VALUES[];
    public static final PROCESSED ACCEPTED;
    public static final PROCESSED APPROACHING;
    public static final PROCESSED ARRIVED;
    public static final PROCESSED CANCELED;
    public static final PROCESSED COMPLETED;
    public static final PROCESSED DROPPEDOFF;
    public static final PROCESSED IDLE;
    public static final PROCESSED LAPSED;
    public static final PROCESSED PENDING;
    public static final PROCESSED PICKEDUP;
    public static final PROCESSED PROCESSED;
    private String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(me/lyft/android/domain/ride/RideStatus$Status, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    public String toString()
    {
        return value;
    }

    static 
    {
        IDLE = new <init>("IDLE", 0, "idle");
        LAPSED = new <init>("LAPSED", 1, "lapsed");
        PENDING = new <init>("PENDING", 2, "pending");
        ACCEPTED = new <init>("ACCEPTED", 3, "accepted");
        APPROACHING = new <init>("APPROACHING", 4, "approaching");
        CANCELED = new <init>("CANCELED", 5, "canceled");
        ARRIVED = new <init>("ARRIVED", 6, "arrived");
        PICKEDUP = new <init>("PICKEDUP", 7, "pickedUp");
        DROPPEDOFF = new <init>("DROPPEDOFF", 8, "droppedOff");
        COMPLETED = new <init>("COMPLETED", 9, "completed");
        PROCESSED = new <init>("PROCESSED", 10, "processed");
        $VALUES = (new .VALUES[] {
            IDLE, LAPSED, PENDING, ACCEPTED, APPROACHING, CANCELED, ARRIVED, PICKEDUP, DROPPEDOFF, COMPLETED, 
            PROCESSED
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
