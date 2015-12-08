// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import dagger.b;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            MetadataPresenter

public class MetadataFragment extends LightCycleSupportFragment
{

    MetadataPresenter metadataPresenter;

    public MetadataFragment()
    {
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public static Fragment create()
    {
        return new MetadataFragment();
    }

    public static Fragment create(Recording recording)
    {
        MetadataFragment metadatafragment = new MetadataFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("recording", recording);
        metadatafragment.setArguments(bundle);
        return metadatafragment;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        metadataPresenter.onActivityResult(i, j, intent);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300a8, viewgroup, false);
    }
}
