// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http;

import java.net.InetAddress;

// Referenced classes of package org.apache.http:
//            HttpConnection

public interface HttpInetConnection
    extends HttpConnection
{

    public abstract InetAddress getLocalAddress();

    public abstract int getLocalPort();

    public abstract InetAddress getRemoteAddress();

    public abstract int getRemotePort();
}
