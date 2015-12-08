// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model.stream;

import com.soundcloud.android.api.model.ApiTrack;
import java.util.Date;

public class ApiStreamTrackPost
{

    private final ApiTrack apiTrack;
    private final long createdAtTime;

    public ApiStreamTrackPost(ApiTrack apitrack, Date date)
    {
        apiTrack = apitrack;
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
}
