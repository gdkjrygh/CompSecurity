// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.AlertDialog;
import android.content.DialogInterface;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class dl
    implements android.content.DialogInterface.OnClickListener
{

    final AlertDialog a;
    final ProductDetailFragment b;

    dl(ProductDetailFragment productdetailfragment, AlertDialog alertdialog)
    {
        b = productdetailfragment;
        a = alertdialog;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.dismiss();
    }
}
