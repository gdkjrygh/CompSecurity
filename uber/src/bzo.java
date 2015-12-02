// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;
import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalFuturePaymentActivity;
import com.paypal.android.sdk.payments.PayPalOAuthScopes;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class bzo extends byp
{

    private boolean a;

    public bzo(Intent intent, PayPalConfiguration paypalconfiguration)
    {
        super(intent, paypalconfiguration);
        a = false;
    }

    private static boolean a(String s)
    {
        try
        {
            new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    protected final String a()
    {
        return com/paypal/android/sdk/payments/PayPalFuturePaymentActivity.getSimpleName();
    }

    public final boolean e()
    {
        boolean flag;
        boolean flag3 = bwq.d(c().l());
        a(flag3, "merchantName");
        boolean flag1;
        boolean flag2;
        if (c().m() != null && bwq.a(com/paypal/android/sdk/payments/PayPalFuturePaymentActivity.getSimpleName(), c().m().toString(), "merchantPrivacyPolicyUrl") && a(c().m().toString()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a(flag1, "merchantPrivacyPolicyUrl");
        if (c().n() != null && bwq.a(com/paypal/android/sdk/payments/PayPalFuturePaymentActivity.getSimpleName(), c().n().toString(), "merchantUserAgreementUrl") && a(c().n().toString()))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        a(flag2, "merchantUserAgreementUrl");
        if (!a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a)
        {
            Object obj = (PayPalOAuthScopes)b().getParcelableExtra("com.paypal.android.sdk.requested_scopes");
            if (obj == null)
            {
                flag = false;
            } else
            if (((PayPalOAuthScopes) (obj)).a() == null || ((PayPalOAuthScopes) (obj)).a().size() <= 0)
            {
                flag = false;
            } else
            {
label0:
                {
                    obj = ((PayPalOAuthScopes) (obj)).a().iterator();
                    String s;
                    do
                    {
                        if (!((Iterator) (obj)).hasNext())
                        {
                            break label0;
                        }
                        s = (String)((Iterator) (obj)).next();
                    } while (bqk.q.contains(s));
                    flag = false;
                }
            }
        }
_L1:
        a(flag, "paypalScopes");
        return flag3 && flag1 && flag2 && flag;
        flag = true;
          goto _L1
    }
}
