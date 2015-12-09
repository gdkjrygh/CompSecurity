// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Utils;

import android.os.Handler;
import android.webkit.WebView;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.Plugins.WebViewLinker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.EnterpriseMobileBanking.Utils:
//            CallbackTask, CallbackTaskFactory, Log, WebViewHelper

public class OpenCallbackTask extends CallbackTask
    implements Runnable
{

    private static final String TAG = "OpenCBT";
    private static final String actions[] = {
        "openInnerWebView", "openSecuredInnerWebView", "openMigrationWebView"
    };
    private String address;
    private JSONObject args;
    private WebView view;

    private OpenCallbackTask()
    {
        view = null;
        args = null;
        address = null;
    }

    private OpenCallbackTask(String s, JSONArray jsonarray, WebViewLinker webviewlinker)
    {
        super(s, jsonarray, webviewlinker);
        view = null;
        args = null;
        address = null;
    }

    public static void load()
    {
        CallbackTaskFactory.addCallbackTask(new OpenCallbackTask(), actions);
    }

    private JSONObject parseArgs(JSONArray jsonarray)
    {
        Object obj = new StringBuilder("{");
        Log.d("OpenCBT", (new StringBuilder()).append("Parameters length: ").append(jsonarray.length()).toString());
        if (jsonarray.length() > 0)
        {
            ((StringBuilder) (obj)).append((new StringBuilder()).append("address : \"").append(jsonarray.optString(0)).append("\"").toString());
        }
        if (jsonarray.length() > 2)
        {
            if (jsonarray.optString(1).equals("RP") || jsonarray.optString(1).equals("GET"))
            {
                WebViewLinker.setOutsideAppList(new JSONArray());
                StringBuilder stringbuilder;
                if (jsonarray.optString(1).equals("GET"))
                {
                    ((StringBuilder) (obj)).append(", mode: \"quiet\"");
                    Log.d("OpenCBT", "request in silent mode");
                } else
                {
                    jsonarray = jsonarray.optString(2).replace("+", "%2B");
                    ((StringBuilder) (obj)).append((new StringBuilder()).append(",mode: \"rewards\", postData: \"").append(jsonarray).append("\"").toString());
                    Log.d("OpenCBT", (new StringBuilder()).append("rewards postData: ").append(jsonarray).toString());
                }
            } else
            if (jsonarray.optString(1).contains("migration"))
            {
                ((StringBuilder) (obj)).append((new StringBuilder()).append(", postData: \"assertion=").append(jsonarray.optString(2)).append("&successView=").append(jsonarray.optString(1)).append("&custMigrationScenarioInd=").append(jsonarray.optString(3)).append("&customerMigrationEligible=true\"").toString());
            } else
            {
                ((StringBuilder) (obj)).append((new StringBuilder()).append(", postData: \"assertion=").append(jsonarray.optString(2)).append("&successView=").append(jsonarray.optString(1)).append("\"").toString());
            }
        }
        ((StringBuilder) (obj)).append("}");
        try
        {
            jsonarray = new JSONObject(((StringBuilder) (obj)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            Log.e("OpenCBT", (new StringBuilder()).append("JSONException: ").append(jsonarray.getMessage()).toString());
            jsonarray = null;
        }
        stringbuilder = (new StringBuilder()).append("retVal  is: ");
        if (jsonarray == null)
        {
            obj = "NULL";
        } else
        {
            obj = "NOT NULL";
        }
        Log.d("OpenCBT", stringbuilder.append(((String) (obj))).toString());
        return jsonarray;
    }

    public CallbackTask create(String s, JSONArray jsonarray, WebViewLinker webviewlinker)
    {
        Log.d("OpenCBT", (new StringBuilder()).append("Create: ").append(s).toString());
        return new OpenCallbackTask(s, jsonarray, webviewlinker);
    }

    public void execute(WebView webview)
    {
        view = webview;
        args = parseArgs(parameters);
        if (args == null)
        {
            return;
        }
        webview;
        JVM INSTR monitorenter ;
        address = args.optString("address", null);
        if (address == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        Log.d("OpenCBT", (new StringBuilder()).append("ADDRESS IS: ").append(address).toString());
        webview.getHandler().post(this);
        webview.wait();
        Log.d("OpenCBT", (new StringBuilder()).append("Done waiting for: ").append(address).toString());
        appLink.sendPluginResult(org.apache.cordova.api.PluginResult.Status.OK, this);
_L1:
        webview;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        webview;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        appLink.sendPluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, this);
          goto _L1
    }

    public void run()
    {
        WebView webview = view;
        webview;
        JVM INSTR monitorenter ;
        String s;
        String s1;
        StringBuilder stringbuilder;
        Log.d("OpenCBT", "Running");
        AppHelper.fixupUserAgentString(view);
        view.clearHistory();
        view.setVisibility(8);
        s = args.optString("postData", null);
        s1 = args.optString("mode", null);
        stringbuilder = (new StringBuilder()).append("Address: ").append(address).append(" -- Data: ");
        Object obj;
        if (s == null)
        {
            obj = "null";
        } else
        {
            obj = "not null";
        }
        Log.d("OpenCBT", stringbuilder.append(((String) (obj))).toString());
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        Log.d("OpenCBT", (new StringBuilder()).append("Adding url attribute: ").append(s1).append(" to: ").append(address).toString());
        obj = new WebViewHelper(appLink);
        ((WebViewHelper) (obj)).setMode(s1);
        if (s1.equals("rewards"))
        {
            ((WebViewHelper) (obj)).setTimeOutValue(65000);
            ((WebViewHelper) (obj)).setView(view);
            ((WebViewHelper) (obj)).startTimer();
        }
        AppHelper.addURLAttributes(address, ((WebViewHelper) (obj)));
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            AppHelper.addURLAttributes("rewards", ((WebViewHelper) (obj)));
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        view.postUrl(address, s.getBytes());
_L2:
        view.setTag(Boolean.valueOf(true));
        view.notify();
        webview;
        JVM INSTR monitorexit ;
        return;
        view.loadUrl(address);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        webview;
        JVM INSTR monitorexit ;
        throw obj;
    }

}
