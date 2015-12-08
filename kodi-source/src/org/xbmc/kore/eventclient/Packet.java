// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.eventclient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public abstract class Packet
{

    private static int uid = (int)(Math.random() * 2147483647D);
    private byte majver;
    private byte minver;
    private short packettype;
    private byte payload[];
    private byte sig[] = {
        88, 66, 77, 67
    };

    protected Packet(short word0)
    {
        payload = new byte[0];
        minver = 0;
        majver = 2;
        packettype = word0;
    }

    private byte[] getHeader(int i, int j, short word0)
    {
        byte abyte0[] = new byte[32];
        System.arraycopy(sig, 0, abyte0, 0, 4);
        abyte0[4] = majver;
        abyte0[5] = minver;
        System.arraycopy(shortToByteArray(packettype), 0, abyte0, 6, 2);
        System.arraycopy(intToByteArray(i), 0, abyte0, 8, 4);
        System.arraycopy(intToByteArray(j), 0, abyte0, 12, 4);
        System.arraycopy(shortToByteArray(word0), 0, abyte0, 16, 2);
        System.arraycopy(intToByteArray(uid), 0, abyte0, 18, 4);
        System.arraycopy(new byte[10], 0, abyte0, 22, 10);
        return abyte0;
    }

    private byte[] getUDPMessage(int i)
    {
        int j = getNumPackets();
        if (i > j)
        {
            return null;
        }
        short word0;
        byte abyte0[];
        if (i == j)
        {
            word0 = (short)((payload.length - 1) % 992 + 1);
        } else
        {
            word0 = 992;
        }
        abyte0 = new byte[word0 + 32];
        System.arraycopy(getHeader(i, j, word0), 0, abyte0, 0, 32);
        System.arraycopy(payload, (i - 1) * 992, abyte0, 32, word0);
        return abyte0;
    }

    private static final byte[] intToByteArray(int i)
    {
        return (new byte[] {
            (byte)(i >>> 24), (byte)(i >>> 16), (byte)(i >>> 8), (byte)i
        });
    }

    private static final byte[] shortToByteArray(short word0)
    {
        return (new byte[] {
            (byte)(word0 >>> 8), (byte)word0
        });
    }

    protected void appendPayload(byte byte0)
    {
        appendPayload(new byte[] {
            byte0
        });
    }

    protected void appendPayload(int i)
    {
        appendPayload(intToByteArray(i));
    }

    protected void appendPayload(String s)
    {
        s = s.getBytes();
        int i = payload.length;
        byte abyte0[] = payload;
        payload = new byte[s.length + i + 1];
        System.arraycopy(abyte0, 0, payload, 0, i);
        System.arraycopy(s, 0, payload, i, s.length);
    }

    protected void appendPayload(short word0)
    {
        appendPayload(shortToByteArray(word0));
    }

    protected void appendPayload(byte abyte0[])
    {
        int i = payload.length;
        byte abyte1[] = payload;
        payload = new byte[abyte0.length + i];
        System.arraycopy(abyte1, 0, payload, 0, i);
        System.arraycopy(abyte0, 0, payload, i, abyte0.length);
    }

    public int getNumPackets()
    {
        return Math.max(payload.length - 1, 0) / 992 + 1;
    }

    public void send(InetAddress inetaddress, int i)
        throws IOException
    {
        int k = getNumPackets();
        DatagramSocket datagramsocket = new DatagramSocket();
        for (int j = 1; j <= k; j++)
        {
            byte abyte0[] = getUDPMessage(j);
            DatagramPacket datagrampacket = new DatagramPacket(abyte0, abyte0.length);
            datagrampacket.setAddress(inetaddress);
            datagrampacket.setPort(i);
            datagramsocket.send(datagrampacket);
        }

    }

}
