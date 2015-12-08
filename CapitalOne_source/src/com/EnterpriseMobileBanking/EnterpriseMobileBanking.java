// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.Html;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.EnterpriseMobileBanking.Plugins.AndroidLocaleJSI;
import com.EnterpriseMobileBanking.Plugins.BusyJSI;
import com.EnterpriseMobileBanking.Plugins.COFBusy;
import com.EnterpriseMobileBanking.Plugins.COFBusyIndicator;
import com.EnterpriseMobileBanking.Plugins.Components.AppHeader;
import com.EnterpriseMobileBanking.Plugins.Components.AppWebView;
import com.EnterpriseMobileBanking.Plugins.Components.MenuAdapter;
import com.EnterpriseMobileBanking.Plugins.Components.MenuItem;
import com.EnterpriseMobileBanking.Plugins.Components.SwipeCover;
import com.EnterpriseMobileBanking.Plugins.Components.TransiteWebView;
import com.EnterpriseMobileBanking.Plugins.Components.WebViewClient;
import com.EnterpriseMobileBanking.Plugins.NativeCache;
import com.EnterpriseMobileBanking.Plugins.NotificationPlugin;
import com.EnterpriseMobileBanking.Plugins.QuickNavJSI;
import com.EnterpriseMobileBanking.Plugins.WebViewLinker;
import com.EnterpriseMobileBanking.Utils.Log;
import com.EnterpriseMobileBanking.Utils.MenuCallbackTask;
import com.EnterpriseMobileBanking.Utils.MenuItemSingleton;
import com.EnterpriseMobileBanking.Utils.WebViewHelper;
import com.capitalone.mobile.banking.app.Application;
import com.capitalone.mobile.banking.session.SessionManager;
import com.worklight.androidgap.WLDroidGap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.cordova.CordovaChromeClient;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewClient;
import org.apache.cordova.DroidGap;
import org.apache.cordova.api.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.EnterpriseMobileBanking:
//            AppHelper, AppViewClient, AppRelContainer, AsyncServiceCallTask, 
//            ContactUsHelper, ScreenReceiver, AppHeaderTouchHandler

public class EnterpriseMobileBanking extends WLDroidGap
    implements android.view.View.OnKeyListener
{

    public static final int CAPITALONE_360_LOB = 0x7f080081;
    public static final int CAPITALONE_BANK_LOB = 0x7f080080;
    public static final int CAPITALONE_CARD_LOB = 0x7f08007f;
    private static final String CARD_LOGIN_URL = "www/cards/login";
    private static String COF_ATM_URI = "COF.html#www/atm";
    private static String COF_LOGIN_RDC_URI;
    private static String TAG = "EnterpriseMobileBanking";
    private static final int TRANSITION_DURATION = 500;
    private static ArrayAdapter adapter = null;
    private static Animation anims[] = new Animation[2];
    private static boolean authenticated = false;
    private static final String carpetActions[][];
    private static int coverMargin = 0;
    private static boolean created = false;
    private static boolean disableback = false;
    private static boolean isThirdPartyTimer = false;
    private static MenuItem lastItem = null;
    private static int lobRow[] = {
        0x7f08007f, 0x7f080080, 0x7f080081
    };
    private static List menuItems = new ArrayList();
    private static ListView menuList = null;
    private static QuickNavJSI navjsi = null;
    private static AlertDialog notFound = null;
    private static ArrayList quickNavButtons = new ArrayList();
    private static WebViewLinker theWebViewLinker;
    private Runnable accRunner;
    private Runnable closeLOBs;
    private ProgressDialog hangOnDialog;
    private boolean hasContactUsBeenInitialized;
    private String lastCarpet;
    private int lastLob;
    private AppHeader mAppHeader;
    private boolean mSplashSuppress;
    private String maskedUserName;
    private String nextCarpet;
    public android.view.View.OnClickListener onQuickClick;
    private String patternValue;

    public EnterpriseMobileBanking()
    {
        lastCarpet = null;
        nextCarpet = null;
        hangOnDialog = null;
        accRunner = null;
        maskedUserName = "";
        patternValue = "";
        mSplashSuppress = false;
        lastLob = 0;
        closeLOBs = new Runnable() {

            final EnterpriseMobileBanking this$0;

            public void run()
            {
                if (EnterpriseMobileBanking.coverMargin == 0)
                {
                    EnterpriseMobileBanking.coverMargin = findViewById(0x7f08007f).findViewById(0x7f080099).getLeft();
                    Log.d(EnterpriseMobileBanking.TAG, (new StringBuilder()).append("Cover: ").append(EnterpriseMobileBanking.coverMargin).toString());
                    int ai[] = EnterpriseMobileBanking.lobRow;
                    int j = ai.length;
                    for (int i = 0; i < j; i++)
                    {
                        int k = ai[i];
                        ((SwipeCover)findViewById(k).findViewById(0x7f080097)).setScrollStart(EnterpriseMobileBanking.coverMargin);
                    }

                }
                ((android.widget.RelativeLayout.LayoutParams)findViewById(0x7f080023).getLayoutParams()).width = (int)(240F * AppHelper.getDensity());
                findViewById(0x7f080023).requestLayout();
                View view = findViewById(0x7f080024);
                view.post(view. new Runnable() {

                    final _cls1 this$1;
                    final View val$relContainer;

                    public void run()
                    {
                        relContainer.setOnTouchListener(new AppHeaderTouchHandler(findViewById(0x7f080023).getWidth(), mAppHeader.getNavButton()));
                    }

            
            {
                this$1 = final__pcls1;
                relContainer = View.this;
                super();
            }
                });
                AppHelper.removeSplash();
            }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                super();
            }
        };
        onQuickClick = new android.view.View.OnClickListener() {

            final EnterpriseMobileBanking this$0;

            public void onClick(View view)
            {
                Log.d(EnterpriseMobileBanking.TAG, (new StringBuilder()).append("Clicked a quick nav: ").append(view.getId()).toString());
                ((SwipeCover)findViewById(0x7f080097)).resetLast();
                ((SwipeCover)findViewById(0x7f080097)).resetScroll();
                findViewById(0x7f08009d).setVisibility(8);
                ((TextView)findViewById(0x7f08001f)).setText("");
                findViewById(0x7f0800a2).setVisibility(8);
                switch (view.getId())
                {
                default:
                    return;

                case 2131230843: 
                    findViewById(0x7f08009d).setVisibility(0);
                    switchATM(findViewById(0x7f08009e), true, true, null);
                    return;

                case 2131230844: 
                    switchProducts(true);
                    return;

                case 2131230845: 
                    switchContactUs();
                    break;
                }
            }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                super();
            }
        };
        hasContactUsBeenInitialized = false;
    }

    private void addJSInterfaces(CordovaWebView cordovawebview)
    {
        cordovawebview.addJavascriptInterface(navjsi, AppHelper.getAppString(0x7f0900fe));
        cordovawebview.addJavascriptInterface(new BusyJSI(), AppHelper.getAppString(0x7f0900ff));
        cordovawebview.addJavascriptInterface(AndroidLocaleJSI.getInstance(), "_androidLocale");
    }

    public static void addMenuItem(JSONObject jsonobject)
    {
        menuList.post(new Runnable(jsonobject) {

            final JSONObject val$value;

            public void run()
            {
                MenuItem menuitem = new MenuItem(value);
                MenuItemSingleton.getInstance().addMenuItem(menuitem);
                EnterpriseMobileBanking.adapter.add(menuitem);
                if (menuitem.getImage() != null && (menuitem.getImage().startsWith(AppHelper.getAppString(0x7f090103)) || menuitem.getText().startsWith(AppHelper.getAppString(0x7f0900fd))))
                {
                    EnterpriseMobileBanking.lastItem = menuitem;
                    menuitem.setSelected(true);
                }
            }

            
            {
                value = jsonobject;
                super();
            }
        });
    }

    public static void clearAllMenuItems()
    {
        menuList.post(new Runnable() {

            public void run()
            {
                MenuCallbackTask.clearLastMenu();
                EnterpriseMobileBanking.menuItems.clear();
                EnterpriseMobileBanking.adapter.notifyDataSetChanged();
            }

        });
    }

    private void configureWebView(CordovaWebView cordovawebview, CordovaWebViewClient cordovawebviewclient)
    {
        Log.d(TAG, "configureWebView()");
        cordovawebview.setWebChromeClient(new CordovaChromeClient(this) {

            final EnterpriseMobileBanking this$0;

            public boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
            {
                String s3 = s;
                if (TextUtils.equals(s2, "gap_poll:"))
                {
                    s3 = s;
                    if (TextUtils.isEmpty(s))
                    {
                        s3 = "file:///";
                        Log.w(EnterpriseMobileBanking.TAG, (new StringBuilder()).append("URL FIX APPLIED in onJsPrompt with defaultValue:  ").append(s2).append(" and url:  ").append("file:///").append(" and message:  ").append(s1).toString());
                    }
                }
                return super.onJsPrompt(webview, s3, s1, s2, jspromptresult);
            }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                super(cordovainterface);
            }
        });
        cordovawebview.setWebViewClient(cordovawebviewclient);
        cordovawebviewclient.setWebView(cordovawebview);
        cordovawebview.setInitialScale(0);
        cordovawebview.setVerticalScrollBarEnabled(false);
        cordovawebview.requestFocusFromTouch();
        cordovawebviewclient = cordovawebview.getSettings();
        cordovawebviewclient.setJavaScriptEnabled(true);
        cordovawebviewclient.setJavaScriptCanOpenWindowsAutomatically(true);
        cordovawebviewclient.setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm.NORMAL);
        cordovawebviewclient.setDatabaseEnabled(true);
        cordovawebviewclient.setDatabasePath(getApplicationContext().getDir(AppHelper.getAppString(0x7f0900fc), 0).getPath());
        cordovawebviewclient.setDomStorageEnabled(true);
        cordovawebviewclient.setGeolocationEnabled(true);
        cancelLoadUrl = false;
        bindBrowser(cordovawebview, true);
        addJSInterfaces(cordovawebview);
    }

    private void finishOnCreate()
    {
        TransiteWebView transitewebview = AppHelper.getTransiteView();
        configureWebView(appView, new AppViewClient(this, appView));
        mAppHeader = (AppHeader)findViewById(0x7f080026);
        mAppHeader.setOnNavOptionClick(new android.view.View.OnClickListener() {

            final EnterpriseMobileBanking this$0;

            public void onClick(View view)
            {
                handleNavigation(view);
            }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                super();
            }
        });
        mAppHeader.setOnGlobalButtonClick(new android.view.View.OnClickListener() {

            final EnterpriseMobileBanking this$0;

            public void onClick(View view)
            {
                if (AppHelper.isCanadianApp())
                {
                    if (AppHelper.isAuthenticated())
                    {
                        sendJavascript("window.location.hash='www/cards/accounts';");
                        return;
                    } else
                    {
                        sendJavascript("window.location.hash='www/cards/login';");
                        return;
                    }
                } else
                {
                    returnToHome(view);
                    return;
                }
            }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                super();
            }
        });
        lastCarpet = getString(0x7f0900a1);
        String s = getString(0x7f090100);
        String s1 = NativeCache.staticRead(getString(0x7f090107), getString(0x7f090109));
        if (getString(0x7f090108).equals(s1))
        {
            s = getString(0x7f090101);
        }
        super.loadUrl((new StringBuilder()).append(getWebUrl()).append(s).toString());
        transitewebview.setWebChromeClient(new WebChromeClient() {

            final EnterpriseMobileBanking this$0;

            public void onGeolocationPermissionsShowPrompt(String s2, android.webkit.GeolocationPermissions.Callback callback)
            {
                callback.invoke(s2, true, false);
            }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                super();
            }
        });
        theWebViewLinker = new WebViewLinker();
        transitewebview.setWebViewClient(new WebViewClient(theWebViewLinker));
        setupMenuList();
        setupHomePage();
        resetTransiteView();
        root.post(new Runnable() {

            final EnterpriseMobileBanking this$0;

            public void run()
            {
                if (AndroidLocaleJSI.getCountryCode().equalsIgnoreCase("CA"))
                {
                    ((AppHeader)findViewById(0x7f080026)).buryNavButton();
                    findViewById(0x7f0800ae).setVisibility(8);
                }
                accRunner.run();
                AppHelper.setupKeyboardListener();
            }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                super();
            }
        });
        Log.d(TAG, "Finished finishOnCreate...");
    }

    public static boolean getAuthenticated()
    {
        return authenticated;
    }

    private String getEulaFilename()
    {
label0:
        {
            String s = "eula.html";
            if (AppHelper.isCanadianApp())
            {
                if (!Locale.getDefault().getLanguage().equalsIgnoreCase("FR"))
                {
                    break label0;
                }
                s = "eula_frca.html";
            }
            return s;
        }
        return "eula_enca.html";
    }

    private SwipeCover getScrollParent(View view)
    {
        View view1;
        do
        {
            view1 = (View)view.getParent();
            if (view1.getId() == 0x7f08007f || view1.getId() == 0x7f080080)
            {
                break;
            }
            view = view1;
        } while (view1.getId() != 0x7f080081);
        return (SwipeCover)(SwipeCover)view1.findViewById(0x7f080097);
    }

    public static boolean getThirdPartyTimerFlag()
    {
        return isThirdPartyTimer;
    }

    public static WebViewLinker getWebViewLinker()
    {
        return theWebViewLinker;
    }

    private boolean handleBackPressed(boolean flag)
    {
        Log.d(TAG, (new StringBuilder()).append("disableback is ").append(disableback).toString());
        if (disableback) goto _L2; else goto _L1
_L1:
        boolean flag3;
        disableback = true;
        (new Thread(new Runnable() {

            final EnterpriseMobileBanking this$0;

            public void run()
            {
                try
                {
                    Thread.sleep(500L);
                    EnterpriseMobileBanking.disableback = false;
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    EnterpriseMobileBanking.disableback = false;
                }
            }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                super();
            }
        })).start();
        Log.v(TAG, (new StringBuilder()).append("handleBackPressed() - on Back: is Menu Open: ").append(AppHelper.showingMenu()).toString());
        if (AppHelper.showingMenu() || AppHelper.keyboardShowing())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (!flag3) goto _L4; else goto _L3
_L3:
        AppHelper.hideMenu();
        AppHelper.hideKeyboard();
_L5:
        if (flag)
        {
            onBackFixMenuSelection();
        }
        return flag3;
_L4:
        boolean flag4 = true;
        Object obj = (WebView)findViewById(0x7f0800a1);
        ((WebView) (obj)).setContentDescription(getString(0x7f090132));
        if (findViewById(0x7f0800a2).getVisibility() == 0 && lastLob != 0)
        {
            Log.d(TAG, "Hiding contact view!");
            findViewById(0x7f0800a2).setVisibility(8);
            if (appView.getUrl().contains("www/cards/login"))
            {
                obj = appView.getUrl().substring(0, appView.getUrl().indexOf("www/cards/login") + "www/cards/login".length());
                appView.loadUrl(((String) (obj)));
                flag3 = flag4;
            } else
            {
                appView.clearView();
                appView.reload();
                flag3 = flag4;
            }
        } else
        if (findViewById(0x7f0800a2).getVisibility() == 0 || findViewById(0x7f08009d).getVisibility() == 0 && findViewById(0x7f08009f).isSelected())
        {
            Log.v(TAG, "contact us or atm back");
            if (((WebView) (obj)).canGoBack())
            {
                ((WebView) (obj)).setTag(Boolean.valueOf(true));
                switchATM(findViewById(0x7f08009f), true, true, null);
                flag3 = flag4;
            } else
            {
                Log.d(TAG, "contactus or atm Returning Home!");
                returnToHome(findViewById(0x7f080021));
                flag3 = flag4;
            }
        } else
        if (findViewById(0x7f08009c).getVisibility() == 0)
        {
            finish();
            flag3 = flag4;
        } else
        if (((WebView) (obj)).getVisibility() == 0)
        {
            Log.v(TAG, "transite is visible");
            String s = AppHelper.getProductsUri();
            boolean flag5 = getString(0x7f0900a2).equals(((WebView) (obj)).getUrl());
            boolean flag2 = false;
            boolean flag1 = flag2;
            if (((WebView) (obj)).getUrl() != null)
            {
                flag1 = flag2;
                if (((WebView) (obj)).getUrl().contains(AppHelper.getAppString(0x7f0900ee)))
                {
                    flag1 = true;
                }
            }
            if (s.equals(((WebView) (obj)).getUrl()) || flag5 || flag1)
            {
                Log.v(TAG, "products is visible");
                if (flag1)
                {
                    if (lastLob == 0)
                    {
                        flag3 = true;
                    } else
                    {
                        flag3 = false;
                    }
                    switchProducts(flag3);
                    flag3 = flag4;
                } else
                if (lastLob == 0)
                {
                    Log.d(TAG, "products Returning Home!");
                    returnToHome(findViewById(0x7f080021));
                    flag3 = flag4;
                } else
                if (!((WebView) (obj)).canGoBack())
                {
                    Log.v(TAG, "products CANNOT go back");
                    resetTransiteView();
                    appView.setVisibility(0);
                    if (!authenticated)
                    {
                        appView.clearView();
                        appView.reload();
                    }
                    flag3 = flag4;
                    if (lastLob == 0x7f080081)
                    {
                        flag3 = flag4;
                        if (!flag5)
                        {
                            sendJavascript("window.plugins.webView.back();");
                            flag3 = flag4;
                        }
                    }
                } else
                {
                    Log.v(TAG, "products can go back");
                    ((WebView) (obj)).goBack();
                    flag3 = flag4;
                }
            } else
            {
                int i = WebViewClient.findUrlIndexFromTopOfStack(((WebView) (obj)), s);
                if (i > -1)
                {
                    Log.v(TAG, "in 360 Products");
                    ((WebView) (obj)).goBack();
                    flag3 = flag4;
                    if (lastLob != 0)
                    {
                        flag3 = flag4;
                        if (i == 1)
                        {
                            hideBackButton();
                            flag3 = flag4;
                        }
                    }
                } else
                {
                    flag3 = flag4;
                    if (lastLob == 0x7f080081)
                    {
                        Log.v(TAG, "360 products not visible, going back with plugin");
                        if (flag && (mAppHeader.getNavOption() == 0 && ((WebView) (obj)).getUrl().contains("debitTabRender") || mAppHeader.getNavOption() == 0 && ((WebView) (obj)).getUrl().contains("coafPaymentConfirmation")))
                        {
                            ((WebView) (obj)).clearHistory();
                        }
                        if (i == -2)
                        {
                            ((WebView) (obj)).clearHistory();
                            sendJavascript("Ext.dispatch({ controller : 'LoginController', action : 'index' });");
                            flag3 = flag4;
                        } else
                        {
                            sendJavascript("window.plugins.webView.back();");
                            flag3 = flag4;
                        }
                    }
                }
            }
        } else
        if (!flag)
        {
            Log.d(TAG, "sending software goBack");
            sendJavascript("goBack();");
            flag3 = flag4;
        } else
        {
            Log.v(TAG, "handling hardware back");
            if (!AndroidLocaleJSI.getInstance().skipLanding())
            {
                sendJavascript("androidBackFunc();");
                flag3 = flag4;
            } else
            if (appView.canGoBack())
            {
                sendJavascript("androidBackFunc();");
                flag3 = flag4;
            } else
            {
                finish();
                flag3 = flag4;
            }
        }
        if (true) goto _L5; else goto _L2
_L2:
        return true;
    }

    private void handleIntentUri()
    {
        Object obj = getIntent();
        if (obj == null) goto _L2; else goto _L1
_L1:
        Log.d(TAG, (new StringBuilder()).append("Intent DataXX: ").append(((Intent) (obj)).getDataString()).toString());
        obj = ((Intent) (obj)).getData().getFragment();
        Log.d(TAG, (new StringBuilder()).append("Fragment: ").append(((String) (obj))).toString());
        if (obj == null) goto _L4; else goto _L3
_L3:
        int i = 0x7f08007f;
        if (!"bank".equalsIgnoreCase(((String) (obj)))) goto _L6; else goto _L5
_L5:
        i = 0x7f080080;
_L7:
        Log.d(TAG, (new StringBuilder()).append("Loading: ").append(i).toString());
        handleLob(findViewById(i).findViewById(0x7f080099));
_L4:
        return;
_L6:
        if ("360".equalsIgnoreCase(((String) (obj))))
        {
            i = 0x7f080081;
        }
        if (true) goto _L7; else goto _L2
_L2:
        Log.d(TAG, "Intent was NULL!");
        return;
    }

    private void handleNavigationSideMenu(View view)
    {
        AppRelContainer apprelcontainer;
        int i = 1;
        boolean flag = false;
        Log.d(TAG, "handleNavigationSideMenu!");
        if (adapter.getCount() == 0)
        {
            return;
        }
        if (((MenuItem)adapter.getItem(0)).getText().equals("unloaded"))
        {
            Log.d(TAG, "****** MENU DATA IS UNLOADED");
            return;
        }
        AppHelper.setNavigationEnabled(false);
        apprelcontainer = (AppRelContainer)findViewById(0x7f080024);
        Animation aanimation[];
        Animation animation;
        boolean flag1;
        if (apprelcontainer.getLeft() == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        aanimation = anims;
        if (flag1)
        {
            i = 0;
        }
        animation = aanimation[i];
        i = ((flag) ? 1 : 0);
        if (flag1)
        {
            i = 240;
        }
        AppHelper.setLastMovement(i);
        AppHelper.supressClick(flag1);
        AppHelper.hideKeyboard();
        if (getCurrentFocus() != null)
        {
            getCurrentFocus().clearFocus();
        }
        apprelcontainer;
        JVM INSTR monitorenter ;
        findViewById(0x7f080023).setVisibility(0);
        apprelcontainer.startAnimation(animation);
        apprelcontainer.wait(animation.getDuration() + 100L);
_L1:
        apprelcontainer;
        JVM INSTR monitorexit ;
        view.postDelayed(new Runnable() {

            final EnterpriseMobileBanking this$0;

            public void run()
            {
                AppHelper.setNavigationEnabled(true);
            }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                super();
            }
        }, 500L);
        return;
        InterruptedException interruptedexception;
        interruptedexception;
        interruptedexception.printStackTrace();
          goto _L1
        view;
        apprelcontainer;
        JVM INSTR monitorexit ;
        throw view;
    }

    private void handleNotFound()
    {
        if (notFound == null)
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
            builder.setTitle(0x7f09008d);
            builder.setMessage(0x7f0900f8);
            builder.setCancelable(true);
            builder.setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

                final EnterpriseMobileBanking this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    EnterpriseMobileBanking.notFound.cancel();
                }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                super();
            }
            });
            notFound = builder.create();
        }
        notFound.show();
    }

    private void initConfigParameters()
    {
        if (!NativeCache.contains("SP_CONFIG_DETLA_HOURS"))
        {
            Resources resources = getResources();
            NativeCache.staticWrite("SP_CONTACT_CAP1_US_PHONE", resources.getString(0x7f0900e5));
            NativeCache.staticWrite("SP_CONTACT_CAP1_NON_US_PHONE", resources.getString(0x7f0900e6));
            NativeCache.staticWrite("SP_CONTACT_CAP1_TWITTER", resources.getString(0x7f0900e7));
            NativeCache.staticWrite("SP_CONTACT_CAP1_FACEBOOK", resources.getString(0x7f0900e8));
            NativeCache.staticWrite("SP_CONTACT_360_US_PHONE", resources.getString(0x7f0900e9));
            NativeCache.staticWrite("SP_CONTACT_360_EMAIL", resources.getString(0x7f0900ea));
            NativeCache.staticWrite("SP_CONTACT_360_TWITTER", resources.getString(0x7f0900eb));
            NativeCache.staticWrite("SP_CONTACT_360_FACEBOOK", resources.getString(0x7f0900ec));
            NativeCache.staticWrite("SP_CONFIG_DETLA_HOURS", resources.getInteger(0x7f0b0000));
            NativeCache.staticWrite("SP_ATM_CAP360_ATM_LOCATOR", resources.getString(0x7f0900ed));
            NativeCache.staticWrite("SP_URL_OPEN_OUTSIDE", resources.getString(0x7f0900f1));
            String s = (new StringBuilder()).append(resources.getString(0x7f0900ef)).append(resources.getString(0x7f0900ee)).toString();
            NativeCache.staticWrite("SP_PRODUCTS_360_PRODUCTS_URL", s);
            NativeCache.staticWrite("SP_PRODUCTS_360_PRODUCTS_AUTH_URL", s);
            NativeCache.staticWrite("SP_PRODUCTS_BRANCH_URL", resources.getString(0x7f0900f0));
        }
        long l = NativeCache.staticRead("SP_CONFIG_LAST_UPDATED_MILLIS", 0L);
        boolean flag = true;
        if (l != 0L)
        {
            flag = false;
            if (Math.abs(AppHelper.hoursDiff(new Date(l), Calendar.getInstance().getTime())) >= NativeCache.staticRead("SP_CONFIG_DETLA_HOURS", 0))
            {
                flag = true;
            }
        }
        Log.v(TAG, (new StringBuilder()).append("makeCall: ").append(flag).toString());
        if (flag)
        {
            AsyncServiceCallTask asyncservicecalltask = new AsyncServiceCallTask(0, this);
            Log.v(TAG, "executing call");
            asyncservicecalltask.execute(new Void[0]);
            Log.v(TAG, "executed call");
        }
    }

    private void initEula()
    {
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(getAssets().open(getEulaFilename()), "UTF-8"));
        String s = "";
_L2:
        String s1 = bufferedreader.readLine();
        if (s1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s = (new StringBuilder()).append(s).append(s1).toString();
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            ((TextView)findViewById(0x7f08005f)).setText(Html.fromHtml(s), android.widget.TextView.BufferType.SPANNABLE);
        }
        catch (Exception exception)
        {
            finish();
        }
        findViewById(0x7f0800a3).setVisibility(0);
        finishOnCreate();
        ((Button)findViewById(0x7f08005d)).setOnClickListener(new android.view.View.OnClickListener() {

            final EnterpriseMobileBanking this$0;

            public void onClick(View view)
            {
                NativeCache.staticWrite("SP_EULA_IS_ACCEPTED_VERSION", AppHelper.appVersion());
                view = findViewById(0x7f0800a3);
                view.setVisibility(8);
                ((ViewManager)view.getParent()).removeView(view);
            }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                super();
            }
        });
        return;
    }

    public static boolean isCreated()
    {
        return created;
    }

    private void obliterate()
    {
        getPreferences(0).edit().remove("appInstallTime").remove("cof_appInstallTime").commit();
    }

    private void onBackFixMenuSelection()
    {
        WebView webview;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (findViewById(0x7f0800a2).getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        webview = (WebView)(WebView)findViewById(0x7f0800a1);
        if (webview.getVisibility() == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (findViewById(0x7f0800a0).getVisibility() == 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag && !flag1 && !flag2)
        {
            setSelectedMenuItem(0x7f090123);
            return;
        }
        if (flag1 && webview.getUrl().toLowerCase(Locale.US).contains(getString(0x7f090105)))
        {
            setSelectedMenuItem(0x7f090124);
            return;
        }
        if (flag2 && !flag && !flag1 && appView.getUrl().toLowerCase(Locale.US).contains("atm"))
        {
            setSelectedMenuItem(0x7f090122);
            return;
        } else
        {
            setLastItem(null);
            return;
        }
    }

    private void resetHeader()
    {
        resetHeader(false);
    }

    private void resetHeader(boolean flag)
    {
        if (flag)
        {
            mAppHeader.setBackgroundResource(0x7f0200aa);
            mAppHeader.setNavButtonColor(com.EnterpriseMobileBanking.Plugins.Components.AppHeader.HeaderButtonColors.RED);
            ((Button)findViewById(0x7f0800af)).setBackgroundResource(0x7f020122);
            return;
        } else
        {
            mAppHeader.setBackgroundResource(0x7f0200a9);
            mAppHeader.setNavButtonColor(com.EnterpriseMobileBanking.Plugins.Components.AppHeader.HeaderButtonColors.BLUE);
            ((Button)findViewById(0x7f0800af)).setBackgroundResource(0x7f020121);
            return;
        }
    }

    public static void setAuthenticated(boolean flag)
    {
        authenticated = flag;
        int i;
        if (AppHelper.isCanadianApp())
        {
            if (flag)
            {
                ((AppHeader)AppHelper.findAppViewById(0x7f080026)).showNavButton();
            } else
            {
                ((AppHeader)AppHelper.findAppViewById(0x7f080026)).buryNavButton();
            }
        }
        if (!flag)
        {
            AppHelper.hideConfirm();
            NotificationPlugin.closeAllDialogs();
        }
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        AppHelper.changeSignOut(i);
    }

    public static void setSelectedMenuItem(String s)
    {
        if (s != null)
        {
            boolean flag;
            if (s.length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            AppHelper.runOnUiThread(new Runnable(flag, s) {

                final boolean val$makeSelection;
                final String val$menuItemId;

                public void run()
                {
                    for (Iterator iterator = EnterpriseMobileBanking.menuItems.iterator(); iterator.hasNext();)
                    {
                        MenuItem menuitem = (MenuItem)iterator.next();
                        if (makeSelection && menuItemId.equalsIgnoreCase(menuitem.getId()))
                        {
                            Log.i(EnterpriseMobileBanking.TAG, (new StringBuilder()).append("Selecting menuItem with id = ").append(menuitem.getId()).toString());
                            if (EnterpriseMobileBanking.lastItem != null)
                            {
                                EnterpriseMobileBanking.lastItem.setSelected(false);
                            }
                            menuitem.setSelected(true);
                            EnterpriseMobileBanking.lastItem = menuitem;
                        } else
                        {
                            menuitem.setSelected(false);
                        }
                    }

                    EnterpriseMobileBanking.adapter.notifyDataSetChanged();
                }

            
            {
                makeSelection = flag;
                menuItemId = s;
                super();
            }
            });
        }
    }

    public static void setThirdPartyTimer(boolean flag)
    {
        isThirdPartyTimer = flag;
    }

    private void setupHomePage()
    {
        int ai[] = new int[3];
        int[] _tmp = ai;
        ai[0] = 0x7f0800c0;
        ai[1] = 0x7f0800c1;
        ai[2] = 0x7f0800c2;
        int ai1[] = new int[3];
        int[] _tmp1 = ai1;
        ai1[0] = 0x7f0900a6;
        ai1[1] = 0x7f0900a7;
        ai1[2] = 0x7f0900a8;
        int ai2[] = new int[3];
        int[] _tmp2 = ai2;
        ai2[0] = 0;
        ai2[1] = 0;
        ai2[2] = 0x7f0900a9;
        int ai9[] = {
            0x7f0200c5, 0x7f0200c8, 0x7f0200c3
        };
        int ai10[] = {
            0x7f0200c6, 0x7f0200c4, 0x7f0200c3
        };
        int ai11[] = {
            0x7f0200c0, 0x7f0200c4, 0x7f0200c7
        };
        int ai6[] = {
            0x7f0900ad, 0x7f0900ae, 0x7f0900af
        };
        int ai7[] = {
            0x7f0900b0, 0x7f0900b1, 0x7f0900b2
        };
        int ai8[] = {
            0x7f0900b3, 0x7f0900b4, 0x7f0900b5
        };
        int ai3[][] = new int[3][];
        ai3[0] = (new int[] {
            0, 0, 0
        });
        ai3[1] = (new int[] {
            0x7f09013b, 0x7f09013e, 0
        });
        ai3[2] = (new int[] {
            0x7f09013c, 0, 0x7f09013d
        });
        findViewById(0x7f08007b).setOnClickListener(onQuickClick);
        findViewById(0x7f08007d).setOnClickListener(onQuickClick);
        findViewById(0x7f08007c).setOnClickListener(onQuickClick);
        int ai4[] = new int[3];
        int[] _tmp3 = ai4;
        ai4[0] = 0x7f08007b;
        ai4[1] = 0x7f08007c;
        ai4[2] = 0x7f08007d;
        int ai5[] = new int[3];
        int[] _tmp4 = ai5;
        ai5[0] = 0x7f0900aa;
        ai5[1] = 0x7f0900ab;
        ai5[2] = 0x7f0900ac;
        String s2 = getString(0x7f090127);
        String s = s2;
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            s = (new StringBuilder()).append(s2).append(" ").append(getString(0x7f09012e)).toString();
        }
        findViewById(0x7f080021).setContentDescription(s);
        for (int i = 0; i < lobRow.length; i++)
        {
            final View lob = findViewById(lobRow[i]);
            ((ImageView)findViewById(ai4[i]).findViewById(0x7f080083)).setImageResource((new int[] {
                0x7f0200be, 0x7f0200a8, 0x7f0200bd
            })[i]);
            ((TextView)findViewById(ai4[i]).findViewById(0x7f080084)).setText(getString(ai5[i]));
            ((TextView)findViewById(ai4[i]).findViewById(0x7f080084)).setContentDescription((new StringBuilder()).append(getString(ai5[i])).append(" ").append(getString(0x7f09012e)).toString());
            ((ImageView)lob.findViewById(0x7f0800c4)).setImageResource((new int[] {
                0x7f0200cd, 0x7f0200ce, 0x7f0200ca
            })[i]);
            ((ImageView)lob.findViewById(0x7f0800c3)).setFocusable(false);
            ((ImageView)lob.findViewById(0x7f0800c3)).setFocusableInTouchMode(false);
            ((ImageView)lob.findViewById(0x7f0800c3)).setContentDescription((new StringBuilder()).append(getString(ai1[i]).replace(getString(0x7f09008f), getString(0x7f090090))).append(" ").append(getString(0x7f09012b)).append(" ").append(getString(0x7f09012e)).toString());
            ((TextView)lob.findViewById(0x7f0800c7)).setText(getString(ai1[i]));
            ((TextView)lob.findViewById(0x7f0800c7)).setContentDescription((new StringBuilder()).append(getString(ai1[i]).replace(getString(0x7f09008f), getString(0x7f090090))).append(" ").append(getString(0x7f09012e)).toString());
            int ai12[];
            int ai13[];
            String as[];
            int j;
            if (ai2[i] != 0)
            {
                ((TextView)lob.findViewById(0x7f0800c8)).setText(getString(ai2[i]));
                ((TextView)lob.findViewById(0x7f0800c8)).setContentDescription(getString(0x7f090134));
                ((TextView)lob.findViewById(0x7f0800c8)).setVisibility(0);
            } else
            {
                ((TextView)lob.findViewById(0x7f0800c8)).setVisibility(8);
            }
            lob.findViewById(0x7f080099).setTag(Integer.valueOf(lobRow[i]));
            ai12 = (new int[][] {
                ai9, ai10, ai11
            })[i];
            ai13 = (new int[][] {
                ai6, ai7, ai8
            })[i];
            as = carpetActions[i];
            j = 0;
            while (j < ai12.length) 
            {
                Log.d(TAG, (new StringBuilder()).append("Setting: ").append(i).append(" -- Image: ").append(j).append(" to ").append(Integer.toString(ai12[j], 16)).toString());
                View view = lob.findViewById(ai[j]);
                ((ImageView)view.findViewById(0x7f080083)).setImageResource(ai12[j]);
                StringBuilder stringbuilder = new StringBuilder();
                String s1;
                if (ai3[i][j] == 0)
                {
                    s1 = getString(ai13[j]);
                } else
                {
                    s1 = getString(ai3[i][j]);
                }
                s1 = stringbuilder.append(s1).append(" ").append(getString(0x7f09012e)).toString();
                ((TextView)view.findViewById(0x7f080084)).setContentDescription(getString(0x7f090132));
                ((TextView)view.findViewById(0x7f080084)).setTag(Html.fromHtml(s1));
                ((TextView)view.findViewById(0x7f080084)).setText(Html.fromHtml(getString(ai13[j])));
                ((ImageView)view.findViewById(0x7f080083)).setFocusable(false);
                ((TextView)view.findViewById(0x7f080084)).setFocusable(false);
                ((ImageView)view.findViewById(0x7f080083)).setFocusableInTouchMode(false);
                ((TextView)view.findViewById(0x7f080084)).setFocusableInTouchMode(false);
                lob.findViewById(ai[j]).setTag(as[j]);
                j++;
            }
            lob.postDelayed(new Runnable() {

                final EnterpriseMobileBanking this$0;
                final View val$lob;

                public void run()
                {
                    View view1 = lob.findViewById(0x7f080098);
                    android.view.ViewGroup.LayoutParams layoutparams = view1.getLayoutParams();
                    layoutparams.width = lob.findViewById(0x7f0800be).getWidth();
                    view1.setLayoutParams(layoutparams);
                    view1 = lob.findViewById(0x7f080099);
                    layoutparams = view1.getLayoutParams();
                    layoutparams.width = lob.getWidth();
                    view1.setLayoutParams(layoutparams);
                    EnterpriseMobileBanking.coverMargin = 0;
                    lob.invalidate();
                    lob.post(closeLOBs);
                }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                lob = view;
                super();
            }
            }, 1L);
        }

        accRunner = new Runnable() {

            boolean skipShow;
            final EnterpriseMobileBanking this$0;
            final View unauth;

            public void run()
            {
                if (hangOnDialog.isShowing() || findViewById(0x7f0800a3) != null)
                {
                    unauth.postDelayed(this, 100L);
                    return;
                }
                if (!unauth.isShown() && !skipShow)
                {
                    if (AndroidLocaleJSI.getInstance().skipLanding() || getIntent() != null && getIntent().getData() != null)
                    {
                        skipShow = true;
                    } else
                    {
                        unauth.setVisibility(0);
                        findViewById(0x7f08007e).setVisibility(0);
                    }
                    unauth.postDelayed(this, 200L);
                    return;
                }
                if (AndroidLocaleJSI.getInstance().skipLanding())
                {
                    handleLob(findViewById(0x7f08007f).findViewById(0x7f080099));
                } else
                if (getIntent() != null && getIntent().getData() != null)
                {
                    handleIntentUri();
                    skipShow = false;
                } else
                {
                    unauth.sendAccessibilityEvent(8);
                }
                setIntent(new Intent());
            }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                super();
                unauth = findViewById(0x7f08007a);
                skipShow = false;
            }
        };
    }

    private void setupMenuList()
    {
        menuList = (ListView)findViewById(0x7f0800b0);
        adapter = new MenuAdapter(getBaseContext(), getLayoutInflater(), menuItems);
        menuList.setAdapter(adapter);
        menuList.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final EnterpriseMobileBanking this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (MenuItem)EnterpriseMobileBanking.menuItems.get(i);
                Log.v(EnterpriseMobileBanking.TAG, (new StringBuilder()).append("MenuList - Found: ").append(adapterview.getText()).append(" -- with Action: ").append(adapterview.getAction()).toString());
                if (adapterview.getAction().length() > 0)
                {
                    findViewById(0x7f0800a2).setVisibility(8);
                    if (!AppHelper.handleNative(adapterview.getAction()))
                    {
                        Log.v(EnterpriseMobileBanking.TAG, "MORE AFTER handleNative");
                        handleNavigation(mAppHeader.getNavButton());
                        setLastItem(adapterview);
                        view = adapterview.getAction().replace("javascript:", "");
                        Log.v(EnterpriseMobileBanking.TAG, (new StringBuilder()).append("sending: ").append(view).toString());
                        sendJavascript(view);
                    }
                    if (adapterview.getAction().startsWith(getString(0x7f090102)))
                    {
                        setLastItem(adapterview);
                    }
                }
            }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                super();
            }
        });
        AppHelper.setSignOut(false);
    }

    private void solidify()
    {
        NativeCache.staticWrite("cof_appInstallTime", AppHelper.appVersion());
    }

    private void switchContactUs()
    {
        findViewById(0x7f080039).setVisibility(0);
        findViewById(0x7f08003d).setVisibility(0);
        findViewById(0x7f080045).setVisibility(0);
        findViewById(0x7f080024).setVisibility(0);
        findViewById(0x7f08009c).setVisibility(8);
        initializeContactUs();
        showBackButton();
        findViewById(0x7f0800a2).setVisibility(0);
    }

    public void carpetClick(final View v)
    {
        Log.d(TAG, "Clicked on a carpet!");
        getScrollParent(v).resetScroll();
        getScrollParent(v).resetLast();
        v.post(new Runnable() {

            final EnterpriseMobileBanking this$0;
            final View val$v;

            public void run()
            {
                lastCarpet = (String)v.getTag();
                handleLobHelper(getScrollParent(v).findViewById(0x7f080099));
            }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                v = view;
                super();
            }
        });
    }

    public void clearLastCarpet()
    {
        lastCarpet = null;
    }

    public void dialNumber(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        Log.d(TAG, (new StringBuilder()).append("Clicked a number link: ").append(s).toString());
        s = new Intent("android.intent.action.DIAL", Uri.parse(s));
        s.setFlags(0x10000000);
        startActivity(s);
        return;
        s;
        handleNotFound();
        return;
    }

    public AppHeader getAppHeader()
    {
        return mAppHeader;
    }

    public WebView getAppView()
    {
        return appView;
    }

    public String getLastCarpet()
    {
        return lastCarpet;
    }

    public int getLastLob()
    {
        return lastLob;
    }

    public String getMaskedUserName()
    {
        return maskedUserName;
    }

    public List getMenuItems()
    {
        return menuItems;
    }

    public String getPatternValue()
    {
        return patternValue;
    }

    public void handleLob(View view)
    {
        clearLastCarpet();
        handleLobHelper(view);
    }

    public void handleLobHelper(View view)
    {
        if (findViewById(0x7f0800a3) != null) goto _L2; else goto _L1
_L1:
        final SwipeCover cover;
        Log.v(TAG, (new StringBuilder()).append("in handleLob: ").append(view.toString()).toString());
        findViewById(0x7f08009d).setVisibility(8);
        findViewById(0x7f0800a1).setVisibility(8);
        cover = getScrollParent(view);
        if (cover == null || cover.getScrollX() != 0) goto _L4; else goto _L3
_L3:
        cover.resetScroll();
_L2:
        return;
_L4:
        if (cover.resetLast()) goto _L2; else goto _L5
_L5:
        lastLob = ((Integer)view.getTag()).intValue();
        view = "";
        Log.v(TAG, (new StringBuilder()).append("lastLob: ").append(lastLob).toString());
        lastLob;
        JVM INSTR tableswitch 2131230847 2131230849: default 168
    //                   2131230847 372
    //                   2131230848 420
    //                   2131230849 468;
           goto _L6 _L7 _L8 _L9
_L6:
        hideBackButton();
        Log.v(TAG, (new StringBuilder()).append("lastCarpet:").append(lastCarpet).toString());
        if (nextCarpet != null)
        {
            lastCarpet = nextCarpet;
        }
        nextCarpet = null;
        if (lastCarpet == null)
        {
            int i = -1;
            int ai[];
            int j;
            int k;
            do
            {
                k = lastLob;
                ai = lobRow;
                j = i + 1;
                i = j;
            } while (k != ai[j]);
            lastCarpet = carpetActions[j][0];
        }
        mAppHeader.setText(view);
        ((TextView)findViewById(0x7f0800ae)).setText(view);
        Log.v(TAG, (new StringBuilder()).append("lastLOB: ").append(lastLob).toString());
        super.loadUrl((new StringBuilder()).append(getWebUrl()).append(getString(0x7f090100)).toString());
        AppHelper.showRelContainer();
        cover.post(new Runnable() {

            final EnterpriseMobileBanking this$0;
            final SwipeCover val$cover;

            public void run()
            {
                cover.clearLast();
            }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                cover = swipecover;
                super();
            }
        });
        return;
_L7:
        Log.v(TAG, "setting card lob");
        clearAllMenuItems();
        NativeCache.staticWrite(getString(0x7f090107), getString(0x7f090108));
        view = getResources().getString(0x7f0900a3);
        resetHeader();
        continue; /* Loop/switch isn't completed */
_L8:
        Log.v(TAG, "setting bank lob");
        clearAllMenuItems();
        NativeCache.staticWrite(getString(0x7f090107), getString(0x7f090108));
        view = getResources().getString(0x7f0900a4);
        resetHeader();
        continue; /* Loop/switch isn't completed */
_L9:
        Log.v(TAG, "setting 360 lob");
        view = getResources().getString(0x7f0900a5);
        resetHeader(true);
        if (true) goto _L6; else goto _L10
_L10:
    }

    public void handleNavigation(View view)
    {
        Log.v(TAG, (new StringBuilder()).append("in handleNavigation: view ").append(view.getId()).toString());
        if (mAppHeader.hasBack())
        {
            handleBackPressed(false);
            return;
        } else
        {
            handleNavigationSideMenu(view);
            return;
        }
    }

    public void hideBackButton()
    {
        mAppHeader.setNavOption(0);
    }

    public void initializeContactUs()
    {
        if (!hasContactUsBeenInitialized)
        {
            ContactUsHelper.getInstance(this).initContactUs();
            hasContactUsBeenInitialized = true;
        }
    }

    public boolean isSplashSuppress()
    {
        return mSplashSuppress;
    }

    protected JSONObject loadMobileConfig(String s, Context context)
    {
        Object obj1;
        Object obj2;
        obj2 = null;
        context = null;
        obj1 = null;
        Object obj = new FileInputStream(new File(s));
        context = new byte[((InputStream) (obj)).available()];
        ((InputStream) (obj)).read(context);
        ((InputStream) (obj)).close();
        context = new String(context);
        Log.d(TAG, (new StringBuilder()).append("loadMobileConfig: ").append(context).toString());
        context = new JSONObject(context);
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e(TAG, (new StringBuilder()).append("Error closing: ").append(s).append(" : ").append(obj).toString());
                return context;
            }
        }
_L2:
        return context;
        context;
        obj = obj1;
        obj1 = context;
_L5:
        context = ((Context) (obj));
        Log.e(TAG, (new StringBuilder()).append("Error reading config file ").append(s).append(" : ").append(obj1).toString());
        context = obj2;
        if (obj == null) goto _L2; else goto _L1
_L1:
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e(TAG, (new StringBuilder()).append("Error closing: ").append(s).append(" : ").append(context).toString());
            return null;
        }
        return null;
        obj;
_L4:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e(TAG, (new StringBuilder()).append("Error closing: ").append(s).append(" : ").append(context).toString());
            }
        }
        throw obj;
        obj1;
        context = ((Context) (obj));
        obj = obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
          goto _L5
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        Log.d(TAG, (new StringBuilder()).append("EMB onActivityResult(requestCode=").append(i).append(", resultCode=").append(j).append(")").toString());
        if (i == 1234 && j != 0)
        {
            if (intent.getStringExtra("mypattern") != null)
            {
                Log.d(TAG, "EMB mypattern is not null");
                setPatternValue(intent.getStringExtra("mypattern"));
            }
            if (intent.getStringExtra("maskedUserName") != null)
            {
                Log.d(TAG, "EMB maskedUserName is not null");
                setMaskedUserName(intent.getStringExtra("maskedUserName"));
            }
            setSplashSuppress(true);
        }
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        appView.getRootView().setVisibility(4);
        appView.postDelayed(new Runnable() , 1000L);
    }

    public void onClickCallNumber(View view)
    {
        view = ((View) (view.getTag()));
        if (view != null)
        {
            dialNumber((String)view);
        }
    }

    public void onClickEmail(View view)
    {
        Intent intent;
        view = ((View) (view.getTag()));
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        view = (String)view;
        Log.d(TAG, (new StringBuilder()).append("Clicked an email link: ").append(view).toString());
        intent = new Intent("android.intent.action.SEND", Uri.parse(view));
        intent.setType(getString(0x7f090104));
        intent.putExtra("android.intent.extra.EMAIL", new String[] {
            view
        });
        intent.putExtra("android.intent.extra.SUBJECT", "");
        intent.putExtra("android.intent.extra.TEXT", "");
        intent.setFlags(0x10000000);
        startActivity(intent);
        return;
        view;
        handleNotFound();
        return;
    }

    public void onClickSocialLink(View view)
    {
        view = ((View) (view.getTag()));
        if (view == null) goto _L2; else goto _L1
_L1:
        view = (String)view;
        Log.d(TAG, (new StringBuilder()).append("Clicked a social link: ").append(view).toString());
        if (view == null) goto _L2; else goto _L3
_L3:
        String s;
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject(view);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            view.printStackTrace();
            Log.e(TAG, "Tag is not JSON data!");
            return;
        }
        view = jsonobject.optString("app", null);
        s = jsonobject.optString("web", null);
        if (view != null || s != null) goto _L5; else goto _L4
_L4:
        Log.e(TAG, "Invalid tag found on click!");
_L2:
        return;
_L5:
        Object obj;
        boolean flag;
        flag = false;
        obj = null;
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        view = new Intent("android.intent.action.VIEW", Uri.parse(view));
        view.setFlags(0x10000000);
        startActivity(view);
_L6:
        for (flag = true; flag || s == null;)
        {
            break MISSING_BLOCK_LABEL_184;
        }

        view = new Intent("android.intent.action.VIEW", Uri.parse(s));
        view.setFlags(0x10000000);
        startActivity(view);
        flag = true;
_L7:
        if (!flag)
        {
            handleNotFound();
            return;
        }
          goto _L2
        view;
        view = obj;
_L9:
        flag = false;
          goto _L6
        view;
_L8:
        flag = false;
          goto _L7
        view;
          goto _L8
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
          goto _L9
        view = null;
          goto _L6
    }

    public boolean onContextItemSelected(android.view.MenuItem menuitem)
    {
        return ContactUsHelper.getInstance(this).onContextItemSelected(menuitem);
    }

    public void onCreate(Bundle bundle)
    {
        setRequestedOrientation(1);
        AppHelper.setApplicationLink(this);
        Object obj;
        int i;
        final boolean firstTime;
        if ((getApplicationInfo().flags & 2) != 0)
        {
            firstTime = true;
        } else
        {
            firstTime = false;
        }
        Log.setDebug(firstTime);
        if (AppHelper.isNewApp() || !NativeCache.contains("cof_appInstallTime") || !NativeCache.staticRead("cof_appInstallTime", "").equalsIgnoreCase(AppHelper.appVersion()))
        {
            firstTime = true;
        } else
        {
            firstTime = false;
        }
        if (firstTime)
        {
            obliterate();
        }
        obj = new Thread(new Runnable() {

            final EnterpriseMobileBanking this$0;
            final boolean val$firstTime;

            public void run()
            {
                Looper.prepare();
                Looper looper = Looper.myLooper();
                hangOnDialog = new ProgressDialog(getContext());
                hangOnDialog.setIndeterminate(true);
                hangOnDialog.setCancelable(false);
                hangOnDialog.setCanceledOnTouchOutside(false);
                ProgressDialog progressdialog = hangOnDialog;
                EnterpriseMobileBanking enterprisemobilebanking = EnterpriseMobileBanking.this;
                int j;
                if (firstTime)
                {
                    j = 0x7f0900fa;
                } else
                {
                    j = 0x7f0900f9;
                }
                progressdialog.setMessage(enterprisemobilebanking.getString(j));
                hangOnDialog.show();
                Looper.loop();
                looper.quit();
            }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                firstTime = flag;
                super();
            }
        });
        anims[0] = AnimationUtils.loadAnimation(getApplicationContext(), 0x7f040005);
        anims[1] = AnimationUtils.loadAnimation(getApplicationContext(), 0x7f040006);
        ((Thread) (obj)).start();
        obj = new IntentFilter("android.intent.action.SCREEN_ON");
        ((IntentFilter) (obj)).addAction("android.intent.action.SCREEN_OFF");
        registerReceiver(new ScreenReceiver(), ((IntentFilter) (obj)));
        onCreate(bundle);
        initConfigParameters();
        ((ViewManager)root.getParent()).removeView(root);
        setContentView(0x7f030013);
        navjsi = new QuickNavJSI(quickNavButtons);
        root = (LinearLayout)findViewById(0x7f08009b);
        appView = (CordovaWebView)findViewById(0x7f0800a0);
        addJSInterfaces(appView);
        appView.setContentDescription(getString(0x7f090132));
        if (!NativeCache.staticRead("SP_EULA_IS_ACCEPTED_VERSION", "").equals(AppHelper.appVersion()))
        {
            initEula();
        } else
        {
            finishOnCreate();
            bundle = findViewById(0x7f0800a3);
            ((ViewManager)bundle.getParent()).removeView(bundle);
        }
        created = true;
        solidify();
        i = android.provider.Settings.System.getInt(getContentResolver(), "always_finish_activities", 0);
        Log.d(TAG, (new StringBuilder()).append("ALWAYS_FINISH_ACTIVITIES IS: ").append(i).toString());
        if (i != 0)
        {
            (new Builder(this)).setMessage(0x7f09014f).setPositiveButton(0x7f090150, new android.content.DialogInterface.OnClickListener() {

                final EnterpriseMobileBanking this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    Log.d(EnterpriseMobileBanking.TAG, "Taking user to developer settings page.");
                    dialoginterface = new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
                    dialoginterface.setFlags(0x40000000);
                    startActivity(dialoginterface);
                }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                super();
            }
            }).setNegativeButton(0x7f090151, new android.content.DialogInterface.OnClickListener() {

                final EnterpriseMobileBanking this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    Log.d(EnterpriseMobileBanking.TAG, "User selected to close the application rather than disabling the required developer option.");
                    dialoginterface = new Intent("android.intent.action.MAIN");
                    dialoginterface.addCategory("android.intent.category.HOME");
                    dialoginterface.setFlags(0x4000000);
                    startActivity(dialoginterface);
                }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                super();
            }
            }).setCancelable(false).show();
        }
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        onCreateContextMenu(contextmenu, view, contextmenuinfo);
        ContactUsHelper.getInstance(this).onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return true;
    }

    public void onGripperClick(final View v)
    {
        final SwipeCover cover = getScrollParent(v);
        cover.post(new Runnable() {

            final EnterpriseMobileBanking this$0;
            final SwipeCover val$cover;
            final View val$v;

            public void run()
            {
                v.setPressed(false);
                cover.resetLast();
                if (cover.getScrollX() == 0)
                {
                    ImageView imageview = (ImageView)v;
                    String s = (String)imageview.getContentDescription();
                    if (s.contains(getString(0x7f0900a3)))
                    {
                        imageview.setContentDescription(getString(0x7f090135));
                    } else
                    if (s.contains(getString(0x7f0900a4)))
                    {
                        imageview.setContentDescription(getString(0x7f090136));
                    } else
                    {
                        imageview.setContentDescription(getString(0x7f090137));
                    }
                    cover.resetScroll();
                    return;
                }
                ImageView imageview1 = (ImageView)v;
                String s1 = (String)imageview1.getContentDescription();
                if (s1.contains(getString(0x7f0900a3)))
                {
                    imageview1.setContentDescription(getString(0x7f090138));
                } else
                if (s1.contains(getString(0x7f0900a4)))
                {
                    imageview1.setContentDescription(getString(0x7f090139));
                } else
                {
                    imageview1.setContentDescription(getString(0x7f09013a));
                }
                cover.openScroll();
            }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                v = view;
                cover = swipecover;
                super();
            }
        });
    }

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        Log.d(TAG, "onKey");
        boolean flag;
        boolean flag1;
        if (i == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (flag)
        {
            flag1 = handleBackPressed(true);
        }
        return flag1;
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        Log.d(TAG, "onKeyDown");
        boolean flag1 = false;
        boolean flag;
        if (i == 82 && keyevent.getRepeatCount() == 0 && mAppHeader.hasMenu() && findViewById(0x7f080024) != null && findViewById(0x7f080024).getVisibility() == 0)
        {
            handleNavigation(mAppHeader.getNavButton());
            flag = true;
        } else
        {
            flag = flag1;
            if (i == 4)
            {
                flag = flag1;
                if (keyevent.getRepeatCount() == 0)
                {
                    boolean flag2 = true;
                    flag = flag2;
                    if (!((AppRelContainer)findViewById(0x7f080024)).isAnimating())
                    {
                        handleBackPressed(true);
                        flag = flag2;
                    }
                }
            }
        }
        if (flag)
        {
            return flag;
        } else
        {
            return onKeyDown(i, keyevent);
        }
    }

    protected void onNewIntent(Intent intent)
    {
        onNewIntent(intent);
        setIntent(intent);
        accRunner.run();
    }

    public void onPause()
    {
        ((AppWebView)AppHelper.getAppView()).setmAppWebViewDisplayBlocked(true);
        mAppHeader.setAppHeaderDisabled(true);
        SessionManager sessionmanager = ((Application)getApplication()).getSessionManager();
        if (sessionmanager != null && ScreenReceiver.getScreenFlag() && sessionmanager.isTimeoutScheduled())
        {
            Log.d(TAG, "Display off...");
            sessionmanager.saveTime();
        }
        onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        return true;
    }

    public void onReceivedError(int i, String s, String s1)
    {
        final String errorUrl;
        Log.e(TAG, (new StringBuilder()).append("ERROR: ").append(i).append(": ").append(s).append("(").append(s1).append(")").toString());
        errorUrl = getStringProperty("errorUrl", null);
        if (errorUrl == null || !errorUrl.startsWith("file://") && !isUrlWhiteListed(errorUrl) || s1.equals(errorUrl)) goto _L2; else goto _L1
_L1:
        runOnUiThread(new Runnable() );
_L4:
        return;
_L2:
        errorUrl = AppHelper.getURLAttributes(WebViewClient.getTrimedUrl(s1));
        if (errorUrl == null)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        Log.d(TAG, (new StringBuilder()).append("************** attr.getMode() ").append(errorUrl.getMode()).append(" *********************").toString());
        if (errorUrl.getMode().equals("quiet"))
        {
            Log.d(TAG, (new StringBuilder()).append("QUIET MODE DETECTED - NO REPORTING: ").append(i).append(": ").append(s).append("(").append(s1).append(")").toString());
            return;
        }
        if (!errorUrl.getMode().equals("rewards"))
        {
            continue; /* Loop/switch isn't completed */
        }
        errorUrl;
        JVM INSTR monitorenter ;
        errorUrl.setTimedOut(true);
        errorUrl.cancelTimer();
        errorUrl;
        JVM INSTR monitorexit ;
        errorUrl.handleError();
        return;
        s;
        errorUrl;
        JVM INSTR monitorexit ;
        throw s;
        boolean flag = false;
        if (s1 != null)
        {
            flag = s1.endsWith("preload.aspx");
        }
        if (flag)
        {
            Log.d(TAG, (new StringBuilder()).append("ERROR: Rewards preload detected: ").append(i).append(": ").append(s).append("(").append(s1).append(")").toString());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onResume()
    {
        final Object splash;
        if (authenticated && !((Application)getApplication()).getSessionManager().isTimeoutScheduled() && !isThirdPartyTimer)
        {
            appView.setVisibility(8);
            appView.clearView();
            appView.loadUrl("about:blank");
            if (getIntent().getExtras() == null || getIntent().getBooleanExtra("cof.flag_return_to_login", false))
            {
                sendJavascript("app.returnToLogin('', 'timeout');");
                getIntent().removeExtra("cof.flag_return_to_login");
            }
            appView.setVisibility(0);
        } else
        {
            splash = ((Application)getApplication()).getSessionManager();
            Log.d(TAG, (new StringBuilder()).append("Onresume: isTimeoutScheduled: ").append(((SessionManager) (splash)).isTimeoutScheduled()).toString());
            if (splash != null && authenticated && ((SessionManager) (splash)).isTimeoutScheduled() && !isThirdPartyTimer)
            {
                Log.d(TAG, "Display back on...");
                ((SessionManager) (splash)).restartTimer();
            }
        }
        splash = findViewById(0x7f080013);
        if (!isSplashSuppress())
        {
            ((View) (splash)).postDelayed(new Runnable() {

                final EnterpriseMobileBanking this$0;
                final View val$splash;

                public void run()
                {
                    splash.setVisibility(8);
                }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                splash = view;
                super();
            }
            }, 1000L);
        } else
        {
            ((View) (splash)).setVisibility(8);
            setSplashSuppress(false);
        }
        if (lastLob == 0)
        {
            for (int i = 0; i < lobRow.length; i++)
            {
                splash = findViewById(lobRow[i]);
                ((View) (splash)).postDelayed(new Runnable() {

                    final EnterpriseMobileBanking this$0;
                    final View val$lob;

                    public void run()
                    {
                        View view = lob.findViewById(0x7f080098);
                        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
                        layoutparams.width = lob.findViewById(0x7f0800be).getWidth();
                        view.setLayoutParams(layoutparams);
                        view = lob.findViewById(0x7f080099);
                        layoutparams = view.getLayoutParams();
                        layoutparams.width = lob.getWidth();
                        view.setLayoutParams(layoutparams);
                        EnterpriseMobileBanking.coverMargin = 0;
                        lob.invalidate();
                        lob.post(closeLOBs);
                    }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                lob = view;
                super();
            }
                }, 1L);
            }

        }
        if (((AppWebView)AppHelper.getAppView()).ismAppWebViewDisplayBlocked())
        {
            mAppHeader.postDelayed(new Runnable() {

                final EnterpriseMobileBanking this$0;

                public void run()
                {
                    ((AppWebView)AppHelper.getAppView()).setmAppWebViewDisplayBlocked(false);
                    if (mAppHeader.isAppHeaderDisabled())
                    {
                        mAppHeader.setAppHeaderDisabled(false);
                    }
                }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                super();
            }
            }, 1750L);
        }
        onResume();
        mAppHeader.postDelayed(new Runnable() {

            final EnterpriseMobileBanking this$0;

            public void run()
            {
                COFBusy cofbusy = COFBusyIndicator.getBusy();
                if (cofbusy != null && !EnterpriseMobileBanking.authenticated)
                {
                    cofbusy.forceHide();
                }
            }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                super();
            }
        }, 9000L);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        onSaveInstanceState(bundle);
        bundle.putLong("param", 0xffffffffdeadbeefL);
    }

    public void onSignOut(View view)
    {
        if (((AppRelContainer)findViewById(0x7f080024)).getLeft() != 0)
        {
            handleNavigation(view);
        }
        sendJavascript("lobDidRequestLogout();");
    }

    protected void onStop()
    {
        findViewById(0x7f080013).setVisibility(0);
        onStop();
    }

    public void resetTransiteView()
    {
        findViewById(0x7f0800a1).setVisibility(8);
        ((WebView)findViewById(0x7f0800a1)).loadUrl(getString(0x7f0900a2));
        findViewById(0x7f0800a1).setTag(Boolean.valueOf(true));
        findViewById(0x7f0800a1).setContentDescription(getString(0x7f090132));
    }

    public void returnToHome(View view)
    {
        if (authenticated)
        {
            AppHelper.promptForLogout("", "");
            return;
        }
        root.post(accRunner);
        Log.v(TAG, "returnToHome");
        appView.stopLoading();
        appView.clearView();
        lastLob = 0;
        lastCarpet = null;
        if (view != null)
        {
            AppHelper.setNavigationEnabled(false);
        }
        cancelLoadUrl();
        loadUrl(getString(0x7f0900a2));
        AppHelper.sendJavascript("busyIndicator.hide();");
        AppHelper.hideKeyboard();
        closeLOBs.run();
        findViewById(0x7f08009d).setVisibility(8);
        findViewById(0x7f0800a2).setVisibility(8);
        resetTransiteView();
        findViewById(0x7f080024).setVisibility(8);
        findViewById(0x7f08009c).setVisibility(0);
        if (view != null)
        {
            view.postDelayed(new Runnable() {

                final EnterpriseMobileBanking this$0;

                public void run()
                {
                    AppHelper.setNavigationEnabled(true);
                }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                super();
            }
            }, 1000L);
        }
        hideBackButton();
        resetHeader();
        setLastItem(null);
        BusyJSI.forceHide();
    }

    public void sendJavascript(String s)
    {
        if (s.contains(getString(0x7f090106)))
        {
            int i = s.indexOf("'") + 1;
            String s1 = s.substring(i, s.indexOf("'", i));
            Log.v(TAG, (new StringBuilder()).append("Hash: ").append(s1).toString());
            if (appView.getUrl().contains(s1))
            {
                AppHelper.getTransiteView().setVisibility(8);
            }
        }
        sendJavascript(s);
    }

    public void setLastItem(final MenuItem item)
    {
        runOnUiThread(new Runnable() {

            final EnterpriseMobileBanking this$0;
            final MenuItem val$item;

            public void run()
            {
                if (EnterpriseMobileBanking.lastItem != null)
                {
                    EnterpriseMobileBanking.lastItem.setSelected(false);
                    Log.d(EnterpriseMobileBanking.TAG, "Clearing lastItem");
                }
                EnterpriseMobileBanking.lastItem = item;
                if (item != null)
                {
                    Log.d(EnterpriseMobileBanking.TAG, (new StringBuilder()).append("Setting selected: ").append(item.getText()).toString());
                    item.setSelected(true);
                }
                EnterpriseMobileBanking.adapter.notifyDataSetChanged();
            }

            
            {
                this$0 = EnterpriseMobileBanking.this;
                item = menuitem;
                super();
            }
        });
    }

    public void setMaskedUserName(String s)
    {
        maskedUserName = s;
    }

    public void setNextCarpet(String s)
    {
        nextCarpet = s;
    }

    public void setPatternValue(String s)
    {
        patternValue = s;
    }

    public void setSelectedMenuItem(int i)
    {
        setSelectedMenuItem(getResources().getString(i));
    }

    public void setSplashSuppress(boolean flag)
    {
        mSplashSuppress = flag;
    }

    public void showBackButton()
    {
        mAppHeader.setNavOption(1);
    }

    public void switchATM(View view)
    {
        Log.v(TAG, "in switchAtm");
        appView.stopLoading();
        appView.loadUrl(getString(0x7f0900a2));
        WebView webview = (WebView)findViewById(0x7f0800a1);
        webview.setContentDescription(getString(0x7f090132));
        webview.stopLoading();
        webview.loadUrl(getString(0x7f0900a2));
        switchATM(view, true, true, null);
    }

    public void switchATM(View view, boolean flag, boolean flag1, String s)
    {
        Log.v(TAG, (new StringBuilder()).append("in switchATM: showBack: ").append(flag).toString());
        boolean flag2 = false;
        View view1 = view;
        if (view == null)
        {
            view1 = findViewById(0x7f08009e);
            flag2 = true;
        }
        if (flag)
        {
            showBackButton();
        } else
        {
            hideBackButton();
        }
        findViewById(0x7f08009f).setSelected(false);
        findViewById(0x7f08009e).setSelected(false);
        view = (WebView)findViewById(0x7f0800a1);
        view.setContentDescription(getString(0x7f090132));
        view1.setSelected(true);
        appView.stopLoading();
        if (!flag1) goto _L2; else goto _L1
_L1:
        view1.getId();
        JVM INSTR tableswitch 2131230878 2131230879: default 144
    //                   2131230878 288
    //                   2131230879 191;
           goto _L3 _L4 _L5
_L3:
        findViewById(0x7f080024).setVisibility(0);
        findViewById(0x7f08009c).setVisibility(8);
        if (flag2)
        {
            findViewById(0x7f08009d).setVisibility(0);
        }
        return;
_L5:
        view.stopLoading();
        if (NativeCache.staticRead("SP_ATM_CAP360_ATM_LOCATOR", getString(0x7f0900b6)).indexOf("?") > -1)
        {
            view.loadUrl(NativeCache.staticRead("SP_ATM_CAP360_ATM_LOCATOR", getString(0x7f0900b6)));
        } else
        {
            view.loadUrl((new StringBuilder()).append(NativeCache.staticRead("SP_ATM_CAP360_ATM_LOCATOR", getString(0x7f0900b6))).append("?site_preference=MOBILE&capability_preference=CONTAINER").toString());
        }
        findViewById(0x7f0800a1).setVisibility(0);
        continue; /* Loop/switch isn't completed */
_L4:
        lastCarpet = COF_ATM_URI;
        loadUrl((new StringBuilder()).append(getWebUrl()).append(getString(0x7f090100)).toString());
        view.loadUrl(getString(0x7f0900a2));
        continue; /* Loop/switch isn't completed */
_L2:
        Log.v(TAG, (new StringBuilder()).append("sending javascript: window.location.hash='").append(s).append("';").toString());
        sendJavascript((new StringBuilder()).append("window.location.hash='").append(s).append("';").toString());
        if (true) goto _L3; else goto _L6
_L6:
    }

    public void switchProducts(boolean flag)
    {
        JSONArray jsonarray;
        JSONArray jsonarray1;
        WebView webview;
        if (flag)
        {
            showBackButton();
        } else
        {
            hideBackButton();
        }
        webview = (WebView)findViewById(0x7f0800a1);
        webview.setContentDescription(getString(0x7f090132));
        appView.stopLoading();
        jsonarray = new JSONArray();
        jsonarray1 = new JSONArray(getString(0x7f09011c));
        jsonarray = jsonarray1;
_L2:
        WebViewLinker.setOutsideAppList(jsonarray);
        AppHelper.fixupUserAgentString(webview);
        webview.loadUrl(AppHelper.getProductsUri());
        findViewById(0x7f0800a1).setVisibility(0);
        findViewById(0x7f080024).setVisibility(0);
        findViewById(0x7f08009c).setVisibility(8);
        findViewById(0x7f0800a2).setVisibility(8);
        return;
        JSONException jsonexception;
        jsonexception;
        jsonexception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        COF_LOGIN_RDC_URI = "COF.html#www/bank/login?redirect=www/bank/deposit/details.html";
        carpetActions = (new String[][] {
            new String[] {
                "COF.html#www/cards/login?redirect=www/cards/accounts", "COF.html#www/cards/login?redirect=www/cards/rewards", "COF.html#www/cards/login?redirect=www/cards/paybills/schedule"
            }, new String[] {
                "COF.html#www/bank/login?redirect=www/bank/accounts", COF_LOGIN_RDC_URI, "COF.html#www/bank/login?redirect=www/bank/paybills/payBills.html"
            }, new String[] {
                "ThreeSixty.html", "ThreeSixty.html?redCarpetDest=DepositChecks", "ThreeSixty.html?redCarpetDest=UnauthATMFinder"
            }
        });
    }



/*
    static int access$002(int i)
    {
        coverMargin = i;
        return i;
    }

*/






/*
    static String access$1302(EnterpriseMobileBanking enterprisemobilebanking, String s)
    {
        enterprisemobilebanking.lastCarpet = s;
        return s;
    }

*/





/*
    static boolean access$1702(boolean flag)
    {
        disableback = flag;
        return flag;
    }

*/







/*
    static ProgressDialog access$402(EnterpriseMobileBanking enterprisemobilebanking, ProgressDialog progressdialog)
    {
        enterprisemobilebanking.hangOnDialog = progressdialog;
        return progressdialog;
    }

*/







/*
    static MenuItem access$902(MenuItem menuitem)
    {
        lastItem = menuitem;
        return menuitem;
    }

*/
}
