// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.model.behavior.PlayableHolder;
import com.soundcloud.android.api.legacy.model.behavior.Refreshable;
import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.android.storage.provider.BulkInsertMap;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.storage.provider.ScContentProvider;
import com.soundcloud.java.collections.PropertySet;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            Association, Playable, ScModelManager, PublicApiPlaylist, 
//            PublicApiTrack, PublicApiUser

public class SoundAssociation extends Association
    implements PlayableHolder, PropertySetSource
{

    public Playable playable;

    public SoundAssociation()
    {
    }

    public SoundAssociation(Cursor cursor)
    {
        int i;
        if (Playable.isTrackCursor(cursor))
        {
            playable = SoundCloudApplication.sModelManager.getCachedTrackFromCursor(cursor, "_id");
        } else
        {
            playable = SoundCloudApplication.sModelManager.getCachedPlaylistFromCursor(cursor, "_id");
        }
        created_at = new Date(cursor.getLong(cursor.getColumnIndex("association_timestamp")));
        i = cursor.getColumnIndex(ScContentProvider.POST_TYPE);
        if (i != -1)
        {
            if ("post".equals(cursor.getString(i)))
            {
                int j;
                if (playable instanceof PublicApiPlaylist)
                {
                    j = 8;
                } else
                {
                    j = 0;
                }
                associationType = j;
                return;
            } else
            {
                associationType = 7;
                return;
            }
        } else
        {
            associationType = 1;
            return;
        }
    }

    public SoundAssociation(Parcel parcel)
    {
        super(parcel);
        playable = (Playable)parcel.readParcelable(ClassLoader.getSystemClassLoader());
    }

    public SoundAssociation(Playable playable1, Date date, Association.Type type)
    {
        super(type.collectionType, date);
        playable = playable1;
    }

    public SoundAssociation(PublicApiPlaylist publicapiplaylist)
    {
        this(((Playable) (publicapiplaylist)), publicapiplaylist.created_at, Association.Type.PLAYLIST);
    }

    public SoundAssociation(PublicApiTrack publicapitrack)
    {
        this(((Playable) (publicapitrack)), publicapitrack.created_at, Association.Type.TRACK);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof SoundAssociation))
            {
                return false;
            }
            if (!super.equals(obj))
            {
                return false;
            }
            obj = (SoundAssociation)obj;
            if (playable == null ? ((SoundAssociation) (obj)).playable != null : !playable.equals(((SoundAssociation) (obj)).playable))
            {
                return false;
            }
            if (associationType != ((SoundAssociation) (obj)).associationType)
            {
                return false;
            }
        }
        return true;
    }

    public Uri getBulkInsertUri()
    {
        return Content.ME_SOUNDS.uri;
    }

    public long getItemId()
    {
        return playable.getId();
    }

    public long getListItemId()
    {
        return getPlayable().getId() << associationType + 32;
    }

    public Playable getPlayable()
    {
        return playable;
    }

    public Refreshable getRefreshableResource()
    {
        return playable;
    }

    public int getResourceType()
    {
        return playable.getTypeId();
    }

    public PublicApiUser getUser()
    {
        return playable.user;
    }

    public int hashCode()
    {
        int j = super.hashCode();
        int i;
        if (playable != null)
        {
            i = playable.hashCode();
        } else
        {
            i = 0;
        }
        return (i + j * 31) * 31 + associationType;
    }

    public boolean isRepost()
    {
        return associationType == 7;
    }

    public void putDependencyValues(BulkInsertMap bulkinsertmap)
    {
        super.putDependencyValues(bulkinsertmap);
        if (playable != null)
        {
            playable.putFullContentValues(bulkinsertmap);
        }
    }

    public void setPlaylist(PublicApiPlaylist publicapiplaylist)
    {
        if (publicapiplaylist != null)
        {
            playable = publicapiplaylist;
        }
    }

    public void setTrack(PublicApiTrack publicapitrack)
    {
        if (publicapitrack != null)
        {
            playable = publicapitrack;
        }
    }

    public PropertySet toPropertySet()
    {
        return playable.toPropertySet().put(PostProperty.CREATED_AT, created_at).put(PostProperty.IS_REPOST, Boolean.valueOf(isRepost()));
    }

    public String toString()
    {
        return (new StringBuilder("SoundAssociation{associationType=")).append(associationType).append(", created_at=").append(created_at).append(", playable=").append(playable).append(", user=").append(owner).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(playable, 0);
    }
}
