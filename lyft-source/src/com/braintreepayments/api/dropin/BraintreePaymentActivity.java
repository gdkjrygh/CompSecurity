// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import com.braintreepayments.api.Braintree;
import com.braintreepayments.api.exceptions.AuthenticationException;
import com.braintreepayments.api.exceptions.AuthorizationException;
import com.braintreepayments.api.exceptions.ConfigurationException;
import com.braintreepayments.api.exceptions.DownForMaintenanceException;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.exceptions.ServerException;
import com.braintreepayments.api.exceptions.UnexpectedException;
import com.braintreepayments.api.exceptions.UpgradeRequiredException;
import com.braintreepayments.api.models.Card;
import com.braintreepayments.api.models.PayPalAccount;
import com.braintreepayments.api.models.PaymentMethod;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.braintreepayments.api.dropin:
//            Customization, AddPaymentMethodViewController, SelectPaymentMethodViewController, BraintreeViewController

public class BraintreePaymentActivity extends Activity
    implements com.braintreepayments.api.Braintree.ErrorListener, com.braintreepayments.api.Braintree.PaymentMethodCreatedListener, com.braintreepayments.api.Braintree.PaymentMethodsUpdatedListener
{

    public static final int BRAINTREE_RESULT_DEVELOPER_ERROR = 2;
    public static final int BRAINTREE_RESULT_SERVER_ERROR = 3;
    public static final int BRAINTREE_RESULT_SERVER_UNAVAILABLE = 4;
    public static final String EXTRA_CLIENT_TOKEN = "com.braintreepayments.api.dropin.EXTRA_CLIENT_TOKEN";
    public static final String EXTRA_CUSTOMIZATION = "com.braintreepayments.api.dropin.EXTRA_CUSTOMIZATION";
    public static final String EXTRA_ERROR_MESSAGE = "com.braintreepayments.api.dropin.EXTRA_ERROR_MESSAGE";
    public static final String EXTRA_PAYMENT_METHOD = "com.braintreepayments.api.dropin.EXTRA_PAYMENT_METHOD";
    public static final String EXTRA_PAYMENT_METHOD_NONCE = "com.braintreepayments.api.dropin.EXTRA_PAYMENT_METHOD_NONCE";
    private static final String ON_PAYMENT_METHOD_ADD_FORM_KEY = "com.braintreepayments.api.dropin.PAYMENT_METHOD_ADD_FORM";
    private AddPaymentMethodViewController mAddPaymentMethodViewController;
    private Braintree mBraintree;
    private Customization mCustomization;
    private AtomicBoolean mHasDataBeenReceived;
    private Bundle mSavedInstanceState;
    private SelectPaymentMethodViewController mSelectPaymentMethodViewController;
    private boolean mUnableToGetPaymentMethods;

    public BraintreePaymentActivity()
    {
        mHasDataBeenReceived = new AtomicBoolean(false);
        mUnableToGetPaymentMethods = false;
    }

    private void customizeActionBar()
    {
        ActionBar actionbar;
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                actionbar = getActionBar();
                if (actionbar != null)
                {
                    if (TextUtils.isEmpty(mCustomization.getActionBarTitle()))
                    {
                        actionbar.setTitle(getString(R.string.bt_default_action_bar_text));
                    } else
                    {
                        actionbar.setTitle(mCustomization.getActionBarTitle());
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 14)
                    {
                        if (mCustomization.getActionBarLogo() != 0)
                        {
                            break label0;
                        }
                        actionbar.setLogo(new ColorDrawable(getResources().getColor(0x106000d)));
                    }
                }
            }
            return;
        }
        actionbar.setLogo(mCustomization.getActionBarLogo());
    }

    private View findView(int i)
    {
        return findViewById(i);
    }

    private void finishCreate()
    {
        mAddPaymentMethodViewController.endSubmit();
        initSelectPaymentMethodView();
    }

    private String getClientToken()
    {
        String s1 = getIntent().getStringExtra("com.braintreepayments.api.dropin.EXTRA_CLIENT_TOKEN");
        String s = s1;
        if (s1 == null)
        {
            String s2 = mSavedInstanceState.getString("com.braintreepayments.api.dropin.EXTRA_CLIENT_TOKEN");
            s = s2;
            if (s2 == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("A client token must be specified with ").append(com/braintreepayments/api/dropin/BraintreePaymentActivity.getSimpleName()).append(".EXTRA_CLIENT_TOKEN extra").toString());
            }
        }
        return s;
    }

    private Customization getCustomization()
    {
        Customization customization1 = (Customization)getIntent().getSerializableExtra("com.braintreepayments.api.dropin.EXTRA_CUSTOMIZATION");
        Customization customization = customization1;
        if (customization1 == null)
        {
            customization = (new Customization.CustomizationBuilder()).build();
        }
        return customization;
    }

    private void initSelectPaymentMethodView()
    {
        View view = StubbedView.SELECT_VIEW.show(this);
        if (mSelectPaymentMethodViewController == null)
        {
            mSelectPaymentMethodViewController = new SelectPaymentMethodViewController(this, mSavedInstanceState, view, mBraintree, mCustomization);
        }
        setActionBarUpEnabled(false);
    }

    private void saveState(BraintreeViewController braintreeviewcontroller, Bundle bundle)
    {
        if (braintreeviewcontroller != null)
        {
            braintreeviewcontroller.onSaveInstanceState(bundle);
        }
    }

    private void setActionBarUpEnabled(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            ActionBar actionbar = getActionBar();
            if (actionbar != null)
            {
                actionbar.setDisplayHomeAsUpEnabled(flag);
            }
        }
    }

    private void waitForData()
    {
        Executors.newScheduledThreadPool(1).schedule(new Runnable() {

            final BraintreePaymentActivity this$0;

            public void run()
            {
                if (!mHasDataBeenReceived.get())
                {
                    runOnUiThread(new Runnable() {

                        final _cls2 this$1;

                        public void run()
                        {
                            mUnableToGetPaymentMethods = true;
                            initAddPaymentMethodView();
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    });
                }
            }

            
            {
                this$0 = BraintreePaymentActivity.this;
                super();
            }
        }, 10L, TimeUnit.SECONDS);
        StubbedView.LOADING_VIEW.show(this);
    }

    protected void finalizeSelection(PaymentMethod paymentmethod)
    {
        mBraintree.sendAnalyticsEvent("sdk.exit.success");
        Intent intent = new Intent();
        intent.putExtra("com.braintreepayments.api.dropin.EXTRA_PAYMENT_METHOD", paymentmethod);
        intent.putExtra("com.braintreepayments.api.dropin.EXTRA_PAYMENT_METHOD_NONCE", paymentmethod.getNonce());
        setResult(-1, intent);
        finish();
    }

    protected void initAddPaymentMethodView()
    {
        mBraintree.sendAnalyticsEvent("add-card.start");
        View view = StubbedView.CARD_FORM.show(this);
        if (mAddPaymentMethodViewController == null)
        {
            mAddPaymentMethodViewController = new AddPaymentMethodViewController(this, mSavedInstanceState, view, mBraintree, mCustomization);
        }
        if (mBraintree.getCachedPaymentMethods().size() > 0)
        {
            setActionBarUpEnabled(true);
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (j == -1)
        {
            if (i == 11876)
            {
                StubbedView.LOADING_VIEW.show(this);
                mAddPaymentMethodViewController.onPaymentResult(i, j, intent);
            }
        } else
        if (j == 0)
        {
            mBraintree.sendAnalyticsEvent("add-paypal.user-canceled");
            return;
        }
    }

    public void onBackPressed()
    {
        if (StubbedView.CARD_FORM.mCurrentView && mBraintree.getCachedPaymentMethods().size() > 0)
        {
            initSelectPaymentMethodView();
        } else
        if (mAddPaymentMethodViewController == null || !mAddPaymentMethodViewController.isSubmitting())
        {
            mBraintree.sendAnalyticsEvent("sdk.exit.user-canceled");
            setResult(0);
            finish();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        mSavedInstanceState = bundle;
        setContentView(R.layout.bt_drop_in_ui);
        mCustomization = getCustomization();
        customizeActionBar();
        mBraintree = Braintree.getInstance(this, getClientToken());
        mBraintree.setIntegrationDropin();
        mBraintree.sendAnalyticsEvent("sdk.initialized");
        if (mBraintree.hasCachedCards())
        {
            if (mSavedInstanceState.getBoolean("com.braintreepayments.api.dropin.PAYMENT_METHOD_ADD_FORM"))
            {
                initAddPaymentMethodView();
                return;
            } else
            {
                onPaymentMethodsUpdated(mBraintree.getCachedPaymentMethods());
                return;
            }
        } else
        {
            mBraintree.getPaymentMethods();
            waitForData();
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            onBackPressed();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPause()
    {
        super.onPause();
        mBraintree.lockListeners();
        mBraintree.removeListener(this);
    }

    public void onPaymentMethodCreated(final PaymentMethod paymentMethod)
    {
        if (!(paymentMethod instanceof Card)) goto _L2; else goto _L1
_L1:
        if (paymentMethod.getSource() == null || !paymentMethod.getSource().equals("venmo-app")) goto _L4; else goto _L3
_L3:
        finishCreate();
_L6:
        return;
_L4:
        mBraintree.sendAnalyticsEvent("add-card.success");
        mAddPaymentMethodViewController.showSuccess();
        Executors.newScheduledThreadPool(1).schedule(new Runnable() {

            final BraintreePaymentActivity this$0;
            final PaymentMethod val$paymentMethod;

            public void run()
            {
                runOnUiThread(new Runnable() {

                    final _cls1 this$1;

                    public void run()
                    {
                        finalizeSelection(paymentMethod);
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
            }

            
            {
                this$0 = BraintreePaymentActivity.this;
                paymentMethod = paymentmethod;
                super();
            }
        }, 1L, TimeUnit.SECONDS);
        return;
_L2:
        if (paymentMethod instanceof PayPalAccount)
        {
            mBraintree.sendAnalyticsEvent("add-paypal.success");
            finishCreate();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onPaymentMethodsUpdated(List list)
    {
label0:
        {
            if (!mUnableToGetPaymentMethods)
            {
                mHasDataBeenReceived.set(true);
                if (list.size() != 0)
                {
                    break label0;
                }
                initAddPaymentMethodView();
            }
            return;
        }
        initSelectPaymentMethodView();
    }

    public void onRecoverableError(ErrorWithResponse errorwithresponse)
    {
        mAddPaymentMethodViewController.setErrors(errorwithresponse);
    }

    protected void onResume()
    {
        super.onResume();
        mBraintree.addListener(this);
        mBraintree.unlockListeners();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("com.braintreepayments.api.dropin.EXTRA_CLIENT_TOKEN", getClientToken());
        if (StubbedView.CARD_FORM.mCurrentView)
        {
            bundle.putBoolean("com.braintreepayments.api.dropin.PAYMENT_METHOD_ADD_FORM", true);
        }
        saveState(mAddPaymentMethodViewController, bundle);
        saveState(mSelectPaymentMethodViewController, bundle);
    }

    public void onUnrecoverableError(Throwable throwable)
    {
        if (StubbedView.LOADING_VIEW.mCurrentView)
        {
            mHasDataBeenReceived.set(true);
            initAddPaymentMethodView();
            return;
        }
        if (!(throwable instanceof AuthenticationException) && !(throwable instanceof AuthorizationException) && !(throwable instanceof UpgradeRequiredException) && !(throwable instanceof ConfigurationException)) goto _L2; else goto _L1
_L1:
        mBraintree.sendAnalyticsEvent("sdk.exit.developer-error");
        setResult(2, (new Intent()).putExtra("com.braintreepayments.api.dropin.EXTRA_ERROR_MESSAGE", throwable));
_L4:
        finish();
        return;
_L2:
        if ((throwable instanceof ServerException) || (throwable instanceof UnexpectedException))
        {
            mBraintree.sendAnalyticsEvent("sdk.exit.server-error");
            setResult(3, (new Intent()).putExtra("com.braintreepayments.api.dropin.EXTRA_ERROR_MESSAGE", throwable));
        } else
        if (throwable instanceof DownForMaintenanceException)
        {
            mBraintree.sendAnalyticsEvent("sdk.exit.server-unavailable");
            setResult(4, (new Intent()).putExtra("com.braintreepayments.api.dropin.EXTRA_ERROR_MESSAGE", throwable));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }



/*
    static boolean access$202(BraintreePaymentActivity braintreepaymentactivity, boolean flag)
    {
        braintreepaymentactivity.mUnableToGetPaymentMethods = flag;
        return flag;
    }

*/


    private class StubbedView extends Enum
    {

        private static final StubbedView $VALUES[];
        public static final StubbedView CARD_FORM;
        public static final StubbedView LOADING_VIEW;
        public static final StubbedView SELECT_VIEW;
        private static int mAnimationDuration;
        private boolean mCurrentView;
        private final int mInflatedViewId;
        private final int mStubbedViewId;

        private long getDuration(Context context)
        {
            if (mAnimationDuration == 0)
            {
                mAnimationDuration = context.getResources().getInteger(0x10e0000);
            }
            return (long)mAnimationDuration;
        }

        public static StubbedView valueOf(String s)
        {
            return (StubbedView)Enum.valueOf(com/braintreepayments/api/dropin/BraintreePaymentActivity$StubbedView, s);
        }

        public static StubbedView[] values()
        {
            return (StubbedView[])$VALUES.clone();
        }

        void hide(BraintreePaymentActivity braintreepaymentactivity)
        {
            if ((ViewStub)braintreepaymentactivity.findView(mStubbedViewId) == null)
            {
                braintreepaymentactivity.findView(mInflatedViewId).setVisibility(8);
            }
            mCurrentView = false;
        }

        View show(BraintreePaymentActivity braintreepaymentactivity)
        {
            StubbedView astubbedview[] = values();
            int j = astubbedview.length;
            for (int i = 0; i < j; i++)
            {
                StubbedView stubbedview = astubbedview[i];
                if (this != stubbedview)
                {
                    stubbedview.hide(braintreepaymentactivity);
                }
            }

            Object obj = (ViewStub)braintreepaymentactivity.findView(mStubbedViewId);
            if (obj != null)
            {
                obj = ((ViewStub) (obj)).inflate();
            } else
            {
                obj = braintreepaymentactivity.findView(mInflatedViewId);
            }
            if (android.os.Build.VERSION.SDK_INT >= 12)
            {
                ((View) (obj)).setAlpha(0.0F);
                ((View) (obj)).setVisibility(0);
                ((View) (obj)).animate().alpha(1.0F).setDuration(getDuration(braintreepaymentactivity));
            } else
            {
                ((View) (obj)).setVisibility(0);
            }
            mCurrentView = true;
            return ((View) (obj));
        }

        static 
        {
            LOADING_VIEW = new StubbedView("LOADING_VIEW", 0, R.id.bt_stub_loading_view, R.id.bt_inflated_loading_view);
            SELECT_VIEW = new StubbedView("SELECT_VIEW", 1, R.id.bt_stub_payment_methods_list, R.id.bt_inflated_payment_methods_list);
            CARD_FORM = new StubbedView("CARD_FORM", 2, R.id.bt_stub_payment_method_form, R.id.bt_inflated_payment_method_form);
            $VALUES = (new StubbedView[] {
                LOADING_VIEW, SELECT_VIEW, CARD_FORM
            });
        }


        private StubbedView(String s, int i, int j, int k)
        {
            super(s, i);
            mStubbedViewId = j;
            mInflatedViewId = k;
            mCurrentView = false;
        }
    }

}
