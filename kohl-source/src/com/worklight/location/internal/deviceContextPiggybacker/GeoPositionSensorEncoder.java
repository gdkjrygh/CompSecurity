// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.deviceContextPiggybacker;

import com.worklight.location.api.geo.WLCoordinate;
import com.worklight.location.api.geo.WLGeoPosition;

// Referenced classes of package com.worklight.location.internal.deviceContextPiggybacker:
//            SensorEncoder, DeviceContextPiggybacker

final class GeoPositionSensorEncoder
    implements SensorEncoder
{

    private final DeviceContextPiggybacker deviceContextPiggybacker;

    GeoPositionSensorEncoder(DeviceContextPiggybacker devicecontextpiggybacker)
    {
        deviceContextPiggybacker = devicecontextpiggybacker;
    }

    public void encode(WLGeoPosition wlgeoposition)
    {
        WLCoordinate wlcoordinate = wlgeoposition.getCoordinate();
        Object obj;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        if (wlgeoposition.getTimestamp() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (wlcoordinate != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 && wlcoordinate.getSpeed() != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag1 && wlcoordinate.getHeading() != null)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag1 && wlcoordinate.getAltitude() != null)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (flag1 && wlcoordinate.getAltitudeAccuracy() != null)
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        if (flag && flag1 && flag1 && flag1 && flag2 && flag3 && flag4 && flag5)
        {
            deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.writeNumber(1L, 1));
        } else
        {
            deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.writeNumber(0L, 1));
            deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.encodeBoolean(flag));
            deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.encodeBoolean(flag1));
            deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.encodeBoolean(flag1));
            deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.encodeBoolean(flag1));
            deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.encodeBoolean(flag2));
            deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.encodeBoolean(flag3));
            deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.encodeBoolean(flag4));
            deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.encodeBoolean(flag5));
        }
        if (flag)
        {
            deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.encodeNonNegativeNumber(wlgeoposition.getTimestamp().longValue()));
        }
        obj = "";
        if (flag1)
        {
            obj = deviceContextPiggybacker.encodeCoordsValue(Double.valueOf(wlcoordinate.getLongitude()), "");
        }
        wlgeoposition = ((WLGeoPosition) (obj));
        if (flag1)
        {
            wlgeoposition = deviceContextPiggybacker.encodeCoordsValue(Double.valueOf(wlcoordinate.getLatitude()), ((String) (obj)));
        }
        obj = wlgeoposition;
        if (flag1)
        {
            obj = deviceContextPiggybacker.encodeCoordsValue(Double.valueOf(wlcoordinate.getAccuracy()), wlgeoposition);
        }
        wlgeoposition = ((WLGeoPosition) (obj));
        if (flag2)
        {
            wlgeoposition = deviceContextPiggybacker.encodeCoordsValue(wlcoordinate.getSpeed(), ((String) (obj)));
        }
        obj = wlgeoposition;
        if (flag3)
        {
            obj = deviceContextPiggybacker.encodeCoordsValue(wlcoordinate.getHeading(), wlgeoposition);
        }
        wlgeoposition = ((WLGeoPosition) (obj));
        if (flag4)
        {
            wlgeoposition = deviceContextPiggybacker.encodeCoordsValue(wlcoordinate.getAltitude(), ((String) (obj)));
        }
        obj = wlgeoposition;
        if (flag5)
        {
            obj = deviceContextPiggybacker.encodeCoordsValue(wlcoordinate.getAltitudeAccuracy(), wlgeoposition);
        }
        deviceContextPiggybacker.textData.append(((String) (obj)));
    }

    public volatile void encode(Object obj)
    {
        encode((WLGeoPosition)obj);
    }
}
