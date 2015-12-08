// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.model.commerce;


public final class  extends Enum
{

    private static final EXCEPTION $VALUES[];
    public static final EXCEPTION EXCEPTION;
    public static final EXCEPTION FAILED;
    public static final EXCEPTION NEW;
    public static final EXCEPTION PAID;
    public static final EXCEPTION SUBMITTED;
    public static final EXCEPTION UNCONFIRMED;
    public static final EXCEPTION UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/model/commerce/Cart$PaymentStatus, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0);
        NEW = new <init>("NEW", 1);
        UNCONFIRMED = new <init>("UNCONFIRMED", 2);
        SUBMITTED = new <init>("SUBMITTED", 3);
        PAID = new <init>("PAID", 4);
        FAILED = new <init>("FAILED", 5);
        EXCEPTION = new <init>("EXCEPTION", 6);
        $VALUES = (new .VALUES[] {
            UNKNOWN, NEW, UNCONFIRMED, SUBMITTED, PAID, FAILED, EXCEPTION
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
