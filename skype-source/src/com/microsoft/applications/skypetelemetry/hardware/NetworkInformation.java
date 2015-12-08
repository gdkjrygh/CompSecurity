// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.skypetelemetry.hardware;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.microsoft.applications.skypetelemetry.f;
import com.microsoft.applications.skypetelemetry.g;

// Referenced classes of package com.microsoft.applications.skypetelemetry.hardware:
//            AbstractHardwareInformation

public class NetworkInformation extends AbstractHardwareInformation
{

    private static final NetworkInformation b;
    private static final String c = com/microsoft/applications/skypetelemetry/hardware/NetworkInformation.getSimpleName();

    public NetworkInformation()
    {
    }

    private static String a(TelephonyManager telephonymanager)
    {
        com/microsoft/applications/skypetelemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        String s;
        s = telephonymanager.getNetworkOperatorName();
        telephonymanager.getPhoneType();
        com/microsoft/applications/skypetelemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return s;
        telephonymanager;
        throw telephonymanager;
    }

    public static void a(Context context)
    {
        com/microsoft/applications/skypetelemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        b(context);
        com/microsoft/applications/skypetelemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private static void a(ConnectivityManager connectivitymanager)
    {
        boolean flag1 = true;
        com/microsoft/applications/skypetelemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        Object obj;
        NetworkInformation networkinformation;
        obj = connectivitymanager.getNetworkInfo(9);
        networkinformation = b;
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!((NetworkInfo) (obj)).isAvailable()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L13:
        networkinformation.a("EthernetAvailable", Boolean.valueOf(flag));
        obj = connectivitymanager.getNetworkInfo(1);
        networkinformation = b;
        if (obj == null) goto _L5; else goto _L4
_L4:
        if (!((NetworkInfo) (obj)).isAvailable()) goto _L5; else goto _L6
_L6:
        flag = true;
_L10:
        networkinformation.a("WifiAvailable", Boolean.valueOf(flag));
        connectivitymanager = connectivitymanager.getNetworkInfo(6);
        obj = b;
        if (connectivitymanager == null) goto _L8; else goto _L7
_L7:
        if (!connectivitymanager.isAvailable()) goto _L8; else goto _L9
_L9:
        flag = flag1;
_L11:
        ((NetworkInformation) (obj)).a("WwanAvailable", Boolean.valueOf(flag));
        com/microsoft/applications/skypetelemetry/hardware/NetworkInformation;
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

    private static f b(ConnectivityManager connectivitymanager)
    {
        com/microsoft/applications/skypetelemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        f f1;
        NetworkInfo networkinfo;
        f1 = f.a;
        networkinfo = connectivitymanager.getActiveNetworkInfo();
        connectivitymanager = f1;
        if (networkinfo == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        connectivitymanager = f1;
        if (!networkinfo.isConnected())
        {
            break MISSING_BLOCK_LABEL_40;
        }
        connectivitymanager = f1;
        if (networkinfo.isRoaming())
        {
            connectivitymanager = f.d;
        }
        com/microsoft/applications/skypetelemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return connectivitymanager;
        connectivitymanager;
        throw connectivitymanager;
    }

    private static void b(Context context)
    {
        com/microsoft/applications/skypetelemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
        context = (TelephonyManager)context.getSystemService("phone");
        a(connectivitymanager);
        b.a("NetworkCost", Integer.valueOf(b(connectivitymanager).a()));
        b.a("NetworkType", Integer.valueOf(c(connectivitymanager).a()));
        b.a("NetworkProvider", a(context));
        com/microsoft/applications/skypetelemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private static g c(ConnectivityManager connectivitymanager)
    {
        com/microsoft/applications/skypetelemetry/hardware/NetworkInformation;
        JVM INSTR monitorenter ;
        g g1;
        NetworkInfo networkinfo;
        g1 = g.a;
        networkinfo = connectivitymanager.getActiveNetworkInfo();
        connectivitymanager = g1;
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
        connectivitymanager = g.a;
_L2:
        com/microsoft/applications/skypetelemetry/hardware/NetworkInformation;
        JVM INSTR monitorexit ;
        return connectivitymanager;
_L5:
        connectivitymanager = g.c;
        continue; /* Loop/switch isn't completed */
_L6:
        connectivitymanager = g.b;
        continue; /* Loop/switch isn't completed */
_L4:
        connectivitymanager = g.d;
        if (true) goto _L2; else goto _L7
_L7:
        connectivitymanager;
        throw connectivitymanager;
    }

    private static native void initNative();

    static 
    {
        b = new NetworkInformation();
        initNative();
        b.a("NetworkType", Integer.valueOf(g.a.a()));
        b.a("NetworkCost", Integer.valueOf(f.a.a()));
        b.a("NetworkProvider", "");
        b.a("EthernetAvailable", Boolean.valueOf(false));
        b.a("WifiAvailable", Boolean.valueOf(false));
        b.a("WwanAvailable", Boolean.valueOf(false));
    }
}
