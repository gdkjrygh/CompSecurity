// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alipay.itscenter.biz.rpc.devicefingerprint.request;

import java.io.Serializable;
import java.util.Map;

public class DeviceDataReportRequest
    implements Serializable
{

    public String apdid;
    public Map appData;
    public Map dynamicData;
    public String lastTime;
    public String os;
    public String sessionKey;
    public Map staticData;
    public String token;
    public String version;

    public DeviceDataReportRequest()
    {
    }
}
