// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux;


public final class  extends Enum
{

    private static final TWITTER $VALUES[];
    public static final TWITTER FACEBOOK;
    public static final TWITTER INTEREST;
    public static final TWITTER TWITTER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/nux/NUXActivity$NUXProgressChangeEvent$EventType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        INTEREST = new <init>("INTEREST", 0);
        FACEBOOK = new <init>("FACEBOOK", 1);
        TWITTER = new <init>("TWITTER", 2);
        $VALUES = (new .VALUES[] {
            INTEREST, FACEBOOK, TWITTER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
