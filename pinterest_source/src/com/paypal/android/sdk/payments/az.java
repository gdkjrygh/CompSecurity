// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.content.Intent;
import android.net.Uri;
import com.paypal.android.sdk.N;
import com.paypal.android.sdk.d;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.paypal.android.sdk.payments:
//            C, PayPalFuturePaymentActivity, PayPalConfiguration, PayPalOAuthScopes

class az extends C
{

    private boolean a;

    az(Intent intent, PayPalConfiguration paypalconfiguration, boolean flag)
    {
        super(intent, paypalconfiguration);
        a = flag;
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

    protected String a()
    {
        return com/paypal/android/sdk/payments/PayPalFuturePaymentActivity.getSimpleName();
    }

    boolean e()
    {
        boolean flag;
        boolean flag3 = d.c(c().k());
        a(flag3, "merchantName");
        boolean flag1;
        boolean flag2;
        if (c().l() != null && d.a(a(), c().l().toString(), "merchantPrivacyPolicyUrl") && a(c().l().toString()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a(flag1, "merchantPrivacyPolicyUrl");
        if (c().m() != null && d.a(a(), c().m().toString(), "merchantUserAgreementUrl") && a(c().m().toString()))
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
                    } while (N.q.contains(s));
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
