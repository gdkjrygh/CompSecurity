// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Asserts;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesRecyclerAdapter, ClearableAdapter

public class MergedRecyclerAdapter extends GamesRecyclerAdapter
    implements ClearableAdapter, GamesRecyclerAdapter.DynamicSpanCountAdapter
{
    private class AdapterEntry
    {

        public GamesRecyclerAdapter mAdapter;
        public MergedDataObserver mDataObserver;

        public AdapterEntry(GamesRecyclerAdapter gamesrecycleradapter, MergedDataObserver mergeddataobserver)
        {
            mAdapter = gamesrecycleradapter;
            mDataObserver = mergeddataobserver;
        }
    }

    private class LocalAdapterPosition
    {

        public final GamesRecyclerAdapter mAdapter;
        public final int mLocalPosition;

        public LocalAdapterPosition(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            mAdapter = gamesrecycleradapter;
            mLocalPosition = i;
        }
    }

    public static final class Builder
    {

        private final ArrayList mAdapterList = new ArrayList();

        public final Builder addAdapter(GamesRecyclerAdapter gamesrecycleradapter)
        {
            mAdapterList.add(gamesrecycleradapter);
            return this;
        }

        public final MergedRecyclerAdapter build()
        {
            return new MergedRecyclerAdapter(mAdapterList, (byte)0);
        }

        public Builder()
        {
        }
    }


    public ArrayList mAdapterList;
    private final SparseArray mItemViewTypeSparseArray;
    public int mSpanCount;
    public GamesRecyclerAdapter.SpanCountChangeListener mSpanCountChangeChildListener = new GamesRecyclerAdapter.SpanCountChangeListener() {

        final MergedRecyclerAdapter this$0;

        public final void onSpanCountChanged()
        {
            refreshSpanCount();
        }

            
            {
                this$0 = MergedRecyclerAdapter.this;
                super();
            }
    };
    public GamesRecyclerAdapter.SpanCountChangeListener mSpanCountChangeListener;
    private final android.support.v7.widget.GridLayoutManager.SpanSizeLookup mSpanSizeLookup;
    public boolean mTopPaddingOverridden;
    public int mTopPaddingResId;

    public MergedRecyclerAdapter()
    {
        mSpanSizeLookup = new android.support.v7.widget.GridLayoutManager.SpanSizeLookup() {

            final MergedRecyclerAdapter this$0;

            public final int getSpanSize(int i)
            {
                LocalAdapterPosition localadapterposition = getLocalPositionFromMergedPosition(i);
                if (localadapterposition != null)
                {
                    i = localadapterposition.mAdapter.getSpanCount();
                    return localadapterposition.mAdapter.getSpanSizeLookup().getSpanSize(localadapterposition.mLocalPosition) * (mSpanCount / i);
                } else
                {
                    return 1;
                }
            }

            
            {
                this$0 = MergedRecyclerAdapter.this;
                super();
            }
        };
        mItemViewTypeSparseArray = new SparseArray();
        mSpanCount = 1;
    }

    private MergedRecyclerAdapter(ArrayList arraylist)
    {
        this();
        setAdapterList(arraylist);
    }

    MergedRecyclerAdapter(ArrayList arraylist, byte byte0)
    {
        this(arraylist);
    }

    public static int computeLeastCommonMultiple(int i, int j)
    {
        int k;
        int l;
        boolean flag;
        if (i > 0 && j > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        k = j;
        l = i;
        do
        {
            int i1 = l;
            if (k != 0)
            {
                l = k;
                k = i1 % k;
            } else
            {
                return (j / i1) * i;
            }
        } while (true);
    }

    private LocalAdapterPosition getLocalPositionFromMergedPosition(int i)
    {
        if (i < 0)
        {
            return null;
        }
        int i1 = mAdapterList.size();
        int j = 0;
        int k = 0;
        for (; j < i1; j++)
        {
            GamesRecyclerAdapter gamesrecycleradapter = ((AdapterEntry)mAdapterList.get(j)).mAdapter;
            int l = k + gamesrecycleradapter.getItemCount();
            if (i < l)
            {
                return new LocalAdapterPosition(gamesrecycleradapter, i - k);
            }
            k = l;
        }

        return null;
    }

    public void clearData()
    {
        int i = 0;
        for (int j = mAdapterList.size(); i < j; i++)
        {
            GamesRecyclerAdapter gamesrecycleradapter = ((AdapterEntry)mAdapterList.get(i)).mAdapter;
            if (gamesrecycleradapter instanceof ClearableAdapter)
            {
                ((ClearableAdapter)gamesrecycleradapter).clearData();
            }
        }

    }

    public final int getItemCount()
    {
        if (isVisible()) goto _L2; else goto _L1
_L1:
        int k = 0;
_L4:
        return k;
_L2:
        int i = 0;
        int j = 0;
        int l = mAdapterList.size();
        do
        {
            k = i;
            if (j >= l)
            {
                continue;
            }
            i += ((AdapterEntry)mAdapterList.get(j)).mAdapter.getItemCount();
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final int getItemViewType(int i)
    {
        LocalAdapterPosition localadapterposition = getLocalPositionFromMergedPosition(i);
        if (localadapterposition != null)
        {
            i = localadapterposition.mAdapter.getItemViewType(localadapterposition.mLocalPosition);
            mItemViewTypeSparseArray.put(i, localadapterposition.mAdapter);
            return i;
        } else
        {
            return super.getItemViewType(i);
        }
    }

    protected final int getNestedBasePosition(GamesRecyclerAdapter gamesrecycleradapter)
    {
        int j = getBasePosition();
        int i = 0;
        for (int k = mAdapterList.size(); i < k; i++)
        {
            GamesRecyclerAdapter gamesrecycleradapter1 = ((AdapterEntry)mAdapterList.get(i)).mAdapter;
            if (gamesrecycleradapter1 == gamesrecycleradapter)
            {
                return j;
            }
            j += gamesrecycleradapter1.getItemCount();
        }

        Asserts.fail("Given adapter not nested within this adapter.");
        return -1;
    }

    public final int getSpanCount()
    {
        return mSpanCount;
    }

    public final android.support.v7.widget.GridLayoutManager.SpanSizeLookup getSpanSizeLookup()
    {
        return mSpanSizeLookup;
    }

    public final int getTopPaddingResId()
    {
        return mTopPaddingResId;
    }

    public final void notifyForImageLoad()
    {
    }

    public final volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        viewholder = (GamesRecyclerAdapter.GamesRecyclerViewHolder)viewholder;
        LocalAdapterPosition localadapterposition = getLocalPositionFromMergedPosition(i);
        if (localadapterposition != null)
        {
            localadapterposition.mAdapter.onBindViewHolder(viewholder, localadapterposition.mLocalPosition);
        }
    }

    public final volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        GamesRecyclerAdapter gamesrecycleradapter = (GamesRecyclerAdapter)mItemViewTypeSparseArray.get(i);
        if (gamesrecycleradapter != null)
        {
            return (GamesRecyclerAdapter.GamesRecyclerViewHolder)gamesrecycleradapter.onCreateViewHolder(viewgroup, i);
        } else
        {
            throw new IllegalArgumentException("Unknown item view type");
        }
    }

    public final void onFlingBegin()
    {
        super.onFlingBegin();
        int i = 0;
        for (int j = mAdapterList.size(); i < j; i++)
        {
            ((AdapterEntry)mAdapterList.get(i)).mAdapter.onFlingBegin();
        }

    }

    public final void onFlingEnd()
    {
        super.onFlingEnd();
        int i = 0;
        for (int j = mAdapterList.size(); i < j; i++)
        {
            ((AdapterEntry)mAdapterList.get(i)).mAdapter.onFlingEnd();
        }

    }

    protected final void refreshSpanCount()
    {
        int j = mSpanCount;
        mSpanCount = 1;
        int i = 0;
        for (int k = mAdapterList.size(); i < k; i++)
        {
            int l = ((AdapterEntry)mAdapterList.get(i)).mAdapter.getSpanCount();
            mSpanCount = computeLeastCommonMultiple(mSpanCount, l);
        }

        if (mSpanCountChangeListener != null && mSpanCount != j)
        {
            mSpanCountChangeListener.onSpanCountChanged();
        }
    }

    public final void removeAdapter(int i)
    {
        AdapterEntry adapterentry = (AdapterEntry)mAdapterList.remove(i);
        GamesRecyclerAdapter gamesrecycleradapter = adapterentry.mAdapter;
        if (gamesrecycleradapter instanceof GamesRecyclerAdapter.DynamicSpanCountAdapter)
        {
            ((GamesRecyclerAdapter.DynamicSpanCountAdapter)gamesrecycleradapter).setSpanCountChangeListener(null);
        }
        refreshSpanCount();
        gamesrecycleradapter.unregisterAdapterDataObserver(adapterentry.mDataObserver);
        if (isVisible() && gamesrecycleradapter.getItemCount() > 0)
        {
            int k = 0;
            for (int j = 0; j < i; j++)
            {
                k += ((AdapterEntry)mAdapterList.get(j)).mAdapter.getItemCount();
            }

            notifyItemRangeRemoved(k, gamesrecycleradapter.getItemCount());
        }
    }

    public final void setAdapterList(ArrayList arraylist)
    {
        int i;
        int j;
        boolean flag;
        if (mAdapterList == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag, "The adapters have already been set");
        mAdapterList = new ArrayList(arraylist.size());
        i = 0;
        j = arraylist.size();
        while (i < j) 
        {
            GamesRecyclerAdapter gamesrecycleradapter = (GamesRecyclerAdapter)arraylist.get(i);
            Object obj;
            int k;
            if (gamesrecycleradapter != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag, "The given adapters must be not null");
            obj = new MergedDataObserver(this, gamesrecycleradapter);
            gamesrecycleradapter.registerAdapterDataObserver(((android.support.v7.widget.RecyclerView.AdapterDataObserver) (obj)));
            k = mSpanCount;
            mSpanCount = computeLeastCommonMultiple(mSpanCount, gamesrecycleradapter.getSpanCount());
            if (mSpanCountChangeListener != null && k != mSpanCount)
            {
                mSpanCountChangeListener.onSpanCountChanged();
            }
            if (gamesrecycleradapter instanceof GamesRecyclerAdapter.DynamicSpanCountAdapter)
            {
                ((GamesRecyclerAdapter.DynamicSpanCountAdapter)gamesrecycleradapter).setSpanCountChangeListener(mSpanCountChangeChildListener);
            }
            obj = new AdapterEntry(gamesrecycleradapter, ((MergedDataObserver) (obj)));
            mAdapterList.add(obj);
            gamesrecycleradapter.mContainingAdapter = this;
            i++;
        }
        if (arraylist.size() > 0 && !mTopPaddingOverridden)
        {
            mTopPaddingResId = ((GamesRecyclerAdapter)arraylist.get(0)).getTopPaddingResId();
        }
    }

    public final void setSpanCountChangeListener(GamesRecyclerAdapter.SpanCountChangeListener spancountchangelistener)
    {
        mSpanCountChangeListener = spancountchangelistener;
    }

    public final boolean usesLoadImage()
    {
        return true;
    }




/*
    static int access$300(MergedRecyclerAdapter mergedrecycleradapter, LocalAdapterPosition localadapterposition)
    {
        int k = mergedrecycleradapter.mAdapterList.size();
        int i = 0;
        int j = 0;
        for (; i < k; i++)
        {
            GamesRecyclerAdapter gamesrecycleradapter = ((AdapterEntry)mergedrecycleradapter.mAdapterList.get(i)).mAdapter;
            if (gamesrecycleradapter.equals(localadapterposition.mAdapter))
            {
                return localadapterposition.mLocalPosition + j;
            }
            j += gamesrecycleradapter.getItemCount();
        }

        return -1;
    }

*/
}
