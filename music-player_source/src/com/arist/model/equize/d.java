// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.equize;

import android.app.AlertDialog;
import android.view.View;
import com.arist.b.a;

// Referenced classes of package com.arist.model.equize:
//            a, j

final class d
    implements android.view.View.OnClickListener
{

    final com.arist.model.equize.a a;
    private final AlertDialog b;
    private final a c;

    d(com.arist.model.equize.a a1, AlertDialog alertdialog, a a2)
    {
        a = a1;
        b = alertdialog;
        c = a2;
        super();
    }

    public final void onClick(View view)
    {
        b.dismiss();
        com.arist.model.equize.a.a(a).c(c);
        com.arist.model.equize.a.a(a, 0x7f0900a6);
    }
}
