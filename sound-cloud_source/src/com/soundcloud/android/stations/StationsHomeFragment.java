// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.presentation.RefreshableScreen;
import com.soundcloud.android.view.MultiSwipeRefreshLayout;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsHomePresenter

public class StationsHomeFragment extends LightCycleSupportFragment
    implements RefreshableScreen
{

    EventBus eventBus;
    StationsHomePresenter stationsHomePresenter;

    public StationsHomeFragment()
    {
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public MultiSwipeRefreshLayout getRefreshLayout()
    {
        return (MultiSwipeRefreshLayout)getView().findViewById(0x7f0f0252);
    }

    public View[] getRefreshableViews()
    {
        return (new View[] {
            stationsHomePresenter.getRecyclerView(), stationsHomePresenter.getEmptyView()
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300b6, viewgroup, false);
    }
}
