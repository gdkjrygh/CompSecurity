// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.main.ScrollContent;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import dagger.b;

// Referenced classes of package com.soundcloud.android.discovery:
//            DiscoveryPresenter

public class DiscoveryFragment extends LightCycleSupportFragment
    implements ScrollContent
{

    DiscoveryPresenter presenter;

    public DiscoveryFragment()
    {
        setRetainInstance(true);
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030056, viewgroup, false);
        layoutinflater.setBackgroundColor(getResources().getColor(0x7f0e00a3));
        return layoutinflater;
    }

    public void resetScroll()
    {
        presenter.scrollToTop();
    }
}
