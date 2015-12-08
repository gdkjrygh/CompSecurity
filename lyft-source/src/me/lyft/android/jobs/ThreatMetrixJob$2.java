// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import com.threatmetrix.TrustDefenderMobile.ProfilingOptions;
import com.threatmetrix.TrustDefenderMobile.TrustDefenderMobile;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.location.GoogleLocationMapper;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.rx.SimpleSubscriber;

// Referenced classes of package me.lyft.android.jobs:
//            ThreatMetrixJob

class it> extends SimpleSubscriber
{

    final ThreatMetrixJob this$0;

    public volatile void onNext(Object obj)
    {
        onNext((Location)obj);
    }

    public void onNext(Location location)
    {
        super.onNext(location);
        ThreatMetrixJob.access$000(ThreatMetrixJob.this).a((new ProfilingOptions()).a(ThreatMetrixJob.access$100(ThreatMetrixJob.this).getId()).a(GoogleLocationMapper.toAndroidLocation(location)));
    }

    n()
    {
        this$0 = ThreatMetrixJob.this;
        super();
    }
}
