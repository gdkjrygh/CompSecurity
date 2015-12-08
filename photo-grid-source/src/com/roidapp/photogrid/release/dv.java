// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            dk, PhotoGridActivity

final class dv
    implements android.view.View.OnClickListener
{

    final AlertDialog a;
    final dk b;

    dv(dk dk1, AlertDialog alertdialog)
    {
        b = dk1;
        a = alertdialog;
        super();
    }

    public final void onClick(View view)
    {
        if (a != null)
        {
            a.dismiss();
        }
        if (dk.b(b) == null || dk.b(b).isFinishing() || !b.isAdded())
        {
            return;
        }
        dk.a(b, PreferenceManager.getDefaultSharedPreferences(dk.b(b)).getBoolean("music_policy", true));
        if (dk.n(b))
        {
            dk.o(b);
            return;
        } else
        {
            dk.l(b);
            return;
        }
    }
}
