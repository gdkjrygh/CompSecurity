// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import com.netflix.mediaclient.event.nrdp.JsonBaseNccpEvent;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            MediaEvent

public abstract class BaseMediaEvent extends JsonBaseNccpEvent
    implements MediaEvent
{

    public BaseMediaEvent(String s)
    {
        super(s);
    }

    public BaseMediaEvent(String s, JSONObject jsonobject)
        throws JSONException
    {
        super(s, jsonobject);
    }

    public String getObject()
    {
        return "nrdp.media";
    }
}
