// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.PopupWindow;
import com.jcp.model.CartItemsDetails;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            AddToCartAdapter

class j
    implements android.view.View.OnClickListener
{

    final int a;
    final AddToCartAdapter b;

    j(AddToCartAdapter addtocartadapter, int i)
    {
        b = addtocartadapter;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        AddToCartAdapter.b(b).clear();
        int k = Integer.parseInt(AddToCartAdapter.c(b)[a].getMaxQuantity());
        for (int i = 0; i <= k; i++)
        {
            AddToCartAdapter.b(b).add(Integer.valueOf(i + 1));
        }

        AddToCartAdapter.d(b).showAsDropDown(view);
        AddToCartAdapter.a(b, a);
    }
}
