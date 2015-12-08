// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.event;

import com.pinterest.activity.commerce.model.ContactAddressItem;

public class ContactAddressSelectedEvent
{

    private ContactAddressItem contactAddressItem;

    public ContactAddressSelectedEvent(ContactAddressItem contactaddressitem)
    {
        contactAddressItem = contactaddressitem;
    }

    public ContactAddressItem getContactAddressItem()
    {
        return contactAddressItem;
    }
}
