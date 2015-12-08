// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;

// Referenced classes of package com.jcp.adapters:
//            AddToCartAdapter

class k
    implements android.view.View.OnClickListener
{

    final AddToCartAdapter a;

    k(AddToCartAdapter addtocartadapter)
    {
        a = addtocartadapter;
        super();
    }

    public void onClick(View view)
    {
        AddToCartAdapter.a(a, "Change Pickup Store");
        AddToCartAdapter.e(a);
    }
}
