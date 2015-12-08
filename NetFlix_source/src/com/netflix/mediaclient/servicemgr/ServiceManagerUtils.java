// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import android.util.Pair;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            ServiceManager, IMdx

public class ServiceManagerUtils
{

    private static final String TAG = "ServiceManagerUtils";

    public ServiceManagerUtils()
    {
    }

    public static String getCurrentDeviceFriendlyName(ServiceManager servicemanager)
    {
        if (!isMdxAgentAvailable(servicemanager))
        {
            Log.e("ServiceManagerUtils", "Service manager is not available!");
            return "";
        }
        String s = servicemanager.getMdx().getCurrentTarget();
        servicemanager = servicemanager.getMdx().getTargetList();
        if (servicemanager == null || servicemanager.length < 1 || s == null)
        {
            if (Log.isLoggable("ServiceManagerUtils", 6))
            {
                Log.e("ServiceManagerUtils", (new StringBuilder()).append("No devices, current device ").append(s).toString());
            }
            return "";
        }
        for (int i = 0; i < servicemanager.length; i++)
        {
            if (s.equals(((Pair) (servicemanager[i])).first))
            {
                if (Log.isLoggable("ServiceManagerUtils", 3))
                {
                    Log.d("ServiceManagerUtils", (new StringBuilder()).append("Friendly name ").append((String)((Pair) (servicemanager[i])).second).append(" found for current device ").append(s).toString());
                }
                return (String)((Pair) (servicemanager[i])).second;
            }
        }

        if (Log.isLoggable("ServiceManagerUtils", 6))
        {
            Log.e("ServiceManagerUtils", (new StringBuilder()).append("No match found for current device ").append(s).toString());
        }
        return "";
    }

    public static boolean isMdxAgentAvailable(ServiceManager servicemanager)
    {
        return servicemanager != null && servicemanager.isReady() && servicemanager.getMdx() != null;
    }
}
