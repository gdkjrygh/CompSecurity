// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.deviceContextPiggybacker;


// Referenced classes of package com.worklight.location.internal.deviceContextPiggybacker:
//            SensorEncoder, DeviceContextPiggybacker

final class TimezoneOffsetSensorEncoder
    implements SensorEncoder
{

    private final DeviceContextPiggybacker deviceContextPiggybacker;

    TimezoneOffsetSensorEncoder(DeviceContextPiggybacker devicecontextpiggybacker)
    {
        deviceContextPiggybacker = devicecontextpiggybacker;
    }

    public void encode(Integer integer)
    {
        deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.encodeWholeNumber(integer.intValue()));
    }

    public volatile void encode(Object obj)
    {
        encode((Integer)obj);
    }
}
