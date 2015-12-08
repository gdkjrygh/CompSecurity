// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesHeaderRecyclerViewFragment, GamesRecyclerAdapter

final class this._cls0 extends android.support.v7.widget.ent._cls4
{

    final GamesHeaderRecyclerViewFragment this$0;

    public final void getItemOffsets$5c1923bd(Rect rect, View view, RecyclerView recyclerview)
    {
        recyclerview = (GridLayoutManager)recyclerview.mLayout;
        android.support.v7.widget.ent._cls4 _lcls4 = (android.support.v7.widget.ent._cls4)view.getLayoutParams();
        int i = _lcls4.anIndex;
        int j = _lcls4.anSize;
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i + j == ((GridLayoutManager) (recyclerview)).mSpanCount)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        view = ((ViewHolder)mRecyclerView.getChildViewHolder(view)).mAdapter;
        if (view != null)
        {
            view.getItemOffsets$3bb5fad4(rect);
            if (flag && (float)rect.left < 0.0F || i && (float)rect.right < 0.0F)
            {
                mRecyclerView.setClipToPadding(false);
                return;
            }
        }
    }

    ViewHolder()
    {
        this$0 = GamesHeaderRecyclerViewFragment.this;
        super();
    }
}
