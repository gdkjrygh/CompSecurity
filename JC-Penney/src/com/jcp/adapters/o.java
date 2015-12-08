// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;

// Referenced classes of package com.jcp.adapters:
//            AddToCartAdapter

class o
    implements android.view.View.OnClickListener
{

    final AddToCartAdapter a;

    o(AddToCartAdapter addtocartadapter)
    {
        a = addtocartadapter;
        super();
    }

    public void onClick(View view)
    {
        AddToCartAdapter.e(a);
    }
}
