// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.mdx;

import com.netflix.mediaclient.event.nrdp.BaseUIEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class InterfaceChangedEvent extends BaseUIEvent
{

    private static final String ATTR_connected = "connected";
    private static final String ATTR_interface = "interface";
    private static final String ATTR_ipaddress = "ipaddress";
    private static final String ATTR_ssid = "ssid";
    public static final String TYPE = "interfacechange";
    private boolean connected;
    private String ipAddress;
    private String networkInterface;
    private String ssid;

    public InterfaceChangedEvent(boolean flag, String s, String s1, String s2)
    {
        super("interfacechange");
        connected = flag;
        networkInterface = s;
        ipAddress = s1;
        if (s2 != null)
        {
            ssid = s2;
            return;
        } else
        {
            ssid = "";
            return;
        }
    }

    public JSONObject getData()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("connected", connected);
        jsonobject.put("interface", networkInterface);
        jsonobject.put("ipaddress", ipAddress);
        jsonobject.put("ssid", ssid);
        jsonobject.put("type", getType());
        return jsonobject;
    }

    public String getName()
    {
        return "IMdx";
    }

    public String getObject()
    {
        return "nrdp.mdx";
    }
}
