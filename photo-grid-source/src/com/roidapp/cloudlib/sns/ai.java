// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            af, aj

final class ai
    implements android.view.View.OnClickListener
{

    final Activity a;
    final String b;
    final aj c;
    final AlertDialog d;

    ai(Activity activity, String s, aj aj1, AlertDialog alertdialog)
    {
        a = activity;
        b = s;
        c = aj1;
        d = alertdialog;
        super();
    }

    public final void onClick(View view)
    {
        af.a(a, b, view.getId());
        if (c != null)
        {
            c.a();
        }
        d.dismiss();
    }
}
