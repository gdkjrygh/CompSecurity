// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.format.Formatter;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.net.LogMobileType;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

// Referenced classes of package com.netflix.mediaclient.util:
//            AndroidUtils

public final class ConnectivityUtils
{
    public static class NetworkState
    {

        public boolean connected;
        public LogMobileType currentConnectionType;
        public String ipAddr;
        public String sid;
        public boolean wifi;

        public String toString()
        {
            return (new StringBuilder()).append("NetworkState [connected=").append(connected).append(", wifi=").append(wifi).append(", sid=").append(sid).append(", currentConnectionType=").append(currentConnectionType).append(", ipAddr=").append(ipAddr).append("]").toString();
        }

        public NetworkState(boolean flag, boolean flag1, String s)
        {
            connected = flag;
            wifi = flag1;
            sid = s;
        }
    }


    public static final String INTERFACE_TYPE_MOBILE = "MOBILE";
    public static final String INTERFACE_TYPE_WIFI = "WIFI";
    public static final String NETWORK_TYPE_BLUETOOTH = "bluetooth";
    public static final String NETWORK_TYPE_CDMA = "cdma";
    public static final String NETWORK_TYPE_GSM = "gsm";
    public static final String NETWORK_TYPE_MOBILE = "mobile";
    public static final String NETWORK_TYPE_WIFI = "wifi";
    public static final String NETWORK_TYPE_WIMAX = "wimax";
    public static final String NETWORK_TYPE_WIRED = "wired";
    public static final int NRD_NTWK_CDMA = 2;
    public static final int NRD_NTWK_CONN_STATE_CONNECTED = 1;
    public static final int NRD_NTWK_CONN_STATE_DISCONNECTED = 2;
    public static final int NRD_NTWK_CONN_STATE_UNKNOWN = 0;
    public static final int NRD_NTWK_GSM = 1;
    public static final int NRD_NTWK_MOBILE = 0;
    public static final int NRD_NTWK_SUBTYPE_1000MBPS_ETH = 10;
    public static final int NRD_NTWK_SUBTYPE_100MBPS_ETH = 9;
    public static final int NRD_NTWK_SUBTYPE_10MBPS_ETH = 8;
    public static final int NRD_NTWK_SUBTYPE_2G = 1;
    public static final int NRD_NTWK_SUBTYPE_3G = 2;
    public static final int NRD_NTWK_SUBTYPE_4G = 3;
    public static final int NRD_NTWK_SUBTYPE_802_11A = 4;
    public static final int NRD_NTWK_SUBTYPE_802_11B = 5;
    public static final int NRD_NTWK_SUBTYPE_802_11G = 6;
    public static final int NRD_NTWK_SUBTYPE_802_11N = 7;
    public static final int NRD_NTWK_SUBTYPE_UNKNOWN = 0;
    public static final int NRD_NTWK_WIFI = 4;
    public static final int NRD_NTWK_WIMAX = 3;
    public static final int NRD_NTWK_WIRED = 5;
    private static final String TAG = "nf_net";

    private ConnectivityUtils()
    {
    }

    public static boolean carrierInfoNeeded(int i)
    {
        while (4 == i || 3 == i || 5 == i) 
        {
            return false;
        }
        return true;
    }

    public static boolean carrierInfoNeeded(String s)
    {
        while ("wifi".equals(s) || "wimax".equals(s) || "wired".equals(s) || "bluetooth".equals(s)) 
        {
            return false;
        }
        return true;
    }

    public static NetworkInfo getActiveNetworkInfo(Context context)
    {
        if (context != null)
        {
            if ((context = (ConnectivityManager)context.getSystemService("connectivity")) != null)
            {
                return context.getActiveNetworkInfo();
            }
        }
        return null;
    }

    public static long getApplicationRx()
    {
        long l1 = TrafficStats.getUidRxBytes(Process.myUid());
        long l = l1;
        if (l1 == -1L)
        {
            Log.w("nf_net", "Application receiving statistic is not supported by this device");
            l = 0L;
        }
        return l;
    }

    public static long getApplicationTx()
    {
        long l1 = TrafficStats.getUidTxBytes(Process.myUid());
        long l = l1;
        if (l1 == -1L)
        {
            Log.w("nf_net", "Transmit statistic is not supported by this device!");
            l = 0L;
        }
        return l;
    }

    public static LogMobileType getConnectionType(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("Activity cannot be null!");
        }
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context == null)
        {
            return LogMobileType.UKNOWN;
        } else
        {
            return LogMobileType.toLogMobileType(context);
        }
    }

    public static String getLocalIP4Address(Context context)
    {
        if (context == null)
        {
            return null;
        }
        ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
        NetworkInfo networkinfo = null;
        if (connectivitymanager != null)
        {
            networkinfo = connectivitymanager.getActiveNetworkInfo();
        }
        if (networkinfo != null && networkinfo.getTypeName() != null && "WIFI".equals(networkinfo.getTypeName().toUpperCase()))
        {
            Log.d("nf_net", "Local active network interface is WiFi");
            return getLocalWifiIP4Address(context);
        } else
        {
            Log.d("nf_net", "Local active network interface is Mobile (it also covers everything else).");
            return getLocalMobileIP4Address(context);
        }
    }

    public static String getLocalMobileIP4Address(Context context)
    {
        Enumeration enumeration;
        context = getLocalWifiIP4Address(context);
        if (Log.isLoggable("nf_net", 3))
        {
            Log.d("nf_net", (new StringBuilder()).append("Exclude wifi if exist: ").append(context).toString());
        }
        enumeration = NetworkInterface.getNetworkInterfaces();
        if (enumeration == null)
        {
            return null;
        }
_L2:
        Object obj;
label0:
        {
            try
            {
                if (enumeration.hasMoreElements())
                {
                    obj = (NetworkInterface)enumeration.nextElement();
                    if (((NetworkInterface) (obj)).isLoopback())
                    {
                        Log.d("nf_net", "NI is loopback, skip");
                        continue; /* Loop/switch isn't completed */
                    }
                    break label0;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("nf_net", "Failed to get IP address", context);
            }
            return null;
        }
        if (((NetworkInterface) (obj)).isVirtual())
        {
            Log.d("nf_net", "NI is virtual, skip");
            continue; /* Loop/switch isn't completed */
        }
        if (!((NetworkInterface) (obj)).isUp())
        {
            Log.d("nf_net", "NI is not up, skip");
            continue; /* Loop/switch isn't completed */
        }
        obj = ((NetworkInterface) (obj)).getInetAddresses();
        InetAddress inetaddress;
        do
        {
            if (!((Enumeration) (obj)).hasMoreElements())
            {
                continue; /* Loop/switch isn't completed */
            }
            inetaddress = (InetAddress)((Enumeration) (obj)).nextElement();
            Log.d("nf_net", (new StringBuilder()).append("").append(inetaddress).toString());
        } while (inetaddress.isLoopbackAddress() || !(inetaddress instanceof Inet4Address));
        if (Log.isLoggable("nf_net", 3))
        {
            Log.d("nf_net", (new StringBuilder()).append("Found: ").append(inetaddress).append(". Check if it is WiFi address.").toString());
        }
        obj = inetaddress.getHostAddress();
        if (context == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!context.equals(obj))
        {
            break; /* Loop/switch isn't completed */
        }
        Log.d("nf_net", "WiFi interface found in all network interaces, skip!");
        if (true) goto _L2; else goto _L1
_L1:
        return ((String) (obj));
    }

    public static String getLocalWifiIP4Address(Context context)
    {
        context = (WifiManager)context.getSystemService("wifi");
        if (context == null || context.getConnectionInfo() == null)
        {
            return null;
        } else
        {
            return Formatter.formatIpAddress(context.getConnectionInfo().getIpAddress());
        }
    }

    public static NetworkInfo[] getNetworkInterfaces(Context context)
    {
        NetworkInfo anetworkinfo[] = null;
        if (context != null) goto _L2; else goto _L1
_L1:
        context = anetworkinfo;
_L4:
        return context;
_L2:
        ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
        context = anetworkinfo;
        if (connectivitymanager == null)
        {
            continue;
        }
        NetworkInfo anetworkinfo1[] = connectivitymanager.getAllNetworkInfo();
        context = anetworkinfo;
        if (anetworkinfo1 == null)
        {
            continue;
        }
        int k = 0;
        for (int i = 0; i < anetworkinfo1.length;)
        {
            int l = k;
            if (anetworkinfo1[i].getTypeName() != null)
            {
                l = k;
                if (isNRDPSupportedInterface(anetworkinfo1[i]))
                {
                    l = k + 1;
                }
            }
            i++;
            k = l;
        }

        context = null;
        if (k <= 0)
        {
            continue;
        }
        anetworkinfo = new NetworkInfo[k];
        int j = 0;
        k = 0;
        do
        {
            context = anetworkinfo;
            if (j >= anetworkinfo1.length)
            {
                continue;
            }
            int i1 = k;
            if (anetworkinfo1[j].getTypeName() != null)
            {
                i1 = k;
                if (isNRDPSupportedInterface(anetworkinfo1[j]))
                {
                    anetworkinfo[k] = anetworkinfo1[j];
                    i1 = k + 1;
                }
            }
            j++;
            k = i1;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String getNetworkSpec(LogMobileType logmobiletype)
    {
        if (logmobiletype == null)
        {
            return "";
        }
        if (LogMobileType._2G.equals(logmobiletype))
        {
            return "2g";
        }
        if (LogMobileType._3G.equals(logmobiletype))
        {
            return "3g";
        }
        if (LogMobileType._4G.equals(logmobiletype))
        {
            return "4g";
        }
        if (LogMobileType.WIFI.equals(logmobiletype))
        {
            return "g";
        } else
        {
            return "";
        }
    }

    public static NetworkState getNetworkState(Context context)
    {
        if (context == null)
        {
            return new NetworkState(false, false, null);
        }
        Object obj = (ConnectivityManager)context.getSystemService("connectivity");
        if (obj == null)
        {
            return new NetworkState(false, false, null);
        }
        obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
        if (obj == null || !((NetworkInfo) (obj)).isConnectedOrConnecting())
        {
            return new NetworkState(false, false, null);
        }
        if (((NetworkInfo) (obj)).getTypeName() != null && "WIFI".equals(((NetworkInfo) (obj)).getTypeName().toUpperCase()))
        {
            Log.d("nf_net", "Local active network interface is WiFi");
            context = (WifiManager)context.getSystemService("wifi");
            if (context == null)
            {
                Log.w("nf_net", "WiFi manager is not available!");
                return new NetworkState(false, false, null);
            }
            context = context.getConnectionInfo();
            if (context == null)
            {
                return new NetworkState(true, true, null);
            } else
            {
                return new NetworkState(true, true, context.getSSID());
            }
        } else
        {
            Log.d("nf_net", "Local active network interface is Mobile (it also covers everything else).");
            return new NetworkState(true, false, null);
        }
    }

    public static int getNetworkSubTypePerLoggingSpecification(LogMobileType logmobiletype)
    {
        if (logmobiletype != null)
        {
            if (LogMobileType._2G.equals(logmobiletype))
            {
                return 1;
            }
            if (LogMobileType._3G.equals(logmobiletype))
            {
                return 2;
            }
            if (LogMobileType._4G.equals(logmobiletype))
            {
                return 3;
            }
            if (LogMobileType.WIFI.equals(logmobiletype))
            {
                return 6;
            }
        }
        return 0;
    }

    public static String getNetworkType(Context context)
    {
        if (context == null)
        {
            return "";
        }
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null || context.getActiveNetworkInfo() == null)
        {
            return "";
        }
        context = LogMobileType.toLogMobileType(context.getActiveNetworkInfo());
        if (context == null)
        {
            return "";
        }
        if (context.equals(LogMobileType.WIFI))
        {
            return "WIFI";
        } else
        {
            return "MOBILE";
        }
    }

    public static int getNetworkTypePerLoggingSpecifcation(Context context, int i)
    {
        if (context != null) goto _L2; else goto _L1
_L1:
        return 0;
_L2:
        switch (i)
        {
        default:
            context = (TelephonyManager)context.getSystemService("phone");
            if (context != null)
            {
                switch (context.getPhoneType())
                {
                default:
                    return 0;

                case 1: // '\001'
                    return 1;

                case 2: // '\002'
                    return 2;
                }
            }
            break;

        case 9: // '\t'
            return 5;

        case 6: // '\006'
            return 3;

        case 1: // '\001'
            return 4;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static String getNetworkTypePerLoggingSpecification(Context context)
    {
        Object obj;
        if (context == null)
        {
            return "";
        }
        obj = (ConnectivityManager)context.getSystemService("connectivity");
        if (obj == null || ((ConnectivityManager) (obj)).getActiveNetworkInfo() == null)
        {
            return "";
        }
        obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
        if (obj == null)
        {
            return "";
        }
        ((NetworkInfo) (obj)).getType();
        JVM INSTR tableswitch 1 9: default 96
    //                   1 145
    //                   2 96
    //                   3 96
    //                   4 96
    //                   5 96
    //                   6 142
    //                   7 148
    //                   8 96
    //                   9 139;
           goto _L1 _L2 _L1 _L1 _L1 _L1 _L3 _L4 _L1 _L5
_L1:
        context = (TelephonyManager)context.getSystemService("phone");
        if (context == null) goto _L7; else goto _L6
_L6:
        context.getPhoneType();
        JVM INSTR tableswitch 1 2: default 136
    //                   1 154
    //                   2 151;
           goto _L7 _L8 _L9
_L7:
        return "mobile";
_L5:
        return "wired";
_L3:
        return "wimax";
_L2:
        return "wifi";
_L4:
        return "bluetooth";
_L9:
        return "cdma";
_L8:
        return "gsm";
    }

    public static long getRx()
    {
        long l1 = TrafficStats.getUidRxBytes(Process.myUid());
        long l = l1;
        if (l1 == -1L)
        {
            Log.w("nf_net", "Receiving statistic is not supported by this device! Report this!");
            long l2 = TrafficStats.getTotalRxBytes();
            l = l2;
            if (l2 == -1L)
            {
                Log.w("nf_net", "Receiving statistic is not supported at all by this device! Report this!");
                l = 0L;
            }
        }
        return l;
    }

    public static long getTx()
    {
        long l1 = TrafficStats.getUidTxBytes(Process.myUid());
        long l = l1;
        if (l1 == -1L)
        {
            Log.w("nf_net", "Transmit statistic is not supported by this device! Failing back to all data!");
            long l2 = TrafficStats.getTotalTxBytes();
            l = l2;
            if (l2 == -1L)
            {
                Log.w("nf_net", "Transmit statistic is not supported at all by this device! Report this!");
                l = 0L;
            }
        }
        return l;
    }

    public static boolean hasInternet(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("context cannot be null!");
        }
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return context != null && context.isConnectedOrConnecting();
    }

    public static boolean isConnected(Context context)
    {
        if (context != null)
        {
            if ((context = (ConnectivityManager)context.getSystemService("connectivity")) != null && (context = context.getActiveNetworkInfo()) != null)
            {
                return context.isConnected();
            }
        }
        return false;
    }

    public static boolean isConnectedOrConnecting(Context context)
    {
        if (context != null)
        {
            if ((context = (ConnectivityManager)context.getSystemService("connectivity")) != null && (context = context.getActiveNetworkInfo()) != null)
            {
                return context.isConnectedOrConnecting();
            }
        }
        return false;
    }

    public static boolean isNRDPSupportedInterface(NetworkInfo networkinfo)
    {
        switch (networkinfo.getType())
        {
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 8: // '\b'
        default:
            return false;

        case 0: // '\0'
        case 1: // '\001'
        case 6: // '\006'
        case 7: // '\007'
        case 9: // '\t'
            return true;
        }
    }

    public static boolean isNetworkTypeCellular(Context context)
    {
        context = getNetworkTypePerLoggingSpecification(context);
        return context.equals("mobile") || context.equals("cdma") || context.equals("gsm");
    }

    public static boolean isWiFiConnected(Context context)
    {
        if (context == null)
        {
            return false;
        } else
        {
            context = getConnectionType(context);
            return LogMobileType.WIFI.equals(context);
        }
    }

    public static NetworkState processConnectivityChange(Context context, Intent intent)
    {
        Log.d("nf_net", "Handle connectivity change, process...");
        AndroidUtils.logIntent("nf_net", intent);
        boolean flag2 = false;
        LogMobileType logmobiletype = null;
        Object obj = (ConnectivityManager)context.getSystemService("connectivity");
        intent = null;
        if (obj != null)
        {
            intent = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
        }
        Object obj1;
        Object obj2;
        boolean flag;
        boolean flag3;
        if (intent != null && intent.isConnectedOrConnecting())
        {
            Log.d("nf_net", "Connect intent");
            logmobiletype = LogMobileType.toLogMobileType(intent);
            Log.d("nf_net", "Network changed, find limit");
            flag2 = true;
        } else
        {
            Log.d("nf_net", "Disconnect intent");
        }
        obj1 = null;
        obj2 = null;
        if (intent != null)
        {
            if (intent.getTypeName() != null && "WIFI".equals(intent.getTypeName().toUpperCase()))
            {
                boolean flag1 = false;
                Object obj3 = (WifiManager)context.getSystemService("wifi");
                intent = obj2;
                flag = flag1;
                obj = obj1;
                if (obj3 != null)
                {
                    obj3 = ((WifiManager) (obj3)).getConnectionInfo();
                    intent = obj2;
                    flag = flag1;
                    obj = obj1;
                    if (obj3 != null)
                    {
                        if (Log.isLoggable("nf_net", 3))
                        {
                            Log.d("nf_net", ((WifiInfo) (obj3)).toString());
                            Log.d("nf_net", (new StringBuilder()).append("").append(((WifiInfo) (obj3)).getSSID()).toString());
                        }
                        obj = ((WifiInfo) (obj3)).getSSID();
                        intent = getLocalWifiIP4Address(context);
                        flag = flag1;
                    }
                }
            } else
            {
                Log.d("nf_net", "Not wifi");
                flag = true;
                intent = getLocalMobileIP4Address(context);
                obj = obj1;
            }
        } else
        {
            Log.e("nf_net", "Intent does not have network info. It should NOT happen!");
            flag = true;
            intent = getLocalWifiIP4Address(context);
            obj = obj1;
        }
        context = ((Context) (obj));
        if (obj == null)
        {
            context = "";
        }
        if (Log.isLoggable("nf_net", 3))
        {
            Log.d("nf_net", (new StringBuilder()).append("LocalIPAddress:").append(intent).toString());
        }
        if (!flag)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        context = new NetworkState(flag2, flag3, context);
        context.currentConnectionType = logmobiletype;
        context.ipAddr = intent;
        return context;
    }
}
