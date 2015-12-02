// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alipay.itscenter.biz.rpc.devicefingerprint.result;

import java.io.Serializable;

// Referenced classes of package com.alipay.itscenter.biz.rpc.devicefingerprint.result:
//            BaseResult

public class DeviceFingerPrintResult extends BaseResult
    implements Serializable
{

    public String apdid;
    public String currentTime;
    public boolean reset;
    public String token;
    public String version;

    public DeviceFingerPrintResult()
    {
    }
}
