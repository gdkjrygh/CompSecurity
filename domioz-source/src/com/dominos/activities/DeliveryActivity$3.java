// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.utils.AddressFormValidation;

class ndex
{

    static final int $SwitchMap$com$dominos$utils$AddressFormValidation[];
    static final int $SwitchMap$com$dominos$utils$AddressType$AddressTypeIndex[];

    static 
    {
        $SwitchMap$com$dominos$utils$AddressType$AddressTypeIndex = new int[com.dominos.utils.TypeIndex.values().length];
        try
        {
            $SwitchMap$com$dominos$utils$AddressType$AddressTypeIndex[com.dominos.utils.TypeIndex.ADDRESS_TYPE_HOUSE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$dominos$utils$AddressType$AddressTypeIndex[com.dominos.utils.TypeIndex.ADDRESS_TYPE_APARTMENT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$dominos$utils$AddressType$AddressTypeIndex[com.dominos.utils.TypeIndex.ADDRESS_TYPE_CAMPUS_BASE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$dominos$utils$AddressType$AddressTypeIndex[com.dominos.utils.TypeIndex.ADDRESS_TYPE_HOTEL.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$dominos$utils$AddressType$AddressTypeIndex[com.dominos.utils.TypeIndex.ADDRESS_TYPE_BUSINESS.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$dominos$utils$AddressType$AddressTypeIndex[com.dominos.utils.TypeIndex.ADDRESS_TYPE_DORMITORY.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$dominos$utils$AddressType$AddressTypeIndex[com.dominos.utils.TypeIndex.ADDRESS_TYPE_OTHER.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        $SwitchMap$com$dominos$utils$AddressFormValidation = new int[AddressFormValidation.values().length];
        try
        {
            $SwitchMap$com$dominos$utils$AddressFormValidation[AddressFormValidation.EMPTY_STREET_ADDRESS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$dominos$utils$AddressFormValidation[AddressFormValidation.EMPTY_SUIT_APT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$dominos$utils$AddressFormValidation[AddressFormValidation.EMPTY_ROOM.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$dominos$utils$AddressFormValidation[AddressFormValidation.EMPTY_CITY.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$dominos$utils$AddressFormValidation[AddressFormValidation.EMPTY_STATE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$dominos$utils$AddressFormValidation[AddressFormValidation.EMPTY_ZIP_CODE.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$dominos$utils$AddressFormValidation[AddressFormValidation.CAMPUS_BASE.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$dominos$utils$AddressFormValidation[AddressFormValidation.DORM_BUILDING.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
