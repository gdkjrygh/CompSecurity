// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.kohls.mcommerce.opal.wallet.rest.containers.FilterObj;
import com.kohls.mcommerce.opal.wallet.util.WalletFontCache;
import java.util.ArrayList;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            FilterActivity

private class filters extends BaseAdapter
{

    private Context context;
    private ArrayList filters;
    private FilterViewHolder mHolder;
    final FilterActivity this$0;

    public int getCount()
    {
        return filters.size();
    }

    public Object getItem(int i)
    {
        return filters.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = (LayoutInflater)context.getSystemService("layout_inflater");
    /* block-local class not found */
    class FilterViewHolder {}

        String s;
        if (view == null)
        {
            mHolder = new FilterViewHolder(null);
            view = viewgroup.inflate(0x7f030068, null);
            FilterViewHolder.access._mth302(mHolder, (TextView)view.findViewById(0x7f0d023b));
            FilterViewHolder.access._mth402(mHolder, (TextView)view.findViewById(0x7f0d023c));
            FilterViewHolder.access._mth502(mHolder, (ImageView)view.findViewById(0x7f0d023d));
            view.setTag(mHolder);
        } else
        {
            mHolder = (FilterViewHolder)view.getTag();
        }
        viewgroup = ((FilterObj)filters.get(i)).getFilterName();
        s = ((FilterObj)filters.get(i)).getFilterValue();
        if (TextUtils.isEmpty(viewgroup))
        {
            FilterViewHolder.access._mth300(mHolder).setVisibility(8);
            if (getIntent().getStringExtra("filter").equalsIgnoreCase("type") && i == FilterActivity.access$100(FilterActivity.this) || getIntent().getStringExtra("filter").equalsIgnoreCase("view") && i == FilterActivity.access$000(FilterActivity.this))
            {
                FilterViewHolder.access._mth500(mHolder).setVisibility(0);
                FilterViewHolder.access._mth500(mHolder).setImageDrawable(getResources().getDrawable(0x7f0200f1));
                FilterViewHolder.access._mth400(mHolder).setTypeface(WalletFontCache.getGothamBold(getApplicationContext()));
            } else
            {
                FilterViewHolder.access._mth500(mHolder).setImageDrawable(null);
                FilterViewHolder.access._mth400(mHolder).setTypeface(WalletFontCache.getGothamBook(getApplicationContext()));
            }
        } else
        {
            FilterViewHolder.access._mth300(mHolder).setVisibility(0);
            FilterViewHolder.access._mth500(mHolder).setVisibility(0);
            FilterViewHolder.access._mth300(mHolder).setText(((FilterObj)filters.get(i)).getFilterName());
        }
        FilterViewHolder.access._mth400(mHolder).setText(s);
        return view;
    }

    public FilterViewHolder(Context context1, ArrayList arraylist)
    {
        this$0 = FilterActivity.this;
        super();
        context = context1;
        filters = arraylist;
    }
}
