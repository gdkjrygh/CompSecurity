// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Map;

// Referenced classes of package com.amobee.adsdk:
//            Parameters, Log

private static class isingIdClient.Info
{

    static void setAndroidAid(Parameters parameters, Context context)
    {
        try
        {
            context = AdvertisingIdClient.getAdvertisingIdInfo(parameters.mContext);
            Parameters.access$0(parameters, context.tId());
            Parameters.access$1(parameters).put("androidaid", Parameters.access$2(parameters));
            if (context.LimitAdTrackingEnabled())
            {
                Parameters.access$1(parameters).put("isLAT", "1");
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parameters parameters)
        {
            Log.d("Amobee Parameters", (new StringBuilder("getAdvertisingId - ")).append(parameters).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parameters parameters)
        {
            Log.d("Amobee Parameters", (new StringBuilder("getAdvertisingId - ")).append(parameters).toString());
        }
    }

    private isingIdClient.Info()
    {
    }
}
