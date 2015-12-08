// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.c.e;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.widget:
//            bd, bv, RecyclerView, be

public abstract class bc
{

    private boolean mHasStableIds;
    private final bd mObservable = new bd();

    public bc()
    {
        mHasStableIds = false;
    }

    public final void bindViewHolder(bv bv1, int i)
    {
        bv1.mPosition = i;
        if (hasStableIds())
        {
            bv1.mItemId = getItemId(i);
        }
        bv1.setFlags(1, 519);
        e.a("RV OnBindView");
        onBindViewHolder(bv1, i);
        e.a();
    }

    public final bv createViewHolder(ViewGroup viewgroup, int i)
    {
        e.a("RV CreateView");
        viewgroup = onCreateViewHolder(viewgroup, i);
        viewgroup.mItemViewType = i;
        e.a();
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

    public final boolean hasObservers()
    {
        return mObservable.a();
    }

    public final boolean hasStableIds()
    {
        return mHasStableIds;
    }

    public final void notifyDataSetChanged()
    {
        mObservable.b();
    }

    public final void notifyItemChanged(int i)
    {
        mObservable.a(i, 1);
    }

    public final void notifyItemInserted(int i)
    {
        mObservable.b(i, 1);
    }

    public final void notifyItemMoved(int i, int j)
    {
        mObservable.d(i, j);
    }

    public final void notifyItemRangeChanged(int i, int j)
    {
        mObservable.a(i, j);
    }

    public final void notifyItemRangeInserted(int i, int j)
    {
        mObservable.b(i, j);
    }

    public final void notifyItemRangeRemoved(int i, int j)
    {
        mObservable.c(i, j);
    }

    public final void notifyItemRemoved(int i)
    {
        mObservable.c(i, 1);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerview)
    {
    }

    public abstract void onBindViewHolder(bv bv1, int i);

    public abstract bv onCreateViewHolder(ViewGroup viewgroup, int i);

    public void onDetachedFromRecyclerView(RecyclerView recyclerview)
    {
    }

    public boolean onFailedToRecycleView(bv bv1)
    {
        return false;
    }

    public void onViewAttachedToWindow(bv bv1)
    {
    }

    public void onViewDetachedFromWindow(bv bv1)
    {
    }

    public void onViewRecycled(bv bv1)
    {
    }

    public void registerAdapterDataObserver(be be)
    {
        mObservable.registerObserver(be);
    }

    public void setHasStableIds(boolean flag)
    {
        if (hasObservers())
        {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else
        {
            mHasStableIds = flag;
            return;
        }
    }

    public void unregisterAdapterDataObserver(be be)
    {
        mObservable.unregisterObserver(be);
    }
}
