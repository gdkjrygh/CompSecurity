// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            Alarm

private static final class bitField extends Enum
{

    private static final SUNDAY $VALUES[];
    public static final SUNDAY FRIDAY;
    public static final SUNDAY MONDAY;
    public static final SUNDAY SATURDAY;
    public static final SUNDAY SUNDAY;
    public static final SUNDAY THURSDAY;
    public static final SUNDAY TUESDAY;
    public static final SUNDAY WEDNESDAY;
    private int bitField;

    public static bitField valueOf(String s)
    {
        return (bitField)Enum.valueOf(com/fitbit/data/domain/Alarm$WeekDay, s);
    }

    public static bitField[] values()
    {
        return (bitField[])$VALUES.clone();
    }

    public int bitField()
    {
        return bitField;
    }

    static 
    {
        MONDAY = new <init>("MONDAY", 0, 1);
        TUESDAY = new <init>("TUESDAY", 1, 2);
        WEDNESDAY = new <init>("WEDNESDAY", 2, 4);
        THURSDAY = new <init>("THURSDAY", 3, 8);
        FRIDAY = new <init>("FRIDAY", 4, 16);
        SATURDAY = new <init>("SATURDAY", 5, 32);
        SUNDAY = new <init>("SUNDAY", 6, 64);
        $VALUES = (new .VALUES[] {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        bitField = j;
    }
}
