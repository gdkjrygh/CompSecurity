// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.EnterpriseMobileBanking;
import com.EnterpriseMobileBanking.Plugins.Components.TransiteWebView;
import com.EnterpriseMobileBanking.Plugins.Components.WebViewClient;
import com.EnterpriseMobileBanking.Utils.CallbackTask;
import com.EnterpriseMobileBanking.Utils.CallbackTaskFactory;
import com.EnterpriseMobileBanking.Utils.CallbackTaskLoader;
import com.EnterpriseMobileBanking.Utils.Log;
import com.EnterpriseMobileBanking.Utils.TransiteTaskWorker;
import com.capitalone.mobile.banking.app.Application;
import com.capitalone.mobile.banking.session.SessionManager;
import java.util.HashSet;
import java.util.Set;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            NativeCache

public class WebViewLinker extends Plugin
{
    final class JavaScriptInterface
    {

        private int maxSearches;
        private int statusLength;
        private String statusString;
        final WebViewLinker this$0;

        public void backButtonActive(boolean flag)
        {
            if (flag)
            {
                WebViewLinker.innerViewCanGoBack = true;
                sendJavascript("INGDirectApp.showBackButton();");
                return;
            } else
            {
                WebViewLinker.innerViewCanGoBack = false;
                sendJavascript("INGDirectApp.hideBackButton();");
                return;
            }
        }

        public void handleAlerts(String s)
        {
            String s1 = "INGDirectAppConnection.redirectContForReqTimeout();";
            if (s.trim().length() > 0)
            {
                s1 = (new StringBuilder()).append("Ext.dispatch({controller:'LoginController',action:'postLoginError',error:'").append(s).append("'})").toString();
            }
            sendJavascript(s1);
        }

        public void handleErrorCodes(String s)
        {
            if (s != null && s.length() >= statusLength)
            {
                int j;
                for (int i = 0; i <= maxSearches; i = j + 1)
                {
                    j = i;
                    if (s.regionMatches(true, i, statusString, 0, statusLength))
                    {
                        Log.d("WebViewLinker.JavaScriptInterface", "Found Match!");
                        sendJavascript("INGDirectApp.updateLastAccessed();");
                        sendJavascript("INGDirectApp.hideBusyIndicator();");
                        j = maxSearches;
                    }
                }

            }
        }

        public void userNameTransiteForm(String s)
        {
            if (!s.matches(NativeCache.staticRead("cif")))
            {
                NativeCache.staticWrite("cif", "");
                NativeCache.staticWrite("maskedCif", "");
            }
        }

        public JavaScriptInterface()
        {
            this$0 = WebViewLinker.this;
            super();
            statusString = "http status";
            statusLength = statusString.length();
            maxSearches = 10;
        }
    }


    private static final String TAG = "WebViewLinker";
    public static int TITLEBAR_HEIGHT = 0x80000000;
    private static final Set callbackIds = new HashSet();
    private static boolean innerViewCanGoBack = false;
    private static JSONArray outsideAppList = null;
    private static boolean outsideAppListLoadedFromCache = false;
    private static TransiteTaskWorker transiteWorker = null;
    private TransiteWebView transiteWebView;

    public WebViewLinker()
    {
        transiteWebView = null;
    }

    public static boolean allowedtoOpenOutOfApp(String s)
    {
        Log.d("WebViewLinker", (new StringBuilder()).append("allowedtoOpenOutOfApp(").append(s).append(");").toString());
        boolean flag2 = false;
        boolean flag = false;
        boolean flag1 = flag2;
        if (s != null)
        {
            flag1 = flag2;
            if (outsideAppList != null)
            {
                int i = 0;
                do
                {
                    flag1 = flag;
                    if (i >= outsideAppList.length())
                    {
                        break;
                    }
                    flag1 = flag;
                    if (flag)
                    {
                        break;
                    }
                    if (s.indexOf(outsideAppList.optString(i)) >= 0)
                    {
                        flag = true;
                    }
                    i++;
                } while (true);
            }
        }
        StringBuilder stringbuilder = (new StringBuilder()).append("allowedtoOpenOutofApp returning ");
        if (flag1)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        Log.d("WebViewLinker", stringbuilder.append(s).toString());
        return flag1;
    }

    private void createWorker()
    {
        this;
        JVM INSTR monitorenter ;
        if (transiteWorker == null && transiteWebView != null)
        {
            transiteWorker = new TransiteTaskWorker(transiteWebView);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static int getHeightWidthDPI(int i)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        int j = i;
        if (i == 0x80000000)
        {
            if (displaymetrics.density == 1.0F && displaymetrics.widthPixels > 320)
            {
                j = 56;
                TITLEBAR_HEIGHT = 56;
            } else
            {
                j = 80;
                TITLEBAR_HEIGHT = 80;
            }
        }
        return (int)((float)j * displaymetrics.density);
    }

    public static int getInnerHeight()
    {
        return 0;
    }

    private static void loadOutsideAppListFromCache()
    {
        if (!outsideAppListLoadedFromCache)
        {
            String s = NativeCache.staticRead("SP_URL_OPEN_OUTSIDE", "");
            if (s != null && s.length() > 0)
            {
                try
                {
                    outsideAppList = new JSONArray((new StringBuilder()).append("[").append(s).append("]").toString());
                }
                catch (Exception exception)
                {
                    Log.e("WebViewLinker", exception.getMessage());
                }
            }
            outsideAppListLoadedFromCache = true;
        }
    }

    public static void setOutsideAppList(JSONArray jsonarray)
    {
        int i = 0;
        while (i < jsonarray.length()) 
        {
            try
            {
                if (!outsideAppList.join(",").contains((CharSequence)jsonarray.opt(i)))
                {
                    outsideAppList.put(jsonarray.opt(i));
                }
            }
            catch (JSONException jsonexception)
            {
                Log.e("WebViewLinker", (new StringBuilder()).append("JSONException in setOutsideAppList : ").append(jsonexception).toString());
            }
            i++;
        }
    }

    public static boolean shouldShowBackButton()
    {
        return innerViewCanGoBack;
    }

    public void createTransiteView()
    {
        this;
        JVM INSTR monitorenter ;
        if (transiteWebView != null) goto _L2; else goto _L1
_L1:
        Log.d("WebViewLinker", "Creating Transite View");
        this;
        JVM INSTR monitorenter ;
        AppHelper.getApplicationLink().runOnUiThread(new Runnable() {

            final WebViewLinker this$0;
            final WebViewLinker val$me;

            public void run()
            {
                synchronized (me)
                {
                    transiteWebView = AppHelper.getTransiteView();
                    WebViewClient webviewclient = new WebViewClient(me);
                    transiteWebView.setWebViewClient(webviewclient);
                    transiteWebView.setTag(Boolean.valueOf(true));
                    transiteWebView.addJavascriptInterface(new JavaScriptInterface(), "webview");
                    me.notify();
                }
                return;
                exception;
                webviewlinker;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$0 = WebViewLinker.this;
                me = webviewlinker1;
                super();
            }
        });
        wait();
_L3:
        this;
        JVM INSTR monitorexit ;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        ((InterruptedException) (obj)).printStackTrace();
          goto _L3
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public PluginResult execute(String s, JSONArray jsonarray, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        PluginResult pluginresult;
        Log.i("WebViewLinker", (new StringBuilder()).append("action=").append(s).append(", callbackId=").append(s1).toString());
        Log.v("WebViewLinker", jsonarray.toString());
        pluginresult = new PluginResult(org.apache.cordova.api.PluginResult.Status.NO_RESULT);
        createTransiteView();
        createWorker();
        if (!CallbackTaskFactory.hasAction(s)) goto _L2; else goto _L1
_L1:
        Log.d("WebViewLinker", (new StringBuilder()).append("Found task for action: ").append(s).toString());
        jsonarray = CallbackTaskFactory.getCallbackTask(s, s1, jsonarray, this);
        s = pluginresult;
        if (jsonarray == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        Log.i("WebViewLinker", (new StringBuilder()).append("Pending Tasks: ").append(callbackIds.size()).toString());
        pluginresult.setKeepCallback(true);
        callbackIds.add(s1);
        transiteWorker.processCallback(jsonarray);
        s = pluginresult;
_L6:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        final boolean enabled = "openLocalWeb".equals(s);
        if (!enabled)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        s = jsonarray.getString(0);
        jsonarray = s;
        if (s.equals("products"))
        {
            jsonarray = "product";
        }
        s1 = AppHelper.getProductsUri();
        int i;
        int k;
        i = 0;
        k = -1;
_L4:
        int l = s1.indexOf("/", k + 1);
        if (l == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        int j = l;
        i = j;
        k = l;
        if (l != -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = j;
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        s = pluginresult;
        if (!jsonarray.equals(s1.substring(i + 1, s1.indexOf(".", i)))) goto _L6; else goto _L5
_L5:
        AppHelper.switchProducts();
        s = pluginresult;
          goto _L6
        s;
        Log.v("WebViewLinker", (new StringBuilder()).append("error, caught exception: ").append(s.getMessage()).toString());
        s.printStackTrace();
        s = pluginresult;
          goto _L6
        s;
        throw s;
        if (!"switchLOB".equals(s))
        {
            break MISSING_BLOCK_LABEL_383;
        }
        Log.v("WebViewLinker", "Switching to card LOB");
        AppHelper.handleNative(jsonarray.getString(0));
        s = pluginresult;
          goto _L6
        s;
        s.printStackTrace();
        s = pluginresult;
          goto _L6
        enabled = "enableTitleBarButtons".equals(s);
        if (!enabled)
        {
            break MISSING_BLOCK_LABEL_490;
        }
        s = null;
        jsonarray = jsonarray.getString(0);
        s = jsonarray;
_L7:
        Log.v("WebViewLinker", (new StringBuilder()).append("WebViewLinkerCommand").append(s).toString());
        String s2;
        String s3;
        JSONObject jsonobject;
        JSONArray jsonarray1;
        if (s.equals("true"))
        {
            enabled = true;
        } else
        {
            enabled = false;
        }
        this;
        JVM INSTR monitorenter ;
        cordova.getActivity().runOnUiThread(new Runnable() {

            final WebViewLinker this$0;
            final boolean val$enabled;
            final WebViewLinker val$me;

            public void run()
            {
                synchronized (me)
                {
                    AppHelper.changeButtonImage(enabled);
                    AppHelper.setNavigationEnabled(enabled);
                }
                return;
                exception;
                webviewlinker;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$0 = WebViewLinker.this;
                me = webviewlinker1;
                enabled = flag;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        s = pluginresult;
          goto _L6
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        jsonarray;
        jsonarray.printStackTrace();
          goto _L7
        if (!"alertDialog".equals(s))
        {
            break MISSING_BLOCK_LABEL_669;
        }
        s3 = "Oops";
        s2 = "An error has occured.";
        s1 = s2;
        jsonobject = new JSONObject(jsonarray.get(0).toString());
        s1 = s2;
        jsonarray1 = jsonobject.names();
        s = s2;
        s1 = s2;
        if (jsonarray1.length() < 0)
        {
            break MISSING_BLOCK_LABEL_575;
        }
        s1 = s2;
        s = jsonobject.optString(jsonarray1.get(0).toString(), "A problem has occured");
        jsonarray = s;
        s2 = s3;
        s1 = s;
        if (1 > jsonarray1.length())
        {
            break MISSING_BLOCK_LABEL_615;
        }
        s1 = s;
        s2 = jsonobject.optString(jsonarray1.get(1).toString(), "Try Again");
        jsonarray = s;
_L8:
        AppHelper.showError(s2, jsonarray);
        s = pluginresult;
          goto _L6
        s;
        Log.v("WebViewLinker", (new StringBuilder()).append("error, caught exception: ").append(s.getMessage()).toString());
        s.printStackTrace();
        jsonarray = s1;
        s2 = s3;
          goto _L8
        if (!"tickle".equals(s))
        {
            break MISSING_BLOCK_LABEL_700;
        }
        ((Application)AppHelper.getAppContext().getApplicationContext()).getSessionManager().resetTimeout();
        s = pluginresult;
          goto _L6
        Log.e("WebViewLinker", (new StringBuilder()).append("Did not find a task for: ").append(s).toString());
        sendJavascript("INGDirectApp.hideBusyIndicator();");
        transiteWebView.setVisibility(8);
        s = new PluginResult(org.apache.cordova.api.PluginResult.Status.INVALID_ACTION);
          goto _L6
    }

    public void sendJavascript(String s)
    {
        Log.i("WebViewLinker", (new StringBuilder()).append("Sending Javascript: ").append(s).toString());
        AppHelper.sendJavascript((new StringBuilder()).append("(function(){ try{ ").append(s).append(" } catch( err ) { WL.Logger.debug( 'Error: ' + err ); } })();").toString());
    }

    public void sendPluginResult(final org.apache.cordova.api.PluginResult.Status status, CallbackTask callbacktask)
    {
        final String cbId = callbacktask.getCallbackId();
        if (callbackIds.contains(cbId))
        {
            callbackIds.remove(cbId);
            callbacktask.setComplete();
            cordova.getActivity().runOnUiThread(new Runnable() {

                final WebViewLinker this$0;
                final String val$cbId;
                final org.apache.cordova.api.PluginResult.Status val$status;

                public void run()
                {
                    PluginResult pluginresult = new PluginResult(status);
                    pluginresult.setKeepCallback(false);
                    if (status != org.apache.cordova.api.PluginResult.Status.OK)
                    {
                        Log.i("WebViewLinker", (new StringBuilder()).append("Error Callback for: ").append(cbId).toString());
                        error(pluginresult, cbId);
                        return;
                    } else
                    {
                        Log.i("WebViewLinker", (new StringBuilder()).append("Success Callback for: ").append(cbId).toString());
                        success(pluginresult, cbId);
                        return;
                    }
                }

            
            {
                this$0 = WebViewLinker.this;
                status = status1;
                cbId = s;
                super();
            }
            });
        }
    }

    static 
    {
        CallbackTaskLoader.LoadAllTasks();
        loadOutsideAppListFromCache();
    }


/*
    static boolean access$002(boolean flag)
    {
        innerViewCanGoBack = flag;
        return flag;
    }

*/



/*
    static TransiteWebView access$102(WebViewLinker webviewlinker, TransiteWebView transitewebview)
    {
        webviewlinker.transiteWebView = transitewebview;
        return transitewebview;
    }

*/
}
