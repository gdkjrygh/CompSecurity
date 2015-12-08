// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.timehop.stickyheadersrecyclerview;

import android.view.ViewGroup;

public interface StickyRecyclerHeadersAdapter
{

    public abstract long getHeaderId(int i);

    public abstract int getItemCount();

    public abstract void onBindHeaderViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i);

    public abstract android.support.v7.widget.RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup viewgroup);
}
