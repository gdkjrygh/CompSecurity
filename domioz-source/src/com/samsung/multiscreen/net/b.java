// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.net;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public final class b
{

    public static List a()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = b().iterator(); iterator.hasNext(); arraylist.addAll(b((NetworkInterface)iterator.next()))) { }
        return arraylist;
    }

    private static boolean a(String s)
    {
        boolean flag;
        try
        {
            flag = InetAddress.getByName(s) instanceof Inet4Address;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return flag;
    }

    private static boolean a(NetworkInterface networkinterface)
    {
        boolean flag;
        try
        {
            flag = networkinterface.supportsMulticast();
        }
        // Misplaced declaration of an exception variable
        catch (NetworkInterface networkinterface)
        {
            return false;
        }
        return flag;
    }

    private static List b()
    {
        ArrayList arraylist = new ArrayList();
        try
        {
            Enumeration enumeration = NetworkInterface.getNetworkInterfaces();
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break;
                }
                NetworkInterface networkinterface = (NetworkInterface)enumeration.nextElement();
                if (a(networkinterface))
                {
                    arraylist.add(networkinterface);
                }
            } while (true);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return arraylist;
    }

    private static List b(NetworkInterface networkinterface)
    {
        ArrayList arraylist = new ArrayList();
        networkinterface = networkinterface.getInetAddresses();
        do
        {
            if (!networkinterface.hasMoreElements())
            {
                break;
            }
            InetAddress inetaddress = (InetAddress)networkinterface.nextElement();
            if (a(inetaddress.getHostAddress()))
            {
                arraylist.add(inetaddress);
            }
        } while (true);
        return arraylist;
    }
}
