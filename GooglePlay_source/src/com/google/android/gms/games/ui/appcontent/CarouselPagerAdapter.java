// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public final class CarouselPagerAdapter extends PagerAdapter
{

    final DatabufferRecyclerAdapter mAdapter;
    private final LinkedList mCardContainers = new LinkedList();
    private final Context mContext;
    final Set mInUseContainers = new HashSet();
    int mMargins;
    int mPagerIndex;
    private final android.support.v7.widget.RecyclerView.RecycledViewPool mViewPool;

    public CarouselPagerAdapter(Context context, DatabufferRecyclerAdapter databufferrecycleradapter, android.support.v7.widget.RecyclerView.RecycledViewPool recycledviewpool)
    {
        mMargins = 0;
        mPagerIndex = 0;
        mContext = context;
        mAdapter = databufferrecycleradapter;
        mViewPool = recycledviewpool;
    }

    public final void destroyItem$30510aeb(ViewGroup viewgroup, Object obj)
    {
        obj = (View)obj;
        mInUseContainers.remove(obj);
        com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder databufferviewholder = (com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder)((View) (obj)).getTag();
        ((View) (obj)).setTag(null);
        mViewPool.putRecycledView(databufferviewholder);
        ((FrameLayout)((View) (obj)).findViewById(0x7f0d0123)).removeAllViews();
        viewgroup.removeView(((View) (obj)));
        mCardContainers.push(obj);
    }

    public final int getCount()
    {
        return mAdapter.getItemCount();
    }

    public final int getCurrentIndex()
    {
        int j = mPagerIndex;
        int k = mAdapter.getItemCount();
        int i = j;
        if (j >= k)
        {
            i = k - 1;
        }
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        return j;
    }

    public final float getPageWidth$13461e()
    {
        return 1.0F / (float)mAdapter.getSpanCount();
    }

    public final Object instantiateItem(ViewGroup viewgroup, int i)
    {
        int j = mAdapter.getItemViewType(i);
        Object obj = (com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder)mViewPool.getRecycledView(j);
        com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder databufferviewholder = ((com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder) (obj));
        if (obj == null)
        {
            databufferviewholder = (com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder)mAdapter.createViewHolder(viewgroup, j);
        }
        mAdapter.bindViewHolder(databufferviewholder, i);
        FrameLayout framelayout;
        android.widget.FrameLayout.LayoutParams layoutparams;
        if (mCardContainers.isEmpty())
        {
            obj = View.inflate(mContext, 0x7f04004d, null);
        } else
        {
            obj = (View)mCardContainers.pop();
        }
        framelayout = (FrameLayout)((View) (obj)).findViewById(0x7f0d0123);
        framelayout.addView(databufferviewholder.itemView);
        ((View) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutparams.setMargins(mMargins, 0, mMargins, 0);
        framelayout.setLayoutParams(layoutparams);
        ((View) (obj)).setTag(databufferviewholder);
        mInUseContainers.add(obj);
        viewgroup.addView(((View) (obj)));
        return obj;
    }

    public final boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }
}
