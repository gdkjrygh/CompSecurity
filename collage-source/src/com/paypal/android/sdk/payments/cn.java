// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.app.AlertDialog;
import android.view.View;
import com.paypal.android.sdk.ek;
import com.paypal.android.sdk.em;
import com.paypal.android.sdk.fc;
import java.util.ArrayList;

// Referenced classes of package com.paypal.android.sdk.payments:
//            co, PaymentConfirmActivity

final class cn
    implements android.view.View.OnClickListener
{

    final fc a;
    final ArrayList b;
    final PaymentConfirmActivity c;

    cn(PaymentConfirmActivity paymentconfirmactivity, fc fc, ArrayList arraylist)
    {
        c = paymentconfirmactivity;
        a = fc;
        b = arraylist;
        super();
    }

    public final void onClick(View view)
    {
        view = new android.app.AlertDialog.Builder(view.getContext());
        view.setTitle(ek.a(em.aN)).setAdapter(a, new co(this));
        view.create().show();
    }
}
