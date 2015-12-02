// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;

public class bqn extends bqq
{

    private static final String a = bqn.getSimpleName();

    public bqn()
    {
    }

    public static Intent a(String s, bqo bqo1, bqp bqp1, String s1)
    {
        s = b(s, bqo1, bqp1, s1);
        s.putExtra("scope", "https://uri.paypal.com/services/payments/basic");
        return s;
    }

    public static Intent b(String s, bqo bqo1, bqp bqp1, String s1)
    {
        Intent intent = a("com.paypal.android.p2pmobile.Sdk", "com.paypal.android.lib.authenticator.activity.SdkActivity");
        Bundle bundle = new Bundle();
        bundle.putString("target_client_id", s);
        if (bqo1 != null)
        {
            bundle.putString("token_request_type", bqo1.toString());
        }
        if (bqp1 != null)
        {
            bundle.putString("response_type", bqp1.toString());
        }
        bundle.putString("app_guid", s1);
        (new StringBuilder("launching authenticator with bundle:")).append(bundle);
        intent.putExtras(bundle);
        return intent;
    }

}
