// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.content.Context;
import com.paypal.android.sdk.cj;
import com.paypal.android.sdk.t;
import com.paypal.android.sdk.v;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PayPalService

class ds
{

    private static final String a = com/paypal/android/sdk/payments/ds.getSimpleName();

    ds()
    {
    }

    static boolean a(Context context, PayPalService paypalservice)
    {
        boolean flag1 = false;
        if (!cj.e(paypalservice.e())) goto _L2; else goto _L1
_L1:
        boolean flag;
        (new StringBuilder("Is mock or sandbox:")).append(paypalservice.e());
        flag = flag1;
_L4:
        (new StringBuilder("returning isValid:")).append(flag);
        return flag;
_L2:
        flag = flag1;
        if (paypalservice.w())
        {
            t t1 = new t();
            boolean flag2 = paypalservice.x();
            boolean flag3 = t1.a(context, "com.paypal.android.p2pmobile.Sdk", "com.paypal.android.lib.authenticator.activity.SdkActivity");
            flag = flag1;
            if (t1.a(context, flag2, "com.paypal.android.p2pmobile"))
            {
                flag = flag1;
                if (flag3)
                {
                    flag = true;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
