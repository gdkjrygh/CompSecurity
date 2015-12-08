// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.push.common;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.worklight.common.Logger;

// Referenced classes of package com.worklight.wlclient.push.common:
//            GCMAPIClient, GCMHelperClient, GCMClient

public class GCMClientFactory
{

    private static Logger logger = Logger.getInstance("GCMClientFactory");

    public GCMClientFactory()
    {
    }

    public static GCMClient getInstance(Context context)
    {
        if (useGooglePlayServices(context))
        {
            logger.debug("Using GCMAPIClient");
            return new GCMAPIClient();
        } else
        {
            logger.debug("Using GCMHelperClient");
            return new GCMHelperClient();
        }
    }

    public static boolean useGooglePlayServices(Context context)
    {
        int i;
        try
        {
            Class.forName("com.google.android.gms.common.GooglePlayServicesUtil");
            i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            logger.debug("Google Play Services is not used because the play services library is not found. So using the default GCM helper implementation.");
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            logger.debug((new StringBuilder()).append("Google Play Services is not used because : ").append(context.getMessage()).append(". So using the default GCM helper implementation.").toString());
            return false;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        logger.debug((new StringBuilder()).append("Failed to use Google Play Services becuase the return code is ").append(i).toString());
        return false;
        return true;
    }

}
