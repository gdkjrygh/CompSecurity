// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            BaseMediaEvent

public class SubtitleTrackChanged extends BaseMediaEvent
{

    private static final String ATTR_TRACK_INDEX = "trackIndex";
    public static final String TYPE = "subtitleTrackChanged";
    private int trackIndex;

    public SubtitleTrackChanged(JSONObject jsonobject)
        throws JSONException
    {
        super("subtitleTrackChanged", jsonobject);
    }

    public int getTrackIndex()
    {
        return trackIndex;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        trackIndex = getInt(jsonobject, "trackIndex", -1);
    }
}
