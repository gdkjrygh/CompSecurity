// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;

// Referenced classes of package com.ijoysoft.a:
//            a

final class d
    implements android.view.View.OnClickListener
{

    final a a;
    private final AlertDialog b;
    private final boolean c = true;
    private final Runnable d;
    private final Activity e;

    d(a a1, AlertDialog alertdialog, Runnable runnable, Activity activity)
    {
        a = a1;
        b = alertdialog;
        d = runnable;
        e = activity;
        super();
    }

    public final void onClick(View view)
    {
        b.dismiss();
        if (c)
        {
            if (d != null)
            {
                d.run();
            }
            return;
        } else
        {
            com.ijoysoft.a.a.b(a, e);
            return;
        }
    }
}
