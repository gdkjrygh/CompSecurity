// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.widget.FrameLayout;
import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.dialogs.LoginDialogFragment;
import com.dominos.nina.dialog.agent.CouponGlobalCommandAgent;
import com.dominos.utils.CommandBuilder;
import com.dominos.views.LoyaltyMicroWidgetCentered_;
import com.dominos.views.LoyaltyMicroWidget_;
import com.dominos.views.LoyaltyWidgetBaseLayout;

// Referenced classes of package com.dominos.fragments:
//            BaseFragment, LoyaltyWidgetFragment_

public class LoyaltyWidgetFragment extends BaseFragment
    implements com.dominos.views.LoyaltyWidgetBaseLayout.LoyaltyWidgetListener
{

    public static final String TAG = com/dominos/fragments/LoyaltyWidgetFragment.getSimpleName();
    private BusSubscriber mBusSubscriber;
    private String mCouponResetCommands[];
    private com.dominos.views.LoyaltyWidgetBaseLayout.LoyaltyWidgetListener mListener;
    FrameLayout mLoyaltyWidgetLayout;
    private LoyaltyWidgetType mType;
    private LoyaltyWidgetBaseLayout mWidget;

    public LoyaltyWidgetFragment()
    {
        mCouponResetCommands = (new CommandBuilder()).appendReset(CouponGlobalCommandAgent.NAME).build();
    }

    private void buildWidgetView()
    {
        _cls3..SwitchMap.com.dominos.fragments.LoyaltyWidgetFragment.LoyaltyWidgetType[mType.ordinal()];
        JVM INSTR tableswitch 1 1: default 28
    //                   1 66;
           goto _L1 _L2
_L1:
        mWidget = LoyaltyMicroWidget_.build(getActivity());
_L4:
        if (mWidget != null)
        {
            mWidget.setListener(this);
        }
        mLoyaltyWidgetLayout.addView(mWidget);
        return;
_L2:
        mWidget = LoyaltyMicroWidgetCentered_.build(getActivity());
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static LoyaltyWidgetFragment newInstance(LoyaltyWidgetType loyaltywidgettype)
    {
        LoyaltyWidgetFragment loyaltywidgetfragment = LoyaltyWidgetFragment_.builder().build();
        loyaltywidgetfragment.mType = loyaltywidgettype;
        return loyaltywidgetfragment;
    }

    private void notifyListenerOfRedeemClick(RedemptionSource redemptionsource)
    {
        if (mListener == null) goto _L2; else goto _L1
_L1:
        _cls3..SwitchMap.com.dominos.fragments.LoyaltyWidgetFragment.RedemptionSource[redemptionsource.ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 37
    //                   2 47;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        mListener.onPieImageRedeemButtonClick();
        return;
_L4:
        mListener.onRedeemButtonClick();
        return;
    }

    private void popLoginDialog(final RedemptionSource source)
    {
        source = LoginDialogFragment.newInstance(null, null, false, false, new _cls2());
        getFragmentManager().a().a(source, com/dominos/dialogs/LoginDialogFragment.getSimpleName()).b();
        App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertShow());
    }

    private void redeemClick(final RedemptionSource source)
    {
        mLoyaltyManger.validateRedemption(mStoreManager.getStoreProfile(), mOrderManager.getOrder(), new _cls1());
    }

    private void removeSubscribedBus()
    {
        if (mBusSubscriber != null)
        {
            App.getInstance().bus.unregister(mBusSubscriber);
            mBusSubscriber = null;
        }
    }

    private void subscribeBus()
    {
        if (mBusSubscriber == null)
        {
            mBusSubscriber = new BusSubscriber(null);
        }
        App.getInstance().bus.register(mBusSubscriber);
    }

    public void afterViews()
    {
        buildWidgetView();
    }

    public void disableRedemption()
    {
        if (mWidget != null)
        {
            mWidget.disableRedemption();
        }
    }

    public void enableRedemption()
    {
        if (mWidget != null)
        {
            mWidget.enableRedemption();
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (activity instanceof com.dominos.views.LoyaltyWidgetBaseLayout.LoyaltyWidgetListener)
        {
            mListener = (com.dominos.views.LoyaltyWidgetBaseLayout.LoyaltyWidgetListener)activity;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            int i = bundle.getInt("mType");
            if (i == LoyaltyWidgetType.CENTERED.getValue())
            {
                mType = LoyaltyWidgetType.CENTERED;
            } else
            if (i == LoyaltyWidgetType.NORMAL.getValue())
            {
                mType = LoyaltyWidgetType.NORMAL;
                return;
            }
        }
    }

    public void onDetach()
    {
        super.onDetach();
        mListener = null;
    }

    public void onPause()
    {
        super.onPause();
        removeSubscribedBus();
    }

    public void onPieImageRedeemButtonClick()
    {
        redeemClick(RedemptionSource.PIE);
    }

    public void onRedeemButtonClick()
    {
        redeemClick(RedemptionSource.BUTTON);
    }

    public void onResume()
    {
        super.onResume();
        subscribeBus();
    }

    public void onRetryButtonClick()
    {
        if (mListener != null)
        {
            mListener.onRetryButtonClick();
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("mType", mType.getValue());
    }

    public void updateView()
    {
        if (mWidget != null)
        {
            mWidget.updateView();
        }
    }





    private class _cls3
    {

        static final int $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[];
        static final int $SwitchMap$com$dominos$fragments$LoyaltyWidgetFragment$LoyaltyWidgetType[];
        static final int $SwitchMap$com$dominos$fragments$LoyaltyWidgetFragment$RedemptionSource[];

        static 
        {
            $SwitchMap$com$dominos$fragments$LoyaltyWidgetFragment$RedemptionSource = new int[RedemptionSource.values().length];
            try
            {
                $SwitchMap$com$dominos$fragments$LoyaltyWidgetFragment$RedemptionSource[RedemptionSource.PIE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$dominos$fragments$LoyaltyWidgetFragment$RedemptionSource[RedemptionSource.BUTTON.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause = new int[com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause.STORE_NOT_POP.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause.REDEMPTION_COUPON_LIMIT.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause.REDEMPTION_NOT_AVAILABLE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause.CUSTOMER_AUTH_REQUIRED.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause.CUSTOMER_NOT_ENOUGH_POINTS.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$loyalty$LoyaltyManager$InvalidRedemptionCause[com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause.CUSTOMER_NOT_ENROLLED.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            $SwitchMap$com$dominos$fragments$LoyaltyWidgetFragment$LoyaltyWidgetType = new int[LoyaltyWidgetType.values().length];
            try
            {
                $SwitchMap$com$dominos$fragments$LoyaltyWidgetFragment$LoyaltyWidgetType[LoyaltyWidgetType.CENTERED.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class LoyaltyWidgetType extends Enum
    {

        private static final LoyaltyWidgetType $VALUES[];
        public static final LoyaltyWidgetType CENTERED;
        public static final LoyaltyWidgetType NORMAL;
        private final int mValue;

        public static LoyaltyWidgetType valueOf(String s)
        {
            return (LoyaltyWidgetType)Enum.valueOf(com/dominos/fragments/LoyaltyWidgetFragment$LoyaltyWidgetType, s);
        }

        public static LoyaltyWidgetType[] values()
        {
            return (LoyaltyWidgetType[])$VALUES.clone();
        }

        public final int getValue()
        {
            return mValue;
        }

        static 
        {
            NORMAL = new LoyaltyWidgetType("NORMAL", 0, 1);
            CENTERED = new LoyaltyWidgetType("CENTERED", 1, 2);
            $VALUES = (new LoyaltyWidgetType[] {
                NORMAL, CENTERED
            });
        }

        private LoyaltyWidgetType(String s, int i, int j)
        {
            super(s, i);
            mValue = j;
        }
    }


    private class RedemptionSource extends Enum
    {

        private static final RedemptionSource $VALUES[];
        public static final RedemptionSource BUTTON;
        public static final RedemptionSource PIE;

        public static RedemptionSource valueOf(String s)
        {
            return (RedemptionSource)Enum.valueOf(com/dominos/fragments/LoyaltyWidgetFragment$RedemptionSource, s);
        }

        public static RedemptionSource[] values()
        {
            return (RedemptionSource[])$VALUES.clone();
        }

        static 
        {
            PIE = new RedemptionSource("PIE", 0);
            BUTTON = new RedemptionSource("BUTTON", 1);
            $VALUES = (new RedemptionSource[] {
                PIE, BUTTON
            });
        }

        private RedemptionSource(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls2
        implements com.dominos.dialogs.LoginDialogFragment.OnActionListener
    {

        final LoyaltyWidgetFragment this$0;
        final RedemptionSource val$source;

        public void onCanceled()
        {
            App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(mCouponResetCommands));
        }

        public void onContinueAsGuest()
        {
        }

        public void onLoginSuccess()
        {
            notifyListenerOfRedeemClick(source);
        }

        public void onSignOut()
        {
        }

        _cls2()
        {
            this$0 = LoyaltyWidgetFragment.this;
            source = redemptionsource;
            super();
        }
    }


    private class _cls1 extends com.dominos.android.sdk.core.loyalty.LoyaltyManager.ValidateRedemptionCallback
    {

        final LoyaltyWidgetFragment this$0;
        final RedemptionSource val$source;

        public void onInvalidRedemption(com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause invalidredemptioncause)
        {
            switch (_cls3..SwitchMap.com.dominos.android.sdk.core.loyalty.LoyaltyManager.InvalidRedemptionCause[invalidredemptioncause.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                mActivityHelper.showAlert(AlertType.NON_LOYALTY_STORE, mCouponResetCommands);
                disableRedemption();
                return;

            case 2: // '\002'
                mActivityHelper.showAlert(AlertType.LOYALTY_REDEMPTION_LIMIT, String.valueOf(mLoyaltyManger.getBaseCouponLimit()), null, mCouponResetCommands, null);
                return;

            case 3: // '\003'
                mActivityHelper.showAlert(AlertType.LOYALTY_CANNOT_REDEEM, mCouponResetCommands);
                return;

            case 4: // '\004'
                popLoginDialog(source);
                return;

            case 5: // '\005'
                mActivityHelper.showAlert(AlertType.LOYALTY_NOT_ENOUGH_POINTS, mCouponResetCommands);
                return;

            case 6: // '\006'
                mActivityHelper.showAlert(AlertType.LOYALTY_CANNOT_REDEEM, mCouponResetCommands);
                break;
            }
        }

        public void onValidRedemption()
        {
            notifyListenerOfRedeemClick(source);
        }

        _cls1()
        {
            this$0 = LoyaltyWidgetFragment.this;
            source = redemptionsource;
            super();
        }
    }


    private class BusSubscriber
    {

        final LoyaltyWidgetFragment this$0;

        public void onSpeechRedeem(com.dominos.bus.events.OriginatedFromSpeech.LoyaltyRedeem loyaltyredeem)
        {
            if (mLoyaltyManger.isLoyaltyAvailable() && mLoyaltyManger.isCustomerEnrolledInLoyalty())
            {
                onRedeemButtonClick();
            }
        }

        private BusSubscriber()
        {
            this$0 = LoyaltyWidgetFragment.this;
            super();
        }

        BusSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

}
