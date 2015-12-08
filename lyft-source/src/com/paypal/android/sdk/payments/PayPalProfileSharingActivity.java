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
import com.paypal.android.sdk.R;
import com.paypal.android.sdk.cA;
import com.paypal.android.sdk.cB;
import com.paypal.android.sdk.cq;
import com.paypal.android.sdk.cs;
import com.paypal.android.sdk.cy;
import com.paypal.android.sdk.cz;
import java.util.Arrays;
import java.util.Date;
import java.util.Timer;

// Referenced classes of package com.paypal.android.sdk.payments:
//            as, at, PayPalService, ProfileSharingConsentActivity, 
//            PayPalAuthorization, LoginActivity, FuturePaymentInfoActivity, d, 
//            ar, aA

public final class PayPalProfileSharingActivity extends Activity
{

    public static final String EXTRA_REQUESTED_SCOPES = "com.paypal.android.sdk.requested_scopes";
    public static final String EXTRA_RESULT_AUTHORIZATION = "com.paypal.android.sdk.authorization";
    public static final int RESULT_EXTRAS_INVALID = 2;
    private static final String a = com/paypal/android/sdk/payments/PayPalProfileSharingActivity.getSimpleName();
    private Date b;
    private Timer c;
    private PayPalService d;
    private final ServiceConnection e = new as(this);
    private boolean f;

    public PayPalProfileSharingActivity()
    {
    }

    static PayPalService a(PayPalProfileSharingActivity paypalprofilesharingactivity, PayPalService paypalservice)
    {
        paypalprofilesharingactivity.d = paypalservice;
        return paypalservice;
    }

    static aA a(PayPalProfileSharingActivity paypalprofilesharingactivity)
    {
        return new at(paypalprofilesharingactivity);
    }

    static String a()
    {
        return a;
    }

    static Date a(PayPalProfileSharingActivity paypalprofilesharingactivity, Date date)
    {
        paypalprofilesharingactivity.b = date;
        return date;
    }

    static Timer a(PayPalProfileSharingActivity paypalprofilesharingactivity, Timer timer)
    {
        paypalprofilesharingactivity.c = timer;
        return timer;
    }

    static PayPalService b(PayPalProfileSharingActivity paypalprofilesharingactivity)
    {
        return paypalprofilesharingactivity.d;
    }

    static void c(PayPalProfileSharingActivity paypalprofilesharingactivity)
    {
        ProfileSharingConsentActivity.a(paypalprofilesharingactivity, 1, paypalprofilesharingactivity.d.e());
    }

    static Date d(PayPalProfileSharingActivity paypalprofilesharingactivity)
    {
        return paypalprofilesharingactivity.b;
    }

    static Timer e(PayPalProfileSharingActivity paypalprofilesharingactivity)
    {
        return paypalprofilesharingactivity.c;
    }

    public final void finish()
    {
        super.finish();
        (new StringBuilder()).append(getClass().getSimpleName()).append(".finish");
    }

    protected final void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        (new StringBuilder()).append(getClass().getSimpleName()).append(".onActivityResult");
        if (i != 1) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch -1 0: default 60
    //                   -1 93
    //                   0 88;
           goto _L3 _L4 _L5
_L5:
        break; /* Loop/switch isn't completed */
_L3:
        Log.wtf(a, (new StringBuilder("unexpected request code ")).append(i).append(" call it a cancel").toString());
_L2:
        finish();
        return;
_L4:
        if (intent != null)
        {
            intent = (PayPalAuthorization)intent.getParcelableExtra("com.paypal.android.sdk.authorization");
            if (intent != null)
            {
                Intent intent1 = new Intent();
                intent1.putExtra("com.paypal.android.sdk.authorization", intent);
                setResult(-1, intent1);
            } else
            {
                Log.e(a, "result was OK, have data, but no authorization state in bundle, oops");
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
        (new StringBuilder()).append(getClass().getSimpleName()).append(".onCreate");
        (new cB(this)).a();
        (new cA(this)).a();
        (new cz(this)).a(Arrays.asList(new String[] {
            com/paypal/android/sdk/payments/PayPalProfileSharingActivity.getName(), com/paypal/android/sdk/payments/LoginActivity.getName(), com/paypal/android/sdk/payments/FuturePaymentInfoActivity.getName(), com/paypal/android/sdk/payments/ProfileSharingConsentActivity.getName()
        }));
        f = bindService(com.paypal.android.sdk.payments.d.a(this), e, 1);
        R.b(this);
        R.a(this);
        bundle = new cy(this);
        setContentView(((cy) (bundle)).a);
        ((cy) (bundle)).b.setText(cq.a(cs.y));
        com.paypal.android.sdk.payments.d.a(this, null, cs.y);
    }

    protected final Dialog onCreateDialog(int i, Bundle bundle)
    {
        switch (i)
        {
        default:
            return com.paypal.android.sdk.payments.d.a(this, cs.bb, bundle, i);

        case 2: // '\002'
            return com.paypal.android.sdk.payments.d.a(this, new ar(this));

        case 3: // '\003'
            return com.paypal.android.sdk.payments.d.a(this, cs.bd, bundle, i);
        }
    }

    protected final void onDestroy()
    {
        (new StringBuilder()).append(getClass().getSimpleName()).append(".onDestroy");
        if (d != null)
        {
            d.o();
            d.r();
        }
        if (f)
        {
            unbindService(e);
            f = false;
        }
        super.onDestroy();
    }

}
