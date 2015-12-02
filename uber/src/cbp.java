// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.view.View;
import com.paypal.android.sdk.payments.PaymentConfirmActivity;
import java.util.ArrayList;

public final class cbp
    implements android.view.View.OnClickListener
{

    final bvp a;
    final ArrayList b;
    final PaymentConfirmActivity c;

    public cbp(PaymentConfirmActivity paymentconfirmactivity, bvp bvp, ArrayList arraylist)
    {
        c = paymentconfirmactivity;
        a = bvp;
        b = arraylist;
        super();
    }

    public final void onClick(View view)
    {
        view = new android.app.AlertDialog.Builder(view.getContext());
        view.setTitle(bux.a(buz.aN)).setAdapter(a, new cbq(this));
        view.create().show();
    }
}
