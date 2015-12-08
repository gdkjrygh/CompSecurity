// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;


public final class  extends Enum
{

    private static final MONEY $VALUES[];
    public static final MONEY COUNT;
    public static final MONEY MONEY;
    public static final MONEY PERCENTAGE;
    public static final MONEY TIME;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(me/lyft/android/domain/driver/Dial$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        COUNT = new <init>("COUNT", 0);
        TIME = new <init>("TIME", 1);
        PERCENTAGE = new <init>("PERCENTAGE", 2);
        MONEY = new <init>("MONEY", 3);
        $VALUES = (new .VALUES[] {
            COUNT, TIME, PERCENTAGE, MONEY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
