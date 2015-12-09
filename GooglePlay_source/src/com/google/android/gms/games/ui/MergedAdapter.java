// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

// Referenced classes of package com.google.android.gms.games.ui:
//            FlingListener

public final class MergedAdapter extends BaseAdapter
    implements FlingListener
{
    public static final class LocalAdapterPosition
    {

        public final BaseAdapter mAdapter;
        public final int mLocalPosition;

        public LocalAdapterPosition(BaseAdapter baseadapter, int i)
        {
            mAdapter = baseadapter;
            mLocalPosition = i;
        }
    }


    private BaseAdapter mAdapters[];
    private DataSetObserver mObserver;

    protected MergedAdapter()
    {
    }

    public transient MergedAdapter(BaseAdapter abaseadapter[])
    {
        init(abaseadapter);
    }

    private LocalAdapterPosition getAdapterOffsetForItem(int i)
    {
        int i1 = mAdapters.length;
        int j = 0;
        int k = 0;
        for (; j < i1; j++)
        {
            BaseAdapter baseadapter = mAdapters[j];
            int l = k + baseadapter.getCount();
            if (i < l)
            {
                return new LocalAdapterPosition(baseadapter, i - k);
            }
            k = l;
        }

        return null;
    }

    private transient void init(BaseAdapter abaseadapter[])
    {
        mObserver = new DataSetObserver() {

            final MergedAdapter this$0;

            public final void onChanged()
            {
                notifyDataSetChanged();
            }

            
            {
                this$0 = MergedAdapter.this;
                super();
            }
        };
        mAdapters = abaseadapter;
        for (int i = 0; i < mAdapters.length; i++)
        {
            mAdapters[i].registerDataSetObserver(mObserver);
        }

    }

    public final boolean areAllItemsEnabled()
    {
        boolean flag = true;
        for (int i = 0; i < mAdapters.length; i++)
        {
            flag &= mAdapters[i].areAllItemsEnabled();
        }

        return flag;
    }

    public final int getCount()
    {
        int j = 0;
        for (int i = 0; i < mAdapters.length; i++)
        {
            j += mAdapters[i].getCount();
        }

        return j;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        LocalAdapterPosition localadapterposition = getAdapterOffsetForItem(i);
        if (localadapterposition == null)
        {
            return null;
        } else
        {
            return localadapterposition.mAdapter.getDropDownView(localadapterposition.mLocalPosition, view, viewgroup);
        }
    }

    public final Object getItem(int i)
    {
        LocalAdapterPosition localadapterposition = getAdapterOffsetForItem(i);
        if (localadapterposition == null)
        {
            return null;
        } else
        {
            return localadapterposition.mAdapter.getItem(localadapterposition.mLocalPosition);
        }
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final int getItemViewType(int i)
    {
        LocalAdapterPosition localadapterposition = getAdapterOffsetForItem(i);
        int j;
        if (localadapterposition == null)
        {
            j = 0;
        } else
        {
            i = 0;
            j = 0;
            do
            {
                if (j >= mAdapters.length)
                {
                    break;
                }
                BaseAdapter baseadapter = mAdapters[j];
                if (baseadapter == localadapterposition.mAdapter)
                {
                    break;
                }
                i += baseadapter.getViewTypeCount();
                j++;
            } while (true);
            int k = localadapterposition.mAdapter.getItemViewType(localadapterposition.mLocalPosition);
            j = k;
            if (k >= 0)
            {
                return k + i;
            }
        }
        return j;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        LocalAdapterPosition localadapterposition = getAdapterOffsetForItem(i);
        if (localadapterposition == null)
        {
            return null;
        } else
        {
            return localadapterposition.mAdapter.getView(localadapterposition.mLocalPosition, view, viewgroup);
        }
    }

    public final int getViewTypeCount()
    {
        int j = 0;
        for (int i = 0; i < mAdapters.length; i++)
        {
            j += mAdapters[i].getViewTypeCount();
        }

        return j;
    }

    public final boolean isEnabled(int i)
    {
        LocalAdapterPosition localadapterposition = getAdapterOffsetForItem(i);
        if (localadapterposition == null)
        {
            return false;
        } else
        {
            return localadapterposition.mAdapter.isEnabled(localadapterposition.mLocalPosition);
        }
    }

    public final void onFlingBegin()
    {
        for (int i = 0; i < mAdapters.length; i++)
        {
            BaseAdapter baseadapter = mAdapters[i];
            if (baseadapter instanceof FlingListener)
            {
                ((FlingListener)baseadapter).onFlingBegin();
            }
        }

    }

    public final void onFlingEnd()
    {
        for (int i = 0; i < mAdapters.length; i++)
        {
            BaseAdapter baseadapter = mAdapters[i];
            if (baseadapter instanceof FlingListener)
            {
                ((FlingListener)baseadapter).onFlingEnd();
            }
        }

    }
}
