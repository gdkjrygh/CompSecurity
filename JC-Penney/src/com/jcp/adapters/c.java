// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.res.Resources;
import android.support.v4.app.ac;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.jcp.c.aa;
import com.jcp.fragments.ShoppingBagFragment;
import com.jcp.h.k;
import com.jcp.model.CartItemsDetails;

// Referenced classes of package com.jcp.adapters:
//            AddToCartAdapter

class c
    implements android.view.View.OnClickListener
{

    final int a;
    final AddToCartAdapter.ShoppingBagViewHolder b;
    final String c;
    final AddToCartAdapter d;

    c(AddToCartAdapter addtocartadapter, int i, AddToCartAdapter.ShoppingBagViewHolder shoppingbagviewholder, String s)
    {
        d = addtocartadapter;
        a = i;
        b = shoppingbagviewholder;
        c = s;
        super();
    }

    public void onClick(View view)
    {
        view = AddToCartAdapter.c(d)[a];
        AddToCartAdapter.a(d, new aa(AddToCartAdapter.f(d).i()));
        AddToCartAdapter.g(d).a(AddToCartAdapter.f(d));
        b.mItemEstimatedDelivery.setText(AddToCartAdapter.h(d).getResources().getString(0x7f070091));
        b.mItemEstimatedDeliveryDescription.setText(AddToCartAdapter.b(d, c));
        AddToCartAdapter.g(d).a("[{\"op\":\"replace\",\"path\":\"/selected\",\"value\":true}]", view.getId(), "1");
        b.mChangeStore.setVisibility(8);
        b.mItemEstimatedDelivery.setVisibility(8);
        b.mItemEstimatedDeliveryQuestionImageView.setVisibility(8);
        b.mItemEstimatedDeliveryDescription.setVisibility(8);
        b.mCutOffMessageView.setVisibility(8);
        k.a(view, "Ship to Address or Store");
    }
}
