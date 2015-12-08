// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.content.Intent;
import com.paypal.android.sdk.S;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.paypal.android.sdk.payments:
//            av, PayPalTouchActivity, PayPalOAuthScopes, PayPalConfiguration

final class aH extends av
{

    aH(Intent intent, PayPalConfiguration paypalconfiguration)
    {
        super(intent, paypalconfiguration, true);
    }

    protected final String a()
    {
        return com/paypal/android/sdk/payments/PayPalTouchActivity.getSimpleName();
    }

    final boolean e()
    {
        if (!super.e()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = (PayPalOAuthScopes)b().getParcelableExtra("com.paypal.android.sdk.requested_scopes");
        new S();
        obj = ((PayPalOAuthScopes) (obj)).a().iterator();
_L6:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        if (!S.a((String)((Iterator) (obj)).next())) goto _L6; else goto _L5
_L5:
        boolean flag = false;
_L7:
        if (flag)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L4:
        flag = true;
        if (true) goto _L7; else goto _L2
_L2:
        return false;
    }
}
