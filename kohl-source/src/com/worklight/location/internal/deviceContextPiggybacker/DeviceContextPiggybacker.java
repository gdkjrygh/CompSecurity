// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.deviceContextPiggybacker;

import com.worklight.location.internal.DeviceContextImpl;
import com.worklight.wlclient.WLRequestPiggybacker;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLRequestOptions;
import com.worklight.wlclient.api.WLResponse;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Map;

// Referenced classes of package com.worklight.location.internal.deviceContextPiggybacker:
//            GeoPositionSensorEncoder, WifiLocationSensorEncoder, LastModifiedSensorEncoder, TimezoneOffsetSensorEncoder, 
//            SensorEncoder

public class DeviceContextPiggybacker
    implements WLRequestPiggybacker
{

    private static final String SECURE_RANDOME_ALGORITHM = "SHA1PRNG";
    private StringBuilder binaryData;
    private final DeviceContextImpl dc;
    private int numOutstandingBits;
    private long outstandingValue;
    StringBuilder sensorInfo;
    private final int sessionRandom;
    private final long sessionTimestamp = System.currentTimeMillis();
    private StringBuilder temp;
    StringBuilder textData;

    public DeviceContextPiggybacker(DeviceContextImpl devicecontextimpl)
    {
        outstandingValue = 0L;
        numOutstandingBits = 0;
        binaryData = new StringBuilder();
        textData = new StringBuilder();
        sensorInfo = new StringBuilder();
        temp = new StringBuilder();
        dc = devicecontextimpl;
        try
        {
            sessionRandom = (int)Math.floor(16777216D * SecureRandom.getInstance("SHA1PRNG").nextDouble());
        }
        // Misplaced declaration of an exception variable
        catch (DeviceContextImpl devicecontextimpl)
        {
            throw new Error(devicecontextimpl.getMessage());
        }
    }

    private char base64AEncode(long l)
    {
        l &= 63L;
        if (l < 26L)
        {
            return (char)(int)(65L + l);
        }
        if (l < 52L)
        {
            return (char)(int)((97L + l) - 26L);
        }
        if (l < 62L)
        {
            return (char)(int)((48L + l) - 52L);
        }
        if (l == 62L)
        {
            return '-';
        }
        if (l == 63L)
        {
            return '_';
        } else
        {
            throw new IllegalStateException("Internal error in base64AEncode");
        }
    }

    private String clearTemp(int i)
    {
        String s = temp.substring(i);
        temp.setLength(i);
        return s;
    }

    private String finishEncode()
    {
        if (numOutstandingBits == 0)
        {
            return "";
        } else
        {
            String s = writeNumber(0L, 6 - numOutstandingBits);
            numOutstandingBits = 0;
            outstandingValue = 0L;
            return s;
        }
    }

    private String getMessage(DeviceContextImpl devicecontextimpl)
    {
        this;
        JVM INSTR monitorenter ;
        outstandingValue = 0L;
        numOutstandingBits = 0;
        binaryData.setLength(0);
        textData.setLength(0);
        sensorInfo.setLength(0);
        temp.setLength(0);
        binaryData.append(encodeNonNegativeNumber(0L));
        binaryData.append(writeNumber(sessionRandom, 24));
        binaryData.append(encodeNonNegativeNumber(sessionTimestamp));
        binaryData.append(encodeNonNegativeNumber(devicecontextimpl.getVersion()));
        binaryData.append(finishEncode());
        if (devicecontextimpl.getGeoPosition() != null || devicecontextimpl.getWifiLocation() != null) goto _L2; else goto _L1
_L1:
        binaryData.append(encodeNonNegativeNumber(0L));
        devicecontextimpl = binaryData.toString();
_L4:
        this;
        JVM INSTR monitorexit ;
        return devicecontextimpl;
_L2:
        encodeSensor(devicecontextimpl.getGeoPosition(), new GeoPositionSensorEncoder(this));
        encodeSensor(devicecontextimpl.getWifiLocation(), new WifiLocationSensorEncoder(this));
        encodeSensor(devicecontextimpl.getLastModified(), new LastModifiedSensorEncoder(this, devicecontextimpl));
        encodeSensor(devicecontextimpl.getTimezoneOffset(), new TimezoneOffsetSensorEncoder(this));
        sensorInfo.append(finishEncode());
        binaryData.append(encodeNonNegativeNumber(sensorInfo.length())).append(sensorInfo).append(textData);
        devicecontextimpl = binaryData.toString();
        binaryData.setLength(0);
        textData.setLength(0);
        sensorInfo.setLength(0);
        if (true) goto _L4; else goto _L3
_L3:
        devicecontextimpl;
        throw devicecontextimpl;
    }

    String encodeBoolean(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return writeNumber(i, 1);
    }

    String encodeCoordsValue(Object obj, String s)
    {
        textData.append(s);
        if (obj == null)
        {
            textData.append('_');
            return "";
        } else
        {
            textData.append(obj);
            return "~";
        }
    }

    String encodeNonNegativeNumber(long l)
    {
        int i = temp.length();
        boolean flag = true;
        while (flag) 
        {
            long l2 = l & 31L;
            long l1 = l >> 5;
            if (l1 > 0L)
            {
                l = l2 | 32L;
            } else
            {
                flag = false;
                l = l2;
            }
            temp.append(writeNumber(l, 6));
            l = l1;
        }
        return clearTemp(i);
    }

    void encodeSensor(Object obj, SensorEncoder sensorencoder)
    {
        if (obj == null)
        {
            sensorInfo.append(encodeBoolean(false));
            return;
        } else
        {
            sensorInfo.append(encodeBoolean(true));
            sensorencoder.encode(obj);
            return;
        }
    }

    String encodeWholeNumber(long l)
    {
        StringBuilder stringbuilder = new StringBuilder();
        boolean flag;
        if (l < 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return stringbuilder.append(encodeBoolean(flag)).append(encodeNonNegativeNumber(Math.abs(l))).toString();
    }

    int getNumBitsToEncode(int i)
    {
        return Integer.numberOfTrailingZeros(Integer.highestOneBit(i + 1));
    }

    public void onFailure(WLFailResponse wlfailresponse)
    {
    }

    public void onSuccess(WLResponse wlresponse)
    {
    }

    public void processOptions(String s, WLRequestOptions wlrequestoptions)
    {
        if (!s.endsWith("events") && !s.endsWith("query") && !s.endsWith("invoke"))
        {
            return;
        } else
        {
            wlrequestoptions.getParameters().put("__wl_deviceCtx", getMessage(dc.clone()));
            return;
        }
    }

    String writeNumber(long l, int i)
    {
        if (i == 0)
        {
            return "";
        }
        int k = numOutstandingBits + i;
        if (k < 6)
        {
            outstandingValue = outstandingValue << i;
            outstandingValue = outstandingValue + ((long)((1 << i) - 1) & l);
            numOutstandingBits = k;
            return "";
        }
        int j1 = temp.length();
        int j = i;
        for (i = k; i >= 6; i -= 6)
        {
            int i1 = 6 - numOutstandingBits;
            outstandingValue = outstandingValue << i1;
            outstandingValue = outstandingValue + (l >> j - i1 & (long)((1 << i1) - 1));
            temp.append(base64AEncode(outstandingValue));
            outstandingValue = 0L;
            numOutstandingBits = 0;
            j -= i1;
        }

        outstandingValue = (long)((1 << i) - 1) & l;
        numOutstandingBits = i;
        return clearTemp(j1);
    }
}
