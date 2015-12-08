// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.actions;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.appboy.Constants;
import com.appboy.enums.AppStore;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.AppboyWebViewActivity;

// Referenced classes of package com.appboy.ui.actions:
//            IAction

public final class GooglePlayAppDetailsAction
    implements IAction
{

    private static final String AMAZON_STORE_APP_BASE = "amzn://apps/android?asin=";
    private static final String AMAZON_STORE_WEB_BASE = "http://www.amazon.com/gp/mas/dl/android?asin=";
    private static final String PLAY_STORE_APP_BASE = "market://details?id=";
    private static final String PLAY_STORE_WEB_BASE = "https://play.google.com/store/apps/details?id=";
    private static final String TAG;
    private final AppStore mAppStore;
    private String mKindleId;
    private final String mPackageName;
    private boolean mUseAppboyWebView;

    public GooglePlayAppDetailsAction(String s, boolean flag, AppStore appstore)
    {
        mPackageName = s;
        mUseAppboyWebView = flag;
        mAppStore = appstore;
    }

    public GooglePlayAppDetailsAction(String s, boolean flag, AppStore appstore, String s1)
    {
        mPackageName = s;
        mUseAppboyWebView = flag;
        mAppStore = appstore;
        mKindleId = s1;
    }

    public void execute(Context context)
    {
        if (mAppStore != AppStore.KINDLE_STORE)
        {
            try
            {
                context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                AppboyLogger.i(TAG, "Google Play Store not found, launching Play Store with WebView");
                mUseAppboyWebView = true;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                AppboyLogger.e(TAG, String.format("Unexpected exception while checking for %s.", new Object[] {
                    "com.google.android.gsf"
                }));
                mUseAppboyWebView = true;
            }
        }
        if (mUseAppboyWebView)
        {
            Object obj;
            if (mAppStore == AppStore.KINDLE_STORE)
            {
                obj = (new StringBuilder()).append("http://www.amazon.com/gp/mas/dl/android?asin=").append(mKindleId).toString();
            } else
            {
                obj = (new StringBuilder()).append("https://play.google.com/store/apps/details?id=").append(mPackageName).toString();
            }
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj))), context, com/appboy/ui/AppboyWebViewActivity));
            return;
        }
        String s;
        if (mAppStore == AppStore.KINDLE_STORE)
        {
            s = (new StringBuilder()).append("amzn://apps/android?asin=").append(mKindleId).toString();
        } else
        {
            s = (new StringBuilder()).append("market://details?id=").append(mPackageName).toString();
        }
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/ui/actions/GooglePlayAppDetailsAction.getName()
        });
    }
}
