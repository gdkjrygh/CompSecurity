// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;


public final class  extends Enum
{

    private static final ADDRESS_TYPE_OTHER $VALUES[];
    public static final ADDRESS_TYPE_OTHER ADDRESS_TYPE_APARTMENT;
    public static final ADDRESS_TYPE_OTHER ADDRESS_TYPE_BUSINESS;
    public static final ADDRESS_TYPE_OTHER ADDRESS_TYPE_CAMPUS_BASE;
    public static final ADDRESS_TYPE_OTHER ADDRESS_TYPE_DORMITORY;
    public static final ADDRESS_TYPE_OTHER ADDRESS_TYPE_HOTEL;
    public static final ADDRESS_TYPE_OTHER ADDRESS_TYPE_HOUSE;
    public static final ADDRESS_TYPE_OTHER ADDRESS_TYPE_OTHER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/utils/AddressType$AddressTypeIndex, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ADDRESS_TYPE_HOUSE = new <init>("ADDRESS_TYPE_HOUSE", 0);
        ADDRESS_TYPE_APARTMENT = new <init>("ADDRESS_TYPE_APARTMENT", 1);
        ADDRESS_TYPE_CAMPUS_BASE = new <init>("ADDRESS_TYPE_CAMPUS_BASE", 2);
        ADDRESS_TYPE_HOTEL = new <init>("ADDRESS_TYPE_HOTEL", 3);
        ADDRESS_TYPE_BUSINESS = new <init>("ADDRESS_TYPE_BUSINESS", 4);
        ADDRESS_TYPE_DORMITORY = new <init>("ADDRESS_TYPE_DORMITORY", 5);
        ADDRESS_TYPE_OTHER = new <init>("ADDRESS_TYPE_OTHER", 6);
        $VALUES = (new .VALUES[] {
            ADDRESS_TYPE_HOUSE, ADDRESS_TYPE_APARTMENT, ADDRESS_TYPE_CAMPUS_BASE, ADDRESS_TYPE_HOTEL, ADDRESS_TYPE_BUSINESS, ADDRESS_TYPE_DORMITORY, ADDRESS_TYPE_OTHER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
