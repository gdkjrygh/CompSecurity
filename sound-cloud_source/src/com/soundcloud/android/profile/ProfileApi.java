// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.model.Urn;
import rx.b;

interface ProfileApi
{

    public static final int PAGE_SIZE = 30;

    public abstract b userFollowers(Urn urn);

    public abstract b userFollowers(String s);

    public abstract b userFollowings(Urn urn);

    public abstract b userFollowings(String s);

    public abstract b userLikes(Urn urn);

    public abstract b userLikes(String s);

    public abstract b userPlaylists(Urn urn);

    public abstract b userPlaylists(String s);

    public abstract b userPosts(Urn urn);

    public abstract b userPosts(String s);
}
