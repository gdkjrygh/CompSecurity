// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.PinApi;
import com.pinterest.fragment.BoardGridFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.actionbar.MetadataBar;
import com.pinterest.ui.grid.PinterestGridView;

public class PinRepinsFragment extends BoardGridFragment
{

    private MetadataBar _metadataBar;
    private Pin _pin;

    public PinRepinsFragment()
    {
        _layoutId = 0x7f0300f6;
    }

    protected void loadData()
    {
        PinApi.a(_navigation.getId(), new com.pinterest.api.remote.BoardApi.BoardFeedApiResponse(gridResponseHandler), getApiTag());
    }

    public void onDestroyView()
    {
        _metadataBar = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _actionBar.setTitle(0x7f07049c);
        _metadataBar = new MetadataBar(view.getContext());
        _metadataBar.setModel(_navigation.getModelAsPin(), com.pinterest.ui.actionbar.MetadataBar.Mode.REPINS);
        _gridVw.addHeaderView(_metadataBar, -1, -2);
        updateEmptyContent();
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation == null)
        {
            return;
        } else
        {
            _pin = navigation.getModelAsPin();
            return;
        }
    }

    protected void updateEmptyContent()
    {
        _emptyLeftImage = 0x7f02020f;
        _emptyCenterImage = 0x7f020217;
        _emptyRightImage = 0x7f020212;
        _emptyMessage = Resources.string(0x7f07026e);
    }
}
