// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;
import java.util.concurrent.FutureTask;
import org.chromium.base.ThreadUtils;

// Referenced classes of package org.chromium.content.browser:
//            LocationProviderFactory

public class LocationProviderAdapter
{

    static final boolean $assertionsDisabled;
    private LocationProviderFactory.LocationProvider mImpl;

    private LocationProviderAdapter(Context context)
    {
        mImpl = LocationProviderFactory.get(context);
    }

    static LocationProviderAdapter create(Context context)
    {
        return new LocationProviderAdapter(context);
    }

    private static native void nativeNewErrorAvailable(String s);

    private static native void nativeNewLocationAvailable(double d, double d1, double d2, boolean flag, double d3, boolean flag1, double d4, boolean flag2, double d5, 
            boolean flag3, double d6);

    public static void newErrorAvailable(String s)
    {
        nativeNewErrorAvailable(s);
    }

    public static void newLocationAvailable(double d, double d1, double d2, boolean flag, double d3, boolean flag1, double d4, boolean flag2, double d5, 
            boolean flag3, double d6)
    {
        nativeNewLocationAvailable(d, d1, d2, flag, d3, flag1, d4, flag2, d5, flag3, d6);
    }

    public boolean isRunning()
    {
        if (!$assertionsDisabled && !ThreadUtils.runningOnUiThread())
        {
            throw new AssertionError();
        } else
        {
            return mImpl.isRunning();
        }
    }

    public boolean start(final boolean gpsEnabled)
    {
        ThreadUtils.runOnUiThread(new FutureTask(new Runnable() {

            final LocationProviderAdapter this$0;
            final boolean val$gpsEnabled;

            public void run()
            {
                mImpl.start(gpsEnabled);
            }

            
            {
                this$0 = LocationProviderAdapter.this;
                gpsEnabled = flag;
                super();
            }
        }, null));
        return true;
    }

    public void stop()
    {
        ThreadUtils.runOnUiThread(new FutureTask(new Runnable() {

            final LocationProviderAdapter this$0;

            public void run()
            {
                mImpl.stop();
            }

            
            {
                this$0 = LocationProviderAdapter.this;
                super();
            }
        }, null));
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/LocationProviderAdapter.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

}
