// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import com.netflix.mediaclient.media.Subtitle;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class MdxSubtitle extends Subtitle
{

    protected static final String ATTR_LABEL = "label";
    public static final int IMPL_VALUE = 2;
    private final boolean mSelected;

    protected MdxSubtitle(JSONObject jsonobject, int i)
        throws JSONException
    {
        canDeviceRender = true;
        id = JsonUtils.getString(jsonobject, "id", null);
        languageDescription = JsonUtils.getString(jsonobject, "label", "English");
        nccpOrderNumber = i;
        mSelected = JsonUtils.getBoolean(jsonobject, "selected", false);
        trackType = 0;
    }

    public static final MdxSubtitle newInstance(JSONObject jsonobject, int i)
        throws JSONException
    {
        return new MdxSubtitle(jsonobject, i);
    }

    public boolean isSelected()
    {
        return mSelected;
    }

    public JSONObject toJson()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("impl", 2);
        jsonobject.put("id", id);
        jsonobject.put("label", languageDescription);
        jsonobject.put("order", nccpOrderNumber);
        jsonobject.put("selected", mSelected);
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("MdxSubtitle [mSelected=").append(mSelected).append(", id=").append(id).append(", languageCodeIso639_1=").append(languageCodeIso639_1).append(", languageCodeIso639_2=").append(languageCodeIso639_2).append(", languageDescription=").append(languageDescription).append(", trackType=").append(trackType).append(", canDeviceRender=").append(canDeviceRender).append(", nccpOrderNumber=").append(nccpOrderNumber).append("]").toString();
    }
}
