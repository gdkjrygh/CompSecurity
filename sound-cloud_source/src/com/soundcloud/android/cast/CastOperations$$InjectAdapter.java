// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import android.content.res.Resources;
import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.policies.PolicyOperations;
import com.soundcloud.android.tracks.TrackRepository;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.cast:
//            CastOperations

public final class deoCastManager extends b
    implements Provider
{

    private b imageOperations;
    private b policyOperations;
    private b progressPullIntervalScheduler;
    private b resources;
    private b trackRepository;
    private b videoCastManager;

    public final void attach(l l1)
    {
        videoCastManager = l1.a("com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager", com/soundcloud/android/cast/CastOperations, getClass().getClassLoader());
        trackRepository = l1.a("com.soundcloud.android.tracks.TrackRepository", com/soundcloud/android/cast/CastOperations, getClass().getClassLoader());
        policyOperations = l1.a("com.soundcloud.android.policies.PolicyOperations", com/soundcloud/android/cast/CastOperations, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/cast/CastOperations, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/cast/CastOperations, getClass().getClassLoader());
        progressPullIntervalScheduler = l1.a("@javax.inject.Named(value=LowPriority)/rx.Scheduler", com/soundcloud/android/cast/CastOperations, getClass().getClassLoader());
    }

    public final CastOperations get()
    {
        return new CastOperations((VideoCastManager)videoCastManager.get(), (TrackRepository)trackRepository.get(), (PolicyOperations)policyOperations.get(), (ImageOperations)imageOperations.get(), (Resources)resources.get(), (R)progressPullIntervalScheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(videoCastManager);
        set.add(trackRepository);
        set.add(policyOperations);
        set.add(imageOperations);
        set.add(resources);
        set.add(progressPullIntervalScheduler);
    }

    public deoCastManager()
    {
        super("com.soundcloud.android.cast.CastOperations", "members/com.soundcloud.android.cast.CastOperations", false, com/soundcloud/android/cast/CastOperations);
    }
}
