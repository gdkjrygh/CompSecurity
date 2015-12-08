// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap;

import android.content.DialogInterface;
import android.os.Bundle;
import com.worklight.androidgap.api.WL;
import com.worklight.androidgap.api.WLInitWebFrameworkListener;
import com.worklight.androidgap.api.WLInitWebFrameworkResult;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import com.worklight.nativeandroid.common.WLUtils;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.DroidGap;

// Referenced classes of package com.worklight.androidgap:
//            WLDroidGapListener

public class WLDroidGap extends DroidGap
    implements WLDroidGapListener
{

    private WLInitWebFrameworkResult initResult;
    private Bundle savedInstanceState;

    public WLDroidGap()
    {
        initResult = null;
    }

    private void handleInitCompleteStatus(WLInitWebFrameworkResult wlinitwebframeworkresult)
    {
        initResult = wlinitwebframeworkresult;
        if (wlinitwebframeworkresult.getStatusCode() != WLInitWebFrameworkResult.SUCCESS)
        {
            String s = WLUtils.getResourceString("error", this);
            String s1 = WLUtils.getResourceString("close", this);
            WLUtils.showDialog(this, s, wlinitwebframeworkresult.getMessage(), s1, new android.content.DialogInterface.OnClickListener() {

                final WLDroidGap this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    finish();
                }

            
            {
                this$0 = WLDroidGap.this;
                super();
            }
            });
        }
        onWLInitCompleted(savedInstanceState);
    }

    public static boolean isForeGround()
    {
        return WLConfig.getInstance().isHybridActivityInForeground();
    }

    public String getAppWebUrl(String s)
    {
        return WLConfig.getInstance().getAppWebUrl(s);
    }

    public String getLocalStorageRoot()
    {
        return WLConfig.getInstance().getLocalStorageRoot();
    }

    public String getLocalStorageWebRoot()
    {
        return WLConfig.getInstance().getWebResourcesUrl();
    }

    public String getWebMainFilePath()
    {
        return WL.getInstance().getMainHtmlFilePath();
    }

    public String getWebUrl()
    {
        return WLConfig.getInstance().getWebUrl();
    }

    public void loadUrl(String s)
    {
        loadUrl(s, true);
    }

    public void loadUrl(String s, boolean flag)
    {
        if (initResult.getStatusCode() == WLInitWebFrameworkResult.SUCCESS)
        {
            appView.addJavascriptInterface(this, "WLCordovaSplashScreenDialog");
            super.loadUrl(s);
        }
    }

    public void onCreate(Bundle bundle)
    {
        savedInstanceState = bundle;
        Logger.setContext(this);
        super.onCreate(bundle);
        init();
        setTheme(0x1030010);
        WL.createInstance(this);
        WL.getInstance().initializeWebFramework(getApplicationContext(), new WLInitWebFrameworkListener() {

            final WLDroidGap this$0;

            public void onInitWebFrameworkComplete(WLInitWebFrameworkResult wlinitwebframeworkresult)
            {
                handleInitCompleteStatus(wlinitwebframeworkresult);
            }

            
            {
                this$0 = WLDroidGap.this;
                super();
            }
        });
        WL.getInstance().showSplashScreen(this);
    }

    public void onWLInitCompleted(Bundle bundle)
    {
    }

    public void removeSplashScreen()
    {
        WL.getInstance().hideSplashScreen();
    }

    public void setClearCacheNextLoad()
    {
        WLConfig.getInstance().setClearCacheNextLoadPref(true);
    }

}
