// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model.activities;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.soundcloud.android.activities.ActivityProperty;
import com.soundcloud.android.api.legacy.model.Playable;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.api.legacy.model.ScModel;
import com.soundcloud.android.api.legacy.model.behavior.Identifiable;
import com.soundcloud.android.api.legacy.model.behavior.Persisted;
import com.soundcloud.android.api.legacy.model.behavior.PlayableHolder;
import com.soundcloud.android.api.legacy.model.behavior.Refreshable;
import com.soundcloud.android.storage.provider.BulkInsertMap;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.java.collections.PropertySet;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.soundcloud.android.api.legacy.model.activities:
//            TrackLikeActivity, TrackRepostActivity, PlaylistLikeActivity, PlaylistRepostActivity, 
//            CommentActivity, UserMentionActivity, AffiliationActivity

public abstract class Activity extends ScModel
    implements Parcelable, Identifiable, Persisted, PlayableHolder, Refreshable, Comparable
{
    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type AFFILIATION;
        public static final Type COMMENT;
        public static final Type PLAYLIST_LIKE;
        public static final Type PLAYLIST_REPOST;
        public static final EnumSet PLAYLIST_TYPES;
        public static final Type TRACK_LIKE;
        public static final Type TRACK_REPOST;
        public static final Type USER_MENTION;
        public final Class activityClass;
        public final String type;

        public static Type fromString(String s)
        {
            Type atype[] = values();
            int j = atype.length;
            for (int i = 0; i < j; i++)
            {
                Type type1 = atype[i];
                if (type1.type.equals(s))
                {
                    return type1;
                }
            }

            throw new IllegalStateException((new StringBuilder("unknown type:")).append(s).toString());
        }

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/soundcloud/android/api/legacy/model/activities/Activity$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        public final Activity fromCursor(Cursor cursor)
        {
            try
            {
                cursor = (Activity)activityClass.getConstructor(new Class[] {
                    android/database/Cursor
                }).newInstance(new Object[] {
                    cursor
                });
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                throw new RuntimeException(cursor);
            }
            return cursor;
        }

        public final boolean isPlaylistActivity()
        {
            return PLAYLIST_TYPES.contains(this);
        }

        public final String toString()
        {
            return type;
        }

        static 
        {
            TRACK_LIKE = new Type("TRACK_LIKE", 0, "track-like", com/soundcloud/android/api/legacy/model/activities/TrackLikeActivity);
            TRACK_REPOST = new Type("TRACK_REPOST", 1, "track-repost", com/soundcloud/android/api/legacy/model/activities/TrackRepostActivity);
            PLAYLIST_LIKE = new Type("PLAYLIST_LIKE", 2, "playlist-like", com/soundcloud/android/api/legacy/model/activities/PlaylistLikeActivity);
            PLAYLIST_REPOST = new Type("PLAYLIST_REPOST", 3, "playlist-repost", com/soundcloud/android/api/legacy/model/activities/PlaylistRepostActivity);
            COMMENT = new Type("COMMENT", 4, "comment", com/soundcloud/android/api/legacy/model/activities/CommentActivity);
            USER_MENTION = new Type("USER_MENTION", 5, "user-mention", com/soundcloud/android/api/legacy/model/activities/UserMentionActivity);
            AFFILIATION = new Type("AFFILIATION", 6, "affiliation", com/soundcloud/android/api/legacy/model/activities/AffiliationActivity);
            $VALUES = (new Type[] {
                TRACK_LIKE, TRACK_REPOST, PLAYLIST_LIKE, PLAYLIST_REPOST, COMMENT, USER_MENTION, AFFILIATION
            });
            PLAYLIST_TYPES = EnumSet.of(PLAYLIST_LIKE, PLAYLIST_REPOST);
        }

        private Type(String s, int i, String s1, Class class1)
        {
            super(s, i);
            type = s1;
            activityClass = class1;
        }
    }


    static final long NUM_100NS_INTERVALS_SINCE_UUID_EPOCH = 0x1b21dd213814000L;
    protected Date createdAt;
    public String tags;
    public String uuid;

    public Activity()
    {
    }

    public Activity(Cursor cursor)
    {
        setId(cursor.getLong(cursor.getColumnIndex("_id")));
        uuid = cursor.getString(cursor.getColumnIndex("uuid"));
        tags = cursor.getString(cursor.getColumnIndex("tags"));
        createdAt = new Date(cursor.getLong(cursor.getColumnIndex("created_at")));
    }

    public Activity(Parcel parcel)
    {
        createdAt = new Date(parcel.readLong());
        tags = parcel.readString();
    }

    public ContentValues buildContentValues()
    {
        ContentValues contentvalues = super.buildContentValues();
        contentvalues.put("uuid", uuid);
        contentvalues.put("tags", tags);
        contentvalues.put("type", getType().type);
        if (createdAt != null)
        {
            contentvalues.put("created_at", Long.valueOf(createdAt.getTime()));
        }
        if (getUser() != null)
        {
            contentvalues.put("user_id", Long.valueOf(getUser().getId()));
        }
        if (getPlayable() != null)
        {
            contentvalues.put("sound_id", Long.valueOf(getPlayable().getId()));
            int i;
            if (getType().isPlaylistActivity())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            contentvalues.put("sound_type", Integer.valueOf(i));
        }
        return contentvalues;
    }

    public abstract void cacheDependencies();

    public int compareTo(Activity activity)
    {
        return activity.createdAt.compareTo(createdAt);
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Activity)obj);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Activity))
            {
                return false;
            }
            obj = (Activity)obj;
            if (createdAt == null ? ((Activity) (obj)).createdAt != null : !createdAt.equals(((Activity) (obj)).createdAt))
            {
                return false;
            }
            if (tags == null ? ((Activity) (obj)).tags != null : !tags.equals(((Activity) (obj)).tags))
            {
                return false;
            }
            if (uuid == null ? ((Activity) (obj)).uuid != null : !uuid.equals(((Activity) (obj)).uuid))
            {
                return false;
            }
        }
        return true;
    }

    public Uri getBulkInsertUri()
    {
        return Content.ME_ALL_ACTIVITIES.uri;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public List getDependentModels()
    {
        ArrayList arraylist = new ArrayList();
        Object obj = getUser();
        if (obj != null)
        {
            arraylist.add(obj);
        }
        obj = getPlayable();
        if (obj != null)
        {
            arraylist.add(obj);
            if (((Playable) (obj)).user != null)
            {
                arraylist.add(((Playable) (obj)).user);
            }
        }
        return arraylist;
    }

    public long getListItemId()
    {
        return (long)toUUID().hashCode();
    }

    public abstract Type getType();

    public abstract PublicApiUser getUser();

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (uuid != null)
        {
            i = uuid.hashCode();
        } else
        {
            i = 0;
        }
        if (createdAt != null)
        {
            j = createdAt.hashCode();
        } else
        {
            j = 0;
        }
        if (tags != null)
        {
            k = tags.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }

    public boolean isIncomplete()
    {
        return false;
    }

    public boolean isStale()
    {
        Refreshable refreshable = getRefreshableResource();
        if (equals(refreshable))
        {
            throw new IllegalArgumentException("Do not return the activity itself as the refreshable object");
        }
        return refreshable != null && refreshable.isStale();
    }

    public void putDependencyValues(BulkInsertMap bulkinsertmap)
    {
    }

    public void putFullContentValues(BulkInsertMap bulkinsertmap)
    {
    }

    public void setCreatedAt(Date date)
    {
        createdAt = date;
    }

    public String toGUID()
    {
        if (!TextUtils.isEmpty(uuid))
        {
            return uuid;
        }
        UUID uuid1 = toUUID();
        if (uuid1 == null)
        {
            return null;
        } else
        {
            return uuid1.toString();
        }
    }

    public PropertySet toPropertySet()
    {
        return PropertySet.create(5).put(ActivityProperty.DATE, createdAt).put(ActivityProperty.USER_NAME, getUser().getUsername()).put(ActivityProperty.USER_URN, getUser().getUrn());
    }

    public UUID toUUID()
    {
        if (!TextUtils.isEmpty(uuid))
        {
            return UUID.fromString(uuid);
        }
        if (createdAt != null)
        {
            long l = createdAt.getTime() * 10000L + 0x1b21dd213814000L;
            return new UUID((0xffffffffL & l) << 32 | (0xffff00000000L & l) >> 16 | 4096L | (l & 0xfff000000000000L) >> 48, 0xc000000000000000L);
        } else
        {
            return null;
        }
    }

    public Uri toUri()
    {
        return null;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(createdAt.getTime());
        String s;
        if (tags == null)
        {
            s = "";
        } else
        {
            s = tags;
        }
        parcel.writeString(s);
    }
}
