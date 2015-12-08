// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.legacy.model.behavior.Refreshable;
import com.soundcloud.android.api.model.ApiUser;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.users.UserProperty;
import com.soundcloud.android.users.UserRecord;
import com.soundcloud.android.utils.ScTextUtils;
import com.soundcloud.android.utils.images.ImageUtils;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.optional.Optional;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            PublicApiResource, UserHolder, Plan

public class PublicApiUser extends PublicApiResource
    implements UserHolder, PropertySetSource, UserRecord
{
    public static interface DataKeys
    {

        public static final String FRIEND_FINDER_NO_FRIENDS_SHOWN = "friend_finder_no_friends_shown";
        public static final String SEEN_CREATE_AUTOSAVE = "seenCreateAutoSave";
    }


    public static final PublicApiUser CRAWLER_USER = new PublicApiUser(-2L, "SoundCloud");
    public static final int CRAWLER_USER_ID = -2;
    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String EXTRA = "user";
    public static final int TYPE = 0;
    public String _list_avatar_uri;
    public String avatar_url;
    private String city;
    private String country;
    public String description;
    public String discogs_name;
    public int followers_count;
    public int followings_count;
    public String full_name;
    public String myspace_name;
    public String permalink;
    public String permalink_url;
    public String plan;
    private Boolean primary_email_confirmed;
    public int private_tracks_count;
    public int public_likes_count;
    public int track_count;
    public String uri;
    public boolean user_follower;
    public boolean user_following;
    public String username;
    public String website;
    public String website_title;

    public PublicApiUser()
    {
        track_count = -1;
        followers_count = -1;
        followings_count = -1;
        private_tracks_count = -1;
        public_likes_count = -1;
    }

    public PublicApiUser(long l)
    {
        super(l);
        track_count = -1;
        followers_count = -1;
        followings_count = -1;
        private_tracks_count = -1;
        public_likes_count = -1;
    }

    public PublicApiUser(long l, String s)
    {
        super(l);
        track_count = -1;
        followers_count = -1;
        followings_count = -1;
        private_tracks_count = -1;
        public_likes_count = -1;
        username = s;
        permalink = s;
    }

    public PublicApiUser(Cursor cursor)
    {
        track_count = -1;
        followers_count = -1;
        followings_count = -1;
        private_tracks_count = -1;
        public_likes_count = -1;
        updateFromCursor(cursor);
    }

    public PublicApiUser(Parcel parcel)
    {
        track_count = -1;
        followers_count = -1;
        followings_count = -1;
        private_tracks_count = -1;
        public_likes_count = -1;
        parcel = parcel.readBundle(getClass().getClassLoader());
        username = parcel.getString("username");
        uri = parcel.getString("uri");
        avatar_url = parcel.getString("avatar_url");
        permalink = parcel.getString("permalink");
        permalink_url = parcel.getString("permalink_url");
        full_name = parcel.getString("full_name");
        description = parcel.getString("description");
        city = parcel.getString("city");
        country = parcel.getString("country");
        plan = parcel.getString("plan");
        website = parcel.getString("website");
        website_title = parcel.getString("website_title");
        myspace_name = parcel.getString("myspace_name");
        discogs_name = parcel.getString("discogs_name");
        track_count = parcel.getInt("track_count");
        followers_count = parcel.getInt("followers_count");
        followings_count = parcel.getInt("followings_count");
        public_likes_count = parcel.getInt("public_likes_count");
        private_tracks_count = parcel.getInt("private_tracks_count");
        setId(parcel.getLong("id"));
    }

    public PublicApiUser(UserRecord userrecord)
    {
        track_count = -1;
        followers_count = -1;
        followings_count = -1;
        private_tracks_count = -1;
        public_likes_count = -1;
        setUrn(userrecord.getUrn().toString());
        setUsername(userrecord.getUsername());
        avatar_url = userrecord.getAvatarUrl();
    }

    public PublicApiUser(String s)
    {
        super(s);
        track_count = -1;
        followers_count = -1;
        followings_count = -1;
        private_tracks_count = -1;
        public_likes_count = -1;
    }

    public static PublicApiUser fromActivityView(Cursor cursor)
    {
        PublicApiUser publicapiuser = new PublicApiUser();
        publicapiuser.setId(cursor.getLong(cursor.getColumnIndex("user_id")));
        publicapiuser.username = cursor.getString(cursor.getColumnIndex("activity_user_username"));
        publicapiuser.permalink = cursor.getString(cursor.getColumnIndex("activity_user_permalink"));
        publicapiuser.avatar_url = cursor.getString(cursor.getColumnIndex("activity_user_avatar_url"));
        return publicapiuser;
    }

    public static PublicApiUser fromSoundView(Cursor cursor)
    {
        PublicApiUser publicapiuser = new PublicApiUser();
        publicapiuser.setId(cursor.getLong(cursor.getColumnIndex("sound_user_id")));
        publicapiuser.username = cursor.getString(cursor.getColumnIndex("sound_user_username"));
        publicapiuser.permalink = cursor.getString(cursor.getColumnIndex("sound_user_permalink"));
        publicapiuser.avatar_url = cursor.getString(cursor.getColumnIndex("sound_user_avatar_url"));
        return publicapiuser;
    }

    public boolean addAFollower()
    {
        if (isFollowersCountSet())
        {
            followers_count = followers_count + 1;
            return true;
        } else
        {
            return false;
        }
    }

    public ContentValues buildContentValues()
    {
        ContentValues contentvalues = super.buildContentValues();
        if (username != null)
        {
            contentvalues.put("username", username);
        }
        if (permalink != null)
        {
            contentvalues.put("permalink", permalink);
        }
        if (avatar_url != null)
        {
            contentvalues.put("avatar_url", avatar_url);
        }
        if (permalink_url != null)
        {
            contentvalues.put("permalink_url", permalink_url);
        }
        if (track_count != -1)
        {
            contentvalues.put("track_count", Integer.valueOf(track_count));
        }
        if (public_likes_count != -1)
        {
            contentvalues.put("public_favorites_count", Integer.valueOf(public_likes_count));
        }
        if (city != null)
        {
            contentvalues.put("city", city);
        }
        if (country != null)
        {
            contentvalues.put("country", country);
        }
        if (discogs_name != null)
        {
            contentvalues.put("discogs_name", discogs_name);
        }
        if (full_name != null)
        {
            contentvalues.put("full_name", full_name);
        }
        if (myspace_name != null)
        {
            contentvalues.put("myspace_name", myspace_name);
        }
        if (followers_count != -1)
        {
            contentvalues.put("followers_count", Integer.valueOf(followers_count));
        }
        if (followings_count != -1)
        {
            contentvalues.put("followings_count", Integer.valueOf(followings_count));
        }
        if (track_count != -1)
        {
            contentvalues.put("track_count", Integer.valueOf(track_count));
        }
        if (website != null)
        {
            contentvalues.put("website", website);
        }
        if (website_title != null)
        {
            contentvalues.put("website_title", website_title);
        }
        if (plan != null)
        {
            contentvalues.put("plan", plan);
        }
        if (private_tracks_count != -1)
        {
            contentvalues.put("private_tracks_count", Integer.valueOf(private_tracks_count));
        }
        if (primary_email_confirmed != null)
        {
            int i;
            if (primary_email_confirmed.booleanValue())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            contentvalues.put("primary_email_confirmed", Integer.valueOf(i));
        }
        if (getId() != -1L && getId() == SoundCloudApplication.instance.getAccountOperations().getLoggedInUserId() && description != null)
        {
            contentvalues.put("description", description);
        }
        contentvalues.put("last_updated", Long.valueOf(System.currentTimeMillis()));
        return contentvalues;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAvatarUrl()
    {
        return avatar_url;
    }

    public Uri getBulkInsertUri()
    {
        return Content.USERS.uri;
    }

    public String getCity()
    {
        return city;
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
        return Optional.fromNullable(discogs_name);
    }

    public String getDisplayName()
    {
        if (!TextUtils.isEmpty(username))
        {
            return username;
        }
        if (!TextUtils.isEmpty(permalink))
        {
            return permalink;
        } else
        {
            return "";
        }
    }

    public int getFollowersCount()
    {
        return followers_count;
    }

    public String getLocation()
    {
        return ScTextUtils.getLocation(city, country);
    }

    public Optional getMyspaceName()
    {
        return Optional.fromNullable(myspace_name);
    }

    public String getNonDefaultAvatarUrl()
    {
        if (shouldLoadIcon())
        {
            return avatar_url;
        } else
        {
            return null;
        }
    }

    public String getPermalink()
    {
        return permalink;
    }

    public Plan getPlan()
    {
        return Plan.fromApi(plan);
    }

    public Refreshable getRefreshableResource()
    {
        return this;
    }

    public PublicApiUser getUser()
    {
        return this;
    }

    public String getUsername()
    {
        return username;
    }

    public String getWebSiteTitle()
    {
        if (!TextUtils.isEmpty(website_title))
        {
            return website_title;
        }
        if (!TextUtils.isEmpty(website))
        {
            return website.replace("http://www.", "").replace("http://", "");
        } else
        {
            return null;
        }
    }

    public Optional getWebsiteName()
    {
        return Optional.fromNullable(website_title);
    }

    public Optional getWebsiteUrl()
    {
        return Optional.fromNullable(website);
    }

    public boolean hasAvatarUrl()
    {
        return !TextUtils.isEmpty(avatar_url);
    }

    public boolean isCrawler()
    {
        return getId() == -2L;
    }

    public boolean isFollowersCountSet()
    {
        return followers_count >= 0;
    }

    public boolean isIncomplete()
    {
        return getId() <= 0L;
    }

    public boolean isPrimaryEmailConfirmed()
    {
        return primary_email_confirmed == null || primary_email_confirmed.booleanValue();
    }

    public boolean isStale()
    {
        return System.currentTimeMillis() - last_updated > com.soundcloud.android.Consts.ResourceStaleTimes.USER;
    }

    public boolean removeAFollower()
    {
        if (isFollowersCountSet())
        {
            followers_count = followers_count - 1;
            return true;
        } else
        {
            return false;
        }
    }

    public void setAppFields(PublicApiUser publicapiuser)
    {
        user_follower = publicapiuser.user_follower;
        user_following = publicapiuser.user_following;
    }

    public void setAvatarUrl(String s)
    {
        avatar_url = s;
    }

    public final void setCity(String s)
    {
        city = s;
    }

    public final void setCountry(String s)
    {
        country = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setDiscogsName(String s)
    {
        discogs_name = s;
    }

    public void setId(long l)
    {
        super.setId(l);
        urn = Urn.forUser(l);
    }

    public void setMyspaceName(String s)
    {
        myspace_name = s;
    }

    public final void setPermalink(String s)
    {
        permalink = s;
    }

    public void setPrimaryEmailConfirmed(boolean flag)
    {
        primary_email_confirmed = Boolean.valueOf(flag);
    }

    public final void setUsername(String s)
    {
        username = s;
    }

    public void setWebsite(String s)
    {
        website = s;
    }

    public void setWebsiteTitle(String s)
    {
        website_title = s;
    }

    public boolean shouldLoadIcon()
    {
        return ImageUtils.checkIconShouldLoad(avatar_url);
    }

    public ApiUser toApiMobileUser()
    {
        ApiUser apiuser = new ApiUser();
        apiuser.setUrn(getUrn());
        apiuser.setAvatarUrl(avatar_url);
        apiuser.setCountry(country);
        apiuser.setFollowersCount(followers_count);
        apiuser.setUsername(username);
        apiuser.setDescription(description);
        apiuser.setWebsiteUrl(website);
        apiuser.setWebsiteTitle(website_title);
        apiuser.setMyspaceName(myspace_name);
        apiuser.setDiscogsName(discogs_name);
        return apiuser;
    }

    public PropertySet toPropertySet()
    {
        PropertySet propertyset = PropertySet.from(new PropertyBinding[] {
            UserProperty.URN.bind(getUrn()), UserProperty.USERNAME.bind(username), UserProperty.FOLLOWERS_COUNT.bind(Integer.valueOf(followers_count)), UserProperty.ID.bind(Long.valueOf(getId()))
        });
        if (country != null)
        {
            propertyset.put(UserProperty.COUNTRY, country);
        }
        return propertyset;
    }

    public String toString()
    {
        return (new StringBuilder("User[id=")).append(getId()).append(", username='").append(username).append('\'').append(", track_count='").append(track_count).append('\'').append(", discogs_name='").append(discogs_name).append('\'').append(", city='").append(city).append('\'').append(", uri='").append(uri).append('\'').append(", avatar_url='").append(avatar_url).append('\'').append(", website_title='").append(website_title).append('\'').append(", website='").append(website).append('\'').append(", description='").append(description).append('\'').append(", permalink='").append(permalink).append('\'').append(", permalink_url='").append(permalink_url).append('\'').append(", full_name='").append(full_name).append('\'').append(", followers_count='").append(followers_count).append('\'').append(", followings_count='").append(followings_count).append('\'').append(", public_likes_count='").append(public_likes_count).append('\'').append(", private_tracks_count='").append(private_tracks_count).append('\'').append(", myspace_name='").append(myspace_name).append('\'').append(", country='").append(country).append('\'').append(", plan='").append(plan).append('\'').append(", primary_email_confirmed=").append(primary_email_confirmed).append(']').toString();
    }

    public Uri toUri()
    {
        return Content.USERS.forId(getId());
    }

    public PublicApiUser updateFrom(PublicApiUser publicapiuser, PublicApiResource.CacheUpdateMode cacheupdatemode)
    {
        setId(publicapiuser.getId());
        username = publicapiuser.username;
        if (publicapiuser.avatar_url != null)
        {
            avatar_url = publicapiuser.avatar_url;
        }
        if (publicapiuser.permalink != null)
        {
            permalink = publicapiuser.permalink;
        }
        if (publicapiuser.full_name != null)
        {
            full_name = publicapiuser.full_name;
        }
        if (publicapiuser.city != null)
        {
            city = publicapiuser.city;
        }
        if (publicapiuser.country != null)
        {
            country = publicapiuser.country;
        }
        if (publicapiuser.track_count != -1)
        {
            track_count = publicapiuser.track_count;
        }
        if (publicapiuser.followers_count != -1)
        {
            followers_count = publicapiuser.followers_count;
        }
        if (publicapiuser.followings_count != -1)
        {
            followings_count = publicapiuser.followings_count;
        }
        if (publicapiuser.public_likes_count != -1)
        {
            public_likes_count = publicapiuser.public_likes_count;
        }
        if (publicapiuser.private_tracks_count != -1)
        {
            private_tracks_count = publicapiuser.private_tracks_count;
        }
        if (publicapiuser.discogs_name != null)
        {
            discogs_name = publicapiuser.discogs_name;
        }
        if (publicapiuser.myspace_name != null)
        {
            myspace_name = publicapiuser.myspace_name;
        }
        if (publicapiuser.description != null)
        {
            description = publicapiuser.description;
        }
        if (publicapiuser.primary_email_confirmed != null)
        {
            primary_email_confirmed = publicapiuser.primary_email_confirmed;
        }
        if (cacheupdatemode == PublicApiResource.CacheUpdateMode.FULL)
        {
            last_updated = publicapiuser.last_updated;
        }
        return this;
    }

    public PublicApiUser updateFromCursor(Cursor cursor)
    {
        boolean flag1 = true;
        setId(cursor.getLong(cursor.getColumnIndex("_id")));
        permalink = cursor.getString(cursor.getColumnIndex("permalink"));
        permalink_url = cursor.getString(cursor.getColumnIndex("permalink_url"));
        username = cursor.getString(cursor.getColumnIndex("username"));
        track_count = cursor.getInt(cursor.getColumnIndex("track_count"));
        discogs_name = cursor.getString(cursor.getColumnIndex("discogs_name"));
        city = cursor.getString(cursor.getColumnIndex("city"));
        avatar_url = cursor.getString(cursor.getColumnIndex("avatar_url"));
        full_name = cursor.getString(cursor.getColumnIndex("full_name"));
        followers_count = cursor.getInt(cursor.getColumnIndex("followers_count"));
        followings_count = cursor.getInt(cursor.getColumnIndex("followings_count"));
        myspace_name = cursor.getString(cursor.getColumnIndex("myspace_name"));
        country = cursor.getString(cursor.getColumnIndex("country"));
        boolean flag;
        if (cursor.getInt(cursor.getColumnIndex("user_follower")) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        user_follower = flag;
        if (cursor.getInt(cursor.getColumnIndex("user_following")) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        user_following = flag;
        last_updated = cursor.getLong(cursor.getColumnIndex("last_updated"));
        description = cursor.getString(cursor.getColumnIndex("description"));
        plan = cursor.getString(cursor.getColumnIndex("plan"));
        website = cursor.getString(cursor.getColumnIndex("website"));
        website_title = cursor.getString(cursor.getColumnIndex("website_title"));
        if (cursor.getInt(cursor.getColumnIndex("primary_email_confirmed")) == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        primary_email_confirmed = Boolean.valueOf(flag);
        public_likes_count = cursor.getInt(cursor.getColumnIndex("public_favorites_count"));
        private_tracks_count = cursor.getInt(cursor.getColumnIndex("private_tracks_count"));
        cursor = cursor.getString(cursor.getColumnIndex("description"));
        if (TextUtils.isEmpty(cursor))
        {
            description = cursor;
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putString("username", username);
        bundle.putString("uri", uri);
        bundle.putString("avatar_url", avatar_url);
        bundle.putString("permalink", permalink);
        bundle.putString("permalink_url", permalink_url);
        bundle.putString("full_name", full_name);
        bundle.putString("description", description);
        bundle.putString("city", city);
        bundle.putString("country", country);
        bundle.putString("plan", plan);
        bundle.putString("website", website);
        bundle.putString("website_title", website_title);
        bundle.putString("myspace_name", myspace_name);
        bundle.putString("discogs_name", discogs_name);
        bundle.putInt("track_count", track_count);
        bundle.putInt("followers_count", followers_count);
        bundle.putInt("followings_count", followings_count);
        bundle.putInt("public_likes_count", public_likes_count);
        bundle.putInt("private_tracks_count", private_tracks_count);
        bundle.putLong("id", getId());
        parcel.writeBundle(bundle);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final PublicApiUser createFromParcel(Parcel parcel)
        {
            return new PublicApiUser(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PublicApiUser[] newArray(int i)
        {
            return new PublicApiUser[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
