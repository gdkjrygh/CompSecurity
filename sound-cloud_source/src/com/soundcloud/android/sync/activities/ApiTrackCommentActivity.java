// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.activities;

import com.soundcloud.android.api.model.ApiTrack;
import com.soundcloud.android.comments.ApiComment;
import com.soundcloud.android.model.TrackHolder;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackRecord;
import com.soundcloud.android.users.UserRecord;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.sync.activities:
//            ApiEngagementActivity

public class ApiTrackCommentActivity
    implements TrackHolder, ApiEngagementActivity
{

    private final ApiComment comment;
    private final Date createdAt;
    private final Urn targetUrn;
    private final ApiTrack track;

    public ApiTrackCommentActivity(String s, ApiTrack apitrack, ApiComment apicomment, Date date)
    {
        targetUrn = new Urn(s);
        track = apitrack;
        comment = apicomment;
        createdAt = date;
    }

    public ApiComment getComment()
    {
        return comment;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public Urn getTargetUrn()
    {
        return targetUrn;
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
        return comment.getUser();
    }

    public Urn getUserUrn()
    {
        return getUser().getUrn();
    }
}
