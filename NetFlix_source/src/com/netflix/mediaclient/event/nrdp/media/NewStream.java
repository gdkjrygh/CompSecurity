// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import com.netflix.mediaclient.proxy.nrdp.media.StreamInfo;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            BaseMediaEvent

public class NewStream extends BaseMediaEvent
{

    private static final String ATTR_START_PTS = "startPts";
    private static final String ATTR_STREAM_INFO = "streamInfo";
    public static final String TYPE = "newStream";
    private int startPts;
    private StreamInfo streamInfo;

    public NewStream(JSONObject jsonobject)
        throws JSONException
    {
        super("newStream", jsonobject);
    }

    public int getStartPts()
    {
        return startPts;
    }

    public StreamInfo getStreamInfo()
    {
        return streamInfo;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        startPts = getInt(jsonobject, "startPts", 0);
        if (jsonobject.has("streamInfo"))
        {
            streamInfo = new StreamInfo(jsonobject.getJSONObject("streamInfo"));
        }
    }
}
