// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import dagger.b;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPresenter

public class PlayerFragment extends LightCycleSupportFragment
{

    PlayerPresenter controller;

    public PlayerFragment()
    {
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030094, viewgroup, false);
    }

    public void onPlayerSlide(float f)
    {
        controller.onPlayerSlide(f);
    }
}
