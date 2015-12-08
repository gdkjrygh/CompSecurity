// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model.stream;

import com.soundcloud.android.api.model.ApiTrack;
import com.soundcloud.android.api.model.ApiUser;
import java.util.Date;

public class ApiStreamTrackRepost
{

    private final ApiTrack apiTrack;
    private final long createdAtTime;
    private final ApiUser reposter;

    public ApiStreamTrackRepost(ApiTrack apitrack, ApiUser apiuser, Date date)
    {
        apiTrack = apitrack;
        reposter = apiuser;
        createdAtTime = date.getTime();
    }

    public ApiTrack getApiTrack()
    {
        return apiTrack;
    }

    public long getCreatedAtTime()
    {
        return createdAtTime;
    }

    public ApiUser getReposter()
    {
        return reposter;
    }
}
