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
import com.braintreepayments.api.models.AndroidPayCard;
import com.braintreepayments.api.models.Card;
import com.braintreepayments.api.models.PayPalAccount;
import com.braintreepayments.api.models.PaymentMethod;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.braintreepayments.api.dropin:
//            AddPaymentMethodViewController, BraintreeViewController, SelectPaymentMethodViewController, Customization

public class BraintreePaymentActivity extends Activity
    implements com.braintreepayments.api.Braintree.BraintreeSetupFinishedListener, com.braintreepayments.api.Braintree.ErrorListener, com.braintreepayments.api.Braintree.PaymentMethodCreatedListener, com.braintreepayments.api.Braintree.PaymentMethodsUpdatedListener
{

    private Braintree a;
    private AddPaymentMethodViewController b;
    private SelectPaymentMethodViewController c;
    private AtomicBoolean d;
    private Bundle e;
    private Customization f;

    public BraintreePaymentActivity()
    {
        d = new AtomicBoolean(false);
    }

    static View a(BraintreePaymentActivity braintreepaymentactivity, int i)
    {
        return braintreepaymentactivity.findViewById(i);
    }

    static AtomicBoolean a(BraintreePaymentActivity braintreepaymentactivity)
    {
        return braintreepaymentactivity.d;
    }

    private void a(View view)
    {
        if (b == null)
        {
            b = new AddPaymentMethodViewController(this, e, view, a, f);
        }
    }

    private static void a(BraintreeViewController braintreeviewcontroller, Bundle bundle)
    {
        if (braintreeviewcontroller != null)
        {
            braintreeviewcontroller.a(bundle);
        }
    }

    private void a(boolean flag)
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

    private void c()
    {
        a.a();
        a.a("sdk.initialized");
        a.a(this);
        a.j();
        if (a.h())
        {
            if (e.getBoolean("com.braintreepayments.api.dropin.PAYMENT_METHOD_ADD_FORM"))
            {
                a();
                return;
            } else
            {
                onPaymentMethodsUpdated(a.i());
                return;
            }
        } else
        {
            a.g();
            Executors.newScheduledThreadPool(1).schedule(new _cls2(), 10L, TimeUnit.SECONDS);
            b();
            return;
        }
    }

    private void d()
    {
        b.b();
        e();
        c.b(0);
    }

    private void e()
    {
        View view = StubbedView.b.b(this);
        if (c == null)
        {
            c = new SelectPaymentMethodViewController(this, e, view, a, f);
        } else
        {
            c.a();
        }
        a(false);
    }

    private String f()
    {
        String s1 = getIntent().getStringExtra("com.braintreepayments.api.dropin.EXTRA_CLIENT_TOKEN");
        String s = s1;
        if (s1 == null)
        {
            String s2 = e.getString("com.braintreepayments.api.dropin.EXTRA_CLIENT_TOKEN");
            s = s2;
            if (s2 == null)
            {
                throw new IllegalArgumentException((new StringBuilder("A client token must be specified with ")).append(com/braintreepayments/api/dropin/BraintreePaymentActivity.getSimpleName()).append(".EXTRA_CLIENT_TOKEN extra").toString());
            }
        }
        return s;
    }

    protected final void a()
    {
        a.a("add-card.start");
        a(StubbedView.c.b(this));
        if (a.i().size() > 0)
        {
            a(true);
        }
    }

    protected final void a(PaymentMethod paymentmethod)
    {
        a.a("sdk.exit.success");
        Intent intent = new Intent();
        intent.putExtra("com.braintreepayments.api.dropin.EXTRA_PAYMENT_METHOD", paymentmethod);
        intent.putExtra("com.braintreepayments.api.dropin.EXTRA_PAYMENT_METHOD_NONCE", paymentmethod.c());
        setResult(-1, intent);
        finish();
    }

    protected final void b()
    {
        StubbedView.a.b(this);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (j == -1)
        {
            if (i == 11876)
            {
                a(StubbedView.c.a(this));
                b();
                b.a(i, j, intent);
            }
        } else
        {
            if (j == 0)
            {
                a.a("add-paypal.user-canceled");
            }
            if (i == 11876)
            {
                a();
                return;
            }
        }
    }

    public void onBackPressed()
    {
        if (StubbedView.a(StubbedView.c) && a.i().size() > 0)
        {
            e();
        } else
        if (b == null || !b.a())
        {
            if (a != null)
            {
                a.a("sdk.exit.user-canceled");
            }
            setResult(0);
            finish();
            return;
        }
    }

    public void onBraintreeSetupFinished(boolean flag, Braintree braintree, String s, Exception exception)
    {
        if (!flag)
        {
            setResult(3, (new Intent()).putExtra("com.braintreepayments.api.dropin.EXTRA_ERROR_MESSAGE", exception));
            finish();
            return;
        } else
        {
            a = braintree;
            c();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.bt_drop_in_ui);
        Customization customization;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        e = bundle;
        customization = (Customization)getIntent().getSerializableExtra("com.braintreepayments.api.dropin.EXTRA_CUSTOMIZATION");
        bundle = customization;
        if (customization == null)
        {
            bundle = (new Customization.CustomizationBuilder()).a();
        }
        f = bundle;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            bundle = getActionBar();
            if (bundle != null)
            {
                if (TextUtils.isEmpty(f.a()))
                {
                    bundle.setTitle(getString(R.string.bt_default_action_bar_text));
                } else
                {
                    bundle.setTitle(f.a());
                }
                if (android.os.Build.VERSION.SDK_INT >= 14)
                {
                    if (f.b() == 0)
                    {
                        bundle.setLogo(new ColorDrawable(getResources().getColor(0x106000d)));
                    } else
                    {
                        bundle.setLogo(f.b());
                    }
                }
            }
        }
        a = Braintree.a(this, e);
        if (a != null)
        {
            c();
            return;
        } else
        {
            Braintree.a(this, f(), this);
            b();
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
        if (a != null)
        {
            a.b(this);
        }
    }

    public void onPaymentMethodCreated(PaymentMethod paymentmethod)
    {
        if (!(paymentmethod instanceof Card)) goto _L2; else goto _L1
_L1:
        if (paymentmethod.d() == null || !paymentmethod.d().equals("venmo-app")) goto _L4; else goto _L3
_L3:
        d();
_L6:
        return;
_L4:
        a.a("add-card.success");
        b.c();
        Executors.newScheduledThreadPool(1).schedule(new _cls1(paymentmethod), 1L, TimeUnit.SECONDS);
        return;
_L2:
        if (paymentmethod instanceof PayPalAccount)
        {
            a.a("add-paypal.success");
            d();
            return;
        }
        if (paymentmethod instanceof AndroidPayCard)
        {
            a.a("add-android-pay.success");
            d();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onPaymentMethodsUpdated(List list)
    {
        d.set(true);
        if (list.size() == 0)
        {
            a();
            return;
        } else
        {
            e();
            return;
        }
    }

    public void onRecoverableError(ErrorWithResponse errorwithresponse)
    {
        b.a(errorwithresponse);
    }

    protected void onResume()
    {
        super.onResume();
        if (a != null)
        {
            a.a(this);
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("com.braintreepayments.api.dropin.EXTRA_CLIENT_TOKEN", f());
        if (StubbedView.a(StubbedView.c))
        {
            bundle.putBoolean("com.braintreepayments.api.dropin.PAYMENT_METHOD_ADD_FORM", true);
        }
        a(b, bundle);
        a(c, bundle);
        if (a != null)
        {
            a.a(bundle);
        }
    }

    public void onUnrecoverableError(Throwable throwable)
    {
        if (StubbedView.a(StubbedView.a) && !d.get())
        {
            d.set(true);
            a();
            return;
        }
        if (!(throwable instanceof AuthenticationException) && !(throwable instanceof AuthorizationException) && !(throwable instanceof UpgradeRequiredException) && !(throwable instanceof ConfigurationException)) goto _L2; else goto _L1
_L1:
        a.a("sdk.exit.developer-error");
        setResult(2, (new Intent()).putExtra("com.braintreepayments.api.dropin.EXTRA_ERROR_MESSAGE", throwable));
_L4:
        finish();
        return;
_L2:
        if ((throwable instanceof ServerException) || (throwable instanceof UnexpectedException))
        {
            a.a("sdk.exit.server-error");
            setResult(3, (new Intent()).putExtra("com.braintreepayments.api.dropin.EXTRA_ERROR_MESSAGE", throwable));
        } else
        if (throwable instanceof DownForMaintenanceException)
        {
            a.a("sdk.exit.server-unavailable");
            setResult(4, (new Intent()).putExtra("com.braintreepayments.api.dropin.EXTRA_ERROR_MESSAGE", throwable));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private class _cls2
        implements Runnable
    {

        final BraintreePaymentActivity a;

        public void run()
        {
        /* block-local class not found */
        class _cls1 {}

            if (!BraintreePaymentActivity.a(a).get())
            {
                a.runOnUiThread(new _cls1());
            }
        }

        _cls2()
        {
            a = BraintreePaymentActivity.this;
            super();
        }
    }


    private class StubbedView extends Enum
    {

        public static final StubbedView a;
        public static final StubbedView b;
        public static final StubbedView c;
        private static int g;
        private static final StubbedView h[];
        private final int d;
        private final int e;
        private boolean f;

        static boolean a(StubbedView stubbedview)
        {
            return stubbedview.f;
        }

        public static StubbedView valueOf(String s)
        {
            return (StubbedView)Enum.valueOf(com/braintreepayments/api/dropin/BraintreePaymentActivity$StubbedView, s);
        }

        public static StubbedView[] values()
        {
            return (StubbedView[])h.clone();
        }

        final View a(BraintreePaymentActivity braintreepaymentactivity)
        {
            ViewStub viewstub = (ViewStub)BraintreePaymentActivity.a(braintreepaymentactivity, d);
            if (viewstub != null)
            {
                return viewstub.inflate();
            } else
            {
                return BraintreePaymentActivity.a(braintreepaymentactivity, e);
            }
        }

        final View b(BraintreePaymentActivity braintreepaymentactivity)
        {
            StubbedView astubbedview[] = values();
            int j = astubbedview.length;
            for (int i = 0; i < j; i++)
            {
                StubbedView stubbedview = astubbedview[i];
                if (this == stubbedview)
                {
                    continue;
                }
                if ((ViewStub)BraintreePaymentActivity.a(braintreepaymentactivity, stubbedview.d) == null)
                {
                    BraintreePaymentActivity.a(braintreepaymentactivity, stubbedview.e).setVisibility(8);
                }
                stubbedview.f = false;
            }

            View view = a(braintreepaymentactivity);
            if (android.os.Build.VERSION.SDK_INT >= 12)
            {
                view.setAlpha(0.0F);
                view.setVisibility(0);
                ViewPropertyAnimator viewpropertyanimator = view.animate().alpha(1.0F);
                if (g == 0)
                {
                    g = braintreepaymentactivity.getResources().getInteger(0x10e0000);
                }
                viewpropertyanimator.setDuration(g);
            } else
            {
                view.setVisibility(0);
            }
            f = true;
            return view;
        }

        static 
        {
            a = new StubbedView("LOADING_VIEW", 0, R.id.bt_stub_loading_view, R.id.bt_inflated_loading_view);
            b = new StubbedView("SELECT_VIEW", 1, R.id.bt_stub_payment_methods_list, R.id.bt_inflated_payment_methods_list);
            c = new StubbedView("CARD_FORM", 2, R.id.bt_stub_payment_method_form, R.id.bt_inflated_payment_method_form);
            h = (new StubbedView[] {
                a, b, c
            });
        }

        private StubbedView(String s, int i, int j, int k)
        {
            super(s, i);
            d = j;
            e = k;
            f = false;
        }
    }


    private class _cls1
        implements Runnable
    {

        final PaymentMethod a;
        final BraintreePaymentActivity b;

        public void run()
        {
        /* block-local class not found */
        class _cls1 {}

            b.runOnUiThread(new _cls1());
        }

        _cls1(PaymentMethod paymentmethod)
        {
            b = BraintreePaymentActivity.this;
            a = paymentmethod;
            super();
        }
    }

}
