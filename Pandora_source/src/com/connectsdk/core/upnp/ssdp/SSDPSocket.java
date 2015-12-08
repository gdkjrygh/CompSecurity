// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.core.upnp.ssdp;

import java.io.IOException;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketAddress;
import java.net.SocketException;

public class SSDPSocket
{

    InetAddress localInAddress;
    MulticastSocket mLocalSocket;
    NetworkInterface mNetIf;
    SocketAddress mSSDPMulticastGroup;
    int timeout;
    DatagramSocket wildSocket;

    public SSDPSocket(InetAddress inetaddress)
        throws IOException
    {
        timeout = 0;
        localInAddress = inetaddress;
        System.out.println((new StringBuilder()).append("Local address: ").append(localInAddress.getHostAddress()).toString());
        mSSDPMulticastGroup = new InetSocketAddress("239.255.255.250", 1900);
        mLocalSocket = new MulticastSocket(1900);
        mNetIf = NetworkInterface.getByInetAddress(localInAddress);
        mLocalSocket.joinGroup(mSSDPMulticastGroup, mNetIf);
        wildSocket = new DatagramSocket(null);
        wildSocket.setReuseAddress(true);
        wildSocket.bind(new InetSocketAddress(localInAddress, 1901));
    }

    public void close()
    {
        if (mLocalSocket != null)
        {
            try
            {
                mLocalSocket.leaveGroup(mSSDPMulticastGroup, mNetIf);
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
            mLocalSocket.close();
        }
        if (wildSocket != null)
        {
            wildSocket.disconnect();
            wildSocket.close();
        }
    }

    public boolean isConnected()
    {
        return wildSocket != null && mLocalSocket != null && wildSocket.isConnected() && mLocalSocket.isConnected();
    }

    public DatagramPacket notifyReceive()
        throws IOException
    {
        byte abyte0[] = new byte[1024];
        DatagramPacket datagrampacket = new DatagramPacket(abyte0, abyte0.length);
        mLocalSocket.receive(datagrampacket);
        return datagrampacket;
    }

    public DatagramPacket responseReceive()
        throws IOException
    {
        byte abyte0[] = new byte[1024];
        DatagramPacket datagrampacket = new DatagramPacket(abyte0, abyte0.length);
        wildSocket.receive(datagrampacket);
        return datagrampacket;
    }

    public void send(String s)
        throws IOException
    {
        s = new DatagramPacket(s.getBytes(), s.length(), mSSDPMulticastGroup);
        wildSocket.send(s);
    }

    public void setTimeout(int i)
        throws SocketException
    {
        timeout = i;
        wildSocket.setSoTimeout(timeout);
    }
}
