// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.app.AlertDialog;
import android.view.View;
import com.paypal.android.sdk.ek;
import com.paypal.android.sdk.em;
import com.paypal.android.sdk.ex;
import java.util.List;

// Referenced classes of package com.paypal.android.sdk.payments:
//            R, LoginActivity

final class s
    implements android.view.View.OnClickListener
{

    final ex a;
    final List b;
    final LoginActivity c;

    s(LoginActivity loginactivity, ex ex, List list)
    {
        c = loginactivity;
        a = ex;
        b = list;
        super();
    }

    public final void onClick(View view)
    {
        view = new android.app.AlertDialog.Builder(view.getContext());
        view.setTitle(ek.a(em.aX)).setAdapter(a, new R(this));
        view.create().show();
    }
}
