// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Utils;

import android.webkit.WebView;
import com.EnterpriseMobileBanking.EnterpriseMobileBanking;
import com.EnterpriseMobileBanking.Plugins.WebViewLinker;
import org.json.JSONArray;

// Referenced classes of package com.EnterpriseMobileBanking.Utils:
//            CallbackTask, Log, CallbackTaskFactory, MenuItemSingleton

public class MenuCallbackTask extends CallbackTask
{

    public static final String TAG = "MenuCBT";
    public static final String actions[] = {
        "updateMenu"
    };
    private static String lastMenuArray = "";

    private MenuCallbackTask()
    {
    }

    private MenuCallbackTask(String s, JSONArray jsonarray, WebViewLinker webviewlinker)
    {
        super(s, jsonarray, webviewlinker);
    }

    public static void clearLastMenu()
    {
        lastMenuArray = "";
    }

    public static void load()
    {
        Log.d("MenuCBT", "Loading");
        CallbackTaskFactory.addCallbackTask(new MenuCallbackTask(), actions);
    }

    private void parseArgs()
    {
        JSONArray jsonarray = parameters.optJSONArray(0);
        if (jsonarray != null)
        {
            if (!lastMenuArray.equalsIgnoreCase(jsonarray.toString()))
            {
                Log.w("MenuCBT", "Updating Menu Contents!");
                lastMenuArray = jsonarray.toString();
                EnterpriseMobileBanking.clearAllMenuItems();
                MenuItemSingleton.getInstance().clear();
                Log.i("MenuCBT", (new StringBuilder()).append("JSON Size: ").append(jsonarray.length()).toString());
                for (int i = 0; i < jsonarray.length(); i++)
                {
                    org.json.JSONObject jsonobject = jsonarray.optJSONObject(i);
                    if (jsonobject != null)
                    {
                        EnterpriseMobileBanking.addMenuItem(jsonobject);
                    }
                }

            }
        } else
        {
            Log.d("MenuCBT", "Did not find a menu - possibly clearing");
            EnterpriseMobileBanking.clearAllMenuItems();
            MenuItemSingleton.getInstance().clear();
            lastMenuArray = "";
        }
    }

    public CallbackTask create(String s, JSONArray jsonarray, WebViewLinker webviewlinker)
    {
        return new MenuCallbackTask(s, jsonarray, webviewlinker);
    }

    public void execute(WebView webview)
    {
        parseArgs();
        appLink.sendPluginResult(org.apache.cordova.api.PluginResult.Status.OK, this);
    }

}
