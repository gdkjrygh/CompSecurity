// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

// Referenced classes of package com.microsoft.media:
//            ifaddrs, RtcPalConfig

public class NetworkPal
{

    private static final String TAG = "NetworkPal";
    private static ConnectivityManager m_conMan = null;

    public NetworkPal()
    {
    }

    public static ifaddrs[] getNetworkInterfaceAddresses()
    {
        ifaddrs aifaddrs[];
        ArrayList arraylist;
        int i;
        aifaddrs = null;
        i = -1;
        arraylist = new ArrayList();
        Enumeration enumeration = NetworkInterface.getNetworkInterfaces();
_L4:
        if (enumeration == null)
        {
            break; /* Loop/switch isn't completed */
        }
        NetworkInterface networkinterface;
        if (!enumeration.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        networkinterface = (NetworkInterface)enumeration.nextElement();
        int j;
        j = i + 1;
        i = j;
        if (networkinterface.isLoopback())
        {
            continue; /* Loop/switch isn't completed */
        }
        i = j;
        Iterator iterator;
        if (!networkinterface.isUp())
        {
            continue; /* Loop/switch isn't completed */
        }
        iterator = networkinterface.getInterfaceAddresses().iterator();
_L2:
        i = j;
        if (!iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj = (InterfaceAddress)iterator.next();
        InetAddress inetaddress = ((InterfaceAddress) (obj)).getAddress();
        if (!inetaddress.isLoopbackAddress() && !inetaddress.isLinkLocalAddress() && !inetaddress.isAnyLocalAddress() && (!(inetaddress instanceof Inet6Address) || !((Inet6Address)inetaddress).isIPv4CompatibleAddress()))
        {
            obj = new ifaddrs(networkinterface.getName(), 0, inetaddress, ((InterfaceAddress) (obj)).getNetworkPrefixLength(), j, getNetworkType());
            arraylist.add(obj);
            if (RtcPalConfig.isLogcatEnabled())
            {
                String.format("addr=%s, siteLocal:%b, anyLocal:%b", new Object[] {
                    ((ifaddrs) (obj)).toString(), Boolean.valueOf(inetaddress.isSiteLocalAddress()), Boolean.valueOf(inetaddress.isLoopbackAddress())
                });
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        SocketException socketexception1;
        socketexception1;
        i = j;
        if (true) goto _L4; else goto _L3
_L3:
        ifaddrs aifaddrs1[] = (ifaddrs[])arraylist.toArray(new ifaddrs[arraylist.size()]);
        aifaddrs = aifaddrs1;
_L6:
        return aifaddrs;
        SocketException socketexception;
        socketexception;
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.e("NetworkPal", "getNetworkInterfaceAddresses failed", socketexception);
            return null;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static int getNetworkType()
    {
        Assert.assertNotNull(m_conMan);
        NetworkInfo networkinfo = m_conMan.getActiveNetworkInfo();
        if (networkinfo != null)
        {
            return networkinfo.getType();
        } else
        {
            return -1;
        }
    }

    public static boolean initialize(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        m_conMan = context;
        return context != null;
    }

}
