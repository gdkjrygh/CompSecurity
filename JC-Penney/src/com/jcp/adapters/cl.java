// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

class cl extends DebouncingOnClickListener
{

    final RewardsItemAdapter.RewardsListViewHolder a;
    final RewardsItemAdapter.RewardsListViewHolder..ViewInjector b;

    cl(RewardsItemAdapter.RewardsListViewHolder..ViewInjector viewinjector, RewardsItemAdapter.RewardsListViewHolder rewardslistviewholder)
    {
        b = viewinjector;
        a = rewardslistviewholder;
        super();
    }

    public void doClick(View view)
    {
        a.onClick(view);
    }
}
