// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.dominos.analytics.CrashlyticsHandler;

// Referenced classes of package com.dominos.activities:
//            SplashScreenActivity_

public class InitialLaunchActivity extends Activity
{

    public InitialLaunchActivity()
    {
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0x10a0002, 0x10a0003);
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag1 = false;
        super.onCreate(bundle);
        CrashlyticsHandler.start(this);
        bundle = SplashScreenActivity_.intent(this);
        boolean flag = flag1;
        if (getIntent() != null)
        {
            flag = flag1;
            if (getIntent().getBooleanExtra("beacon.manager.setup", false))
            {
                flag = true;
            }
        }
        bundle.mBeaconLaunchMode(flag).start();
        finish();
    }
}
