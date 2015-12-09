// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.model.Product;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.productlistentity.ProductListProductEntity;

public class ProductRating extends LinearLayout
{

    protected TextView numReviews;
    protected RatingBar starRating;

    public ProductRating(Context context)
    {
        this(context, null);
    }

    public ProductRating(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ProductRating(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context);
    }

    private void a(float f, int i)
    {
        byte byte0 = 8;
        Object obj;
        boolean flag;
        int j;
        if (f > 0.0F && i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = starRating;
        if (flag)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        ((RatingBar) (obj)).setVisibility(j);
        obj = numReviews;
        j = byte0;
        if (flag)
        {
            j = 0;
        }
        ((TextView) (obj)).setVisibility(j);
        starRating.setRating(f);
        numReviews.setText(String.format("(%s)", new Object[] {
            Integer.valueOf(i)
        }));
    }

    private void a(Context context)
    {
        inflate(context, 0x7f0300f3, this);
        ButterKnife.inject(this);
    }

    public void setProduct(Product product)
    {
        a(product.getRating(), product.getReviewCount());
    }

    public void setProduct(ProductEntityContainer productentitycontainer)
    {
        a(productentitycontainer.getRating(), productentitycontainer.getReviewCount());
    }

    public void setProduct(ProductListProductEntity productlistproductentity)
    {
        a(productlistproductentity.getRating(), productlistproductentity.getReviewCount());
    }
}
