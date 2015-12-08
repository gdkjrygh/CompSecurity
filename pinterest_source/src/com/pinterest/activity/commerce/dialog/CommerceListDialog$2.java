// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;


class pe
{

    static final int $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$Type[];
    static final int $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$ViewType[];

    static 
    {
        $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$ViewType = new int[ewType.values().length];
        try
        {
            $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$ViewType[ewType.Quantity.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$ViewType[ewType.AddAddress.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$ViewType[ewType.AddPayment.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$ViewType[ewType.ContactAddress.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$ViewType[ewType.DetailedShipping.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$ViewType[ewType.ShippingRate.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$ViewType[ewType.UserCard.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$Type = new int[pe.values().length];
        try
        {
            $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$Type[pe.Quantity.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$Type[pe.ShippingAddress.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$Type[pe.ShippingMethod.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$Type[pe.PaymentMethod.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$pinterest$activity$commerce$dialog$CommerceListDialog$Type[pe.ContactAddress.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
