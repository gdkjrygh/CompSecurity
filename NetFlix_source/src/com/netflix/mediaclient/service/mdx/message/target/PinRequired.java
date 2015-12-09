// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.target;

import com.netflix.mediaclient.service.mdx.message.MdxMessage;
import org.json.JSONException;
import org.json.JSONObject;

public final class PinRequired extends MdxMessage
{

    private static String PROPERTY_ancestorVideoId = "ancestorVideoId";
    private static String PROPERTY_ancestorVideoType = "ancestorVideoType";
    private static String PROPERTY_title = "title";
    private static String PROPERTY_videoId = "videoId";
    private int mAncestorVideoId;
    private String mAncestorVideoType;
    private String mTitle;
    private int mVideoId;

    public PinRequired(JSONObject jsonobject)
        throws JSONException
    {
        super("PIN_VERIFICATION_SHOW");
        mTitle = jsonobject.optString(PROPERTY_title);
        mVideoId = jsonobject.optInt(PROPERTY_videoId, -1);
        mAncestorVideoId = jsonobject.optInt(PROPERTY_ancestorVideoId, -1);
        mAncestorVideoType = jsonobject.optString(PROPERTY_ancestorVideoType);
    }

    public int getAncestorVideoId()
    {
        return mAncestorVideoId;
    }

    public String getAncestorVideoType()
    {
        return mAncestorVideoType;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public int getVideoId()
    {
        return mVideoId;
    }

}
