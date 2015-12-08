// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.soundcloud.android.api.legacy.model.behavior.RelatesToPlayable;
import com.soundcloud.android.api.legacy.model.behavior.RelatesToUser;
import com.soundcloud.android.storage.provider.BulkInsertMap;
import com.soundcloud.android.storage.provider.Content;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            PublicApiResource, PublicApiUser, PublicApiTrack, Playable

public class PublicApiComment extends PublicApiResource
    implements RelatesToPlayable, RelatesToUser
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String EXTRA = "comment";
    private static final String UNUSED = "unused";
    public Bitmap avatar;
    public String body;
    private Date createdAt;
    public long reply_to_id;
    public String reply_to_username;
    public long timestamp;
    public PublicApiTrack track;
    public long track_id;
    public String uri;
    public PublicApiUser user;
    public long user_id;
    public int xPos;

    public PublicApiComment()
    {
        xPos = -1;
    }

    public PublicApiComment(Cursor cursor, boolean flag)
    {
        xPos = -1;
        if (flag)
        {
            setId(cursor.getLong(cursor.getColumnIndex("comment_id")));
            track_id = cursor.getLong(cursor.getColumnIndex("sound_id"));
            user_id = cursor.getLong(cursor.getColumnIndex("user_id"));
            user = PublicApiUser.fromActivityView(cursor);
            body = cursor.getString(cursor.getColumnIndex("comment_body"));
            timestamp = cursor.getLong(cursor.getColumnIndex("comment_timestamp"));
            createdAt = new Date(cursor.getLong(cursor.getColumnIndex("comment_created_at")));
            return;
        } else
        {
            setId(cursor.getLong(cursor.getColumnIndex("_id")));
            track_id = cursor.getLong(cursor.getColumnIndex("track_id"));
            user_id = cursor.getLong(cursor.getColumnIndex("user_id"));
            body = cursor.getString(cursor.getColumnIndex("body"));
            timestamp = cursor.getLong(cursor.getColumnIndex("timestamp"));
            createdAt = new Date(cursor.getLong(cursor.getColumnIndex("created_at")));
            return;
        }
    }

    public static PublicApiComment build(PublicApiTrack publicapitrack, PublicApiUser publicapiuser, long l, String s, long l1, String s1)
    {
        PublicApiComment publicapicomment = new PublicApiComment();
        publicapicomment.track_id = publicapitrack.getId();
        publicapicomment.track = publicapitrack;
        publicapicomment.user = publicapiuser;
        publicapicomment.user_id = publicapiuser.getId();
        publicapicomment.timestamp = l;
        publicapicomment.createdAt = new Date();
        publicapicomment.body = s;
        publicapicomment.reply_to_id = l1;
        publicapicomment.reply_to_username = s1;
        return publicapicomment;
    }

    public ContentValues buildContentValues()
    {
        ContentValues contentvalues = super.buildContentValues();
        contentvalues.put("created_at", Long.valueOf(createdAt.getTime()));
        contentvalues.put("body", body);
        contentvalues.put("user_id", Long.valueOf(user_id));
        contentvalues.put("track_id", Long.valueOf(track_id));
        contentvalues.put("timestamp", Long.valueOf(timestamp));
        return contentvalues;
    }

    public void calculateXPos(int i, long l)
    {
        if (l != 0L)
        {
            xPos = (int)((timestamp * (long)i) / l);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String getBody()
    {
        return body;
    }

    public Uri getBulkInsertUri()
    {
        return Content.COMMENTS.uri;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public volatile Playable getPlayable()
    {
        return getPlayable();
    }

    public PublicApiTrack getPlayable()
    {
        return track;
    }

    public PublicApiTrack getTrack()
    {
        return track;
    }

    public PublicApiUser getUser()
    {
        return user;
    }

    public void putDependencyValues(BulkInsertMap bulkinsertmap)
    {
        if (user != null)
        {
            user.putFullContentValues(bulkinsertmap);
        }
        if (track != null)
        {
            track.putFullContentValues(bulkinsertmap);
        }
    }

    public void setBody(String s)
    {
        body = s;
    }

    public void setCreatedAt(Date date)
    {
        createdAt = date;
    }

    public void setTrack(PublicApiTrack publicapitrack)
    {
        track = publicapitrack;
    }

    public void setUser(PublicApiUser publicapiuser)
    {
        user = publicapiuser;
    }

    public Uri toUri()
    {
        return Content.COMMENTS.forId(getId());
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(createdAt.getTime());
        parcel.writeLong(user_id);
        parcel.writeLong(track_id);
        parcel.writeLong(timestamp);
        parcel.writeParcelable(track, 0);
        parcel.writeString(body);
        parcel.writeString(uri);
        parcel.writeParcelable(user, 0);
    }



/*
    static Date access$002(PublicApiComment publicapicomment, Date date)
    {
        publicapicomment.createdAt = date;
        return date;
    }

*/

    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final PublicApiComment createFromParcel(Parcel parcel)
        {
            PublicApiComment publicapicomment = new PublicApiComment();
            publicapicomment.createdAt = new Date(parcel.readLong());
            publicapicomment.user_id = parcel.readLong();
            publicapicomment.track_id = parcel.readLong();
            publicapicomment.timestamp = parcel.readLong();
            publicapicomment.track = (PublicApiTrack)parcel.readParcelable(com/soundcloud/android/api/legacy/model/PublicApiTrack.getClassLoader());
            publicapicomment.body = parcel.readString();
            publicapicomment.uri = parcel.readString();
            publicapicomment.user = (PublicApiUser)parcel.readParcelable(com/soundcloud/android/api/legacy/model/PublicApiUser.getClassLoader());
            return publicapicomment;
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PublicApiComment[] newArray(int i)
        {
            return new PublicApiComment[i];
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
