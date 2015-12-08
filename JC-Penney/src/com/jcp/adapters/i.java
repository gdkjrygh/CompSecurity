// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.AlertDialog;
import android.view.View;

// Referenced classes of package com.jcp.adapters:
//            AddToCartAdapter

class i
    implements android.view.View.OnClickListener
{

    final AlertDialog a;
    final AddToCartAdapter b;

    i(AddToCartAdapter addtocartadapter, AlertDialog alertdialog)
    {
        b = addtocartadapter;
        a = alertdialog;
        super();
    }

    public void onClick(View view)
    {
        a.dismiss();
    }
}
