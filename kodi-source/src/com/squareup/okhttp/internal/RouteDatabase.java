// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import com.squareup.okhttp.Route;
import java.util.LinkedHashSet;
import java.util.Set;

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

    public void failed(Route route)
    {
        this;
        JVM INSTR monitorenter ;
        failedRoutes.add(route);
        this;
        JVM INSTR monitorexit ;
        return;
        route;
        throw route;
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
