// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.CordovaPlugin;
import org.apache.cordova.api.LOG;
import org.apache.cordova.api.PluginManager;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova:
//            CordovaWebView, CordovaWebViewClient, CordovaChromeClient, IceCreamCordovaWebViewClient, 
//            LinearLayoutSoftKeyboardDetect, NativeToJsMessageQueue, AuthenticationToken

public class DroidGap extends Activity
    implements CordovaInterface
{

    private static int ACTIVITY_EXITING = 2;
    private static int ACTIVITY_RUNNING = 1;
    private static int ACTIVITY_STARTING = 0;
    public static String TAG = "DroidGap";
    protected CordovaPlugin activityResultCallback;
    protected boolean activityResultKeepRunning;
    private int activityState;
    protected CordovaWebView appView;
    private int backgroundColor;
    protected boolean cancelLoadUrl;
    protected boolean keepRunning;
    protected int loadUrlTimeoutValue;
    protected LinearLayout root;
    protected ProgressDialog spinnerDialog;
    protected Dialog splashDialog;
    protected int splashscreen;
    protected int splashscreenTime;
    private final ExecutorService threadPool = Executors.newCachedThreadPool();
    protected CordovaWebViewClient webViewClient;

    public DroidGap()
    {
        cancelLoadUrl = false;
        spinnerDialog = null;
        activityState = 0;
        activityResultCallback = null;
        backgroundColor = 0xff000000;
        splashscreen = 0;
        splashscreenTime = 0;
        loadUrlTimeoutValue = 20000;
        keepRunning = true;
    }

    public void addService(String s, String s1)
    {
        if (appView != null && appView.pluginManager != null)
        {
            appView.pluginManager.addService(s, s1);
        }
    }

    public boolean backHistory()
    {
        if (appView != null)
        {
            return appView.backHistory();
        } else
        {
            return false;
        }
    }

    public void cancelLoadUrl()
    {
        cancelLoadUrl = true;
    }

    public void clearAuthenticationTokens()
    {
        if (appView != null && appView.viewClient != null)
        {
            appView.viewClient.clearAuthenticationTokens();
        }
    }

    public void clearCache()
    {
        if (appView == null)
        {
            init();
        }
        appView.clearCache(true);
    }

    public void clearHistory()
    {
        appView.clearHistory();
    }

    public void displayError(final String title, final String message, final String button, final boolean exit)
    {
        runOnUiThread(new Runnable() {

            final DroidGap this$0;
            final String val$button;
            final boolean val$exit;
            final DroidGap val$me;
            final String val$message;
            final String val$title;

            public void run()
            {
                try
                {
                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(me);
                    builder.setMessage(message);
                    builder.setTitle(title);
                    builder.setCancelable(false);
                    builder.setPositiveButton(button, new android.content.DialogInterface.OnClickListener() {

                        final _cls4 this$1;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            dialoginterface.dismiss();
                            if (exit)
                            {
                                me.endActivity();
                            }
                        }

            
            {
                this$1 = _cls4.this;
                super();
            }
                    });
                    builder.create();
                    builder.show();
                    return;
                }
                catch (Exception exception)
                {
                    finish();
                }
            }

            
            {
                this$0 = DroidGap.this;
                me = droidgap1;
                message = s;
                title = s1;
                button = s2;
                exit = flag;
                super();
            }
        });
    }

    public void endActivity()
    {
        activityState = ACTIVITY_EXITING;
        super.finish();
    }

    public Activity getActivity()
    {
        return this;
    }

    public AuthenticationToken getAuthenticationToken(String s, String s1)
    {
        if (appView != null && appView.viewClient != null)
        {
            return appView.viewClient.getAuthenticationToken(s, s1);
        } else
        {
            return null;
        }
    }

    public boolean getBooleanProperty(String s, boolean flag)
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) goto _L2; else goto _L1
_L1:
        return flag;
_L2:
        Boolean boolean1 = (Boolean)bundle.get(s);
        s = boolean1;
_L4:
        if (s != null)
        {
            return s.booleanValue();
        }
        if (true) goto _L1; else goto _L3
_L3:
        ClassCastException classcastexception;
        classcastexception;
        if ("true".equals(bundle.get(s).toString()))
        {
            s = Boolean.valueOf(true);
        } else
        {
            s = Boolean.valueOf(false);
        }
          goto _L4
    }

    public Context getContext()
    {
        LOG.d(TAG, "This will be deprecated December 2012");
        return this;
    }

    public double getDoubleProperty(String s, double d)
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) goto _L2; else goto _L1
_L1:
        return d;
_L2:
        Double double1 = (Double)bundle.get(s);
        s = double1;
_L4:
        if (s != null)
        {
            return s.doubleValue();
        }
        if (true) goto _L1; else goto _L3
_L3:
        ClassCastException classcastexception;
        classcastexception;
        s = Double.valueOf(Double.parseDouble(bundle.get(s).toString()));
          goto _L4
    }

    public int getIntegerProperty(String s, int i)
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        Integer integer = (Integer)bundle.get(s);
        s = integer;
_L4:
        if (s != null)
        {
            return s.intValue();
        }
        if (true) goto _L1; else goto _L3
_L3:
        ClassCastException classcastexception;
        classcastexception;
        s = Integer.valueOf(Integer.parseInt(bundle.get(s).toString()));
          goto _L4
    }

    public String getStringProperty(String s, String s1)
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if ((s = bundle.getString(s)) != null)
            {
                return s;
            }
        }
        return s1;
    }

    public ExecutorService getThreadPool()
    {
        return threadPool;
    }

    public void init()
    {
        CordovaWebView cordovawebview = new CordovaWebView(this);
        Object obj;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            obj = new CordovaWebViewClient(this, cordovawebview);
        } else
        {
            obj = new IceCreamCordovaWebViewClient(this, cordovawebview);
        }
        init(cordovawebview, ((CordovaWebViewClient) (obj)), new CordovaChromeClient(this, cordovawebview));
    }

    public void init(CordovaWebView cordovawebview, CordovaWebViewClient cordovawebviewclient, CordovaChromeClient cordovachromeclient)
    {
        LOG.d(TAG, "DroidGap.init()");
        appView = cordovawebview;
        appView.setId(100);
        appView.setWebViewClient(cordovawebviewclient);
        appView.setWebChromeClient(cordovachromeclient);
        cordovawebviewclient.setWebView(appView);
        cordovachromeclient.setWebView(appView);
        appView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0F));
        appView.setVisibility(4);
        root.addView(appView);
        setContentView(root);
        cancelLoadUrl = false;
    }

    public boolean isUrlWhiteListed(String s)
    {
        if (appView != null)
        {
            return appView.isUrlWhiteListed(s);
        } else
        {
            return false;
        }
    }

    void loadSpinner()
    {
        String s;
        if (appView == null || !appView.canGoBack())
        {
            s = getStringProperty("loadingDialog", null);
        } else
        {
            s = getStringProperty("loadingPageDialog", null);
        }
        if (s != null)
        {
            String s2 = "";
            String s1 = "Loading Application...";
            if (s.length() > 0)
            {
                int i = s.indexOf(',');
                if (i > 0)
                {
                    s2 = s.substring(0, i);
                    s1 = s.substring(i + 1);
                } else
                {
                    s2 = "";
                    s1 = s;
                }
            }
            spinnerStart(s2, s1);
        }
    }

    public void loadUrl(String s)
    {
        if (appView == null)
        {
            init();
        }
        backgroundColor = getIntegerProperty("backgroundColor", 0xff000000);
        root.setBackgroundColor(backgroundColor);
        keepRunning = getBooleanProperty("keepRunning", true);
        loadSpinner();
        appView.loadUrl(s);
    }

    public void loadUrl(String s, int i)
    {
        if (appView == null)
        {
            init();
        }
        splashscreenTime = i;
        splashscreen = getIntegerProperty("splashscreen", 0);
        showSplashScreen(splashscreenTime);
        appView.loadUrl(s, i);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        CordovaPlugin cordovaplugin = activityResultCallback;
        if (cordovaplugin != null)
        {
            cordovaplugin.onActivityResult(i, j, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        LOG.d(TAG, "DroidGap.onCreate()");
        super.onCreate(bundle);
        if (!getBooleanProperty("showTitle", false))
        {
            getWindow().requestFeature(1);
        }
        if (getBooleanProperty("setFullscreen", false))
        {
            getWindow().setFlags(1024, 1024);
        } else
        {
            getWindow().setFlags(2048, 2048);
        }
        bundle = getWindowManager().getDefaultDisplay();
        root = new LinearLayoutSoftKeyboardDetect(this, bundle.getWidth(), bundle.getHeight());
        root.setOrientation(1);
        root.setBackgroundColor(backgroundColor);
        root.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1, 0.0F));
        setVolumeControlStream(3);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        postMessage("onCreateOptionsMenu", menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy()
    {
        LOG.d(TAG, "onDestroy()");
        super.onDestroy();
        removeSplashScreen();
        if (appView != null)
        {
            appView.handleDestroy();
            return;
        } else
        {
            endActivity();
            return;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (appView.getFocusedChild() != null && i == 4)
        {
            return appView.onKeyDown(i, keyevent);
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        android.view.View view = appView.getFocusedChild();
        if ((appView.isCustomViewShowing() || view != null) && i == 4)
        {
            return appView.onKeyUp(i, keyevent);
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public Object onMessage(String s, Object obj)
    {
        LOG.d(TAG, (new StringBuilder()).append("onMessage(").append(s).append(",").append(obj).append(")").toString());
        if (!"splashscreen".equals(s)) goto _L2; else goto _L1
_L1:
        if (!"hide".equals(obj.toString())) goto _L4; else goto _L3
_L3:
        removeSplashScreen();
_L6:
        return null;
_L4:
        if (splashDialog != null && !splashDialog.isShowing())
        {
            splashscreen = getIntegerProperty("splashscreen", 0);
            showSplashScreen(splashscreenTime);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ("spinner".equals(s))
        {
            if ("stop".equals(obj.toString()))
            {
                spinnerStop();
                appView.setVisibility(0);
            }
        } else
        if ("onReceivedError".equals(s))
        {
            s = (JSONObject)obj;
            try
            {
                onReceivedError(s.getInt("errorCode"), s.getString("description"), s.getString("url"));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        } else
        if ("exit".equals(s))
        {
            endActivity();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        if (appView != null)
        {
            appView.onNewIntent(intent);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        postMessage("onOptionsItemSelected", menuitem);
        return true;
    }

    protected void onPause()
    {
        super.onPause();
        LOG.d(TAG, "Paused the application!");
        while (activityState == ACTIVITY_EXITING || appView == null) 
        {
            return;
        }
        appView.handlePause(keepRunning);
        removeSplashScreen();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        postMessage("onPrepareOptionsMenu", menu);
        return true;
    }

    public void onReceivedError(int i, final String description, final String failingUrl)
    {
        final String errorUrl = getStringProperty("errorUrl", null);
        if (errorUrl != null && (errorUrl.startsWith("file://") || appView.isUrlWhiteListed(errorUrl)) && !failingUrl.equals(errorUrl))
        {
            runOnUiThread(new Runnable() {

                final DroidGap this$0;
                final String val$errorUrl;
                final DroidGap val$me;

                public void run()
                {
                    me.spinnerStop();
                    me.appView.showWebPage(errorUrl, false, true, null);
                }

            
            {
                this$0 = DroidGap.this;
                me = droidgap1;
                errorUrl = s;
                super();
            }
            });
            return;
        }
        final boolean exit;
        if (i != -2)
        {
            exit = true;
        } else
        {
            exit = false;
        }
        runOnUiThread(new Runnable() {

            final DroidGap this$0;
            final String val$description;
            final boolean val$exit;
            final String val$failingUrl;
            final DroidGap val$me;

            public void run()
            {
                if (exit)
                {
                    me.appView.setVisibility(8);
                    me.displayError("Application Error", (new StringBuilder()).append(description).append(" (").append(failingUrl).append(")").toString(), "OK", exit);
                }
            }

            
            {
                this$0 = DroidGap.this;
                exit = flag;
                me = droidgap1;
                description = s;
                failingUrl = s1;
                super();
            }
        });
    }

    protected void onResume()
    {
        super.onResume();
        LOG.d(TAG, "Resuming the App");
        if (activityState == ACTIVITY_STARTING)
        {
            activityState = ACTIVITY_RUNNING;
        } else
        if (appView != null)
        {
            appView.handleResume(keepRunning, activityResultKeepRunning);
            if ((!keepRunning || activityResultKeepRunning) && activityResultKeepRunning)
            {
                keepRunning = activityResultKeepRunning;
                activityResultKeepRunning = false;
                return;
            }
        }
    }

    public void postMessage(String s, Object obj)
    {
        if (appView != null)
        {
            appView.postMessage(s, obj);
        }
    }

    public AuthenticationToken removeAuthenticationToken(String s, String s1)
    {
        if (appView != null && appView.viewClient != null)
        {
            return appView.viewClient.removeAuthenticationToken(s, s1);
        } else
        {
            return null;
        }
    }

    public void removeSplashScreen()
    {
        if (splashDialog != null && splashDialog.isShowing())
        {
            splashDialog.dismiss();
            splashDialog = null;
        }
    }

    public void sendJavascript(String s)
    {
        if (appView != null)
        {
            appView.jsMessageQueue.addJavaScript(s);
        }
    }

    public void setActivityResultCallback(CordovaPlugin cordovaplugin)
    {
        activityResultCallback = cordovaplugin;
    }

    public void setAuthenticationToken(AuthenticationToken authenticationtoken, String s, String s1)
    {
        if (appView != null && appView.viewClient != null)
        {
            appView.viewClient.setAuthenticationToken(authenticationtoken, s, s1);
        }
    }

    public void setBooleanProperty(String s, boolean flag)
    {
        getIntent().putExtra(s, flag);
    }

    public void setDoubleProperty(String s, double d)
    {
        getIntent().putExtra(s, d);
    }

    public void setIntegerProperty(String s, int i)
    {
        getIntent().putExtra(s, i);
    }

    public void setStringProperty(String s, String s1)
    {
        getIntent().putExtra(s, s1);
    }

    protected void showSplashScreen(final int time)
    {
        runOnUiThread(new Runnable() {

            final DroidGap this$0;
            final DroidGap val$that;
            final int val$time;

            public void run()
            {
                Display display = getWindowManager().getDefaultDisplay();
                LinearLayout linearlayout = new LinearLayout(that.getActivity());
                linearlayout.setMinimumHeight(display.getHeight());
                linearlayout.setMinimumWidth(display.getWidth());
                linearlayout.setOrientation(1);
                linearlayout.setBackgroundColor(that.getIntegerProperty("backgroundColor", 0xff000000));
                linearlayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1, 0.0F));
                linearlayout.setBackgroundResource(that.splashscreen);
                splashDialog = new Dialog(that, 0x1030010);
                if ((getWindow().getAttributes().flags & 0x400) == 1024)
                {
                    splashDialog.getWindow().setFlags(1024, 1024);
                }
                splashDialog.setContentView(linearlayout);
                splashDialog.setCancelable(false);
                splashDialog.show();
                (new Handler()).postDelayed(new Runnable() {

                    final _cls5 this$1;

                    public void run()
                    {
                        removeSplashScreen();
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                }, time);
            }

            
            {
                this$0 = DroidGap.this;
                that = droidgap1;
                time = i;
                super();
            }
        });
    }

    public void showWebPage(String s, boolean flag, boolean flag1, HashMap hashmap)
    {
        if (appView != null)
        {
            appView.showWebPage(s, flag, flag1, hashmap);
        }
    }

    public void spinnerStart(String s, String s1)
    {
        if (spinnerDialog != null)
        {
            spinnerDialog.dismiss();
            spinnerDialog = null;
        }
        spinnerDialog = ProgressDialog.show(this, s, s1, true, true, new android.content.DialogInterface.OnCancelListener() {

            final DroidGap this$0;
            final DroidGap val$me;

            public void onCancel(DialogInterface dialoginterface)
            {
                me.spinnerDialog = null;
            }

            
            {
                this$0 = DroidGap.this;
                me = droidgap1;
                super();
            }
        });
    }

    public void spinnerStop()
    {
        if (spinnerDialog != null && spinnerDialog.isShowing())
        {
            spinnerDialog.dismiss();
            spinnerDialog = null;
        }
    }

    public void startActivityForResult(CordovaPlugin cordovaplugin, Intent intent, int i)
    {
        activityResultCallback = cordovaplugin;
        activityResultKeepRunning = keepRunning;
        if (cordovaplugin != null)
        {
            keepRunning = false;
        }
        super.startActivityForResult(intent, i);
    }

}
