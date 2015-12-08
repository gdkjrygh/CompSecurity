// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.users;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.optional.Optional;

public interface UserRecord
{

    public abstract String getAvatarUrl();

    public abstract String getCountry();

    public abstract Optional getDescription();

    public abstract Optional getDiscogsName();

    public abstract int getFollowersCount();

    public abstract Optional getMyspaceName();

    public abstract Urn getUrn();

    public abstract String getUsername();

    public abstract Optional getWebsiteName();

    public abstract Optional getWebsiteUrl();
}
