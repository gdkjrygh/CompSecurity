// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.paypal.android.sdk.ed;
import com.paypal.android.sdk.ek;
import com.paypal.android.sdk.em;
import com.paypal.android.sdk.fd;
import com.paypal.android.sdk.gd;
import com.paypal.android.sdk.gp;
import com.paypal.android.sdk.gq;
import com.paypal.android.sdk.gr;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

// Referenced classes of package com.paypal.android.sdk.payments:
//            as, PayPalService, PaymentMethodActivity, au, 
//            av, PaymentConfirmation, LoginActivity, PaymentConfirmActivity, 
//            di, ap, ak

public final class PaymentActivity extends Activity
{

    private static final String a = com/paypal/android/sdk/payments/PaymentActivity.getSimpleName();
    private Timer b;
    private Date c;
    private PayPalService d;
    private final ServiceConnection e = new as(this);
    private boolean f;

    public PaymentActivity()
    {
    }

    static PayPalService a(PaymentActivity paymentactivity, PayPalService paypalservice)
    {
        paymentactivity.d = paypalservice;
        return paypalservice;
    }

    static ak a(PaymentActivity paymentactivity)
    {
        return paymentactivity.c();
    }

    static String a()
    {
        return a;
    }

    static Timer a(PaymentActivity paymentactivity, Timer timer)
    {
        paymentactivity.b = timer;
        return timer;
    }

    static PayPalService b(PaymentActivity paymentactivity)
    {
        return paymentactivity.d;
    }

    private void b()
    {
        PaymentMethodActivity.a(this, 1, d.d());
    }

    private ak c()
    {
        return new au(this);
    }

    static void c(PaymentActivity paymentactivity)
    {
        if (paymentactivity.d.d() == null)
        {
            Log.e(a, "Service state invalid.  Did you start the PayPalService?");
            paymentactivity.setResult(2);
            paymentactivity.finish();
            return;
        }
        av av1 = new av(paymentactivity.getIntent(), paymentactivity.d.d());
        if (!av1.d())
        {
            Log.e(a, "Service extras invalid.  Please see the docs.");
            paymentactivity.setResult(2);
            paymentactivity.finish();
            return;
        }
        if (!av1.e())
        {
            Log.e(a, "Extras invalid.  Please see the docs.");
            paymentactivity.setResult(2);
            paymentactivity.finish();
            return;
        }
        paymentactivity.d.l();
        paymentactivity.d.c().a();
        if (paymentactivity.d.i())
        {
            paymentactivity.b();
            return;
        } else
        {
            Calendar calendar = Calendar.getInstance();
            calendar.add(13, 1);
            paymentactivity.c = calendar.getTime();
            paymentactivity.d.a(paymentactivity.c(), false);
            return;
        }
    }

    static Date d(PaymentActivity paymentactivity)
    {
        return paymentactivity.c;
    }

    static void e(PaymentActivity paymentactivity)
    {
        paymentactivity.b();
    }

    static Timer f(PaymentActivity paymentactivity)
    {
        return paymentactivity.b;
    }

    public final void finish()
    {
        super.finish();
        (new StringBuilder()).append(a).append(".finish");
    }

    protected final void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        (new StringBuilder()).append(a).append(".onActivityResult");
        if (i != 1) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch -1 0: default 56
    //                   -1 88
    //                   0 83;
           goto _L3 _L4 _L5
_L5:
        break; /* Loop/switch isn't completed */
_L3:
        Log.wtf("paypal.sdk", (new StringBuilder("unexpected request code ")).append(i).append(" call it a cancel").toString());
_L2:
        finish();
        return;
_L4:
        if (intent != null)
        {
            intent = (PaymentConfirmation)intent.getParcelableExtra("com.paypal.android.sdk.paymentConfirmation");
            if (intent != null)
            {
                Intent intent1 = new Intent();
                intent1.putExtra("com.paypal.android.sdk.paymentConfirmation", intent);
                setResult(-1, intent1);
            } else
            {
                Log.e(a, "result was OK, have data, but no payment state in bundle, oops");
            }
        } else
        {
            Log.e(a, "result was OK, no intent data, oops");
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        (new StringBuilder()).append(a).append(".onCreate");
        (new gr(this)).a();
        (new gq(this)).a();
        (new gp(this)).a(Arrays.asList(new String[] {
            com/paypal/android/sdk/payments/PaymentActivity.getName(), com/paypal/android/sdk/payments/LoginActivity.getName(), com/paypal/android/sdk/payments/PaymentMethodActivity.getName(), com/paypal/android/sdk/payments/PaymentConfirmActivity.getName()
        }));
        f = bindService(di.b(this), e, 1);
        gd.b(this);
        gd.a(this);
        bundle = new fd(this);
        setContentView(((fd) (bundle)).a);
        ((fd) (bundle)).b.setText(ek.a(em.y));
        di.a(this, null, em.y);
    }

    protected final Dialog onCreateDialog(int i, Bundle bundle)
    {
        switch (i)
        {
        default:
            return di.a(this, em.bc, bundle, i);

        case 2: // '\002'
            return di.a(this, new ap(this));

        case 3: // '\003'
            return di.a(this, em.be, bundle, i);
        }
    }

    protected final void onDestroy()
    {
        (new StringBuilder()).append(a).append(".onDestroy");
        if (d != null)
        {
            d.o();
            d.u();
        }
        if (f)
        {
            unbindService(e);
            f = false;
        }
        super.onDestroy();
    }

}
