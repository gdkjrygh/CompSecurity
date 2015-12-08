// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.target;

import com.netflix.mediaclient.service.mdx.message.MdxMessage;
import org.json.JSONException;
import org.json.JSONObject;

public final class MetaDataChanged extends MdxMessage
{

    private static final String PROPERTY_catalogId = "catalogId";
    private static final String PROPERTY_episodeId = "episodeId";
    private static final String PROPERTY_type = "type";
    private String mCatalogId;
    private String mEpisodeId;
    private String mType;

    public MetaDataChanged(JSONObject jsonobject)
        throws JSONException
    {
        super("META_DATA_CHANGED");
        mJson = jsonobject;
        mCatalogId = jsonobject.getString("catalogId");
        mEpisodeId = jsonobject.optString("episodeId", null);
        mType = jsonobject.getString("type");
    }

    public String getCatalogId()
    {
        return mCatalogId;
    }

    public String getEpisodeId()
    {
        return mEpisodeId;
    }

    public String getType()
    {
        return mType;
    }
}
