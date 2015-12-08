// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.paypal.android.sdk.R;
import com.paypal.android.sdk.cq;
import com.paypal.android.sdk.cs;

// Referenced classes of package com.paypal.android.sdk.payments:
//            F, G, d, E

public final class FuturePaymentInfoActivity extends Activity
{

    private G a;

    public FuturePaymentInfoActivity()
    {
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (F)getIntent().getExtras().getSerializable("com.paypal.details.scope");
        R.b(this);
        R.a(this);
        a = new G(this, bundle);
        setContentView(a.a);
        d.a(this, a.b, null);
        a.c.setText(cq.a(cs.d));
        a.c.setOnClickListener(new E(this));
    }
}
