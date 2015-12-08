// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.AlertDialog;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.common:
//            e

final class f
    implements android.view.View.OnClickListener
{

    final AlertDialog a;
    final e b;

    f(e e, AlertDialog alertdialog)
    {
        b = e;
        a = alertdialog;
        super();
    }

    public final void onClick(View view)
    {
        a.dismiss();
    }
}
