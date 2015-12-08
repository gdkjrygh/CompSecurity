// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.sync;

import android.accounts.AccountManager;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.google.android.libraries.translate.e.k;
import com.google.android.libraries.translate.f;
import com.google.android.libraries.translate.logging.Event;

// Referenced classes of package com.google.android.libraries.translate.sync:
//            k, o, p, q

final class n
    implements android.content.DialogInterface.OnClickListener
{

    final com.google.android.libraries.translate.sync.k a;
    private final Activity b;
    private final q c;
    private final Event d;

    public n(com.google.android.libraries.translate.sync.k k1, Activity activity, q q, Event event)
    {
        a = k1;
        super();
        b = activity;
        c = q;
        d = event;
    }

    static Activity a(n n1)
    {
        return n1.b;
    }

    static Event b(n n1)
    {
        return n1.d;
    }

    static q c(n n1)
    {
        return n1.c;
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        dialoginterface = ProgressDialog.show(b, null, b.getText(f.msg_signing_in), true, true);
        Object obj = a.b()[i];
        android.accounts.AccountManagerFuture accountmanagerfuture = a.b.getAuthToken(((android.accounts.Account) (obj)), "oauth2:https://www.googleapis.com/auth/translate", null, b, null, null);
        obj = new o(this, accountmanagerfuture, dialoginterface, ((android.accounts.Account) (obj)));
        ((k) (obj)).a(new Void[0]);
        dialoginterface.setCanceledOnTouchOutside(false);
        dialoginterface.setOnCancelListener(new p(this, ((k) (obj)), accountmanagerfuture));
    }
}
