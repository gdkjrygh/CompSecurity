// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;


// Referenced classes of package com.google.android.gms.games.ui:
//            MergedRecyclerAdapter, GamesRecyclerAdapter

final class up extends android.support.v7.widget.zeLookup
{

    final MergedRecyclerAdapter this$0;

    public final int getSpanSize(int i)
    {
        calAdapterPosition caladapterposition = MergedRecyclerAdapter.access$100(MergedRecyclerAdapter.this, i);
        if (caladapterposition != null)
        {
            i = caladapterposition.mAdapter.getSpanCount();
            return caladapterposition.mAdapter.getSpanSizeLookup().getSpanSize(caladapterposition.mLocalPosition) * (MergedRecyclerAdapter.access$200(MergedRecyclerAdapter.this) / i);
        } else
        {
            return 1;
        }
    }

    calAdapterPosition()
    {
        this$0 = MergedRecyclerAdapter.this;
        super();
    }
}
