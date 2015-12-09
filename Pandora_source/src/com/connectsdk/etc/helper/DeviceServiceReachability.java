// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.etc.helper;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class DeviceServiceReachability
{
    public static interface DeviceServiceReachabilityListener
    {

        public abstract void onLoseReachability(DeviceServiceReachability deviceservicereachability);
    }


    private static final int TIMEOUT = 10000;
    private InetAddress ipAddress;
    private DeviceServiceReachabilityListener listener;
    private Runnable testReachability = new Runnable() {

        final DeviceServiceReachability this$0;

        public void run()
        {
            try
            {
                do
                {
                    if (!ipAddress.isReachable(10000))
                    {
                        unreachable();
                    }
                    Thread.sleep(10000L);
                } while (true);
            }
            catch (IOException ioexception)
            {
                unreachable();
            }
            catch (InterruptedException interruptedexception)
            {
                return;
            }
        }

            
            {
                this$0 = DeviceServiceReachability.this;
                super();
            }
    };
    private Thread testThread;

    public DeviceServiceReachability()
    {
    }

    public DeviceServiceReachability(InetAddress inetaddress)
    {
        ipAddress = inetaddress;
    }

    public DeviceServiceReachability(InetAddress inetaddress, DeviceServiceReachabilityListener deviceservicereachabilitylistener)
    {
        ipAddress = inetaddress;
        listener = deviceservicereachabilitylistener;
    }

    public static DeviceServiceReachability getReachability(String s, DeviceServiceReachabilityListener deviceservicereachabilitylistener)
    {
        try
        {
            s = InetAddress.getByName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return getReachability(((InetAddress) (s)), deviceservicereachabilitylistener);
    }

    public static DeviceServiceReachability getReachability(InetAddress inetaddress, DeviceServiceReachabilityListener deviceservicereachabilitylistener)
    {
        return new DeviceServiceReachability(inetaddress, deviceservicereachabilitylistener);
    }

    private void unreachable()
    {
        stop();
        if (listener != null)
        {
            listener.onLoseReachability(this);
        }
    }

    public InetAddress getIpAddress()
    {
        return ipAddress;
    }

    public DeviceServiceReachabilityListener getListener()
    {
        return listener;
    }

    public boolean isRunning()
    {
        return testThread != null && testThread.isAlive();
    }

    public void setIpAddress(InetAddress inetaddress)
    {
        ipAddress = inetaddress;
    }

    public void setListener(DeviceServiceReachabilityListener deviceservicereachabilitylistener)
    {
        listener = deviceservicereachabilitylistener;
    }

    public void start()
    {
        if (isRunning())
        {
            return;
        } else
        {
            testThread = new Thread(testReachability);
            testThread.start();
            return;
        }
    }

    public void stop()
    {
        if (!isRunning())
        {
            return;
        } else
        {
            testThread.interrupt();
            testThread = null;
            return;
        }
    }


}
