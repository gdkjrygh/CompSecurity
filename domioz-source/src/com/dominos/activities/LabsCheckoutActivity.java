// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.ConfigProvider;
import com.dominos.android.sdk.common.DeviceCapabilities;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.GoogleWalletUtil;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.order.CreditCardType;
import com.dominos.android.sdk.common.dom.order.GiftCard;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.constant.PaymentTag;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.giftcard.GiftCardManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsPayment;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.order.PlaceOrderErrorCode;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.android.sdk.core.tracker.TrackerManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import com.dominos.android.sdk.data.http.shoprunner.ShopRunnerRestClient;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.android.sdk.extension.google.wallet.GoogleWalletManager;
import com.dominos.android.sdk.extension.shoprunner.ShoprunnerManager;
import com.dominos.controllers.CheckoutScreenController;
import com.dominos.controllers.interfaces.IDominosCheckoutScreen;
import com.dominos.controllers.utils.ControllerLocator;
import com.dominos.dialogs.LoginDialogFragment;
import com.dominos.fragments.GoogleFullWalletFragment;
import com.dominos.fragments.GoogleFullWalletFragment_;
import com.dominos.fragments.SignInFragment;
import com.dominos.fragments.SignInFragment_;
import com.dominos.fragments.checkout.DominosFormValidationResult;
import com.dominos.fragments.checkout.IDominosFormFragment;
import com.dominos.fragments.checkout.UserInfoDisplayFragment;
import com.dominos.fragments.checkout.UserInfoInputFragment;
import com.dominos.model.EmailOptIn;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.notification.TrackerService_;
import com.dominos.remote.receiver.NotificationReceiver;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.utils.CreditCardHelper;
import com.dominos.views.CreateProfileView;
import com.dominos.views.CreateProfileView_;
import com.dominos.views.LoyaltyEnrollView;
import com.dominos.views.LoyaltyEnrollView_;
import com.google.a.b.be;
import com.google.a.b.by;
import com.google.android.gms.wallet.Address;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.ProxyCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.api.c.d;
import org.androidannotations.api.c.p;

// Referenced classes of package com.dominos.activities:
//            BaseActivity, EditCreditCardActivity_, UserLoginActivity_, AddCreditCardActivity_, 
//            GiftCardActivity_, TermsWebActivity, UserEditInfoActivity_, CartActivity_, 
//            RegistrationActivity_, LoyaltyInfoFragment, LoyaltyTermsWebActivity_, TrackerActivity_

public class LabsCheckoutActivity extends BaseActivity
    implements LoyaltyInfoFragment.OnFinishLoyaltyInfoFragment, IDominosCheckoutScreen, com.dominos.fragments.GoogleFullWalletFragment.OnChangedWalletListener, com.dominos.fragments.GoogleFullWalletFragment.OnFullWalletLoadedListener, com.dominos.fragments.GoogleWalletFragment.OnWalletConnectionListener, com.dominos.fragments.SignInFragment.SignInClickListener, com.dominos.views.CreateProfileView.CreateProfileViewListener, com.dominos.views.LoyaltyEnrollView.EventListener
{

    private static final int EDITED_PERSONAL_INFO_OF_ORDER = 23;
    public static final int GIFTCARD_REQUEST = 61;
    private static final String GW_CARD = "GOOGLE WALLET";
    private static final int REQUEST_CODE_ADD_CREDIT_CARD_ACTIVITY = 45;
    private static final String TAG = com/dominos/activities/LabsCheckoutActivity.getName();
    private String TERMS_LINK;
    private String TERMS_TEXT;
    private String TERMS_TEXT1;
    private LabsPayment anonymousCardToken;
    boolean anonymousCardUsed;
    String cardId;
    TextView checkoutFormAddress;
    private CheckoutScreenController controller;
    LinearLayout createProfileSection;
    CheckBox easyOrderCheckBox;
    LinearLayout easyOrderDividerLayout;
    EditText easyOrderNickNameBox;
    LinearLayout easyOrderNickNameLayout;
    LinearLayout easyOrderSection;
    private boolean editedPersonalInfoOfOrder;
    CheckBox emailOptInCheckBox;
    LinearLayout emailOptInLayout;
    String general_error;
    protected RelativeLayout gwCardRow;
    LayoutInflater inflater;
    private boolean isGoogleWalletRadioClicked;
    TextView lblApplyGiftCardText;
    TextView lblBalanceDue;
    TextView lblGiftCardAmount;
    TextView lblOrdertotal;
    ControllerLocator locator;
    protected LoginDialogFragment logindialog;
    ConfigProvider mConfigProvider;
    DeviceCapabilities mDeviceCapabilities;
    private GiftCardManager mGiftCardManager;
    LinearLayout mGiftCardSection;
    private GoogleFullWalletFragment mGoogleFullWalletFragment;
    GoogleWalletUtil mGoogleWalletUtil;
    FrameLayout mLoginButtonFrame;
    private LoyaltyEnrollView mLoyaltyEnrollView;
    TextView mLoyaltyPointsEarnedMessage;
    TextView mLoyaltySuccessBanner;
    OrderUtil mOrderUtil;
    private com.dominos.android.sdk.core.order.OrderManager.PlaceOrderCallback mPlaceOrderCallback;
    DominosPrefs_ mPrefs;
    private ShoprunnerManager mShoprunnerManager;
    ShopRunnerRestClient mSrApi;
    private com.dominos.bus.events.SpeechEvents.StopNinaRequest mStopNinaRequestEvent;
    TrackerManager mTrackerManager;
    private GoogleWalletManager mWalletManager;
    MaskedWallet maskedWallet;
    TextView orderTotalText;
    protected LinearLayout paymentList;
    LinearLayout paymentSection;
    private PaymentTag paymentTag;
    private LabsPayment placeOrderPayment;
    String pleaseHaveCardAvailable;
    private boolean profiledUser;
    String reorderPaymentType;
    private LabsPayment savedHistoryCard;
    String storeDoesntAcceptCard;
    RelativeLayout subHeader;
    TextView termsTextView;
    boolean useGoogleWallet;

    public LabsCheckoutActivity()
    {
        editedPersonalInfoOfOrder = false;
        isGoogleWalletRadioClicked = false;
        savedHistoryCard = null;
        profiledUser = false;
        mStopNinaRequestEvent = new com.dominos.bus.events.SpeechEvents.StopNinaRequest();
        mPlaceOrderCallback = new _cls1();
        reorderPaymentType = "";
    }

    private void addAnonymousCreditCardRow()
    {
        RelativeLayout relativelayout = (RelativeLayout)inflater.inflate(0x7f030033, null);
        if (anonymousCardToken == null || anonymousCardToken != null && mOrderManager.getOrder().getPaymentList().size() > 0)
        {
            anonymousCardToken = (LabsPayment)mOrderManager.getOrder().getPaymentList().get(0);
        }
        final LabsPayment token = anonymousCardToken;
        relativelayout.setTag(token);
        relativelayout = formatCreditCardRow(relativelayout, getString(0x7f08032d), token.getLastFour(), token.getCardType(), false, false, true);
        final RadioButton rb = (RadioButton)relativelayout.findViewById(0x7f0f013e);
        rb.setTag(PaymentTag.ANON);
        rb.setOnClickListener(new _cls4());
        paymentList.addView(relativelayout);
        if (anonymousCardUsed)
        {
            rb.performClick();
        }
    }

    private void addCreateProfileView()
    {
        LinearLayout linearlayout = (LinearLayout)findViewById(0x7f0f0148);
        linearlayout.setVisibility(8);
        linearlayout.removeAllViews();
        if (!mLoyaltyManager.isLoyaltyAvailable() || !mLoyaltyManager.isCustomerEnrolledInLoyalty())
        {
            if (mLoyaltyManager.isLoyaltyAvailable())
            {
                if (mProfileManager.isAuthorizedUser())
                {
                    mLoyaltyEnrollView = LoyaltyEnrollView_.build(this, getString(0x7f0801a5), getString(0x7f080049), false);
                } else
                {
                    mLoyaltyEnrollView = LoyaltyEnrollView_.build(this, getString(0x7f0801a4), true);
                }
                mLoyaltyEnrollView.setEventListener(this);
                linearlayout.addView(mLoyaltyEnrollView);
                linearlayout.setVisibility(0);
                return;
            }
            if (!mProfileManager.isAuthorizedUser())
            {
                CreateProfileView createprofileview = CreateProfileView_.build(this);
                createprofileview.setListener(this);
                linearlayout.addView(createprofileview);
                linearlayout.setVisibility(0);
                return;
            }
        }
    }

    private void addThisCardToOrder(LabsPayment labspayment)
    {
        mOrderManager.getOrder().setPaymentList(by.a(new LabsPayment[] {
            labspayment
        }));
    }

    private void callStore()
    {
        String s = mStoreManager.getStoreProfile().getPhone();
        if (!mDeviceCapabilities.hasTelephonyCapabilities())
        {
            mActivityHelper.showAlert(AlertType.STORE_PHONE_INFO, s, null);
        } else
        if (!s.trim().equals(""))
        {
            startActivity(new Intent("android.intent.action.CALL", Uri.parse((new StringBuilder("tel:")).append(s).toString())));
            return;
        }
    }

    private void cashLimitAlert(String s)
    {
        mActivityHelper.showAlert(AlertType.CASH_LIMIT_EXCEEDED, s, null);
    }

    private boolean checkIfGiftCardAmountToHigh()
    {
label0:
        {
            if (Double.compare(mOrderManager.getOrder().getPrice(), mGiftCardManager.getTotalGiftCardAmount()) < 0)
            {
                if (mGiftCardManager.getGiftCardList().size() != 1)
                {
                    break label0;
                }
                ((GiftCard)mGiftCardManager.getGiftCardList().get(0)).setAmount(mOrderManager.getOrder().getPrice());
            }
            return false;
        }
        mActivityHelper.showAlert(AlertType.GIFT_CARD_AMOUNT_HIGH, new _cls15());
        return true;
    }

    private void checkIfGiftCardsCoversAmount()
    {
        if (Double.compare(mGiftCardManager.getRemainingBalance(mOrderManager.getOrder()), 0.0D) == 0 && !mOrderManager.getOrder().isPricingNeeded())
        {
            removePaymentSection();
            mOrderManager.getOrder().setPaymentTag(PaymentTag.GIFTCARD);
            paymentTag = PaymentTag.GIFTCARD;
        }
    }

    private void connectToPlayServ()
    {
        if (mGoogleFullWalletFragment != null && mWalletManager.isGoogleWalletAvailable(mStoreManager.getStoreProfile()))
        {
            mGoogleFullWalletFragment.connectWallet();
        } else
        {
            if (App.isDebugMode())
            {
                Log.d(TAG, "GW: Wallet is turned off on the checkout screen.");
            }
            if (gwCardRow != null)
            {
                gwCardRow.setVisibility(8);
                return;
            }
        }
    }

    private void doEmailOptIn(LabsOrder labsorder, boolean flag)
    {
        EmailOptIn emailoptin = new EmailOptIn();
        emailoptin.setEmail(labsorder.getEmail());
        emailoptin.setFirstName(labsorder.getFirstName());
        emailoptin.setLastName(labsorder.getLastName());
        emailoptin.setOptIn(flag);
        if (labsorder.isDelivery() && labsorder.getAddress() != null)
        {
            emailoptin.setStreet(labsorder.getAddress().getStreet());
            emailoptin.setCity(labsorder.getAddress().getCity());
            emailoptin.setRegion(labsorder.getAddress().getRegion());
            emailoptin.setPostalCode(labsorder.getAddress().getPostalCode());
        }
        emailoptin.setStoreId(labsorder.getStoreId());
        mPowerService.doEmailOptIn(emailoptin.toJson(), null);
    }

    private boolean doesStoreAcceptThisCardType(String s)
    {
        if (s.equalsIgnoreCase("GOOGLE WALLET"))
        {
            return true;
        }
        if (App.isDebugMode() && s.equalsIgnoreCase(mConfigProvider.getCreditCardsNotTakenByStores()))
        {
            return false;
        }
        for (Iterator iterator = mStoreManager.getStoreProfile().getAcceptableCreditCardTypes().iterator(); iterator.hasNext();)
        {
            if (s.equalsIgnoreCase(((CreditCardType)iterator.next()).getName()))
            {
                return true;
            }
        }

        return false;
    }

    private String formatAsDollarAmount(String s)
    {
        if (s.trim().equals(""))
        {
            return "";
        } else
        {
            return String.format(App.US_LOCALE, "$%.2f", new Object[] {
                Double.valueOf(Double.parseDouble(s))
            });
        }
    }

    private RelativeLayout formatCreditCardRow(RelativeLayout relativelayout, String s, String s1, String s2, boolean flag, boolean flag1, boolean flag2)
    {
        StringBuffer stringbuffer = new StringBuffer("");
        stringbuffer.append((new StringBuilder("<b>")).append(s).append("</b>").toString());
        if (flag)
        {
            stringbuffer.append(" (Primary)");
        }
        stringbuffer.append("<br>");
        if (s2.equalsIgnoreCase("GOOGLE WALLET"))
        {
            TextView textview = (TextView)relativelayout.findViewById(0x7f0f0162);
            textview.setTypeface(FontManager.getDominosFont(this));
            textview.setText(Html.fromHtml((new StringBuilder("<b>")).append(s).append("</b>").toString()));
            s = (TextView)relativelayout.findViewById(0x7f0f0164);
            s.setTypeface(FontManager.getDominosFont(this));
            s.setText(Html.fromHtml((new StringBuilder("<font color='#A3A3A3'>")).append(getString(0x7f080111)).append(" ").append(s1).append("</font>").toString()));
        } else
        {
            stringbuffer.append((new StringBuilder("<font color='#A3A3A3'>")).append(getString(0x7f080111)).append(" ").append(s1).append("</font>").toString());
        }
        if (flag1 || App.isDebugMode() && s2.equalsIgnoreCase(mConfigProvider.getCreditCardsExpired()))
        {
            stringbuffer.append(" (Expired)");
            ((RadioButton)relativelayout.findViewById(0x7f0f013e)).setVisibility(4);
            ((Button)relativelayout.findViewById(0x7f0f013f)).setVisibility(0);
        }
        if (!doesStoreAcceptThisCardType(s2))
        {
            stringbuffer.append("<br>");
            stringbuffer.append((new StringBuilder("<b>")).append(storeDoesntAcceptCard).append("</b>").toString());
            ((RadioButton)relativelayout.findViewById(0x7f0f013e)).setVisibility(4);
        }
        s = (ImageView)relativelayout.findViewById(0x7f0f013c);
        s.setImageResource(CreditCardHelper.determineCardImage(s2));
        s1 = (Button)relativelayout.findViewById(0x7f0f013d);
        s1.setText(Html.fromHtml(stringbuffer.toString()));
        s1.setTextSize(14F);
        s1.setTypeface(FontManager.getDominosFont(this));
        if (flag2)
        {
            s2 = new EditCreditCardButtonListener((RadioButton)relativelayout.findViewById(0x7f0f013e));
            s.setClickable(true);
            s.setOnClickListener(s2);
            s1.setOnClickListener(s2);
        }
        return relativelayout;
    }

    private IDominosFormFragment getFormFragment()
    {
        IDominosFormFragment idominosformfragment1 = (IDominosFormFragment)getSupportFragmentManager().a("user_info_input");
        IDominosFormFragment idominosformfragment = idominosformfragment1;
        if (idominosformfragment1 == null)
        {
            idominosformfragment = (IDominosFormFragment)getSupportFragmentManager().a("user_info_display");
        }
        return idominosformfragment;
    }

    private LabsPayment getLabsPaymentForFullWallet()
    {
        LabsPayment labspayment = new LabsPayment();
        Object obj = null;
        if (mGoogleFullWalletFragment != null)
        {
            obj = mGoogleFullWalletFragment.getFullWallet();
        }
        if (maskedWallet != null && obj != null)
        {
            Object obj1 = mOrderManager.getOrder();
            String as[] = maskedWallet.d();
            String s = ((FullWallet) (obj)).c().c();
            Object obj2 = ((FullWallet) (obj)).b();
            obj = ((ProxyCard) (obj2)).c();
            int i = ((ProxyCard) (obj2)).d();
            int j = ((ProxyCard) (obj2)).e();
            obj2 = ((ProxyCard) (obj2)).b();
            ((LabsOrder) (obj1)).clearPayments();
            labspayment.setPaymentType("CreditCard");
            labspayment.setAmount(mGiftCardManager.getRemainingBalance(mOrderManager.getOrder()));
            labspayment.setNumber(((String) (obj2)));
            obj1 = new StringBuilder();
            if (i < 10)
            {
                ((StringBuilder) (obj1)).append("0");
            }
            ((StringBuilder) (obj1)).append(i);
            ((StringBuilder) (obj1)).append(String.valueOf(j).substring(2, 4));
            labspayment.setExpiration(((StringBuilder) (obj1)).toString());
            labspayment.setSecurityCode(((String) (obj)));
            labspayment.setPostalCode(s);
            labspayment.setWalletFromGwPaymentDesc(as);
            labspayment.setCardType("MasterCard");
        }
        return labspayment;
    }

    private LabsPayment getLabsPaymentForMaskedWallet()
    {
        LabsPayment labspayment = new LabsPayment();
        if (maskedWallet != null)
        {
            LabsOrder labsorder = mOrderManager.getOrder();
            String s = maskedWallet.f().c();
            labsorder.clearPayments();
            labspayment.setPaymentType("CreditCard");
            labspayment.setAmount(labsorder.getPrice());
            labspayment.setNumber("");
            labspayment.setCardType("MasterCard");
            labspayment.setExpiration("1223");
            labspayment.setSecurityCode("111");
            labspayment.setPostalCode(s);
            labspayment.setWalletFromGwPaymentDesc(maskedWallet.d());
        }
        return labspayment;
    }

    private void getStoreProfile(String s)
    {
        mPowerService.getStoreProfile(s, new _cls8());
    }

    private String getSubHeaderValue(boolean flag, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s1;
        if (flag)
        {
            s1 = getString(0x7f0800a1);
        } else
        {
            s1 = getString(0x7f0800a0);
        }
        stringbuilder.append(s1);
        if (StringHelper.isNotEmpty(s))
        {
            stringbuilder.append(getString(0x7f0800a5, new Object[] {
                s
            }));
        }
        return stringbuilder.toString();
    }

    private Bundle getUserBundle()
    {
        Object obj = mProfileManager.getCurrentUser();
        if (obj == null && maskedWallet != null)
        {
            obj = mGoogleWalletUtil.getValuesFormMaskedWallet(maskedWallet);
            putDeliveryInstructions(((Bundle) (obj)));
            return ((Bundle) (obj));
        }
        Bundle bundle = new Bundle();
        if (obj != null && !editedPersonalInfoOfOrder)
        {
            bundle.putString("first_name", ((UserObject) (obj)).getFirstName());
            bundle.putString("last_name", ((UserObject) (obj)).getLastName());
            bundle.putString("phone", ((UserObject) (obj)).getPhone());
            bundle.putString("email", ((UserObject) (obj)).getEmail());
            bundle.putString("phone_ext", ((UserObject) (obj)).getPhoneExtension());
        } else
        {
            bundle.putString("first_name", mOrderManager.getOrder().getFirstName());
            bundle.putString("last_name", mOrderManager.getOrder().getLastName());
            bundle.putString("phone", mOrderManager.getOrder().getPhone());
            bundle.putString("email", mOrderManager.getOrder().getEmail());
            bundle.putString("phone_ext", mOrderManager.getOrder().getPhoneExtension());
        }
        putDeliveryInstructions(bundle);
        return bundle;
    }

    private void goToEditCreditCard(LabsPayment labspayment)
    {
        Intent intent = new Intent(this, com/dominos/activities/EditCreditCardActivity_);
        Bundle bundle = new Bundle();
        bundle.putString("CardId", labspayment.getCardId());
        bundle.putString("LastFour", labspayment.getLastFour());
        bundle.putString("CardType", labspayment.getCardType());
        bundle.putString("ExpirationMonth", labspayment.getExpirationMonth());
        bundle.putString("ExpirationYear", labspayment.getExpirationYear());
        bundle.putString("BillingZip", labspayment.getBillingZip());
        bundle.putString("IsDefault", Boolean.toString(labspayment.isDefault()));
        bundle.putString("NickName", labspayment.getNickName());
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void handleCashPaymentRow()
    {
        final RadioButton cashButton;
        Object obj;
        savedHistoryCard = null;
        cashButton = (RadioButton)findViewById(0x7f0f0169);
        obj = (Button)findViewById(0x7f0f0168);
        int i;
        if (isCarryoutOrder())
        {
            i = 0x7f080099;
        } else
        {
            i = 0x7f080094;
        }
        ((Button) (obj)).setText(Html.fromHtml(getString(i)));
        if (mOrderManager.getOrder().isPaymentTypeAnonymousCreditCard() || mOrderManager.getOrder().getPaymentList().size() != 1) goto _L2; else goto _L1
_L1:
        obj = (LabsPayment)mOrderManager.getOrder().getPaymentList().get(0);
        updateMethodOfPaymentSelection();
        if (!((LabsPayment) (obj)).getPaymentType().equalsIgnoreCase("CreditCardToken")) goto _L4; else goto _L3
_L3:
        savedHistoryCard = ((LabsPayment) (obj));
_L2:
        cashButton.setTag(PaymentTag.CASH);
        cashButton.setOnClickListener(new _cls5());
        if (reorderPaymentType != null && reorderPaymentType.equalsIgnoreCase("Cash") && !isAnonymousCardUsed())
        {
            cashButton.performClick();
        }
        return;
_L4:
        if (((LabsPayment) (obj)).getPaymentType().equalsIgnoreCase("Cash"))
        {
            cashButton.setChecked(true);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private void handleGoogleWalletPaymentRow()
    {
        gwCardRow = (RelativeLayout)paymentList.findViewById(0x7f0f016a);
        if (!useGoogleWallet)
        {
            gwCardRow.setVisibility(8);
            return;
        }
        if (mWalletManager.isGoogleWalletAvailable(mStoreManager.getStoreProfile()))
        {
            String as[] = maskedWallet.d();
            gwCardRow = formatCreditCardRow(gwCardRow, mGoogleWalletUtil.getCardType(as), mGoogleWalletUtil.getCardLastFour(as), "GOOGLE WALLET", false, false, false);
            ((Button)gwCardRow.findViewById(0x7f0f013d)).setVisibility(8);
            FontManager.applyDominosFont((TextView)gwCardRow.findViewById(0x7f0f0165));
            final RadioButton rb = (Button)gwCardRow.findViewById(0x7f0f0163);
            FontManager.applyDominosFont(rb);
            rb.setOnClickListener(new _cls6());
            rb = (RadioButton)gwCardRow.findViewById(0x7f0f013e);
            rb.setTag(PaymentTag.GOOGLE);
            rb.setOnClickListener(new _cls7());
            if (!isGoogleWalletRadioClicked && !reorderPaymentType.equalsIgnoreCase("Cash"))
            {
                rb.performClick();
                isGoogleWalletRadioClicked = true;
            }
            gwCardRow.setVisibility(0);
            return;
        } else
        {
            gwCardRow.setVisibility(8);
            return;
        }
    }

    private void handleSavedPaymentRows()
    {
        if (mProfileManager.getSavedPaymentList() != null && mProfileManager.getSavedPaymentList().size() > 0)
        {
            ((RelativeLayout)paymentList.findViewById(0x7f0f016b)).setVisibility(8);
            Iterator iterator = mProfileManager.getSavedPaymentList().iterator();
            while (iterator.hasNext()) 
            {
                final LabsPayment token = (LabsPayment)iterator.next();
                RelativeLayout relativelayout1 = (RelativeLayout)inflater.inflate(0x7f030033, null);
                relativelayout1.setTag(token);
                Object obj1 = token.getNickName();
                Object obj = obj1;
                if (((String) (obj1)).length() > 30)
                {
                    obj = ((String) (obj1)).substring(0, 30);
                }
                obj = formatCreditCardRow(relativelayout1, ((String) (obj)), token.getLastFour(), token.getCardType(), false, token.isExpired(), false);
                obj1 = (RadioButton)((RelativeLayout) (obj)).findViewById(0x7f0f013e);
                if (isNewCardSaved())
                {
                    if (App.isDebugMode())
                    {
                        Log.d(TAG, (new StringBuilder("new card saved = ")).append(mProfileManager.getNewSavedCardId()).toString());
                    }
                    if (mProfileManager.getNewSavedCardId().equalsIgnoreCase(token.getCardId()))
                    {
                        updateMethodOfPaymentSelection();
                        ((RadioButton) (obj1)).setChecked(true);
                        addThisCardToOrder(token);
                    }
                }
                if (savedHistoryCard != null)
                {
                    String s = savedHistoryCard.getCardId();
                    if (s != null && s.equalsIgnoreCase(token.getCardId()))
                    {
                        updateMethodOfPaymentSelection();
                        ((RadioButton) (obj1)).setChecked(true);
                        addThisCardToOrder(token);
                    }
                }
                ((RadioButton) (obj1)).setOnClickListener(new CreditCardRowClickListener(token, null));
                if (isNewCardSaved() && mProfileManager.getNewSavedCardId().equalsIgnoreCase(token.getCardId()))
                {
                    mProfileManager.setNewSavedCardId(null);
                    ((RadioButton) (obj1)).performClick();
                } else
                if (token.getCardId().equalsIgnoreCase(reorderPaymentType) && !isAnonymousCardUsed())
                {
                    ((RadioButton) (obj1)).performClick();
                }
                ((Button)((RelativeLayout) (obj)).findViewById(0x7f0f013f)).setOnClickListener(new _cls3());
                paymentList.addView(((View) (obj)));
            }
            if (isAnonymousCardUsed())
            {
                addAnonymousCreditCardRow();
                return;
            } else
            {
                RelativeLayout relativelayout = (RelativeLayout)inflater.inflate(0x7f030037, null);
                Button button = (Button)relativelayout.findViewById(0x7f0f016e);
                button.setTextSize(14F);
                button.setTextAppearance(this, 0x7f0b0008);
                button.setTypeface(FontManager.getDominosFont(this));
                paymentList.addView(relativelayout);
                return;
            }
        } else
        if (isAnonymousCardUsed())
        {
            addAnonymousCreditCardRow();
            return;
        } else
        {
            ((RelativeLayout)findViewById(0x7f0f016b)).setVisibility(0);
            return;
        }
    }

    private void handleUnrecoverableGoogleWalletError()
    {
        ((RelativeLayout)paymentList.findViewById(0x7f0f016a)).setVisibility(8);
    }

    private void handleUserFragment()
    {
        SignInFragment signinfragment = SignInFragment_.builder().mMessage(getString(0x7f0802aa)).build();
        signinfragment.setSignInClickListener(this);
        if (mProfileManager.getCurrentUser() == null)
        {
            getSupportFragmentManager().a().b(0x7f0f0145, signinfragment).a();
            getSupportFragmentManager().a().b(0x7f0f0147, UserInfoInputFragment.newInstance(getUserBundle()), "user_info_input").a();
            mLoginButtonFrame.setVisibility(0);
            return;
        } else
        {
            mLoginButtonFrame.setVisibility(8);
            getSupportFragmentManager().a().b(0x7f0f0147, UserInfoDisplayFragment.newInstance(getUserBundle()), "user_info_display").a();
            return;
        }
    }

    private void initGoogleWallet()
    {
        if (maskedWallet == null)
        {
            LogUtil.d(TAG, "Masked wallet is not valid to initialize full wallet fragment", new Object[0]);
            return;
        }
        mSpeechManager.preventNinaPause();
        mGoogleFullWalletFragment = (GoogleFullWalletFragment)getSupportFragmentManager().a(com/dominos/fragments/GoogleFullWalletFragment.getSimpleName());
        if (mGoogleFullWalletFragment == null)
        {
            mGoogleFullWalletFragment = GoogleFullWalletFragment_.newInstance(maskedWallet, true);
            getSupportFragmentManager().a().a(mGoogleFullWalletFragment, com/dominos/fragments/GoogleFullWalletFragment.getSimpleName()).a();
        }
        mGoogleFullWalletFragment.setOnWalletConnectionListener(this);
        mGoogleFullWalletFragment.setOnFullWalletLoadedListener(this);
        mGoogleFullWalletFragment.setOnChangedWalletListener(this);
    }

    private void initUserWithUserData()
    {
        UserObject userobject = mProfileManager.getCurrentUser();
        if (!mOrderManager.getOrder().hasPersonalInfo() && userobject != null)
        {
            mOrderManager.getOrder().setFirstName(userobject.getFirstName());
            mOrderManager.getOrder().setLastName(userobject.getLastName());
            mOrderManager.getOrder().setPhone(userobject.getPhone());
            mOrderManager.getOrder().setPhoneExtension(userobject.getPhoneExtension());
            mOrderManager.getOrder().setEmail(userobject.getEmail());
        }
    }

    private boolean isAnonymousCardUsed()
    {
        boolean flag = (new GoogleWalletUtil()).isGoogleWalletPayment(mOrderManager.getOrder());
        return anonymousCardUsed || mOrderManager.getOrder().isPaymentTypeAnonymousCreditCard() && !flag;
    }

    private boolean isCarryoutOrder()
    {
        return mOrderManager.getOrder().isCarryout();
    }

    private boolean isGWBackingCardAcceptedByStore()
    {
        String as[] = maskedWallet.d();
        String s = (new GoogleWalletUtil()).getCardType(as);
        if (App.isDebugMode())
        {
            Log.d(TAG, (new StringBuilder("GW: Backing card type: ")).append(s).toString());
        }
        if (App.isDebugMode() && s.equalsIgnoreCase(mConfigProvider.getCreditCardsNotTakenByStores()))
        {
            return false;
        }
        for (Iterator iterator = mStoreManager.getStoreProfile().getAcceptableCreditCardTypes().iterator(); iterator.hasNext();)
        {
            if (s.equalsIgnoreCase(((CreditCardType)iterator.next()).getName()))
            {
                return true;
            }
        }

        return false;
    }

    private boolean isNewCardSaved()
    {
        return mProfileManager.getNewSavedCardId() != null;
    }

    private boolean isPaymentTypeSelected()
    {
        boolean flag = false;
        if (Double.compare(mGiftCardManager.getRemainingBalance(mOrderManager.getOrder()), 0.0D) != 0) goto _L2; else goto _L1
_L1:
        flag = true;
_L4:
        return flag;
_L2:
        Object obj = (RadioButton)findViewById(0x7f0f0169);
        if (((RadioButton) (obj)).isChecked())
        {
            paymentTag = (PaymentTag)((RadioButton) (obj)).getTag();
            return true;
        }
        int i = 0;
        do
        {
            if (i >= paymentList.getChildCount())
            {
                break;
            }
            obj = paymentList.getChildAt(i);
            RadioButton radiobutton = (RadioButton)((View) (obj)).findViewById(0x7f0f013e);
            if (radiobutton != null && radiobutton.isChecked())
            {
                paymentTag = (PaymentTag)radiobutton.getTag();
                if (paymentTag == PaymentTag.GOOGLE)
                {
                    return true;
                }
                placeOrderPayment = (LabsPayment)((View) (obj)).getTag();
                if (placeOrderPayment != null)
                {
                    return true;
                }
                continue; /* Loop/switch isn't completed */
            }
            i++;
        } while (true);
        obj = (RadioButton)gwCardRow.findViewById(0x7f0f013e);
        if (((RadioButton) (obj)).isChecked())
        {
            paymentTag = (PaymentTag)((RadioButton) (obj)).getTag();
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean isStatusOkAndTotalIsZero()
    {
        LabsOrder labsorder = mOrderManager.getOrder();
        return NumberUtil.isNonNegativeInt(Integer.valueOf(labsorder.getStatus())) && Double.compare(labsorder.getPrice(), 0.0D) == 0;
    }

    private boolean isWalletLoading()
    {
        return mGoogleFullWalletFragment != null && mGoogleFullWalletFragment.isLoadingWallet();
    }

    private void loadFullWallet()
    {
        if (mGoogleFullWalletFragment != null && !mGoogleFullWalletFragment.isWalletConnected())
        {
            mGoogleFullWalletFragment.connectWallet();
        } else
        if (maskedWallet != null && mGoogleFullWalletFragment != null)
        {
            showLoading();
            mGoogleFullWalletFragment.loadFullWallet(mOrderManager.getOrder());
            return;
        }
    }

    private void makePlaceOrderRequest()
    {
        String s;
        LabsOrder labsorder;
        s = null;
        labsorder = mOrderManager.getOrder();
        labsorder.clearPayments();
        if (paymentTag != null)
        {
            LogUtil.d(TAG, (new StringBuilder("paymentTag = ")).append(paymentTag.toString()).toString(), new Object[0]);
        }
        if (paymentTag != PaymentTag.CASH) goto _L2; else goto _L1
_L1:
        LabsPayment labspayment = new LabsPayment();
        labspayment.setPaymentType("Cash");
        labspayment.setAmount(mGiftCardManager.getRemainingBalance(mOrderManager.getOrder()));
        labsorder.setPaymentList(by.a(new LabsPayment[] {
            labspayment
        }));
_L4:
        labsorder.rePopuluateGiftCardPayments(mGiftCardManager.getGiftCardList());
        if (!mProfileManager.isAuthorizedUser() && emailOptInLayout.getVisibility() == 0)
        {
            labsorder.setEmailOptIn(emailOptInCheckBox.isChecked());
        }
        labsorder.setEasyOrder(easyOrderCheckBox.isChecked());
        labsorder.setEasyOrderNickName(easyOrderNickNameBox.getText().toString().trim());
        labsorder.setPaymentTag(PaymentTag.NONE);
        if (mSpeechManager.isNinaInvoked())
        {
            s = mSpeechManager.getNuanceSessionId();
        }
        mOrderManager.placeOrder(labsorder, s, mPlaceOrderCallback);
        return;
_L2:
        if (paymentTag == PaymentTag.GOOGLE)
        {
            labsorder.setPaymentList(by.a(new LabsPayment[] {
                getLabsPaymentForFullWallet()
            }));
        } else
        if (paymentTag == PaymentTag.CREDIT)
        {
            placeOrderPayment.setAmount(mGiftCardManager.getRemainingBalance(mOrderManager.getOrder()));
            placeOrderPayment.setPaymentType("CreditCardToken");
            placeOrderPayment.setWalletPayment(null);
            labsorder.setPaymentList(by.a(new LabsPayment[] {
                placeOrderPayment
            }));
        } else
        if (paymentTag != PaymentTag.GIFTCARD)
        {
            LogUtil.d(TAG, (new StringBuilder("paymenttag = ")).append(mGiftCardManager.getRemainingBalance(mOrderManager.getOrder())).toString(), new Object[0]);
            placeOrderPayment.setAmount(mGiftCardManager.getRemainingBalance(mOrderManager.getOrder()));
            placeOrderPayment.setPaymentType("CreditCard");
            placeOrderPayment.setWalletPayment(null);
            labsorder.setPaymentList(by.a(new LabsPayment[] {
                placeOrderPayment
            }));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void preparePlaceOrder()
    {
        if (!verifyPlaceOrderFields())
        {
            return;
        }
        saveToOrder();
        if (paymentTag == PaymentTag.GOOGLE)
        {
            loadFullWallet();
            return;
        } else
        {
            makePlaceOrderRequest();
            return;
        }
    }

    private void putDeliveryInstructions(Bundle bundle)
    {
        boolean flag = mOrderManager.getOrder().isDelivery();
        bundle.putBoolean("is_delivery", flag);
        if (flag)
        {
            String s = mOrderManager.getOrder().getAddress().getDeliveryInstructions();
            if (StringHelper.isNotBlank(s))
            {
                bundle.putString("delivery_instructions", s.trim());
            }
        }
    }

    private void refreshViewAsGuestUser()
    {
        emailOptInLayout.setVisibility(0);
        easyOrderSection.setVisibility(8);
        createProfileSection.setVisibility(0);
        paymentSection.removeAllViews();
        displayMethodsOfPayment();
        updateMethodOfPaymentSelection();
    }

    private void removePaymentSection()
    {
        paymentSection.removeAllViews();
        paymentSection.setVisibility(8);
    }

    private void saveToOrder()
    {
        String s = easyOrderNickNameBox.getText().toString().trim();
        Object obj = s;
        if (s.equals(""))
        {
            obj = getString(0x7f0800ef);
        }
        s = ((String) (obj));
        if (((String) (obj)).length() > 20)
        {
            s = ((String) (obj)).substring(0, 20);
        }
        obj = getFormFragment();
        if (obj != null)
        {
            obj = ((IDominosFormFragment) (obj)).getData();
            if (obj != null)
            {
                if (!editedPersonalInfoOfOrder)
                {
                    mOrderManager.getOrder().setFirstName(((Bundle) (obj)).getString("first_name").trim());
                    mOrderManager.getOrder().setLastName(((Bundle) (obj)).getString("last_name").trim());
                    mOrderManager.getOrder().setPhone(((Bundle) (obj)).getString("phone").trim());
                    mOrderManager.getOrder().setPhoneExtension(((Bundle) (obj)).getString("phone_ext").trim());
                    mOrderManager.getOrder().setEmail(((Bundle) (obj)).getString("email").trim());
                }
                if (mOrderManager.getOrder().isDelivery() && StringHelper.isNotBlank(((Bundle) (obj)).getString("delivery_instructions")))
                {
                    mOrderManager.getOrder().getAddress().setDeliveryInstructions(StringHelper.trim(((Bundle) (obj)).getString("delivery_instructions")));
                }
            }
        }
        mOrderManager.getOrder().setEasyOrder(easyOrderCheckBox.isChecked());
        mOrderManager.getOrder().setEasyOrderNickName(s);
        if (mProfileManager.getCurrentUser() != null)
        {
            mOrderManager.getOrder().setCustomerId(mProfileManager.getCurrentUser().getCustomerId());
        }
    }

    private void saveUserInfo()
    {
        Bundle bundle = getUserBundle();
        mPrefs.UTILIZE_USER_INFO_FROM_CHECKOUT().b(Boolean.valueOf(true));
        mPrefs.CHECKOUT_FIRST_NAME().b(bundle.getString("first_name"));
        mPrefs.CHECKOUT_LAST_NAME().b(bundle.getString("last_name"));
        mPrefs.CHECKOUT_EMAIL().b(bundle.getString("email"));
        mPrefs.CHECKOUT_PHONE().b(bundle.getString("phone"));
        mPrefs.CHECKOUT_PHONE_EXT().b(bundle.getString("phone_ext"));
    }

    private void sendToUserLoginActivity()
    {
        Intent intent = UserLoginActivity_.intent(this).maskedWallet(maskedWallet).get().putExtra("return-to-caller", true).putExtra("caller-is-checkout-form-activity", true);
        saveUserInfo();
        startActivity(intent);
    }

    private void showEasyOrderSection()
    {
        if (mProfileManager.getCurrentUser() != null)
        {
            easyOrderSection.setVisibility(0);
        }
    }

    private void startAddCreditCardActivity(boolean flag)
    {
        if (mProfileManager.getCurrentUser() == null)
        {
            saveUserInfo();
        }
        updateMethodOfPaymentSelection();
        AddCreditCardActivity_.IntentBuilder_ intentbuilder_ = AddCreditCardActivity_.intent(this);
        intentbuilder_.get().putExtra("cardEditFlag", flag);
        intentbuilder_.startForResult(45);
    }

    private void storeProfileReady(StoreProfile storeprofile)
    {
        if (storeprofile == null)
        {
            showLongToast(getString(0x7f0802f5));
            goToCart();
        } else
        {
            mStoreManager.setStoreProfile(storeprofile);
            if (!mWalletManager.isGoogleWalletAvailable(mStoreManager.getStoreProfile()) && gwCardRow != null)
            {
                gwCardRow.setVisibility(8);
                return;
            }
        }
    }

    private void stylePaymentRows()
    {
        if (paymentSection.getChildCount() == 0)
        {
            paymentList = (LinearLayout)inflater.inflate(0x7f030036, paymentSection);
            for (int i = 0; i < 2; i++)
            {
                int j = (new int[] {
                    0x7f0f016c, 0x7f0f0168
                })[i];
                Button button = (Button)paymentList.findViewById(j);
                button.setTextSize(14F);
                button.setTextAppearance(this, 0x7f0b0008);
                button.setTypeface(FontManager.getDominosFont(this));
                button.setTextColor(getResources().getColor(0x7f0e0099));
            }

        }
    }

    private void updateLoyaltyHeader()
    {
        TextView textview = mLoyaltySuccessBanner;
        int i;
        if (mLoyaltyManager.isNewLoyaltyMemberSingleUse())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
    }

    private void updateMethodOfPaymentSelection()
    {
        ((RadioButton)findViewById(0x7f0f0169)).setChecked(false);
        for (int i = 0; i < paymentList.getChildCount(); i++)
        {
            RadioButton radiobutton = (RadioButton)((ViewGroup)paymentList.getChildAt(i)).findViewById(0x7f0f013e);
            if (radiobutton != null)
            {
                radiobutton.setChecked(false);
            }
        }

    }

    private boolean verifyPlaceOrderFields()
    {
        Object obj1 = getFormFragment();
        Object obj = new ArrayList();
        StringBuffer stringbuffer = new StringBuffer();
        if (obj1 != null)
        {
            obj1 = ((IDominosFormFragment) (obj1)).getValidationResult();
            if (((DominosFormValidationResult) (obj1)).hasError())
            {
                stringbuffer.append(((DominosFormValidationResult) (obj1)).getMessage());
            }
        }
        if (!isPaymentTypeSelected())
        {
            stringbuffer.append(getString(0x7f0801cb));
            ((ArrayList) (obj)).add((LinearLayout)findViewById(0x7f0f0166));
        }
        if (stringbuffer.length() > 0)
        {
            mActivityHelper.showAlert(AlertType.MISSING_CHECKOUT_FIELDS, stringbuffer.toString(), null);
            if (!((ArrayList) (obj)).isEmpty())
            {
                obj = (View)((ArrayList) (obj)).get(0);
                ((View) (obj)).requestFocus();
                if (obj instanceof EditText)
                {
                    ((EditText)obj).selectAll();
                }
            }
            return false;
        } else
        {
            return true;
        }
    }

    public void addGiftCard(View view)
    {
        if (mConfigurationManager.getApplicationConfiguration().isGiftCardsEnabled())
        {
            ((GiftCardActivity_.IntentBuilder_)GiftCardActivity_.intent(this).flags(0x4000000)).startForResult(61);
            overridePendingTransition(0x7f040012, 0x7f040013);
            return;
        } else
        {
            mActivityHelper.showAlert(AlertType.GIFT_CARD_DISABLED);
            return;
        }
    }

    public boolean cashLimitExceeded()
    {
        return mOrderManager.getOrder().getPrice() > mStoreManager.getStoreProfile().getCashLimit();
    }

    public void checkForGiftCards()
    {
        String s = NumberUtil.formatPrice(Double.valueOf(mGiftCardManager.getRemainingBalance(mOrderManager.getOrder())));
        String s1 = NumberUtil.formatPrice(Double.valueOf(mGiftCardManager.getTotalGiftCardAmount()));
        boolean flag;
        if (StringHelper.equals(s, "$-.--") || StringHelper.equals(s1, "$-.--"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (mGiftCardManager.getGiftCardList() != null && !flag)
        {
            lblGiftCardAmount.setText(NumberUtil.formatPrice(Double.valueOf(mGiftCardManager.getTotalGiftCardAmount())));
            lblApplyGiftCardText.setText(getString(0x7f080065));
            lblBalanceDue.setVisibility(0);
            lblBalanceDue.setText(getString(0x7f080069, new Object[] {
                s, s1
            }));
            checkIfGiftCardsCoversAmount();
            return;
        } else
        {
            lblBalanceDue.setVisibility(8);
            lblGiftCardAmount.setText("");
            lblApplyGiftCardText.setText(getString(0x7f080066));
            return;
        }
    }

    protected void displayMethodsOfPayment()
    {
        removePaymentSection();
        paymentSection.setVisibility(0);
        stylePaymentRows();
        handleCashPaymentRow();
        handleSavedPaymentRows();
        handleGoogleWalletPaymentRow();
        checkIfGiftCardsCoversAmount();
        if (isStatusOkAndTotalIsZero())
        {
            mGiftCardSection.setVisibility(8);
            paymentTag = PaymentTag.CASH;
        }
    }

    public void displayTerms(View view)
    {
        startActivity(new Intent(this, com/dominos/activities/TermsWebActivity));
    }

    void easyOrderCheckBoxClicked(View view)
    {
        boolean flag1;
label0:
        {
            flag1 = false;
            boolean flag = false;
            view = (CheckBox)view;
            if (view.isChecked())
            {
                if (!mProfileManager.isSessionTimedOut())
                {
                    break label0;
                }
                LinearLayout linearlayout = easyOrderDividerLayout;
                int i;
                if (view.isChecked())
                {
                    i = 0;
                } else
                {
                    i = 8;
                }
                linearlayout.setVisibility(i);
                linearlayout = easyOrderNickNameLayout;
                if (view.isChecked())
                {
                    i = ((flag) ? 1 : 0);
                } else
                {
                    i = 8;
                }
                linearlayout.setVisibility(i);
            }
            return;
        }
        LinearLayout linearlayout1;
        int j;
        boolean flag2;
        if (mProfileManager.getAuthorizationCode() != null)
        {
            setEasyOrderCheckbox(true);
        } else
        {
            setEasyOrderCheckbox(false);
            logindialog = LoginDialogFragment.newInstance(null, getString(0x7f08019e), false, false, new _cls2());
            logindialog.show(getSupportFragmentManager());
        }
        flag2 = view.isChecked();
        mAnalyticsUtil.postEasyOrderBoxChecked(Boolean.valueOf(flag2));
        linearlayout1 = easyOrderDividerLayout;
        if (view.isChecked())
        {
            j = 0;
        } else
        {
            j = 8;
        }
        linearlayout1.setVisibility(j);
        linearlayout1 = easyOrderNickNameLayout;
        if (view.isChecked())
        {
            j = ((flag1) ? 1 : 0);
        } else
        {
            j = 8;
        }
        linearlayout1.setVisibility(j);
    }

    public void editInfo(View view)
    {
        view = new Intent(this, com/dominos/activities/UserEditInfoActivity_);
        Bundle bundle = new Bundle();
        bundle.putBoolean("editOrderInfoOnly", true);
        view.putExtras(bundle);
        startActivityForResult(view, 23);
    }

    protected void enrollCustomer()
    {
        mProfileManager.enrollCustomerWithLoyalty(new _cls13());
    }

    protected void fetchUpdatedCustomerLoyalty(final LabsOrder order, final PlaceOrderErrorCode errorCode)
    {
        UserObject userobject = mProfileManager.getCurrentUser();
        mLoyaltyManager.getUserLoyaltyInformation(userobject, new _cls9());
    }

    protected void getNewShoprunnerToken(LabsOrder labsorder)
    {
        mShoprunnerManager.loadShopRunnerMember(labsorder);
    }

    public boolean handleHomeButtonClicked()
    {
        mStopNinaRequestEvent = null;
        return false;
    }

    void initCheckout()
    {
        LabsOrder labsorder = mOrderManager.getOrder();
        initGoogleWallet();
        initSubHeader(labsorder);
        FontManager.applyDominosFont(subHeader);
        verifyGiftCards();
        TERMS_TEXT = getString(0x7f0800a4);
        if (mProfileManager.getCurrentUser() != null || mProfileManager.isRemembered())
        {
            profiledUser = true;
        } else
        {
            profiledUser = false;
        }
        if (mProfileManager.getCurrentUser() == null && !mProfileManager.isRemembered() && mProfileManager.getRememberMeCookie() == null || labsorder.isEasyOrder() && mProfileManager.getEasyOrder() != null && mProfileManager.getEasyOrder().equals(labsorder))
        {
            easyOrderSection.setVisibility(8);
        }
        if (App.isDebugMode() && mOrderManager.getOrder() != null)
        {
            Log.d("CheckoutFormActivity", (new StringBuilder("checkout order = ")).append(labsorder.toString()).toString());
        }
        termsTextView.setText(Html.fromHtml(TERMS_TEXT), android.widget.TextView.BufferType.SPANNABLE);
        initUserWithUserData();
    }

    protected void initSubHeader(LabsOrder labsorder)
    {
        String s = getSubHeaderValue(labsorder.isDelivery(), labsorder.getEstimatedWaitMinutes());
        checkoutFormAddress.setText(s);
        s = NumberUtil.formatPrice(Double.valueOf(mOrderManager.getOrder().getPrice()));
        String s1 = getString(0x7f0800a2);
        if (labsorder.isDelivery())
        {
            labsorder = getString(0x7f0800f5);
        } else
        {
            labsorder = getString(0x7f080088);
        }
        labsorder = String.format(s1, new Object[] {
            s, labsorder
        });
        lblOrdertotal.setText(labsorder);
        if (mLoyaltyManager.isCustomerEnrolledInLoyalty() && mLoyaltyManager.getNumberOfPotentialPointsEarned() > 0)
        {
            mLoyaltyPointsEarnedMessage.setText(getString(0x7f0801a3, new Object[] {
                Integer.valueOf(mLoyaltyManager.getNumberOfPotentialPointsEarned())
            }));
            mLoyaltyPointsEarnedMessage.setVisibility(0);
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (mGoogleFullWalletFragment != null)
        {
            mGoogleFullWalletFragment.onActivityResult(i, j, intent);
        }
    }

    void onAfterInject()
    {
        controller = locator.getCheckoutScreenController(this);
        mWalletManager = (GoogleWalletManager)mMobileSession.getManager("google_wallet_manager");
        mGiftCardManager = (GiftCardManager)mMobileSession.getManager("gift_card_manager");
        mShoprunnerManager = (ShoprunnerManager)mMobileSession.getManager("shoprunner_manager");
    }

    public void onBackPressed()
    {
        mSpeechManager.preventNinaPause();
        mStopNinaRequestEvent = null;
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.BackPressedOnCheckout());
        ((CartActivity_.IntentBuilder_)CartActivity_.intent(this).flags(0x4000000)).start();
    }

    public void onChangedWalletLoaded(int i)
    {
        RadioButton radiobutton;
        if (App.isDebugMode())
        {
            Log.d(TAG, "onChangeMaskedWallet()");
        }
        radiobutton = (RadioButton)gwCardRow.findViewById(0x7f0f013e);
        i;
        JVM INSTR tableswitch -1 0: default 52
    //                   -1 53
    //                   0 99;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        isGoogleWalletRadioClicked = false;
        maskedWallet = mGoogleFullWalletFragment.getMaskedWallet();
        radiobutton.setEnabled(true);
        displayMethodsOfPayment();
        getFormFragment().setData(mGoogleWalletUtil.getValuesFormMaskedWallet(maskedWallet));
        return;
_L3:
        if (radiobutton.isEnabled())
        {
            isGoogleWalletRadioClicked = false;
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onCreateProfileCheckBoxSelected(CheckBox checkbox)
    {
        checkbox.setChecked(false);
        RegistrationActivity_.intent(this).mBundle(getFormFragment().getData()).mPreSelectLoyalty(false).startForResult(22);
    }

    public void onCreditCardAdded(int i, Intent intent)
    {
        if (i == -1)
        {
            anonymousCardUsed = intent.getBooleanExtra("extraAnonymousCardUsed", false);
        }
    }

    public void onCreditCardEdit(View view)
    {
        startAddCreditCardActivity(true);
    }

    public void onCreditClick(View view)
    {
        startAddCreditCardActivity(false);
    }

    public void onEasyOrderHelpButtonClick()
    {
        mActivityHelper.showAlert(AlertType.EASY_ORDER_HELP);
    }

    public void onEditedPersonalInfoOfOrder()
    {
        editedPersonalInfoOfOrder = true;
    }

    public void onFinishLoyaltyInfoFragment()
    {
    }

    public void onFullWalletLoaded(int i)
    {
        if (i == -1)
        {
            makePlaceOrderRequest();
            return;
        } else
        {
            hideLoading();
            return;
        }
    }

    public void onLoyaltyCheckBoxClick()
    {
        mAnalyticsUtil.postCheckoutRewardsEnrollClick();
        mLoyaltyEnrollView.getCheckBox().setChecked(false);
        if (mProfileManager.isAuthorizedUser())
        {
            enrollCustomer();
            return;
        } else
        {
            RegistrationActivity_.intent(this).mBundle(getFormFragment().getData()).mPreSelectLoyalty(true).startForResult(22);
            return;
        }
    }

    public void onLoyaltyInfoClick()
    {
        mAnalyticsUtil.postCheckoutRewardsInfoClick();
        LoyaltyInfoFragment.newInstance(LoyaltyInfoFragment.InfoType.INFO).show(getSupportFragmentManager(), LoyaltyInfoFragment.TAG);
    }

    public void onLoyaltyTermsClick()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
        LoyaltyTermsWebActivity_.intent(this).start();
    }

    protected void onOrderPlacementError(LabsOrder labsorder, PlaceOrderErrorCode placeordererrorcode)
    {
        switch (_cls17..SwitchMap.com.dominos.android.sdk.core.order.PlaceOrderErrorCode[placeordererrorcode.ordinal()])
        {
        default:
            onPlaceOrderRequestFail();
            return;

        case 1: // '\001'
        case 2: // '\002'
            showUserLoginDialog(labsorder);
            return;

        case 3: // '\003'
            cashLimitAlert(NumberUtil.formatPrice(Double.valueOf(mStoreManager.getStoreProfile().getCashLimit())));
            return;

        case 4: // '\004'
        case 5: // '\005'
            mActivityHelper.showAlert(AlertType.ORDER_MINIMUM_DELIVERY_AMOUNT, formatAsDollarAmount(mStoreManager.getStoreProfile().getMinimumDeliveryOrderAmount()), null);
            return;

        case 6: // '\006'
            mActivityHelper.showAlert(AlertType.STORE_CLOSED);
            return;

        case 7: // '\007'
        case 8: // '\b'
            mActivityHelper.showAlert(AlertType.STORE_NOT_ALLOWED_FOR_DELIVERY);
            return;

        case 9: // '\t'
        case 10: // '\n'
            mActivityHelper.showAlert(AlertType.ORDER_STORE_NOT_ALLOWED_FOR_CARRYOUT);
            return;

        case 11: // '\013'
            mActivityHelper.showAlert(AlertType.ORDER_GENERIC_PULSE_ERROR);
            return;

        case 12: // '\f'
            mActivityHelper.showAlert(AlertType.ORDER_GENERIC_CREDIT_CARD_ERROR);
            return;

        case 13: // '\r'
            showAlertAndRePriceOrder(AlertType.LOYALTY_PRICE_OR_PLACE_ORDER_FAIL, labsorder);
            return;

        case 14: // '\016'
            mActivityHelper.showAlert(AlertType.LOYALTY_PRICE_OR_PLACE_ORDER_FAIL);
            break;
        }
    }

    protected void onOrderSuccess(LabsOrder labsorder, PlaceOrderErrorCode placeordererrorcode)
    {
        mAnalyticsUtil.postOnSuccessfulOrder(mMobileSession, labsorder, Boolean.valueOf(easyOrderCheckBox.isChecked()));
        if (mSpeechManager.isNinaInvoked())
        {
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.OrderPlaced());
        }
        mSpeechManager.setNinaInvoked(false);
        App.easterEggs = false;
        if (mOrderManager.getOrder().isEmailOptIn())
        {
            doEmailOptIn(mOrderManager.getOrder(), true);
        }
        if (labsorder.isDelivery())
        {
            labsorder.setAddress(mOrderManager.getOrder().getAddress());
        }
        labsorder.setStoreAddress(mOrderManager.getOrder().getStoreAddress());
        mOrderManager.setOrder(labsorder);
        LabsOrder labsorder1 = new LabsOrder(labsorder);
        mCartManager.resetCart(labsorder);
        App.displayErrorToast(getString(0x7f080216), App.getInstance());
        if (((String)mPrefs.googleWalletState().c()).equals("session_authorized"))
        {
            mPrefs.googleWalletState().b("not_authorized");
        }
        mGiftCardManager.deleteGiftCardList();
        if (mShoprunnerManager.isShopRunnerSession() && labsorder.isDelivery())
        {
            getNewShoprunnerToken(labsorder);
        }
        if (labsorder1.isCarryout())
        {
            mAnalyticsUtil.postPlaceOrderCarryout();
        } else
        {
            mAnalyticsUtil.postPlaceOrderDelivery();
        }
        if (mLoyaltyManager.isCustomerEnrolledInLoyalty())
        {
            fetchUpdatedCustomerLoyalty(labsorder1, placeordererrorcode);
            return;
        } else
        {
            startPizzaTrackerActivity(labsorder1, placeordererrorcode);
            return;
        }
    }

    public void onPause()
    {
        super.onPause();
        if (mStopNinaRequestEvent != null && !isWalletLoading())
        {
            App.getInstance().bus.post(mStopNinaRequestEvent);
        }
        saveToOrder();
    }

    public void onPlaceOrderClick()
    {
        if (profiledUser && mProfileManager.isSessionTimedOut())
        {
            onSessionTimedOut();
            mProfileManager.clearCurrentUser();
            if (mOrderManager.getOrder() != null)
            {
                mOrderManager.getOrder().clearPayments();
            }
            profiledUser = false;
            return;
        } else
        {
            preparePlaceOrder();
            return;
        }
    }

    protected void onPlaceOrderRequestFail()
    {
        if (!isFinishing())
        {
            mActivityHelper.showOptionAlert(AlertType.CHECKOUT_FAIL_ALERT, null, new _cls12());
        }
    }

    public void onRegisterRequestCode(int i)
    {
        if (i == -1)
        {
            showShortToast(getString(0x7f0800e6));
            onRestart();
            initCheckout();
            initUserWithUserData();
            displayMethodsOfPayment();
            updateLoyaltyHeader();
            mAnalyticsUtil.onCheckoutRegistrationComplete();
        }
    }

    public void onResume()
    {
        super.onResume();
        getWindow().setSoftInputMode(3);
        getFormFragment().setData(getUserBundle());
        initUserWithUserData();
        if (!isWalletLoading())
        {
            displayMethodsOfPayment();
        }
        mSpeechManager.removeInvokeButton();
    }

    protected void onSessionTimedOut()
    {
        mActivityHelper.showAlert(AlertType.SESSION_TIMED_OUT, new _cls16());
    }

    public void onSignInClicked()
    {
        mAnalyticsUtil.postCheckoutSignInButton();
        sendToUserLoginActivity();
    }

    public void onStart()
    {
        super.onStart();
        mAnalyticsUtil.postCheckoutOnResume();
        Object obj = mOrderManager.getOrder();
        int i;
        if (mStoreManager.getStoreProfile() != null && !((LabsOrder) (obj)).getStoreId().equals(mStoreManager.getStoreProfile().getStoreId()))
        {
            showDialog(getString(0x7f08009d));
            getStoreProfile(((LabsOrder) (obj)).getStoreId());
        } else
        {
            storeProfileReady(mStoreManager.getStoreProfile());
        }
        if (mConfigurationManager.getApplicationConfiguration().isGoogleWalletEnabled() && useGoogleWallet)
        {
            connectToPlayServ();
        }
        handleUserFragment();
        showEasyOrderSection();
        addCreateProfileView();
        obj = emailOptInLayout;
        if (mProfileManager.getCurrentUser() == null)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((LinearLayout) (obj)).setVisibility(i);
    }

    public void onStop()
    {
        super.onStop();
    }

    public void onWalletConnected()
    {
    }

    public void onWalletFailure()
    {
        handleUnrecoverableGoogleWalletError();
    }

    protected void proceedWithOrder()
    {
        if (mProfileManager.isAuthorizedUser())
        {
            makePlaceOrderRequest();
            return;
        } else
        {
            refreshViewAsGuestUser();
            return;
        }
    }

    protected void restartActivity()
    {
        recreate();
    }

    public void setDeliveryInstructions(Boolean boolean1)
    {
    }

    protected void setEasyOrderCheckbox(boolean flag)
    {
        easyOrderCheckBox.setChecked(flag);
    }

    public void setSubheader(String s, String s1, Boolean boolean1)
    {
        s = (new StringBuilder()).append(s).append(" - ").toString();
        if (boolean1.booleanValue())
        {
            s = (new StringBuilder()).append(s).append(getString(0x7f080042)).toString();
        } else
        {
            s = (new StringBuilder()).append(s).append(getString(0x7f08003e)).toString();
        }
        s = (new StringBuilder()).append(s).append(getString(0x7f080043)).append(s1).append(getString(0x7f080045)).toString();
        checkoutFormAddress.setText(s);
    }

    protected void showAlertAndRePriceOrder(AlertType alerttype, final LabsOrder order)
    {
        mActivityHelper.showAlert(alerttype, new _cls11());
    }

    public void showDialog(String s)
    {
        showLoading();
    }

    public void showInvalidPriceToast()
    {
        showLongToast(getString(0x7f080179));
        finish();
    }

    public void showUserLoginDialog(LabsOrder labsorder)
    {
        if (logindialog != null)
        {
            logindialog.dismiss();
        }
        logindialog = LoginDialogFragment.newInstance(mProfileManager.getCurrentUser().getFirstName(), getString(0x7f08019e), true, false, new _cls10());
        logindialog.show(getSupportFragmentManager());
    }

    protected void showUserLoginDialogForEnrollment()
    {
        if (logindialog != null)
        {
            logindialog.dismiss();
        }
        logindialog = LoginDialogFragment.newInstance(null, null, false, false, new _cls14());
        logindialog.show(getSupportFragmentManager());
    }

    protected void startPizzaTrackerActivity(LabsOrder labsorder, PlaceOrderErrorCode placeordererrorcode)
    {
        mTrackerManager.clear();
        placeordererrorcode = new Intent(getBaseContext(), com/dominos/notification/TrackerService_);
        placeordererrorcode.putExtra("phone", labsorder.getPhone());
        placeordererrorcode.putExtra("extension", labsorder.getPhoneExtension());
        placeordererrorcode.putExtra("orderID", labsorder.getStoreOrderId());
        placeordererrorcode.putExtra("storeID", labsorder.getStoreId());
        placeordererrorcode.putExtra("storeProfile", mStoreManager.getStoreProfile());
        placeordererrorcode.putExtra("fromCheckout", true);
        placeordererrorcode.setAction("OrderPlaced");
        placeordererrorcode.putExtra("tracker-receiver", new NotificationReceiver());
        startService(placeordererrorcode);
        mTrackerManager.setOrder(labsorder);
        TrackerActivity_.intent(this).mOrderId(labsorder.getStoreOrderId()).mStoreProfile(mStoreManager.getStoreProfile()).mFromCheckout(true).start();
        finish();
    }

    public void updateGiftCardButton()
    {
        verifyGiftCards();
    }

    protected void updateLoyaltyViews()
    {
        addCreateProfileView();
        updateLoyaltyHeader();
    }

    protected void verifyGiftCards()
    {
        if (!checkIfGiftCardAmountToHigh())
        {
            checkForGiftCards();
        }
    }





/*
    static PaymentTag access$1102(LabsCheckoutActivity labscheckoutactivity, PaymentTag paymenttag)
    {
        labscheckoutactivity.paymentTag = paymenttag;
        return paymenttag;
    }

*/












    private class _cls1 extends com.dominos.android.sdk.core.order.OrderManager.PlaceOrderCallback
    {

        final LabsCheckoutActivity this$0;

        public void onBegin()
        {
            showLoading();
        }

        public void onFinish()
        {
            hideLoading();
        }

        public void onPlaceOrderFailure(LabsOrder labsorder, PlaceOrderErrorCode placeordererrorcode)
        {
            onOrderPlacementError(labsorder, placeordererrorcode);
        }

        public void onPlaceOrderRequestFailed()
        {
            onPlaceOrderRequestFail();
        }

        public void onPlaceOrderSuccess(LabsOrder labsorder)
        {
            onOrderSuccess(labsorder, PlaceOrderErrorCode.NO_FAILURE);
        }

        public void onPlaceOrderWarning(LabsOrder labsorder, PlaceOrderErrorCode placeordererrorcode)
        {
            onOrderSuccess(labsorder, placeordererrorcode);
        }

        _cls1()
        {
            this$0 = LabsCheckoutActivity.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final LabsCheckoutActivity this$0;
        final RadioButton val$rb;
        final LabsPayment val$token;

        public void onClick(View view)
        {
            mOrderManager.getOrder().setPaymentTag(PaymentTag.ANON);
            updateMethodOfPaymentSelection();
            rb.setChecked(true);
            addThisCardToOrder(token);
        }

        _cls4()
        {
            this$0 = LabsCheckoutActivity.this;
            rb = radiobutton;
            token = labspayment;
            super();
        }
    }


    private class _cls15 extends com.dominos.utils.ActivityHelper.AlertActionCallback
    {

        final LabsCheckoutActivity this$0;

        public void onAlertDismissed()
        {
            addGiftCard(null);
        }

        _cls15()
        {
            this$0 = LabsCheckoutActivity.this;
            super();
        }
    }


    private class EditCreditCardButtonListener
        implements android.view.View.OnClickListener
    {

        private RadioButton rb;
        final LabsCheckoutActivity this$0;

        public void onClick(View view)
        {
            updateMethodOfPaymentSelection();
            rb.performClick();
            onCreditCardEdit(view);
            rb.setChecked(true);
        }

        public EditCreditCardButtonListener(RadioButton radiobutton)
        {
            this$0 = LabsCheckoutActivity.this;
            super();
            rb = radiobutton;
        }
    }


    private class _cls8 extends PowerRestCallback
    {

        final LabsCheckoutActivity this$0;

        public void onError(Exception exception, String s)
        {
            if ((exception instanceof f) && ((f)exception).getStatusCode() == l.REQUEST_TIMEOUT)
            {
                Toast.makeText(App.getInstance(), 0x7f0801d2, 0).show();
            }
            class _cls2
                implements Runnable
            {

                final _cls8 this$1;

                public void run()
                {
                    hideLoading();
                }

                _cls2()
                {
                    this$1 = _cls8.this;
                    super();
                }
            }

            runOnUiThread(new _cls2());
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            class _cls1
                implements Runnable
            {

                final _cls8 this$1;

                public void run()
                {
                    hideLoading();
                    connectToPlayServ();
                }

                _cls1()
                {
                    this$1 = _cls8.this;
                    super();
                }
            }

            runOnUiThread(new _cls1());
            mStoreManager.setStoreProfile(StoreProfile.from(s));
        }

        _cls8()
        {
            this$0 = LabsCheckoutActivity.this;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final LabsCheckoutActivity this$0;
        final RadioButton val$cashButton;

        public void onClick(View view)
        {
            if (!cashLimitExceeded())
            {
                updateMethodOfPaymentSelection();
                cashButton.setChecked(true);
                showEasyOrderSection();
                mOrderManager.getOrder().setPaymentTag(PaymentTag.CASH);
                return;
            } else
            {
                cashButton.setChecked(false);
                cashLimitAlert(NumberUtil.formatPrice(Double.valueOf(mStoreManager.getStoreProfile().getCashLimit())));
                return;
            }
        }

        _cls5()
        {
            this$0 = LabsCheckoutActivity.this;
            cashButton = radiobutton;
            super();
        }
    }


    private class _cls6
        implements android.view.View.OnClickListener
    {

        final LabsCheckoutActivity this$0;

        public void onClick(View view)
        {
            LogUtil.d(LabsCheckoutActivity.TAG, "Clicked the change button", new Object[0]);
            if (mGoogleFullWalletFragment != null)
            {
                mGoogleFullWalletFragment.changeMaskedWallet();
            }
        }

        _cls6()
        {
            this$0 = LabsCheckoutActivity.this;
            super();
        }
    }


    private class _cls7
        implements android.view.View.OnClickListener
    {

        final LabsCheckoutActivity this$0;
        final RadioButton val$rb;

        public void onClick(View view)
        {
label0:
            {
                if (mWalletManager.isGoogleWalletAvailable(mStoreManager.getStoreProfile()) && maskedWallet != null)
                {
                    showEasyOrderSection();
                    updateMethodOfPaymentSelection();
                    if (!isGWBackingCardAcceptedByStore())
                    {
                        break label0;
                    }
                    rb.setChecked(true);
                    view = getLabsPaymentForMaskedWallet();
                    addThisCardToOrder(view);
                    mOrderManager.getOrder().setPaymentTag(PaymentTag.GOOGLE);
                    paymentTag = PaymentTag.GOOGLE;
                }
                return;
            }
            rb.setChecked(false);
            rb.setEnabled(false);
            mActivityHelper.showAlert(AlertType.WALLET_BACKING_NOT_ACCEPTED);
        }

        _cls7()
        {
            this$0 = LabsCheckoutActivity.this;
            rb = radiobutton;
            super();
        }
    }


    private class CreditCardRowClickListener
        implements android.view.View.OnClickListener
    {

        final LabsCheckoutActivity this$0;
        private final LabsPayment token;

        public void onClick(final View rb)
        {
            rb = (RadioButton)rb;
            rb.setTag(PaymentTag.CREDIT);
            rb.setChecked(false);
            mOrderManager.getOrder().setPaymentTag(PaymentTag.CREDIT);
            if (mProfileManager.getAuthorizationCode() == null && !mProfileManager.isOAuthTokenExist())
            {
                if (logindialog != null)
                {
                    logindialog.dismiss();
                }
                class _cls1
                    implements com.dominos.dialogs.LoginDialogFragment.OnActionListener
                {

                    final CreditCardRowClickListener this$1;
                    final RadioButton val$rb;

                    public void onCanceled()
                    {
                    }

                    public void onContinueAsGuest()
                    {
                        restartActivity();
                    }

                    public void onLoginSuccess()
                    {
                        class _cls1
                            implements Runnable
                        {

                            final _cls1 this$2;

                            public void run()
                            {
                                if (mProfileManager.isAuthorizedUser())
                                {
                                    showEasyOrderSection();
                                    updateMethodOfPaymentSelection();
                                    rb.setChecked(true);
                                    addThisCardToOrder(token);
                                }
                            }

                                _cls1()
                                {
                                    this$2 = _cls1.this;
                                    super();
                                }
                        }

                        runOnUiThread(new _cls1());
                    }

                    public void onSignOut()
                    {
                    }

                _cls1()
                {
                    this$1 = CreditCardRowClickListener.this;
                    rb = radiobutton;
                    super();
                }
                }

                logindialog = LoginDialogFragment.newInstance(null, null, false, true, new _cls1());
                logindialog.show(getSupportFragmentManager());
                return;
            } else
            {
                showEasyOrderSection();
                updateMethodOfPaymentSelection();
                rb.setChecked(true);
                addThisCardToOrder(token);
                return;
            }
        }


        private CreditCardRowClickListener(LabsPayment labspayment)
        {
            this$0 = LabsCheckoutActivity.this;
            super();
            token = labspayment;
        }

        CreditCardRowClickListener(LabsPayment labspayment, _cls1 _pcls1)
        {
            this(labspayment);
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final LabsCheckoutActivity this$0;
        final LabsPayment val$token;

        public void onClick(View view)
        {
            if (mProfileManager.getAuthorizationCode() == null)
            {
                class _cls1
                    implements com.dominos.dialogs.LoginDialogFragment.OnActionListener
                {

                    final _cls3 this$1;

                    public void onCanceled()
                    {
                    }

                    public void onContinueAsGuest()
                    {
                        restartActivity();
                    }

                    public void onLoginSuccess()
                    {
                        goToEditCreditCard(token);
                    }

                    public void onSignOut()
                    {
                    }

                _cls1()
                {
                    this$1 = _cls3.this;
                    super();
                }
                }

                logindialog = LoginDialogFragment.newInstance(null, null, false, true, new _cls1());
                logindialog.show(getSupportFragmentManager());
                return;
            } else
            {
                goToEditCreditCard(token);
                return;
            }
        }

        _cls3()
        {
            this$0 = LabsCheckoutActivity.this;
            token = labspayment;
            super();
        }
    }


    private class _cls2
        implements com.dominos.dialogs.LoginDialogFragment.OnActionListener
    {

        final LabsCheckoutActivity this$0;

        public void onCanceled()
        {
        }

        public void onContinueAsGuest()
        {
        }

        public void onLoginSuccess()
        {
            setEasyOrderCheckbox(true);
        }

        public void onSignOut()
        {
        }

        _cls2()
        {
            this$0 = LabsCheckoutActivity.this;
            super();
        }
    }


    private class _cls13 extends com.dominos.android.sdk.core.user.UserProfileManager.UpdateCustomerWithLoyaltyCallback
    {

        final LabsCheckoutActivity this$0;

        public void onAuthorizationRequired()
        {
            showUserLoginDialogForEnrollment();
        }

        public void onBegin()
        {
            super.onBegin();
            showLoading();
        }

        public void onCustomerUpdateError()
        {
            mActivityHelper.showAlert(AlertType.LOYALTY_PROFILED_USER_ACTIVATE_ERROR);
        }

        public void onCustomerUpdated()
        {
            updateLoyaltyViews();
            mAnalyticsUtil.postLoyaltyEnrolledEvent();
        }

        public void onFinish()
        {
            super.onFinish();
            hideLoading();
        }

        public void onLoyaltyEnrollFail()
        {
            mActivityHelper.showAlert(AlertType.LOYALTY_PROFILED_USER_ACTIVATE_ERROR);
        }

        _cls13()
        {
            this$0 = LabsCheckoutActivity.this;
            super();
        }
    }


    private class _cls9 extends com.dominos.android.sdk.core.loyalty.LoyaltyManager.LoyaltyCallback
    {

        final LabsCheckoutActivity this$0;
        final PlaceOrderErrorCode val$errorCode;
        final LabsOrder val$order;

        public void onBegin()
        {
            super.onBegin();
            showLoading();
        }

        public void onFinish()
        {
            super.onFinish();
            hideLoading();
            startPizzaTrackerActivity(order, errorCode);
        }

        public void onLoyaltyFail()
        {
        }

        public void onLoyaltySuccess()
        {
        }

        _cls9()
        {
            this$0 = LabsCheckoutActivity.this;
            order = labsorder;
            errorCode = placeordererrorcode;
            super();
        }
    }


    private class _cls17
    {

        static final int $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode = new int[PlaceOrderErrorCode.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.UNAUTHORIZED.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror14) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.CUSTOMER_PROFILE_ORDER_MISMATCH_ADDRESS_OR_PAYMENT.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror13) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.CASH_LIMIT_EXCEEDED.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror12) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.BELOW_MINIMUM_DELIVER_AMOUNT.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.POS_MINIMUM_DELIVERY_AMOUNT.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.STORE_CLOSED.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.STORE_CLOSED_FOR_DELIVERY.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.STORE_NOT_ALLOWED_FOR_DELIVERY.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.STORE_CLOSED_FOR_CARRYOUT.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.STORE_NOT_ALLOWED_FOR_CARRYOUT.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.GENERIC_PULSE_ERROR.ordinal()] = 11;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.GENERIC_CREDIT_CARD_ERROR.ordinal()] = 12;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.UNABLE_TO_PROCESS_LOYALTY.ordinal()] = 13;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.UNABLE_TO_REDEEM.ordinal()] = 14;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.UNABLE_TO_PROCESS_LOYALTY_AT_THIS_TIME.ordinal()] = 15;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls12 extends com.dominos.utils.ActivityHelper.OptionAlertActionCallback
    {

        final LabsCheckoutActivity this$0;

        public void onNegativeButtonClicked()
        {
        }

        public void onNeutralButtonClicked()
        {
            onPlaceOrderClick();
        }

        public void onPositiveButtonClicked()
        {
            callStore();
        }

        _cls12()
        {
            this$0 = LabsCheckoutActivity.this;
            super();
        }
    }


    private class _cls16 extends com.dominos.utils.ActivityHelper.AlertActionCallback
    {

        final LabsCheckoutActivity this$0;

        public void onAlertDismissed()
        {
            getFormFragment().clearFields();
            restartActivity();
        }

        _cls16()
        {
            this$0 = LabsCheckoutActivity.this;
            super();
        }
    }


    private class _cls11 extends com.dominos.utils.ActivityHelper.AlertActionCallback
    {

        final LabsCheckoutActivity this$0;
        final LabsOrder val$order;

        public void onAlertDismissed()
        {
            class _cls1 extends com.dominos.android.sdk.core.order.OrderManager.PriceOrderCallback
            {

                final _cls11 this$1;

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

                public void onPriceOrderRequestFailed()
                {
                    onPlaceOrderRequestFail();
                }

                public void onPriceSuccess(LabsOrder labsorder)
                {
                    initCheckout();
                    displayMethodsOfPayment();
                }

                public void onPricingFailure(LabsOrder labsorder)
                {
                    onPlaceOrderRequestFail();
                }

                public void onPricingWarning(LabsOrder labsorder, PriceOrderErrorCode priceordererrorcode)
                {
                    onPriceSuccess(labsorder);
                }

                _cls1()
                {
                    this$1 = _cls11.this;
                    super();
                }
            }

            mOrderManager.priceOrder(order, new _cls1());
        }

        _cls11()
        {
            this$0 = LabsCheckoutActivity.this;
            order = labsorder;
            super();
        }
    }


    private class _cls10
        implements com.dominos.dialogs.LoginDialogFragment.OnActionListener
    {

        final LabsCheckoutActivity this$0;

        public void onCanceled()
        {
            logindialog.dismiss();
            updateMethodOfPaymentSelection();
        }

        public void onContinueAsGuest()
        {
        }

        public void onLoginSuccess()
        {
            proceedWithOrder();
        }

        public void onSignOut()
        {
            restartActivity();
        }

        _cls10()
        {
            this$0 = LabsCheckoutActivity.this;
            super();
        }
    }


    private class _cls14
        implements com.dominos.dialogs.LoginDialogFragment.OnActionListener
    {

        final LabsCheckoutActivity this$0;

        public void onCanceled()
        {
        }

        public void onContinueAsGuest()
        {
        }

        public void onLoginSuccess()
        {
            enrollCustomer();
        }

        public void onSignOut()
        {
        }

        _cls14()
        {
            this$0 = LabsCheckoutActivity.this;
            super();
        }
    }

}
