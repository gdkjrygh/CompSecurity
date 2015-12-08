// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;


// Referenced classes of package com.google.android.gms.games.ui:
//            MergedRecyclerAdapter, GamesRecyclerAdapter

private static final class mAdapter extends android.support.v7.widget.erver
{

    private final GamesRecyclerAdapter mAdapter;
    private final MergedRecyclerAdapter mMergedAdapter;

    private int getMergedPosition(int i)
    {
        return MergedRecyclerAdapter.access$300(mMergedAdapter, new n(mAdapter, i));
    }

    public final void onChanged()
    {
        if (mMergedAdapter.isVisible())
        {
            ((android.support.v7.widget.erver.mMergedAdapter) (mMergedAdapter)).mMergedAdapter.Changed();
        }
    }

    public final void onItemRangeChanged(int i, int j)
    {
        if (mMergedAdapter.isVisible())
        {
            mMergedAdapter.notifyItemRangeChanged(getMergedPosition(i), j);
        }
    }

    public final void onItemRangeInserted(int i, int j)
    {
        if (mMergedAdapter.isVisible())
        {
            mMergedAdapter.notifyItemRangeInserted(getMergedPosition(i), j);
        }
    }

    public final void onItemRangeRemoved(int i, int j)
    {
        if (mMergedAdapter.isVisible())
        {
            mMergedAdapter.notifyItemRangeRemoved(getMergedPosition(i), j);
        }
    }

    public n(MergedRecyclerAdapter mergedrecycleradapter, GamesRecyclerAdapter gamesrecycleradapter)
    {
        mMergedAdapter = mergedrecycleradapter;
        mAdapter = gamesrecycleradapter;
    }
}
