// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.deviceContextPiggybacker;

import com.worklight.location.api.geo.WLGeoPosition;
import com.worklight.location.api.wifi.WLWifiLocation;
import com.worklight.location.internal.DeviceContextImpl;

// Referenced classes of package com.worklight.location.internal.deviceContextPiggybacker:
//            SensorEncoder, DeviceContextPiggybacker

final class LastModifiedSensorEncoder
    implements SensorEncoder
{

    private final DeviceContextImpl deviceContext;
    private final DeviceContextPiggybacker deviceContextPiggybacker;

    LastModifiedSensorEncoder(DeviceContextPiggybacker devicecontextpiggybacker, DeviceContextImpl devicecontextimpl)
    {
        deviceContextPiggybacker = devicecontextpiggybacker;
        deviceContext = devicecontextimpl;
    }

    public void encode(Long long1)
    {
        long l1 = -1L;
        long l = l1;
        if (deviceContext.getGeoPosition() != null)
        {
            l = l1;
            if (deviceContext.getGeoPosition().getTimestamp() != null)
            {
                l = deviceContext.getGeoPosition().getTimestamp().longValue();
            }
        }
        l1 = l;
        if (deviceContext.getWifiLocation() != null)
        {
            l1 = l;
            if (deviceContext.getWifiLocation().getTimestamp() != null)
            {
                l1 = Math.max(l, deviceContext.getWifiLocation().getTimestamp().longValue());
            }
        }
        if (long1.longValue() == l1)
        {
            deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.writeNumber(1L, 1));
            return;
        } else
        {
            deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.writeNumber(0L, 1));
            deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.encodeNonNegativeNumber(long1.longValue()));
            return;
        }
    }

    public volatile void encode(Object obj)
    {
        encode((Long)obj);
    }
}
