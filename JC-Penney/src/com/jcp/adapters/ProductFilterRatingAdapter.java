// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.RatingBar;
import com.jcp.activities.ProductFilterSortActivity;

// Referenced classes of package com.jcp.adapters:
//            bv

public class ProductFilterRatingAdapter extends BaseAdapter
{

    private int a;
    private int b;
    private RadioButton c;
    private LayoutInflater d;
    private ProductFilterSortActivity e;

    public ProductFilterRatingAdapter(Activity activity, int i, int j)
    {
        b = -1;
        d = LayoutInflater.from(activity);
        a = i;
        b = a - (j + 1);
        e = (ProductFilterSortActivity)activity;
    }

    static int a(ProductFilterRatingAdapter productfilterratingadapter)
    {
        return productfilterratingadapter.b;
    }

    static int a(ProductFilterRatingAdapter productfilterratingadapter, int i)
    {
        productfilterratingadapter.b = i;
        return i;
    }

    static RadioButton a(ProductFilterRatingAdapter productfilterratingadapter, RadioButton radiobutton)
    {
        productfilterratingadapter.c = radiobutton;
        return radiobutton;
    }

    static RadioButton b(ProductFilterRatingAdapter productfilterratingadapter)
    {
        return productfilterratingadapter.c;
    }

    static int c(ProductFilterRatingAdapter productfilterratingadapter)
    {
        return productfilterratingadapter.a;
    }

    static ProductFilterSortActivity d(ProductFilterRatingAdapter productfilterratingadapter)
    {
        return productfilterratingadapter.e;
    }

    public int getCount()
    {
        return a;
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null || view.getTag() == null)
        {
            view = d.inflate(0x7f0300be, null);
            viewgroup = new ViewHolder(view);
            if (i == b)
            {
                c = ((ViewHolder) (viewgroup)).radioBtn;
            }
            ((ViewHolder) (viewgroup)).radioBtn.setOnClickListener(new bv(this, i));
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        if (b == i) goto _L2; else goto _L1
_L1:
        ((ViewHolder) (viewgroup)).radioBtn.setChecked(false);
_L4:
        ((ViewHolder) (viewgroup)).ratingBar.setRating(a - (i + 1));
        return view;
_L2:
        ((ViewHolder) (viewgroup)).radioBtn.setChecked(true);
        if (c != null && ((ViewHolder) (viewgroup)).radioBtn != c)
        {
            c = ((ViewHolder) (viewgroup)).radioBtn;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private class ViewHolder
    {

        final ProductFilterRatingAdapter a;
        protected RadioButton radioBtn;
        protected RatingBar ratingBar;

        protected ViewHolder(View view)
        {
            a = ProductFilterRatingAdapter.this;
            super();
            ButterKnife.inject(this, view);
        }
    }

}
