// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.framework.view.activity;

import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.ui.toast.ToastUtility;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.controller.ControllerFactory;
import com.kohls.mcommerce.opal.framework.view.activity.BaseActivityWithoutSlider;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.helper.error.Error;
import com.kohls.mcommerce.opal.helper.error.ErrorHelper;
import com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPO;
import com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPropertiesPO;
import com.kohls.mcommerce.opal.modules.lnr.common.po.ShipmentAddressPO;
import com.kohls.mcommerce.opal.modules.lnr.common.util.LnRUtility;
import com.kohls.mcommerce.opal.modules.lnr.framework.controller.impl.CreateOrUpdateRegistryControllerImpl;
import com.kohls.mcommerce.opal.modules.lnr.framework.listener.AddressActionListner;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.AddressFragment;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO;
import java.lang.ref.WeakReference;
import java.util.List;

public class ShippingAddressActivity extends BaseActivityWithoutSlider
    implements AddressActionListner
{

    private AddressFragment mAddressFragment;
    private com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList mRegistryObj;
    private RegistryPO mRegistryPO;
    private com.kohls.mcommerce.opal.framework.vo.ProfileInfo.Address mSelectedAddress;
    private String mSelectedShippingId;
    private List mShippingAddresses;
    private CreateOrUpdateRegistryControllerImpl mUpdateRegistryControllerImpl;

    public ShippingAddressActivity()
    {
    }

    public String getActionBarTitle()
    {
        return getString(0x7f08037e);
    }

    protected int getLayoutId()
    {
        return 0x7f0300ff;
    }

    public String getSelectedShippingId()
    {
        return mSelectedShippingId;
    }

    public List getShippingAddresses()
    {
        return mShippingAddresses;
    }

    protected void initializeViews(Bundle bundle)
    {
        if (getIntent() != null && getIntent().getExtras() != null)
        {
            mRegistryObj = (com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList)getIntent().getExtras().getSerializable("registry po");
            mRegistryPO = LnRUtility.mapWishlistToRegistryPO(mRegistryObj);
            bundle = mRegistryObj.getRegistryProperties().getShipmentAddress();
            if (bundle != null)
            {
                mSelectedShippingId = bundle.getID();
            }
        }
        mAddressFragment = (AddressFragment)getFragmentManager().findFragmentById(0x7f0d013a);
    }

    public void onActionBarBack()
    {
        finish();
    }

    public void onAddressSelected(com.kohls.mcommerce.opal.framework.vo.ProfileInfo.Address address)
    {
        mSelectedAddress = address;
        address = new ShipmentAddressPO();
        if (mSelectedAddress != null)
        {
            address.setID(mSelectedAddress.getID());
            address.setFirstName(mSelectedAddress.getFirstName());
            address.setLastName(mSelectedAddress.getLastName());
            address.setPostalCode(mSelectedAddress.getPostalCode());
            address.setPhoneNumber(mSelectedAddress.getPhoneNumber());
            address.setAddr1(mSelectedAddress.getAddr1());
            address.setAddr2(mSelectedAddress.getAddr2());
            address.setCity(mSelectedAddress.getCity());
            address.setState(mSelectedAddress.getState());
            address.setCountryCode(mSelectedAddress.getCountryCode());
        }
        com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPO.RProperties rproperties = mRegistryPO.getRegistryProperties();
        rproperties.getProperties().setCity(mSelectedAddress.getCity());
        rproperties.getProperties().setState(mSelectedAddress.getState());
        rproperties.setShipmentAddress(address);
        mUpdateRegistryControllerImpl = (CreateOrUpdateRegistryControllerImpl)ControllerFactory.getCreateRegistryController(null, new WeakReference(this));
        if (!UtilityMethods.isNetworkConnected(this))
        {
            Toast.makeText(this, getResources().getString(0x7f0803cd), 0).show();
            return;
        }
        if (mAddressFragment != null && mAddressFragment.isVisible() && !mAddressFragment.isRemoving())
        {
            mAddressFragment.showHideProgress(true);
        }
        mUpdateRegistryControllerImpl.updateRegistry(mRegistryPO, mRegistryObj.getListId());
    }

    public void onBackPressed()
    {
        super.onBackPressed();
    }

    public void performSignOut()
    {
        KohlsPhoneApplication.getInstance().getAuthenticationUtils().setUserSignInStatus(false);
        UtilityMethods.openAccountActivity(this, true, true);
    }

    public void setActionBarParams(android.view.View.OnClickListener onclicklistener)
    {
        getActionBarHelper().showActionBarForCreateRegistry(getString(0x7f08037e));
        getActionBarHelper().getBackButtonView().setOnClickListener(onclicklistener);
    }

    public void setShippingAddresses(List list)
    {
        mShippingAddresses = list;
    }

    protected void updateActionBarViews()
    {
    }

    public void updateViewsOnFailure(Object obj)
    {
label0:
        {
label1:
            {
                mAddressFragment.showHideProgress(false);
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
                    Toast.makeText(this, getResources().getString(0x7f0803be), 0).show();
                }
                return;
            }
            Toast.makeText(this, ((Error) (obj)).getMessage(), 0).show();
            return;
        }
        Log.e("AddressFragment - updateViewsOnFailure", obj.toString());
        ToastUtility.showCustomToastBottom(getResources().getString(0x7f0803be));
    }

    public void updateViewsOnSuccess(Object obj)
    {
        if (!(obj instanceof MyRegistryVO)) goto _L2; else goto _L1
_L1:
        obj = (MyRegistryVO)obj;
        ((MyRegistryVO) (obj)).getResponseCode();
        JVM INSTR tableswitch 0 0: default 36
    //                   0 58;
           goto _L3 _L4
_L3:
        ToastUtility.showCustomToastBottom(getResources().getString(0x7f0803be));
_L5:
        mAddressFragment.showHideProgress(false);
        return;
_L4:
        obj = ((MyRegistryVO) (obj)).getWishList();
        if (obj != null)
        {
            Intent intent = getIntent();
            Bundle bundle = getIntent().getExtras();
            bundle.putSerializable("registry po", ((java.io.Serializable) (obj)));
            intent.putExtras(bundle);
            setResult(-1, intent);
            finish();
        } else
        {
            ToastUtility.showCustomToastBottom(getResources().getString(0x7f0803be));
        }
        if (true) goto _L5; else goto _L2
_L2:
        ToastUtility.showCustomToastBottom(getResources().getString(0x7f0803be));
        return;
    }
}
