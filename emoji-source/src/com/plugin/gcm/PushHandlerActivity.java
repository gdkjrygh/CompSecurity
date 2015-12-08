// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.plugin.gcm;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

// Referenced classes of package com.plugin.gcm:
//            PushPlugin

public class PushHandlerActivity extends Activity
{

    private static String TAG = "PushHandlerActivity";

    public PushHandlerActivity()
    {
    }

    private void forceMainActivityReload()
    {
        startActivity(getPackageManager().getLaunchIntentForPackage(getApplicationContext().getPackageName()));
    }

    private void processPushBundle(boolean flag)
    {
        boolean flag1 = false;
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            bundle = bundle.getBundle("pushBundle");
            bundle.putBoolean("foreground", false);
            if (!flag)
            {
                flag1 = true;
            }
            bundle.putBoolean("coldstart", flag1);
            PushPlugin.sendExtras(bundle);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Log.v(TAG, "onCreate");
        boolean flag = PushPlugin.isActive();
        processPushBundle(flag);
        finish();
        if (!flag)
        {
            forceMainActivityReload();
        }
    }

    protected void onResume()
    {
        super.onResume();
        ((NotificationManager)getSystemService("notification")).cancelAll();
    }

}
