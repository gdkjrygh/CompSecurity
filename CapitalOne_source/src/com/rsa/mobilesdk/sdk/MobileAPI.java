// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.rsa.mobilesdk.sdk;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.util.Locale;
import java.util.Properties;

// Referenced classes of package com.rsa.mobilesdk.sdk:
//            DeviceInfo, LocationRetriever, Utils

public class MobileAPI
{

    public static final String ADD_TIMESTAMP_KEY = "Add-timestamp-key";
    public static final int BEST_LOCATION_AGE_MINUTES_DEFAULT_VALUE = 3;
    public static final String BEST_LOCATION_AGE_MINUTES_KEY = "Best-location-age-key";
    public static final int CELL_TOWER_ID = 13;
    public static final int COLLECT_ALL_DEVICE_DATA_AND_LOCATION = 2;
    public static final int COLLECT_BASIC_DEVICE_DATA_ONLY = 0;
    public static final int COLLECT_DEVICE_DATA_ONLY = 1;
    public static final int CONFIGURATION_DEFAULT_VALUE = 0;
    public static final String CONFIGURATION_KEY = "Configuration-key";
    public static final int DEVICE_MODEL = 5;
    public static final int DEVICE_MULTITASKING_SUPPORTED = 6;
    public static final int DEVICE_NAME = 7;
    public static final int DEVICE_SYSTEM_NAME = 8;
    public static final int DEVICE_SYSTEM_VERSION = 9;
    public static final int HARDWARE_ID = 1;
    public static final int LANGUAGE = 10;
    public static final int LOCATION_AREA_CODE = 14;
    public static final int MAX_ACCURACY_DEFAULT_VALUE = 100;
    public static final String MAX_ACCURACY_KEY = "Max-accuracy-key";
    private static final int MAX_API_ID = 20;
    public static final int MAX_LOCATION_AGE_DAYS_DEFAULT_VALUE = 2;
    public static final String MAX_LOCATION_AGE_DAYS_KEY = "Max-location-age-key";
    public static final int MCC = 18;
    public static final int MNC = 19;
    public static final int NOT_IMPLEMENTED = 2;
    public static final int NUMBER_OF_BOOK_ENTRIES = 16;
    public static final int OS_ID = 20;
    public static final int PERMISSION_DENIED = 1;
    public static final int PHONE_NUMBER = 3;
    public static final int QUERY_GEO_LOCATION_DATA = 4;
    private static final String RESULT_NO_PERMISSIONS = "-1";
    private static final int RESULT_NO_PERMISSIONS_INT = -1;
    public static final int RSA_APPLICATION_KEY = 17;
    public static final int SCREEN_SIZE = 15;
    public static final int SDK_VERSION = 0;
    public static final int SILENT_PERIOD_DEFAULT_VALUE = 3;
    public static final String SILENT_PERIOD_MINUTES_KEY = "Silent-period-key";
    public static final int SIM_ID = 2;
    public static final int SUCCESS = 0;
    private static final String TAG = "MobileAPI";
    public static final int TIMEOUT_DEFAULT_VALUE = 2;
    public static final String TIMEOUT_MINUTES_KEY = "Timeout-key";
    public static final int UNKNOWN_ERROR = -1;
    public static final int WI_FI_MAC_ADDRESS = 11;
    public static final int WI_FI_NETWORKS_DATA = 12;
    private static MobileAPI sInstance = null;
    private int mAPI_state[];
    private boolean mAddTimestamp;
    private int mConfiguration;
    private final Context mContext;
    private DeviceInfo mDeviceInfo;
    private int mLocationBestAgeMinutes;
    private int mLocationMaxAccuracy;
    private int mLocationMaxAgeDays;
    private LocationRetriever mLocationRetriever;
    private int mLocationSilentPeriod;
    private int mLocationTimeout;
    private int mScreenHeight;
    private int mScreenWidth;
    private final TelephonyManager mTelephonyManager;

    private MobileAPI(Activity activity)
    {
        mDeviceInfo = null;
        mLocationRetriever = null;
        mConfiguration = 0;
        mAPI_state = new int[21];
        mAddTimestamp = true;
        mContext = activity.getApplicationContext();
        activity = activity.getWindowManager().getDefaultDisplay();
        if (activity != null)
        {
            mScreenWidth = activity.getWidth();
            mScreenHeight = activity.getHeight();
        } else
        {
            mScreenWidth = 0;
            mScreenHeight = 0;
        }
        mTelephonyManager = (TelephonyManager)mContext.getSystemService("phone");
    }

    private void collectBasicDeviceData()
    {
        mDeviceInfo.HardwareID = getDeviceId();
        mDeviceInfo.SIM_ID = getSubscriberId();
        mDeviceInfo.PhoneNumber = getPhoneNumber();
    }

    private void collectDeviceData()
    {
        mDeviceInfo.DeviceModel = getDeviceModel();
        mDeviceInfo.DeviceMultitaskingSupported = isMultitaskingSupported();
        mDeviceInfo.DeviceName = getDeviceName();
        mDeviceInfo.DeviceSystemName = getDeviceSystemName();
        mDeviceInfo.DeviceSystemVersion = getDeviceSystemVersion();
        mDeviceInfo.ScreenSize = getScreenSize();
        mDeviceInfo.Language = getLanguage();
        mDeviceInfo.WiFiMACAddress = getWiFiMacAddress();
        mDeviceInfo.OS_ID = getOsId();
    }

    private void collectDeviceLocationAndNetworkData(Properties properties)
    {
        if (mLocationRetriever == null)
        {
            mLocationRetriever = new LocationRetriever();
        }
        mLocationRetriever.queryLocation(mContext, mLocationTimeout, mLocationSilentPeriod, mLocationBestAgeMinutes, mLocationMaxAgeDays, mLocationMaxAccuracy, mDeviceInfo.GeoLocation, new LocationRetriever.OnLocationDataChangedListener() {

            final MobileAPI this$0;

            public void onLocationDataChanged()
            {
                mAPI_state[4] = mDeviceInfo.GeoLocation.LocationDataStatus;
            }

            
            {
                this$0 = MobileAPI.this;
                super();
            }
        });
        getWiFiNetworksData(mDeviceInfo.wfNetworksData);
        mDeviceInfo.RSA_ApplicationKey = getRsaApplicationKey();
        mDeviceInfo.MCC = getMCC();
        mDeviceInfo.MNC = getMNC();
        mDeviceInfo.CellTowerId = getCellTowerId();
        mDeviceInfo.LocationAreaCode = getLocationAreaCode();
        mDeviceInfo.NumberOfAddressBookEntries = getNumberOfBookEntries();
    }

    private void destroySDK()
    {
        if (mDeviceInfo != null)
        {
            mDeviceInfo.resetData();
            mDeviceInfo = null;
        }
    }

    public static MobileAPI getInstance(Activity activity)
    {
        com/rsa/mobilesdk/sdk/MobileAPI;
        JVM INSTR monitorenter ;
        if (sInstance == null)
        {
            sInstance = new MobileAPI(activity);
        }
        activity = sInstance;
        com/rsa/mobilesdk/sdk/MobileAPI;
        JVM INSTR monitorexit ;
        return activity;
        activity;
        throw activity;
    }

    private void initAndValidateProperties(Properties properties)
    {
        mConfiguration = Utils.getIntProperty(properties, "Configuration-key", 0);
        if (mConfiguration < 0 || mConfiguration > 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid configuration key: ").append(mConfiguration).toString());
        }
        mAddTimestamp = Utils.getBooleanProperty(properties, "Add-timestamp-key", false);
        if (mConfiguration == 2)
        {
            mLocationTimeout = Utils.getIntProperty(properties, "Timeout-key", 2);
            if (mLocationTimeout < 1 || mLocationTimeout > 4)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("invalid TIMEOUT_MINUTES_KEY: ").append(mLocationTimeout).toString());
            }
            mLocationSilentPeriod = Utils.getIntProperty(properties, "Silent-period-key", 3);
            if (mLocationSilentPeriod < 1 || mLocationSilentPeriod > 60)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("invalid SILENT_PERIOD_MINUTES_KEY: ").append(mLocationSilentPeriod).toString());
            }
            mLocationBestAgeMinutes = Utils.getIntProperty(properties, "Best-location-age-key", 3);
            if (mLocationBestAgeMinutes < 2 || mLocationBestAgeMinutes > 4)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("invalid BEST_LOCATION_AGE_MINUTES_KEY: ").append(mLocationBestAgeMinutes).toString());
            }
            mLocationMaxAgeDays = Utils.getIntProperty(properties, "Max-location-age-key", 2);
            if (mLocationMaxAgeDays < 1 || mLocationMaxAgeDays > 3)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("invalid MAX_LOCATION_AGE_DAYS_KEY: ").append(mLocationMaxAgeDays).toString());
            }
            mLocationMaxAccuracy = Utils.getIntProperty(properties, "Max-accuracy-key", 100);
            if (mLocationMaxAccuracy < 50 || mLocationMaxAccuracy > 200)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("invalid MAX_ACCURACY_KEY: ").append(mLocationMaxAccuracy).toString());
            }
        }
    }

    private void stopLocations()
    {
        if (mLocationRetriever != null)
        {
            mLocationRetriever.release();
            mLocationRetriever = null;
        }
    }

    public String collectInfo()
    {
        this;
        JVM INSTR monitorenter ;
        if (mDeviceInfo == null)
        {
            throw new IllegalStateException("Mobile SDK was not initialized");
        }
        break MISSING_BLOCK_LABEL_25;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        String s = mDeviceInfo.toJSONString(mAddTimestamp);
        this;
        JVM INSTR monitorexit ;
        return s;
    }

    public void destroy()
    {
        this;
        JVM INSTR monitorenter ;
        destroySDK();
        stopLocations();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    String getCellTowerId()
    {
        mAPI_state[13] = -1;
        String s;
        android.telephony.CellLocation celllocation;
        try
        {
            celllocation = mTelephonyManager.getCellLocation();
        }
        catch (SecurityException securityexception)
        {
            mAPI_state[13] = 1;
            Log.e("MobileAPI", securityexception.toString());
            return "-1";
        }
        s = null;
        if (!(celllocation instanceof GsmCellLocation)) goto _L2; else goto _L1
_L1:
        s = Integer.toString(((GsmCellLocation)celllocation).getCid());
_L4:
        mAPI_state[13] = 0;
        return s;
_L2:
        if (!(celllocation instanceof CdmaCellLocation)) goto _L4; else goto _L3
_L3:
        s = Integer.toString(((CdmaCellLocation)celllocation).getBaseStationId());
          goto _L4
    }

    String getDeviceId()
    {
        mAPI_state[1] = -1;
        String s;
        try
        {
            s = mTelephonyManager.getDeviceId();
            mAPI_state[1] = 0;
        }
        catch (SecurityException securityexception)
        {
            mAPI_state[1] = 1;
            Log.e("MobileAPI", securityexception.toString());
            return "-1";
        }
        return s;
    }

    String getDeviceModel()
    {
        mAPI_state[5] = 0;
        return Build.MODEL;
    }

    String getDeviceName()
    {
        mAPI_state[7] = 0;
        Object obj = BluetoothAdapter.getDefaultAdapter();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        boolean flag;
        obj = ((BluetoothAdapter) (obj)).getName();
        flag = TextUtils.isEmpty(((CharSequence) (obj)));
        if (!flag)
        {
            return ((String) (obj));
        }
        break MISSING_BLOCK_LABEL_33;
        SecurityException securityexception;
        securityexception;
        String s = Build.DEVICE;
        if (!s.equals(getDeviceModel()))
        {
            return s;
        } else
        {
            return null;
        }
    }

    String getDeviceSystemName()
    {
        mAPI_state[8] = 0;
        return "Android";
    }

    String getDeviceSystemVersion()
    {
        mAPI_state[9] = 0;
        return (new StringBuilder()).append("").append(android.os.Build.VERSION.SDK_INT).toString();
    }

    int getError(int i)
    {
        if (i >= 0 && i < mAPI_state.length)
        {
            return mAPI_state[i];
        } else
        {
            return -1;
        }
    }

    String getLanguage()
    {
        mAPI_state[10] = -1;
        String s1 = Locale.getDefault().getLanguage().toLowerCase();
        if (!s1.equals("iw")) goto _L2; else goto _L1
_L1:
        String s = "he";
_L3:
        try
        {
            mAPI_state[10] = 0;
        }
        catch (SecurityException securityexception)
        {
            mAPI_state[10] = 1;
            Log.e("MobileAPI", securityexception.toString());
            return "-1";
        }
        return s;
_L2:
        if (!s1.equals("in"))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        s = "id";
          goto _L3
        s = s1;
        if (!s1.equals("ji")) goto _L3; else goto _L4
_L4:
        s = "yi";
          goto _L3
    }

    String getLocationAreaCode()
    {
label0:
        {
            mAPI_state[14] = -1;
            Object obj;
            try
            {
                obj = mTelephonyManager.getCellLocation();
                if (!(obj instanceof GsmCellLocation))
                {
                    break label0;
                }
                mAPI_state[14] = 0;
                obj = Integer.toString(((GsmCellLocation)obj).getLac());
            }
            catch (SecurityException securityexception)
            {
                mAPI_state[14] = 1;
                Log.e("MobileAPI", securityexception.toString());
                return "-1";
            }
            return ((String) (obj));
        }
        return null;
    }

    String getMCC()
    {
        mAPI_state[18] = -1;
        String s;
        int i;
        try
        {
            s = mTelephonyManager.getNetworkOperator();
            mAPI_state[18] = 0;
        }
        catch (SecurityException securityexception)
        {
            mAPI_state[18] = 1;
            Log.e("MobileAPI", securityexception.toString());
            return "-1";
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        if (s.length() >= 3)
        {
            return s.substring(0, 3);
        }
        i = mContext.getResources().getConfiguration().mcc;
        if (i == 0)
        {
            return null;
        }
        s = Integer.toString(i);
        return s;
    }

    String getMNC()
    {
        mAPI_state[19] = -1;
        String s;
        int i;
        try
        {
            s = mTelephonyManager.getNetworkOperator();
            mAPI_state[19] = 0;
        }
        catch (SecurityException securityexception)
        {
            mAPI_state[19] = 1;
            Log.e("MobileAPI", securityexception.toString());
            return "-1";
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        if (s.length() >= 3)
        {
            return s.substring(3);
        }
        i = mContext.getResources().getConfiguration().mnc;
        if (i == 0)
        {
            return null;
        }
        s = Integer.toString(i);
        return s;
    }

    int getNumberOfBookEntries()
    {
        mAPI_state[16] = -1;
        int i;
        try
        {
            i = mContext.getContentResolver().query(android.provider.ContactsContract.Contacts.CONTENT_URI, null, null, null, null).getCount();
            mAPI_state[16] = 0;
        }
        catch (SecurityException securityexception)
        {
            mAPI_state[16] = 1;
            Log.e("MobileAPI", securityexception.toString());
            return -1;
        }
        return i;
    }

    String getOsId()
    {
        mAPI_state[20] = 0;
        return android.provider.Settings.Secure.getString(mContext.getContentResolver(), "android_id");
    }

    String getPhoneNumber()
    {
        mAPI_state[3] = -1;
        String s;
        try
        {
            s = mTelephonyManager.getLine1Number();
            mAPI_state[3] = 0;
        }
        catch (SecurityException securityexception)
        {
            mAPI_state[3] = 1;
            Log.e("MobileAPI", securityexception.toString());
            return "-1";
        }
        return s;
    }

    String getRsaApplicationKey()
    {
        return null;
    }

    String getScreenSize()
    {
        mAPI_state[15] = 0;
        return (new StringBuilder()).append(Integer.toString(mScreenWidth)).append("x").append(Integer.toString(mScreenHeight)).toString();
    }

    String getSubscriberId()
    {
        mAPI_state[2] = -1;
        String s;
        try
        {
            s = mTelephonyManager.getSubscriberId();
            mAPI_state[2] = 0;
        }
        catch (SecurityException securityexception)
        {
            mAPI_state[2] = 1;
            Log.e("MobileAPI", securityexception.toString());
            return "-1";
        }
        return s;
    }

    String getWiFiMacAddress()
    {
        mAPI_state[11] = -1;
        String s;
        try
        {
            s = ((WifiManager)mContext.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            mAPI_state[11] = 0;
        }
        catch (SecurityException securityexception)
        {
            mAPI_state[11] = 1;
            Log.e("MobileAPI", securityexception.toString());
            return "-1";
        }
        return s;
    }

    String getWiFiNetworksData(DeviceInfo.WiFiNetworksData wifinetworksdata)
    {
        mAPI_state[12] = -1;
        String s;
        try
        {
            wifinetworksdata.set(((WifiManager)mContext.getSystemService("wifi")).getConnectionInfo());
            mAPI_state[12] = 0;
            s = wifinetworksdata.toString();
        }
        catch (SecurityException securityexception)
        {
            mAPI_state[12] = 1;
            wifinetworksdata.setNoPermission();
            Log.e("MobileAPI", securityexception.toString());
            return null;
        }
        return s;
    }

    public void initSDK(Properties properties)
    {
        this;
        JVM INSTR monitorenter ;
        if (mDeviceInfo != null)
        {
            throw new IllegalStateException("SDK already initialized");
        }
        break MISSING_BLOCK_LABEL_25;
        properties;
        this;
        JVM INSTR monitorexit ;
        throw properties;
        initAndValidateProperties(properties);
        mDeviceInfo = new DeviceInfo(mConfiguration);
        int i = 0;
_L2:
        if (i >= mAPI_state.length)
        {
            break; /* Loop/switch isn't completed */
        }
        mAPI_state[i] = 2;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        i = mConfiguration;
        i;
        JVM INSTR tableswitch 0 2: default 104
    //                   0 107
    //                   1 114
    //                   2 125;
           goto _L3 _L4 _L5 _L6
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        collectBasicDeviceData();
          goto _L3
_L5:
        collectBasicDeviceData();
        collectDeviceData();
          goto _L3
_L6:
        collectBasicDeviceData();
        collectDeviceData();
        collectDeviceLocationAndNetworkData(properties);
          goto _L3
    }

    boolean isMultitaskingSupported()
    {
        mAPI_state[6] = 0;
        return true;
    }



}
