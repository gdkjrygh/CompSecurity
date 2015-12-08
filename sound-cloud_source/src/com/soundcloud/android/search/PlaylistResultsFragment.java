// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.presentation.RefreshableScreen;
import com.soundcloud.android.view.MultiSwipeRefreshLayout;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import dagger.b;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistResultsPresenter

public class PlaylistResultsFragment extends LightCycleSupportFragment
    implements RefreshableScreen
{

    static final String KEY_PLAYLIST_TAG = "playlist_tag";
    public static final String TAG = "playlist_results";
    PlaylistResultsPresenter presenter;

    public PlaylistResultsFragment()
    {
        setRetainInstance(true);
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public static PlaylistResultsFragment create(String s)
    {
        PlaylistResultsFragment playlistresultsfragment = new PlaylistResultsFragment();
        Bundle bundle = new Bundle();
        bundle.putString("playlist_tag", s);
        playlistresultsfragment.setArguments(bundle);
        return playlistresultsfragment;
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

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030056, viewgroup, false);
    }
}
