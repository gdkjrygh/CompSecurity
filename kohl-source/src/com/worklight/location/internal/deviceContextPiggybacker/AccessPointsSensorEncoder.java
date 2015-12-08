// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.deviceContextPiggybacker;

import com.worklight.location.api.wifi.WLWifiAccessPoint;
import com.worklight.location.api.wifi.WLWifiLocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.worklight.location.internal.deviceContextPiggybacker:
//            SensorEncoder, DeviceContextPiggybacker, WifiMacSensorEncoder

final class AccessPointsSensorEncoder
    implements SensorEncoder
{

    private final DeviceContextPiggybacker deviceContextPiggybacker;
    private final WLWifiLocation wifi;

    AccessPointsSensorEncoder(DeviceContextPiggybacker devicecontextpiggybacker, WLWifiLocation wlwifilocation)
    {
        deviceContextPiggybacker = devicecontextpiggybacker;
        wifi = wlwifilocation;
    }

    public volatile void encode(Object obj)
    {
        encode((List)obj);
    }

    public void encode(List list)
    {
        deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.encodeNonNegativeNumber(list.size()));
        ArrayList arraylist = new ArrayList();
        int j = -1;
        int i = -1;
        Iterator iterator = list.iterator();
label0:
        do
        {
            if (iterator.hasNext())
            {
                WLWifiAccessPoint wlwifiaccesspoint = (WLWifiAccessPoint)iterator.next();
                int k = i + 1;
                byte byte0 = -1;
                i = 0;
                do
                {
label1:
                    {
                        int l = byte0;
                        if (i < arraylist.size())
                        {
                            if (!((String)arraylist.get(i)).equals(wlwifiaccesspoint.getSSID()))
                            {
                                break label1;
                            }
                            l = i;
                        }
                        if (k > 0)
                        {
                            StringBuilder stringbuilder = deviceContextPiggybacker.sensorInfo;
                            DeviceContextPiggybacker devicecontextpiggybacker = deviceContextPiggybacker;
                            boolean flag;
                            if (l >= 0)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            stringbuilder.append(devicecontextpiggybacker.encodeBoolean(flag));
                        }
                        if (l >= 0)
                        {
                            deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.writeNumber(l, deviceContextPiggybacker.getNumBitsToEncode(arraylist.size())));
                        } else
                        {
                            deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.encodeNonNegativeNumber(wlwifiaccesspoint.getSSID().length() - 1));
                            deviceContextPiggybacker.textData.append(wlwifiaccesspoint.getSSID());
                            arraylist.add(wlwifiaccesspoint.getSSID());
                        }
                        deviceContextPiggybacker.encodeSensor(wlwifiaccesspoint.getMAC(), new WifiMacSensorEncoder(deviceContextPiggybacker));
                        i = k;
                        if (wlwifiaccesspoint.equals(wifi.getConnectedAccessPoint()))
                        {
                            j = k;
                            i = k;
                        }
                        continue label0;
                    }
                    i++;
                } while (true);
            }
            if (j < 0)
            {
                deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.encodeBoolean(false));
                return;
            }
            deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.encodeBoolean(true));
            deviceContextPiggybacker.sensorInfo.append(deviceContextPiggybacker.writeNumber(j, deviceContextPiggybacker.getNumBitsToEncode(list.size())));
            return;
        } while (true);
    }
}
