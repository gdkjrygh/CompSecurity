// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.analytics.AnalyticsConnector;
import com.soundcloud.lightcycle.LightCycleAppCompatActivity;
import dagger.b;

// Referenced classes of package com.soundcloud.android.main:
//            ActivityLifeCyclePublisher

public abstract class TrackedActivity extends LightCycleAppCompatActivity
{

    AnalyticsConnector analyticsConnector;
    ActivityLifeCyclePublisher lifeCyclePublisher;

    public TrackedActivity()
    {
        SoundCloudApplication.getObjectGraph().a(this);
    }
}
