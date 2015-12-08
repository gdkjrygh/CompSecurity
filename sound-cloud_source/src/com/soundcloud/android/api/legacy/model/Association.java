// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.legacy.model.behavior.PlayableHolder;
import com.soundcloud.android.api.legacy.model.behavior.Refreshable;
import com.soundcloud.android.api.legacy.model.behavior.RelatesToUser;
import com.soundcloud.android.storage.provider.BulkInsertMap;
import com.soundcloud.android.storage.provider.Content;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            PublicApiResource, ScModelManager, PublicApiUser

public abstract class Association extends PublicApiResource
    implements PlayableHolder, Refreshable, RelatesToUser
{
    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type FOLLOWER;
        public static final Type FOLLOWING;
        public static final Type PLAYLIST;
        public static final Type PLAYLIST_LIKE;
        public static final Type PLAYLIST_REPOST;
        public static final Type TRACK;
        public static final Type TRACK_LIKE;
        public static final Type TRACK_REPOST;
        public final int collectionType;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/soundcloud/android/api/legacy/model/Association$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            TRACK = new Type("TRACK", 0, 0);
            TRACK_REPOST = new Type("TRACK_REPOST", 1, 7);
            TRACK_LIKE = new Type("TRACK_LIKE", 2, 1);
            PLAYLIST = new Type("PLAYLIST", 3, 8);
            PLAYLIST_REPOST = new Type("PLAYLIST_REPOST", 4, 7);
            PLAYLIST_LIKE = new Type("PLAYLIST_LIKE", 5, 1);
            FOLLOWING = new Type("FOLLOWING", 6, 2);
            FOLLOWER = new Type("FOLLOWER", 7, 3);
            $VALUES = (new Type[] {
                TRACK, TRACK_REPOST, TRACK_LIKE, PLAYLIST, PLAYLIST_REPOST, PLAYLIST_LIKE, FOLLOWING, FOLLOWER
            });
        }

        private Type(String s, int i, int j)
        {
            super(s, i);
            collectionType = j;
        }
    }


    public int associationType;
    public Date created_at;
    protected CharSequence elapsedTime;
    public PublicApiUser owner;

    public Association()
    {
    }

    public Association(int i)
    {
        this(i, new Date());
    }

    public Association(int i, Date date)
    {
        associationType = i;
        created_at = date;
    }

    public Association(Cursor cursor)
    {
        owner = SoundCloudApplication.sModelManager.getUser(cursor.getLong(cursor.getColumnIndex("association_owner_id")));
        created_at = new Date(cursor.getLong(cursor.getColumnIndex("association_timestamp")));
        associationType = cursor.getInt(cursor.getColumnIndex("association_type"));
    }

    public Association(Parcel parcel)
    {
        associationType = parcel.readInt();
        created_at = new Date(parcel.readLong());
        owner = (PublicApiUser)parcel.readParcelable(ClassLoader.getSystemClassLoader());
    }

    public ContentValues buildContentValues()
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("item_id", Long.valueOf(getItemId()));
        contentvalues.put("user_id", Long.valueOf(SoundCloudApplication.instance.getAccountOperations().getLoggedInUserId()));
        contentvalues.put("collection_type", Integer.valueOf(associationType));
        contentvalues.put("resource_type", Integer.valueOf(getResourceType()));
        contentvalues.put("created_at", Long.valueOf(created_at.getTime()));
        return contentvalues;
    }

    public Uri getBulkInsertUri()
    {
        return Content.UNKNOWN.uri;
    }

    protected abstract long getItemId();

    public abstract long getListItemId();

    protected abstract int getResourceType();

    public boolean isIncomplete()
    {
        Refreshable refreshable = getRefreshableResource();
        if (refreshable == null)
        {
            return true;
        } else
        {
            return refreshable.isIncomplete();
        }
    }

    public boolean isStale()
    {
        Refreshable refreshable = getRefreshableResource();
        if (refreshable == null)
        {
            return true;
        } else
        {
            return refreshable.isStale();
        }
    }

    public void putDependencyValues(BulkInsertMap bulkinsertmap)
    {
        if (owner != null)
        {
            owner.putFullContentValues(bulkinsertmap);
        }
    }

    public void setType(Type type)
    {
        associationType = type.collectionType;
    }

    public void setType(String s)
    {
        Type atype[] = Type.values();
        int j = atype.length;
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    Type type = atype[i];
                    if (!type.name().equalsIgnoreCase(s))
                    {
                        break label0;
                    }
                    associationType = type.collectionType;
                }
                return;
            }
            i++;
        } while (true);
    }

    public Uri toUri()
    {
        throw new UnsupportedOperationException();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(associationType);
        parcel.writeLong(created_at.getTime());
        parcel.writeParcelable(owner, 0);
    }
}
