// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.paypal.android.sdk.cF;
import com.paypal.android.sdk.cH;
import com.paypal.android.sdk.d;

// Referenced classes of package com.paypal.android.sdk.payments:
//            J, K, d, I

public final class FuturePaymentInfoActivity extends Activity
{

    private K a;

    public FuturePaymentInfoActivity()
    {
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (J)getIntent().getExtras().getSerializable("com.paypal.details.scope");
        d.b(this);
        d.a(this);
        a = new K(this, bundle);
        setContentView(a.a);
        d.a(this, a.b, null);
        a.c.setText(cF.a(cH.d));
        a.c.setOnClickListener(new I(this));
    }
}
