// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.text.Html;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.AddressUtil;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.dialogs.LoginDialogFragment;
import com.dominos.fragments.address.AddressApartmentFragment_;
import com.dominos.fragments.address.AddressBaseFragment;
import com.dominos.fragments.address.AddressBusinessFragment_;
import com.dominos.fragments.address.AddressCampusBaseFragment_;
import com.dominos.fragments.address.AddressDormitoryFragment_;
import com.dominos.fragments.address.AddressHotelFragment_;
import com.dominos.fragments.address.AddressHouseFragment_;
import com.dominos.fragments.address.AddressOtherFragment_;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AddressFormValidation;
import com.dominos.utils.AddressType;
import com.dominos.utils.AlertType;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.views.ToolBarView;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.dominos.activities:
//            BaseActivity, CartActivity_, UserLoginActivity_

public class DeliveryActivity extends BaseActivity
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, com.dominos.fragments.address.AddressBaseFragment.FormValidationListener
{

    public static final int ACTIVITY_NAVIGATED = 4096;
    public static final int DELIVERY_ACTIVITY_REQUEST = 16;
    private AddressBaseFragment mAddressTypeFragment;
    int mAddressTypeIndex;
    private String mAddressTypeName;
    TextView mAddressTypeNameView;
    private boolean mCheckboxStateChanged;
    private boolean mIsNewAddressDefault;
    CheckBox mMakeDefaultAddressCheckBox;
    LinearLayout mMakeThisPrimaryAddressLayout;
    EditText mNickNameEntry;
    LinearLayout mNickNameLayout;
    private boolean mSaveNewAddressToProfile;
    CheckBox mSaveToProfileCheckBox;
    LinearLayout mScrollViewChildLayout;
    ToolBarView mToolBar;

    public DeliveryActivity()
    {
    }

    private void addAddressToUserProfile(LabsAddress labsaddress, LabsAddress labsaddress1, boolean flag, boolean flag1)
    {
        String s;
        byte byte0;
        s = labsaddress.getAddressType();
        byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch 2011093247 2011093247: default 32
    //                   2011093247 74;
           goto _L1 _L2
_L1:
        byte0;
        JVM INSTR tableswitch 0 0: default 52
    //                   0 90;
           goto _L3 _L4
_L3:
        mProfileManager.addAddress(labsaddress, flag, new SaveAddressCallback(labsaddress, flag1, null));
        return;
_L2:
        if (s.equals("Campus"))
        {
            byte0 = 0;
        }
          goto _L1
_L4:
        labsaddress = AddressUtil.getProfileCampusAddress(labsaddress, labsaddress1);
          goto _L3
    }

    private void navigateToStoreLocator(LabsAddress labsaddress)
    {
        setNewAddressFlags();
        mOrderManager.createOrderForDelivery(labsaddress, new CreateDeliveryOrderCallBack(labsaddress, mSaveNewAddressToProfile, mIsNewAddressDefault));
    }

    private void requestFocusOnNickName()
    {
        mNickNameLayout.setVisibility(0);
        mMakeThisPrimaryAddressLayout.setVisibility(0);
        mNickNameEntry.requestFocus();
        mCheckboxStateChanged = true;
    }

    private void resetCheckBoxAndNicknameFields()
    {
        mSaveToProfileCheckBox.setChecked(false);
        mNickNameEntry.setText("");
        mMakeDefaultAddressCheckBox.setChecked(false);
    }

    private void resumeCheckboxViews()
    {
        if (mSaveToProfileCheckBox.isChecked())
        {
            mNickNameLayout.setVisibility(0);
            mMakeThisPrimaryAddressLayout.setVisibility(0);
            mNickNameEntry.requestFocus();
            return;
        } else
        {
            mNickNameLayout.setVisibility(8);
            mMakeThisPrimaryAddressLayout.setVisibility(8);
            return;
        }
    }

    private void setNewAddressFlags()
    {
        mSaveNewAddressToProfile = false;
        mIsNewAddressDefault = false;
        if (mSaveToProfileCheckBox.isChecked())
        {
            mSaveNewAddressToProfile = true;
            mIsNewAddressDefault = mMakeDefaultAddressCheckBox.isChecked();
        }
    }

    private void showAddressFormFragment()
    {
        com.dominos.utils.AddressType.AddressTypeIndex addresstypeindex = com.dominos.utils.AddressType.AddressTypeIndex.values()[mAddressTypeIndex];
        _cls3..SwitchMap.com.dominos.utils.AddressType.AddressTypeIndex[addresstypeindex.ordinal()];
        JVM INSTR tableswitch 1 7: default 60
    //                   1 81
    //                   2 94
    //                   3 107
    //                   4 120
    //                   5 133
    //                   6 146
    //                   7 159;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        getSupportFragmentManager().a().a(0x7f0f00b5, mAddressTypeFragment).b();
        return;
_L2:
        mAddressTypeFragment = AddressHouseFragment_.builder().build();
        continue; /* Loop/switch isn't completed */
_L3:
        mAddressTypeFragment = AddressApartmentFragment_.builder().build();
        continue; /* Loop/switch isn't completed */
_L4:
        mAddressTypeFragment = AddressCampusBaseFragment_.builder().build();
        continue; /* Loop/switch isn't completed */
_L5:
        mAddressTypeFragment = AddressHotelFragment_.builder().build();
        continue; /* Loop/switch isn't completed */
_L6:
        mAddressTypeFragment = AddressBusinessFragment_.builder().build();
        continue; /* Loop/switch isn't completed */
_L7:
        mAddressTypeFragment = AddressDormitoryFragment_.builder().build();
        continue; /* Loop/switch isn't completed */
_L8:
        mAddressTypeFragment = AddressOtherFragment_.builder().build();
        if (true) goto _L1; else goto _L9
_L9:
    }

    void OnClickSaveButton()
    {
        mAddressTypeFragment.validate(this);
        mAnalyticsUtil.postDeliveryAddressFormContinueClick();
    }

    void afterViews()
    {
        mToolBar.setTitle(getString(0x7f080050));
        mAddressTypeNameView.setText((new StringBuilder()).append(getString(0x7f08005d)).append(mAddressTypeName).append(getString(0x7f08005c)).toString());
        mNickNameEntry.setHint(Html.fromHtml(getString(0x7f08012f)));
        mScrollViewChildLayout.addView(getNinaPaddingView());
        mMakeThisPrimaryAddressLayout.getViewTreeObserver().addOnGlobalLayoutListener(this);
        FontManager.applyDominosFont(this);
    }

    protected void clearAddressFrom()
    {
        mAddressTypeFragment.clearAddressForm();
        resetCheckBoxAndNicknameFields();
    }

    public boolean handleHomeButtonClicked()
    {
        setResult(4096);
        mSpeechManager.resetDialogModel();
        finish();
        return true;
    }

    protected void navigateToCart()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.DeliveryAddressSelected());
        setResult(4096);
        mSpeechManager.preventNinaPause();
        ((CartActivity_.IntentBuilder_)CartActivity_.intent(this).flags(0x4000000)).start();
        finish();
    }

    public void onAddressRequestCode(int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            resetCheckBoxAndNicknameFields();
            break;
        }
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.NewAddressTypeRequested());
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mAddressTypeName = ((AddressType)AddressType.getAddressTypeList().get(mAddressTypeIndex)).getName();
        showAddressFormFragment();
    }

    public void onFormValidationFailure(List list)
    {
        StringBuffer stringbuffer = new StringBuffer();
        list = list.iterator();
        do
        {
            if (list.hasNext())
            {
                AddressFormValidation addressformvalidation = (AddressFormValidation)list.next();
                switch (_cls3..SwitchMap.com.dominos.utils.AddressFormValidation[addressformvalidation.ordinal()])
                {
                case 1: // '\001'
                    stringbuffer.append(getString(0x7f080279));
                    break;

                case 2: // '\002'
                    stringbuffer.append(getString(0x7f08027a));
                    break;

                case 3: // '\003'
                    stringbuffer.append(getString(0x7f080277));
                    break;

                case 4: // '\004'
                    stringbuffer.append(getString(0x7f080275));
                    break;

                case 5: // '\005'
                    stringbuffer.append(getString(0x7f080278));
                    break;

                case 6: // '\006'
                    stringbuffer.append(getString(0x7f08027b));
                    break;

                case 7: // '\007'
                    stringbuffer.append(getString(0x7f080274));
                    break;

                case 8: // '\b'
                    stringbuffer.append(getString(0x7f080276));
                    break;
                }
            } else
            {
                mActivityHelper.showAlert(getString(0x7f0800b9), stringbuffer.toString(), null);
                return;
            }
        } while (true);
    }

    public void onFormValidationSuccess(LabsAddress labsaddress)
    {
        if (mSaveToProfileCheckBox.isChecked())
        {
            String s = mNickNameEntry.getText().toString().trim();
            if (StringHelper.isNotEmpty(s))
            {
                labsaddress.setName(s);
            }
            if (UserAuthorization_.getInstance_(this).getAuthorizationCode() == null)
            {
                popLoginDialog(labsaddress);
                return;
            } else
            {
                navigateToStoreLocator(labsaddress);
                return;
            }
        } else
        {
            navigateToStoreLocator(labsaddress);
            return;
        }
    }

    public void onGlobalLayout()
    {
        if (mCheckboxStateChanged)
        {
            mCheckboxStateChanged = false;
        }
    }

    protected void onResume()
    {
        super.onResume();
        resumeCheckboxViews();
    }

    protected void onSessionTimedOut()
    {
        mActivityHelper.showAlert(AlertType.SESSION_TIMED_OUT, new _cls1());
    }

    protected void onStart()
    {
        super.onStart();
        mAnalyticsUtil.postAddressTypeSelected(mAddressTypeName);
        mAnalyticsUtil.postDeliveryAddressFormPage();
        App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.NewAddressFormTransition());
    }

    protected void popLoginDialog(final LabsAddress address)
    {
        LoginDialogFragment.newInstance(null, null, false, false, new _cls2()).show(getSupportFragmentManager());
    }

    void saveDeliveryAddressCheckBoxClicked(View view)
    {
        if (((CheckBox)view).isChecked())
        {
            if (mProfileManager.getCurrentUser() == null && !mProfileManager.isRemembered())
            {
                App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
                startActivityForResult(UserLoginActivity_.intent(this).get().putExtra("return-to-caller", true).putExtra("caller-is-address-delivery-activity", true), 4);
                return;
            } else
            {
                requestFocusOnNickName();
                return;
            }
        } else
        {
            mNickNameLayout.setVisibility(8);
            mMakeThisPrimaryAddressLayout.setVisibility(8);
            mNickNameEntry.setText("");
            return;
        }
    }



    private class SaveAddressCallback extends com.dominos.android.sdk.core.user.UserProfileManager.SaveAddressCallback
    {

        private boolean isGoToCart;
        private LabsAddress mSavedAddress;
        final DeliveryActivity this$0;

        public void onAddressDuplicated()
        {
            mActivityHelper.showAlert(AlertType.DUPLICATE_ADDRESS_SAVE_ERROR, mSavedAddress.getName(), null);
        }

        public void onAddressSaveFailure()
        {
            mActivityHelper.showAlert(AlertType.ADDRESS_SAVE_ERROR);
        }

        public void onAddressSaved()
        {
            mAnalyticsUtil.postAddressSaved();
            int i;
            if (mSavedAddress.getName().length() > 0)
            {
                i = 0x7f080193;
            } else
            {
                i = 0x7f080396;
            }
            showLongToast(String.format(getString(i), new Object[] {
                mSavedAddress.getName()
            }));
            if (isGoToCart)
            {
                navigateToCart();
                return;
            } else
            {
                clearAddressFrom();
                return;
            }
        }

        public void onBegin()
        {
            showLoading();
        }

        public void onFinish()
        {
            hideLoading();
        }

        private SaveAddressCallback(LabsAddress labsaddress, boolean flag)
        {
            this$0 = DeliveryActivity.this;
            super();
            mSavedAddress = labsaddress;
            isGoToCart = flag;
        }

        SaveAddressCallback(LabsAddress labsaddress, boolean flag, _cls1 _pcls1)
        {
            this(labsaddress, flag);
        }
    }


    private class CreateDeliveryOrderCallBack extends com.dominos.android.sdk.core.order.OrderManager.CreateDeliveryOrderCallback
    {

        private boolean isGoToCart;
        private boolean isNewAddressDefault;
        private LabsAddress mOriginalAddress;
        private boolean saveNewAddressToProfile;
        final DeliveryActivity this$0;

        public void onAddressInvalid(com.dominos.android.sdk.core.storelocator.StoreLocatorManager.LocateStoreError locatestoreerror)
        {
            mActivityHelper.showAlert(AlertType.ADDRESS_MISSING_STREET_NUMBER);
        }

        public void onBegin()
        {
            showLoading();
        }

        public void onCreateOrderError(RequestErrorCode requesterrorcode)
        {
            mActivityHelper.showAlert(AlertType.STORE_CONNECTION_ERROR);
        }

        public void onFinish()
        {
            hideLoading();
        }

        public void onNoStoreFoundForDelivery()
        {
            mActivityHelper.showAlert(AlertType.DELIVERY_NOT_AVAILABLE_IN_AREA);
        }

        public void onOrderCreated(LabsOrder labsorder)
        {
            if (saveNewAddressToProfile)
            {
                isGoToCart = true;
                addAddressToUserProfile(labsorder.getAddress(), mOriginalAddress, isNewAddressDefault, isGoToCart);
                return;
            } else
            {
                navigateToCart();
                return;
            }
        }

        public void onStoreClosed(LabsAddress labsaddress)
        {
            if (saveNewAddressToProfile)
            {
                addAddressToUserProfile(labsaddress, mOriginalAddress, isNewAddressDefault, isGoToCart);
            }
            mActivityHelper.showAlert(AlertType.STORE_DELIVERY_CLOSED);
        }

        public void onStoreDeliveryUnavailable(LabsAddress labsaddress, String s)
        {
            if (saveNewAddressToProfile)
            {
                addAddressToUserProfile(labsaddress, mOriginalAddress, isNewAddressDefault, isGoToCart);
            }
            mActivityHelper.showAlert(AlertType.STORE_DELIVERY_UNAVAILABLE, s, null);
        }

        public void onStoreOffline(LabsAddress labsaddress, String s)
        {
            if (saveNewAddressToProfile)
            {
                addAddressToUserProfile(labsaddress, mOriginalAddress, isNewAddressDefault, isGoToCart);
            }
            mActivityHelper.showAlert(AlertType.STORE_DELIVERY_OFFLINE, s, null);
        }

        public CreateDeliveryOrderCallBack(LabsAddress labsaddress, boolean flag, boolean flag1)
        {
            this$0 = DeliveryActivity.this;
            super();
            mOriginalAddress = labsaddress;
            saveNewAddressToProfile = flag;
            isNewAddressDefault = flag1;
        }
    }


    private class _cls3
    {

        static final int $SwitchMap$com$dominos$utils$AddressFormValidation[];
        static final int $SwitchMap$com$dominos$utils$AddressType$AddressTypeIndex[];

        static 
        {
            $SwitchMap$com$dominos$utils$AddressType$AddressTypeIndex = new int[com.dominos.utils.AddressType.AddressTypeIndex.values().length];
            try
            {
                $SwitchMap$com$dominos$utils$AddressType$AddressTypeIndex[com.dominos.utils.AddressType.AddressTypeIndex.ADDRESS_TYPE_HOUSE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror14) { }
            try
            {
                $SwitchMap$com$dominos$utils$AddressType$AddressTypeIndex[com.dominos.utils.AddressType.AddressTypeIndex.ADDRESS_TYPE_APARTMENT.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror13) { }
            try
            {
                $SwitchMap$com$dominos$utils$AddressType$AddressTypeIndex[com.dominos.utils.AddressType.AddressTypeIndex.ADDRESS_TYPE_CAMPUS_BASE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror12) { }
            try
            {
                $SwitchMap$com$dominos$utils$AddressType$AddressTypeIndex[com.dominos.utils.AddressType.AddressTypeIndex.ADDRESS_TYPE_HOTEL.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            try
            {
                $SwitchMap$com$dominos$utils$AddressType$AddressTypeIndex[com.dominos.utils.AddressType.AddressTypeIndex.ADDRESS_TYPE_BUSINESS.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                $SwitchMap$com$dominos$utils$AddressType$AddressTypeIndex[com.dominos.utils.AddressType.AddressTypeIndex.ADDRESS_TYPE_DORMITORY.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$dominos$utils$AddressType$AddressTypeIndex[com.dominos.utils.AddressType.AddressTypeIndex.ADDRESS_TYPE_OTHER.ordinal()] = 7;
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


    private class _cls1 extends com.dominos.utils.ActivityHelper.AlertActionCallback
    {

        final DeliveryActivity this$0;

        public void onAlertDismissed()
        {
            ((LandingActivity_.IntentBuilder_)LandingActivity_.intent(DeliveryActivity.this).flags(0x4000000)).start();
        }

        _cls1()
        {
            this$0 = DeliveryActivity.this;
            super();
        }
    }


    private class _cls2
        implements com.dominos.dialogs.LoginDialogFragment.OnActionListener
    {

        final DeliveryActivity this$0;
        final LabsAddress val$address;

        public void onCanceled()
        {
        }

        public void onContinueAsGuest()
        {
        }

        public void onLoginSuccess()
        {
            navigateToStoreLocator(address);
        }

        public void onSignOut()
        {
        }

        _cls2()
        {
            this$0 = DeliveryActivity.this;
            address = labsaddress;
            super();
        }
    }

}
