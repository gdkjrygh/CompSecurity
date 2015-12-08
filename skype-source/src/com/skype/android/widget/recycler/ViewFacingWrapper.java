// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.recycler;

import android.view.ViewGroup;

public abstract class ViewFacingWrapper extends android.support.v7.widget.RecyclerView.a
{

    private final android.support.v7.widget.RecyclerView.a a;

    public ViewFacingWrapper(android.support.v7.widget.RecyclerView.a a1)
    {
        a = a1;
        super.setHasStableIds(a1.hasStableIds());
        a1.registerAdapterDataObserver(new android.support.v7.widget.RecyclerView.c() {

            final ViewFacingWrapper a;

            public final void onChanged()
            {
                a.notifyDataSetChanged();
            }

            public final void onItemRangeChanged(int i, int j)
            {
                a.a(i, j);
            }

            public final void onItemRangeInserted(int i, int j)
            {
                a.b(i, j);
            }

            public final void onItemRangeMoved(int i, int j, int k)
            {
                a.a(i, j, k);
            }

            public final void onItemRangeRemoved(int i, int j)
            {
                a.c(i, j);
            }

            
            {
                a = ViewFacingWrapper.this;
                super();
            }
        });
    }

    protected final int a()
    {
        return a.getItemCount();
    }

    protected void a(int i, int j)
    {
        notifyItemRangeChanged(i, j);
    }

    protected void a(int i, int j, int k)
    {
        if (i < j)
        {
            for (int l = 0; l < k; l++)
            {
                notifyItemMoved(i, j);
            }

        } else
        if (i > j)
        {
            for (int i1 = 0; i1 < k;)
            {
                notifyItemMoved(i, j);
                i1++;
                j++;
            }

        }
    }

    protected void b(int i, int j)
    {
        notifyItemRangeInserted(i, j);
    }

    protected void c(int i, int j)
    {
        notifyItemRangeRemoved(i, j);
    }

    public int getItemCount()
    {
        return a.getItemCount();
    }

    public long getItemId(int i)
    {
        return a.getItemId(i);
    }

    public int getItemViewType(int i)
    {
        return a.getItemViewType(i);
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.v v, int i)
    {
        a.onBindViewHolder(v, i);
    }

    public android.support.v7.widget.RecyclerView.v onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return a.onCreateViewHolder(viewgroup, i);
    }

    public boolean onFailedToRecycleView(android.support.v7.widget.RecyclerView.v v)
    {
        return a.onFailedToRecycleView(v);
    }

    public void onViewAttachedToWindow(android.support.v7.widget.RecyclerView.v v)
    {
        a.onViewAttachedToWindow(v);
    }

    public void onViewDetachedFromWindow(android.support.v7.widget.RecyclerView.v v)
    {
        a.onViewDetachedFromWindow(v);
    }

    public void onViewRecycled(android.support.v7.widget.RecyclerView.v v)
    {
        a.onViewRecycled(v);
    }

    public void setHasStableIds(boolean flag)
    {
        a.setHasStableIds(flag);
    }
}
