// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.AlertDialog;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            el, PhotoGridActivity

final class eq
    implements android.view.View.OnClickListener
{

    final AlertDialog a;
    final el b;

    eq(el el1, AlertDialog alertdialog)
    {
        b = el1;
        a = alertdialog;
        super();
    }

    public final void onClick(View view)
    {
        if (a != null)
        {
            a.dismiss();
        }
        el.g(b);
        if (el.i(b) == null || el.i(b).isFinishing() || !b.isAdded())
        {
            return;
        }
        if (el.j(b))
        {
            el.k(b);
            return;
        } else
        {
            el.l(b);
            return;
        }
    }
}
