// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.csi.lib;

import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.google.android.apps.common.csi.lib:
//            Sender

public final class Configuration
{

    private int batchSize;
    private int bufferLimit;
    private String csiServer;
    private int csiVersion;
    private Map customParams;
    private final String osVersion;
    private String productName;
    private String productVersion;
    private int retryLimit;
    private final String sdkVersion;
    private int sendInterval;
    private Sender sender;
    private String serviceName;

    public Configuration()
    {
        osVersion = String.format("Android %s", new Object[] {
            android.os.Build.VERSION.RELEASE
        });
        sdkVersion = android.os.Build.VERSION.SDK;
        csiVersion = 3;
        serviceName = "_s";
        csiServer = "https://csi.gstatic.com/csi";
        bufferLimit = 16;
        retryLimit = 3;
        sendInterval = 1;
        batchSize = 1;
        customParams = new LinkedHashMap();
    }

    private static int checkValueIsGreaterThanZero(int i, String s)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException(String.format("%s must be greater than 0.", new Object[] {
                s
            }));
        } else
        {
            return i;
        }
    }

    public final int getBufferLimit()
    {
        return bufferLimit;
    }

    public final String getCsiServer()
    {
        return csiServer;
    }

    public final int getCsiVersion()
    {
        return csiVersion;
    }

    public final int getRetryLimit()
    {
        return retryLimit;
    }

    public final Sender getSender()
    {
        if (sender == null)
        {
            sender = new Sender(productName, productVersion);
        }
        return sender;
    }

    public final String getServiceName()
    {
        return serviceName;
    }

    public final Configuration setBatchSize(int i)
    {
        batchSize = checkValueIsGreaterThanZero(i, "batchSize");
        return this;
    }

    public final Configuration setServiceName(String s)
    {
        serviceName = s;
        return this;
    }
}
