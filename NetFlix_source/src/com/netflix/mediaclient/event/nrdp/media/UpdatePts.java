// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            BaseMediaEvent

public class UpdatePts extends BaseMediaEvent
{

    private static final String ATTR_PTS = "pts";
    public static final String TYPE = "updatePts";
    private int pts;

    public UpdatePts(JSONObject jsonobject)
        throws JSONException
    {
        super("updatePts", jsonobject);
    }

    public int getPts()
    {
        return pts;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        pts = getInt(jsonobject, "pts", 0);
    }
}
