// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class ei
    implements android.view.View.OnClickListener
{

    final ProductDetailFragment a;

    protected ei(ProductDetailFragment productdetailfragment)
    {
        a = productdetailfragment;
        super();
    }

    public void onClick(View view)
    {
        boolean flag;
        if (ProductDetailFragment.Y(a))
        {
            a.descriptionText.setMaxLines(2);
            a.descriptionArrow.setBackgroundResource(0x7f02018f);
        } else
        {
            a.descriptionText.setMaxLines(0x7fffffff);
            a.descriptionArrow.setBackgroundResource(0x7f020190);
        }
        view = a;
        if (!ProductDetailFragment.Y(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ProductDetailFragment.j(view, flag);
    }
}
