// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.actionbar.ActionBarHelper;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import dagger.b;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistsPagerAdapter

public class PlaylistsFragment extends LightCycleSupportFragment
{

    ActionBarHelper actionBarHelper;

    public PlaylistsFragment()
    {
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setRetainInstance(true);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        actionBarHelper.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03009f, viewgroup, false);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return actionBarHelper.onOptionsItemSelected((AppCompatActivity)getActivity(), menuitem);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        bundle = new PlaylistsPagerAdapter(getChildFragmentManager(), getResources());
        ViewPager viewpager = (ViewPager)view.findViewById(0x7f0f00b7);
        viewpager.setAdapter(bundle);
        viewpager.setPageMarginDrawable(0x7f0200fa);
        viewpager.setPageMargin(getResources().getDimensionPixelOffset(0x7f0b0110));
        ((TabLayout)view.findViewById(0x7f0f0169)).setupWithViewPager(viewpager);
    }
}
