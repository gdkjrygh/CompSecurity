// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.AlertDialog;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            dk

final class du
    implements android.view.View.OnClickListener
{

    final AlertDialog a;
    final dk b;

    du(dk dk1, AlertDialog alertdialog)
    {
        b = dk1;
        a = alertdialog;
        super();
    }

    public final void onClick(View view)
    {
        dk.m(b);
        if (a != null)
        {
            a.dismiss();
        }
    }
}
