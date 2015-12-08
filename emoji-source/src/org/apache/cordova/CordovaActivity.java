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
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;
import org.xwalk.core.XWalkNavigationHistory;

// Referenced classes of package org.apache.cordova:
//            CordovaInterface, CordovaWebView, PluginManager, CordovaWebViewClient, 
//            LOG, LinearLayoutSoftKeyboardDetect, CordovaPreferences, Whitelist, 
//            ConfigXmlParser, Config, CordovaChromeClient, CordovaPlugin, 
//            CordovaBridge, NativeToJsMessageQueue, AuthenticationToken

public class CordovaActivity extends Activity
    implements CordovaInterface
{

    private static int ACTIVITY_EXITING = 2;
    private static int ACTIVITY_RUNNING = 1;
    private static int ACTIVITY_STARTING = 0;
    public static String TAG = "CordovaActivity";
    protected CordovaPlugin activityResultCallback;
    protected boolean activityResultKeepRunning;
    private int activityState;
    protected CordovaWebView appView;
    protected Whitelist externalWhitelist;
    private String initCallbackClass;
    protected Whitelist internalWhitelist;
    protected boolean keepRunning;
    protected String launchUrl;
    protected int loadUrlTimeoutValue;
    protected int mCurrentOrientation;
    protected ArrayList pluginEntries;
    protected CordovaPreferences preferences;
    protected LinearLayout root;
    protected ProgressDialog spinnerDialog;
    protected Dialog splashDialog;
    protected LinearLayout splashLayout;
    protected OrientationEventListener splashOrientationListener;
    protected int splashscreen;
    protected int splashscreenTime;
    private final ExecutorService threadPool = Executors.newCachedThreadPool();
    protected CordovaWebViewClient webViewClient;

    public CordovaActivity()
    {
        spinnerDialog = null;
        activityState = 0;
        activityResultCallback = null;
        splashscreen = 0;
        splashscreenTime = 3000;
        loadUrlTimeoutValue = 20000;
        keepRunning = true;
    }

    private void toggleFullscreen(Window window)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            window.getDecorView().setSystemUiVisibility(5894);
            return;
        } else
        {
            window.setFlags(1024, 1024);
            return;
        }
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
        if (appView.getNavigationHistory() != null)
        {
            appView.getNavigationHistory().clear();
        }
    }

    protected void createViews()
    {
        LOG.d(TAG, "CordovaActivity.createViews()");
        Object obj = getWindowManager().getDefaultDisplay();
        root = new LinearLayoutSoftKeyboardDetect(this, ((Display) (obj)).getWidth(), ((Display) (obj)).getHeight());
        root.setOrientation(1);
        root.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1, 0.0F));
        appView.setId(100);
        appView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0F));
        appView.setVisibility(4);
        obj = appView.getParent();
        if (obj != null && obj != root)
        {
            LOG.d(TAG, "removing appView from existing parent");
            ((ViewGroup)obj).removeView(appView);
        }
        root.addView(appView);
        setContentView(root);
        int i = preferences.getInteger("BackgroundColor", 0xff000000);
        root.setBackgroundColor(i);
    }

    public void displayError(final String title, final String message, final String button, final boolean exit)
    {
        runOnUiThread(new Runnable() {

            final CordovaActivity this$0;
            final String val$button;
            final boolean val$exit;
            final CordovaActivity val$me;
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
                this$0 = CordovaActivity.this;
                me = cordovaactivity1;
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
        return preferences.getBoolean(s, flag);
    }

    public Context getContext()
    {
        LOG.d(TAG, "This will be deprecated December 2012");
        return this;
    }

    public double getDoubleProperty(String s, double d)
    {
        return preferences.getDouble(s, d);
    }

    public int getIntegerProperty(String s, int i)
    {
        return preferences.getInteger(s, i);
    }

    protected int getScreenOrientation()
    {
        Display display = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        if (android.os.Build.VERSION.SDK_INT < 13)
        {
            point.set(display.getWidth(), display.getHeight());
        } else
        {
            display.getSize(point);
        }
        return point.x >= point.y ? 2 : 1;
    }

    protected LinearLayout getSplashLayout()
    {
        Display display = getWindowManager().getDefaultDisplay();
        LinearLayout linearlayout = new LinearLayout(getActivity());
        linearlayout.setMinimumHeight(display.getHeight());
        linearlayout.setMinimumWidth(display.getWidth());
        linearlayout.setOrientation(1);
        linearlayout.setBackgroundColor(getIntegerProperty("backgroundColor", 0xff000000));
        linearlayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1, 0.0F));
        linearlayout.setBackgroundResource(splashscreen);
        return linearlayout;
    }

    public String getStringProperty(String s, String s1)
    {
        return preferences.getString(s, s1);
    }

    public ExecutorService getThreadPool()
    {
        return threadPool;
    }

    public void init()
    {
        init(appView, null, null);
    }

    public void init(CordovaWebView cordovawebview, CordovaWebViewClient cordovawebviewclient, CordovaChromeClient cordovachromeclient)
    {
        LOG.d(TAG, "CordovaActivity.init()");
        if (cordovawebview == null)
        {
            cordovawebview = makeWebView();
        }
        appView = cordovawebview;
        if (appView.pluginManager == null)
        {
            CordovaWebView cordovawebview1 = appView;
            if (cordovawebviewclient != null)
            {
                cordovawebview = cordovawebviewclient;
            } else
            {
                cordovawebview = makeWebViewClient(appView);
            }
            if (cordovachromeclient == null)
            {
                cordovachromeclient = makeChromeClient(appView);
            }
            cordovawebview1.init(this, cordovawebview, cordovachromeclient, pluginEntries, internalWhitelist, externalWhitelist, preferences);
        }
        if (preferences.getBoolean("DisallowOverscroll", false))
        {
            appView.setOverScrollMode(2);
        }
        createViews();
        setVolumeControlStream(3);
    }

    public boolean isUrlWhiteListed(String s)
    {
        return internalWhitelist.isUrlWhiteListed(s);
    }

    protected void loadConfig()
    {
        ConfigXmlParser configxmlparser = new ConfigXmlParser();
        configxmlparser.parse(this);
        preferences = configxmlparser.getPreferences();
        preferences.setPreferencesBundle(getIntent().getExtras());
        preferences.copyIntoIntentExtras(this);
        internalWhitelist = configxmlparser.getInternalWhitelist();
        externalWhitelist = configxmlparser.getExternalWhitelist();
        launchUrl = configxmlparser.getLaunchUrl();
        pluginEntries = configxmlparser.getPluginEntries();
        Config.parser = configxmlparser;
    }

    void loadSpinner()
    {
        String s;
        if (appView == null || appView.getNavigationHistory() == null || !appView.getNavigationHistory().canGoBack())
        {
            s = preferences.getString("LoadingDialog", null);
        } else
        {
            s = preferences.getString("LoadingPageDialog", null);
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
        splashscreenTime = preferences.getInteger("SplashScreenDelay", splashscreenTime);
        String s1 = preferences.getString("SplashScreen", null);
        if (splashscreenTime > 0 && s1 != null)
        {
            splashscreen = getResources().getIdentifier(s1, "drawable", getClass().getPackage().getName());
            if (splashscreen != 0)
            {
                showSplashScreen(splashscreenTime);
            }
        }
        keepRunning = preferences.getBoolean("KeepRunning", true);
        if (appView.getParent() != null)
        {
            loadSpinner();
        }
        if (splashscreen != 0)
        {
            appView.loadUrl(s, splashscreenTime);
            return;
        } else
        {
            appView.loadUrl(s);
            return;
        }
    }

    public void loadUrl(String s, int i)
    {
        splashscreenTime = i;
        loadUrl(s);
    }

    protected CordovaChromeClient makeChromeClient(CordovaWebView cordovawebview)
    {
        return cordovawebview.makeWebChromeClient(this);
    }

    protected CordovaWebView makeWebView()
    {
        return new CordovaWebView(this);
    }

    protected CordovaWebViewClient makeWebViewClient(CordovaWebView cordovawebview)
    {
        return cordovawebview.makeWebViewClient(this);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        LOG.d(TAG, "Incoming Result");
        super.onActivityResult(i, j, intent);
        if (appView != null)
        {
            appView.onActivityResult(i, j, intent);
        }
        Log.d(TAG, (new StringBuilder()).append("Request code = ").append(i).toString());
        if (appView == null || i != 5173) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1 = appView.getWebChromeClient().getValueCallback();
        Log.d(TAG, "did we get here?");
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        return;
_L4:
        Object obj;
        if (intent == null || j != -1)
        {
            obj = null;
        } else
        {
            obj = intent.getData();
        }
        Log.d(TAG, (new StringBuilder()).append("result = ").append(obj).toString());
        ((ValueCallback) (obj1)).onReceiveValue(obj);
_L2:
        obj1 = activityResultCallback;
        obj = obj1;
        if (obj1 == null)
        {
            obj = obj1;
            if (initCallbackClass != null)
            {
                activityResultCallback = appView.pluginManager.getPlugin(initCallbackClass);
                obj = activityResultCallback;
            }
        }
        if (obj != null)
        {
            LOG.d(TAG, "We have a callback to send this result to");
            ((CordovaPlugin) (obj)).onActivityResult(i, j, intent);
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void onCreate(Bundle bundle)
    {
        LOG.i(TAG, "Apache Cordova native platform version 3.6.3 is starting");
        LOG.d(TAG, "CordovaActivity.onCreate()");
        loadConfig();
        if (!preferences.getBoolean("ShowTitle", false))
        {
            getWindow().requestFeature(1);
        }
        if (preferences.getBoolean("SetFullscreen", false))
        {
            Log.d(TAG, "The SetFullscreen configuration is deprecated in favor of Fullscreen, and will be removed in a future version.");
            getWindow().setFlags(1024, 1024);
        } else
        if (preferences.getBoolean("Fullscreen", false))
        {
            toggleFullscreen(getWindow());
        } else
        {
            getWindow().setFlags(2048, 2048);
        }
        super.onCreate(bundle);
        if (bundle != null)
        {
            initCallbackClass = bundle.getString("callbackClass");
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        postMessage("onCreateOptionsMenu", menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy()
    {
        LOG.d(TAG, "CordovaActivity.onDestroy()");
        removeSplashScreen();
        if (appView != null)
        {
            appView.handleDestroy();
        } else
        {
            activityState = ACTIVITY_EXITING;
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (appView != null && appView.getFocusedChild() != null && (i == 4 || i == 82))
        {
            return appView.onKeyDown(i, keyevent);
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (appView != null && (appView.hasEnteredFullscreen() || appView.getFocusedChild() != null) && (i == 4 || i == 82))
        {
            return appView.onKeyUp(i, keyevent);
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public Object onMessage(String s, Object obj)
    {
        if (!"onScrollChanged".equals(s))
        {
            LOG.d(TAG, (new StringBuilder()).append("onMessage(").append(s).append(",").append(obj).append(")").toString());
        }
        if (!"splashscreen".equals(s)) goto _L2; else goto _L1
_L1:
        if (!"hide".equals(obj.toString())) goto _L4; else goto _L3
_L3:
        removeSplashScreen();
_L6:
        return null;
_L4:
        if (splashDialog == null || !splashDialog.isShowing())
        {
            s = preferences.getString("SplashScreen", null);
            if (s != null)
            {
                splashscreen = getResources().getIdentifier(s, "drawable", getClass().getPackage().getName());
            }
            showSplashScreen(splashscreenTime);
            return null;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (!"spinner".equals(s))
        {
            break; /* Loop/switch isn't completed */
        }
        if ("stop".equals(obj.toString()))
        {
            spinnerStop();
            appView.setVisibility(0);
            return null;
        }
        if (true) goto _L6; else goto _L5
_L5:
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
                return null;
            }
            return null;
        }
        if ("exit".equals(s))
        {
            endActivity();
            return null;
        }
        if (true) goto _L6; else goto _L7
_L7:
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
        final String errorUrl = preferences.getString("errorUrl", null);
        if (errorUrl != null && (errorUrl.startsWith("file://") || internalWhitelist.isUrlWhiteListed(errorUrl)) && !failingUrl.equals(errorUrl))
        {
            runOnUiThread(new Runnable() {

                final CordovaActivity this$0;
                final String val$errorUrl;
                final CordovaActivity val$me;

                public void run()
                {
                    me.spinnerStop();
                    me.appView.showWebPage(errorUrl, false, true, null);
                }

            
            {
                this$0 = CordovaActivity.this;
                me = cordovaactivity1;
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

            final CordovaActivity this$0;
            final String val$description;
            final boolean val$exit;
            final String val$failingUrl;
            final CordovaActivity val$me;

            public void run()
            {
                if (exit)
                {
                    me.appView.setVisibility(8);
                    me.displayError("Application Error", (new StringBuilder()).append(description).append(" (").append(failingUrl).append(")").toString(), "OK", exit);
                }
            }

            
            {
                this$0 = CordovaActivity.this;
                exit = flag;
                me = cordovaactivity1;
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
            getWindow().getDecorView().requestFocus();
            if (getBooleanProperty("FullScreen", false))
            {
                toggleFullscreen(getWindow());
            }
            appView.handleResume(keepRunning, activityResultKeepRunning);
            if ((!keepRunning || activityResultKeepRunning) && activityResultKeepRunning)
            {
                keepRunning = activityResultKeepRunning;
                activityResultKeepRunning = false;
                return;
            }
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (activityResultCallback != null)
        {
            bundle.putString("callbackClass", activityResultCallback.getClass().getName());
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
            splashOrientationListener.disable();
            splashOrientationListener = null;
        }
    }

    public void sendJavascript(String s)
    {
        if (appView != null)
        {
            appView.bridge.getMessageQueue().addJavaScript(s);
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
        Log.d(TAG, "Setting boolean properties in CordovaActivity will be deprecated in 3.0 on July 2013, please use config.xml");
        getIntent().putExtra(s.toLowerCase(), flag);
    }

    public void setDoubleProperty(String s, double d)
    {
        Log.d(TAG, "Setting double properties in CordovaActivity will be deprecated in 3.0 on July 2013, please use config.xml");
        getIntent().putExtra(s.toLowerCase(), d);
    }

    public void setIntegerProperty(String s, int i)
    {
        Log.d(TAG, "Setting integer properties in CordovaActivity will be deprecated in 3.0 on July 2013, please use config.xml");
        getIntent().putExtra(s.toLowerCase(), i);
    }

    public void setStringProperty(String s, String s1)
    {
        Log.d(TAG, "Setting string properties in CordovaActivity will be deprecated in 3.0 on July 2013, please use config.xml");
        getIntent().putExtra(s.toLowerCase(), s1);
    }

    protected void showSplashScreen(final int time)
    {
        runOnUiThread(new Runnable() {

            final CordovaActivity this$0;
            final CordovaActivity val$that;
            final int val$time;

            public void run()
            {
                splashLayout = getSplashLayout();
                splashDialog = new Dialog(that, 0x1030010);
                if (getBooleanProperty("FullScreen", false))
                {
                    toggleFullscreen(splashDialog.getWindow());
                }
                splashDialog.setContentView(splashLayout);
                splashDialog.setCancelable(false);
                splashDialog.show();
                mCurrentOrientation = getScreenOrientation();
                splashOrientationListener = new OrientationEventListener(that, 3) {

                    final _cls5 this$1;

                    public void onOrientationChanged(int i)
                    {
                        if (splashDialog != null && splashDialog.isShowing())
                        {
                            if ((i = getScreenOrientation()) != mCurrentOrientation)
                            {
                                splashLayout = getSplashLayout();
                                splashDialog.setContentView(splashLayout);
                                mCurrentOrientation = i;
                                return;
                            }
                        }
                    }

            
            {
                this$1 = _cls5.this;
                super(context, i);
            }
                };
                splashOrientationListener.enable();
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
                this$0 = CordovaActivity.this;
                that = cordovaactivity1;
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

            final CordovaActivity this$0;
            final CordovaActivity val$me;

            public void onCancel(DialogInterface dialoginterface)
            {
                me.spinnerDialog = null;
            }

            
            {
                this$0 = CordovaActivity.this;
                me = cordovaactivity1;
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
