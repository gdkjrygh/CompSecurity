// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.ProgressBar;
import com.google.android.gms.common.internal.GmsIntents;

// Referenced classes of package com.google.android.gms.common:
//            GooglePlayServicesUtil

public final class GoogleApiAvailability
{

    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0x7e6378;
    private static final GoogleApiAvailability INSTANCE = new GoogleApiAvailability();

    GoogleApiAvailability()
    {
    }

    public static void cancelAvailabilityErrorNotifications(Context context)
    {
        GooglePlayServicesUtil.cancelAvailabilityErrorNotifications(context);
    }

    public static int getApkVersion(Context context)
    {
        return GooglePlayServicesUtil.getApkVersion(context);
    }

    public static Intent getErrorResolutionIntent(Context context, int i, String s)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
            return GmsIntents.createPlayStoreIntent("com.google.android.gms", getTrackingId(context, s));

        case 42: // '*'
            return GmsIntents.createAndroidWearUpdateIntent();

        case 3: // '\003'
            return GmsIntents.createSettingsIntent("com.google.android.gms");
        }
    }

    public static GoogleApiAvailability getInstance()
    {
        return INSTANCE;
    }

    private static String getTrackingId(Context context, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("gcore_");
        stringbuilder.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        stringbuilder.append("-");
        if (!TextUtils.isEmpty(s))
        {
            stringbuilder.append(s);
        }
        stringbuilder.append("-");
        if (context != null)
        {
            stringbuilder.append(context.getPackageName());
        }
        stringbuilder.append("-");
        if (context != null)
        {
            try
            {
                stringbuilder.append(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return stringbuilder.toString();
    }

    public static int isGooglePlayServicesAvailable(Context context)
    {
        int j = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        int i = j;
        if (GooglePlayServicesUtil.isPlayServicesPossiblyUpdating(context, j))
        {
            i = 18;
        }
        return i;
    }

    public static boolean isPlayServicesPossiblyUpdating(Context context, int i)
    {
        return GooglePlayServicesUtil.isPlayServicesPossiblyUpdating(context, i);
    }

    public static boolean isUninstalledAppPossiblyUpdating(Context context, String s)
    {
        return GooglePlayServicesUtil.isUninstalledAppPossiblyUpdating(context, s);
    }

    public static boolean isUserResolvableError(int i)
    {
        return GooglePlayServicesUtil.isUserRecoverableError(i);
    }

    public static Dialog showUpdatingDialog(Activity activity, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        Object obj1 = new ProgressBar(activity, null, 0x101007a);
        ((ProgressBar) (obj1)).setIndeterminate(true);
        ((ProgressBar) (obj1)).setVisibility(0);
        Object obj = new android.app.AlertDialog.Builder(activity);
        ((android.app.AlertDialog.Builder) (obj)).setView(((android.view.View) (obj1)));
        obj1 = GooglePlayServicesUtil.getAppName(activity);
        ((android.app.AlertDialog.Builder) (obj)).setMessage(activity.getResources().getString(0x7f10004c, new Object[] {
            obj1
        }));
        ((android.app.AlertDialog.Builder) (obj)).setTitle(0x7f10004d);
        ((android.app.AlertDialog.Builder) (obj)).setPositiveButton("", null);
        obj = ((android.app.AlertDialog.Builder) (obj)).create();
        GooglePlayServicesUtil.showDialogFragment(activity, oncancellistener, "GooglePlayServicesUpdatingDialog", ((Dialog) (obj)));
        return ((Dialog) (obj));
    }

}
