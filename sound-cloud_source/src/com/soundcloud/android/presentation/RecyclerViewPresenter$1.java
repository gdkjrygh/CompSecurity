// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package com.soundcloud.android.presentation:
//            RecyclerViewPresenter, RecyclerItemAdapter

class val.adapter
    implements android.view.ecyclerViewPresenter._cls1
{

    final RecyclerViewPresenter this$0;
    final RecyclerItemAdapter val$adapter;

    public void onClick(View view)
    {
        int i = RecyclerViewPresenter.access$400(RecyclerViewPresenter.this).getChildAdapterPosition(view);
        if (i >= 0 && i < val$adapter.getItemCount())
        {
            onItemClicked(view, i);
            return;
        } else
        {
            new IllegalArgumentException((new StringBuilder("Invalid recycler position in click handler ")).append(i).toString());
            return;
        }
    }

    A()
    {
        this$0 = final_recyclerviewpresenter;
        val$adapter = RecyclerItemAdapter.this;
        super();
    }
}
