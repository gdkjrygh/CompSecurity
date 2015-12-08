// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            BaseMediaEvent

public class Buffering extends BaseMediaEvent
{

    private static final String ATTR_PERCENTAGE = "percentage";
    public static final String TYPE = "buffering";
    private int percentage;

    public Buffering(JSONObject jsonobject)
        throws JSONException
    {
        super("buffering", jsonobject);
    }

    public int getPercentage()
    {
        return percentage;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        percentage = getInt(jsonobject, "percentage", 0);
    }
}
