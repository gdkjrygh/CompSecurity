// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.mdx.discovery;

import com.netflix.mediaclient.event.nrdp.JsonBaseNccpEvent;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.RemoteDevice;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceFoundEvent extends JsonBaseNccpEvent
{

    public static final com.netflix.mediaclient.javabridge.ui.Mdx.Events TYPE;
    private RemoteDevice device;

    public DeviceFoundEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(TYPE.getName(), jsonobject);
    }

    public String getObject()
    {
        return "nrdp.mdx";
    }

    public RemoteDevice getRemoteDevice()
    {
        return device;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        device = RemoteDevice.toRemoteDevice(jsonobject);
    }

    static 
    {
        TYPE = com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_discovery_devicefound;
    }
}
