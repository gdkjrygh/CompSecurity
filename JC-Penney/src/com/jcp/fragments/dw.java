// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.DialogInterface;
import android.support.v4.app.ac;
import android.support.v4.app.aj;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class dw
    implements android.content.DialogInterface.OnDismissListener
{

    final boolean a;
    final ProductDetailFragment b;

    dw(ProductDetailFragment productdetailfragment, boolean flag)
    {
        b = productdetailfragment;
        a = flag;
        super();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (!a)
        {
            dialoginterface = b.i();
            if (dialoginterface != null)
            {
                dialoginterface = dialoginterface.f();
                if (dialoginterface != null)
                {
                    dialoginterface.c();
                }
            }
        }
    }
}
