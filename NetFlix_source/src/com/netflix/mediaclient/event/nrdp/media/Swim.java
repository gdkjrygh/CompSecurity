// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            BaseMediaEvent

public class Swim extends BaseMediaEvent
{

    private static final String ATTR_CURRENT_PTS = "currentPts";
    private static final String ATTR_END_PTS = "endPts";
    private static final String ATTR_ERROR = "error";
    private static final String ATTR_PTS = "pts";
    private static final String ATTR_START_PTS = "startPts";
    public static final String TYPE = "swim";
    private int currentPts;
    private int endPts;
    private boolean error;
    private int pts;
    private int startPts;

    public Swim(JSONObject jsonobject)
        throws JSONException
    {
        super("swim", jsonobject);
        error = false;
    }

    public int getCurrentPts()
    {
        return currentPts;
    }

    public int getEndPts()
    {
        return endPts;
    }

    public int getPts()
    {
        return pts;
    }

    public int getStartPts()
    {
        return startPts;
    }

    public boolean isError()
    {
        return error;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        startPts = getInt(jsonobject, "startPts", 0);
        endPts = getInt(jsonobject, "endPts", 0);
        currentPts = getInt(jsonobject, "currentPts", 0);
        pts = getInt(jsonobject, "pts", 0);
        error = getBoolean(jsonobject, "error", false);
    }
}
