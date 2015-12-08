// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.google;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.urbanairship.google:
//            GooglePlayServicesUtilWrapper, PlayServicesErrorActivity

public class PlayServicesUtils
{

    private static final int CONNECTION_SUCCESS = 0;
    private static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    private static final String GOOGLE_PLAY_STORE_PACKAGE_OLD = "com.google.market";
    public static int MISSING_PLAY_SERVICE_DEPENDENCY = -1;
    private static Boolean isGooglePlayServicesDependencyAvailable;

    public PlayServicesUtils()
    {
    }

    public static void handleAnyPlayServicesError(Context context)
    {
        if (isGooglePlayServicesDependencyAvailable()) goto _L2; else goto _L1
_L1:
        int i;
        return;
_L2:
        if ((i = GooglePlayServicesUtilWrapper.isGooglePlayServicesAvailable(context)) == 0) goto _L1; else goto _L3
_L3:
        if (GooglePlayServicesUtilWrapper.isUserRecoverableError(i))
        {
            Logger.info("Launching Play Services Activity to resolve error.");
            try
            {
                context.startActivity(new Intent(context, com/urbanairship/google/PlayServicesErrorActivity));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Logger.error(context.getMessage());
            }
            return;
        } else
        {
            Logger.info((new StringBuilder()).append("Error ").append(i).append(" is not user recoverable.").toString());
            return;
        }
        context;
        Logger.error((new StringBuilder()).append("Google Play services developer error: ").append(context.getMessage()).toString());
        return;
    }

    public static int isGooglePlayServicesAvailable(Context context)
    {
        if (isGooglePlayServicesDependencyAvailable())
        {
            return GooglePlayServicesUtilWrapper.isGooglePlayServicesAvailable(context);
        } else
        {
            return MISSING_PLAY_SERVICE_DEPENDENCY;
        }
    }

    public static boolean isGooglePlayServicesDependencyAvailable()
    {
        if (isGooglePlayServicesDependencyAvailable != null)
        {
            return isGooglePlayServicesDependencyAvailable.booleanValue();
        }
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            isGooglePlayServicesDependencyAvailable = Boolean.valueOf(false);
        } else
        {
            try
            {
                Class.forName("com.google.android.gms.common.GooglePlayServicesUtil");
                isGooglePlayServicesDependencyAvailable = Boolean.valueOf(true);
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                isGooglePlayServicesDependencyAvailable = Boolean.valueOf(false);
            }
        }
        return isGooglePlayServicesDependencyAvailable.booleanValue();
    }

    public static boolean isGooglePlayStoreAvailable()
    {
        boolean flag1 = false;
        Iterator iterator = UAirship.getPackageManager().getInstalledPackages(0).iterator();
        boolean flag;
        do
        {
            flag = flag1;
            if (!iterator.hasNext())
            {
                break;
            }
            PackageInfo packageinfo = (PackageInfo)iterator.next();
            if (!packageinfo.packageName.equals("com.android.vending") && !packageinfo.packageName.equals("com.google.market"))
            {
                continue;
            }
            flag = true;
            break;
        } while (true);
        return flag;
    }

}
