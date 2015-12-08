// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.model.behavior.PlayableHolder;
import com.soundcloud.android.api.legacy.model.behavior.Refreshable;
import com.soundcloud.android.api.legacy.model.behavior.RelatesToUser;
import com.soundcloud.android.api.model.Sharing;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.provider.BulkInsertMap;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.utils.ScTextUtils;
import com.soundcloud.android.utils.images.ImageUtils;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            PublicApiResource, ScModelManager, PublicApiUser

public abstract class Playable extends PublicApiResource
    implements Parcelable, PlayableHolder, Refreshable, RelatesToUser, PropertySetSource
{

    public static final int DB_TYPE_PLAYLIST = 1;
    public static final int DB_TYPE_TRACK = 0;
    private static final Pattern TAG_PATTERN = Pattern.compile("(\"([^\"]+)\")");
    protected String artworkUri;
    public String artwork_url;
    public Date created_at;
    public String description;
    public boolean downloadable;
    public long duration;
    public String ean;
    protected CharSequence elapsedTime;
    public String embeddable_by;
    public String genre;
    public int label_id;
    public String label_name;
    public String license;
    public int likes_count;
    public String permalink;
    public String permalink_url;
    public String purchase_title;
    public String purchase_url;
    public String release;
    public int release_day;
    public int release_month;
    public int release_year;
    public int reposts_count;
    public int shared_to_count;
    public Sharing sharing;
    public boolean streamable;
    public String tag_list;
    public String title;
    public String type;
    public String uri;
    public PublicApiUser user;
    public long user_id;
    public boolean user_like;
    public boolean user_repost;

    public Playable()
    {
        duration = -1L;
        label_id = -1;
        release_day = -1;
        release_year = -1;
        release_month = -1;
        likes_count = -1;
        reposts_count = -1;
        shared_to_count = -1;
        sharing = Sharing.UNDEFINED;
    }

    public Playable(long l)
    {
        super(l);
        duration = -1L;
        label_id = -1;
        release_day = -1;
        release_year = -1;
        release_month = -1;
        likes_count = -1;
        reposts_count = -1;
        shared_to_count = -1;
        sharing = Sharing.UNDEFINED;
    }

    public Playable(Cursor cursor)
    {
        boolean flag1 = true;
        super();
        duration = -1L;
        label_id = -1;
        release_day = -1;
        release_year = -1;
        release_month = -1;
        likes_count = -1;
        reposts_count = -1;
        shared_to_count = -1;
        sharing = Sharing.UNDEFINED;
        int i;
        long l;
        boolean flag;
        if (cursor.getColumnIndex("sound_id") == -1)
        {
            setId(cursor.getLong(cursor.getColumnIndex("_id")));
        } else
        {
            setId(cursor.getLong(cursor.getColumnIndex("sound_id")));
        }
        permalink = cursor.getString(cursor.getColumnIndex("permalink"));
        duration = cursor.getLong(cursor.getColumnIndex("duration"));
        created_at = new Date(cursor.getLong(cursor.getColumnIndex("created_at")));
        tag_list = cursor.getString(cursor.getColumnIndex("tag_list"));
        title = cursor.getString(cursor.getColumnIndex("title"));
        permalink_url = cursor.getString(cursor.getColumnIndex("permalink_url"));
        artwork_url = cursor.getString(cursor.getColumnIndex("artwork_url"));
        if (cursor.getInt(cursor.getColumnIndex("downloadable")) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        downloadable = flag;
        if (cursor.getInt(cursor.getColumnIndex("streamable")) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        streamable = flag;
        sharing = Sharing.from(cursor.getString(cursor.getColumnIndex("sharing")));
        license = cursor.getString(cursor.getColumnIndex("license"));
        genre = cursor.getString(cursor.getColumnIndex("genre"));
        likes_count = getIntOrNotSet(cursor, "favoritings_count");
        reposts_count = getIntOrNotSet(cursor, "reposts_count");
        user_id = cursor.getInt(cursor.getColumnIndex("sound_user_id"));
        l = cursor.getLong(cursor.getColumnIndex("last_updated"));
        if (l > 0L)
        {
            last_updated = l;
        }
        i = cursor.getColumnIndex("sound_user_like");
        if (i != -1)
        {
            if (cursor.getInt(i) == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            user_like = flag;
        }
        i = cursor.getColumnIndex("sound_user_repost");
        if (i != -1)
        {
            if (cursor.getInt(i) == 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            user_repost = flag;
        }
        user = SoundCloudApplication.sModelManager.getCachedUserFromSoundViewCursor(cursor);
    }

    protected static int getIntOrNotSet(Cursor cursor, String s)
    {
        int i = cursor.getColumnIndex(s);
        if (cursor.isNull(i))
        {
            return -1;
        } else
        {
            return cursor.getInt(i);
        }
    }

    protected static boolean isTrackCursor(Cursor cursor)
    {
        return cursor.getInt(cursor.getColumnIndex("_type")) == 0;
    }

    public ContentValues buildContentValues()
    {
        ContentValues contentvalues;
        contentvalues = super.buildContentValues();
        contentvalues.put("permalink", permalink);
        contentvalues.put("_type", Integer.valueOf(getTypeId()));
        if (title != null)
        {
            contentvalues.put("title", title);
        } else
        {
            ErrorUtils.handleSilentException(new IllegalStateException((new StringBuilder("Attempting to insert a playable with a null title; id=")).append(getId()).toString()));
        }
        if (duration > 0L)
        {
            contentvalues.put("duration", Long.valueOf(duration));
        }
        if (user_id == 0L) goto _L2; else goto _L1
_L1:
        contentvalues.put("user_id", Long.valueOf(user_id));
_L4:
        if (created_at != null)
        {
            contentvalues.put("created_at", Long.valueOf(created_at.getTime()));
        }
        if (tag_list != null)
        {
            contentvalues.put("tag_list", tag_list);
        }
        if (permalink_url != null)
        {
            contentvalues.put("permalink_url", permalink_url);
        }
        if (artwork_url != null)
        {
            contentvalues.put("artwork_url", artwork_url);
        }
        if (downloadable)
        {
            contentvalues.put("downloadable", Boolean.valueOf(downloadable));
        }
        if (streamable)
        {
            contentvalues.put("streamable", Boolean.valueOf(streamable));
        }
        if (sharing != Sharing.UNDEFINED)
        {
            contentvalues.put("sharing", sharing.value);
        }
        if (license != null)
        {
            contentvalues.put("license", license);
        }
        if (genre != null)
        {
            contentvalues.put("genre", genre);
        }
        if (likes_count != -1)
        {
            contentvalues.put("favoritings_count", Integer.valueOf(likes_count));
        }
        if (reposts_count != -1)
        {
            contentvalues.put("reposts_count", Integer.valueOf(reposts_count));
        }
        return contentvalues;
_L2:
        if (user != null && user.isSaved())
        {
            contentvalues.put("user_id", Long.valueOf(user.getId()));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getArtwork()
    {
        if (shouldLoadArtwork())
        {
            return artwork_url;
        }
        if (user != null && user.shouldLoadIcon())
        {
            return user.avatar_url;
        } else
        {
            return null;
        }
    }

    public Bundle getBundle()
    {
        Bundle bundle = new Bundle();
        bundle.putLong("id", getId());
        bundle.putString("title", title);
        bundle.putParcelable("user", user);
        bundle.putString("uri", uri);
        bundle.putLong("user_id", user_id);
        bundle.putString("artwork_url", artwork_url);
        bundle.putString("permalink", permalink);
        bundle.putString("permalink_url", permalink_url);
        bundle.putBoolean("user_like", user_like);
        bundle.putBoolean("user_repost", user_repost);
        bundle.putLong("duration", duration);
        long l;
        if (created_at != null)
        {
            l = created_at.getTime();
        } else
        {
            l = -1L;
        }
        bundle.putLong("created_at", l);
        bundle.putBoolean("streamable", streamable);
        bundle.putBoolean("downloadable", downloadable);
        bundle.putString("license", license);
        bundle.putInt("label_id", label_id);
        bundle.putString("purchase_url", purchase_url);
        bundle.putString("label_name", label_name);
        bundle.putString("ean", ean);
        bundle.putString("release", release);
        bundle.putString("description", description);
        bundle.putString("genre", genre);
        bundle.putString("type", type);
        bundle.putInt("release_day", release_day);
        bundle.putInt("release_year", release_year);
        bundle.putInt("release_month", release_month);
        bundle.putString("purchase_title", purchase_title);
        bundle.putString("embeddable_by", embeddable_by);
        bundle.putInt("likes_count", likes_count);
        bundle.putInt("reposts_count", reposts_count);
        bundle.putString("tag_list", tag_list);
        bundle.putString("sharing", sharing.value());
        bundle.putCharSequence("elapsedTime", elapsedTime);
        bundle.putString("list_artwork_uri", artworkUri);
        return bundle;
    }

    public Date getCreatedAt()
    {
        return created_at;
    }

    public Playable getPlayable()
    {
        return this;
    }

    public Sharing getSharing()
    {
        return sharing;
    }

    public String getTitle()
    {
        return title;
    }

    public abstract int getTypeId();

    public PublicApiUser getUser()
    {
        return user;
    }

    public long getUserId()
    {
        if (user != null)
        {
            return user.getId();
        } else
        {
            return user_id;
        }
    }

    public Urn getUserUrn()
    {
        if (user != null)
        {
            return user.getUrn();
        } else
        {
            return Urn.forUser(user_id);
        }
    }

    public String getUsername()
    {
        if (user != null)
        {
            return user.username;
        } else
        {
            return "";
        }
    }

    public boolean hasAvatar()
    {
        return user != null && user.hasAvatarUrl();
    }

    public List humanTags()
    {
        ArrayList arraylist = new ArrayList();
        if (tag_list != null)
        {
            Matcher matcher;
            for (matcher = TAG_PATTERN.matcher(tag_list); matcher.find(); arraylist.add(tag_list.substring(matcher.start(2), matcher.end(2)).trim())) { }
            String as[] = matcher.replaceAll("").split("\\s");
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                String s = as[i];
                if (!TextUtils.isEmpty(s) && s.indexOf(':') == -1 && s.indexOf('=') == -1)
                {
                    arraylist.add(s);
                }
                i++;
            }
        }
        return arraylist;
    }

    public boolean isIncomplete()
    {
        return user == null || user.isIncomplete();
    }

    public boolean isPrivate()
    {
        return sharing.isPrivate();
    }

    public boolean isPublic()
    {
        return sharing.isPublic();
    }

    public boolean isStale()
    {
        return false;
    }

    public void putDependencyValues(BulkInsertMap bulkinsertmap)
    {
        if (user != null)
        {
            user.putFullContentValues(bulkinsertmap);
        }
    }

    public void readFromBundle(Bundle bundle)
    {
        setId(bundle.getLong("id"));
        title = bundle.getString("title");
        user = (PublicApiUser)bundle.getParcelable("user");
        uri = bundle.getString("uri");
        user_id = bundle.getLong("user_id");
        artwork_url = bundle.getString("artwork_url");
        permalink = bundle.getString("permalink");
        permalink_url = bundle.getString("permalink_url");
        user_like = bundle.getBoolean("user_like");
        user_repost = bundle.getBoolean("user_repost");
        duration = bundle.getLong("duration");
        Date date;
        if (bundle.getLong("created_at") == -1L)
        {
            date = null;
        } else
        {
            date = new Date(bundle.getLong("created_at"));
        }
        created_at = date;
        streamable = bundle.getBoolean("streamable");
        downloadable = bundle.getBoolean("downloadable");
        license = bundle.getString("license");
        label_id = bundle.getInt("label_id");
        purchase_url = bundle.getString("purchase_url");
        label_name = bundle.getString("label_name");
        ean = bundle.getString("ean");
        release = bundle.getString("release");
        description = bundle.getString("description");
        genre = bundle.getString("genre");
        type = bundle.getString("type");
        release_day = bundle.getInt("release_day");
        release_year = bundle.getInt("release_year");
        release_month = bundle.getInt("release_month");
        purchase_title = bundle.getString("purchase_title");
        embeddable_by = bundle.getString("embeddable_by");
        likes_count = bundle.getInt("likes_count");
        reposts_count = bundle.getInt("reposts_count");
        tag_list = bundle.getString("tag_list");
        sharing = Sharing.from(bundle.getString("sharing"));
        elapsedTime = bundle.getCharSequence("elapsedTime");
        artworkUri = bundle.getString("list_artwork_uri");
    }

    public void refreshTimeSinceCreated(Context context)
    {
        if (created_at != null)
        {
            elapsedTime = ScTextUtils.formatTimeElapsed(context.getResources(), created_at.getTime());
        }
    }

    public void setCreatedAt(Date date)
    {
        created_at = date;
    }

    public void setPermalinkUrl(String s)
    {
        permalink_url = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setUser(PublicApiUser publicapiuser)
    {
        user = publicapiuser;
    }

    public boolean shouldLoadArtwork()
    {
        return ImageUtils.checkIconShouldLoad(artwork_url);
    }

    public PropertySet toPropertySet()
    {
        if (title == null)
        {
            ErrorUtils.handleSilentException(new IllegalStateException((new StringBuilder("Attempting to create PropertySet with a null title; urn=")).append(getUrn()).toString()));
        }
        PropertyBinding propertybinding = PlayableProperty.DURATION.bind(Long.valueOf(duration));
        Object obj1 = PlayableProperty.TITLE;
        Object obj;
        PropertyBinding propertybinding1;
        PropertyBinding propertybinding2;
        PropertyBinding propertybinding3;
        PropertyBinding propertybinding4;
        PropertyBinding propertybinding5;
        PropertyBinding propertybinding6;
        PropertyBinding propertybinding7;
        Object obj2;
        Property property;
        if (title == null)
        {
            obj = "";
        } else
        {
            obj = title;
        }
        obj1 = ((Property) (obj1)).bind(obj);
        propertybinding1 = PlayableProperty.URN.bind(getUrn());
        propertybinding2 = PlayableProperty.CREATOR_URN.bind(getUserUrn());
        propertybinding3 = PlayableProperty.IS_PRIVATE.bind(Boolean.valueOf(sharing.isPrivate()));
        propertybinding4 = PlayableProperty.REPOSTS_COUNT.bind(Integer.valueOf(reposts_count));
        propertybinding5 = PlayableProperty.LIKES_COUNT.bind(Integer.valueOf(likes_count));
        propertybinding6 = PlayableProperty.IS_REPOSTED.bind(Boolean.valueOf(user_repost));
        propertybinding7 = PlayableProperty.IS_LIKED.bind(Boolean.valueOf(user_like));
        obj2 = PlayableProperty.CREATED_AT;
        if (created_at == null)
        {
            obj = new Date();
        } else
        {
            obj = created_at;
        }
        obj2 = ((Property) (obj2)).bind(obj);
        property = PlayableProperty.CREATOR_NAME;
        if (user != null && user.getUsername() != null)
        {
            obj = user.getUsername();
        } else
        {
            obj = "";
        }
        return PropertySet.from(new PropertyBinding[] {
            propertybinding, obj1, propertybinding1, propertybinding2, propertybinding3, propertybinding4, propertybinding5, propertybinding6, propertybinding7, obj2, 
            property.bind(obj)
        });
    }

    public Playable updateFrom(Playable playable, PublicApiResource.CacheUpdateMode cacheupdatemode)
    {
        setId(playable.getId());
        title = playable.title;
        permalink = playable.permalink;
        user_id = playable.user_id;
        uri = playable.uri;
        if (cacheupdatemode == PublicApiResource.CacheUpdateMode.FULL)
        {
            duration = playable.duration;
            sharing = playable.sharing;
            streamable = playable.streamable;
            downloadable = playable.downloadable;
            artwork_url = playable.artwork_url;
            permalink_url = playable.permalink_url;
            user = playable.user;
            likes_count = playable.likes_count;
            reposts_count = playable.reposts_count;
            created_at = playable.created_at;
            description = playable.description;
            tag_list = playable.tag_list;
            license = playable.license;
            label_id = playable.label_id;
            label_name = playable.label_name;
            ean = playable.ean;
            genre = playable.genre;
            type = playable.type;
            purchase_url = playable.purchase_url;
            purchase_title = playable.purchase_title;
            release = playable.release;
            release_day = playable.release_day;
            release_year = playable.release_year;
            release_month = playable.release_month;
            embeddable_by = playable.embeddable_by;
            elapsedTime = null;
            artworkUri = null;
            last_updated = playable.last_updated;
        }
        return this;
    }

}
