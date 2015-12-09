// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            BaseMediaEvent

public class AudioTrackChanged extends BaseMediaEvent
{

    private static final String ATTR_TRACK_INDEX = "trackIndex";
    public static final String TYPE = "audioTrackChanged";
    private int trackIndex;

    public AudioTrackChanged(JSONObject jsonobject)
        throws JSONException
    {
        super("audioTrackChanged", jsonobject);
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
