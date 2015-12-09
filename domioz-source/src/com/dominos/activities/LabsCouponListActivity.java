// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.adapters.LabsCouponListAdapter;
import com.dominos.adapters.LabsCouponSpinnerAdapter;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.CouponUtil;
import com.dominos.android.sdk.core.coupon.CouponWizardManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.models.LabsCategory;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.controllers.CouponListController;
import com.dominos.controllers.interfaces.IDominosCouponList;
import com.dominos.controllers.utils.ControllerLocator;
import com.dominos.dialogs.LoginDialogFragment;
import com.dominos.nina.dialog.agent.CouponGlobalCommandAgent;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.utils.AnalyticsUtil;
import com.nuance.b.e.c;
import java.net.URLEncoder;
import java.util.List;
import org.a.a.a.l;

// Referenced classes of package com.dominos.activities:
//            LabsBaseListActivity, CartActivity_, LabsCouponWizardActivity_

public class LabsCouponListActivity extends LabsBaseListActivity
    implements IDominosCouponList
{

    private static final String TAG = com/dominos/activities/LabsCouponListActivity.getName();
    private BusSubscriber busSubscriber;
    Spinner couponFilter;
    LabsCouponListAdapter couponListAdapter;
    LabsCouponSpinnerAdapter couponSpinnerAdapter;
    ControllerLocator mControllerLocator;
    private CouponListController mCouponListController;
    private Coupon mCouponSelectedByUser;
    EditText promoCodeField;
    TextView screenTitle;

    public LabsCouponListActivity()
    {
        busSubscriber = null;
    }

    private void navigateToCart()
    {
        mSpeechManager.preventNinaPause();
        mOrderManager.getOrder().clearPrices();
        ((CartActivity_.IntentBuilder_)CartActivity_.intent(this).flags(0x4000000)).start();
    }

    protected void goToCouponWizard()
    {
        mNinaHelper.clearPartialProductsResetProductController();
        mSpeechManager.preventNinaPause();
        ((LabsCouponWizardActivity_.IntentBuilder_)LabsCouponWizardActivity_.intent(this).flags(0x4000000)).start();
    }

    public boolean handleHomeButtonClicked()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.BackPressedOnCoupons());
        finish();
        return true;
    }

    void onAfterInject()
    {
        mCouponListController = mControllerLocator.getCouponListController(this);
    }

    public void onBackPressed()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.BackPressedOnCoupons());
        super.onBackPressed();
    }

    public void onCouponDetailsError()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.CouponLoaded(false, null, null));
        hideLoading();
        showShortToast(getString(0x7f0800db));
    }

    public void onCouponDetailsSuccess(LabsCouponLine labscouponline, com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType couponerrortype)
    {
        if (mCouponSelectedByUser == null)
        {
            mCouponSelectedByUser = labscouponline.getCoupon();
        }
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.CouponLoaded(true, labscouponline, couponerrortype));
        hideLoading();
        switch (_cls4..SwitchMap.com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType[couponerrortype.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            mCouponWizardManager.initialize(labscouponline);
            goToCouponWizard();
            return;

        case 2: // '\002'
            break;
        }
        if (!mCouponSelectedByUser.isDoneEditing())
        {
            mCouponWizardManager.initialize(labscouponline);
            goToCouponWizard();
        } else
        {
            mCouponSelectedByUser.setDoneEditing(true);
        }
        navigateToCart();
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onLoyaltyRedemptionValidationFailed(com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause invalidredemptioncause, String s)
    {
        switch (_cls4..SwitchMap.com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause[invalidredemptioncause.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            mActivityHelper.showAlert(AlertType.NON_LOYALTY_STORE);
            return;

        case 2: // '\002'
            mActivityHelper.showAlert(AlertType.LOYALTY_REDEMPTION_LIMIT, String.valueOf(mLoyaltyManager.getBaseCouponLimit()), null);
            return;

        case 3: // '\003'
            mActivityHelper.showAlert(AlertType.LOYALTY_CANNOT_REDEEM);
            return;

        case 4: // '\004'
            showLoginDialogForLoyalty(s);
            return;

        case 5: // '\005'
            mActivityHelper.showAlert(AlertType.LOYALTY_NOT_ENOUGH_POINTS);
            return;

        case 6: // '\006'
            mActivityHelper.showAlert(AlertType.LOYALTY_CANNOT_REDEEM);
            break;
        }
    }

    protected void onPause()
    {
        super.onPause();
        if (busSubscriber != null)
        {
            App.getInstance().bus.unregister(busSubscriber);
            busSubscriber = null;
        }
    }

    public void onPromoCodeClick(View view)
    {
        view = promoCodeField.getText().toString().trim();
        if (l.a(view))
        {
            return;
        } else
        {
            view = URLEncoder.encode(view).replace("+", "%20");
            showLoading();
            mAnalyticsUtil.postPromoCodeSubmitClick(view);
            mCouponListController.addCouponToOrder(view);
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        busSubscriber = new BusSubscriber(null);
        App.getInstance().bus.register(busSubscriber);
        App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.CouponListActivityTransition());
        int i;
        if (c.i())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        setNinaPaddingVisibility(i);
    }

    public void onVoiceClick(int i)
    {
        selectCoupon(couponListAdapter.getItem(i));
    }

    protected void selectCoupon(Coupon coupon)
    {
        mCouponSelectedByUser = coupon;
        mAnalyticsUtil.postOnCouponSelection();
        showLoading();
        mCouponListController.addCouponToOrder(coupon.getCode());
    }

    void setupCouponListActivity()
    {
        screenTitle.setText(getString(0x7f0800e0));
        List list = mCouponListController.getCategoryList();
        couponSpinnerAdapter.setCategories(list);
        couponFilter.setVisibility(0);
        couponFilter.setAdapter(couponSpinnerAdapter);
        couponFilter.setOnItemSelectedListener(new _cls1());
        int j = couponFilter.getAdapter().getCount();
        for (int i = 0; i < j; i++)
        {
            if (((LabsCategory)list.get(i)).getCode().equals("All"))
            {
                couponFilter.setSelection(i);
            }
        }

        list = mCouponWizardManager.getCouponsFromMenu();
        if (list != null && list.size() > 0)
        {
            mCouponWizardManager.setDisplayedCouponList(list);
            couponListAdapter.setCouponList(list);
            setListAdapter(couponListAdapter);
            getListView().setOnItemClickListener(new _cls2());
            getListView().addFooterView(getNinaPaddingView(), null, false);
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.CouponListReady(this));
        }
    }

    public void showCouponErrorAlert(LabsCouponLine labscouponline, com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType couponerrortype)
    {
        hideLoading();
        _cls4..SwitchMap.com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType[couponerrortype.ordinal()];
        JVM INSTR tableswitch 3 13: default 72
    //                   3 129
    //                   4 148
    //                   5 148
    //                   6 167
    //                   7 186
    //                   8 205
    //                   9 224
    //                   10 320
    //                   11 339
    //                   12 358
    //                   13 377;
           goto _L1 _L2 _L3 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        labscouponline = getString(0x7f0800db);
        couponerrortype = getString(0x7f080060);
_L13:
        String s = CouponGlobalCommandAgent.NAME;
        mActivityHelper.showAlert(labscouponline, couponerrortype, null, new String[] {
            s, "RESET", "CouponAgency", "RESET"
        }, null);
        return;
_L2:
        labscouponline = getString(0x7f0800ce);
        couponerrortype = getString(0x7f0800cd);
        continue; /* Loop/switch isn't completed */
_L3:
        labscouponline = getString(0x7f0800d8);
        couponerrortype = getString(0x7f0800d7);
        continue; /* Loop/switch isn't completed */
_L4:
        labscouponline = getString(0x7f0800d5);
        couponerrortype = getString(0x7f0800d6);
        continue; /* Loop/switch isn't completed */
_L5:
        labscouponline = getString(0x7f0800da);
        couponerrortype = getString(0x7f0800d9);
        continue; /* Loop/switch isn't completed */
_L6:
        labscouponline = getString(0x7f0800d4);
        couponerrortype = getString(0x7f0800d3);
        continue; /* Loop/switch isn't completed */
_L7:
        if (labscouponline != null)
        {
            couponerrortype = getString(0x7f0800cc);
            labscouponline = CouponUtil.getMinimumOrderAmount(mCouponWizardManager.getUpdatedCouponByCode(labscouponline.getCoupon().getCode()));
            String s1 = (new StringBuilder()).append(getString(0x7f0800ca)).append(labscouponline).append(" ").append(getString(0x7f0800cb)).toString();
            labscouponline = couponerrortype;
            couponerrortype = s1;
        } else
        {
            labscouponline = getString(0x7f0800db);
            couponerrortype = getString(0x7f080060);
        }
        continue; /* Loop/switch isn't completed */
_L8:
        labscouponline = getString(0x7f0800d5);
        couponerrortype = getString(0x7f0800d6);
        continue; /* Loop/switch isn't completed */
_L9:
        labscouponline = getString(0x7f0800d8);
        couponerrortype = getString(0x7f0800d7);
        continue; /* Loop/switch isn't completed */
_L10:
        labscouponline = getString(0x7f0800d0);
        couponerrortype = getString(0x7f0800cf);
        continue; /* Loop/switch isn't completed */
_L11:
        labscouponline = getString(0x7f0800d2);
        couponerrortype = getString(0x7f0800d1);
        if (true) goto _L13; else goto _L12
_L12:
    }

    public void showLoginDialogForLoyalty(final String couponCode)
    {
        couponCode = LoginDialogFragment.newInstance(null, null, false, false, new _cls3());
        getSupportFragmentManager().a().a(couponCode, com/dominos/dialogs/LoginDialogFragment.getSimpleName()).b();
        App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertShow());
    }



    private class _cls4
    {

        static final int $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[];
        static final int $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType = new int[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.ValidCoupon.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror19) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.Fulfilled.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror18) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.CouponExclusivityViolation.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror17) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.CouponIsInvalidForDayPart.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror16) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.CouponIsInvalidForDayOfWeek.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror15) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.PromotionalUsageViolation.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror14) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.UsageCountViolation.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror13) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.InvalidServiceMethodForCoupon.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror12) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.BelowMinimumOrderAmount.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.MinimumOrderAmount.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.CouponIsNotEffectiveOrExpired.ordinal()] = 11;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.ExpiredPromotionalRedemptionCoupon.ordinal()] = 12;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.InValidCoupon.ordinal()] = 13;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.UnKnown.ordinal()] = 14;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause = new int[com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause.STORE_NOT_POP.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause.REDEMPTION_COUPON_LIMIT.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause.REDEMPTION_NOT_AVAILABLE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause.CUSTOMER_AUTH_REQUIRED.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause.CUSTOMER_NOT_ENOUGH_POINTS.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause.CUSTOMER_NOT_ENROLLED.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class BusSubscriber
    {

        final LabsCouponListActivity this$0;

        public void couponSelected(com.dominos.bus.events.OriginatedFromSpeech.CouponSelected couponselected)
        {
            int i = couponselected.getSelectedIndex();
            onVoiceClick(i);
        }

        public void onCouponSelectedFromGlobal(com.dominos.bus.events.OriginatedFromSpeech.CouponSelectedFromGlobal couponselectedfromglobal)
        {
            couponselectedfromglobal = couponselectedfromglobal.getCoupon();
            selectCoupon(couponselectedfromglobal);
        }

        private BusSubscriber()
        {
            this$0 = LabsCouponListActivity.this;
            super();
        }

        BusSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls1
        implements android.widget.AdapterView.OnItemSelectedListener
    {

        final LabsCouponListActivity this$0;

        public void onItemSelected(AdapterView adapterview, View view, int i, long l1)
        {
            view = couponSpinnerAdapter.getCouponsInCategory(i);
            adapterview = new ArrayList();
            view = view.iterator();
            do
            {
                if (!view.hasNext())
                {
                    break;
                }
                String s = (String)view.next();
                if (mCouponWizardManager.isCouponDayValid(mMenuManager.getCoupon(s)))
                {
                    adapterview.add(mMenuManager.getCoupon(s));
                }
            } while (true);
            mCouponWizardManager.setDisplayedCouponList(adapterview);
            couponListAdapter.setCouponList(adapterview);
            couponListAdapter.notifyDataSetChanged();
        }

        public void onNothingSelected(AdapterView adapterview)
        {
        }

        _cls1()
        {
            this$0 = LabsCouponListActivity.this;
            super();
        }
    }


    private class _cls2
        implements android.widget.AdapterView.OnItemClickListener
    {

        final LabsCouponListActivity this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l1)
        {
            adapterview = couponListAdapter.getItem(i);
            selectCoupon(adapterview);
        }

        _cls2()
        {
            this$0 = LabsCouponListActivity.this;
            super();
        }
    }


    private class _cls3
        implements com.dominos.dialogs.LoginDialogFragment.OnActionListener
    {

        final LabsCouponListActivity this$0;
        final String val$couponCode;

        public void onCanceled()
        {
            App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(new String[0]));
        }

        public void onContinueAsGuest()
        {
        }

        public void onLoginSuccess()
        {
            mCouponListController.handleLoadedCoupon(couponCode);
        }

        public void onSignOut()
        {
        }

        _cls3()
        {
            this$0 = LabsCouponListActivity.this;
            couponCode = s;
            super();
        }
    }

}
