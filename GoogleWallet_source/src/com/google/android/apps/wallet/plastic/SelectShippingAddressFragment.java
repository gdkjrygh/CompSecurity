// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.fragment.Fragments;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.list.SimpleListAdapter;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            EnterPlasticCardShippingAddressFragment, OrderPlasticCardUiModel, ConfirmPlasticCardOrderFragment, SelectShippingAddressListItemBinder

public class SelectShippingAddressFragment extends WalletFragment
{

    private SimpleListAdapter listAdapter;
    SelectShippingAddressListItemBinder listItemBinder;
    private OrderPlasticCardUiModel model;
    UserEventLogger userEventLogger;

    public SelectShippingAddressFragment()
    {
    }

    private void handleAddAddressIconClicked()
    {
        EnterPlasticCardShippingAddressFragment enterplasticcardshippingaddressfragment = new EnterPlasticCardShippingAddressFragment();
        enterplasticcardshippingaddressfragment.getArguments().putBoolean("ARG_ADD_ADDRESS", true);
        getFragmentManager().beginTransaction().replace(com.google.android.apps.walletnfcrel.R.id.ChildActivityContainer, enterplasticcardshippingaddressfragment, Fragments.getTransactionTag(com/google/android/apps/wallet/plastic/EnterPlasticCardShippingAddressFragment)).addToBackStack(null).commit();
    }

    private void handleAddressSelected()
    {
        Object obj;
        if (model.isSelectedAddressValid(getResources()))
        {
            obj = new ConfirmPlasticCardOrderFragment();
        } else
        {
            obj = new EnterPlasticCardShippingAddressFragment();
        }
        getFragmentManager().beginTransaction().replace(com.google.android.apps.walletnfcrel.R.id.ChildActivityContainer, ((android.support.v4.app.Fragment) (obj)), Fragments.getTransactionTag(obj.getClass())).addToBackStack(null).commit();
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
        menu = menu.add(0, 35, 0x30002, com.google.android.apps.walletnfcrel.R.string.add_shipping_address);
        menu.setIcon(com.google.android.apps.walletnfcrel.R.drawable.quantum_ic_add_white_24);
        menu.setShowAsActionFlags(2);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.select_shipping_address, null);
        getActivity().setTitle(com.google.android.apps.walletnfcrel.R.string.order_plastic_card_select_address_title);
        listAdapter = new SimpleListAdapter(listItemBinder);
        listAdapter.setItems(model.getAddresses());
        viewgroup = (ListView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.AddressListContainer);
        viewgroup.setAdapter(listAdapter);
        viewgroup.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final SelectShippingAddressFragment this$0;
            final OnActionListener val$onAddressSelectedListener;

            public final void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                onAddressSelectedListener.onAction(Integer.valueOf(i));
            }

            
            {
                this$0 = SelectShippingAddressFragment.this;
                onAddressSelectedListener = onactionlistener;
                super();
            }
        });
        return layoutinflater;
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 35: // '#'
            handleAddAddressIconClicked();
            break;
        }
        return true;
    }

    public final void onResume()
    {
        super.onResume();
        if (model.hasSelectedAddress())
        {
            ((ListView)Views.findViewById(getActivity(), com.google.android.apps.walletnfcrel.R.id.AddressListContainer)).setItemChecked(model.getSelectedAddressIndex(), true);
        }
    }

    public final void onStart()
    {
        super.onStart();
        userEventLogger.log(21, 91);
    }

    public final void setModel(OrderPlasticCardUiModel orderplasticcarduimodel)
    {
        model = orderplasticcarduimodel;
    }



    // Unreferenced inner class com/google/android/apps/wallet/plastic/SelectShippingAddressFragment$1

/* anonymous class */
    final class _cls1
        implements OnActionListener
    {

        final SelectShippingAddressFragment this$0;

        private void onAction(Integer integer)
        {
            model.setSelectedAddressIndex(integer.intValue());
            handleAddressSelected();
        }

        public final volatile void onAction(Object obj)
        {
            onAction((Integer)obj);
        }

            
            {
                this$0 = SelectShippingAddressFragment.this;
                super();
            }
    }

}
