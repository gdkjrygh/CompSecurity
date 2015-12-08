// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.net.InetAddress;
import java.net.UnknownHostException;

public interface Dns
{

    public static final Dns DEFAULT = new Dns() {

        public InetAddress[] getAllByName(String s)
            throws UnknownHostException
        {
            return InetAddress.getAllByName(s);
        }

    };

    public abstract InetAddress[] getAllByName(String s)
        throws UnknownHostException;

}
