// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.AlertDialog;
import android.view.View;
import com.roidapp.cloudlib.ads.d;

// Referenced classes of package com.roidapp.photogrid.common:
//            e

final class g
    implements android.view.View.OnClickListener
{

    final d a;
    final String b;
    final AlertDialog c;
    final e d;

    g(e e1, d d1, String s, AlertDialog alertdialog)
    {
        d = e1;
        a = d1;
        b = s;
        c = alertdialog;
        super();
    }

    public final void onClick(View view)
    {
        e.a(d, "com.cleanmaster.mguard", a.g("com.cleanmaster.mguard"), b);
        c.dismiss();
    }
}
