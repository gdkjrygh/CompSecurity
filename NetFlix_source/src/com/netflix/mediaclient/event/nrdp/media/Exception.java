// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            BaseMediaEvent

public class Exception extends BaseMediaEvent
{

    private static final String ATTR_EXCEPTION = "exception";
    public static final String TYPE = "exception";
    private String exception;

    public Exception(JSONObject jsonobject)
        throws JSONException
    {
        super("exception", jsonobject);
    }

    public String getException()
    {
        return exception;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        exception = getString(jsonobject, "exception", null);
    }
}
