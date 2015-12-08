// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            BaseMediaEvent

public class SetVideoBitrateRange extends BaseMediaEvent
{

    private static final String ATTR_ERROR = "error";
    public static final String TYPE = "setvideobitraterange";
    private boolean error;

    public SetVideoBitrateRange(JSONObject jsonobject)
        throws JSONException
    {
        super("setvideobitraterange", jsonobject);
        error = false;
    }

    public boolean isError()
    {
        return error;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        error = getBoolean(jsonobject, "error", false);
    }
}
