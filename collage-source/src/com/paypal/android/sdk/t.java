// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package com.paypal.android.sdk:
//            v, R, u

public class t extends v
{

    private static final String a = com/paypal/android/sdk/t.getSimpleName();

    public t()
    {
    }

    public final Intent a(String s, R r, u u1, String s1)
    {
        s = b(s, r, u1, s1);
        s.putExtra("scope", "https://uri.paypal.com/services/payments/basic");
        return s;
    }

    public final Intent b(String s, R r, u u1, String s1)
    {
        Intent intent = a("com.paypal.android.p2pmobile.Sdk", "com.paypal.android.lib.authenticator.activity.SdkActivity");
        Bundle bundle = new Bundle();
        bundle.putString("target_client_id", s);
        if (r != null)
        {
            bundle.putString("token_request_type", r.toString());
        }
        if (u1 != null)
        {
            bundle.putString("response_type", u1.toString());
        }
        bundle.putString("app_guid", s1);
        (new StringBuilder("launching authenticator with bundle:")).append(bundle);
        intent.putExtras(bundle);
        return intent;
    }

}
