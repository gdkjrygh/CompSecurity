// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.properties.FeatureFlags;
import dagger.Lazy;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfileApiDelegator, ProfileApi

public class ProfileModule
{

    public ProfileModule()
    {
    }

    ProfileApi provideProfileApi(Lazy lazy, Lazy lazy1, FeatureFlags featureflags)
    {
        return new ProfileApiDelegator(lazy, lazy1, featureflags);
    }
}
