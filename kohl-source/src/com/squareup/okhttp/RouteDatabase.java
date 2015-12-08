// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;

// Referenced classes of package com.squareup.okhttp:
//            Route

public final class RouteDatabase
{

    private final Set failedRoutes = new LinkedHashSet();

    public RouteDatabase()
    {
    }

    public void connected(Route route)
    {
        this;
        JVM INSTR monitorenter ;
        failedRoutes.remove(route);
        this;
        JVM INSTR monitorexit ;
        return;
        route;
        throw route;
    }

    public void failed(Route route, IOException ioexception)
    {
        this;
        JVM INSTR monitorenter ;
        failedRoutes.add(route);
        if (!(ioexception instanceof SSLHandshakeException))
        {
            failedRoutes.add(route.flipTlsMode());
        }
        this;
        JVM INSTR monitorexit ;
        return;
        route;
        throw route;
    }

    public int failedRoutesCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = failedRoutes.size();
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean shouldPostpone(Route route)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = failedRoutes.contains(route);
        this;
        JVM INSTR monitorexit ;
        return flag;
        route;
        throw route;
    }
}
