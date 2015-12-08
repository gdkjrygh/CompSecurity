// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.properties.FeatureFlags;
import dagger.Lazy;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfileApiDelegator

public final class  extends b
    implements Provider
{

    private b featureFlags;
    private b profileApiMobile;
    private b profileApiPublic;

    public final void attach(l l1)
    {
        profileApiPublic = l1.a("dagger.Lazy<com.soundcloud.android.profile.ProfileApiPublic>", com/soundcloud/android/profile/ProfileApiDelegator, getClass().getClassLoader());
        profileApiMobile = l1.a("dagger.Lazy<com.soundcloud.android.profile.ProfileApiMobile>", com/soundcloud/android/profile/ProfileApiDelegator, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/profile/ProfileApiDelegator, getClass().getClassLoader());
    }

    public final ProfileApiDelegator get()
    {
        return new ProfileApiDelegator((Lazy)profileApiPublic.get(), (Lazy)profileApiMobile.get(), (FeatureFlags)featureFlags.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(profileApiPublic);
        set.add(profileApiMobile);
        set.add(featureFlags);
    }

    public ()
    {
        super("com.soundcloud.android.profile.ProfileApiDelegator", "members/com.soundcloud.android.profile.ProfileApiDelegator", false, com/soundcloud/android/profile/ProfileApiDelegator);
    }
}
