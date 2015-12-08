// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            BaseMediaEvent

public class ShowSubtitle extends BaseMediaEvent
{

    private static final String ATTR_REMOVE_SUBTITLE = "subtitleID";
    private static final String ATTR_RESERVED = "reserved";
    private static final String ATTR_TEXT = "text";
    public static final String TYPE = "showSubtitle";
    private int reserved;
    private int subtitleID;
    private String text;

    public ShowSubtitle(JSONObject jsonobject)
        throws JSONException
    {
        super("showSubtitle", jsonobject);
    }

    public int getReserved()
    {
        return reserved;
    }

    public int getSubtitleID()
    {
        return subtitleID;
    }

    public String getText()
    {
        return text;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        subtitleID = getInt(jsonobject, "subtitleID", -1);
        reserved = getInt(jsonobject, "reserved", -1);
        text = getString(jsonobject, "text", null);
    }
}
