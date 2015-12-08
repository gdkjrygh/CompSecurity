// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import com.paypal.android.sdk.Q;
import com.paypal.android.sdk.T;
import com.paypal.android.sdk.U;
import com.paypal.android.sdk.aB;
import com.paypal.android.sdk.b;
import com.paypal.android.sdk.cH;
import com.paypal.android.sdk.cO;
import com.paypal.android.sdk.cP;
import com.paypal.android.sdk.cQ;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.paypal.android.sdk.payments:
//            aL, PayPalService, aN, PayPalOAuthScopes, 
//            PayPalConfiguration, PayPalTouchConfirmation, PayPalTouchResponseBundle, d

public final class PayPalTouchActivity extends Activity
{

    private static final String a = com/paypal/android/sdk/payments/PayPalTouchActivity.getSimpleName();
    private boolean b;
    private PayPalService c;
    private final ServiceConnection d = new aL(this);
    private boolean e;

    public PayPalTouchActivity()
    {
    }

    static PayPalService a(PayPalTouchActivity paypaltouchactivity, PayPalService paypalservice)
    {
        paypaltouchactivity.c = paypalservice;
        return paypalservice;
    }

    static String a()
    {
        return a;
    }

    private static void a(Bundle bundle)
    {
        if (bundle != null)
        {
            for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext();)
            {
                String s = (String)iterator.next();
                Object obj = bundle.get(s);
                if (obj == null)
                {
                    String.format("%s:null", new Object[] {
                        s
                    });
                } else
                {
                    String.format("%s:%s (%s)", new Object[] {
                        s, obj.toString(), obj.getClass().getName()
                    });
                }
            }

        }
    }

    static void a(PayPalTouchActivity paypaltouchactivity)
    {
label0:
        {
            if (paypaltouchactivity.b)
            {
                if (paypaltouchactivity.c.d() != null)
                {
                    break label0;
                }
                Log.e(a, "Service state invalid.  Did you start the PayPalService?");
                paypaltouchactivity.setResult(2);
                paypaltouchactivity.finish();
            }
            return;
        }
        aN an = new aN(paypaltouchactivity.getIntent(), paypaltouchactivity.c.d());
        if (!an.d())
        {
            Log.e(a, "Service extras invalid.  Please see the docs.");
            paypaltouchactivity.setResult(2);
            paypaltouchactivity.finish();
            return;
        }
        if (!an.e())
        {
            Log.e(a, "Extras invalid.  Please see the docs.");
            paypaltouchactivity.setResult(2);
            paypaltouchactivity.finish();
            return;
        } else
        {
            Object obj = new StringBuilder("isValidScarecrowAuthenticatorPresent:");
            new Q();
            ((StringBuilder) (obj)).append(Q.a(paypaltouchactivity, paypaltouchactivity.c.t()));
            obj = new StringBuilder("isValidV1TouchAuthenticatorPresent:");
            new U();
            ((StringBuilder) (obj)).append(U.a(paypaltouchactivity, paypaltouchactivity.c.t()));
            new U();
            obj = U.a();
            ((Intent) (obj)).putExtra("version", "1.0");
            ((Intent) (obj)).putExtra("app_guid", paypaltouchactivity.c.b().d().e());
            ((Intent) (obj)).putExtra("client_id", paypaltouchactivity.c.f());
            ((Intent) (obj)).putExtra("app_name", paypaltouchactivity.c.b().d().c());
            ((Intent) (obj)).putExtra("environment", paypaltouchactivity.c.e());
            ((Intent) (obj)).putExtra("environment_url", paypaltouchactivity.c.a());
            ((Intent) (obj)).putExtra("scope", ((PayPalOAuthScopes)paypaltouchactivity.getIntent().getExtras().get("com.paypal.android.sdk.requested_scopes")).b());
            ((Intent) (obj)).putExtra("response_type", "code");
            ((Intent) (obj)).putExtra("privacy_url", paypaltouchactivity.c.d().l());
            ((Intent) (obj)).putExtra("agreement_url", paypaltouchactivity.c.d().m());
            (new StringBuilder("startActivityForResult(")).append(obj).append(", 1) extras: ").append(((Intent) (obj)).getExtras());
            Log.w("paypal.sdk", (new StringBuilder("requesting ")).append(((Intent) (obj)).getStringExtra("response_type")).append(" with scope={").append(((Intent) (obj)).getStringExtra("scope")).append("} from Authenticator.").toString());
            paypaltouchactivity.startActivityForResult(((Intent) (obj)), 1);
            return;
        }
    }

    static PayPalService b(PayPalTouchActivity paypaltouchactivity)
    {
        return paypaltouchactivity.c;
    }

    private static void b(Bundle bundle)
    {
        Iterator iterator = bundle.keySet().iterator();
        while (iterator.hasNext()) 
        {
            String s = (String)iterator.next();
            Object obj = bundle.get(s);
            if (obj == null)
            {
                s = String.format("%s:null", new Object[] {
                    s
                });
            } else
            {
                s = String.format("%s:%s (%s)", new Object[] {
                    s, obj.toString(), obj.getClass().getName()
                });
            }
            Log.w("paypal.sdk", s);
        }
    }

    public final void finish()
    {
        super.finish();
        (new StringBuilder()).append(a).append(".finish");
    }

    protected final void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        (new StringBuilder()).append(a).append(".onActivityResult(").append(i).append(",").append(j).append(",").append(intent).append(")");
        if (intent != null)
        {
            a(intent.getExtras());
        }
        switch (i)
        {
        default:
            Log.wtf(a, (new StringBuilder("unexpected request code ")).append(i).append(" call it a cancel").toString());
            return;

        case 1: // '\001'
            break;
        }
        if (intent != null && intent.getExtras() != null && !intent.getExtras().isEmpty())
        {
            if (j == -1)
            {
                intent = intent.getExtras();
                intent = new PayPalTouchConfirmation(new PayPalTouchResponseBundle(intent.getString("version"), intent.getString("display_name"), intent.getString("access_token"), intent.getString("response_type"), intent.getString("authorization_code"), intent.getString("expires_in"), intent.getString("scope"), intent.getString("email"), intent.getString("photo_url"), intent.getString("error"), null));
                Intent intent1 = new Intent();
                intent1.putExtra("com.paypal.android.sdk.loginConfirmation", intent);
                setResult(-1, intent1);
                finish();
            } else
            {
                Intent intent2 = new Intent();
                intent2.putExtras(intent.getExtras());
                Log.w("paypal.sdk", "RESULT_CANCELED");
                b(intent.getExtras());
                setResult(0, intent2);
            }
        } else
        {
            setResult(0);
        }
        finish();
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        (new StringBuilder()).append(a).append(".onCreate");
        if (bundle == null)
        {
            (new cQ(this)).a();
            (new cP(this)).a();
            (new cO(this)).a(Arrays.asList(new String[] {
                com/paypal/android/sdk/payments/PayPalTouchActivity.getName()
            }));
            (new T(this)).a(com/paypal/android/sdk/payments/PayPalTouchActivity);
            b = true;
        } else
        {
            b = false;
        }
        e = bindService(com.paypal.android.sdk.payments.d.a(this), d, 1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setTheme(0x1030010);
    }

    protected final Dialog onCreateDialog(int i, Bundle bundle)
    {
        switch (i)
        {
        default:
            return com.paypal.android.sdk.payments.d.a(this, cH.bc, bundle, i);

        case 2: // '\002'
            return com.paypal.android.sdk.payments.d.a(this, cH.be, bundle, i);
        }
    }

    protected final void onDestroy()
    {
        (new StringBuilder()).append(a).append(".onDestroy");
        if (c != null)
        {
            c.q();
        }
        if (e)
        {
            unbindService(d);
            e = false;
        }
        super.onDestroy();
    }

}
