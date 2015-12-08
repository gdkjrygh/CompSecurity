// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.nbcsports.liveextra.ads.AdManager;
import com.nbcsports.liveextra.ui.core.BaseContentFragment;
import com.nbcsports.liveextra.ui.main.schedule.ScheduleListPresenter;
import com.phunware.nbc.sochi.MainNavigationContentActivity;
import com.phunware.nbc.sochi.system.NBCSystem;

public class ScheduleFragment extends BaseContentFragment
{

    LinearLayout layout;
    ScheduleListPresenter presenter;
    TextView scheduleTab;
    TextView sportFilterLabel;
    TextView upcomingLabel;

    public ScheduleFragment()
    {
    }

    public static ScheduleFragment getInstance()
    {
        return new ScheduleFragment();
    }

    public com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo getPageInfo()
    {
        return new com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo(":Schedule:List", "Schedule", null, null);
    }

    protected void initPresenter()
    {
        presenter.setListener(this);
    }

    protected void inject()
    {
        if (getActivity() == null || getActivity().isFinishing())
        {
            return;
        } else
        {
            MainNavigationContentActivity.component().inject(this);
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = adManager.getAdView(getActivity(), "schedule");
        layout.addView(bundle);
        bundle.loadAd(adManager.getAdRequest());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040041, viewgroup, false);
        ButterKnife.bind(this, layoutinflater);
        if (sportFilterLabel != null)
        {
            sportFilterLabel.setText(getString(0x7f07017e));
        }
        if (upcomingLabel != null && !NBCSystem.IS_TAB)
        {
            upcomingLabel.setText(0x7f07017e);
            upcomingLabel.setSelected(true);
        } else
        {
            scheduleTab.setSelected(true);
            if (sportFilterLabel != null && sportFilterLabel.getText().toString().equalsIgnoreCase("Schedule"))
            {
                sportFilterLabel.setVisibility(8);
                return layoutinflater;
            }
        }
        return layoutinflater;
    }
}
