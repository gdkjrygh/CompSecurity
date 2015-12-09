// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import android.webkit.WebView;
import com.EnterpriseMobileBanking.AppHelper;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            BusyJSI

public class SwitchLobPlugin extends Plugin
{

    public SwitchLobPlugin()
    {
    }

    public PluginResult execute(String s, JSONArray jsonarray, String s1)
    {
        s1 = new PluginResult(org.apache.cordova.api.PluginResult.Status.NO_RESULT);
        if (s.equals("switchLobFinish"))
        {
            AppHelper.switchLobFinish(jsonarray.optString(0, ""));
            s1 = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK);
            AppHelper.getAppView().postDelayed(new Runnable() {

                final SwitchLobPlugin this$0;

                public void run()
                {
                    BusyJSI.forceHide();
                }

            
            {
                this$0 = SwitchLobPlugin.this;
                super();
            }
            }, 2000L);
        }
        return s1;
    }
}
