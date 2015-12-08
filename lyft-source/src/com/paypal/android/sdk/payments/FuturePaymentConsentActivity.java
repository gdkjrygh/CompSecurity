// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.app.Activity;
import android.content.Intent;
import java.util.Arrays;
import java.util.HashSet;

// Referenced classes of package com.paypal.android.sdk.payments:
//            p, PayPalOAuthScopes, PayPalConfiguration

public final class FuturePaymentConsentActivity extends p
{

    private static final String d = com/paypal/android/sdk/payments/FuturePaymentConsentActivity.getSimpleName();

    public FuturePaymentConsentActivity()
    {
    }

    static void a(Activity activity, int i, PayPalConfiguration paypalconfiguration)
    {
        Intent intent = new Intent(activity, com/paypal/android/sdk/payments/FuturePaymentConsentActivity);
        intent.putExtras(activity.getIntent());
        intent.putExtra("com.paypal.android.sdk.paypalConfiguration", paypalconfiguration);
        activity.startActivityForResult(intent, 1);
    }

    protected final void a()
    {
        b = new PayPalOAuthScopes(new HashSet(Arrays.asList(new String[] {
            PayPalOAuthScopes.PAYPAL_SCOPE_FUTURE_PAYMENTS
        })));
    }

    public final volatile void finish()
    {
        super.finish();
    }

    public final volatile void onBackPressed()
    {
        super.onBackPressed();
    }

}
