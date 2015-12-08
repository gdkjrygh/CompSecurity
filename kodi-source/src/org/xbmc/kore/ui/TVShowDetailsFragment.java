// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.astuetz.PagerSlidingTabStrip;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.TabsAdapter;

// Referenced classes of package org.xbmc.kore.ui:
//            TVShowOverviewFragment, TVShowEpisodeListFragment

public class TVShowDetailsFragment extends Fragment
{

    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/TVShowDetailsFragment);
    PagerSlidingTabStrip pagerTabStrip;
    private int tvshowId;
    ViewPager viewPager;

    public TVShowDetailsFragment()
    {
        tvshowId = -1;
    }

    public static TVShowDetailsFragment newInstance(int i)
    {
        TVShowDetailsFragment tvshowdetailsfragment = new TVShowDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("tvshow_id", i);
        tvshowdetailsfragment.setArguments(bundle);
        return tvshowdetailsfragment;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setHasOptionsMenu(false);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        tvshowId = getArguments().getInt("tvshow_id", -1);
        if (viewgroup == null || tvshowId == -1)
        {
            return null;
        } else
        {
            layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f030033, viewgroup, false);
            ButterKnife.inject(this, layoutinflater);
            long l = tvshowId * 10;
            viewgroup = (new TabsAdapter(getActivity(), getChildFragmentManager())).addTab(org/xbmc/kore/ui/TVShowOverviewFragment, getArguments(), 0x7f0700a1, l).addTab(org/xbmc/kore/ui/TVShowEpisodeListFragment, getArguments(), 0x7f0700a0, l + 1L);
            viewPager.setAdapter(viewgroup);
            pagerTabStrip.setViewPager(viewPager);
            return layoutinflater;
        }
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }

}
