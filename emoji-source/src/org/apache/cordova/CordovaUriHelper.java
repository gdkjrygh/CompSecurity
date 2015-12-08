// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import org.xwalk.core.XWalkView;

// Referenced classes of package org.apache.cordova:
//            CordovaWebView, PluginManager, Whitelist, CordovaInterface, 
//            LOG

class CordovaUriHelper
{

    private static final String TAG = "CordovaUriHelper";
    private CordovaWebView appView;
    private CordovaInterface cordova;

    CordovaUriHelper(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        appView = cordovawebview;
        cordova = cordovainterface;
    }

    boolean shouldOverrideUrlLoading(XWalkView xwalkview, String s)
    {
        if (!appView.pluginManager.onOverrideUrlLoading(s))
        {
            if (s.startsWith("file://") | s.startsWith("data:"))
            {
                return s.contains("app_webview");
            }
            if (appView.getWhitelist().isUrlWhiteListed(s))
            {
                return false;
            }
            if (appView.getExternalWhitelist().isUrlWhiteListed(s))
            {
                try
                {
                    xwalkview = new Intent("android.intent.action.VIEW");
                    xwalkview.setData(Uri.parse(s));
                    xwalkview.addCategory("android.intent.category.BROWSABLE");
                    xwalkview.setComponent(null);
                    if (android.os.Build.VERSION.SDK_INT >= 15)
                    {
                        xwalkview.setSelector(null);
                    }
                    cordova.getActivity().startActivity(xwalkview);
                }
                // Misplaced declaration of an exception variable
                catch (XWalkView xwalkview)
                {
                    LOG.e("CordovaUriHelper", (new StringBuilder()).append("Error loading url ").append(s).toString(), xwalkview);
                    return true;
                }
                return true;
            }
        }
        return true;
    }
}
