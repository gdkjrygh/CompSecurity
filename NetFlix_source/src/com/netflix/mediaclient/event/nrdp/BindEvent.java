// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp:
//            BaseNrdpEvent

public class BindEvent extends BaseNrdpEvent
{

    public static final String TYPE = "bind";

    public BindEvent(JSONObject jsonobject)
        throws JSONException
    {
        super("bind", jsonobject);
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
    }
}
