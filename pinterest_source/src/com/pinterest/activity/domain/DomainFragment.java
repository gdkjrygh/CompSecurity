// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.domain;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.api.remote.SiteApi;
import com.pinterest.fragment.PinGridFragment;
import com.pinterest.kit.application.Resources;

public class DomainFragment extends PinGridFragment
{

    public DomainFragment()
    {
        ((PinGridAdapter)_adapter).setRenderSource(false);
        _layoutId = 0x7f0300be;
    }

    protected void loadData()
    {
        SiteApi.a(_navigation.getId(), new com.pinterest.api.remote.PinApi.PinFeedApiResponse(gridResponseHandler), getApiTag());
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _actionBar.setTitle(_navigation.getId());
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _emptyCenterImage = 0x7f0201d3;
        _emptyMessage = Resources.string(0x7f070246);
    }
}
