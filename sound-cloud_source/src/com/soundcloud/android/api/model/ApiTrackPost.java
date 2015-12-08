// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model;

import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.android.tracks.TrackRecord;
import com.soundcloud.android.tracks.TrackRecordHolder;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.api.model:
//            ApiTrack

public class ApiTrackPost
    implements PropertySetSource, TrackRecordHolder
{

    private final ApiTrack apiTrack;

    public ApiTrackPost(ApiTrack apitrack)
    {
        apiTrack = apitrack;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ApiTrackPost))
            {
                return false;
            }
            if (!apiTrack.equals(((ApiTrackPost)obj).apiTrack))
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
        return apiTrack.toPropertySet().put(PostProperty.IS_REPOST, Boolean.valueOf(false)).put(PostProperty.CREATED_AT, apiTrack.getCreatedAt());
    }
}
