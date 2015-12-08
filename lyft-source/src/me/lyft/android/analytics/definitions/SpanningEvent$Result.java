// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;


public final class  extends Enum
{

    private static final PROHIBITED $VALUES[];
    public static final PROHIBITED CANCELED;
    public static final PROHIBITED FAILURE;
    public static final PROHIBITED PROHIBITED;
    public static final PROHIBITED SUCCESS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(me/lyft/android/analytics/definitions/SpanningEvent$Result, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public String toString()
    {
        return name().toLowerCase();
    }

    static 
    {
        SUCCESS = new <init>("SUCCESS", 0);
        FAILURE = new <init>("FAILURE", 1);
        CANCELED = new <init>("CANCELED", 2);
        PROHIBITED = new <init>("PROHIBITED", 3);
        $VALUES = (new .VALUES[] {
            SUCCESS, FAILURE, CANCELED, PROHIBITED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
