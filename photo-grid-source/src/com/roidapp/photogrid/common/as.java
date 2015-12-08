// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.common:
//            ap

final class as
    implements android.view.View.OnClickListener
{

    final AlertDialog a;
    final Activity b;
    final ap c;

    as(ap ap1, AlertDialog alertdialog, Activity activity)
    {
        c = ap1;
        a = alertdialog;
        b = activity;
        super();
    }

    public final void onClick(View view)
    {
        a.dismiss();
        c.b(b);
    }
}
