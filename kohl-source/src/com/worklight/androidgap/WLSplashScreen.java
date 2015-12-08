// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.worklight.common.Logger;

public class WLSplashScreen
{
    class ActivityListener
        implements android.app.Application.ActivityLifecycleCallbacks
    {

        final WLSplashScreen this$0;

        public void onActivityCreated(Activity activity, Bundle bundle)
        {
        }

        public void onActivityDestroyed(Activity activity)
        {
            if (activity.getClass().getName().equals(activityClassName))
            {
                WLSplashScreen.getInstance().hide();
            }
        }

        public void onActivityPaused(Activity activity)
        {
        }

        public void onActivityResumed(Activity activity)
        {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
        {
        }

        public void onActivityStarted(Activity activity)
        {
        }

        public void onActivityStopped(Activity activity)
        {
        }

        ActivityListener()
        {
            this$0 = WLSplashScreen.this;
            super();
        }
    }


    private static WLSplashScreen instance = new WLSplashScreen();
    private static final String splashScreenFileName = "splash";
    private String activityClassName;
    private android.app.Application.ActivityLifecycleCallbacks activityListener;
    private Logger logger;
    private Dialog splashDialog;

    private WLSplashScreen()
    {
        logger = Logger.getInstance("wl.splashscreen");
    }

    private void displaySplashDialog(Activity activity, int i)
    {
        activityClassName = activity.getClass().getName();
        splashDialog = new Dialog(activity, 0x1030010);
        splashDialog.getWindow().setLayout(-1, -1);
        LinearLayout linearlayout = new LinearLayout(activity);
        linearlayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1, 0.0F));
        ImageView imageview = new ImageView(activity);
        imageview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        imageview.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        imageview.setBackgroundResource(i);
        linearlayout.addView(imageview);
        splashDialog.setContentView(linearlayout);
        splashDialog.setCancelable(false);
        splashDialog.show();
        if (activityListener == null && android.os.Build.VERSION.SDK_INT >= 14)
        {
            activity = (Application)activity.getApplicationContext();
            activityListener = new ActivityListener();
            activity.registerActivityLifecycleCallbacks(activityListener);
        }
    }

    public static WLSplashScreen getInstance()
    {
        return instance;
    }

    public void hide()
    {
        logger.trace("Hiding Splash Screen");
        if (splashDialog != null)
        {
            splashDialog.dismiss();
            splashDialog = null;
        }
    }

    public void show(Activity activity)
    {
        int i = activity.getResources().getIdentifier("splash", "drawable", activity.getPackageName());
        if (splashDialog != null)
        {
            logger.debug("Splash screen is already displayed");
        } else
        {
            if (i == 0)
            {
                logger.warn("Application will not display splash screen because required image is missing. Add splash.png image to res/drawble folder");
                return;
            }
            if (i != 0)
            {
                logger.debug("Showing Splash Screen");
                displaySplashDialog(activity, i);
                return;
            }
        }
    }


}
