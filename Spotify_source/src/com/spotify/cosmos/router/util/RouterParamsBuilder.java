// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.router.util;

import com.spotify.cosmos.router.RouterParams;

public class RouterParamsBuilder
{

    private RouterParams mRouterParams;

    private RouterParamsBuilder()
    {
        mRouterParams = new RouterParams();
    }

    public static RouterParamsBuilder create()
    {
        return new RouterParamsBuilder();
    }

    public RouterParams build()
    {
        return mRouterParams;
    }

    public RouterParamsBuilder cacheIdentifier(String s)
    {
        mRouterParams.cacheIdentifier = s;
        return this;
    }

    public RouterParamsBuilder disableEcho(boolean flag)
    {
        mRouterParams.disableEcho = flag;
        return this;
    }

    public RouterParamsBuilder disableGzip(boolean flag)
    {
        mRouterParams.disableGzip = flag;
        return this;
    }

    public RouterParamsBuilder disableMessages(boolean flag)
    {
        mRouterParams.disableMessages = flag;
        return this;
    }

    public RouterParamsBuilder session(String s)
    {
        mRouterParams.session = s;
        return this;
    }

    public RouterParamsBuilder version(String s)
    {
        mRouterParams.version = s;
        return this;
    }
}
