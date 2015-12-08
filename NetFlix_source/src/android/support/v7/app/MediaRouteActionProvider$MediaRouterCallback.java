// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.media.MediaRouter;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.app:
//            MediaRouteActionProvider

private static final class mProviderWeak extends android.support.v7.media.roviderWeak
{

    private final WeakReference mProviderWeak;

    private void refreshRoute(MediaRouter mediarouter)
    {
        MediaRouteActionProvider mediarouteactionprovider = (MediaRouteActionProvider)mProviderWeak.get();
        if (mediarouteactionprovider != null)
        {
            MediaRouteActionProvider.access$000(mediarouteactionprovider);
            return;
        } else
        {
            mediarouter.removeCallback(this);
            return;
        }
    }

    public void onProviderAdded(MediaRouter mediarouter, android.support.v7.media.roviderWeak roviderweak)
    {
        refreshRoute(mediarouter);
    }

    public void onProviderChanged(MediaRouter mediarouter, android.support.v7.media.freshRoute freshroute)
    {
        refreshRoute(mediarouter);
    }

    public void onProviderRemoved(MediaRouter mediarouter, android.support.v7.media.freshRoute freshroute)
    {
        refreshRoute(mediarouter);
    }

    public void onRouteAdded(MediaRouter mediarouter, android.support.v7.media.freshRoute freshroute)
    {
        refreshRoute(mediarouter);
    }

    public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.freshRoute freshroute)
    {
        refreshRoute(mediarouter);
    }

    public void onRouteRemoved(MediaRouter mediarouter, android.support.v7.media.freshRoute freshroute)
    {
        refreshRoute(mediarouter);
    }

    public I(MediaRouteActionProvider mediarouteactionprovider)
    {
        mProviderWeak = new WeakReference(mediarouteactionprovider);
    }
}
