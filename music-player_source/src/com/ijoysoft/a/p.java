// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.view.View;

// Referenced classes of package com.ijoysoft.a:
//            a

final class p
    implements android.view.View.OnClickListener
{

    final a a;
    private final AlertDialog b;
    private final Activity c;
    private final boolean d = true;
    private final Runnable e;

    p(a a1, AlertDialog alertdialog, Activity activity, Runnable runnable)
    {
        a = a1;
        b = alertdialog;
        c = activity;
        e = runnable;
        super();
    }

    public final void onClick(View view)
    {
        b.dismiss();
        c.getSharedPreferences("preference_advertisement", 0).edit().putBoolean("preference_key_adv_rate", true).commit();
        if (d)
        {
            if (e != null)
            {
                e.run();
            }
            return;
        } else
        {
            com.ijoysoft.a.a.b(a, c);
            return;
        }
    }
}
