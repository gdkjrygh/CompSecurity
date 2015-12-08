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
//            ArtistListFragment, AlbumListFragment, AudioGenresListFragment, MusicVideoListFragment

public class MusicListFragment extends Fragment
{

    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/MusicListFragment);
    PagerSlidingTabStrip pagerTabStrip;
    ViewPager viewPager;

    public MusicListFragment()
    {
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
        layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f03002d, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        viewgroup = (new TabsAdapter(getActivity(), getChildFragmentManager())).addTab(org/xbmc/kore/ui/ArtistListFragment, getArguments(), 0x7f07001f, 1L).addTab(org/xbmc/kore/ui/AlbumListFragment, getArguments(), 0x7f07001d, 2L).addTab(org/xbmc/kore/ui/AudioGenresListFragment, getArguments(), 0x7f070049, 3L).addTab(org/xbmc/kore/ui/MusicVideoListFragment, getArguments(), 0x7f070058, 4L);
        viewPager.setAdapter(viewgroup);
        pagerTabStrip.setViewPager(viewPager);
        return layoutinflater;
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
