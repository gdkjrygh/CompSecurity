// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.paypal.android.sdk.payments.PayPalService;

public class ccw
{

    private static final String a = ccw.getSimpleName();

    ccw()
    {
    }

    public static boolean a(Context context, PayPalService paypalservice)
    {
        if (bst.e(paypalservice.e()))
        {
            (new StringBuilder("Is mock or sandbox:")).append(paypalservice.e());
        } else
        if (paypalservice.w())
        {
            new bqn();
            boolean flag = paypalservice.x();
            boolean flag1 = bqn.a(context, "com.paypal.android.p2pmobile.Sdk", "com.paypal.android.lib.authenticator.activity.SdkActivity");
            if (bqq.a(context, flag, "com.paypal.android.p2pmobile") && flag1)
            {
                return true;
            }
        }
        return false;
    }

}
