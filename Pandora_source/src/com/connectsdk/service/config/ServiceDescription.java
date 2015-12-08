// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service.config;

import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ServiceDescription
{

    String UUID;
    String applicationURL;
    String friendlyName;
    String ipAddress;
    long lastDetection;
    String manufacturer;
    String modelDescription;
    String modelName;
    String modelNumber;
    int port;
    Map responseHeaders;
    String serviceFilter;
    String serviceID;
    List serviceList;
    String version;

    public ServiceDescription()
    {
        lastDetection = 0x7fffffffffffffffL;
    }

    public ServiceDescription(String s, String s1, String s2)
    {
        lastDetection = 0x7fffffffffffffffL;
        serviceFilter = s;
        UUID = s1;
        ipAddress = s2;
    }

    public String getApplicationURL()
    {
        return applicationURL;
    }

    public String getFriendlyName()
    {
        return friendlyName;
    }

    public String getIpAddress()
    {
        return ipAddress;
    }

    public long getLastDetection()
    {
        return lastDetection;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public String getModelDescription()
    {
        return modelDescription;
    }

    public String getModelName()
    {
        return modelName;
    }

    public String getModelNumber()
    {
        return modelNumber;
    }

    public int getPort()
    {
        return port;
    }

    public Map getResponseHeaders()
    {
        return responseHeaders;
    }

    public String getServiceFilter()
    {
        return serviceFilter;
    }

    public String getServiceID()
    {
        return serviceID;
    }

    public List getServiceList()
    {
        return serviceList;
    }

    public String getUUID()
    {
        return UUID;
    }

    public String getVersion()
    {
        return version;
    }

    public void setApplicationURL(String s)
    {
        applicationURL = s;
    }

    public void setFriendlyName(String s)
    {
        friendlyName = s;
    }

    public void setIpAddress(String s)
    {
        ipAddress = s;
    }

    public void setLastDetection(long l)
    {
        lastDetection = l;
    }

    public void setManufacturer(String s)
    {
        manufacturer = s;
    }

    public void setModelDescription(String s)
    {
        modelDescription = s;
    }

    public void setModelName(String s)
    {
        modelName = s;
    }

    public void setModelNumber(String s)
    {
        modelNumber = s;
    }

    public void setPort(int i)
    {
        port = i;
    }

    public void setResponseHeaders(Map map)
    {
        responseHeaders = map;
    }

    public void setServiceFilter(String s)
    {
        serviceFilter = s;
    }

    public void setServiceID(String s)
    {
        serviceID = s;
    }

    public void setServiceList(List list)
    {
        serviceList = list;
    }

    public void setUUID(String s)
    {
        UUID = s;
    }

    public void setVersion(String s)
    {
        version = s;
    }

    public JSONObject toJSONObject()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.putOpt("filter", serviceFilter);
            jsonobject.putOpt("ipAddress", ipAddress);
            jsonobject.putOpt("uuid", UUID);
            jsonobject.putOpt("friendlyName", friendlyName);
            jsonobject.putOpt("modelName", modelName);
            jsonobject.putOpt("modelNumber", modelNumber);
            jsonobject.putOpt("port", Integer.valueOf(port));
            jsonobject.putOpt("version", version);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }
}
