// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;

public class Constants
{

    public static String ANDROID_VERSION = null;
    public static String APP_PACKAGE = null;
    public static String APP_VERSION = null;
    public static String FILES_PATH = null;
    public static String PHONE_MANUFACTURER = null;
    public static String PHONE_MODEL = null;
    public static String TAG = "HockeyApp";

    public Constants()
    {
    }

    public static void loadFromContext(Context context)
    {
        ANDROID_VERSION = android.os.Build.VERSION.RELEASE;
        PHONE_MODEL = Build.MODEL;
        PHONE_MANUFACTURER = Build.MANUFACTURER;
        Object obj = context.getPackageManager();
        try
        {
            obj = ((PackageManager) (obj)).getPackageInfo(context.getPackageName(), 0);
            APP_VERSION = (new StringBuilder()).append(((PackageInfo) (obj)).versionCode).toString();
            APP_PACKAGE = ((PackageInfo) (obj)).packageName;
            FILES_PATH = context.getFilesDir().getAbsolutePath();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

}
