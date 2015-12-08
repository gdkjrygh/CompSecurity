// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.controller;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.mdx.message.MdxMessage;
import com.netflix.mediaclient.ui.pin.PinVerifier;
import org.json.JSONException;
import org.json.JSONObject;

public final class PlayerPlay extends MdxMessage
{

    private static final String ORIGIN_USER = "USER";
    private static final String PROPERTY_catalogId = "catalogId";
    private static final String PROPERTY_enablePostPlay = "enablePostPlay";
    private static final String PROPERTY_episodeId = "episodeId";
    private static final String PROPERTY_esn = "esn";
    private static final String PROPERTY_isDial = "isDial";
    private static final String PROPERTY_isPinVerified = "isPinVerified";
    private static final String PROPERTY_isThirdParty = "isThirdParty";
    private static final String PROPERTY_originator = "originator";
    private static final String PROPERTY_startTime = "startTime";
    private static final String PROPERTY_trackId = "trackId";
    private final String mCatalogId;
    private String mEpisodeId;
    private final String mEsn;
    private Boolean mIsDial;
    private Boolean mIsThirdParty;
    private String mOrigin;
    private Integer mStartTime;
    private final int mTrackId;

    public PlayerPlay(String s, int i, String s1)
    {
        super("PLAYER_PLAY");
        mOrigin = "USER";
        mCatalogId = s;
        mTrackId = i;
        mEsn = s1;
        createObj();
    }

    public PlayerPlay(String s, int i, String s1, String s2, Integer integer)
    {
        super("PLAYER_PLAY");
        mOrigin = "USER";
        mCatalogId = s;
        mTrackId = i;
        mEsn = s1;
        mEpisodeId = s2;
        mStartTime = integer;
        createObj();
    }

    public PlayerPlay(String s, String s1, int i, String s2, String s3, Integer integer, String s4, 
            Boolean boolean1, Boolean boolean2)
    {
        super("PLAYER_PLAY");
        mOrigin = "USER";
        mCatalogId = s1;
        mTrackId = i;
        mEsn = s2;
        mEpisodeId = s3;
        mStartTime = integer;
        mOrigin = s4;
        mIsDial = boolean1;
        mIsThirdParty = boolean2;
        createObj();
    }

    private void createObj()
    {
        try
        {
            mJson.put("catalogId", mCatalogId);
            mJson.put("trackId", mTrackId);
            mJson.put("esn", mEsn);
            mJson.put("enablePostPlay", true);
            if (PinVerifier.isPinSessionActive())
            {
                Log.d("nf_mdx", "nf_pin  sessionActive adding isPInVerified to true");
                mJson.put("isPinVerified", true);
            }
            if (mEpisodeId != null)
            {
                mJson.put("episodeId", mEpisodeId);
            }
            if (mStartTime != null && mStartTime.intValue() >= 0)
            {
                mJson.put("startTime", mStartTime.intValue());
            }
            if (mOrigin != null)
            {
                mJson.put("originator", mOrigin);
            }
            if (mIsDial != null)
            {
                mJson.put("isDial", mIsDial);
            }
            if (mIsThirdParty != null)
            {
                mJson.put("isThirdParty", mIsThirdParty);
            }
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.e("nf_mdx", (new StringBuilder()).append(messageName()).append(" createObj failed ").append(jsonexception).toString());
        }
    }
}
