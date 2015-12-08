// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.paypal.android.sdk.bF;
import com.paypal.android.sdk.bI;
import com.paypal.android.sdk.dd;
import com.paypal.android.sdk.dz;
import com.paypal.android.sdk.ea;
import com.paypal.android.sdk.ed;
import com.paypal.android.sdk.ej;
import com.paypal.android.sdk.ek;
import com.paypal.android.sdk.em;
import com.paypal.android.sdk.eo;
import com.paypal.android.sdk.ev;
import com.paypal.android.sdk.fa;
import com.paypal.android.sdk.g;
import com.paypal.android.sdk.gd;
import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;
import io.card.payment.b;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Timer;

// Referenced classes of package com.paypal.android.sdk.payments:
//            dc, PayPalService, cu, PaymentConfirmActivity, 
//            ds, aw, PayPalPayment, PayPalConfiguration, 
//            de, di, bq, PaymentConfirmation, 
//            cw, cx, cy, cz, 
//            da, db

public final class PaymentMethodActivity extends Activity
{

    private static final String a = com/paypal/android/sdk/payments/PaymentMethodActivity.getSimpleName();
    private Timer b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private ev g;
    private aw h;
    private PayPalService i;
    private final ServiceConnection j = new dc(this);
    private boolean k;

    public PaymentMethodActivity()
    {
    }

    static PayPalService a(PaymentMethodActivity paymentmethodactivity, PayPalService paypalservice)
    {
        paymentmethodactivity.i = paypalservice;
        return paypalservice;
    }

    static String a()
    {
        return a;
    }

    static void a(Activity activity, int l, PayPalConfiguration paypalconfiguration)
    {
        Intent intent = new Intent(activity, com/paypal/android/sdk/payments/PaymentMethodActivity);
        intent.putExtras(activity.getIntent());
        intent.putExtra("com.paypal.android.sdk.paypalConfiguration", paypalconfiguration);
        activity.startActivityForResult(intent, 1);
    }

    static void a(PaymentMethodActivity paymentmethodactivity)
    {
        paymentmethodactivity.i.a(ej.e);
        PaymentConfirmActivity.a(paymentmethodactivity, 2, cu.a, null, paymentmethodactivity.i.d());
    }

    static boolean a(PaymentMethodActivity paymentmethodactivity, boolean flag)
    {
        paymentmethodactivity.e = flag;
        return flag;
    }

    private void b()
    {
        if (e && !d)
        {
            g.m.setImageBitmap(dz.c("iVBORw0KGgoAAAANSUhEUgAAADcAAAAsCAYAAADByiAeAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAohJREFUeNrcWYGRgjAQJMwXQAl0IFbwWMFrBS8VvHYAFagVoBVIB2IFaAV8B08H/GUm/GA+CUouBL2ZTByEwCZ3m70LcRCsrusQutDBswranhBSOTYNgC1rM1ZA82yD+6nN2Urn21xNYAF0Jmf33Ro45DhDH9+1ObN3mMe84yVXTusd7ojjTds7iIzeoZtAU7mE1/E/5p536fj/yvbFb+VmDK2sn9c27b2RcKuVOs9vdJVnVN0QBsyHrjAQQ9RNMmhn5j5tC1g8zQ0A3AK4dbNqKbJ7nJjevIeYKN3HBpSOjy2h6DjznuxLQR4xpZvbYj4MX5+CO2S9aJvGCCEL+LnGEgBv2EEsWRXqIj4HJpeA3ML9FRq5IbhioEiHCsVz6V9s/H9WlwdiDHArSfycHpicpWSM0ia4UvJRRY+xlsiJcKwrnBPBtbSnLEt594b427O9cvisgL2cr6XobMobwbWdDXAitvvUTW8E5JTbAHcWXMOQUiHnHRcb4CrBXoYhBiYSjTooOH5GfSRB4I8BnI/xAV0eoTNxaOCUWfBjdh0DOFFsZAjgMkGtZnBCCTH3pIb2BewY2gDn8bkbU/q5xpgJ5t6pK7++BNcWHdUqmUV8GsQUj72irGD1KNvNHgQY8VJOIccGz+c8ybhxR9pyVOSCsW4+11S/asOZeMCIwWvdnyvuxygzJhgrh3pYiHiYqZ3P8XXI4t6SniTJ3WAWhjHBNUripKqNKNyQFoVXmB+DFXOqWDyw/tLEGItBCv6DpUkmTouSBlyJqOrHYlHjlocXA0Y9JGvAbSWpxrPajoaAy6mKVwBIDyHjG7ZkanyqKXxtu+IacEQ3bCmgZt8gixlhZdEBzK8AAwBIvuGtI5K/kgAAAABJRU5ErkJggg==", this));
            g.m.setVisibility(0);
            g.m.setContentDescription(ek.a(em.br));
        }
    }

    static void b(PaymentMethodActivity paymentmethodactivity)
    {
        paymentmethodactivity.showDialog(1);
    }

    private void c()
    {
        (new StringBuilder()).append(a).append(".refreshPayment");
        if (ds.a(this, i))
        {
            i.h();
        }
        PayPalPayment paypalpayment = h.a();
        Object obj1 = ea.a();
        obj1 = dd.a(Locale.getDefault(), ((ea) (obj1)).c().a(), paypalpayment.b().doubleValue(), paypalpayment.e(), true);
        g.c.d.setText(paypalpayment.c());
        g.c.c.setText(((CharSequence) (obj1)));
        if (i.j() && i.c().h.a())
        {
            Object obj = i.r();
            if (gd.b(((CharSequence) (obj))))
            {
                g.d.setText(((CharSequence) (obj)));
                g.d.setVisibility(0);
                g.b.setVisibility(0);
            } else
            {
                g.d.setVisibility(8);
                g.b.setVisibility(8);
            }
        } else
        {
            g.d.setVisibility(8);
            g.b.setVisibility(8);
        }
        if (i.d().i())
        {
            (new de(this, (byte)0)).execute(new Void[0]);
            obj = i.s();
            if (obj != null && ((bF) (obj)).b())
            {
                d = true;
                g.m.setVisibility(8);
                g.e.setText(((bF) (obj)).d());
                obj = gd.a(((bF) (obj)));
                g.g.setImageBitmap(gd.a(this, ((b) (obj))));
                g.g.setContentDescription(((b) (obj)).toString());
                g.g.setVisibility(0);
                obj = ek.a(em.z);
                g.k.setText(((CharSequence) (obj)));
                g.k.setVisibility(0);
                g.h.setVisibility(0);
                g.k.setVisibility(0);
            } else
            {
                g.g.setVisibility(8);
                g.e.setText(ek.a(em.ax));
                g.k.setVisibility(8);
            }
            b();
        } else
        {
            g.h.setVisibility(8);
            g.k.setVisibility(8);
        }
        di.a(g.i.b, i.d().b());
    }

    static void c(PaymentMethodActivity paymentmethodactivity)
    {
        paymentmethodactivity.i.a(ej.f);
        bF bf = paymentmethodactivity.i.s();
        if (bf != null && bf.b())
        {
            PaymentConfirmActivity.a(paymentmethodactivity, 2, cu.c, null, paymentmethodactivity.i.d());
            return;
        } else
        {
            Intent intent = new Intent(paymentmethodactivity, io/card/payment/CardIOActivity);
            intent.putExtra("io.card.payment.languageOrLocale", paymentmethodactivity.i.d().a());
            intent.putExtra("io.card.payment.requireExpiry", true);
            intent.putExtra("io.card.payment.requireCVV", true);
            intent.putExtra("io.card.payment.requirePostalCode", false);
            (new StringBuilder("startActivityForResult(")).append(intent).append(", 1").append(")");
            paymentmethodactivity.startActivityForResult(intent, 1);
            return;
        }
    }

    private void d()
    {
        k = bindService(com.paypal.android.sdk.payments.di.b(this), j, 1);
    }

    static void d(PaymentMethodActivity paymentmethodactivity)
    {
        paymentmethodactivity.showDialog(2);
    }

    static boolean e(PaymentMethodActivity paymentmethodactivity)
    {
        return paymentmethodactivity.e;
    }

    static void f(PaymentMethodActivity paymentmethodactivity)
    {
        paymentmethodactivity.b();
    }

    static PayPalService g(PaymentMethodActivity paymentmethodactivity)
    {
        return paymentmethodactivity.i;
    }

    static void h(PaymentMethodActivity paymentmethodactivity)
    {
        paymentmethodactivity.c();
    }

    static void i(PaymentMethodActivity paymentmethodactivity)
    {
        if (!paymentmethodactivity.f)
        {
            paymentmethodactivity.f = true;
            paymentmethodactivity.i.a(ej.c);
        }
        boolean flag;
        if (!paymentmethodactivity.c && (!paymentmethodactivity.i.d().i() || paymentmethodactivity.i.s() == null))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        (new StringBuilder("autoAdvanceToPayPalConfirmIfLoggedIn: ")).append(flag);
        if (!ds.a(paymentmethodactivity, paymentmethodactivity.i) && (!paymentmethodactivity.i.d().i() && !paymentmethodactivity.c || flag && paymentmethodactivity.i.j() && paymentmethodactivity.i.c().h.a()))
        {
            paymentmethodactivity.showDialog(3);
            paymentmethodactivity.c = true;
            paymentmethodactivity.b = new Timer();
            paymentmethodactivity.b.schedule(new bq(paymentmethodactivity), 1000L);
            paymentmethodactivity.c = true;
        }
        paymentmethodactivity.c();
    }

    protected final void onActivityResult(int l, int i1, Intent intent)
    {
        super.onActivityResult(l, i1, intent);
        (new StringBuilder()).append(a).append(".onActivityResult (requestCode: ").append(l).append(", resultCode: ").append(i1).append(")");
        l;
        JVM INSTR tableswitch 1 2: default 72
    //                   1 73
    //                   2 121;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (intent != null && intent.hasExtra("io.card.payment.scanResult"))
        {
            intent = (CreditCard)intent.getParcelableExtra("io.card.payment.scanResult");
            PaymentConfirmActivity.a(this, 2, com.paypal.android.sdk.payments.cu.b, intent, (PayPalConfiguration)getIntent().getParcelableExtra("com.paypal.android.sdk.paypalConfiguration"), true);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (i1 == -1)
        {
            intent = (PaymentConfirmation)intent.getParcelableExtra("com.paypal.android.sdk.paymentConfirmation");
            Intent intent1 = new Intent();
            intent1.putExtra("com.paypal.android.sdk.paymentConfirmation", intent);
            setResult(i1, intent1);
            finish();
            return;
        }
        if (i1 == 0)
        {
            c = true;
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void onBackPressed()
    {
        (new StringBuilder()).append(a).append(".onBackPressed");
        if (i != null)
        {
            i.a(ej.d);
        }
        if (b != null)
        {
            b.cancel();
        }
        super.onBackPressed();
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        (new StringBuilder()).append(a).append(".onCreate");
        gd.b(this);
        gd.a(this);
        d();
        g = new ev(this);
        h = new aw(getIntent());
        setContentView(g.a);
        di.a(this, g.l, em.bi);
        g.f.setText(ek.a(em.aw));
        g.b.setText(ek.a(em.ar));
        g.j.setOnClickListener(new cw(this));
        g.b.setOnClickListener(new cx(this));
        g.h.setOnClickListener(new cy(this));
        g.k.setOnClickListener(new cz(this));
        if (bundle == null)
        {
            if (!di.a(this))
            {
                finish();
            }
            f = false;
        } else
        {
            c = bundle.getBoolean("PP_PreventAutoLogin");
            f = bundle.getBoolean("PP_PageTrackingSent");
        }
        b = null;
    }

    protected final Dialog onCreateDialog(int l, Bundle bundle)
    {
        switch (l)
        {
        default:
            return null;

        case 1: // '\001'
            return di.a(this, em.as, em.D, new da(this));

        case 2: // '\002'
            return di.a(this, em.bj, em.B, new db(this));

        case 3: // '\003'
            return di.a(this, em.c, em.bp);
        }
    }

    protected final void onDestroy()
    {
        (new StringBuilder()).append(a).append(".onDestroy");
        if (k)
        {
            unbindService(j);
            k = false;
        }
        super.onDestroy();
    }

    protected final void onRestart()
    {
        super.onRestart();
        d();
    }

    protected final void onResume()
    {
        super.onResume();
        (new StringBuilder()).append(a).append(".onResume");
        if (i != null)
        {
            c();
        }
    }

    protected final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        (new StringBuilder()).append(a).append(".onSaveInstanceState");
        bundle.putBoolean("PP_PreventAutoLogin", c);
        bundle.putBoolean("PP_PageTrackingSent", f);
    }

    public final void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        g.c.a();
    }

}
