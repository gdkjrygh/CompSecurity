// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.AlertDialog;
import android.view.View;
import com.jcp.model.CartItemsDetails;

// Referenced classes of package com.jcp.adapters:
//            AddToCartAdapter

class g
    implements android.view.View.OnClickListener
{

    final CartItemsDetails a;
    final AlertDialog b;
    final AddToCartAdapter c;

    g(AddToCartAdapter addtocartadapter, CartItemsDetails cartitemsdetails, AlertDialog alertdialog)
    {
        c = addtocartadapter;
        a = cartitemsdetails;
        b = alertdialog;
        super();
    }

    public void onClick(View view)
    {
        AddToCartAdapter.b(c, a);
        b.dismiss();
    }
}
