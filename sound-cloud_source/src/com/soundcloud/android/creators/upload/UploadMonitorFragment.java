// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

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
//            UploadMonitorPresenter

public class UploadMonitorFragment extends LightCycleSupportFragment
{

    UploadMonitorPresenter uploadMonitorPresenter;

    public UploadMonitorFragment()
    {
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public static Fragment create(Recording recording)
    {
        UploadMonitorFragment uploadmonitorfragment = new UploadMonitorFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("recording", recording);
        uploadmonitorfragment.setArguments(bundle);
        return uploadmonitorfragment;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300d9, viewgroup, false);
    }
}
