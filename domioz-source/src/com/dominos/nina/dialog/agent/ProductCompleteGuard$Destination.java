// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;


final class  extends Enum
{

    private static final COUPON_WIZARD $VALUES[];
    public static final COUPON_WIZARD COUPON_WIZARD;
    public static final COUPON_WIZARD MAIN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/nina/dialog/agent/ProductCompleteGuard$Destination, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MAIN = new <init>("MAIN", 0);
        COUPON_WIZARD = new <init>("COUPON_WIZARD", 1);
        $VALUES = (new .VALUES[] {
            MAIN, COUPON_WIZARD
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
