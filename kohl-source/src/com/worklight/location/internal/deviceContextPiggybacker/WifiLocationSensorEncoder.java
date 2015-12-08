// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.deviceContextPiggybacker;

import com.worklight.location.api.wifi.WLWifiLocation;

// Referenced classes of package com.worklight.location.internal.deviceContextPiggybacker:
//            SensorEncoder, WifiTimestampSensorEncoder, DeviceContextPiggybacker, AccessPointsSensorEncoder

final class WifiLocationSensorEncoder
    implements SensorEncoder
{

    final DeviceContextPiggybacker deviceContextPiggybacker;

    WifiLocationSensorEncoder(DeviceContextPiggybacker devicecontextpiggybacker)
    {
        deviceContextPiggybacker = devicecontextpiggybacker;
    }

    public void encode(WLWifiLocation wlwifilocation)
    {
        deviceContextPiggybacker.encodeSensor(wlwifilocation.getTimestamp(), new WifiTimestampSensorEncoder(deviceContextPiggybacker));
        deviceContextPiggybacker.encodeSensor(wlwifilocation.getAccessPoints(), new AccessPointsSensorEncoder(deviceContextPiggybacker, wlwifilocation));
    }

    public volatile void encode(Object obj)
    {
        encode((WLWifiLocation)obj);
    }
}
