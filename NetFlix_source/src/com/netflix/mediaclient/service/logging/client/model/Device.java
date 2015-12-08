// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;

import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class Device
{

    public static final String ESN = "esn";
    public static final String MODEL = "model";
    public static final String TYPE = "type";
    private String esn;
    private String model;
    private String type;

    public Device()
    {
        type = EsnProvider.ESN_PREFIX;
    }

    Device(com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface)
    {
        type = EsnProvider.ESN_PREFIX;
        if (configurationagentinterface == null)
        {
            throw new IllegalArgumentException("Configuration is null!");
        } else
        {
            model = configurationagentinterface.getEsnProvider().getDeviceModel();
            esn = configurationagentinterface.getEsnProvider().getEsn();
            return;
        }
    }

    public static Device createInstance(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            return null;
        } else
        {
            Device device = new Device();
            device.esn = JsonUtils.getString(jsonobject, "esn", null);
            device.model = JsonUtils.getString(jsonobject, "model", null);
            device.type = JsonUtils.getString(jsonobject, "type", null);
            return device;
        }
    }

    public String getEsn()
    {
        return esn;
    }

    public String getModel()
    {
        return model;
    }

    public String getType()
    {
        return type;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        if (esn != null)
        {
            jsonobject.put("esn", esn);
        }
        if (model != null)
        {
            jsonobject.put("model", model);
        }
        if (type != null)
        {
            jsonobject.put("type", type);
        }
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Device [esn=").append(esn).append(", type=").append(type).append(", model=").append(model).append("]").toString();
    }
}
