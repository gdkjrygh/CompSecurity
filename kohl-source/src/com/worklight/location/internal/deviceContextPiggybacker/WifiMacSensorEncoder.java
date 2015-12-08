// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.deviceContextPiggybacker;

import com.worklight.location.internal.nativeImpl.LocationUtils;

// Referenced classes of package com.worklight.location.internal.deviceContextPiggybacker:
//            SensorEncoder, DeviceContextPiggybacker

final class WifiMacSensorEncoder
    implements SensorEncoder
{

    private final DeviceContextPiggybacker deviceContextPiggybacker;

    public WifiMacSensorEncoder(DeviceContextPiggybacker devicecontextpiggybacker)
    {
        deviceContextPiggybacker = devicecontextpiggybacker;
    }

    public volatile void encode(Object obj)
    {
        encode((String)obj);
    }

    public void encode(String s)
    {
        boolean flag;
        if (s.length() != 17 && s.length() != 23)
        {
            flag = false;
        } else
        {
            flag = LocationUtils.matchesMacRegex(s);
        }
        deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.encodeBoolean(flag));
        if (flag)
        {
            StringBuilder stringbuilder = deviceContextPiggybacker.sensorInfo;
            DeviceContextPiggybacker devicecontextpiggybacker = deviceContextPiggybacker;
            int i;
            if (s.length() == 17)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            stringbuilder.append(devicecontextpiggybacker.encodeBoolean(flag));
            i = 0;
            while (i < s.length()) 
            {
                if (i % 3 != 2)
                {
                    deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.writeNumber(Integer.parseInt(s.substring(i, i + 1), 16), 4));
                }
                i++;
            }
        } else
        {
            deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.encodeNonNegativeNumber(s.length()));
            deviceContextPiggybacker.textData.append(s);
        }
    }
}
