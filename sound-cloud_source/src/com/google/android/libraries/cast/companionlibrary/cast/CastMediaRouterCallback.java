// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast;

import android.support.v7.media.MediaRouter;
import com.google.android.gms.cast.CastDevice;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;
import com.google.android.libraries.cast.companionlibrary.utils.PreferenceAccessor;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast:
//            BaseCastManager

public class CastMediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
{

    private static final String TAG = LogUtils.makeLogTag(com/google/android/libraries/cast/companionlibrary/cast/CastMediaRouterCallback);
    private final BaseCastManager mCastManager;
    private boolean mRouteAvailable;

    public CastMediaRouterCallback(BaseCastManager basecastmanager)
    {
        mRouteAvailable = false;
        mCastManager = basecastmanager;
    }

    private boolean isRouteAvailable(MediaRouter mediarouter)
    {
        return mediarouter.isRouteAvailable(mCastManager.getMediaRouteSelector(), 3);
    }

    private void notifyRouteAvailabilityChangedIfNeeded(MediaRouter mediarouter)
    {
        boolean flag = isRouteAvailable(mediarouter);
        if (flag != mRouteAvailable)
        {
            mRouteAvailable = flag;
            mCastManager.onCastAvailabilityChanged(mRouteAvailable);
        }
    }

    public boolean isRouteAvailable()
    {
        return mRouteAvailable;
    }

    public void onRouteAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
    {
        if (!mediarouter.getDefaultRoute().equals(routeinfo))
        {
            notifyRouteAvailabilityChangedIfNeeded(mediarouter);
            mCastManager.onCastDeviceDetected(routeinfo);
        }
        if (mCastManager.getReconnectionStatus() == 1)
        {
            mediarouter = mCastManager.getPreferenceAccessor().getStringFromPreference("route-id");
            if (routeinfo.getId().equals(mediarouter))
            {
                LogUtils.LOGD(TAG, (new StringBuilder("onRouteAdded: Attempting to recover a session with info=")).append(routeinfo).toString());
                mCastManager.setReconnectionStatus(2);
                mediarouter = CastDevice.a(routeinfo.getExtras());
                LogUtils.LOGD(TAG, (new StringBuilder("onRouteAdded: Attempting to recover a session with device: ")).append(((CastDevice) (mediarouter)).d).toString());
                mCastManager.onDeviceSelected(mediarouter);
            }
        }
    }

    public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
    {
        notifyRouteAvailabilityChangedIfNeeded(mediarouter);
    }

    public void onRouteRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
    {
        notifyRouteAvailabilityChangedIfNeeded(mediarouter);
    }

    public void onRouteSelected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
    {
        LogUtils.LOGD(TAG, (new StringBuilder("onRouteSelected: info=")).append(routeinfo).toString());
        if (mCastManager.getReconnectionStatus() == 3)
        {
            mCastManager.setReconnectionStatus(4);
            mCastManager.cancelReconnectionTask();
            return;
        } else
        {
            mCastManager.getPreferenceAccessor().saveStringToPreference("route-id", routeinfo.getId());
            mediarouter = CastDevice.a(routeinfo.getExtras());
            mCastManager.onDeviceSelected(mediarouter);
            LogUtils.LOGD(TAG, (new StringBuilder("onRouteSelected: mSelectedDevice=")).append(((CastDevice) (mediarouter)).d).toString());
            return;
        }
    }

    public void onRouteUnselected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
    {
        LogUtils.LOGD(TAG, (new StringBuilder("onRouteUnselected: route=")).append(routeinfo).toString());
        mCastManager.onDeviceSelected(null);
    }

}
