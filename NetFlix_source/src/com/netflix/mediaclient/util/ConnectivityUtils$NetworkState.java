// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import com.netflix.mediaclient.net.LogMobileType;

// Referenced classes of package com.netflix.mediaclient.util:
//            ConnectivityUtils

public static class sid
{

    public boolean connected;
    public LogMobileType currentConnectionType;
    public String ipAddr;
    public String sid;
    public boolean wifi;

    public String toString()
    {
        return (new StringBuilder()).append("NetworkState [connected=").append(connected).append(", wifi=").append(wifi).append(", sid=").append(sid).append(", currentConnectionType=").append(currentConnectionType).append(", ipAddr=").append(ipAddr).append("]").toString();
    }

    public A(boolean flag, boolean flag1, String s)
    {
        connected = flag;
        wifi = flag1;
        sid = s;
    }
}
