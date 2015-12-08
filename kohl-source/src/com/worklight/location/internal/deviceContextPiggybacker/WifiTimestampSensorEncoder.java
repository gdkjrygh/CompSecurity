// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.deviceContextPiggybacker;


// Referenced classes of package com.worklight.location.internal.deviceContextPiggybacker:
//            SensorEncoder, DeviceContextPiggybacker

final class WifiTimestampSensorEncoder
    implements SensorEncoder
{

    private final DeviceContextPiggybacker deviceContextPiggybacker;

    public WifiTimestampSensorEncoder(DeviceContextPiggybacker devicecontextpiggybacker)
    {
        deviceContextPiggybacker = devicecontextpiggybacker;
    }

    public void encode(Long long1)
    {
        deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.encodeNonNegativeNumber(long1.longValue()));
    }

    public volatile void encode(Object obj)
    {
        encode((Long)obj);
    }
}
