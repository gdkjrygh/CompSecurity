// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            BaseMediaEvent

public class SubtitleData extends BaseMediaEvent
{

    private static final String ATTR_DATA = "data";
    public static final String TYPE = "subtitledata";
    private String mXml;

    public SubtitleData(JSONObject jsonobject)
        throws JSONException
    {
        super("subtitledata", jsonobject);
    }

    public String getXml()
    {
        return mXml;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        mXml = getString(jsonobject, "data", null);
    }
}
