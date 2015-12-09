// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.rsa.mobilesdk.sdk;

import android.location.Location;
import android.net.wifi.WifiInfo;
import android.text.format.Time;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.rsa.mobilesdk.sdk:
//            Utils

public class DeviceInfo
{
    class GeoLocationInfo
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
        //                       0 411
        //                       1 421
        //                       2 431
        //                       3 441
        //                       4 451;
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

        GeoLocationInfo()
        {
            this$0 = DeviceInfo.this;
            super();
        }
    }

    public class WiFiNetworksData
    {

        public String BBSID;
        public String Channel;
        public String SSID;
        public int SignalStrength;
        public String StationName;
        final DeviceInfo this$0;

        public void reset()
        {
            StationName = null;
            BBSID = null;
            SignalStrength = 0;
            Channel = null;
            SSID = null;
        }

        public void set(WifiInfo wifiinfo)
        {
            StationName = null;
            BBSID = wifiinfo.getBSSID();
            SignalStrength = wifiinfo.getRssi();
            Channel = null;
            SSID = wifiinfo.getSSID();
        }

        public void setNoPermission()
        {
            StationName = "-1";
            BBSID = "-1";
            SignalStrength = -1;
            Channel = "-1";
            SSID = "-1";
        }

        public String toString()
        {
            StringBuffer stringbuffer = new StringBuffer();
            stringbuffer.append("Station Name: ");
            if (StationName != null)
            {
                stringbuffer.append(StationName);
            } else
            {
                stringbuffer.append("unavailable");
            }
            stringbuffer.append("\n");
            stringbuffer.append("BBSID: ");
            if (BBSID != null)
            {
                stringbuffer.append(BBSID);
            } else
            {
                stringbuffer.append("unavailable");
            }
            stringbuffer.append("\n");
            stringbuffer.append("Signal Strength: ");
            stringbuffer.append(SignalStrength);
            stringbuffer.append("\n");
            stringbuffer.append("Channel: ");
            if (Channel != null)
            {
                stringbuffer.append(Channel);
            } else
            {
                stringbuffer.append("unavailable");
            }
            stringbuffer.append("\n");
            stringbuffer.append("SSID: ");
            if (SSID != null)
            {
                stringbuffer.append(SSID);
            } else
            {
                stringbuffer.append("unavailable");
            }
            stringbuffer.append("\n");
            return stringbuffer.toString();
        }

        public WiFiNetworksData()
        {
            this$0 = DeviceInfo.this;
            super();
            StationName = null;
            BBSID = null;
            SignalStrength = 0;
            Channel = null;
            SSID = null;
        }
    }


    public static final int LOCATION_STATUS_DENY = 1;
    public static final int LOCATION_STATUS_NOT_AVAILABLE = 2;
    public static final int LOCATION_STATUS_NOT_SUPPORTED = 4;
    public static final int LOCATION_STATUS_SUCCESS = 0;
    public static final int LOCATION_STATUS_TIMEOUT = 3;
    String CellTowerId;
    String DeviceModel;
    boolean DeviceMultitaskingSupported;
    String DeviceName;
    String DeviceSystemName;
    String DeviceSystemVersion;
    GeoLocationInfo GeoLocation;
    String HardwareID;
    String Language;
    String LocationAreaCode;
    String MCC;
    String MNC;
    int NumberOfAddressBookEntries;
    String OS_ID;
    String PhoneNumber;
    String RSA_ApplicationKey;
    String SIM_ID;
    String ScreenSize;
    String Vendor_ClientID;
    String WiFiMACAddress;
    private int mConfiguration;
    WiFiNetworksData wfNetworksData;

    public DeviceInfo(int i)
    {
        HardwareID = null;
        SIM_ID = null;
        PhoneNumber = null;
        GeoLocation = null;
        DeviceModel = null;
        DeviceMultitaskingSupported = false;
        DeviceName = null;
        DeviceSystemName = null;
        DeviceSystemVersion = null;
        Language = null;
        WiFiMACAddress = null;
        wfNetworksData = null;
        CellTowerId = null;
        LocationAreaCode = null;
        ScreenSize = null;
        NumberOfAddressBookEntries = -1;
        RSA_ApplicationKey = null;
        Vendor_ClientID = null;
        MCC = null;
        MNC = null;
        OS_ID = null;
        if (i == 2)
        {
            GeoLocation = new GeoLocationInfo();
            wfNetworksData = new WiFiNetworksData();
        }
        mConfiguration = i;
    }

    public void resetData()
    {
        if (GeoLocation != null)
        {
            GeoLocation.invalidate();
        }
        if (wfNetworksData != null)
        {
            wfNetworksData.reset();
        }
    }

    public String toJSONString(boolean flag)
    {
        Object obj;
        JSONObject jsonobject;
        JSONArray jsonarray;
        int i;
        long l;
        try
        {
            obj = new JSONObject();
        }
        catch (JSONException jsonexception)
        {
            return (new StringBuilder()).append("JSONStringFailure:").append(jsonexception.toString()).toString();
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        ((JSONObject) (obj)).put("TIMESTAMP", (new Date()).toString());
        if (HardwareID != null)
        {
            ((JSONObject) (obj)).put("HardwareID", HardwareID);
        }
        if (SIM_ID != null)
        {
            ((JSONObject) (obj)).put("SIM_ID", SIM_ID);
        }
        if (PhoneNumber != null)
        {
            ((JSONObject) (obj)).put("PhoneNumber", PhoneNumber);
        }
        if (GeoLocation != null)
        {
            jsonobject = new JSONObject();
            if (GeoLocation.LongitudeAvailable)
            {
                jsonobject.put("Longitude", Utils.getDoubleString(GeoLocation.Longitude));
            }
            if (GeoLocation.LatitudeAvailable)
            {
                jsonobject.put("Latitude", Utils.getDoubleString(GeoLocation.Latitude));
            }
            if (GeoLocation.HorizontalAccuracyAvailable)
            {
                i = (int)Math.round(GeoLocation.HorizontalAccuracy);
                jsonobject.put("HorizontalAccuracy", (new StringBuilder()).append("").append(i).toString());
            }
            if (GeoLocation.AltitudeAvailable)
            {
                i = (int)Math.round(GeoLocation.Altitude);
                jsonobject.put("Altitude", (new StringBuilder()).append("").append(i).toString());
            }
            if (GeoLocation.AltitudeAccuracyAvailable)
            {
                i = (int)Math.round(GeoLocation.AltitudeAccuracy);
                jsonobject.put("AltitudeAccuracy", (new StringBuilder()).append("").append(i).toString());
            }
            l = GeoLocation.Timestamp;
            jsonobject.put("Timestamp", (new StringBuilder()).append("").append(l).toString());
            if (GeoLocation.HeadingAvailable)
            {
                jsonobject.put("Heading", Utils.getDoubleString(GeoLocation.Heading));
            }
            if (GeoLocation.SpeedAvailable)
            {
                i = (int)Math.round(GeoLocation.Speed);
                jsonobject.put("Speed", (new StringBuilder()).append("").append(i).toString());
            }
            jsonobject.put("Status", (new StringBuilder()).append("").append(GeoLocation.LocationDataStatus).toString());
            jsonarray = new JSONArray();
            jsonarray.put(jsonobject);
            ((JSONObject) (obj)).put("GeoLocationInfo", jsonarray);
        }
        if (DeviceModel != null)
        {
            ((JSONObject) (obj)).put("DeviceModel", DeviceModel);
        }
        if (mConfiguration == 1 || mConfiguration == 2)
        {
            ((JSONObject) (obj)).put("MultitaskingSupported", Boolean.toString(DeviceMultitaskingSupported));
        }
        if (DeviceName != null)
        {
            ((JSONObject) (obj)).put("DeviceName", DeviceName);
        }
        if (DeviceSystemName != null)
        {
            ((JSONObject) (obj)).put("DeviceSystemName", DeviceSystemName);
        }
        if (DeviceSystemVersion != null)
        {
            ((JSONObject) (obj)).put("DeviceSystemVersion", DeviceSystemVersion);
        }
        if (Language != null)
        {
            ((JSONObject) (obj)).put("Languages", Language);
        }
        if (WiFiMACAddress != null)
        {
            ((JSONObject) (obj)).put("WiFiMacAddress", WiFiMACAddress);
        }
        if (wfNetworksData != null)
        {
            jsonobject = new JSONObject();
            if (wfNetworksData.StationName != null)
            {
                jsonobject.put("StationName", wfNetworksData.StationName);
            }
            if (wfNetworksData.BBSID != null)
            {
                jsonobject.put("BBSID", wfNetworksData.BBSID);
            }
            jsonobject.put("SignalStrength", (new StringBuilder()).append("").append(wfNetworksData.SignalStrength).toString());
            jsonobject.put("Channel", (new StringBuilder()).append("").append(wfNetworksData.Channel).toString());
            if (wfNetworksData.SSID != null)
            {
                jsonobject.put("SSID", wfNetworksData.SSID);
            }
            if (jsonobject.length() > 0)
            {
                ((JSONObject) (obj)).put("WiFiNetworksData", jsonobject);
            }
        }
        if (CellTowerId != null)
        {
            ((JSONObject) (obj)).put("CellTowerId", CellTowerId);
        }
        if (LocationAreaCode != null)
        {
            ((JSONObject) (obj)).put("LocationAreaCode", LocationAreaCode);
        }
        if (ScreenSize != null)
        {
            ((JSONObject) (obj)).put("ScreenSize", ScreenSize);
        }
        if (mConfiguration == 2)
        {
            ((JSONObject) (obj)).put("NumberOfAddressBookEntries", (new StringBuilder()).append("").append(NumberOfAddressBookEntries).toString());
        }
        if (RSA_ApplicationKey != null)
        {
            ((JSONObject) (obj)).put("RSA_ApplicationKey", RSA_ApplicationKey);
        }
        if (MCC != null)
        {
            ((JSONObject) (obj)).put("MCC", MCC);
        }
        if (MNC != null)
        {
            ((JSONObject) (obj)).put("MNC", MNC);
        }
        if (OS_ID != null)
        {
            ((JSONObject) (obj)).put("OS_ID", OS_ID);
        }
        ((JSONObject) (obj)).put("SDK_VERSION", "1.00.00");
        obj = ((JSONObject) (obj)).toString(0);
        return ((String) (obj));
    }
}
