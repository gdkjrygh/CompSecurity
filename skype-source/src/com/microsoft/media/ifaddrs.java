// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;

import java.net.InetAddress;

public class ifaddrs
{

    private InetAddress ifa_addr;
    private int ifa_flags;
    private int ifa_index;
    private String ifa_name;
    private int ifa_prefixlen;
    private int ifa_type;

    public ifaddrs(String s, int i, InetAddress inetaddress, int j, int k, int l)
    {
        ifa_name = s;
        ifa_flags = i;
        ifa_addr = inetaddress;
        ifa_prefixlen = j;
        ifa_index = k;
        ifa_type = l;
    }

    public String toString()
    {
        return (new StringBuilder("Name:")).append(ifa_name).append(", Addr:").append(ifa_addr.toString()).append(", prefix:").append(ifa_prefixlen).append(", index:").append(ifa_index).append(", type:").append(ifa_type).toString();
    }
}
