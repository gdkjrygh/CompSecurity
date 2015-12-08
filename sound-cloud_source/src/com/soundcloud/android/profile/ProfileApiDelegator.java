// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import dagger.Lazy;
import rx.b;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfileApi, ProfileApiPublic, ProfileApiMobile

public class ProfileApiDelegator
    implements ProfileApi
{

    private final FeatureFlags featureFlags;
    private final Lazy profileApiMobile;
    private final Lazy profileApiPublic;

    public ProfileApiDelegator(Lazy lazy, Lazy lazy1, FeatureFlags featureflags)
    {
        profileApiPublic = lazy;
        profileApiMobile = lazy1;
        featureFlags = featureflags;
    }

    public b userFollowers(Urn urn)
    {
        return ((ProfileApiPublic)profileApiPublic.a()).userFollowers(urn);
    }

    public b userFollowers(String s)
    {
        return ((ProfileApiPublic)profileApiPublic.a()).userFollowers(s);
    }

    public b userFollowings(Urn urn)
    {
        return ((ProfileApiPublic)profileApiPublic.a()).userFollowings(urn);
    }

    public b userFollowings(String s)
    {
        return ((ProfileApiPublic)profileApiPublic.a()).userFollowings(s);
    }

    public b userLikes(Urn urn)
    {
        if (featureFlags.isEnabled(Flag.PROFILE_API_MOBILE))
        {
            return ((ProfileApiMobile)profileApiMobile.a()).userLikes(urn);
        } else
        {
            return ((ProfileApiPublic)profileApiPublic.a()).userLikes(urn);
        }
    }

    public b userLikes(String s)
    {
        if (featureFlags.isEnabled(Flag.PROFILE_API_MOBILE))
        {
            return ((ProfileApiMobile)profileApiMobile.a()).userLikes(s);
        } else
        {
            return ((ProfileApiPublic)profileApiPublic.a()).userLikes(s);
        }
    }

    public b userPlaylists(Urn urn)
    {
        return ((ProfileApiPublic)profileApiPublic.a()).userPlaylists(urn);
    }

    public b userPlaylists(String s)
    {
        return ((ProfileApiPublic)profileApiPublic.a()).userPlaylists(s);
    }

    public b userPosts(Urn urn)
    {
        if (featureFlags.isEnabled(Flag.PROFILE_API_MOBILE))
        {
            return ((ProfileApiMobile)profileApiMobile.a()).userPosts(urn);
        } else
        {
            return ((ProfileApiPublic)profileApiPublic.a()).userPosts(urn);
        }
    }

    public b userPosts(String s)
    {
        if (featureFlags.isEnabled(Flag.PROFILE_API_MOBILE))
        {
            return ((ProfileApiMobile)profileApiMobile.a()).userPosts(s);
        } else
        {
            return ((ProfileApiPublic)profileApiPublic.a()).userPosts(s);
        }
    }
}
