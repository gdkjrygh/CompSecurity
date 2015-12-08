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
import dagger.b;

// Referenced classes of package com.soundcloud.android.stations:
//            ShowAllStationsPresenter

public class ShowAllStationsFragment extends LightCycleSupportFragment
    implements RefreshableScreen
{

    ShowAllStationsPresenter presenter;

    public ShowAllStationsFragment()
    {
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public static ShowAllStationsFragment create(int i)
    {
        ShowAllStationsFragment showallstationsfragment = new ShowAllStationsFragment();
        Bundle bundle = new Bundle();
        bundle.putAll(ShowAllStationsPresenter.createBundle(i));
        showallstationsfragment.setArguments(bundle);
        return showallstationsfragment;
    }

    public MultiSwipeRefreshLayout getRefreshLayout()
    {
        return (MultiSwipeRefreshLayout)getView().findViewById(0x7f0f0252);
    }

    public View[] getRefreshableViews()
    {
        return (new View[] {
            presenter.getRecyclerView(), presenter.getEmptyView()
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300b8, viewgroup, false);
    }
}
