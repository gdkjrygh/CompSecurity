// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import dagger.b;

// Referenced classes of package com.soundcloud.android.discovery:
//            RecommendedTracksPresenter

public class RecommendedTracksFragment extends LightCycleSupportFragment
{

    private static final String EXTRA_LOCAL_SEED_ID = "localSeedId";
    RecommendedTracksPresenter recommendedTracksPresenter;

    public RecommendedTracksFragment()
    {
        SoundCloudApplication.getObjectGraph().a(this);
        setRetainInstance(true);
    }

    static RecommendedTracksFragment create(long l)
    {
        Bundle bundle = new Bundle();
        bundle.putLong("localSeedId", l);
        RecommendedTracksFragment recommendedtracksfragment = new RecommendedTracksFragment();
        recommendedtracksfragment.setArguments(bundle);
        return recommendedtracksfragment;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030056, viewgroup, false);
    }
}
