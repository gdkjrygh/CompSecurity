// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import com.analytics.utils.enums.ScreenNames;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.ui.toast.ToastUtility;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.controller.ControllerFactory;
import com.kohls.mcommerce.opal.framework.controller.iface.IRefreshTokenController;
import com.kohls.mcommerce.opal.framework.controller.iface.IRefreshTokenListener;
import com.kohls.mcommerce.opal.framework.view.component.views.GothamBoldButton;
import com.kohls.mcommerce.opal.framework.view.fragment.BaseFragment;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentOnScreen;
import com.kohls.mcommerce.opal.framework.vo.GetCustomerProfileVO;
import com.kohls.mcommerce.opal.framework.vo.ProfileInfo;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.helper.error.Error;
import com.kohls.mcommerce.opal.helper.error.ErrorHelper;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.AddressControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.CreateOrUpdateRegistryControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.listener.AddressActionListner;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.activity.AddAddressActivity;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.component.views.AddressListAdapter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

public class AddressFragment extends BaseFragment
    implements android.view.View.OnClickListener, IRefreshTokenListener, com.kohls.mcommerce.opal.modules.lnr.framework.view.component.views.AddressListAdapter.ViewClickListner
{

    public static final int REQUEST_CODE_ADD_ADDRESS = 1002;
    public static final int RESULT_UPDATE_ADDRESS = 1001;
    private GothamBoldButton mAddNewAddressBtn;
    private AddressActionListner mAddressActionListner;
    private AddressControllerImpl mAddressController;
    private AddressListAdapter mAddressListAdapter;
    private ListView mAddressListView;
    private CreateOrUpdateRegistryControllerImpl mCreateRegistryController;
    private GetCustomerProfileVO mCustomerProfile;
    private GothamBoldButton mDoneBtn;
    private FragmentOnScreen mOriginatedFromFrag;
    private View mProgressBar;
    private com.kohls.mcommerce.opal.framework.vo.ProfileInfo.Address mSelectedAddress;
    private String mSelectedShippingId;
    private List mShippingAddresses;

    public AddressFragment()
    {
    }

    private void handleLogOut()
    {
        showHideProgress(false);
        if (mAddressActionListner != null)
        {
            mAddressActionListner.performSignOut();
        }
    }

    private void setVisibilityOfDoneBtn()
    {
        if (mShippingAddresses == null || mShippingAddresses.size() <= 0)
        {
            mDoneBtn.setVisibility(8);
            return;
        } else
        {
            mDoneBtn.setVisibility(0);
            return;
        }
    }

    protected void initializeAttributes()
    {
        if (mAddressActionListner != null)
        {
            mSelectedShippingId = mAddressActionListner.getSelectedShippingId();
        }
        if (getArguments() != null)
        {
            mOriginatedFromFrag = FragmentOnScreen.values()[getArguments().getInt("origin_of_fragment", -1)];
        }
    }

    protected void initializeController()
    {
        mAddressController = new AddressControllerImpl(new WeakReference(this));
        mCreateRegistryController = (CreateOrUpdateRegistryControllerImpl)ControllerFactory.getCreateRegistryController(new WeakReference(this));
    }

    protected void initializeViews(Bundle bundle)
    {
        mAddNewAddressBtn = (GothamBoldButton)getFragmentView().findViewById(0x7f0d0157);
        mProgressBar = getFragmentView().findViewById(0x7f0d0151);
        mAddressListView = (ListView)getFragmentView().findViewById(0x7f0d0159);
        mDoneBtn = (GothamBoldButton)getFragmentView().findViewById(0x7f0d0150);
        mAddressListAdapter = new AddressListAdapter(getActivity(), this);
        mAddressListView.setAdapter(mAddressListAdapter);
        mAddNewAddressBtn.setOnClickListener(this);
        mDoneBtn.setOnClickListener(this);
    }

    protected int intializaLayoutId()
    {
        return 0x7f030026;
    }

    protected void loadContent()
    {
        if (mOriginatedFromFrag != null && (mOriginatedFromFrag == FragmentOnScreen.WEDDING_REGISTRY || mOriginatedFromFrag == FragmentOnScreen.BABY_REGISTRY || mOriginatedFromFrag == FragmentOnScreen.CELEBRATION_REGISTRY))
        {
            AnalyticsHelper.sendAnalyticsTrackStateForLnR(ScreenNames.CREATE_REGISTRY_ADDRESS, null, null, "registry|registry create", null);
        }
        if (mShippingAddresses != null)
        {
            setVisibilityOfDoneBtn();
            Iterator iterator = mShippingAddresses.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.kohls.mcommerce.opal.framework.vo.ProfileInfo.Address address = (com.kohls.mcommerce.opal.framework.vo.ProfileInfo.Address)iterator.next();
                if (mSelectedShippingId != null && address.getID().equalsIgnoreCase(mSelectedShippingId))
                {
                    mAddressListAdapter.setSelectedShippingId(true, address.getID());
                }
            } while (true);
            mAddressListAdapter.setData(mShippingAddresses);
        } else
        {
            showHideProgress(true);
            ControllerFactory.getRefreshTokenController().checkAndRefreshToken(this);
        }
        if (mAddressActionListner != null)
        {
            mAddressActionListner.setActionBarParams(this);
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 1002 && j == 1001)
        {
            if (mAddressActionListner != null)
            {
                mAddressActionListner.setShippingAddresses(null);
                mShippingAddresses = null;
            }
            loadContent();
        }
        super.onActivityResult(i, j, intent);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            mAddressActionListner = (AddressActionListner)activity;
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement OnHeadlineSelectedListener").toString());
        }
    }

    public boolean onBackPress()
    {
        return true;
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR lookupswitch 3: default 40
    //                   2131558736: 41
    //                   2131558743: 71
    //                   2131559580: 225;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        if (mAddressActionListner != null)
        {
            mAddressActionListner.onAddressSelected(mSelectedAddress);
            mDoneBtn.setVisibility(8);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        Log.e("TEST", (new StringBuilder()).append("Entry count Address = ").append(getFragmentManager().getBackStackEntryCount()).toString());
        mAddNewAddressBtn.setEnabled(false);
        view = new Bundle();
        Intent intent;
        if (mShippingAddresses != null && mShippingAddresses.size() > 0)
        {
            view.putSerializable("is first", Boolean.valueOf(false));
        } else
        {
            view.putSerializable("is first", Boolean.valueOf(true));
        }
        intent = new Intent(getActivity(), com/kohls/mcommerce/opal/modules/lnr/framework/view/activity/AddAddressActivity);
        if (mAddressActionListner != null)
        {
            view.putString("title", mAddressActionListner.getActionBarTitle());
        }
        intent.putExtras(view);
        startActivityForResult(intent, 1002);
        mAddNewAddressBtn.setEnabled(true);
        return;
_L4:
        if (mAddressActionListner != null)
        {
            mAddressActionListner.onActionBarBack();
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void onPrefferedAddressSelected(com.kohls.mcommerce.opal.framework.vo.ProfileInfo.Address address, int i)
    {
        mSelectedAddress = address;
    }

    public void onRefreshTokenFailure()
    {
        if (getActivity() != null)
        {
            getActivity().runOnUiThread(new _cls1());
        }
    }

    public void onRefreshTokenSuccess()
    {
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn())
        {
            mAddressController.fetchAddress();
            return;
        } else
        {
            showHideProgress(false);
            handleLogOut();
            return;
        }
    }

    public void onViewClick(int i, View view)
    {
        switch (view.getId())
        {
        case 2131558746: 
        case 2131558753: 
        default:
            return;

        case 2131558747: 
            break;
        }
        if (mShippingAddresses != null && mShippingAddresses.size() > i)
        {
            mSelectedAddress = (com.kohls.mcommerce.opal.framework.vo.ProfileInfo.Address)mShippingAddresses.get(i);
        } else
        {
            mSelectedAddress = null;
        }
        ((ImageView)view).setBackground(getActivity().getResources().getDrawable(0x7f020007));
        mAddressListAdapter.notifyDataSetChanged();
    }

    public void showHideProgress(boolean flag)
    {
        getActivity().runOnUiThread(new _cls2(flag));
    }

    public void updateViewsOnFailure(Object obj)
    {
label0:
        {
label1:
            {
                showHideProgress(false);
                setVisibilityOfDoneBtn();
                if (!(obj instanceof Error))
                {
                    break label0;
                }
                if (!ErrorHelper.isApplicationManagable((Error)obj))
                {
                    obj = (Error)obj;
                    if (!((Error) (obj)).getMessage().equals(""))
                    {
                        break label1;
                    }
                    Toast.makeText(getActivity(), getResources().getString(0x7f0803be), 0).show();
                }
                return;
            }
            Toast.makeText(getActivity(), ((Error) (obj)).getMessage(), 0).show();
            return;
        }
        Log.e("AddressFragment - updateViewsOnFailure", obj.toString());
        ToastUtility.showCustomToastBottom(getResources().getString(0x7f0803be));
    }

    public void updateViewsOnSuccess(Object obj)
    {
        if (obj instanceof GetCustomerProfileVO)
        {
            showHideProgress(false);
            mCustomerProfile = (GetCustomerProfileVO)obj;
            if (mCustomerProfile != null && mCustomerProfile.getPayload() != null && mCustomerProfile.getPayload().getProfile() != null && mCustomerProfile.getPayload().getProfile().getShipAddresses() != null)
            {
                mShippingAddresses = mCustomerProfile.getPayload().getProfile().getShipAddresses();
                obj = mShippingAddresses.iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    com.kohls.mcommerce.opal.framework.vo.ProfileInfo.Address address = (com.kohls.mcommerce.opal.framework.vo.ProfileInfo.Address)((Iterator) (obj)).next();
                    if (address != null && address.getPreferredAddr())
                    {
                        mShippingAddresses.remove(address);
                        mShippingAddresses.add(0, address);
                    }
                    if (mSelectedShippingId != null && address.getID().equalsIgnoreCase(mSelectedShippingId))
                    {
                        mAddressListAdapter.setSelectedShippingId(true, address.getID());
                    }
                } while (true);
                setVisibilityOfDoneBtn();
                mAddressListAdapter.setData(mShippingAddresses);
                return;
            } else
            {
                mShippingAddresses = null;
                mDoneBtn.setVisibility(8);
                return;
            }
        } else
        {
            ToastUtility.showCustomToastBottom(getResources().getString(0x7f0803be));
            return;
        }
    }



    // Unreferenced inner class com/kohls/mcommerce/opal/modules/lnr/framework/view/fragment/AddressFragment$ShippingAddressListner
    /* block-local class not found */
    class ShippingAddressListner {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
