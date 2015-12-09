// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.activities.UserAddLocation_;
import com.dominos.android.sdk.common.AddressUtil;
import com.dominos.android.sdk.common.ConversionUtil;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AddressType;
import com.dominos.utils.AlertType;
import com.dominos.views.CustomerPersonalInformationView;
import java.util.ArrayList;

// Referenced classes of package com.dominos.fragments:
//            BaseFragment, CustomerInformationFragment_

public class CustomerInformationFragment extends BaseFragment
{

    private static final int ADDRESS_INDEX_NEW = -1;
    public static final String TAG = com/dominos/fragments/CustomerInformationFragment.getSimpleName();
    private android.view.View.OnClickListener mAddNewAddressClickListener;
    private android.view.View.OnLongClickListener mAddNewAddressLongClickListener;
    ConversionUtil mConversionUtil;
    LinearLayout mCustomerAddressContainer;
    LinearLayout mCustomerAddressDeleteContainer;
    ImageView mCustomerNewAddressBracketImageView;
    RelativeLayout mCustomerNewAddressContainer;
    private com.dominos.views.CustomerPersonalInformationView.CustomerPersonalInformationClickListener mCustomerPersonalInfoClickListener;
    CustomerPersonalInformationView mCustomerPersonalInformationView;
    private CustomerInformationFragmentListener mListener;
    private int mSelectedAddressIndex;

    public CustomerInformationFragment()
    {
        mCustomerPersonalInfoClickListener = new _cls1();
        mAddNewAddressClickListener = new _cls2();
        mAddNewAddressLongClickListener = new _cls3();
    }

    private void addDeleteButton(int i)
    {
        ImageButton imagebutton = new ImageButton(getActivity());
        imagebutton.setTag(Integer.valueOf(i));
        imagebutton.setOnClickListener(new _cls6());
        imagebutton.setBackgroundColor(0);
        imagebutton.setPadding(0, 0, 0, 0);
        imagebutton.setImageResource(0x7f0200d4);
        imagebutton.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        imagebutton.setLayoutParams(new android.view.ViewGroup.LayoutParams(mConversionUtil.dpToPixels(25), mConversionUtil.dpToPixels(51)));
        mCustomerAddressDeleteContainer.addView(imagebutton, 0);
    }

    private void navigateToAddLocation(int i)
    {
        Intent intent = UserAddLocation_.intent(this).get();
        if (i == -1)
        {
            intent.putExtra("edit_add", true);
        } else
        {
            intent.putExtra("locationIndex", i);
        }
        startActivityForResult(intent, 48);
    }

    public static CustomerInformationFragment newInstance()
    {
        return CustomerInformationFragment_.builder().build();
    }

    protected void deleteAddress(int i)
    {
        mProfileManager.deleteAddress(i, new _cls5());
    }

    public void onAddNewLocationClick()
    {
        navigateToAddLocation(-1);
    }

    public void onAddressAddResult(int i)
    {
        i;
        JVM INSTR tableswitch 1 2: default 24
    //                   1 30
    //                   2 25;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        updateViews();
        return;
_L2:
        if (mListener != null)
        {
            mListener.onNavigatedToCart();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onAfterViews()
    {
        FontManager.applyDominosFont(this);
        updateViews();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (activity instanceof CustomerInformationFragmentListener)
        {
            mListener = (CustomerInformationFragmentListener)activity;
        }
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() != 0x7f0f04de) goto _L2; else goto _L1
_L1:
        navigateToAddLocation(mSelectedAddressIndex);
_L4:
        mSelectedAddressIndex = -1;
        return true;
_L2:
        if (menuitem.getItemId() == 0x7f0f04df)
        {
            promptAddressDelete(mSelectedAddressIndex);
            continue; /* Loop/switch isn't completed */
        }
        if (menuitem.getItemId() == 0x7f0f04dd)
        {
            if (mListener != null)
            {
                mListener.onCarryoutOrderRequestedForSavedAddress(mSelectedAddressIndex);
            }
            continue; /* Loop/switch isn't completed */
        }
        if (menuitem.getItemId() != 0x7f0f04dc)
        {
            break; /* Loop/switch isn't completed */
        }
        if (mListener != null)
        {
            mListener.onDeliveryOrderRequestedForSavedAddress(mSelectedAddressIndex);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return super.onContextItemSelected(menuitem);
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
        mSelectedAddressIndex = ((Integer)view.getTag()).intValue();
        getActivity().getMenuInflater().inflate(0x7f110001, contextmenu);
    }

    public void onDetach()
    {
        super.onDetach();
        mListener = null;
    }

    protected void promptAddressDelete(final int addressIndex)
    {
        mActivityHelper.showOptionAlert(AlertType.REMOVE_SAVED_ADDRESS, null, new _cls4());
    }

    protected void updateAddressViews()
    {
        UserObject userobject = mProfileManager.getCurrentUser();
        mCustomerAddressContainer.removeViews(0, mCustomerAddressContainer.getChildCount() - 1);
        mCustomerAddressDeleteContainer.removeAllViews();
        int i;
        if (userobject.getAddressList().size() == 0)
        {
            mCustomerNewAddressContainer.setBackgroundResource(0x7f020055);
        } else
        {
            mCustomerNewAddressContainer.setBackgroundResource(0x7f020053);
        }
        mCustomerNewAddressBracketImageView.setVisibility(8);
        i = 0;
        while (i < userobject.getAddressList().size()) 
        {
            LabsAddress labsaddress = (LabsAddress)userobject.getAddressList().get(i);
            RelativeLayout relativelayout = (RelativeLayout)getActivity().getLayoutInflater().inflate(0x7f03007a, null);
            if (i == userobject.getAddressList().size() - 1)
            {
                relativelayout.setBackgroundResource(0x7f020056);
            }
            Object obj = relativelayout.findViewById(0x7f0f0318);
            Object obj1 = ((View) (obj)).getLayoutParams();
            obj1.width = 5;
            ((View) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
            obj = (TextView)relativelayout.findViewById(0x7f0f031b);
            if (labsaddress.isDefault())
            {
                ((TextView) (obj)).setText((new StringBuilder()).append(labsaddress.getName()).append(" ").append(getString(0x7f080250)).toString());
            } else
            {
                ((TextView) (obj)).setText(labsaddress.getName());
            }
            obj1 = labsaddress.getStreet();
            obj = obj1;
            if (StringHelper.equalsIgnoreCase(labsaddress.getAddressType(), AddressType.TYPE_CAMPUS_BASE.getId()))
            {
                obj = AddressUtil.removeZeroFromStreetAddress(((String) (obj1)));
            }
            if (StringHelper.trim(((String) (obj))).length() > 0)
            {
                ((TextView)relativelayout.findViewById(0x7f0f031c)).setText((new StringBuilder("(")).append(((String) (obj))).append(")").toString());
            }
            relativelayout.setTag(Integer.valueOf(i));
            relativelayout.findViewById(0x7f0f011c).setVisibility(8);
            relativelayout.setOnClickListener(mAddNewAddressClickListener);
            relativelayout.setOnLongClickListener(mAddNewAddressLongClickListener);
            registerForContextMenu(relativelayout);
            addDeleteButton(i);
            mCustomerAddressContainer.addView(relativelayout, 0);
            i++;
        }
        FontManager.applyDominosFont(mCustomerAddressContainer);
    }

    public void updateEditMode(boolean flag)
    {
        LinearLayout linearlayout = mCustomerAddressDeleteContainer;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        linearlayout.setVisibility(i);
    }

    public void updateViews()
    {
        UserObject userobject = mProfileManager.getCurrentUser();
        mCustomerPersonalInformationView.bind(userobject, com.dominos.views.CustomerPersonalInformationView.ViewMode.DEFAULT, mCustomerPersonalInfoClickListener);
        updateAddressViews();
    }




    private class _cls1
        implements com.dominos.views.CustomerPersonalInformationView.CustomerPersonalInformationClickListener
    {

        final CustomerInformationFragment this$0;

        public void onPersonalInformationClicked()
        {
            if (mListener != null)
            {
                mListener.onCustomerInfoModificationRequested();
            }
        }

        public void onPersonalInformationFooterClicked()
        {
        }

        _cls1()
        {
            this$0 = CustomerInformationFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final CustomerInformationFragment this$0;

        public void onClick(View view)
        {
            int i = ((Integer)view.getTag()).intValue();
            navigateToAddLocation(i);
        }

        _cls2()
        {
            this$0 = CustomerInformationFragment.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnLongClickListener
    {

        final CustomerInformationFragment this$0;

        public boolean onLongClick(View view)
        {
            getActivity().openContextMenu(view);
            return true;
        }

        _cls3()
        {
            this$0 = CustomerInformationFragment.this;
            super();
        }
    }


    private class _cls6
        implements android.view.View.OnClickListener
    {

        final CustomerInformationFragment this$0;

        public void onClick(View view)
        {
            int i = ((Integer)view.getTag()).intValue();
            promptAddressDelete(i);
        }

        _cls6()
        {
            this$0 = CustomerInformationFragment.this;
            super();
        }
    }


    private class _cls5 extends com.dominos.android.sdk.core.user.UserProfileManager.DeleteAddressCallback
    {

        final CustomerInformationFragment this$0;

        public void onAddressDeleteFailure()
        {
            showShortToast(getString(0x7f080118));
        }

        public void onAddressDeleted()
        {
            updateAddressViews();
            showShortToast(getString(0x7f080192));
        }

        public void onBegin()
        {
            super.onBegin();
            showLoading();
        }

        public void onFinish()
        {
            super.onFinish();
            hideLoading();
        }

        _cls5()
        {
            this$0 = CustomerInformationFragment.this;
            super();
        }
    }


    private class CustomerInformationFragmentListener
    {

        public abstract void onCarryoutOrderRequestedForSavedAddress(int i);

        public abstract void onCustomerInfoModificationRequested();

        public abstract void onDeliveryOrderRequestedForSavedAddress(int i);

        public abstract void onNavigatedToCart();
    }


    private class _cls4 extends com.dominos.utils.ActivityHelper.OptionAlertActionCallback
    {

        final CustomerInformationFragment this$0;
        final int val$addressIndex;

        public void onNegativeButtonClicked()
        {
        }

        public void onNeutralButtonClicked()
        {
        }

        public void onPositiveButtonClicked()
        {
            deleteAddress(addressIndex);
        }

        _cls4()
        {
            this$0 = CustomerInformationFragment.this;
            addressIndex = i;
            super();
        }
    }

}
