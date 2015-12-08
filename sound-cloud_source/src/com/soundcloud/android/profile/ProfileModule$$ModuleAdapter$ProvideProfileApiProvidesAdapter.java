// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.properties.FeatureFlags;
import dagger.Lazy;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfileModule, ProfileApi

public static final class setLibrary extends t
    implements Provider
{

    private b featureFlags;
    private final ProfileModule module;
    private b profileApiPrivate;
    private b profileApiPublic;

    public final void attach(l l1)
    {
        profileApiPublic = l1.a("dagger.Lazy<com.soundcloud.android.profile.ProfileApiPublic>", com/soundcloud/android/profile/ProfileModule, getClass().getClassLoader());
        profileApiPrivate = l1.a("dagger.Lazy<com.soundcloud.android.profile.ProfileApiMobile>", com/soundcloud/android/profile/ProfileModule, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/profile/ProfileModule, getClass().getClassLoader());
    }

    public final ProfileApi get()
    {
        return module.provideProfileApi((Lazy)profileApiPublic.get(), (Lazy)profileApiPrivate.get(), (FeatureFlags)featureFlags.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(profileApiPublic);
        set.add(profileApiPrivate);
        set.add(featureFlags);
    }

    public (ProfileModule profilemodule)
    {
        super("com.soundcloud.android.profile.ProfileApi", false, "com.soundcloud.android.profile.ProfileModule", "provideProfileApi");
        module = profilemodule;
        setLibrary(false);
    }
}
