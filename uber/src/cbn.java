// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.view.View;
import com.paypal.android.sdk.payments.PaymentConfirmActivity;
import java.util.ArrayList;

public final class cbn
    implements android.view.View.OnClickListener
{

    final bvd a;
    final ArrayList b;
    final PaymentConfirmActivity c;

    public cbn(PaymentConfirmActivity paymentconfirmactivity, bvd bvd, ArrayList arraylist)
    {
        c = paymentconfirmactivity;
        a = bvd;
        b = arraylist;
        super();
    }

    public final void onClick(View view)
    {
        view = new android.app.AlertDialog.Builder(view.getContext());
        view.setTitle(bux.a(buz.aC)).setAdapter(a, new cbo(this));
        view.create().show();
    }
}
