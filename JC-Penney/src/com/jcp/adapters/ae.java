// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.AlertDialog;
import android.content.DialogInterface;

// Referenced classes of package com.jcp.adapters:
//            CouponAdapter

class ae
    implements android.content.DialogInterface.OnClickListener
{

    final AlertDialog a;
    final CouponAdapter b;

    ae(CouponAdapter couponadapter, AlertDialog alertdialog)
    {
        b = couponadapter;
        a = alertdialog;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.dismiss();
    }
}
