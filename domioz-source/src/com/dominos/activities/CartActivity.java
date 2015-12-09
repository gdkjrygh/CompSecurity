// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.adapters.LabsOrderDetailsListAdapter;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.CouponUtil;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.core.cart.CartErrorType;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.coupon.CouponWizardManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.models.LabsFlavor;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsSize;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.models.loyalty.LoyaltyCoupon;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.order.PriceOrderErrorCode;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.http.shoprunner.ShopRunnerRestClient;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.android.sdk.extension.google.wallet.GoogleWalletManager;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.android.sdk.extension.nina.model.NinaPartialProduct;
import com.dominos.dialogs.CheckoutConfirmationFragment;
import com.dominos.dialogs.CheckoutConfirmationFragment_;
import com.dominos.dialogs.UpsellDialog;
import com.dominos.dialogs.UpsellDialog_;
import com.dominos.fragments.GoogleWalletFragment;
import com.dominos.fragments.GoogleWalletFragment_;
import com.dominos.fragments.LoyaltyWidgetFragment;
import com.dominos.nina.dialog.agent.CouponGlobalCommandAgent;
import com.dominos.nina.dialog.agent.GlobalAgent;
import com.dominos.nina.dialog.agent.UserIntentionAgent;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.utils.CommandBuilder;
import com.dominos.views.CartFooterView;
import com.dominos.views.CartFooterView_;
import com.dominos.views.CheckoutButtonSectionView;
import com.dominos.views.CheckoutButtonSectionView_;
import com.dominos.views.LabsAddressView;
import com.dominos.views.LabsAddressView_;
import com.dominos.views.WarningView;
import com.nuance.b.e.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.dominos.activities:
//            LabsBaseListActivity, LabsCouponWizardActivity_, LabsRootMenuListActivity_, LabsCouponListActivity_, 
//            LabsCheckoutActivity_, LandingActivity_, OrderSettingActivity_, PizzaTrackerPhoneNumberActivity_, 
//            LabsProductDetailListActivity_, LabsSizeListActivity_

public class CartActivity extends LabsBaseListActivity
    implements android.widget.AdapterView.OnItemClickListener, android.widget.AdapterView.OnItemLongClickListener, com.dominos.dialogs.CheckoutConfirmationFragment.CheckoutConfirmationListener, com.dominos.dialogs.UpsellDialog.UpsellDialogListener, com.dominos.fragments.GoogleWalletFragment.OnMaskedWalletLoadedListener, com.dominos.fragments.GoogleWalletFragment.OnWalletConnectionListener, com.dominos.views.CartFooterView.OnFooterViewsClickListener, com.dominos.views.CheckoutButtonSectionView.OnButtonClickListener, com.dominos.views.LoyaltyWidgetBaseLayout.LoyaltyWidgetListener
{

    private static final int LIST_ITEM_FIRST_POSITION = 1;
    private static final int LOADING_DIALOG_DELAY = 1000;
    private static final String TAG = com/dominos/activities/CartActivity.getName();
    boolean autoShowNina;
    private LabsAddressView mAddressView;
    private CartFooterView mCartFooterView;
    SwipeRefreshLayout mCartSwipeRefreshLayout;
    String mCommand[];
    private String mCouponResetCommands[];
    private volatile boolean mCreateOrderInProgress;
    RelativeLayout mEditButton;
    ImageView mEditButtonSeparator;
    TextView mEditButtonText;
    private CheckoutButtonSectionView mEmptyCheckoutSectionView;
    private BusSubscriberHackForOtto mEventBusSubscriber;
    private GoogleWalletFragment mGoogleWalletFragment;
    RelativeLayout mHeaderCheckoutButton;
    private long mHeaderCheckoutButtonClickTime;
    TextView mHeaderCheckoutButtonTextView;
    private LoyaltyWidgetFragment mLoyaltyWidgetFragment;
    private com.dominos.utils.ActivityHelper.AlertActionCallback mNonLoyaltyAlertActionCallback;
    OrderUtil mOrderUtil;
    DominosPrefs_ mPrefs;
    AnalyticsUtil mProductDetailAnalytics;
    private ProductWizardManager mProductWizardManager;
    ShopRunnerRestClient mSrApi;
    WarningView mTopWarningView;
    private UpsellDialog mUpsellDialog;
    private GoogleWalletManager mWalletManager;
    private CheckoutButton mWhichCheckoutButton;
    LabsOrderDetailsListAdapter orderDetailsListAdapter;
    String reorderPaymentType;

    public CartActivity()
    {
        mCreateOrderInProgress = false;
        mEventBusSubscriber = null;
        mCouponResetCommands = (new CommandBuilder()).appendReset(CouponGlobalCommandAgent.NAME).build();
        mCommand = (new CommandBuilder()).appendReset(CouponGlobalCommandAgent.NAME).appendReset("OrderAgency").appendValue(UserIntentionAgent.NAME, "cart").build();
        mNonLoyaltyAlertActionCallback = new _cls1();
    }

    private void addCouponToOrder(String s)
    {
        mCartManager.addCouponToOrder(mOrderManager.getOrder(), s, new _cls10());
    }

    private void addUpsellProductToOrder(LabsProductLine labsproductline)
    {
        if (labsproductline == null)
        {
            return;
        } else
        {
            LabsOrder labsorder = mOrderManager.getOrder();
            mMenuManager.loadOptionsFromMenu(labsproductline);
            mCartManager.addProductline(labsorder, labsproductline);
            labsorder.clearPrices();
            mOrderManager.setOrder(labsorder);
            refreshCartViews(labsorder);
            makePriceOrder(labsorder, true);
            return;
        }
    }

    private void cancelEditMode()
    {
        LabsOrderDetailsListAdapter labsorderdetailslistadapter = (LabsOrderDetailsListAdapter)getListAdapter();
        if (labsorderdetailslistadapter.isEditMode())
        {
            labsorderdetailslistadapter.toggleEditMode();
        }
    }

    private void commonSendEventClick()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.CheckoutTapped());
    }

    private void disableRedemption()
    {
        if (mLoyaltyWidgetFragment != null)
        {
            mLoyaltyWidgetFragment.disableRedemption();
        }
    }

    private void handleCheckoutClicked()
    {
        if (!mCartManager.isUpsellAnswered())
        {
            String s = mCartManager.determineUpsellProduct();
            mCartManager.setUpSellCode(s);
            if (!StringHelper.isEmpty(s))
            {
                mUpsellDialog = UpsellDialog_.builder().mUpsellCode(s).build();
                mCartManager.setUpsellDisplayed(true);
                mUpsellDialog.show(getSupportFragmentManager(), com/dominos/dialogs/UpsellDialog.getSimpleName());
                return;
            }
        }
        navigateToCheckoutActivity();
    }

    private void handleOnStart()
    {
        LabsOrder labsorder = mOrderManager.getOrder();
        if (!mCreateOrderInProgress)
        {
            if (mCartManager.isRequiredToPriceOrder())
            {
                makePriceOrder(labsorder, false);
            } else
            {
                handleOrderCreated(labsorder, false);
            }
        }
        refreshCartViews(labsorder);
        mProductWizardManager.setFromCouponWizard(false);
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.CouponReset());
        App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.CartActivityTransition());
        if (autoShowNina)
        {
            App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.ShowSpeechBarEvent(this));
            autoShowNina = false;
        }
    }

    private void handlePriceOrderError(LabsOrder labsorder)
    {
        mOrderManager.handlePriceOrderError(labsorder, new _cls9());
    }

    private void loadMaskedWallet(LabsOrder labsorder)
    {
        if (!mCartManager.isCartAbleToCheckout())
        {
            LogUtil.d(TAG, "Invalid price to load masked wallet", new Object[0]);
            return;
        }
        if (!mGoogleWalletFragment.isUserPreAuthorized())
        {
            App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertShow());
        } else
        {
            showLoading();
        }
        mSpeechManager.preventNinaPause();
        mGoogleWalletFragment.loadMaskedWallet(labsorder);
    }

    private void makePriceOrder(LabsOrder labsorder, final boolean canAutoCheckout)
    {
        mCreateOrderInProgress = true;
        mOrderManager.checkStoreAndPriceOrder(labsorder, new _cls8());
    }

    private void navigateToCouponWizard()
    {
        mSpeechManager.preventNinaPause();
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.CouponCustomizationNeeded());
        ((LabsCouponWizardActivity_.IntentBuilder_)LabsCouponWizardActivity_.intent(this).avoidCouponAutoFulfill(true).flags(4)).start();
    }

    private void navigateToRootMenu()
    {
        mAnalyticsUtil.postCartMenuButtonClicked();
        mSpeechManager.preventNinaPause();
        ((LabsRootMenuListActivity_.IntentBuilder_)LabsRootMenuListActivity_.intent(this).flags(0x4000000)).start();
    }

    private void redeemRewards()
    {
        LoyaltyCoupon loyaltycoupon = mLoyaltyManager.getBaseCoupon();
        if (loyaltycoupon == null)
        {
            updateLoyaltyWidgetFragment();
            mActivityHelper.showAlert(AlertType.LOYALTY_NO_BASE_COUPON);
            return;
        } else
        {
            addCouponToOrder(loyaltycoupon.getCouponCode());
            mAnalyticsUtil.postCouponAdded(loyaltycoupon.getCouponCode());
            return;
        }
    }

    private void refreshCartViews(LabsOrder labsorder)
    {
        orderDetailsListAdapter.setOrder(labsorder);
        setListAdapter(orderDetailsListAdapter);
        orderDetailsListAdapter.notifyDataSetChanged();
        mAddressView.bind(labsorder);
        mAddressView.setOnClickListener(new _cls7());
        mCartFooterView.bind(labsorder);
        mTopWarningView.hide();
        updateEditButton();
        setEditBtnText();
        mHeaderCheckoutButtonTextView.setText(mOrderUtil.getAddedProductQuantity(mOrderManager.getOrder().getProductLineList()));
        boolean flag;
        if (!mCartManager.isCartWithProducts() || mCartManager.isCartAbleToCheckout())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        enableCheckoutButton(flag);
        buildLoyaltyMicroWidget();
    }

    private void resumeDelayedCartConversation()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.ResumeDelayedFocus());
    }

    private void setEditBtnText()
    {
        if (((LabsOrderDetailsListAdapter)getListAdapter()).isEditMode())
        {
            mEditButtonText.setText(0x7f080100);
            return;
        } else
        {
            mEditButtonText.setText(0x7f08010d);
            return;
        }
    }

    private void setupGoogleWallet()
    {
        if (!mConfigurationManager.getApplicationConfiguration().isGoogleWalletEnabled())
        {
            return;
        }
        mGoogleWalletFragment = (GoogleWalletFragment)getSupportFragmentManager().a(com/dominos/fragments/GoogleWalletFragment.getSimpleName());
        if (mGoogleWalletFragment == null)
        {
            mGoogleWalletFragment = GoogleWalletFragment_.newInstance(false);
            getSupportFragmentManager().a().a(mGoogleWalletFragment, com/dominos/fragments/GoogleWalletFragment.getSimpleName()).a();
        }
        mGoogleWalletFragment.setOnWalletConnectionListener(this);
        mGoogleWalletFragment.setOnMaskedWalletLoadedListener(this);
    }

    private void showDeleteConfirm(final int id)
    {
        mActivityHelper.showOptionAlert(AlertType.DELETE_CONFIRMATION_ITEM_FROM_ORDER, null, new _cls6());
    }

    private void showProductRemovedAlert(com.dominos.utils.ActivityHelper.AlertActionCallback alertactioncallback)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        for (Iterator iterator = mOrderManager.getOrder().getRemovedProductLineList().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder("\u2010 ")).append(s).toString()).append("<br />"))
        {
            s = (String)iterator.next();
        }

        mActivityHelper.showAlert(AlertType.PRODUCT_IS_REMOVED, stringbuilder.toString(), null, mCommand, alertactioncallback);
        mOrderManager.getOrder().setProductRemoved(false);
        mOrderManager.getOrder().getRemovedProductLineList().clear();
    }

    private void updateEditButton()
    {
        if (getListAdapter().getCount() == 0)
        {
            mEditButton.setVisibility(8);
            mEditButtonSeparator.setVisibility(8);
            return;
        } else
        {
            mEditButton.setVisibility(0);
            mEditButtonSeparator.setVisibility(0);
            return;
        }
    }

    protected void buildLoyaltyMicroWidget()
    {
label0:
        {
            if (mLoyaltyManager.isLoyaltyEnabled() && mLoyaltyManager.isCustomerEnrolledInLoyalty() || mLoyaltyManager.isLoyaltyEnabled() && !mLoyaltyManager.isLoyaltyAvailable() && mProfileManager.isAuthorizedUser())
            {
                mLoyaltyWidgetFragment = (LoyaltyWidgetFragment)getSupportFragmentManager().a(LoyaltyWidgetFragment.TAG);
                if (mLoyaltyWidgetFragment != null)
                {
                    break label0;
                }
                mLoyaltyWidgetFragment = LoyaltyWidgetFragment.newInstance(com.dominos.fragments.LoyaltyWidgetFragment.LoyaltyWidgetType.NORMAL);
                getSupportFragmentManager().a().b(0x7f0f00a9, mLoyaltyWidgetFragment, LoyaltyWidgetFragment.TAG).a();
            }
            return;
        }
        updateLoyaltyWidgetFragment();
    }

    public void commonCheckoutClick()
    {
        mWhichCheckoutButton = CheckoutButton.CHECKOUT;
        if (!mCartManager.isCartWithProducts())
        {
            showEmptyCartAlert();
            return;
        }
        if (mCartManager.isCartAbleToCheckout())
        {
            handleCheckoutClicked();
            return;
        } else
        {
            enableCheckoutButton(false);
            return;
        }
    }

    protected void displayUpSellAfterGoogleWallet()
    {
        if (!mCartManager.isUpsellAnswered())
        {
            String s = mOrderManager.getOrder().determineUpsellProduct(mConfigurationManager.getUpsellData(), mMenuManager.getMenu(), false);
            if (!StringHelper.isEmpty(s))
            {
                mUpsellDialog = UpsellDialog_.builder().mUpsellCode(s).build();
                mCartManager.setUpsellDisplayed(true);
                mUpsellDialog.show(getSupportFragmentManager(), com/dominos/dialogs/UpsellDialog.getSimpleName());
            } else
            {
                mSpeechManager.preventNinaPause();
                navigateToCheckoutActivity();
            }
            mCartManager.setUpSellCode(s);
            return;
        } else
        {
            navigateToCheckoutActivity();
            return;
        }
    }

    protected void enableCheckoutButton(boolean flag)
    {
        boolean flag1 = mCartManager.isCartWithValidPrice(mOrderManager.getOrder());
        mEmptyCheckoutSectionView.setButtonsEnabled(flag, flag);
        mCartFooterView.updateCheckoutView(flag, flag1);
        mHeaderCheckoutButton.setEnabled(flag);
    }

    protected void getCustomerLoyaltyInformation()
    {
        mLoyaltyManager.getUserLoyaltyInformation(mProfileManager.getCurrentUser(), new _cls5());
    }

    protected void goToCouponActivity()
    {
        mAnalyticsUtil.postCartCouponClicked();
        mSpeechManager.preventNinaPause();
        LabsCouponListActivity_.intent(this).start();
    }

    protected void handleCouponError(PriceOrderErrorCode priceordererrorcode, LabsCouponLine labscouponline)
    {
        switch (_cls11..SwitchMap.com.dominos.android.sdk.core.order.PriceOrderErrorCode[priceordererrorcode.ordinal()])
        {
        default:
            mCartManager.removeCoupon(mOrderManager.getOrder(), labscouponline);
            mOrderManager.getOrder().clearPrices();
            requestToRetry();
            return;

        case 4: // '\004'
        case 5: // '\005'
            mActivityHelper.showAlert(AlertType.COUPON_CANNOT_COMBINE);
            return;

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            mActivityHelper.showAlert(AlertType.COUPON_NOT_AVAILABLE);
            return;

        case 9: // '\t'
            mActivityHelper.showAlert(AlertType.COUPON_LIMIT_REACHED);
            return;

        case 10: // '\n'
            mActivityHelper.showAlert(AlertType.COUPON_CARRYOUT_ONLY);
            return;

        case 11: // '\013'
            priceordererrorcode = CouponUtil.getMinimumOrderAmount(mCouponWizardManager.getUpdatedCouponByCode(labscouponline.getCoupon().getCode()));
            mActivityHelper.showAlert(AlertType.BELOW_MINIMUM_ORDER_AMOUNT, priceordererrorcode, null);
            return;

        case 12: // '\f'
            handleCouponNeedCustomization(labscouponline);
            return;

        case 13: // '\r'
            mActivityHelper.showAlert(AlertType.COUPON_INVALID);
            return;

        case 14: // '\016'
            disableRedemption();
            break;
        }
        mActivityHelper.showAlert(AlertType.NON_LOYALTY_STORE, mNonLoyaltyAlertActionCallback);
    }

    protected void handleCouponNeedCustomization(LabsCouponLine labscouponline)
    {
        mCouponWizardManager.initialize(labscouponline);
        if (!mOrderManager.getOrder().getRemovedProductLineList().isEmpty())
        {
            showProductRemovedAlert(new _cls3());
            return;
        } else
        {
            navigateToCouponWizard();
            return;
        }
    }

    public boolean handleHomeButtonClicked()
    {
        LogUtil.d(TAG, "Cart activity home clicked", new Object[0]);
        if (c.i())
        {
            SpeechContext.updateAgents(new String[] {
                GlobalAgent.NAME, "repeat"
            });
        }
        return true;
    }

    protected void handleOrderCreated(LabsOrder labsorder, boolean flag)
    {
        CartErrorType carterrortype = mCartManager.validateCurrentOrder(labsorder);
        _cls11..SwitchMap.com.dominos.android.sdk.core.cart.CartErrorType[carterrortype.ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 115
    //                   2 132
    //                   3 149
    //                   4 157;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        refreshCartViews(labsorder);
        if (mGoogleWalletFragment != null && mWalletManager.isGoogleWalletAvailable(mStoreManager.getStoreProfile()))
        {
            mGoogleWalletFragment.connectWallet();
        }
        if (!flag) goto _L7; else goto _L6
_L6:
        if (!c.i()) goto _L9; else goto _L8
_L8:
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.UpsellProceededCheckout());
        navigateToCheckoutActivity();
_L11:
        return;
_L2:
        mActivityHelper.showAlert(AlertType.BOTH_PRODUCT_COUPON_REMOVED, mCommand);
        continue; /* Loop/switch isn't completed */
_L3:
        mActivityHelper.showAlert(AlertType.COUPON_IS_REMOVED, mCommand);
        continue; /* Loop/switch isn't completed */
_L4:
        showProductRemovedAlert(null);
        continue; /* Loop/switch isn't completed */
_L5:
        resumeDelayedCartConversation();
        continue; /* Loop/switch isn't completed */
_L9:
        showCheckoutConfirmation();
        return;
_L7:
        if (!mLoyaltyManager.isLoyaltyCouponAdded()) goto _L11; else goto _L10
_L10:
        if (mStoreManager.isStoreALoyaltyStore())
        {
            redeemRewards();
            return;
        }
        disableRedemption();
        mActivityHelper.showAlert(AlertType.NON_LOYALTY_STORE, mCommand);
        return;
        if (true) goto _L1; else goto _L12
_L12:
    }

    protected void hideSwipeToRefreshLayout()
    {
        mCartSwipeRefreshLayout.b();
    }

    protected void navigateToCheckoutActivity()
    {
        mSpeechManager.preventNinaPause();
        if (mWhichCheckoutButton == CheckoutButton.GOOGLE_WALLET && mGoogleWalletFragment != null && mGoogleWalletFragment.getMaskedWallet() != null)
        {
            LabsCheckoutActivity_.intent(this).useGoogleWallet(true).reorderPaymentType("").maskedWallet(mGoogleWalletFragment.getMaskedWallet()).start();
        } else
        {
            LabsCheckoutActivity_.IntentBuilder_ intentbuilder_ = (LabsCheckoutActivity_.IntentBuilder_)LabsCheckoutActivity_.intent(this).flags(0x4000000);
            String s;
            if (reorderPaymentType != null)
            {
                s = reorderPaymentType;
            } else
            {
                s = "";
            }
            intentbuilder_.reorderPaymentType(s).start();
        }
        mWhichCheckoutButton = CheckoutButton.CHECKOUT;
    }

    protected void navigateToLanding()
    {
        mSpeechManager.preventNinaPause();
        mSpeechManager.resetDialogModel();
        ((LandingActivity_.IntentBuilder_)LandingActivity_.intent(this).flags(0x4000000)).start();
    }

    protected void navigateToOrderSettings()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
        OrderSettingActivity_.intent(this).start();
    }

    protected void navigateToPizzaTracker()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
        PizzaTrackerPhoneNumberActivity_.intent(this).start();
    }

    protected void navigateToProductDetails()
    {
        ((LabsProductDetailListActivity_.IntentBuilder_)LabsProductDetailListActivity_.intent(this).flags(0x10020000)).start();
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (mGoogleWalletFragment != null)
        {
            mGoogleWalletFragment.onActivityResult(i, j, intent);
        }
    }

    public void onAfterInject()
    {
        mWalletManager = (GoogleWalletManager)mMobileSession.getManager("google_wallet_manager");
        mProductWizardManager = (ProductWizardManager)mMobileSession.getManager("product_wizard_manager");
    }

    public void onBackPressed()
    {
        LogUtil.d(TAG, "Cart activity back pressed", new Object[0]);
        if (mUpsellDialog != null && mUpsellDialog.isVisible())
        {
            mUpsellDialog.dismiss();
            return;
        } else
        {
            mSpeechManager.resetDialogModel();
            super.onBackPressed();
            return;
        }
    }

    public void onCheckoutClick()
    {
        mAnalyticsUtil.postCartCheckoutClicked(com.dominos.android.sdk.core.analytics.AnalyticsConstants.ButtonLocation.FOOTER);
        mWhichCheckoutButton = CheckoutButton.CHECKOUT;
        if (c.i())
        {
            if (!mCartManager.isCartWithProducts())
            {
                showEmptyCartAlert();
                return;
            } else
            {
                commonSendEventClick();
                return;
            }
        } else
        {
            commonCheckoutClick();
            return;
        }
    }

    public void onConfirmationCheckoutClicked(CheckoutConfirmationFragment checkoutconfirmationfragment)
    {
        checkoutconfirmationfragment.dismiss();
        mSpeechManager.preventNinaPause();
        navigateToCheckoutActivity();
    }

    protected void onCouponsClick()
    {
        if (!mMenuManager.isMenuLoaded())
        {
            return;
        }
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.CouponsSelected());
        if (mMenuManager.hasCoupons())
        {
            goToCouponActivity();
            return;
        } else
        {
            mActivityHelper.showAlert(AlertType.STORE_NO_COUPONS);
            return;
        }
    }

    public void onDeleteClick(View view)
    {
        if (view.getTag() != null)
        {
            showDeleteConfirm(((Integer)view.getTag()).intValue());
        }
    }

    public void onDestroy()
    {
        LogUtil.d(TAG, "Cart activity destroyed", new Object[0]);
        mEmptyCheckoutSectionView.setClickListener(null);
        super.onDestroy();
    }

    public void onEditClick(View view)
    {
        view = (LabsOrderDetailsListAdapter)getListAdapter();
        if (!view.isEditMode())
        {
            mAnalyticsUtil.postCartEditClicked();
        }
        view.toggleEditMode();
        setEditBtnText();
    }

    public void onGoogleWalletClick()
    {
        mWhichCheckoutButton = CheckoutButton.GOOGLE_WALLET;
        mAnalyticsUtil.postCartGoogleWalletClicked();
        LabsOrder labsorder = mOrderManager.getOrder();
        if (!mCartManager.isCartWithProducts())
        {
            showEmptyCartAlert();
            return;
        }
        if (mCartManager.isCartAbleToCheckout())
        {
            if (mWalletManager.isGoogleWalletAvailable(mStoreManager.getStoreProfile()) && mGoogleWalletFragment != null)
            {
                loadMaskedWallet(labsorder);
                return;
            } else
            {
                showGWUnavailableAlert();
                return;
            }
        } else
        {
            enableCheckoutButton(false);
            return;
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        view = null;
        if (i > 0) goto _L2; else goto _L1
_L1:
        LogUtil.d(TAG, "onItem clicked on invalid position", new Object[0]);
_L4:
        return;
_L2:
        adapterview = ((AdapterView) (mOrderManager.getOrder().getLineById(i - 1)));
        if (adapterview != null)
        {
            App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
            if (!(adapterview instanceof LabsCouponLine))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((LabsCouponLine)adapterview).getCoupon().isBundled())
            {
                handleCouponNeedCustomization((LabsCouponLine)adapterview);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (!(adapterview instanceof LabsProductLine)) goto _L4; else goto _L3
_L3:
        LabsProductLine labsproductline = new LabsProductLine((LabsProductLine)adapterview);
        if (labsproductline.getProduct().getVariants() != null)
        {
            mProductWizardManager.setProductLineInEdit(labsproductline);
            mNinaHelper.getNinaPartialProducts().clear();
            HashMap hashmap = new HashMap();
            hashmap.put(NinaPartialProduct.PR_CATEGORY, new String[] {
                labsproductline.getProduct().getProductType()
            });
            hashmap.put(NinaPartialProduct.PR_PRODUCTCODE, new String[] {
                labsproductline.getProduct().getCode()
            });
            hashmap.put(NinaPartialProduct.PR_VARIANT, new String[] {
                labsproductline.getCode()
            });
            String s = NinaPartialProduct.PR_FLAVOR;
            if (labsproductline.getSize() != null)
            {
                adapterview = labsproductline.getSize().getCode();
            } else
            {
                adapterview = null;
            }
            hashmap.put(s, new String[] {
                adapterview
            });
            s = NinaPartialProduct.PR_SIZE;
            adapterview = view;
            if (labsproductline.getFlavor() != null)
            {
                adapterview = labsproductline.getFlavor().getCode();
            }
            hashmap.put(s, new String[] {
                adapterview
            });
            mNinaHelper.getNinaPartialProducts().add(new NinaPartialProduct(mMobileSession, hashmap));
            if (!mProductWizardManager.isInitialized())
            {
                mProductWizardManager.initialize(labsproductline.getProduct());
            }
            mProductWizardManager.replaceProductLine(labsproductline);
            mProductWizardManager.setEditMode(true);
            navigateToProductDetails();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        showDeleteConfirm(i - 1);
        return true;
    }

    public void onMaskedWalletLoaded(int i)
    {
        hideLoading();
        switch (i)
        {
        default:
            mWhichCheckoutButton = CheckoutButton.CHECKOUT;
            if (!mGoogleWalletFragment.isUserPreAuthorized())
            {
                App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(new String[0]));
            }
            return;

        case -1: 
            break;
        }
        if (c.i())
        {
            commonSendEventClick();
            return;
        } else
        {
            displayUpSellAfterGoogleWallet();
            return;
        }
    }

    public void onPieImageRedeemButtonClick()
    {
        mAnalyticsUtil.postCartRewardsPieRedeemClick();
        redeemRewards();
    }

    protected void onProductsClick()
    {
        if (!mMenuManager.isMenuLoaded())
        {
            LogUtil.d(TAG, "onProductsClick , Menu not loaded", new Object[0]);
            return;
        } else
        {
            navigateToRootMenu();
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.MenuSelected(mProductWizardManager.isFromCouponWizard()));
            return;
        }
    }

    public void onRedeemButtonClick()
    {
        mAnalyticsUtil.postCartRewardsWidgetRedeem();
        redeemRewards();
    }

    public void onRetryButtonClick()
    {
        getCustomerLoyaltyInformation();
    }

    protected void onSessionTimedOut()
    {
        mActivityHelper.showAlert(AlertType.SESSION_TIMED_OUT);
    }

    public void onStart()
    {
        super.onStart();
        mAnalyticsUtil.postCartHomeEvent();
        LogUtil.d(TAG, "Cart activity started.", new Object[0]);
        mEventBusSubscriber = new BusSubscriberHackForOtto(null);
        App.getInstance().bus.register(mEventBusSubscriber);
        handleOnStart();
    }

    public void onStop()
    {
        super.onStop();
        cancelEditMode();
        LogUtil.d(TAG, "Cart activity stopped", new Object[0]);
        if (mEventBusSubscriber != null)
        {
            App.getInstance().bus.unregister(mEventBusSubscriber);
        }
    }

    public void onUpsellAddToOrderClicked(UpsellDialog upselldialog, boolean flag)
    {
        upselldialog.dismiss();
        addUpsellProductToOrder(upselldialog.getUpsellProductLine());
        flag = mCartManager.isCartWithValidPrice(mOrderManager.getOrder());
        mCartFooterView.updateCheckoutView(true, flag);
        mHeaderCheckoutButton.setEnabled(true);
    }

    public void onUpsellBarItemClicked(int i, List list)
    {
        list = (LabsProduct)list.get(i);
        mAnalyticsUtil.postUpsellBarItemSelected(list.getName());
        mProductWizardManager.initialize(list);
        mSpeechManager.preventNinaPause();
        mNinaHelper.resetCurrentPartialProduct(list);
        mProductWizardManager.setCreatedFromMenu(true);
        ((LabsSizeListActivity_.IntentBuilder_)LabsSizeListActivity_.intent(this).flags(0x10020000)).start();
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.ProductSelected(false));
    }

    public void onUpsellCanceled(UpsellDialog upselldialog)
    {
        upselldialog.dismiss();
        boolean flag = mCartManager.isCartWithValidPrice(mOrderManager.getOrder());
        mCartFooterView.updateCheckoutView(true, flag);
        mHeaderCheckoutButton.setEnabled(true);
    }

    public void onUpsellGoToCheckoutClicked(UpsellDialog upselldialog)
    {
        upselldialog.dismiss();
        navigateToCheckoutActivity();
    }

    public void onWalletConnected()
    {
        LogUtil.d(TAG, "GW: onWalletConnected on cart.", new Object[0]);
        boolean flag = mCartManager.isCartWithValidPrice(mOrderManager.getOrder());
        mCartFooterView.updateGoogleWalletView(true, flag);
        mEmptyCheckoutSectionView.setGoogleWalletButtonEnabled(true, true);
        mSpeechManager.preventNinaPause();
    }

    public void onWalletFailure()
    {
        LogUtil.d(TAG, "GW: onWalletFailure on cart.", new Object[0]);
        mCartFooterView.updateGoogleWalletView(false, false);
        mEmptyCheckoutSectionView.setGoogleWalletButtonEnabled(false, false);
    }

    protected void requestToRetry()
    {
        mTopWarningView.setWarningMessage(getString(0x7f0802f2));
        mTopWarningView.show();
    }

    public void setupCartActivity()
    {
        setupGoogleWallet();
        mAddressView = LabsAddressView_.build(this, null);
        FontManager.applyDominosFont(mAddressView);
        getListView().addHeaderView(mAddressView, null, false);
        mCartFooterView = CartFooterView_.build(this);
        mCartFooterView.addDomView(getNinaPaddingView());
        mCartFooterView.setFooterViewsClickListener(this);
        getListView().addFooterView(mCartFooterView, null, false);
        mEmptyCheckoutSectionView = CheckoutButtonSectionView_.build(this);
        LinearLayout linearlayout = (LinearLayout)findViewById(0x1020004).findViewById(0x7f0f0128);
        linearlayout.addView(mEmptyCheckoutSectionView);
        linearlayout.addView(getLayoutInflater().inflate(0x7f03008c, null));
        mEmptyCheckoutSectionView.setClickListener(this);
        getListView().setOnItemClickListener(this);
        getListView().setOnItemLongClickListener(this);
        mCartSwipeRefreshLayout.a();
        mCartSwipeRefreshLayout.a(new int[] {
            0x7f0e0057, 0x7f0e0087
        });
        mCartSwipeRefreshLayout.a(new _cls2());
        buildLoyaltyMicroWidget();
    }

    protected void showCheckoutConfirmation()
    {
        CheckoutConfirmationFragment_.builder().upsellProductName(mUpsellDialog.getUpsellProductLine().getName()).build().show(getSupportFragmentManager(), com/dominos/dialogs/CheckoutConfirmationFragment.getSimpleName());
    }

    protected void showDelayedLoadingDialog()
    {
        (new Handler()).postDelayed(new _cls4(), 1000L);
    }

    protected void showEmptyCartAlert()
    {
        mActivityHelper.showAlert(AlertType.CART_EMPTY);
    }

    protected void showGWUnavailableAlert()
    {
        mActivityHelper.showAlert(AlertType.GOOGLE_WALLET_UNAVAILABLE);
    }

    protected void showProductErrorAlert(PriceOrderErrorCode priceordererrorcode, LabsProductLine labsproductline)
    {
        switch (_cls11..SwitchMap.com.dominos.android.sdk.core.order.PriceOrderErrorCode[priceordererrorcode.ordinal()])
        {
        default:
            mActivityHelper.showAlert(AlertType.STORE_ONLINE_ISSUE, mStoreManager.getStoreProfile().getPhone(), null);
            return;

        case 1: // '\001'
            mActivityHelper.showAlert(AlertType.TOO_MANY_DIPPING_CUPS);
            return;

        case 2: // '\002'
            mActivityHelper.showAlert(AlertType.TOO_MANY_ITEMS, labsproductline.getProduct().getTitle(), null);
            break;
        }
    }

    protected void showProductReplacedAlert(String s)
    {
        String s1 = mCartManager.getReplacedProductMessage(s);
        mActivityHelper.showCustomLookGeneralAlert(getString(0x7f0800b9), s1, getString(0x7f0800b7), null, null);
        mCartManager.setProductRemovedAlertShown(s, "3.0.1");
    }

    public void uiCheckoutClicked()
    {
        mAnalyticsUtil.postCartCheckoutClicked(com.dominos.android.sdk.core.analytics.AnalyticsConstants.ButtonLocation.HEADER);
        if (System.currentTimeMillis() - mHeaderCheckoutButtonClickTime < 1000L)
        {
            mHeaderCheckoutButtonClickTime = System.currentTimeMillis();
        } else
        {
            mHeaderCheckoutButtonClickTime = System.currentTimeMillis();
            if (!mCreateOrderInProgress)
            {
                onCheckoutClick();
                return;
            }
        }
    }

    protected void updateLoyaltyWidgetFragment()
    {
        if (mLoyaltyWidgetFragment != null)
        {
            mLoyaltyWidgetFragment.updateView();
        }
    }









/*
    static boolean access$402(CartActivity cartactivity, boolean flag)
    {
        cartactivity.mCreateOrderInProgress = flag;
        return flag;
    }

*/






    private class _cls1 extends com.dominos.utils.ActivityHelper.AlertActionCallback
    {

        final CartActivity this$0;

        public void onAlertDismissed()
        {
            if (mCartManager.isCartWithProducts())
            {
                makePriceOrder(mOrderManager.getOrder(), false);
            }
        }

        _cls1()
        {
            this$0 = CartActivity.this;
            super();
        }
    }


    private class _cls10 extends com.dominos.android.sdk.core.coupon.CouponWizardManager.AddCouponToOrderCallback
    {

        final CartActivity this$0;

        public void onBegin()
        {
            super.onBegin();
            showLoading();
        }

        public void onCouponAdded(LabsCouponLine labscouponline, com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType couponerrortype)
        {
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.AddCouponResponse(labscouponline, couponerrortype));
            switch (_cls11..SwitchMap.com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType[couponerrortype.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                handleOrderCreated(mOrderManager.getOrder(), false);
                return;

            case 2: // '\002'
                handleCouponNeedCustomization(labscouponline);
                break;
            }
        }

        public void onCouponFailed(LabsCouponLine labscouponline, com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType couponerrortype)
        {
            switch (_cls11..SwitchMap.com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType[couponerrortype.ordinal()])
            {
            default:
                App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.AddCouponResponse(labscouponline, couponerrortype));
                return;

            case 3: // '\003'
                mActivityHelper.showAlert(AlertType.COUPON_CANNOT_COMBINE, mCouponResetCommands);
                break;
            }
        }

        public void onFinish()
        {
            super.onFinish();
            hideLoading();
        }

        _cls10()
        {
            this$0 = CartActivity.this;
            super();
        }
    }


    private class _cls9 extends com.dominos.android.sdk.core.order.OrderManager.PriceOrderErrorCallback
    {

        final CartActivity this$0;

        public void onCouponFailure(LabsOrder labsorder, PriceOrderErrorCode priceordererrorcode, LabsCouponLine labscouponline)
        {
            handleCouponError(priceordererrorcode, labscouponline);
        }

        public void onProductFailure(LabsOrder labsorder, PriceOrderErrorCode priceordererrorcode, LabsProductLine labsproductline)
        {
            showProductErrorAlert(priceordererrorcode, labsproductline);
        }

        public void onUnknownPriceError(LabsOrder labsorder)
        {
            mActivityHelper.showAlert(AlertType.STORE_ONLINE_ISSUE, mStoreManager.getStoreProfile().getPhone(), null);
        }

        _cls9()
        {
            this$0 = CartActivity.this;
            super();
        }
    }


    private class _cls8 extends com.dominos.android.sdk.core.order.OrderManager.CheckStoreAndPriceOrderCallback
    {

        final CartActivity this$0;
        final boolean val$canAutoCheckout;

        public void onBegin()
        {
            showDelayedLoadingDialog();
        }

        public void onFinish()
        {
            mCreateOrderInProgress = false;
            hideLoading();
            hideSwipeToRefreshLayout();
        }

        public void onPriceOrderRequestFailed()
        {
            requestToRetry();
        }

        public void onPriceSuccess(LabsOrder labsorder)
        {
            if (labsorder.needsCustomization())
            {
                handleCouponNeedCustomization(mOrderUtil.getUnfulfilledCouponLine(labsorder));
                return;
            } else
            {
                handleOrderCreated(labsorder, canAutoCheckout);
                return;
            }
        }

        public void onPricingFailure(LabsOrder labsorder)
        {
            handlePriceOrderError(labsorder);
        }

        public void onPricingWarning(final LabsOrder order, PriceOrderErrorCode priceordererrorcode)
        {
            class _cls1 extends com.dominos.utils.ActivityHelper.AlertActionCallback
            {

                final _cls8 this$1;
                final LabsOrder val$order;

                public void onAlertDismissed()
                {
                    makePriceOrder(order, canAutoCheckout);
                }

                _cls1()
                {
                    this$1 = _cls8.this;
                    order = labsorder;
                    super();
                }
            }

            switch (_cls11..SwitchMap.com.dominos.android.sdk.core.order.PriceOrderErrorCode[priceordererrorcode.ordinal()])
            {
            default:
                return;

            case 15: // '\017'
                mActivityHelper.showAlert(AlertType.LOYALTY_PRICE_OR_PLACE_ORDER_FAIL, new _cls1());
                break;
            }
        }

        public void onStoreCarryoutUnavailable(String s)
        {
            mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_UNAVAILABLE, s, null);
        }

        public void onStoreClosed()
        {
            if (mOrderManager.getOrder().isDelivery())
            {
                mActivityHelper.showAlert(AlertType.STORE_DELIVERY_CLOSED);
                return;
            } else
            {
                mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_CLOSED);
                return;
            }
        }

        public void onStoreDeliveryUnavailable(String s)
        {
            mActivityHelper.showAlert(AlertType.STORE_DELIVERY_UNAVAILABLE, s, null);
        }

        public void onStoreOffline(String s)
        {
            if (mOrderManager.getOrder().isDelivery())
            {
                mActivityHelper.showAlert(AlertType.STORE_DELIVERY_OFFLINE, s, null);
                return;
            } else
            {
                mActivityHelper.showAlert(AlertType.STORE_CARRYOUT_OFFLINE, s, null);
                return;
            }
        }

        _cls8()
        {
            this$0 = CartActivity.this;
            canAutoCheckout = flag;
            super();
        }
    }


    private class _cls7
        implements android.view.View.OnClickListener
    {

        final CartActivity this$0;

        public void onClick(View view)
        {
            navigateToOrderSettings();
        }

        _cls7()
        {
            this$0 = CartActivity.this;
            super();
        }
    }


    private class _cls6 extends com.dominos.utils.ActivityHelper.OptionAlertActionCallback
    {

        final CartActivity this$0;
        final int val$id;

        public void onNegativeButtonClicked()
        {
        }

        public void onNeutralButtonClicked()
        {
        }

        public void onPositiveButtonClicked()
        {
            mAnalyticsUtil.postCartDeleteClicked();
            showShortToast(getString(0x7f0800f2));
            LabsOrder labsorder = mOrderManager.getOrder();
            mCartManager.removeLineItem(mOrderManager.getOrder(), mOrderManager.getOrder().getLineById(id));
            if (!mCartManager.isCartWithProducts())
            {
                cancelEditMode();
            }
            refreshCartViews(labsorder);
            if (mCartManager.isCartWithProducts())
            {
                makePriceOrder(labsorder, false);
            }
        }

        _cls6()
        {
            this$0 = CartActivity.this;
            id = i;
            super();
        }
    }


    private class CheckoutButton extends Enum
    {

        private static final CheckoutButton $VALUES[];
        public static final CheckoutButton CHECKOUT;
        public static final CheckoutButton GOOGLE_WALLET;

        public static CheckoutButton valueOf(String s)
        {
            return (CheckoutButton)Enum.valueOf(com/dominos/activities/CartActivity$CheckoutButton, s);
        }

        public static CheckoutButton[] values()
        {
            return (CheckoutButton[])$VALUES.clone();
        }

        static 
        {
            CHECKOUT = new CheckoutButton("CHECKOUT", 0);
            GOOGLE_WALLET = new CheckoutButton("GOOGLE_WALLET", 1);
            $VALUES = (new CheckoutButton[] {
                CHECKOUT, GOOGLE_WALLET
            });
        }

        private CheckoutButton(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls5 extends com.dominos.android.sdk.core.loyalty.LoyaltyManager.LoyaltyCallback
    {

        final CartActivity this$0;

        public void onBegin()
        {
            super.onBegin();
            showLoading();
        }

        public void onFinish()
        {
            super.onFinish();
            buildLoyaltyMicroWidget();
            hideLoading();
        }

        public void onLoyaltyFail()
        {
        }

        public void onLoyaltySuccess()
        {
        }

        _cls5()
        {
            this$0 = CartActivity.this;
            super();
        }
    }


    private class _cls11
    {

        static final int $SwitchMap$com$dominos$android$sdk$core$cart$CartErrorType[];
        static final int $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[];
        static final int $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType = new int[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.Fulfilled.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror21) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.ValidCoupon.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror20) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$coupon$CouponWizardManager$CouponErrorType[com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.CouponExclusivityViolation.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror19) { }
            $SwitchMap$com$dominos$android$sdk$core$cart$CartErrorType = new int[CartErrorType.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$cart$CartErrorType[CartErrorType.COUPON_PRODUCT_REMOVED.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror18) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$cart$CartErrorType[CartErrorType.COUPON_REMOVED.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror17) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$cart$CartErrorType[CartErrorType.PRODUCT_REMOVED.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror16) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$cart$CartErrorType[CartErrorType.SUCCESS.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror15) { }
            $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode = new int[PriceOrderErrorCode.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.TooManyToppings.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror14) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.TooManyItems.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror13) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.UnknownProductError.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror12) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.CouponExclusivityViolation.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.PromotionalUsageViolation.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.CouponIsInvalidForDayPart.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.CouponIsInvalidForDayOfWeek.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.CouponIsNotEffectiveOrExpired.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.UsageCountViolation.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.InvalidServiceMethodForCoupon.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.BelowMinimumOrderAmount.ordinal()] = 11;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.Unfulfilled.ordinal()] = 12;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.InvalidCoupon.ordinal()] = 13;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.NonLoyaltyStore.ordinal()] = 14;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PriceOrderErrorCode[PriceOrderErrorCode.UnableToProcessLoyalty.ordinal()] = 15;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls3 extends com.dominos.utils.ActivityHelper.AlertActionCallback
    {

        final CartActivity this$0;

        public void onAlertDismissed()
        {
            navigateToCouponWizard();
        }

        _cls3()
        {
            this$0 = CartActivity.this;
            super();
        }
    }


    private class BusSubscriberHackForOtto
    {

        final CartActivity this$0;

        public void onAddCouponRequested(com.dominos.bus.events.OriginatedFromSpeech.AddCouponRequested addcouponrequested)
        {
            addCouponToOrder(addcouponrequested.getCouponCode());
        }

        public void onGoogleWalletSelected(com.dominos.bus.events.OriginatedFromSpeech.GoogleWalletSelected googlewalletselected)
        {
            onGoogleWalletClick();
        }

        public void onProductAdded(com.dominos.bus.events.OriginatedFromSpeech.ProductAdded productadded)
        {
            mOrderManager.getOrder().clearPrices();
            makePriceOrder(mOrderManager.getOrder(), false);
        }

        public void onProductReplaced(com.dominos.bus.events.OriginatedFromSpeech.ShowProductReplaced showproductreplaced)
        {
            showProductReplacedAlert(showproductreplaced.getProductCode());
        }

        public void openCategory(com.dominos.bus.events.OriginatedFromSpeech.RootMenuSelected rootmenuselected)
        {
            if (!mMenuManager.isMenuLoaded())
            {
                LogUtil.d(CartActivity.TAG, "openCategory , Menu not loaded", new Object[0]);
                return;
            } else
            {
                navigateToRootMenu();
                return;
            }
        }

        public void openCoupons(com.dominos.bus.events.OriginatedFromSpeech.CouponListRequested couponlistrequested)
        {
            if (mMenuManager.hasCoupons())
            {
                goToCouponActivity();
                return;
            } else
            {
                mActivityHelper.showAlert(AlertType.STORE_NO_COUPONS);
                return;
            }
        }

        public void orderDoneByVoice(com.dominos.bus.events.OriginatedFromSpeech.GoToCheckout gotocheckout)
        {
            LogUtil.d("NinaX", "EventBus triggered the main activity", new Object[0]);
            if (mWhichCheckoutButton == CheckoutButton.GOOGLE_WALLET)
            {
                displayUpSellAfterGoogleWallet();
                return;
            } else
            {
                commonCheckoutClick();
                return;
            }
        }

        public void storeClosedOnCheckout(com.dominos.bus.events.OriginatedFromSpeech.ShowCartWarning showcartwarning)
        {
            LogUtil.d("NinaX", "EventBus triggered the main activity", new Object[0]);
            commonCheckoutClick();
        }

        private BusSubscriberHackForOtto()
        {
            this$0 = CartActivity.this;
            super();
        }

        BusSubscriberHackForOtto(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls2
        implements aw
    {

        final CartActivity this$0;

        public void onRefresh()
        {
            LabsOrder labsorder = mOrderManager.getOrder();
            labsorder.clearPrices();
            refreshCartViews(labsorder);
            makePriceOrder(labsorder, false);
        }

        _cls2()
        {
            this$0 = CartActivity.this;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final CartActivity this$0;

        public void run()
        {
            if (mCreateOrderInProgress && !mCartSwipeRefreshLayout.c())
            {
                showLoading();
            }
        }

        _cls4()
        {
            this$0 = CartActivity.this;
            super();
        }
    }

}
