// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.RadioButton;
import com.jcp.activities.ProductFilterSortActivity;

// Referenced classes of package com.jcp.adapters:
//            ProductFilterRatingAdapter

class bv
    implements android.view.View.OnClickListener
{

    final int a;
    final ProductFilterRatingAdapter b;

    bv(ProductFilterRatingAdapter productfilterratingadapter, int i)
    {
        b = productfilterratingadapter;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        if (a != ProductFilterRatingAdapter.a(b) && ProductFilterRatingAdapter.b(b) != null)
        {
            ProductFilterRatingAdapter.b(b).setChecked(false);
        }
        ProductFilterRatingAdapter.a(b, a);
        ProductFilterRatingAdapter.a(b, (RadioButton)view);
        b.notifyDataSetChanged();
        int i = ProductFilterRatingAdapter.c(b);
        int j = a;
        ProductFilterRatingAdapter.d(b).a(i - (j + 1));
    }
}
