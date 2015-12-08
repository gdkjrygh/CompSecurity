// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.CheckBox;
import com.microsoft.onlineid.internal.MsaService;
import com.microsoft.onlineid.internal.b;

// Referenced classes of package com.microsoft.onlineid.ui:
//            SignOutActivity

final class c
    implements android.content.ClickListener
{

    final b a;
    final CheckBox b;
    final Context c;
    final SignOutActivity d;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        String s1 = a.d();
        String s;
        SignOutActivity signoutactivity;
        boolean flag;
        if (b.isChecked())
        {
            s = "com.microsoft.onlineid.internal.SIGN_OUT_ALL_APPS";
        } else
        {
            s = "com.microsoft.onlineid.internal.SIGN_OUT";
        }
        signoutactivity = d;
        if (b.isChecked())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        SignOutActivity.a(signoutactivity, flag);
        (new b(c, (new Intent(c, com/microsoft/onlineid/internal/MsaService)).setAction(s))).a(s1).a(new gnOutResultReceiver(d)).o();
        dialoginterface.dismiss();
    }

    gnOutResultReceiver(SignOutActivity signoutactivity, b b1, CheckBox checkbox, Context context)
    {
        d = signoutactivity;
        a = b1;
        b = checkbox;
        c = context;
        super();
    }
}
