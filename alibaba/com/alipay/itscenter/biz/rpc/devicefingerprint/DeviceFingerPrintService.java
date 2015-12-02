// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alipay.itscenter.biz.rpc.devicefingerprint;

import com.alipay.itscenter.biz.rpc.devicefingerprint.request.DeviceDataReportRequest;
import com.alipay.itscenter.biz.rpc.devicefingerprint.result.DeviceFingerPrintResult;

public interface DeviceFingerPrintService
{

    public abstract DeviceFingerPrintResult reportDynamicData(DeviceDataReportRequest devicedatareportrequest);

    public abstract DeviceFingerPrintResult reportStaticData(DeviceDataReportRequest devicedatareportrequest);
}
