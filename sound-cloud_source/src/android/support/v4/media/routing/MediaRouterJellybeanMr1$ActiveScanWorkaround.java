// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.routing;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.media.routing:
//            MediaRouterJellybeanMr1

public static final class mScanWifiDisplaysMethod
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

    public (Context context, Handler handler)
    {
        if (android.os..ActiveScanWorkaround != 17)
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
