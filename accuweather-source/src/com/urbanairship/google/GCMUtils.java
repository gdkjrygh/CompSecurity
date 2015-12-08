// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.google;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.push.GCMPushReceiver;
import com.urbanairship.util.ManifestUtils;
import java.util.List;

// Referenced classes of package com.urbanairship.google:
//            PlayServicesUtils

public class GCMUtils
{

    public static final String PERMISSION_RECEIVE = "com.google.android.c2dm.permission.RECEIVE";

    public GCMUtils()
    {
    }

    public static void validateManifest(AirshipConfigOptions airshipconfigoptions)
    {
        PackageManager packagemanager = UAirship.getPackageManager();
        String s = UAirship.getPackageName();
        ManifestUtils.checkRequiredPermission("android.permission.WAKE_LOCK");
        ManifestUtils.checkRequiredPermission("android.permission.GET_ACCOUNTS");
        ApplicationInfo applicationinfo;
        if (ManifestUtils.isPermissionKnown("com.google.android.c2dm.permission.RECEIVE"))
        {
            ManifestUtils.checkRequiredPermission("com.google.android.c2dm.permission.RECEIVE");
        } else
        {
            Logger.error("Required permission com.google.android.c2dm.permission.RECEIVE is unknown to PackageManager.");
        }
        applicationinfo = UAirship.getPackageInfo().applicationInfo;
        if (airshipconfigoptions.minSdkVersion < 16 || applicationinfo != null && applicationinfo.targetSdkVersion < 16 || android.os.Build.VERSION.SDK_INT < 16)
        {
            airshipconfigoptions = (new StringBuilder()).append(s).append(".permission.C2D_MESSAGE").toString();
            if (ManifestUtils.isPermissionKnown(airshipconfigoptions))
            {
                ManifestUtils.checkRequiredPermission(airshipconfigoptions);
            } else
            {
                Logger.error((new StringBuilder()).append("Required permission ").append(airshipconfigoptions).append(" is unknown to PackageManager.").toString());
            }
        }
        if (ManifestUtils.getReceiverInfo(com/urbanairship/push/GCMPushReceiver) != null)
        {
            airshipconfigoptions = new Intent("com.google.android.c2dm.intent.RECEIVE");
            airshipconfigoptions.addCategory(s);
            if (packagemanager.queryBroadcastReceivers(airshipconfigoptions, 0).isEmpty())
            {
                Logger.error((new StringBuilder()).append("AndroidManifest.xml's ").append(com/urbanairship/push/GCMPushReceiver.getCanonicalName()).append(" declaration missing required ").append(airshipconfigoptions.getAction()).append(" filter with category = ").append(s).toString());
            }
        } else
        {
            Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required receiver: ").append(com/urbanairship/push/GCMPushReceiver.getCanonicalName()).toString());
        }
        if (PlayServicesUtils.isGooglePlayServicesDependencyAvailable())
        {
            try
            {
                PlayServicesUtils.isGooglePlayServicesAvailable(UAirship.getApplicationContext());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (AirshipConfigOptions airshipconfigoptions)
            {
                Logger.error((new StringBuilder()).append("Google Play services developer error: ").append(airshipconfigoptions.getMessage()).toString());
            }
            return;
        } else
        {
            Logger.error("Google Play services required for GCM.");
            return;
        }
    }
}
