// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.activities;

import android.view.View;
import com.soundcloud.android.presentation.PagingRecyclerItemAdapter;

// Referenced classes of package com.soundcloud.android.activities:
//            ActivityItemRenderer

class ActivitiesAdapter extends PagingRecyclerItemAdapter
{

    public ActivitiesAdapter(ActivityItemRenderer activityitemrenderer)
    {
        super(activityitemrenderer);
    }

    protected volatile android.support.v7.widget.RecyclerView.ViewHolder createViewHolder(View view)
    {
        return createViewHolder(view);
    }

    protected com.soundcloud.android.presentation.RecyclerItemAdapter.ViewHolder createViewHolder(View view)
    {
        return new com.soundcloud.android.presentation.RecyclerItemAdapter.ViewHolder(view);
    }

    public int getBasicItemViewType(int i)
    {
        return 0;
    }
}
