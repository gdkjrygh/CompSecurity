// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model;

import com.soundcloud.android.likes.LikeProperty;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.android.tracks.TrackRecord;
import com.soundcloud.android.tracks.TrackRecordHolder;
import com.soundcloud.java.collections.PropertySet;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.api.model:
//            ApiTrack

public class ApiTrackLike
    implements PropertySetSource, TrackRecordHolder
{

    private final ApiTrack apiTrack;
    private final Date createdAt;

    public ApiTrackLike(ApiTrack apitrack, Date date)
    {
        apiTrack = apitrack;
        createdAt = date;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ApiTrackLike))
            {
                return false;
            }
            if (!apiTrack.equals(((ApiTrackLike)obj).apiTrack))
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
        return apiTrack.hashCode();
    }

    public PropertySet toPropertySet()
    {
        return apiTrack.toPropertySet().put(LikeProperty.CREATED_AT, createdAt);
    }
}
