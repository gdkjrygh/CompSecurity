// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.activities;

import com.soundcloud.android.api.model.ApiTrack;
import com.soundcloud.android.api.model.ApiUser;
import com.soundcloud.android.model.TrackHolder;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackRecord;
import com.soundcloud.android.users.UserRecord;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.sync.activities:
//            ApiEngagementActivity

public class ApiTrackRepostActivity
    implements TrackHolder, ApiEngagementActivity
{

    private final Date createdAt;
    private final ApiUser reposter;
    private final ApiTrack track;

    public ApiTrackRepostActivity(ApiTrack apitrack, ApiUser apiuser, Date date)
    {
        track = apitrack;
        reposter = apiuser;
        createdAt = date;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public Urn getTargetUrn()
    {
        return track.getUrn();
    }

    public ApiTrack getTrack()
    {
        return track;
    }

    public volatile TrackRecord getTrack()
    {
        return getTrack();
    }

    public UserRecord getUser()
    {
        return reposter;
    }

    public Urn getUserUrn()
    {
        return reposter.getUrn();
    }
}
