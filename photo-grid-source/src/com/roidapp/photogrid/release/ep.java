// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.AlertDialog;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            el

final class ep
    implements android.view.View.OnClickListener
{

    final AlertDialog a;
    final el b;

    ep(el el1, AlertDialog alertdialog)
    {
        b = el1;
        a = alertdialog;
        super();
    }

    public final void onClick(View view)
    {
        el.h(b);
        el.g(b);
        if (a != null)
        {
            a.dismiss();
        }
    }
}
