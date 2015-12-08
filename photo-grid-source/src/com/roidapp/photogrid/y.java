// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.app.AlertDialog;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage

final class y
    implements android.view.View.OnClickListener
{

    final AlertDialog a;
    final MainPage b;

    y(MainPage mainpage, AlertDialog alertdialog)
    {
        b = mainpage;
        a = alertdialog;
        super();
    }

    public final void onClick(View view)
    {
        a.dismiss();
    }
}
