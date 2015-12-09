// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.media.MediaRouter;

// Referenced classes of package android.support.v7.media:
//            h

static class a extends android.media.aRouter.Callback
{

    protected final d a;

    public void onRouteAdded(MediaRouter mediarouter, android.media.aRouter.RouteInfo routeinfo)
    {
        a.a(routeinfo);
    }

    public void onRouteChanged(MediaRouter mediarouter, android.media.aRouter.RouteInfo routeinfo)
    {
        a.c(routeinfo);
    }

    public void onRouteGrouped(MediaRouter mediarouter, android.media.aRouter.RouteInfo routeinfo, android.media.aRouter.RouteGroup routegroup, int i)
    {
        a.a(routeinfo, routegroup, i);
    }

    public void onRouteRemoved(MediaRouter mediarouter, android.media.aRouter.RouteInfo routeinfo)
    {
        a.b(routeinfo);
    }

    public void onRouteSelected(MediaRouter mediarouter, int i, android.media.aRouter.RouteInfo routeinfo)
    {
        a.a(i, routeinfo);
    }

    public void onRouteUngrouped(MediaRouter mediarouter, android.media.aRouter.RouteInfo routeinfo, android.media.aRouter.RouteGroup routegroup)
    {
        a.a(routeinfo, routegroup);
    }

    public void onRouteUnselected(MediaRouter mediarouter, int i, android.media.aRouter.RouteInfo routeinfo)
    {
        a.b(i, routeinfo);
    }

    public void onRouteVolumeChanged(MediaRouter mediarouter, android.media.aRouter.RouteInfo routeinfo)
    {
        a.d(routeinfo);
    }

    public teInfo(teInfo teinfo)
    {
        a = teinfo;
    }
}
