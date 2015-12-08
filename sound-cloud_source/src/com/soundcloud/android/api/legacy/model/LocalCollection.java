// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.soundcloud.android.api.legacy.model.activities.Activity;
import com.soundcloud.android.api.legacy.model.behavior.Identifiable;
import com.soundcloud.android.api.legacy.model.behavior.Persisted;
import com.soundcloud.android.storage.provider.BulkInsertMap;
import com.soundcloud.android.storage.provider.Content;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            PublicApiTrack, PublicApiPlaylist

public class LocalCollection
    implements Identifiable, Persisted
{
    public static interface OnChangeListener
    {

        public abstract void onLocalCollectionChanged(LocalCollection localcollection);
    }

    public static interface SyncState
    {

        public static final int IDLE = 0;
        public static final int PENDING = 1;
        public static final int SYNCING = 2;
    }


    public String extra;
    private long id;
    public long last_sync_attempt;
    public long last_sync_success;
    public int size;
    public int sync_state;
    private final Uri uri;

    public LocalCollection(Cursor cursor)
    {
        last_sync_success = -1L;
        last_sync_attempt = -1L;
        sync_state = -1;
        size = -1;
        id = cursor.getInt(cursor.getColumnIndex("_id"));
        uri = Uri.parse(cursor.getString(cursor.getColumnIndex("uri")));
        last_sync_attempt = cursor.getLong(cursor.getColumnIndex("last_sync_attempt"));
        last_sync_success = cursor.getLong(cursor.getColumnIndex("last_sync"));
        sync_state = cursor.getInt(cursor.getColumnIndex("sync_state"));
        extra = cursor.getString(cursor.getColumnIndex("extra"));
        size = cursor.getInt(cursor.getColumnIndex("size"));
    }

    public LocalCollection(Uri uri1)
    {
        this(uri1, -1L, -1L, 0, 0, null);
    }

    public LocalCollection(Uri uri1, long l, long l1, int i, int j, 
            String s)
    {
        last_sync_success = -1L;
        last_sync_attempt = -1L;
        sync_state = -1;
        size = -1;
        uri = uri1;
        last_sync_attempt = l;
        last_sync_success = l1;
        sync_state = i;
        size = j;
        extra = s;
    }

    public ContentValues buildContentValues()
    {
        ContentValues contentvalues = new ContentValues();
        if (getId() > 0L)
        {
            contentvalues.put("_id", Long.valueOf(getId()));
        }
        if (sync_state != -1)
        {
            contentvalues.put("sync_state", Integer.valueOf(sync_state));
        }
        if (size != -1)
        {
            contentvalues.put("size", Integer.valueOf(size));
        }
        if (last_sync_attempt != -1L)
        {
            contentvalues.put("last_sync_attempt", Long.valueOf(last_sync_attempt));
        }
        if (last_sync_success != -1L)
        {
            contentvalues.put("last_sync", Long.valueOf(last_sync_success));
        }
        if (!TextUtils.isEmpty(extra))
        {
            contentvalues.put("extra", extra);
        }
        contentvalues.put("uri", getUri().toString());
        return contentvalues;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (LocalCollection)obj;
            if (getId() != ((LocalCollection) (obj)).getId())
            {
                return false;
            }
            if (last_sync_attempt != ((LocalCollection) (obj)).last_sync_attempt)
            {
                return false;
            }
            if (last_sync_success != ((LocalCollection) (obj)).last_sync_success)
            {
                return false;
            }
            if (size != ((LocalCollection) (obj)).size)
            {
                return false;
            }
            if (sync_state != ((LocalCollection) (obj)).sync_state)
            {
                return false;
            }
            if (extra == null ? ((LocalCollection) (obj)).extra != null : !extra.equals(((LocalCollection) (obj)).extra))
            {
                return false;
            }
            if (getUri() == null ? ((LocalCollection) (obj)).getUri() != null : !getUri().equals(((LocalCollection) (obj)).getUri()))
            {
                return false;
            }
        }
        return true;
    }

    public Uri getBulkInsertUri()
    {
        return Content.COLLECTIONS.uri;
    }

    public long getId()
    {
        return id;
    }

    public Uri getUri()
    {
        return uri;
    }

    public boolean hasNotBeenRegistered()
    {
        return id == 0L;
    }

    public boolean hasSyncedBefore()
    {
        return last_sync_success > 0L;
    }

    public int hashCode()
    {
        int j = 0;
        int k = (int)(getId() ^ getId() >>> 32);
        int i;
        int l;
        int i1;
        int j1;
        int k1;
        if (getUri() != null)
        {
            i = getUri().hashCode();
        } else
        {
            i = 0;
        }
        l = (int)(last_sync_attempt ^ last_sync_attempt >>> 32);
        i1 = (int)(last_sync_success ^ last_sync_success >>> 32);
        j1 = size;
        k1 = sync_state;
        if (extra != null)
        {
            j = extra.hashCode();
        }
        return (((((i + k * 31) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + j;
    }

    public boolean isIdle()
    {
        return sync_state == 0;
    }

    public boolean isSyncDue()
    {
        Content content;
        long l;
        l = 0x1499700L;
        content = Content.match(getUri());
        if (content == null || last_sync_attempt > System.currentTimeMillis() - 0x1b7740L)
        {
            return false;
        }
        if (content.isUserBased())
        {
            return last_sync_success <= 0L;
        }
        break MISSING_BLOCK_LABEL_53;
        if (com/soundcloud/android/api/legacy/model/PublicApiTrack.equals(content.modelType) || !com/soundcloud/android/api/legacy/model/PublicApiPlaylist.equals(content.modelType) && !com/soundcloud/android/api/legacy/model/activities/Activity.equals(content.modelType))
        {
            l = 0x36ee80L;
        }
        return System.currentTimeMillis() - last_sync_success > l;
    }

    public void putDependencyValues(BulkInsertMap bulkinsertmap)
    {
    }

    public void putFullContentValues(BulkInsertMap bulkinsertmap)
    {
    }

    public void setFromCursor(Cursor cursor)
    {
        if (getId() <= 0L)
        {
            setId(cursor.getInt(cursor.getColumnIndex("_id")));
        }
        last_sync_attempt = cursor.getLong(cursor.getColumnIndex("last_sync_attempt"));
        last_sync_success = cursor.getLong(cursor.getColumnIndex("last_sync"));
        sync_state = cursor.getInt(cursor.getColumnIndex("sync_state"));
        extra = cursor.getString(cursor.getColumnIndex("extra"));
        size = cursor.getInt(cursor.getColumnIndex("size"));
    }

    public void setId(long l)
    {
        id = l;
    }

    public boolean shouldAutoRefresh()
    {
        return isIdle() && getId() > 0L && isSyncDue();
    }

    public int syncMisses()
    {
        int i;
        try
        {
            i = Integer.parseInt(extra);
        }
        catch (NumberFormatException numberformatexception)
        {
            return 0;
        }
        return i;
    }

    public String toString()
    {
        return (new StringBuilder("LocalCollection{id=")).append(getId()).append(", uri=").append(getUri()).append(", last_sync_attempt=").append(last_sync_attempt).append(", last_sync_success=").append(last_sync_success).append(", sync_state='").append(sync_state).append('\'').append(", extra=").append(extra).append(", size=").append(size).append('}').toString();
    }

    public Uri toUri()
    {
        return getBulkInsertUri().buildUpon().appendPath(String.valueOf(id)).build();
    }
}
