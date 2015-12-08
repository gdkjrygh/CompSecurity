// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            BaseMediaEvent

public class GenericMediaEvent extends BaseMediaEvent
{

    public static final String bufferingComplete = "bufferingComplete";
    public static final String endOfStream = "endOfStream";
    public static final String openComplete = "openComplete";
    public static final String underflow = "underflow";

    public GenericMediaEvent(String s)
    {
        super(s);
    }

    protected String getJSON()
    {
        return "{}";
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
    }
}
