// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap;

import android.content.Context;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import com.worklight.androidgap.plugin.WebResourcesDownloaderPlugin;
import java.io.File;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginManager;

public class WLWebView extends CordovaWebView
{

    public WLWebView(Context context)
    {
        super(context);
        WebSettings websettings = getSettings();
        websettings.setDefaultTextEncodingName("utf-8");
        websettings.setDatabaseEnabled(true);
        context = context.getApplicationContext().getDir("database", 0).getPath();
        if (context != null)
        {
            websettings.setDatabasePath(context);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        boolean flag = false;
        i;
        JVM INSTR lookupswitch 2: default 32
    //                   4: 43
    //                   82: 40;
           goto _L1 _L2 _L3
_L1:
        flag = super.onKeyDown(i, keyevent);
_L3:
        return flag;
_L2:
        org.apache.cordova.CordovaPlugin cordovaplugin;
        if (pluginManager != null && ((cordovaplugin = pluginManager.getPlugin("WebResourcesDownloader")) != null && ((WebResourcesDownloaderPlugin)cordovaplugin).isUpdating()))
        {
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
