// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.app.AlertDialog;
import android.view.View;
import com.paypal.android.sdk.cF;
import com.paypal.android.sdk.cH;
import com.paypal.android.sdk.cL;
import java.util.List;

// Referenced classes of package com.paypal.android.sdk.payments:
//            R, LoginActivity

final class Q
    implements android.view.View.OnClickListener
{

    final cL a;
    final List b;
    final LoginActivity c;

    Q(LoginActivity loginactivity, cL cl, List list)
    {
        c = loginactivity;
        a = cl;
        b = list;
        super();
    }

    public final void onClick(View view)
    {
        view = new android.app.AlertDialog.Builder(view.getContext());
        view.setTitle(cF.a(cH.aX)).setAdapter(a, new R(this));
        view.create().show();
    }
}
