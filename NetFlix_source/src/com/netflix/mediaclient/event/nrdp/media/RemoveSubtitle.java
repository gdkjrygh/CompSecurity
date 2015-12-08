// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            BaseMediaEvent

public class RemoveSubtitle extends BaseMediaEvent
{

    private static final String ATTR_REMOVE_SUBTITLE = "subtitleID";
    public static final String TYPE = "removeSubtitle";
    private int subtitleID;

    public RemoveSubtitle(JSONObject jsonobject)
        throws JSONException
    {
        super("removeSubtitle", jsonobject);
    }

    public int getSubtitleID()
    {
        return subtitleID;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        subtitleID = getInt(jsonobject, "subtitleID", -1);
    }
}
