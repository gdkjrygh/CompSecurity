// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.main.ScrollContent;
import com.soundcloud.android.presentation.RefreshableScreen;
import com.soundcloud.android.view.MultiSwipeRefreshLayout;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import dagger.b;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionsPresenter

public class CollectionsFragment extends LightCycleSupportFragment
    implements ScrollContent, RefreshableScreen
{

    CollectionsPresenter presenter;

    public CollectionsFragment()
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

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030056, viewgroup, false);
    }

    public void resetScroll()
    {
        presenter.scrollToTop();
    }
}
