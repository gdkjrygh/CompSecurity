// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model;

import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.android.tracks.TrackRecord;
import com.soundcloud.android.tracks.TrackRecordHolder;
import com.soundcloud.java.collections.PropertySet;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.api.model:
//            ApiTrack

public class ApiTrackRepost
    implements PropertySetSource, TrackRecordHolder
{

    private final ApiTrack apiTrack;
    private final Date createdAt;

    public ApiTrackRepost(ApiTrack apitrack, Date date)
    {
        apiTrack = apitrack;
        createdAt = date;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ApiTrackRepost))
            {
                return false;
            }
            obj = (ApiTrackRepost)obj;
            if (!apiTrack.equals(((ApiTrackRepost) (obj)).apiTrack) || !createdAt.equals(((ApiTrackRepost) (obj)).createdAt))
            {
                return false;
            }
        }
        return true;
    }

    public TrackRecord getTrackRecord()
    {
        return apiTrack;
    }

    public int hashCode()
    {
        return apiTrack.hashCode() * 31 + createdAt.hashCode();
    }

    public PropertySet toPropertySet()
    {
        return apiTrack.toPropertySet().put(PostProperty.IS_REPOST, Boolean.valueOf(true)).put(PostProperty.CREATED_AT, createdAt);
    }
}
