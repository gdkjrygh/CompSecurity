// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.apps.wallet.util.view.Views;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import java.util.List;

public class KycAddressAdapter extends BaseAdapter
{

    protected final List addresses = Lists.newArrayList();
    protected final FragmentActivity context;

    public KycAddressAdapter(FragmentActivity fragmentactivity)
    {
        context = fragmentactivity;
    }

    private com.google.wallet.proto.NanoWalletEntities.Address getItem(int i)
    {
        if (i < 0 || i >= addresses.size())
        {
            return null;
        } else
        {
            return (com.google.wallet.proto.NanoWalletEntities.Address)addresses.get(i);
        }
    }

    private void renderSpinnerDropdownAddress(com.google.wallet.proto.NanoWalletEntities.Address address, View view)
    {
        TextView textview = (TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.KycAddressSpinnerItemAddressLine1);
        TextView textview1 = (TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.KycAddressSpinnerItemAddressLine2);
        view = (TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.KycAddressSpinnerItemAddressLine3);
        Views.setTextOrHide(textview, address.line1);
        Views.setTextOrHide(textview1, address.line2);
        Views.setTextOrHide(view, context.getString(com.google.android.apps.walletnfcrel.R.string.address_line3, new Object[] {
            address.city, address.state, address.postalCode
        }));
    }

    private void renderSpinnerItem(com.google.wallet.proto.NanoWalletEntities.Address address, View view)
    {
        view = (TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.KycAddressSpinnerItemFullAddress);
        if (Strings.isNullOrEmpty(address.line2))
        {
            address = context.getString(com.google.android.apps.walletnfcrel.R.string.full_address_no_line2, new Object[] {
                address.line1, address.city, address.state, address.postalCode
            });
        } else
        {
            address = context.getString(com.google.android.apps.walletnfcrel.R.string.full_address, new Object[] {
                address.line1, address.line2, address.city, address.state, address.postalCode
            });
        }
        view.setText(address);
    }

    public int getCount()
    {
        return addresses.size() + 1;
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        if (isAddAddressSelected(i))
        {
            return LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.kyc_address_spinner_add_address_item, viewgroup, false);
        } else
        {
            view = LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.kyc_address_spinner_dropdown_item, viewgroup, false);
            renderSpinnerDropdownAddress(getItem(i), view);
            return view;
        }
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return i < addresses.size() ? 0 : 1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (i >= addresses.size())
        {
            return new View(context);
        } else
        {
            view = getItem(i);
            viewgroup = LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.kyc_address_spinner_item, viewgroup, false);
            renderSpinnerItem(view, viewgroup);
            return viewgroup;
        }
    }

    public int getViewTypeCount()
    {
        return 1;
    }

    public final boolean isAddAddressSelected(int i)
    {
        return i == addresses.size();
    }

    public boolean isEmpty()
    {
        return false;
    }

    public final void setAddresses(List list)
    {
        addresses.clear();
        addresses.addAll(list);
        notifyDataSetChanged();
    }
}
