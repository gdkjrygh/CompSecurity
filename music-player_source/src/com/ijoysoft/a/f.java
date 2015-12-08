// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.a;

import android.app.AlertDialog;
import android.view.View;

// Referenced classes of package com.ijoysoft.a:
//            a

final class f
    implements android.view.View.OnClickListener
{

    final a a;
    private final AlertDialog b;
    private final Runnable c;

    f(a a1, AlertDialog alertdialog, Runnable runnable)
    {
        a = a1;
        b = alertdialog;
        c = runnable;
        super();
    }

    public final void onClick(View view)
    {
        b.dismiss();
        if (c != null)
        {
            c.run();
        }
    }
}
