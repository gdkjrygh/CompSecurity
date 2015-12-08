// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;


public final class _cls9 extends Enum
{

    private static final NONE $VALUES[];
    public static final NONE DAILY;
    public static final NONE NONE;
    public static final NONE WEEKLY;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(me/lyft/android/domain/driver/DriverActivities$Type, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        DAILY = new <init>("DAILY", 0);
        WEEKLY = new <init>("WEEKLY", 1);
        NONE = new <init>("NONE", 2);
        $VALUES = (new .VALUES[] {
            DAILY, WEEKLY, NONE
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
