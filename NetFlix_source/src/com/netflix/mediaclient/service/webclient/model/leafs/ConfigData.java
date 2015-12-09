// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.leafs;


// Referenced classes of package com.netflix.mediaclient.service.webclient.model.leafs:
//            AccountConfigData, DeviceConfigData

public class ConfigData
{

    public AccountConfigData accountConfig;
    public DeviceConfigData deviceConfig;
    public String streamingqoeJson;

    public ConfigData()
    {
    }

    public AccountConfigData getAccountConfig()
    {
        return accountConfig;
    }

    public DeviceConfigData getDeviceConfig()
    {
        return deviceConfig;
    }

    public String getStreamingConfig()
    {
        return streamingqoeJson;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("ConfigData [deviceConfig=");
        String s;
        if (deviceConfig != null)
        {
            s = deviceConfig.toString();
        } else
        {
            s = "null";
        }
        stringbuilder = stringbuilder.append(s).append(", accountConfig=");
        if (accountConfig != null)
        {
            s = accountConfig.toString();
        } else
        {
            s = "null";
        }
        return stringbuilder.append(s).append(", streamingqoeJson=").append(streamingqoeJson).append("]").toString();
    }
}
