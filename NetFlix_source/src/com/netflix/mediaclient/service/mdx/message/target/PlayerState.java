// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.target;

import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class PlayerState
{

    public static final String PLAYER_STATE_AUTO_ADVANCE = "AUTO_ADVANCE";
    public static final String PLAYER_STATE_END_PLAYBACK = "END_PLAYBACK";
    public static final String PLAYER_STATE_FATAL_ERROR = "FATAL_ERROR";
    public static final String PLAYER_STATE_PAUSE = "PAUSE";
    public static final String PLAYER_STATE_PLAY = "PLAY";
    public static final String PLAYER_STATE_PLAYING = "PLAYING";
    public static final String PLAYER_STATE_PROGRESS = "PROGRESS";
    public static final String PLAYER_STATE_STALLED = "STALLED";
    public static final String PLAYER_STATE_STOP = "STOP";
    private static final String PROPERTY_autoAdvanceIncrement = "autoAdvanceIncrement";
    private static final String PROPERTY_catalogId = "catalogId";
    private static final String PROPERTY_currentState = "currentState";
    private static final String PROPERTY_duration = "duration";
    private static final String PROPERTY_episodeId = "episodeId";
    private static final String PROPERTY_postplay = "postplayState";
    private static final String PROPERTY_time = "time";
    private static final String PROPERTY_volume = "volume";
    private static final String PROPERTY_xid = "xid";
    private String mAutoAdvanceIncrement;
    private String mCatalogId;
    private String mCurrentState;
    private int mDuration;
    private String mEpisodeId;
    private String mPostplayStateBlob;
    private int mTime;
    private int mVolume;
    private String mXid;

    public PlayerState(JSONObject jsonobject)
        throws JSONException
    {
        mTime = -1;
        mVolume = -1;
        mDuration = -1;
        mXid = jsonobject.optString("xid");
        mCatalogId = jsonobject.optString("catalogId");
        mDuration = jsonobject.optInt("duration", -1);
        mTime = jsonobject.optInt("time", -1);
        mVolume = jsonobject.optInt("volume", -1);
        mCurrentState = jsonobject.optString("currentState");
        mEpisodeId = jsonobject.optString("episodeId");
        mAutoAdvanceIncrement = JsonUtils.getString(jsonobject, "autoAdvanceIncrement", "0");
        mPostplayStateBlob = jsonobject.optString("postplayState");
    }

    public String getAutoAdvanceIncrement()
    {
        return mAutoAdvanceIncrement;
    }

    public String getCatalogId()
    {
        return mCatalogId;
    }

    public String getCurrentState()
    {
        return mCurrentState;
    }

    public int getDuration()
    {
        return mDuration;
    }

    public String getEpisodeId()
    {
        return mEpisodeId;
    }

    public String getPostplayState()
    {
        return mPostplayStateBlob;
    }

    public int getTime()
    {
        return mTime;
    }

    public int getVolume()
    {
        return mVolume;
    }

    public String getXid()
    {
        return mXid;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PlayerCurrentState [currentState=").append(mCurrentState).append(", xid=").append(mXid).append(", catalogId=").append(mCatalogId).append(", episodeId=").append(mEpisodeId).append("]").toString();
    }
}
