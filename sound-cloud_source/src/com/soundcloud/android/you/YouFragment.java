// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.you;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.main.ScrollContent;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import dagger.b;

// Referenced classes of package com.soundcloud.android.you:
//            YouPresenter

public class YouFragment extends LightCycleSupportFragment
    implements ScrollContent
{

    YouPresenter presenter;

    public YouFragment()
    {
        SoundCloudApplication.getObjectGraph().a(this);
        setRetainInstance(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300de, viewgroup, false);
    }

    public void resetScroll()
    {
        presenter.resetScroll();
    }
}
