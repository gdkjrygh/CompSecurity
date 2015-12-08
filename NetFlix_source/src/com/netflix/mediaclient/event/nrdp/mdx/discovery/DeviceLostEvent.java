// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.mdx.discovery;

import com.netflix.mediaclient.event.nrdp.JsonBaseNccpEvent;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.RemoteDevice;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceLostEvent extends JsonBaseNccpEvent
{

    private static final String ATTR_devicelist = "devicelist";
    public static final com.netflix.mediaclient.javabridge.ui.Mdx.Events TYPE;
    private String devices[];

    public DeviceLostEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(TYPE.getName(), jsonobject);
    }

    public String[] getDevices()
    {
        return devices;
    }

    public String getObject()
    {
        return "nrdp.mdx";
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
label0:
        {
            if (jsonobject.has("devicelist"))
            {
                jsonobject = jsonobject.getJSONArray("devicelist");
                if (jsonobject != null)
                {
                    devices = new String[jsonobject.length()];
                    for (int i = 0; i < jsonobject.length(); i++)
                    {
                        devices[i] = RemoteDevice.decode(jsonobject.getString(i));
                    }

                    break label0;
                }
            }
            devices = new String[0];
        }
    }

    static 
    {
        TYPE = com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_discovery_devicelost;
    }
}
