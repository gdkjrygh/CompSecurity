// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service.listener;

import com.addlive.service.MediaType;
import org.json.JSONObject;

public class UserStateChangedEvent
{

    private boolean audioPublished;
    private boolean isConnected;
    private String mediaType;
    private String scopeId;
    private boolean screenPublished;
    private String screenSinkId;
    private long userId;
    private boolean videoPublished;
    private String videoSinkId;

    public UserStateChangedEvent(JSONObject jsonobject)
    {
        scopeId = jsonobject.getString("scopeId");
        mediaType = jsonobject.getString("mediaType");
        jsonobject = jsonobject.getJSONObject("userDetails");
        userId = jsonobject.getLong("userId");
        isConnected = jsonobject.getBoolean("isConnected");
        audioPublished = jsonobject.getBoolean("audioPublished");
        videoPublished = jsonobject.getBoolean("videoPublished");
        screenPublished = jsonobject.getBoolean("screenPublished");
        videoSinkId = jsonobject.getString("videoSinkId");
        screenSinkId = jsonobject.getString("screenSinkId");
    }

    public MediaType getMediaType()
    {
        return MediaType.fromString(mediaType);
    }

    public String getScopeId()
    {
        return scopeId;
    }

    public String getScreenSinkId()
    {
        return screenSinkId;
    }

    public long getUserId()
    {
        return userId;
    }

    public String getVideoSinkId()
    {
        return videoSinkId;
    }

    public boolean isAudioPublished()
    {
        return audioPublished;
    }

    public boolean isConnected()
    {
        return isConnected;
    }

    public boolean isScreenPublished()
    {
        return screenPublished;
    }

    public boolean isVideoPublished()
    {
        return videoPublished;
    }

    public String toString()
    {
        return (new StringBuilder("UserStateChangedEvent{scopeId=")).append(scopeId).append(", userId=").append(userId).append(", isConnected=").append(isConnected).append(", audioPublished=").append(audioPublished).append(", videoPublished=").append(videoPublished).append(", videoSinkId=").append(videoSinkId).append(", screenSinkId=").append(screenSinkId).append(", mediaType=").append(mediaType).append("}").toString();
    }
}
