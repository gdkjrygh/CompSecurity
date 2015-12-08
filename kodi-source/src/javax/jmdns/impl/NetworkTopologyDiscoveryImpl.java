// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.NetworkTopologyDiscovery;

public class NetworkTopologyDiscoveryImpl
    implements NetworkTopologyDiscovery
{

    private static final Logger logger = Logger.getLogger(javax/jmdns/impl/NetworkTopologyDiscoveryImpl.getName());
    private final Method _isUp;
    private final Method _supportsMulticast;

    public NetworkTopologyDiscoveryImpl()
    {
        Method method;
        try
        {
            method = java/net/NetworkInterface.getMethod("isUp", (Class[])null);
        }
        catch (Exception exception)
        {
            exception = null;
        }
        _isUp = method;
        try
        {
            method = java/net/NetworkInterface.getMethod("supportsMulticast", (Class[])null);
        }
        catch (Exception exception1)
        {
            exception1 = null;
        }
        _supportsMulticast = method;
    }

    public InetAddress[] getInetAddresses()
    {
        HashSet hashset = new HashSet();
        try
        {
            for (Enumeration enumeration = NetworkInterface.getNetworkInterfaces(); enumeration.hasMoreElements();)
            {
                NetworkInterface networkinterface = (NetworkInterface)enumeration.nextElement();
                Enumeration enumeration1 = networkinterface.getInetAddresses();
                while (enumeration1.hasMoreElements()) 
                {
                    InetAddress inetaddress = (InetAddress)enumeration1.nextElement();
                    if (logger.isLoggable(Level.FINEST))
                    {
                        logger.finest((new StringBuilder()).append("Found NetworkInterface/InetAddress: ").append(networkinterface).append(" -- ").append(inetaddress).toString());
                    }
                    if (useInetAddress(networkinterface, inetaddress))
                    {
                        hashset.add(inetaddress);
                    }
                }
            }

        }
        catch (SocketException socketexception)
        {
            logger.warning((new StringBuilder()).append("Error while fetching network interfaces addresses: ").append(socketexception).toString());
        }
        return (InetAddress[])hashset.toArray(new InetAddress[hashset.size()]);
    }

    public boolean useInetAddress(NetworkInterface networkinterface, InetAddress inetaddress)
    {
        Method method;
        Exception exception;
        boolean flag;
        try
        {
            method = _isUp;
        }
        // Misplaced declaration of an exception variable
        catch (NetworkInterface networkinterface)
        {
            return false;
        }
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        flag = ((Boolean)_isUp.invoke(networkinterface, (Object[])null)).booleanValue();
        if (!flag)
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_37;
        exception;
        exception = _supportsMulticast;
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        flag = ((Boolean)_supportsMulticast.invoke(networkinterface, (Object[])null)).booleanValue();
        if (!flag)
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_74;
        networkinterface;
        flag = inetaddress.isLoopbackAddress();
        return !flag;
    }

}
