// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.net;

import android.net.TrafficStats;
import java.net.Socket;
import java.net.SocketException;

class TrafficStatsCompatIcs
{

    TrafficStatsCompatIcs()
    {
    }

    public static void clearThreadStatsTag()
    {
        TrafficStats.clearThreadStatsTag();
    }

    public static int getThreadStatsTag()
    {
        return TrafficStats.getThreadStatsTag();
    }

    public static void incrementOperationCount(int i)
    {
        TrafficStats.incrementOperationCount(i);
    }

    public static void incrementOperationCount(int i, int j)
    {
        TrafficStats.incrementOperationCount(i, j);
    }

    public static void setThreadStatsTag(int i)
    {
        TrafficStats.setThreadStatsTag(i);
    }

    public static void tagSocket(Socket socket)
        throws SocketException
    {
        TrafficStats.tagSocket(socket);
    }

    public static void untagSocket(Socket socket)
        throws SocketException
    {
        TrafficStats.untagSocket(socket);
    }
}
