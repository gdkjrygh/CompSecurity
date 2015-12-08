// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget.util;


public abstract class SortedListAdapterCallback extends android.support.v7.util.SortedList.Callback
{

    final android.support.v7.widget.RecyclerView.Adapter mAdapter;

    public SortedListAdapterCallback(android.support.v7.widget.RecyclerView.Adapter adapter)
    {
        mAdapter = adapter;
    }

    public void onChanged(int i, int j)
    {
        mAdapter.notifyItemRangeChanged(i, j);
    }

    public void onInserted(int i, int j)
    {
        mAdapter.notifyItemRangeInserted(i, j);
    }

    public void onMoved(int i, int j)
    {
        mAdapter.notifyItemMoved(i, j);
    }

    public void onRemoved(int i, int j)
    {
        mAdapter.notifyItemRangeRemoved(i, j);
    }
}
