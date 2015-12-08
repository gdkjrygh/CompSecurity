// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ScrollView;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.megaphone.MegaphoneView;

// Referenced classes of package com.pinterest.activity.task.fragment:
//            BaseFragment

public class AdapterViewFragment extends BaseFragment
{

    protected android.view.View.OnClickListener _emptyAction;
    protected String _emptyActionLabel;
    protected int _emptyCenterImage;
    protected com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams _emptyFanUtilParams;
    protected int _emptyLeftImage;
    protected String _emptyMessage;
    protected int _emptyRightImage;
    protected AdapterEmptyView _emptyView;
    protected MegaphoneView _nagView;
    protected String _placementId;

    public AdapterViewFragment()
    {
    }

    public String getPlacementId()
    {
        return _placementId;
    }

    public boolean isDataNonEmpty()
    {
        return false;
    }

    public boolean isNagShown()
    {
        return _nagView != null && _nagView.isShown();
    }

    protected void loadData()
    {
        super.loadData();
        updateEmptyContent();
    }

    protected void onActivate()
    {
        super.onActivate();
        if (_emptyView != null)
        {
            _emptyView.activate();
        }
        if (_nagView != null && _nagView.isShown() && !_nagView.isViewed())
        {
            _nagView.setViewed(_placementId);
        }
    }

    protected void onDeactivate()
    {
        super.onDeactivate();
        if (_emptyView != null)
        {
            _emptyView.deactivate();
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _emptyView = (AdapterEmptyView)view.findViewById(0x7f0f0210);
        if (_emptyView != null)
        {
            _emptyView.deactivate();
        }
        view = (ScrollView)view.findViewById(0x7f0f020f);
        if (view != null)
        {
            view.setFillViewport(true);
        }
        if (isActive())
        {
            onActivate();
        }
    }

    public void refresh()
    {
        super.refresh();
        _emptyView.refresh();
    }

    protected void setEmptyContent(Adapter adapter)
    {
        if (_emptyView != null && (adapter == null || adapter.isEmpty()))
        {
            _emptyView.setEmptyIllustrations(_emptyCenterImage, _emptyLeftImage, _emptyRightImage);
            _emptyView.setMessage(_emptyMessage);
            _emptyView.setFanUtilParams(_emptyFanUtilParams);
            _emptyView.setAction(1, _emptyActionLabel, _emptyAction);
        }
    }

    protected void updateEmptyContent()
    {
    }
}
