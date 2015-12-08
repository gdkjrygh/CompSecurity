// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.users.UserProperty;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.strings.Strings;

class ProfileUser
{

    private final PropertySet source;

    public ProfileUser(PropertySet propertyset)
    {
        source = propertyset;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof ProfileUser) && source.equals(((ProfileUser)obj).source);
    }

    public String getDescription()
    {
        return (String)source.getOrElseNull(UserProperty.DESCRIPTION);
    }

    public String getDiscogsName()
    {
        return (String)source.getOrElseNull(UserProperty.DISCOGS_NAME);
    }

    public long getFollowerCount()
    {
        return (long)((Integer)source.get(UserProperty.FOLLOWERS_COUNT)).intValue();
    }

    public String getMyspaceName()
    {
        return (String)source.getOrElseNull(UserProperty.MYSPACE_NAME);
    }

    public String getName()
    {
        return (String)source.get(UserProperty.USERNAME);
    }

    public Urn getUrn()
    {
        return (Urn)source.get(UserProperty.URN);
    }

    public String getWebsiteName()
    {
        return (String)source.getOrElseNull(UserProperty.WEBSITE_NAME);
    }

    public String getWebsiteUrl()
    {
        return (String)source.getOrElseNull(UserProperty.WEBSITE_URL);
    }

    public boolean hasDescription()
    {
        return source.contains(UserProperty.DESCRIPTION);
    }

    public boolean hasDetails()
    {
        return Strings.isNotBlank((CharSequence)source.getOrElseNull(UserProperty.DESCRIPTION)) || Strings.isNotBlank((CharSequence)source.getOrElseNull(UserProperty.DISCOGS_NAME)) || Strings.isNotBlank((CharSequence)source.getOrElseNull(UserProperty.WEBSITE_URL)) || Strings.isNotBlank((CharSequence)source.getOrElseNull(UserProperty.MYSPACE_NAME));
    }

    public int hashCode()
    {
        return source.hashCode();
    }

    public boolean isFollowed()
    {
        return ((Boolean)source.get(UserProperty.IS_FOLLOWED_BY_ME)).booleanValue();
    }
}
