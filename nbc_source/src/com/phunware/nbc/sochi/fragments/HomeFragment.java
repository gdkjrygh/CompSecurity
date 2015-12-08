// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.nbcsports.liveextra.library.configuration.Sport;
import com.nbcsports.liveextra.ui.core.BaseContentFragment;
import com.nbcsports.liveextra.ui.main.home.HomeListPresenter;
import com.phunware.nbc.sochi.MainNavigationContentActivity;

public class HomeFragment extends BaseContentFragment
{
    public static interface InfoProvider
    {

        public abstract void loadInfo(FragmentManager fragmentmanager);
    }


    ImageView about;
    InfoProvider infoProvider;
    HomeListPresenter presenter;
    TextView upcomingLabel;

    public HomeFragment()
    {
    }

    public static HomeFragment getInstance()
    {
        return new HomeFragment();
    }

    public com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo getPageInfo()
    {
        if (sport != null)
        {
            if (sport.isRSN())
            {
                return new com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo(":RSN", "RSN", "Upcoming", sport.getName());
            } else
            {
                return new com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo(":Sport", "Sport", "Upcoming", sport.getName());
            }
        } else
        {
            return new com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo(":Upcoming:List", "Upcoming", null, null);
        }
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

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f04003a, viewgroup, false);
        ButterKnife.bind(this, layoutinflater);
        upcomingLabel.setSelected(true);
        if (about != null && infoProvider != null)
        {
            about.setVisibility(0);
            about.setOnClickListener(new android.view.View.OnClickListener() {

                final HomeFragment this$0;

                public void onClick(View view)
                {
                    infoProvider.loadInfo(getChildFragmentManager());
                }

            
            {
                this$0 = HomeFragment.this;
                super();
            }
            });
        }
        return layoutinflater;
    }
}
