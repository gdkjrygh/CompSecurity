// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.mdx;

import com.netflix.mediaclient.event.nrdp.JsonBaseNccpEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class InitEvent extends JsonBaseNccpEvent
{

    public static final com.netflix.mediaclient.javabridge.ui.Mdx.Events TYPE;

    public InitEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(TYPE.getName(), jsonobject);
    }

    public String getObject()
    {
        return "nrdp.mdx";
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
    }

    static 
    {
        TYPE = com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_init;
    }
}
