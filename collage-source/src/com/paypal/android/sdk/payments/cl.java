// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.app.AlertDialog;
import android.view.View;
import com.paypal.android.sdk.ek;
import com.paypal.android.sdk.em;
import com.paypal.android.sdk.eq;
import java.util.ArrayList;

// Referenced classes of package com.paypal.android.sdk.payments:
//            cm, PaymentConfirmActivity

final class cl
    implements android.view.View.OnClickListener
{

    final eq a;
    final ArrayList b;
    final PaymentConfirmActivity c;

    cl(PaymentConfirmActivity paymentconfirmactivity, eq eq, ArrayList arraylist)
    {
        c = paymentconfirmactivity;
        a = eq;
        b = arraylist;
        super();
    }

    public final void onClick(View view)
    {
        view = new android.app.AlertDialog.Builder(view.getContext());
        view.setTitle(ek.a(em.aC)).setAdapter(a, new cm(this));
        view.create().show();
    }
}
