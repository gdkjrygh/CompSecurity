// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.os.d;
import android.view.ViewGroup;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static abstract class mHasStableIds
{

    private boolean mHasStableIds;
    private final unregisterObserver mObservable = new <init>();

    public final void bindViewHolder(mHasStableIds mhasstableids, int i)
    {
        mhasstableids.mPosition = i;
        if (hasStableIds())
        {
            mhasstableids.mItemId = getItemId(i);
        }
        mhasstableids.setFlags(1, 519);
        d.a("RV OnBindView");
        onBindViewHolder(mhasstableids, i, mhasstableids.getUnmodifiedPayloads());
        mhasstableids.clearPayload();
        d.a();
    }

    public final clearPayload createViewHolder(ViewGroup viewgroup, int i)
    {
        d.a("RV CreateView");
        viewgroup = onCreateViewHolder(viewgroup, i);
        viewgroup.mItemViewType = i;
        d.a();
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

    public final void notifyItemChanged(int i, Object obj)
    {
        mObservable.a(i, 1, obj);
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

    public final void notifyItemRangeChanged(int i, int j, Object obj)
    {
        mObservable.a(i, j, obj);
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

    public abstract void onBindViewHolder(c c, int i);

    public void onBindViewHolder(c c, int i, List list)
    {
        onBindViewHolder(c, i);
    }

    public abstract onBindViewHolder onCreateViewHolder(ViewGroup viewgroup, int i);

    public void onDetachedFromRecyclerView(RecyclerView recyclerview)
    {
    }

    public boolean onFailedToRecycleView(onBindViewHolder onbindviewholder)
    {
        return false;
    }

    public void onViewAttachedToWindow(onBindViewHolder onbindviewholder)
    {
    }

    public void onViewDetachedFromWindow(onBindViewHolder onbindviewholder)
    {
    }

    public void onViewRecycled(onBindViewHolder onbindviewholder)
    {
    }

    public void registerAdapterDataObserver(onBindViewHolder onbindviewholder)
    {
        mObservable.registerObserver(onbindviewholder);
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

    public void unregisterAdapterDataObserver(mHasStableIds mhasstableids)
    {
        mObservable.unregisterObserver(mhasstableids);
    }

    public ()
    {
        mHasStableIds = false;
    }
}
