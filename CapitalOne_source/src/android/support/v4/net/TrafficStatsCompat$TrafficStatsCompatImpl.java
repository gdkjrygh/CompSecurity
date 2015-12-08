// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.net;

import java.net.Socket;
import java.net.SocketException;

// Referenced classes of package android.support.v4.net:
//            TrafficStatsCompat

static interface 
{

    public abstract void clearThreadStatsTag();

    public abstract int getThreadStatsTag();

    public abstract void incrementOperationCount(int i);

    public abstract void incrementOperationCount(int i, int j);

    public abstract void setThreadStatsTag(int i);

    public abstract void tagSocket(Socket socket)
        throws SocketException;

    public abstract void untagSocket(Socket socket)
        throws SocketException;
}
