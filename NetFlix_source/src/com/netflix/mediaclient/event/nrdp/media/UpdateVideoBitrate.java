// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            BaseMediaEvent

public class UpdateVideoBitrate extends BaseMediaEvent
{

    private static final String ATTR_BPS = "bitsPerSecond";
    public static final String TYPE = "updateVideoBitrate";
    private int bitsPerSecond;

    public UpdateVideoBitrate(JSONObject jsonobject)
        throws JSONException
    {
        super("updateVideoBitrate", jsonobject);
    }

    public int getBitsPerSecond()
    {
        return bitsPerSecond;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        bitsPerSecond = getInt(jsonobject, "bitsPerSecond", -1);
    }
}
