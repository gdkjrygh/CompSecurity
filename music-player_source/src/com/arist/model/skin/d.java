// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.skin;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import com.arist.activity.MyApplication;
import com.arist.c.f;

// Referenced classes of package com.arist.model.skin:
//            g, e, b

final class d
    implements android.view.View.OnClickListener
{

    final b a;
    private final Context b;
    private final AlertDialog c;

    d(b b1, Context context, AlertDialog alertdialog)
    {
        a = b1;
        b = context;
        c = alertdialog;
        super();
    }

    public final void onClick(View view)
    {
        view = a;
        g g1 = new g(b, MyApplication.e.m());
        g1.a(new e(view, g1));
        g1.show();
        c.dismiss();
    }
}
