// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.BoardGridAdapter;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.grid.PinterestGridView;

// Referenced classes of package com.pinterest.fragment:
//            PinterestGridFragment

public class BoardGridFragment extends PinterestGridFragment
{

    public BoardGridFragment()
    {
        _adapter = new BoardGridAdapter();
    }

    protected void onBoardClicked(AdapterView adapterview, View view, int i, long l)
    {
        if (_adapter != null)
        {
            if ((adapterview = ((BoardGridAdapter)_adapter).getItem(i)) instanceof Board)
            {
                adapterview = (Board)adapterview;
                Pinalytics.a(ElementType.BOARD_COVER, ComponentType.FLOWED_BOARD, adapterview.getUid());
                Events.post(new Navigation(Location.BOARD, adapterview));
                return;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _gridVw.setOnItemClickListener(new _cls1());
    }

    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final BoardGridFragment this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            onBoardClicked(adapterview, view, i, l);
        }

        _cls1()
        {
            this$0 = BoardGridFragment.this;
            super();
        }
    }

}
