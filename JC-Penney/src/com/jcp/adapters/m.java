// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;

// Referenced classes of package com.jcp.adapters:
//            AddToCartAdapter

class m
    implements android.view.View.OnClickListener
{

    final int a;
    final AddToCartAdapter b;

    m(AddToCartAdapter addtocartadapter, int i)
    {
        b = addtocartadapter;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        AddToCartAdapter.a(b, AddToCartAdapter.c(b)[a]);
    }
}
