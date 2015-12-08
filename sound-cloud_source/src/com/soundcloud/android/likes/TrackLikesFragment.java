// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.presentation.RefreshableScreen;
import com.soundcloud.android.view.MultiSwipeRefreshLayout;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import dagger.b;

// Referenced classes of package com.soundcloud.android.likes:
//            TrackLikesPresenter, LikesMenuPresenter

public class TrackLikesFragment extends LightCycleSupportFragment
    implements RefreshableScreen
{

    LikesMenuPresenter likesMenuPresenter;
    TrackLikesPresenter presenter;

    public TrackLikesFragment()
    {
        setRetainInstance(true);
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public MultiSwipeRefreshLayout getRefreshLayout()
    {
        return (MultiSwipeRefreshLayout)getView().findViewById(0x7f0f0153);
    }

    public View[] getRefreshableViews()
    {
        return (new View[] {
            presenter.getRecyclerView(), presenter.getEmptyView()
        });
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        likesMenuPresenter.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        setHasOptionsMenu(true);
        return layoutinflater.inflate(0x7f0300d0, viewgroup, false);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return likesMenuPresenter.onOptionsItemSelected(menuitem, getActivity(), getFragmentManager());
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        likesMenuPresenter.onPrepareOptionsMenu(menu);
    }
}
