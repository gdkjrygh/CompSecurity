// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            BaseMediaEvent

public class Statechanged extends BaseMediaEvent
{

    private static final String ATTR_STATE = "state";
    public static final String TYPE = "statechanged";
    private int state;

    public Statechanged(JSONObject jsonobject)
        throws JSONException
    {
        super("statechanged", jsonobject);
    }

    public int getState()
    {
        return state;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        state = getInt(jsonobject, "state", -1);
    }
}
