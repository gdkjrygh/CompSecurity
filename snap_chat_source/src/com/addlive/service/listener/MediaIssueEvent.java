// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service.listener;

import com.addlive.service.MediaIssueCode;
import com.addlive.service.MediaType;
import org.json.JSONObject;

public class MediaIssueEvent
{

    private boolean isActive;
    private int issueCode;
    private String mediaType;
    private String message;
    private String scopeId;
    private long userId;

    public MediaIssueEvent(JSONObject jsonobject)
    {
        scopeId = jsonobject.getString("scopeId");
        mediaType = jsonobject.getString("mediaType");
        if (jsonobject.has("userId"))
        {
            userId = jsonobject.getLong("userId");
        }
        isActive = jsonobject.getBoolean("isActive");
        issueCode = jsonobject.getInt("issueCode");
        message = jsonobject.getString("message");
    }

    public MediaIssueCode getMediaIssueType()
    {
        return MediaIssueCode._fromInt(issueCode);
    }

    public MediaType getMediaType()
    {
        return MediaType.fromString(mediaType);
    }

    public String getMessage()
    {
        return message;
    }

    public String getScopeId()
    {
        return scopeId;
    }

    public long getUserId()
    {
        return userId;
    }

    public boolean isActive()
    {
        return isActive;
    }

    public String toString()
    {
        return (new StringBuilder("MediaIssueEvent{scopeId=")).append(scopeId).append(", mediaType=").append(mediaType).append(", userId=").append(userId).append(", isActive=").append(isActive).append(", issueCode=").append(issueCode).append(", message=").append(message).append("}").toString();
    }
}
