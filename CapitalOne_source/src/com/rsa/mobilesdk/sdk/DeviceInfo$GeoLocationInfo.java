// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.rsa.mobilesdk.sdk;

import android.location.Location;
import android.text.format.Time;

// Referenced classes of package com.rsa.mobilesdk.sdk:
//            DeviceInfo, Utils

class this._cls0
{

    public double Altitude;
    public double AltitudeAccuracy;
    public boolean AltitudeAccuracyAvailable;
    public boolean AltitudeAvailable;
    public double Heading;
    public boolean HeadingAvailable;
    public double HorizontalAccuracy;
    public boolean HorizontalAccuracyAvailable;
    public double Latitude;
    public boolean LatitudeAvailable;
    public int LocationDataStatus;
    public double Longitude;
    public boolean LongitudeAvailable;
    public double Speed;
    public boolean SpeedAvailable;
    public long Timestamp;
    final DeviceInfo this$0;

    void invalidate()
    {
        LongitudeAvailable = false;
        LatitudeAvailable = false;
        HorizontalAccuracyAvailable = false;
        AltitudeAvailable = false;
        AltitudeAccuracyAvailable = false;
        Timestamp = 0L;
        HeadingAvailable = false;
        SpeedAvailable = false;
    }

    void set(Location location, int i)
    {
        invalidate();
        LocationDataStatus = i;
        if (location != null)
        {
            Latitude = location.getLatitude();
            LatitudeAvailable = true;
            Longitude = location.getLongitude();
            LongitudeAvailable = true;
            if (location.hasAccuracy())
            {
                HorizontalAccuracy = location.getAccuracy();
                HorizontalAccuracyAvailable = true;
            }
            if (location.hasAltitude())
            {
                Altitude = location.getAltitude();
                AltitudeAvailable = true;
                if (location.hasAccuracy())
                {
                    AltitudeAccuracy = location.getAccuracy();
                    AltitudeAccuracyAvailable = true;
                }
            }
            if (location.hasBearing())
            {
                Heading = location.getBearing();
                HeadingAvailable = true;
            }
            if (location.hasSpeed())
            {
                Speed = location.getSpeed();
                SpeedAvailable = true;
            }
            Timestamp = location.getTime();
        }
    }

    public String toString()
    {
        StringBuffer stringbuffer;
        stringbuffer = new StringBuffer();
        stringbuffer.append("Latitude: ");
        Time time;
        if (LatitudeAvailable)
        {
            stringbuffer.append(Utils.getDoubleString(Latitude));
        } else
        {
            stringbuffer.append("unavailable");
        }
        stringbuffer.append("\n");
        stringbuffer.append("Longitude: ");
        if (LongitudeAvailable)
        {
            stringbuffer.append(Utils.getDoubleString(Longitude));
        } else
        {
            stringbuffer.append("unavailable");
        }
        stringbuffer.append("\n");
        stringbuffer.append("Horizontal Accuracy: ");
        if (HorizontalAccuracyAvailable)
        {
            stringbuffer.append(Math.round(HorizontalAccuracy));
        } else
        {
            stringbuffer.append("unavailable");
        }
        stringbuffer.append("\n");
        stringbuffer.append("Altitude: ");
        if (AltitudeAvailable)
        {
            stringbuffer.append(Math.round(Altitude));
        } else
        {
            stringbuffer.append("unavailable");
        }
        stringbuffer.append("\n");
        stringbuffer.append("Altitude Accuracy: ");
        if (AltitudeAccuracyAvailable)
        {
            stringbuffer.append(Math.round(AltitudeAccuracy));
        } else
        {
            stringbuffer.append("unavailable");
        }
        stringbuffer.append("\n");
        stringbuffer.append("Heading: ");
        if (HeadingAvailable)
        {
            stringbuffer.append(Math.round(Heading));
        } else
        {
            stringbuffer.append("unavailable");
        }
        stringbuffer.append("\n");
        stringbuffer.append("Speed: ");
        if (SpeedAvailable)
        {
            stringbuffer.append(Math.round(Speed));
        } else
        {
            stringbuffer.append("unavailable");
        }
        stringbuffer.append("\n");
        time = new Time();
        time.set(Timestamp);
        stringbuffer.append((new StringBuilder()).append("Time: ").append(time.format2445()).toString());
        stringbuffer.append("\n");
        stringbuffer.append("STATUS:\n");
        LocationDataStatus;
        JVM INSTR tableswitch 0 4: default 336
    //                   0 411
    //                   1 421
    //                   2 431
    //                   3 441
    //                   4 451;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return stringbuffer.toString();
_L2:
        stringbuffer.append("Success\n");
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuffer.append("Permission denied\n");
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuffer.append("Not Available");
        continue; /* Loop/switch isn't completed */
_L5:
        stringbuffer.append("Timeout\n");
        continue; /* Loop/switch isn't completed */
_L6:
        stringbuffer.append("Not Supported\n");
        if (true) goto _L1; else goto _L7
_L7:
    }

    ()
    {
        this$0 = DeviceInfo.this;
        super();
    }
}
