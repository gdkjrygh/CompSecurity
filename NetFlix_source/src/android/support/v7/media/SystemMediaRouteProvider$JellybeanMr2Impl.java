// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Context;

// Referenced classes of package android.support.v7.media:
//            SystemMediaRouteProvider, MediaRouterJellybeanMr2, MediaRouterJellybean

private static class <init> extends <init>
{

    protected Object getDefaultRoute()
    {
        return MediaRouterJellybeanMr2.getDefaultRoute(mRouterObj);
    }

    protected boolean isConnecting(temRouteRecord temrouterecord)
    {
        return ting(temrouterecord.mRouteObj);
    }

    protected void onBuildSystemRouteDescriptor(temRouteRecord temrouterecord, temRouteRecord temrouterecord1)
    {
        super.onBuildSystemRouteDescriptor(temrouterecord, temrouterecord1);
        temrouterecord = iption(temrouterecord.mRouteObj);
        if (temrouterecord != null)
        {
            temrouterecord1.n(temrouterecord.toString());
        }
    }

    protected void selectRoute(Object obj)
    {
        MediaRouterJellybean.selectRoute(mRouterObj, 0x800003, obj);
    }

    protected void updateCallback()
    {
        int i = 1;
        if (mCallbackRegistered)
        {
            MediaRouterJellybean.removeCallback(mRouterObj, mCallbackObj);
        }
        mCallbackRegistered = true;
        Object obj = mRouterObj;
        int j = mRouteTypes;
        Object obj1 = mCallbackObj;
        if (!mActiveScan)
        {
            i = 0;
        }
        MediaRouterJellybeanMr2.addCallback(obj, j, obj1, i | 2);
    }

    protected void updateUserRouteProperties(rRouteRecord rrouterecord)
    {
        super.updateUserRouteProperties(rrouterecord);
        escription(rrouterecord.mRouteObj, rrouterecord.mRoute.mRoute());
    }

    public rRouteRecord(Context context, rRouteRecord rrouterecord)
    {
        super(context, rrouterecord);
    }
}
