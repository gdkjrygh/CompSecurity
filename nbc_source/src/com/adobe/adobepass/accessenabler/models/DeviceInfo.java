// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.models;


public class DeviceInfo
{

    private String clientType;
    private String deviceType;
    private String os;

    public DeviceInfo()
    {
        deviceType = "";
        os = "";
        clientType = "";
    }

    public String getClientType()
    {
        return clientType;
    }

    public String getDeviceType()
    {
        return deviceType;
    }

    public String getOs()
    {
        return os;
    }

    public void setClientType(String s)
    {
        clientType = s;
    }

    public void setDeviceType(String s)
    {
        deviceType = s;
    }

    public void setOs(String s)
    {
        os = s;
    }
}
