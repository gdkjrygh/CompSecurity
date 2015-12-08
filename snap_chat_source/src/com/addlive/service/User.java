// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;

import org.json.JSONException;
import org.json.JSONObject;

public class User
{

    private boolean audioPublished;
    private boolean screenPublished;
    private String screenSinkId;
    private Long userId;
    private boolean videoPublished;
    private String videoSinkId;

    public User(JSONObject jsonobject)
    {
        try
        {
            setUserId(Long.valueOf(jsonobject.getLong("userId")));
            setVideoPublished(jsonobject.getBoolean("videoPublished"));
            setAudioPublished(jsonobject.getBoolean("audioPublished"));
            setScreenPublished(jsonobject.getBoolean("screenPublished"));
            setVideoSinkId(jsonobject.getString("videoSinkId"));
            setScreenSinkId(jsonobject.getString("screenSinkId"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return;
        }
    }

    public String getScreenSinkId()
    {
        return screenSinkId;
    }

    public Long getUserId()
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

    public boolean isScreenPublished()
    {
        return screenPublished;
    }

    public boolean isVideoPublished()
    {
        return videoPublished;
    }

    public void setAudioPublished(boolean flag)
    {
        audioPublished = flag;
    }

    public void setScreenPublished(boolean flag)
    {
        screenPublished = flag;
    }

    public void setScreenSinkId(String s)
    {
        screenSinkId = s;
    }

    public void setUserId(Long long1)
    {
        userId = long1;
    }

    public void setVideoPublished(boolean flag)
    {
        videoPublished = flag;
    }

    public void setVideoSinkId(String s)
    {
        videoSinkId = s;
    }
}
