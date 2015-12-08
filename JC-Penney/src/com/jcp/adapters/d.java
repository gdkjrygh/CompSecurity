// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.jcp.c.aa;
import com.jcp.fragments.ShoppingBagFragment;
import com.jcp.h.k;
import com.jcp.model.CartItemsDetails;

// Referenced classes of package com.jcp.adapters:
//            AddToCartAdapter

class d
    implements android.view.View.OnClickListener
{

    final int a;
    final AddToCartAdapter.ShoppingBagViewHolder b;
    final AddToCartAdapter c;

    d(AddToCartAdapter addtocartadapter, int i, AddToCartAdapter.ShoppingBagViewHolder shoppingbagviewholder)
    {
        c = addtocartadapter;
        a = i;
        b = shoppingbagviewholder;
        super();
    }

    public void onClick(View view)
    {
        view = AddToCartAdapter.c(c)[a];
        AddToCartAdapter.a(c, new aa(AddToCartAdapter.f(c).i()));
        AddToCartAdapter.g(c).a(AddToCartAdapter.f(c));
        b.mItemEstimatedDelivery.setVisibility(8);
        b.mItemEstimatedDeliveryDescription.setVisibility(8);
        b.mItemEstimatedDeliveryQuestionImageView.setVisibility(8);
        AddToCartAdapter.g(c).a("[{\"op\":\"replace\",\"path\":\"/selected\",\"value\":true}]", view.getId(), "2");
        k.a(view, "Same-Day Pickup");
    }
}
