// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;


final class  extends Enum
{

    private static final BUTTON $VALUES[];
    public static final BUTTON BUTTON;
    public static final BUTTON PIE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/fragments/LoyaltyWidgetFragment$RedemptionSource, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PIE = new <init>("PIE", 0);
        BUTTON = new <init>("BUTTON", 1);
        $VALUES = (new .VALUES[] {
            PIE, BUTTON
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
