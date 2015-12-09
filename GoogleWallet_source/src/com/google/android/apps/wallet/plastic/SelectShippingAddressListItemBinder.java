// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.wallet.base.view.DefaultViewHolder;
import com.google.android.apps.wallet.base.view.ViewHolder;
import com.google.android.apps.wallet.widgets.list.ListItemBinder;

public class SelectShippingAddressListItemBinder
    implements ListItemBinder
{
    static final class AddressListItemDisplay extends DefaultViewHolder
    {

        private TextView mCityStateZip;
        private TextView mLine1;
        private TextView mLine2;
        private TextView mRecipientName;

        public final void setCityStateZip(String s)
        {
            mCityStateZip.setText(s);
        }

        public final void setLine1(String s)
        {
            mLine1.setText(s);
        }

        public final void setLine2(String s)
        {
            mLine2.setText(s);
            TextView textview = mLine2;
            byte byte0;
            if (s == null || s.isEmpty())
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            textview.setVisibility(byte0);
        }

        public final void setRecipientName(String s)
        {
            mRecipientName.setText(s);
        }

        public final void setView(View view)
        {
            super.setView(view);
            mRecipientName = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.AddressListItemRecipientName);
            mLine1 = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.AddressListItemLine1);
            mLine2 = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.AddressListItemLine2);
            mCityStateZip = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.AddressListItemCityStateZip);
        }

        public AddressListItemDisplay()
        {
            super(com.google.android.apps.walletnfcrel.R.layout.select_shipping_address_list_item);
        }
    }


    private final LayoutInflater mLayoutInflater;

    SelectShippingAddressListItemBinder(LayoutInflater layoutinflater)
    {
        mLayoutInflater = layoutinflater;
    }

    private void bind(int i, ViewHolder viewholder, com.google.wallet.proto.NanoWalletEntities.Address address)
    {
        viewholder = (AddressListItemDisplay)viewholder;
        viewholder.setRecipientName(address.recipientName);
        viewholder.setLine1(address.line1);
        viewholder.setLine2(address.line2);
        viewholder.setCityStateZip(formatCityStateZipString(address));
    }

    private AddressListItemDisplay createDisplay()
    {
        AddressListItemDisplay addresslistitemdisplay = new AddressListItemDisplay();
        addresslistitemdisplay.createView(mLayoutInflater);
        return addresslistitemdisplay;
    }

    private static String formatCityStateZipString(com.google.wallet.proto.NanoWalletEntities.Address address)
    {
        return String.format("%s, %s %s", new Object[] {
            address.city, address.state, address.postalCode
        });
    }

    private static boolean isEnabled(com.google.wallet.proto.NanoWalletEntities.Address address)
    {
        return true;
    }

    public final volatile void bind(int i, ViewHolder viewholder, Object obj)
    {
        bind(i, viewholder, (com.google.wallet.proto.NanoWalletEntities.Address)obj);
    }

    public final volatile ViewHolder createDisplay()
    {
        return createDisplay();
    }

    public final volatile boolean isEnabled(Object obj)
    {
        return isEnabled((com.google.wallet.proto.NanoWalletEntities.Address)obj);
    }
}
