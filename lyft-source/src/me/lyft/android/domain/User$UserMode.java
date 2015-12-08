// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain;


public final class  extends Enum
{

    private static final UNAUTHORIZED $VALUES[];
    public static final UNAUTHORIZED DRIVER;
    public static final UNAUTHORIZED PASSENGER;
    public static final UNAUTHORIZED UNAUTHORIZED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(me/lyft/android/domain/User$UserMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PASSENGER = new <init>("PASSENGER", 0);
        DRIVER = new <init>("DRIVER", 1);
        UNAUTHORIZED = new <init>("UNAUTHORIZED", 2);
        $VALUES = (new .VALUES[] {
            PASSENGER, DRIVER, UNAUTHORIZED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
