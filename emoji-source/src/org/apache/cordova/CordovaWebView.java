// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import org.xwalk.core.XWalkNavigationHistory;
import org.xwalk.core.XWalkNavigationItem;
import org.xwalk.core.XWalkPreferences;
import org.xwalk.core.XWalkView;

// Referenced classes of package org.apache.cordova:
//            ExposedJsApi, CordovaInterface, Config, PluginManager, 
//            LOG, CordovaBridge, NativeToJsMessageQueue, CordovaResourceApi, 
//            Whitelist, CordovaChromeClient, CordovaWebViewClient, IceCreamCordovaWebViewClient, 
//            ScrollEvent, CordovaPreferences, PluginResult

public class CordovaWebView extends XWalkView
{
    class ActivityResult
    {

        Intent incoming;
        int request;
        int result;
        final CordovaWebView this$0;

        public ActivityResult(int i, int j, Intent intent)
        {
            this$0 = CordovaWebView.this;
            super();
            request = i;
            result = j;
            incoming = intent;
        }
    }


    public static final String CORDOVA_VERSION = "3.6.3";
    static final android.widget.FrameLayout.LayoutParams COVER_SCREEN_GRAVITY_CENTER = new android.widget.FrameLayout.LayoutParams(-1, -1, 17);
    public static final String TAG = "CordovaWebView";
    private HashSet boundKeyCodes;
    CordovaBridge bridge;
    private CordovaChromeClient chromeClient;
    private CordovaInterface cordova;
    private Whitelist externalWhitelist;
    private Whitelist internalWhitelist;
    private long lastMenuEventTime;
    int loadUrlTimeout;
    String loadedUrl;
    private boolean paused;
    public PluginManager pluginManager;
    private CordovaPreferences preferences;
    private BroadcastReceiver receiver;
    private CordovaResourceApi resourceApi;
    CordovaWebViewClient viewClient;

    public CordovaWebView(Context context)
    {
        this(context, null);
    }

    public CordovaWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        boundKeyCodes = new HashSet();
        loadUrlTimeout = 0;
        lastMenuEventTime = 0L;
    }

    public CordovaWebView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
        boundKeyCodes = new HashSet();
        loadUrlTimeout = 0;
        lastMenuEventTime = 0L;
    }

    public CordovaWebView(Context context, AttributeSet attributeset, int i, boolean flag)
    {
        super(context, attributeset);
        boundKeyCodes = new HashSet();
        loadUrlTimeout = 0;
        lastMenuEventTime = 0L;
    }

    private void exposeJsInterface()
    {
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            Log.i("CordovaWebView", "Disabled addJavascriptInterface() bridge since Android version is old.");
            return;
        } else
        {
            addJavascriptInterface(new ExposedJsApi(bridge), "_cordovaNative");
            return;
        }
    }

    private void initIfNecessary()
    {
        if (pluginManager == null)
        {
            Log.w("CordovaWebView", "CordovaWebView.init() was not called. This will soon be required.");
            CordovaInterface cordovainterface = (CordovaInterface)getContext();
            if (!Config.isInitialized())
            {
                Config.init(cordovainterface.getActivity());
            }
            init(cordovainterface, makeWebViewClient(cordovainterface), makeWebChromeClient(cordovainterface), Config.getPluginEntries(), Config.getWhitelist(), Config.getExternalWhitelist(), Config.getPreferences());
        }
    }

    private void initWebViewSettings()
    {
        setVerticalScrollBarEnabled(false);
        if (shouldRequestFocusOnInit())
        {
            requestFocusFromTouch();
        }
        getContext().getApplicationContext().getDir("database", 0).getPath();
        if ((getContext().getApplicationContext().getApplicationInfo().flags & 2) != 0)
        {
            enableRemoteDebugging();
        }
    }

    public boolean backHistory()
    {
        if (super.getNavigationHistory().canGoBack())
        {
            super.getNavigationHistory().navigate(org.xwalk.core.XWalkNavigationHistory.Direction.BACKWARD, 1);
            return true;
        } else
        {
            return false;
        }
    }

    public void bindButton(int i, boolean flag, boolean flag1)
    {
        setButtonPlumbedToJs(i, flag1);
    }

    public void bindButton(String s, boolean flag)
    {
        if (s.compareTo("volumeup") == 0)
        {
            setButtonPlumbedToJs(24, flag);
        } else
        if (s.compareTo("volumedown") == 0)
        {
            setButtonPlumbedToJs(25, flag);
            return;
        }
    }

    public void bindButton(boolean flag)
    {
        setButtonPlumbedToJs(4, flag);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        boolean flag = true;
        if (keyevent.getAction() != 1)
        {
            flag = super.dispatchKeyEvent(keyevent);
        } else
        {
            int i = keyevent.getKeyCode();
            if (i == 4)
            {
                if (hasEnteredFullscreen())
                {
                    leaveFullscreen();
                    return true;
                }
                if (isButtonPlumbedToJs(4))
                {
                    loadUrl("javascript:cordova.fireDocumentEvent('backbutton');");
                    return true;
                }
                if (!backHistory())
                {
                    cordova.getActivity().finish();
                    return false;
                }
            } else
            {
                if (i == 82)
                {
                    if (lastMenuEventTime < keyevent.getEventTime())
                    {
                        loadUrl("javascript:cordova.fireDocumentEvent('menubutton');");
                    }
                    lastMenuEventTime = keyevent.getEventTime();
                    return super.dispatchKeyEvent(keyevent);
                }
                if (i == 84)
                {
                    loadUrl("javascript:cordova.fireDocumentEvent('searchbutton');");
                    return true;
                } else
                {
                    return super.dispatchKeyEvent(keyevent);
                }
            }
        }
        return flag;
    }

    public void enableRemoteDebugging()
    {
        XWalkPreferences.setValue("remote-debugging", true);
    }

    public Whitelist getExternalWhitelist()
    {
        return externalWhitelist;
    }

    public CordovaPreferences getPreferences()
    {
        return preferences;
    }

    public String getProperty(String s, String s1)
    {
        Bundle bundle = cordova.getActivity().getIntent().getExtras();
        if (bundle != null)
        {
            if ((s = ((String) (bundle.get(s.toLowerCase(Locale.getDefault()))))) != null)
            {
                return s.toString();
            }
        }
        return s1;
    }

    public CordovaResourceApi getResourceApi()
    {
        return resourceApi;
    }

    public CordovaChromeClient getWebChromeClient()
    {
        return chromeClient;
    }

    public Whitelist getWhitelist()
    {
        return internalWhitelist;
    }

    public boolean hadKeyEvent()
    {
        return false;
    }

    public void handleDestroy()
    {
        loadUrl("javascript:try{cordova.require('cordova/channel').onDestroy.fire();}catch(e){console.log('exception firing destroy event from native');};");
        loadUrl("about:blank");
        if (pluginManager != null)
        {
            pluginManager.onDestroy();
        }
        if (receiver != null)
        {
            try
            {
                getContext().unregisterReceiver(receiver);
            }
            catch (Exception exception)
            {
                Log.e("CordovaWebView", (new StringBuilder()).append("Error unregistering configuration receiver: ").append(exception.getMessage()).toString(), exception);
            }
        }
        onDestroy();
    }

    public void handlePause(boolean flag)
    {
        LOG.d("CordovaWebView", "Handle the pause");
        loadUrl("javascript:try{cordova.fireDocumentEvent('pause');}catch(e){console.log('exception firing pause event from native');};");
        if (pluginManager != null)
        {
            pluginManager.onPause(flag);
        }
        if (!flag)
        {
            pauseTimersForReal();
        }
        paused = true;
    }

    public void handleResume(boolean flag, boolean flag1)
    {
        loadUrl("javascript:try{cordova.fireDocumentEvent('resume');}catch(e){console.log('exception firing resume event from native');};");
        if (pluginManager != null)
        {
            pluginManager.onResume(flag);
        }
        resumeTimers();
        paused = false;
    }

    public void init(CordovaInterface cordovainterface, CordovaWebViewClient cordovawebviewclient, CordovaChromeClient cordovachromeclient, List list, Whitelist whitelist, Whitelist whitelist1, CordovaPreferences cordovapreferences)
    {
        if (cordova != null)
        {
            throw new IllegalStateException();
        } else
        {
            cordova = cordovainterface;
            viewClient = cordovawebviewclient;
            chromeClient = cordovachromeclient;
            internalWhitelist = whitelist;
            externalWhitelist = whitelist1;
            preferences = cordovapreferences;
            super.setResourceClient(cordovawebviewclient);
            super.setUIClient(cordovachromeclient);
            pluginManager = new PluginManager(this, cordova, list);
            bridge = new CordovaBridge(pluginManager, new NativeToJsMessageQueue(this, cordovainterface));
            resourceApi = new CordovaResourceApi(getContext(), pluginManager);
            pluginManager.addService("App", "org.apache.cordova.App");
            initWebViewSettings();
            exposeJsInterface();
            return;
        }
    }

    public boolean isBackButtonBound()
    {
        return isButtonPlumbedToJs(4);
    }

    public boolean isButtonPlumbedToJs(int i)
    {
        return boundKeyCodes.contains(Integer.valueOf(i));
    }

    public boolean isPaused()
    {
        return paused;
    }

    public void load(String s, String s1)
    {
        if (s.equals("about:blank") || s.startsWith("javascript:"))
        {
            loadUrlNow(s);
            return;
        } else
        {
            loadUrlIntoView(s);
            return;
        }
    }

    public void loadUrl(String s)
    {
        load(s, null);
    }

    public void loadUrl(String s, int i)
    {
        if (s == null)
        {
            loadUrlIntoView(Config.getStartUrl());
            return;
        } else
        {
            loadUrlIntoView(s);
            return;
        }
    }

    public void loadUrlIntoView(String s)
    {
        loadUrlIntoView(s, true);
    }

    public void loadUrlIntoView(String s, int i)
    {
        if (!s.startsWith("javascript:") && !getNavigationHistory().canGoBack())
        {
            LOG.d("CordovaWebView", "loadUrlIntoView(%s, %d)", new Object[] {
                s, Integer.valueOf(i)
            });
            postMessage("splashscreen", "show");
        }
        loadUrlIntoView(s);
    }

    public void loadUrlIntoView(final String url, boolean flag)
    {
        LOG.d("CordovaWebView", (new StringBuilder()).append(">>> loadUrl(").append(url).append(")").toString());
        initIfNecessary();
        if (flag)
        {
            loadedUrl = url;
            if (pluginManager != null)
            {
                pluginManager.init();
            }
        }
        int i = loadUrlTimeout;
        final Runnable timeoutCheck = new Runnable() {

            final CordovaWebView this$0;
            final int val$currentLoadUrlTimeout;
            final Runnable val$loadError;
            final int val$loadUrlTimeoutValue;
            final CordovaWebView val$me;

            public void run()
            {
                this;
                JVM INSTR monitorenter ;
                wait(loadUrlTimeoutValue);
                this;
                JVM INSTR monitorexit ;
_L2:
                if (me.loadUrlTimeout == currentLoadUrlTimeout)
                {
                    me.cordova.getActivity().runOnUiThread(loadError);
                }
                return;
                Exception exception;
                exception;
                this;
                JVM INSTR monitorexit ;
                try
                {
                    throw exception;
                }
                catch (InterruptedException interruptedexception)
                {
                    interruptedexception.printStackTrace();
                }
                if (true) goto _L2; else goto _L1
_L1:
            }

            
            {
                this$0 = CordovaWebView.this;
                loadUrlTimeoutValue = i;
                me = cordovawebview1;
                currentLoadUrlTimeout = j;
                loadError = runnable;
                super();
            }
        };
        cordova.getActivity().runOnUiThread(new Runnable() {

            final CordovaWebView this$0;
            final CordovaWebView val$me;
            final Runnable val$timeoutCheck;
            final String val$url;

            public void run()
            {
                cordova.getThreadPool().execute(timeoutCheck);
                me.loadUrlNow(url);
            }

            
            {
                this$0 = CordovaWebView.this;
                timeoutCheck = runnable;
                me = cordovawebview1;
                url = s;
                super();
            }
        });
    }

    void loadUrlNow(String s)
    {
        if (LOG.isLoggable(3) && !s.startsWith("javascript:"))
        {
            LOG.d("CordovaWebView", ">>> loadUrlNow()");
        }
        if (s.startsWith("file://") || s.startsWith("javascript:") || internalWhitelist.isUrlWhiteListed(s))
        {
            super.load(s, null);
        }
    }

    public CordovaChromeClient makeWebChromeClient(CordovaInterface cordovainterface)
    {
        return new CordovaChromeClient(cordovainterface, this);
    }

    public CordovaWebViewClient makeWebViewClient(CordovaInterface cordovainterface)
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            return new CordovaWebViewClient(cordovainterface, this);
        } else
        {
            return new IceCreamCordovaWebViewClient(cordovainterface, this);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        boolean flag = false;
        if (boundKeyCodes.contains(Integer.valueOf(i)))
        {
            if (i == 25)
            {
                loadUrl("javascript:cordova.fireDocumentEvent('volumedownbutton');");
                return true;
            }
            if (i == 24)
            {
                loadUrl("javascript:cordova.fireDocumentEvent('volumeupbutton');");
                return true;
            } else
            {
                return super.onKeyDown(i, keyevent);
            }
        }
        if (i == 4)
        {
            if (!startOfHistory() || isButtonPlumbedToJs(4))
            {
                flag = true;
            }
            return flag;
        }
        if (i == 82)
        {
            View view = getFocusedChild();
            if (view != null)
            {
                ((InputMethodManager)cordova.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                cordova.getActivity().openOptionsMenu();
                return true;
            } else
            {
                return super.onKeyDown(i, keyevent);
            }
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onNewIntent(Intent intent)
    {
        if (super.onNewIntent(intent))
        {
            return true;
        }
        if (pluginManager != null)
        {
            pluginManager.onNewIntent(intent);
        }
        return false;
    }

    public void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
        postMessage("onScrollChanged", new ScrollEvent(i, j, k, l, this));
    }

    public void pauseTimers()
    {
    }

    public void pauseTimersForReal()
    {
        super.pauseTimers();
    }

    public void postMessage(String s, Object obj)
    {
        if (pluginManager != null)
        {
            pluginManager.postMessage(s, obj);
        }
    }

    public void printBackForwardList()
    {
        XWalkNavigationHistory xwalknavigationhistory = getNavigationHistory();
        int j = xwalknavigationhistory.size();
        for (int i = 0; i < j; i++)
        {
            String s = xwalknavigationhistory.getItemAt(i).getUrl();
            LOG.d("CordovaWebView", (new StringBuilder()).append("The URL at index: ").append(Integer.toString(i)).append(" is ").append(s).toString());
        }

    }

    public boolean restoreState(Bundle bundle)
    {
        boolean flag = super.restoreState(bundle);
        Log.d("CordovaWebView", "WebView restoration crew now restoring!");
        if (pluginManager != null)
        {
            pluginManager.init();
        }
        return flag;
    }

    public void sendJavascript(String s)
    {
        bridge.getMessageQueue().addJavaScript(s);
    }

    public void sendPluginResult(PluginResult pluginresult, String s)
    {
        bridge.getMessageQueue().addPluginResult(pluginresult, s);
    }

    public void setButtonPlumbedToJs(int i, boolean flag)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unsupported keycode: ").append(i).toString());

        case 4: // '\004'
        case 24: // '\030'
        case 25: // '\031'
            break;
        }
        if (flag)
        {
            boundKeyCodes.add(Integer.valueOf(i));
            return;
        } else
        {
            boundKeyCodes.remove(Integer.valueOf(i));
            return;
        }
    }

    public void setWebChromeClient(CordovaChromeClient cordovachromeclient)
    {
        chromeClient = cordovachromeclient;
        super.setUIClient(cordovachromeclient);
    }

    public void setWebViewClient(CordovaWebViewClient cordovawebviewclient)
    {
        viewClient = cordovawebviewclient;
        super.setResourceClient(cordovawebviewclient);
    }

    protected boolean shouldRequestFocusOnInit()
    {
        return true;
    }

    public void showWebPage(String s, boolean flag, boolean flag1, HashMap hashmap)
    {
        LOG.d("CordovaWebView", "showWebPage(%s, %b, %b, HashMap", new Object[] {
            s, Boolean.valueOf(flag), Boolean.valueOf(flag1)
        });
        if (flag1)
        {
            getNavigationHistory().clear();
        }
        if (!flag)
        {
            if (s.startsWith("file://") || internalWhitelist.isUrlWhiteListed(s))
            {
                loadUrl(s);
                return;
            }
            LOG.w("CordovaWebView", (new StringBuilder()).append("showWebPage: Cannot load URL into webview since it is not in white list.  Loading into browser instead. (URL=").append(s).append(")").toString());
        }
        Uri uri;
        hashmap = new Intent("android.intent.action.VIEW");
        uri = Uri.parse(s);
        if (!"file".equals(uri.getScheme()))
        {
            break MISSING_BLOCK_LABEL_197;
        }
        hashmap.setDataAndType(uri, resourceApi.getMimeType(uri));
_L1:
        cordova.getActivity().startActivity(hashmap);
        return;
        try
        {
            hashmap.setData(uri);
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            LOG.e("CordovaWebView", (new StringBuilder()).append("Error loading url ").append(s).toString(), hashmap);
            return;
        }
          goto _L1
    }

    public boolean startOfHistory()
    {
        boolean flag = false;
        Object obj = getNavigationHistory().getItemAt(0);
        if (obj != null)
        {
            obj = ((XWalkNavigationItem) (obj)).getUrl();
            String s = getUrl();
            LOG.d("CordovaWebView", (new StringBuilder()).append("The current URL is: ").append(s).toString());
            LOG.d("CordovaWebView", (new StringBuilder()).append("The URL at item 0 is: ").append(((String) (obj))).toString());
            flag = s.equals(obj);
        }
        return flag;
    }

    public void stopLoading()
    {
        chromeClient.isCurrentlyLoading = false;
        super.stopLoading();
    }

    public void storeResult(int i, int j, Intent intent)
    {
    }

    static 
    {
        XWalkPreferences.setValue("enable-javascript", true);
        XWalkPreferences.setValue("javascript-can-open-window", true);
        XWalkPreferences.setValue("allow-universal-access-from-file", true);
        XWalkPreferences.setValue("support-multiple-windows", false);
    }


    // Unreferenced inner class org/apache/cordova/CordovaWebView$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        final CordovaWebView this$0;
        final CordovaWebView val$me;
        final String val$url;

        public void run()
        {
            me.stopLoading();
            LOG.e("CordovaWebView", "CordovaWebView: TIMEOUT ERROR!");
            if (viewClient != null)
            {
                viewClient.onReceivedLoadError(me, -6, "The connection to the server was unsuccessful.", url);
            }
        }

            
            {
                this$0 = CordovaWebView.this;
                me = cordovawebview1;
                url = s;
                super();
            }
    }

}
