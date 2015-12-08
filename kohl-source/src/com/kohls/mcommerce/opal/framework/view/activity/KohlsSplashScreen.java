// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            HomeActivity

public class KohlsSplashScreen extends Activity
{

    private Handler mHandler;
    private Runnable myRunnable;

    public KohlsSplashScreen()
    {
    }

    public void onBackPressed()
    {
        if (mHandler != null && myRunnable != null)
        {
            mHandler.removeCallbacks(myRunnable);
        }
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        KohlsPhoneApplication.getInstance().getConfigurationUtils().initAppConfig();
        if (!isTaskRoot() && getIntent().hasCategory("android.intent.category.LAUNCHER") && getIntent().getAction() != null && getIntent().getAction().equals("android.intent.action.MAIN"))
        {
            finish();
            return;
        } else
        {
            setContentView(0x7f030108);
            mHandler = new Handler();
            myRunnable = new Runnable() {

                final KohlsSplashScreen this$0;

                public void run()
                {
                    Intent intent = new Intent(KohlsSplashScreen.this, com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
                    startActivity(intent);
                    finish();
                }

            
            {
                this$0 = KohlsSplashScreen.this;
                super();
            }
            };
            return;
        }
    }

    protected void onPause()
    {
        if (mHandler != null && myRunnable != null)
        {
            mHandler.removeCallbacks(myRunnable);
        }
        super.onPause();
    }

    protected void onResume()
    {
        KohlsPhoneApplication.getInstance().setApplicationForeground();
        if (mHandler != null && myRunnable != null)
        {
            mHandler.postDelayed(myRunnable, 2000L);
        }
        super.onResume();
    }
}
