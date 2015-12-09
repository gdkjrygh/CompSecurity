// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.videos;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

// Referenced classes of package com.google.android.gms.games.ui.common.videos:
//            VideoRecordingOnboardingFragment

public abstract class VideoRecordingOnboardingActivity extends FragmentActivity
{

    public VideoRecordingOnboardingActivity()
    {
    }

    public abstract void logAction(int i);

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if ((VideoRecordingOnboardingFragment)super.mFragments.findFragmentByTag("VideoRecordingOnboardingFragTag") == null)
        {
            bundle = super.mFragments.beginTransaction();
            bundle.replace(0x1020002, new VideoRecordingOnboardingFragment(), "VideoRecordingOnboardingFragTag");
            bundle.commit();
        }
    }

    public boolean onSearchRequested()
    {
        return false;
    }
}
