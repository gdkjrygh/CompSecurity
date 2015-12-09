// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.AlertDialog;
import android.view.View;
import com.jcp.c.aa;
import com.jcp.model.CartItemsDetails;

// Referenced classes of package com.jcp.adapters:
//            AddToCartAdapter

class h
    implements android.view.View.OnClickListener
{

    final CartItemsDetails a;
    final AlertDialog b;
    final AddToCartAdapter c;

    h(AddToCartAdapter addtocartadapter, CartItemsDetails cartitemsdetails, AlertDialog alertdialog)
    {
        c = addtocartadapter;
        a = cartitemsdetails;
        b = alertdialog;
        super();
    }

    public void onClick(View view)
    {
        AddToCartAdapter.a(c, new aa(AddToCartAdapter.h(c)));
        AddToCartAdapter.g(c).a(AddToCartAdapter.f(c));
        AddToCartAdapter.g(c).a(a.getId());
        b.dismiss();
    }
}
