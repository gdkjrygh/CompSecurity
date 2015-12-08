// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.controller;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.mdx.message.MdxMessage;
import org.json.JSONException;
import org.json.JSONObject;

public final class PlayerChangeMetaData extends MdxMessage
{

    private static final String PROPERTY_catalogId = "catalogId";
    private static final String PROPERTY_episodeId = "episodeId";
    private static final String PROPERTY_type = "type";
    private String mCatalogId;
    private String mEpisodeId;
    private String mType;

    public PlayerChangeMetaData(String s, String s1, String s2)
    {
        super("META_DATA_CHANGED");
        mCatalogId = s;
        mEpisodeId = s1;
        mType = s2;
        createObj();
    }

    private void createObj()
    {
        try
        {
            mJson.put("catalogId", mCatalogId);
            mJson.put("episodeId", mEpisodeId);
            mJson.put("type", mType);
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.e("nf_mdx", (new StringBuilder()).append(messageName()).append(" createObj failed ").append(jsonexception).toString());
        }
    }
}
