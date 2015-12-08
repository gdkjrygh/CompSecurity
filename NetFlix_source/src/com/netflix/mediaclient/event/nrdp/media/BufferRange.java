// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            BaseMediaEvent

public class BufferRange extends BaseMediaEvent
{

    private static final String ATTR_CURRENT_PTS = "currentPts";
    private static final String ATTR_END_PTS = "endPts";
    private static final String ATTR_START_PTS = "startPts";
    private static final String ATTR_bandwidth = "bandwidth";
    private static final String ATTR_rebuffer = "rebuffer";
    public static final String TYPE = "bufferrange";
    private int bandwidth;
    private int currentPts;
    private int endPts;
    private int rebuffer;
    private int startPts;

    public BufferRange(JSONObject jsonobject)
        throws JSONException
    {
        super("bufferrange", jsonobject);
    }

    public int getBandwidth()
    {
        return bandwidth;
    }

    public int getCurrentPts()
    {
        return currentPts;
    }

    public int getEndPts()
    {
        return endPts;
    }

    public int getRebuffer()
    {
        return rebuffer;
    }

    public int getStartPts()
    {
        return startPts;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        startPts = getInt(jsonobject, "startPts", 0);
        endPts = getInt(jsonobject, "endPts", 0);
        currentPts = getInt(jsonobject, "currentPts", 0);
        bandwidth = getInt(jsonobject, "bandwidth", 0);
        rebuffer = getInt(jsonobject, "rebuffer", 0);
    }
}
