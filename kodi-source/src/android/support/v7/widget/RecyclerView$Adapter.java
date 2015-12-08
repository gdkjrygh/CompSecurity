// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.ViewGroup;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static abstract class ataObserver
{

    private boolean mHasStableIds;
    private final ataObservable mObservable;

    public final void bindViewHolder(er er, int i)
    {
        er.mPosition = i;
        if (hasStableIds())
        {
            er.mItemId = getItemId(i);
        }
        onBindViewHolder(er, i);
        er.setFlags(1, 7);
    }

    public final er createViewHolder(ViewGroup viewgroup, int i)
    {
        viewgroup = onCreateViewHolder(viewgroup, i);
        viewgroup.mItemViewType = i;
        return viewgroup;
    }

    public abstract int getItemCount();

    public long getItemId(int i)
    {
        return -1L;
    }

    public int getItemViewType(int i)
    {
        return 0;
    }

    public final boolean hasStableIds()
    {
        return mHasStableIds;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerview)
    {
    }

    public abstract void onBindViewHolder(er er, int i);

    public abstract er onCreateViewHolder(ViewGroup viewgroup, int i);

    public void onDetachedFromRecyclerView(RecyclerView recyclerview)
    {
    }

    public void onViewDetachedFromWindow(er er)
    {
    }

    public void onViewRecycled(er er)
    {
    }

    public void registerAdapterDataObserver(ataObserver ataobserver)
    {
        mObservable.registerObserver(ataobserver);
    }

    public void unregisterAdapterDataObserver(ataObserver ataobserver)
    {
        mObservable.unregisterObserver(ataobserver);
    }
}
