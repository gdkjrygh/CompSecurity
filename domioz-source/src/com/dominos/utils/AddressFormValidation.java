// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;


public final class AddressFormValidation extends Enum
{

    private static final AddressFormValidation $VALUES[];
    public static final AddressFormValidation CAMPUS_BASE;
    public static final AddressFormValidation DORM_BUILDING;
    public static final AddressFormValidation EMPTY_CITY;
    public static final AddressFormValidation EMPTY_ROOM;
    public static final AddressFormValidation EMPTY_STATE;
    public static final AddressFormValidation EMPTY_STREET_ADDRESS;
    public static final AddressFormValidation EMPTY_SUIT_APT;
    public static final AddressFormValidation EMPTY_ZIP_CODE;

    private AddressFormValidation(String s, int i)
    {
        super(s, i);
    }

    public static AddressFormValidation valueOf(String s)
    {
        return (AddressFormValidation)Enum.valueOf(com/dominos/utils/AddressFormValidation, s);
    }

    public static AddressFormValidation[] values()
    {
        return (AddressFormValidation[])$VALUES.clone();
    }

    static 
    {
        EMPTY_STREET_ADDRESS = new AddressFormValidation("EMPTY_STREET_ADDRESS", 0);
        EMPTY_SUIT_APT = new AddressFormValidation("EMPTY_SUIT_APT", 1);
        EMPTY_ROOM = new AddressFormValidation("EMPTY_ROOM", 2);
        EMPTY_CITY = new AddressFormValidation("EMPTY_CITY", 3);
        EMPTY_STATE = new AddressFormValidation("EMPTY_STATE", 4);
        EMPTY_ZIP_CODE = new AddressFormValidation("EMPTY_ZIP_CODE", 5);
        CAMPUS_BASE = new AddressFormValidation("CAMPUS_BASE", 6);
        DORM_BUILDING = new AddressFormValidation("DORM_BUILDING", 7);
        $VALUES = (new AddressFormValidation[] {
            EMPTY_STREET_ADDRESS, EMPTY_SUIT_APT, EMPTY_ROOM, EMPTY_CITY, EMPTY_STATE, EMPTY_ZIP_CODE, CAMPUS_BASE, DORM_BUILDING
        });
    }
}
