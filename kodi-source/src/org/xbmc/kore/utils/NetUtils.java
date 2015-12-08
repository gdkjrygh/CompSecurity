// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.utils;

import android.content.Context;
import android.os.StatFs;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package org.xbmc.kore.utils:
//            LogUtils

public class NetUtils
{

    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/utils/NetUtils);

    public NetUtils()
    {
    }

    public static long calculateDiskCacheSize(File file)
    {
        long l = 0x500000L;
        long l1;
        file = new StatFs(file.getAbsolutePath());
        l1 = ((long)file.getBlockCount() * (long)file.getBlockSize()) / 50L;
        l = l1;
_L2:
        return Math.max(Math.min(l, 0x3200000L), 0x500000L);
        file;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static File createDefaultCacheDir(Context context)
    {
        context = new File(context.getApplicationContext().getCacheDir(), "app-cache");
        if (!context.exists())
        {
            context.mkdirs();
        }
        return context;
    }

    public static String getMacAddress(String s)
    {
        LogUtils.LOGD(TAG, (new StringBuilder()).append("Starting get Mac Address for: ").append(s).toString());
        Object obj;
        String s1;
        try
        {
            obj = InetAddress.getByName(s);
            ((InetAddress) (obj)).isReachable(1000);
            obj = ((InetAddress) (obj)).getHostAddress();
        }
        catch (UnknownHostException unknownhostexception)
        {
            LogUtils.LOGD(TAG, (new StringBuilder()).append("Got an UnknownHostException for host: ").append(s).toString(), unknownhostexception);
            return null;
        }
        catch (IOException ioexception)
        {
            LogUtils.LOGD(TAG, (new StringBuilder()).append("Couldn't check reachability of host: ").append(s).toString(), ioexception);
            return null;
        }
        s = new BufferedReader(new FileReader("/proc/net/arp"));
_L2:
        s1 = s.readLine();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        if (!s1.startsWith(((String) (obj)))) goto _L2; else goto _L1
_L1:
        s.close();
        s = s1.split("\\s+")[3].toUpperCase();
        return s;
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogUtils.LOGD(TAG, "Couldn check ARP cache.", s);
            return null;
        }
        return null;
    }

    public static InetAddress intToInetAddress(int i)
    {
        if (i == 0)
        {
            return null;
        }
        byte byte0 = (byte)(i & 0xff);
        byte byte1 = (byte)(i >> 8 & 0xff);
        byte byte2 = (byte)(i >> 16 & 0xff);
        byte byte3 = (byte)(i >> 24 & 0xff);
        InetAddress inetaddress;
        try
        {
            inetaddress = InetAddress.getByAddress(new byte[] {
                byte0, byte1, byte2, byte3
            });
        }
        catch (UnknownHostException unknownhostexception)
        {
            throw new AssertionError();
        }
        return inetaddress;
    }

    public static boolean sendWolMagicPacket(String s, String s1, int i)
    {
        if (s == null)
        {
            return false;
        }
        byte abyte0[] = new byte[6];
        String as[] = s.split("(\\:|\\-)");
        if (as.length != 6)
        {
            LogUtils.LOGD(TAG, (new StringBuilder()).append("Send magic packet: got an invalid MAC address: ").append(s).toString());
            return false;
        }
        int j = 0;
        do
        {
            if (j >= 6)
            {
                break;
            }
            try
            {
                abyte0[j] = (byte)Integer.parseInt(as[j], 16);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                LogUtils.LOGD(TAG, (new StringBuilder()).append("Send magic packet: got an invalid MAC address: ").append(s).toString());
                return false;
            }
            j++;
        } while (true);
        s = new byte[abyte0.length * 16 + 6];
        for (int k = 0; k < 6; k++)
        {
            s[k] = -1;
        }

        for (int l = 6; l < s.length; l += abyte0.length)
        {
            System.arraycopy(abyte0, 0, s, l, abyte0.length);
        }

        Object obj;
        obj = InetAddress.getByName(s1);
        DatagramPacket datagrampacket = new DatagramPacket(s, s.length, ((InetAddress) (obj)), i);
        s1 = new DatagramSocket();
        LogUtils.LOGD(TAG, (new StringBuilder()).append("Sending WoL to ").append(((InetAddress) (obj)).getHostAddress()).append(":").append(i).toString());
        s1.send(datagrampacket);
        obj = NetworkInterface.getNetworkInterfaces();
_L3:
        Object obj1;
        if (!((Enumeration) (obj)).hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (NetworkInterface)((Enumeration) (obj)).nextElement();
        if (((NetworkInterface) (obj1)).isLoopback())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = ((NetworkInterface) (obj1)).getInterfaceAddresses().iterator();
_L1:
        InetAddress inetaddress;
        if (!((Iterator) (obj1)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        inetaddress = ((InterfaceAddress)((Iterator) (obj1)).next()).getBroadcast();
        if (inetaddress != null)
        {
            try
            {
                LogUtils.LOGD(TAG, (new StringBuilder()).append("Sending WoL broadcast to ").append(inetaddress.getHostAddress()).append(":").append(i).toString());
                s1.send(new DatagramPacket(s, s.length, inetaddress, i));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                LogUtils.LOGD(TAG, "Exception while sending magic packet.", s);
                return false;
            }
        }
          goto _L1
        if (true) goto _L3; else goto _L2
_L2:
        s1.close();
        return true;
    }

}
