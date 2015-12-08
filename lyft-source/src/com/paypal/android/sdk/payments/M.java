// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.app.AlertDialog;
import android.view.View;
import com.paypal.android.sdk.cq;
import com.paypal.android.sdk.cs;
import com.paypal.android.sdk.cw;
import java.util.List;

// Referenced classes of package com.paypal.android.sdk.payments:
//            N, LoginActivity

final class M
    implements android.view.View.OnClickListener
{

    final cw a;
    final List b;
    final LoginActivity c;

    M(LoginActivity loginactivity, cw cw, List list)
    {
        c = loginactivity;
        a = cw;
        b = list;
        super();
    }

    public final void onClick(View view)
    {
        view = new android.app.AlertDialog.Builder(view.getContext());
        view.setTitle(cq.a(cs.aW)).setAdapter(a, new N(this));
        view.create().show();
    }
}
