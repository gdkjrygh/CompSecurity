// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.location.Address;
import android.location.Geocoder;
import com.google.common.base.Strings;
import com.pinterest.activity.commerce.model.ContactAddressItem;
import com.pinterest.activity.sendapin.providers.ContactsProvider;
import com.pinterest.common.async.BackgroundTask;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.pinterest.activity.commerce:
//            CommerceAddressManager

class dressItemsFetchedListener extends BackgroundTask
{

    ArrayList contactAddressItems;
    final CommerceAddressManager this$0;
    final dressItemsFetchedListener val$addressItemsFetchedListener;

    public void onFinish()
    {
        if (val$addressItemsFetchedListener != null)
        {
            val$addressItemsFetchedListener.onAddressItemsFetched(contactAddressItems);
        }
    }

    public void run()
    {
        contactAddressItems = ContactsProvider.getContactsWithAddress(CommerceAddressManager.access$000(CommerceAddressManager.this));
        Iterator iterator = contactAddressItems.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ContactAddressItem contactaddressitem = (ContactAddressItem)iterator.next();
            try
            {
                if (!Strings.isNullOrEmpty(contactaddressitem.getStreetAddress1()) && Strings.isNullOrEmpty(contactaddressitem.getCity()) && Strings.isNullOrEmpty(contactaddressitem.getState()) && Strings.isNullOrEmpty(contactaddressitem.getZipCode()))
                {
                    Object obj = (new Geocoder(CommerceAddressManager.access$000(CommerceAddressManager.this))).getFromLocationName(contactaddressitem.getStreetAddress1(), 1);
                    if (!((List) (obj)).isEmpty())
                    {
                        obj = (Address)((List) (obj)).get(0);
                        StringBuilder stringbuilder = new StringBuilder();
                        if (!Strings.isNullOrEmpty(((Address) (obj)).getSubThoroughfare()))
                        {
                            stringbuilder.append(((Address) (obj)).getSubThoroughfare()).append(" ");
                        }
                        if (!Strings.isNullOrEmpty(((Address) (obj)).getThoroughfare()))
                        {
                            stringbuilder.append(((Address) (obj)).getThoroughfare());
                        }
                        contactaddressitem.setStreetAddress1(stringbuilder.toString());
                        if (!Strings.isNullOrEmpty(((Address) (obj)).getLocality()))
                        {
                            contactaddressitem.setCity(((Address) (obj)).getLocality());
                        }
                        if (!Strings.isNullOrEmpty(((Address) (obj)).getAdminArea()))
                        {
                            contactaddressitem.setState((String)CommerceAddressManager.access$100().get(((Address) (obj)).getAdminArea().toLowerCase()));
                        }
                        if (!Strings.isNullOrEmpty(((Address) (obj)).getPostalCode()))
                        {
                            contactaddressitem.setZipCode(((Address) (obj)).getPostalCode());
                        }
                    }
                }
            }
            catch (IOException ioexception) { }
            if (!Strings.isNullOrEmpty(contactaddressitem.getState()))
            {
                if (contactaddressitem.getState().length() != 2)
                {
                    contactaddressitem.setState((String)CommerceAddressManager.access$100().get(contactaddressitem.getState().toLowerCase()));
                } else
                {
                    contactaddressitem.setState(contactaddressitem.getState().toUpperCase());
                }
            }
        } while (true);
    }

    dressItemsFetchedListener()
    {
        this$0 = final_commerceaddressmanager;
        val$addressItemsFetchedListener = dressItemsFetchedListener.this;
        super();
    }
}
