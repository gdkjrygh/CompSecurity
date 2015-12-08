// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry.hardware;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.microsoft.applications.telemetry.NetworkCost;
import com.microsoft.applications.telemetry.NetworkType;

// Referenced classes of package com.microsoft.applications.telemetry.hardware:
//            AbstractHardwareInformation

public class NetworkInformation extends AbstractHardwareInformation
{

    private static final String LOG_TAG = com/microsoft/applications/telemetry/hardware/NetworkInformation.getSimpleName();
    private static final NetworkInformation instance;

    public NetworkInformation()
    {
    }

    public static void addSubscriber(long l)
    {
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        String.format("addSubscriber|ptr:0x%x", new Object[] {
            Long.valueOf(l)
        });
        instance.addSubscriberInstance(l);
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private static void determineNetwork(Context context)
    {
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
        context = (TelephonyManager)context.getSystemService("phone");
        determineNetworkAvailability(connectivitymanager);
        instance.setObservableProperty("NetworkCost", Integer.valueOf(determineNetworkCost(connectivitymanager).getValue()));
        instance.setObservableProperty("NetworkType", Integer.valueOf(determineNetworkType(connectivitymanager, context).getValue()));
        instance.setObservableProperty("NetworkProvider", determineNetworkProvider(context));
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private static void determineNetworkAvailability(ConnectivityManager connectivitymanager)
    {
        boolean flag1 = true;
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        Object obj;
        NetworkInformation networkinformation;
        obj = connectivitymanager.getNetworkInfo(9);
        networkinformation = instance;
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!((NetworkInfo) (obj)).isAvailable()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L13:
        networkinformation.setObservableProperty("EthernetAvailable", Boolean.valueOf(flag));
        obj = connectivitymanager.getNetworkInfo(1);
        networkinformation = instance;
        if (obj == null) goto _L5; else goto _L4
_L4:
        if (!((NetworkInfo) (obj)).isAvailable()) goto _L5; else goto _L6
_L6:
        flag = true;
_L10:
        networkinformation.setObservableProperty("WifiAvailable", Boolean.valueOf(flag));
        connectivitymanager = connectivitymanager.getNetworkInfo(6);
        obj = instance;
        if (connectivitymanager == null) goto _L8; else goto _L7
_L7:
        if (!connectivitymanager.isAvailable()) goto _L8; else goto _L9
_L9:
        flag = flag1;
_L11:
        ((NetworkInformation) (obj)).setObservableProperty("WwanAvailable", Boolean.valueOf(flag));
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return;
_L2:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L5:
        flag = false;
          goto _L10
_L8:
        flag = false;
          goto _L11
        connectivitymanager;
        throw connectivitymanager;
        if (true) goto _L13; else goto _L12
_L12:
    }

    private static NetworkType determineNetworkClass(TelephonyManager telephonymanager)
    {
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        NetworkType networktype = NetworkType.UNKNOWN;
        telephonymanager.getNetworkType();
        JVM INSTR tableswitch 1 15: default 106
    //                   1 93
    //                   2 93
    //                   3 93
    //                   4 93
    //                   5 93
    //                   6 93
    //                   7 93
    //                   8 93
    //                   9 93
    //                   10 93
    //                   11 93
    //                   12 93
    //                   13 93
    //                   14 93
    //                   15 93;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2
_L1:
        telephonymanager = NetworkType.UNKNOWN;
_L4:
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return telephonymanager;
_L2:
        telephonymanager = NetworkType.WWAN;
        if (true) goto _L4; else goto _L3
_L3:
        telephonymanager;
        throw telephonymanager;
    }

    private static NetworkCost determineNetworkCost(ConnectivityManager connectivitymanager)
    {
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        NetworkCost networkcost;
        NetworkInfo networkinfo;
        networkcost = NetworkCost.UNKNOWN;
        networkinfo = connectivitymanager.getActiveNetworkInfo();
        connectivitymanager = networkcost;
        if (networkinfo == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        connectivitymanager = networkcost;
        if (!networkinfo.isConnected())
        {
            break MISSING_BLOCK_LABEL_40;
        }
        connectivitymanager = networkcost;
        if (networkinfo.isRoaming())
        {
            connectivitymanager = NetworkCost.OVER_DATA_LIMIT;
        }
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return connectivitymanager;
        connectivitymanager;
        throw connectivitymanager;
    }

    private static String determineNetworkProvider(TelephonyManager telephonymanager)
    {
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        String s;
        s = telephonymanager.getNetworkOperatorName();
        telephonymanager.getPhoneType();
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return s;
        telephonymanager;
        throw telephonymanager;
    }

    private static NetworkType determineNetworkType(ConnectivityManager connectivitymanager, TelephonyManager telephonymanager)
    {
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        NetworkInfo networkinfo;
        telephonymanager = NetworkType.UNKNOWN;
        networkinfo = connectivitymanager.getActiveNetworkInfo();
        connectivitymanager = telephonymanager;
        if (networkinfo == null) goto _L2; else goto _L1
_L1:
        networkinfo.getType();
        JVM INSTR tableswitch 0 9: default 112
    //                   0 99
    //                   1 85
    //                   2 76
    //                   3 99
    //                   4 99
    //                   5 99
    //                   6 76
    //                   7 76
    //                   8 76
    //                   9 92;
           goto _L3 _L4 _L5 _L3 _L4 _L4 _L4 _L3 _L3 _L3 _L6
_L3:
        connectivitymanager = NetworkType.UNKNOWN;
_L2:
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return connectivitymanager;
_L5:
        connectivitymanager = NetworkType.WIFI;
        continue; /* Loop/switch isn't completed */
_L6:
        connectivitymanager = NetworkType.WIRED;
        continue; /* Loop/switch isn't completed */
_L4:
        connectivitymanager = NetworkType.WWAN;
        if (true) goto _L2; else goto _L7
_L7:
        connectivitymanager;
        throw connectivitymanager;
    }

    public static int getNetworkCost()
    {
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        int i;
        i = ((Integer)instance.getObservableProperty("NetworkCost")).intValue();
        String.format("getNetworkCost|value:%s", new Object[] {
            Integer.valueOf(i)
        });
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public static String getNetworkProvider()
    {
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        String s;
        s = (String)instance.getObservableProperty("NetworkProvider");
        String.format("getNetworkProvider|value:%s", new Object[] {
            s
        });
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public static int getNetworkType()
    {
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        int i;
        i = ((Integer)instance.getObservableProperty("NetworkType")).intValue();
        String.format("getNetworkType|value:%s", new Object[] {
            Integer.valueOf(i)
        });
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    private static native void initNative();

    public static boolean isEthernetAvailable()
    {
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        boolean flag;
        flag = ((Boolean)instance.getObservableProperty("EthernetAvailable")).booleanValue();
        String.format("isEthernetAvailable|value:%s", new Object[] {
            Boolean.valueOf(flag)
        });
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean isWifiAvailable()
    {
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        boolean flag;
        flag = ((Boolean)instance.getObservableProperty("WifiAvailable")).booleanValue();
        String.format("isWifiAvailable|value:%s", new Object[] {
            Boolean.valueOf(flag)
        });
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean isWwanAvailable()
    {
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        boolean flag;
        flag = ((Boolean)instance.getObservableProperty("WwanAvailable")).booleanValue();
        String.format("isWwanAvailable|value:%s", new Object[] {
            Boolean.valueOf(flag)
        });
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static void removeSubscriber(long l)
    {
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        String.format("removeSubscriber|ptr:0x%x", new Object[] {
            Long.valueOf(l)
        });
        instance.removeSubscriberInstance(l);
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void update(Context context)
    {
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        determineNetwork(context);
        com/microsoft/applications/telemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    static 
    {
        instance = new NetworkInformation();
        initNative();
        instance.setObservableProperty("NetworkType", Integer.valueOf(NetworkType.UNKNOWN.getValue()));
        instance.setObservableProperty("NetworkCost", Integer.valueOf(NetworkCost.UNKNOWN.getValue()));
        instance.setObservableProperty("NetworkProvider", "");
        instance.setObservableProperty("EthernetAvailable", Boolean.valueOf(false));
        instance.setObservableProperty("WifiAvailable", Boolean.valueOf(false));
        instance.setObservableProperty("WwanAvailable", Boolean.valueOf(false));
    }
}
