// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.adapters.RecommendedProductAdapter;
import com.jcp.c.ag;
import com.jcp.e.ad;
import com.jcp.recommendation.myrecs.RecommendedProduct;
import com.jcp.util.ae;
import com.jcp.util.af;
import java.util.List;

// Referenced classes of package com.jcp.views:
//            HorizontalListView

public class HorizontalListOfRecommendedProducts extends LinearLayout
{

    private static final String a = com/jcp/views/HorizontalListOfRecommendedProducts.getSimpleName();
    private Context b;
    private int c;
    private ad d;
    protected HorizontalListView horizontalListView;
    protected TextView title;

    public HorizontalListOfRecommendedProducts(Context context)
    {
        this(context, null);
    }

    public HorizontalListOfRecommendedProducts(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HorizontalListOfRecommendedProducts(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context);
    }

    private RecommendedProductAdapter a(List list, boolean flag)
    {
        return new RecommendedProductAdapter(b, 0x7f0300cc, list, flag);
    }

    private String a(int i)
    {
        String s;
        if (af.a(b).c())
        {
            s = "MYRECS";
        } else
        {
            try
            {
                s = String.format("%s%d", new Object[] {
                    "GENERECS", Integer.valueOf(i)
                });
            }
            catch (Exception exception)
            {
                ae.a(a, "getRecommendationZoneName exception", exception);
                return "";
            }
        }
        if (i == 100)
        {
            s = "HOME";
        } else
        if (i == 101)
        {
            return "PDP";
        }
        return s;
    }

    private void a(Context context)
    {
        b = context;
        ButterKnife.inject(this, inflate(context, 0x7f030093, this));
    }

    private void a(RecommendedProduct recommendedproduct)
    {
        if (!TextUtils.isEmpty(recommendedproduct.getClickURL()))
        {
            (new ag(b)).execute(new String[] {
                recommendedproduct.getClickURL()
            });
        }
    }

    private Bundle b(RecommendedProduct recommendedproduct)
    {
        Bundle bundle = new Bundle();
        bundle.putString("PPID", recommendedproduct.getId());
        bundle.putString("ProductURL", recommendedproduct.getUrl());
        bundle.putString("recommendation_zone", a(c));
        bundle.putBoolean("ProductDetails", true);
        return bundle;
    }

    public AdapterView getAdapterView()
    {
        return horizontalListView;
    }

    public void onRecommendedProductClick(int i)
    {
        if (d != null)
        {
            RecommendedProduct recommendedproduct = (RecommendedProduct)((RecommendedProductAdapter)horizontalListView.getAdapter()).getItem(i);
            if (recommendedproduct != null)
            {
                d.c(b(recommendedproduct));
                a(recommendedproduct);
            }
            return;
        } else
        {
            ae.b(a, "recommendedProductClickListener is null. Did you forget to set it?");
            return;
        }
    }

    public void setRecommendedProductClickListener(ad ad1)
    {
        d = ad1;
    }

    public void setRecommendedProductsWithSignInItem(List list)
    {
        horizontalListView.setAdapter(a(list, true));
    }

    public void setRecommendedProductsWithoutSignInItem(List list)
    {
        horizontalListView.setAdapter(a(list, false));
    }

    public void setTitle(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            title.setVisibility(0);
            title.setText(s);
            return;
        } else
        {
            title.setVisibility(8);
            title.setText("");
            return;
        }
    }

    public void setZone(int i)
    {
        c = i;
    }

}
