// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import dalvik.system.PathClassLoader;

public class LauncherActivity extends Activity
{

    private static final String DEBUG_TAG = "LauncherActivity";
    private static final String LAUNCHER_ACTIVITY = "com.accuweather.android.TermsAndConditionsActivity";

    public LauncherActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        Object obj;
        super.onCreate(bundle);
        obj = null;
        bundle = null;
        String s = getPackageManager().getApplicationInfo(getPackageName(), 0).sourceDir;
        bundle = s;
_L2:
        bundle = new PathClassLoader(bundle, ClassLoader.getSystemClassLoader());
        try
        {
            bundle = bundle.loadClass("com.accuweather.android.TermsAndConditionsActivity");
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            bundle = obj;
        }
        if (bundle != null)
        {
            startActivity(new Intent(this, bundle));
        }
        finish();
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
