// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.fragment.PinGridFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.grid.PinterestGridView;

public class BoardChooseCoverFragment extends PinGridFragment
    implements android.widget.AdapterView.OnItemClickListener
{

    private String _boardId;

    public BoardChooseCoverFragment()
    {
        ((PinGridAdapter)_adapter).setRenderUser(false);
        ((PinGridAdapter)_adapter).setRenderSource(false);
        ((PinGridAdapter)_adapter).setRenderOnto(false);
        ((PinGridAdapter)_adapter).setRenderDomain(false);
        ((PinGridAdapter)_adapter).setOverrideClicks(true);
    }

    protected void loadData()
    {
        BoardApi.a(_boardId, new com.pinterest.api.remote.PinApi.PinFeedApiResponse(gridResponseHandler), getApiTag());
        super.loadData();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300a7;
        _menuId = -1;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (_adapter != null)
        {
            if ((adapterview = (Pin)((PinGridAdapter)_adapter).getItem(i)) != null)
            {
                ((BaseDialog)getParentFragment()).setNavigation(new Navigation(Location.BOARD_CROP_COVER, adapterview));
                return;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _gridVw.setOnItemClickListener(this);
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _boardId = navigation.getId();
    }

    protected void updateEmptyContent()
    {
        _emptyMessage = Resources.string(0x7f0700df);
    }
}
