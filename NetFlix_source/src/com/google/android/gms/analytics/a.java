// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.analytics:
//            m, aa

class a
    implements m
{

    private static Object sf = new Object();
    private static a sg;
    private Context mContext;
    private com.google.android.gms.ads.identifier.AdvertisingIdClient.Info sh;
    private long si;

    a(Context context)
    {
        mContext = context;
    }

    private com.google.android.gms.ads.identifier.AdvertisingIdClient.Info bQ()
    {
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        try
        {
            info = AdvertisingIdClient.getAdvertisingIdInfo(mContext);
        }
        catch (IllegalStateException illegalstateexception)
        {
            aa.z("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
            return null;
        }
        catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception)
        {
            aa.z("GooglePlayServicesRepairableException getting Ad Id Info");
            return null;
        }
        catch (IOException ioexception)
        {
            aa.z("IOException getting Ad Id Info");
            return null;
        }
        catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
        {
            aa.z("GooglePlayServicesNotAvailableException getting Ad Id Info");
            return null;
        }
        catch (Exception exception)
        {
            aa.z("Unknown exception. Could not get the ad Id.");
            return null;
        }
        return info;
    }

    public static m m(Context context)
    {
        if (sg == null)
        {
            synchronized (sf)
            {
                if (sg == null)
                {
                    sg = new a(context);
                }
            }
        }
        return sg;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public String getValue(String s)
    {
        long l = System.currentTimeMillis();
        if (l - si > 1000L)
        {
            sh = bQ();
            si = l;
        }
        if (sh != null)
        {
            if ("&adid".equals(s))
            {
                return sh.getId();
            }
            if ("&ate".equals(s))
            {
                if (sh.isLimitAdTrackingEnabled())
                {
                    return "0";
                } else
                {
                    return "1";
                }
            }
        }
        return null;
    }

}
