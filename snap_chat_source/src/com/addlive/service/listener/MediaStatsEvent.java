// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service.listener;

import com.addlive.service.MediaType;
import org.json.JSONObject;

// Referenced classes of package com.addlive.service.listener:
//            MediaStats

public class MediaStatsEvent
{

    private String mediaType;
    private long remoteUserId;
    private String scopeId;
    private MediaStats stats;

    public MediaStatsEvent(JSONObject jsonobject)
    {
        scopeId = jsonobject.getString("scopeId");
        mediaType = jsonobject.getString("mediaType");
        if (jsonobject.has("remoteUserId"))
        {
            remoteUserId = jsonobject.getLong("remoteUserId");
        } else
        {
            remoteUserId = -1L;
        }
        stats = new MediaStats(jsonobject.getJSONObject("stats"));
    }

    public MediaType getMediaType()
    {
        return MediaType.fromString(mediaType);
    }

    public long getRemoteUserId()
    {
        return remoteUserId;
    }

    public String getScopeId()
    {
        return scopeId;
    }

    public MediaStats getStats()
    {
        return stats;
    }

    public String toString()
    {
        return (new StringBuilder("MediaStatsEvent{scopeId=")).append(scopeId).append(", mediaType=").append(mediaType).append(", remoteUserId=").append(remoteUserId).append(", stats=").append(stats).append("}").toString();
    }
}
