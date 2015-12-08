// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model;

import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.users.UserProperty;
import com.soundcloud.android.users.UserRecord;
import com.soundcloud.android.users.UserRecordHolder;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.objects.MoreObjects;
import com.soundcloud.java.optional.Optional;

public class ApiUser
    implements PropertySetSource, UserRecord, UserRecordHolder
{

    private String avatarUrl;
    private String country;
    private String description;
    private String discogsName;
    private int followersCount;
    private String myspaceName;
    private Urn urn;
    private String username;
    private String website;
    private String websiteTitle;

    public ApiUser()
    {
    }

    ApiUser(Urn urn1)
    {
        urn = urn1;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (ApiUser)obj;
            return MoreObjects.equal(urn, ((ApiUser) (obj)).urn);
        }
    }

    public String getAvatarUrl()
    {
        return avatarUrl;
    }

    public String getCountry()
    {
        return country;
    }

    public Optional getDescription()
    {
        return Optional.fromNullable(description);
    }

    public Optional getDiscogsName()
    {
        return Optional.fromNullable(discogsName);
    }

    public int getFollowersCount()
    {
        return followersCount;
    }

    public long getId()
    {
        return urn.getNumericId();
    }

    public Optional getMyspaceName()
    {
        return Optional.fromNullable(myspaceName);
    }

    public Urn getUrn()
    {
        return urn;
    }

    public UserRecord getUserRecord()
    {
        return this;
    }

    public String getUsername()
    {
        return username;
    }

    public Optional getWebsiteName()
    {
        return Optional.fromNullable(websiteTitle);
    }

    public Optional getWebsiteUrl()
    {
        return Optional.fromNullable(website);
    }

    public int hashCode()
    {
        return urn.hashCode();
    }

    public void setAvatarUrl(String s)
    {
        avatarUrl = s;
    }

    public void setCountry(String s)
    {
        country = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setDiscogsName(String s)
    {
        discogsName = s;
    }

    public void setFollowersCount(int i)
    {
        followersCount = i;
    }

    public void setMyspaceName(String s)
    {
        myspaceName = s;
    }

    public void setUrn(Urn urn1)
    {
        urn = urn1;
    }

    public void setUsername(String s)
    {
        username = s;
    }

    public void setWebsiteTitle(String s)
    {
        websiteTitle = s;
    }

    public void setWebsiteUrl(String s)
    {
        website = s;
    }

    public PropertySet toPropertySet()
    {
        PropertySet propertyset = PropertySet.from(new PropertyBinding[] {
            UserProperty.URN.bind(urn), UserProperty.USERNAME.bind(username), UserProperty.FOLLOWERS_COUNT.bind(Integer.valueOf(followersCount))
        });
        if (country != null)
        {
            propertyset.put(UserProperty.COUNTRY, country);
        }
        return propertyset;
    }
}
