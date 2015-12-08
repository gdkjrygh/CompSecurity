// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.router;


// Referenced classes of package com.spotify.cosmos.router:
//            Router, RouterParams, Request, ResolveCallback

public class NativeRouter
    implements Router
{

    private long nPtr;

    public NativeRouter()
    {
        init(new RouterParams());
    }

    public NativeRouter(RouterParams routerparams)
    {
        init(routerparams);
    }

    private native void init(RouterParams routerparams);

    public native void destroy();

    public native void resolve(Request request, ResolveCallback resolvecallback);
}
