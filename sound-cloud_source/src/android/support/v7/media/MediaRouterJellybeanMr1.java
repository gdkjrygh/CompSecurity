// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaRouter;
import android.os.Handler;
import android.view.Display;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class MediaRouterJellybeanMr1
{
    public static final class ActiveScanWorkaround
        implements Runnable
    {

        private static final int WIFI_DISPLAY_SCAN_INTERVAL = 15000;
        private boolean mActivelyScanningWifiDisplays;
        private final DisplayManager mDisplayManager;
        private final Handler mHandler;
        private Method mScanWifiDisplaysMethod;

        public final void run()
        {
            if (mActivelyScanningWifiDisplays)
            {
                try
                {
                    mScanWifiDisplaysMethod.invoke(mDisplayManager, new Object[0]);
                }
                catch (IllegalAccessException illegalaccessexception) { }
                catch (InvocationTargetException invocationtargetexception) { }
                mHandler.postDelayed(this, 15000L);
            }
        }

        public final void setActiveScanRouteTypes(int i)
        {
            if ((i & 2) != 0)
            {
                if (!mActivelyScanningWifiDisplays && mScanWifiDisplaysMethod != null)
                {
                    mActivelyScanningWifiDisplays = true;
                    mHandler.post(this);
                }
            } else
            if (mActivelyScanningWifiDisplays)
            {
                mActivelyScanningWifiDisplays = false;
                mHandler.removeCallbacks(this);
                return;
            }
        }

        public ActiveScanWorkaround(Context context, Handler handler)
        {
            if (android.os.Build.VERSION.SDK_INT != 17)
            {
                throw new UnsupportedOperationException();
            }
            mDisplayManager = (DisplayManager)context.getSystemService("display");
            mHandler = handler;
            try
            {
                mScanWifiDisplaysMethod = android/hardware/display/DisplayManager.getMethod("scanWifiDisplays", new Class[0]);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }
    }

    public static interface Callback
        extends MediaRouterJellybean.Callback
    {

        public abstract void onRoutePresentationDisplayChanged(Object obj);
    }

    static class CallbackProxy extends MediaRouterJellybean.CallbackProxy
    {

        public void onRoutePresentationDisplayChanged(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
        {
            ((Callback)mCallback).onRoutePresentationDisplayChanged(routeinfo);
        }

        public CallbackProxy(Callback callback)
        {
            super(callback);
        }
    }

    public static final class IsConnectingWorkaround
    {

        private Method mGetStatusCodeMethod;
        private int mStatusConnecting;

        public final boolean isConnecting(Object obj)
        {
            obj = (android.media.MediaRouter.RouteInfo)obj;
            if (mGetStatusCodeMethod == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            int i;
            int j;
            i = ((Integer)mGetStatusCodeMethod.invoke(obj, new Object[0])).intValue();
            j = mStatusConnecting;
            return i == j;
            obj;
_L2:
            return false;
            obj;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public IsConnectingWorkaround()
        {
            if (android.os.Build.VERSION.SDK_INT != 17)
            {
                throw new UnsupportedOperationException();
            }
            try
            {
                mStatusConnecting = android/media/MediaRouter$RouteInfo.getField("STATUS_CONNECTING").getInt(null);
                mGetStatusCodeMethod = android/media/MediaRouter$RouteInfo.getMethod("getStatusCode", new Class[0]);
                return;
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                return;
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                return;
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                return;
            }
        }
    }

    public static final class RouteInfo
    {

        public static Display getPresentationDisplay(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).getPresentationDisplay();
        }

        public static boolean isEnabled(Object obj)
        {
            return ((android.media.MediaRouter.RouteInfo)obj).isEnabled();
        }

        public RouteInfo()
        {
        }
    }


    private static final String TAG = "MediaRouterJellybeanMr1";

    MediaRouterJellybeanMr1()
    {
    }

    public static Object createCallback(Callback callback)
    {
        return new CallbackProxy(callback);
    }
}
