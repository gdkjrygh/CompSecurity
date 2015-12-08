// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.model.commerce;


public final class value extends Enum
{

    private static final FAILED $VALUES[];
    public static final FAILED DELIVERED;
    public static final FAILED FAILED;
    public static final FAILED NEW;
    public static final FAILED SUBMITTED;
    public static final FAILED UNCONFIRMED;
    public static final FAILED VERIFIED;
    int value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/pinterest/model/commerce/Incentive$IncentiveStatus, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    public final int getValue()
    {
        return value;
    }

    static 
    {
        NEW = new <init>("NEW", 0, 1);
        VERIFIED = new <init>("VERIFIED", 1, 2);
        SUBMITTED = new <init>("SUBMITTED", 2, 3);
        DELIVERED = new <init>("DELIVERED", 3, 4);
        UNCONFIRMED = new <init>("UNCONFIRMED", 4, 10);
        FAILED = new <init>("FAILED", 5, 11);
        $VALUES = (new .VALUES[] {
            NEW, VERIFIED, SUBMITTED, DELIVERED, UNCONFIRMED, FAILED
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
