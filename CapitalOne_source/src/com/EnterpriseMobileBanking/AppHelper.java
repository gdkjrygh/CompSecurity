// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;
import com.EnterpriseMobileBanking.Plugins.Components.AppHeader;
import com.EnterpriseMobileBanking.Plugins.Components.MenuItem;
import com.EnterpriseMobileBanking.Plugins.Components.TransiteWebView;
import com.EnterpriseMobileBanking.Plugins.NativeCache;
import com.EnterpriseMobileBanking.Utils.Log;
import com.EnterpriseMobileBanking.Utils.WebViewHelper;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking

public class AppHelper
{

    public static final String APP_INSTALL_TIME_KEY = "appInstallTime";
    public static final String ATM_LINK = "www/atm";
    public static final String COF_APP_INSTALL_TIME_KEY = "cof_appInstallTime";
    public static final String EXIT_ON_SKIN_LOADER = "exitOnSkinLoader";
    public static final String FALSE = "false";
    public static final String FULL_HTTP = "http://";
    public static final String FULL_HTTPS = "https://";
    private static final long HOUR_MILLIS = 0x36ee80L;
    public static final String HTTP = "http";
    public static final String HTTPS = "https";
    public static final String INPUT_STREAM_ISO = "iso-8859-1";
    private static final boolean IS_CANADIAN_APP = setCanadianPreference();
    public static final int JELLY_BEAN_VERSION_CODE = 16;
    public static final String KEYSTORE_INSTANCE = "BKS";
    public static final String LOAD_SKIN = "loadSkin";
    public static final Map LOB_START_PAGES = createMap();
    public static final String MAILTO_PREFIX = "mailto:";
    public static final String MENU = "menu";
    public static final String SP_ATM_CAP360_ATM_LOCATOR = "SP_ATM_CAP360_ATM_LOCATOR";
    public static final String SP_CONFIG_DETLA_HOURS = "SP_CONFIG_DETLA_HOURS";
    public static final String SP_CONFIG_LAST_UPDATED_MILLIS = "SP_CONFIG_LAST_UPDATED_MILLIS";
    public static final String SP_CONTACT_360_EMAIL = "SP_CONTACT_360_EMAIL";
    public static final String SP_CONTACT_360_FACEBOOK = "SP_CONTACT_360_FACEBOOK";
    public static final String SP_CONTACT_360_TWITTER = "SP_CONTACT_360_TWITTER";
    public static final String SP_CONTACT_360_US_PHONE = "SP_CONTACT_360_US_PHONE";
    public static final String SP_CONTACT_CAP1_FACEBOOK = "SP_CONTACT_CAP1_FACEBOOK";
    public static final String SP_CONTACT_CAP1_NON_US_PHONE = "SP_CONTACT_CAP1_NON_US_PHONE";
    public static final String SP_CONTACT_CAP1_TWITTER = "SP_CONTACT_CAP1_TWITTER";
    public static final String SP_CONTACT_CAP1_US_PHONE = "SP_CONTACT_CAP1_US_PHONE";
    public static final String SP_EULA_IS_ACCEPTED_VERSION = "SP_EULA_IS_ACCEPTED_VERSION";
    public static final String SP_PRODUCTS_360_PRODUCTS_AUTH_URL = "SP_PRODUCTS_360_PRODUCTS_AUTH_URL";
    public static final String SP_PRODUCTS_360_PRODUCTS_URL = "SP_PRODUCTS_360_PRODUCTS_URL";
    public static final String SP_PRODUCTS_BRANCH_URL = "SP_PRODUCTS_BRANCH_URL";
    public static final String SP_URL_OPEN_OUTSIDE = "SP_URL_OPEN_OUTSIDE";
    public static final String SSL_CTX_INSTANCE = "TLS";
    public static final String SWITCH_HOME_CONFIRM = "SWITCH_HOME_CONFIRMED";
    public static final String SWITCH_LOB_CONFIRM = "SWITCH_LOB_CONFIRMED";
    private static final String TAG = "AppHelper";
    public static final String TELEPHONE_PREFIX = "tel:";
    public static final String TRUE = "true";
    private static final String WEB_VIEW_TEXT_CLASS_NAME = "android.webkit.WebTextView";
    private static String appVersion = null;
    private static EnterpriseMobileBanking application = null;
    private static Typeface gothicFace = null;
    private static boolean isFreezeCardFlow = false;
    private static boolean keyboard = false;
    private static int lastMovement = 0;
    private static AlertDialog logout = null;
    private static Map mURLAttributeTable = Collections.synchronizedMap(new HashMap());
    private static DisplayMetrics metrics = new DisplayMetrics();
    private static float myDensity = 1.0F;
    private static Runnable updateRunnable = new Runnable() {

        public void run()
        {
            View view = AppHelper.application.findViewById(0x7f08009b);
            view.getViewTreeObserver().addOnGlobalLayoutListener(view. new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                final _cls1 this$0;
                final View val$root;

                public void onGlobalLayout()
                {
                    int i = root.getRootView().getHeight();
                    int j = root.getHeight();
                    root.postDelayed((i - j). new Runnable() {

                        final _cls1 this$1;
                        final int val$heightDiff;

                        public void run()
                        {
                            boolean flag;
                            if (heightDiff > 100)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            AppHelper.keyboard = flag;
                        }

            
            {
                this$1 = final__pcls1;
                heightDiff = I.this;
                super();
            }
                    }, 250L);
                }

            
            {
                this$0 = final__pcls1;
                root = View.this;
                super();
            }
            });
        }

    };

    public AppHelper()
    {
    }

    public static WebViewHelper addURLAttributes(String s, WebViewHelper webviewhelper)
    {
        return (WebViewHelper)mURLAttributeTable.put(s, webviewhelper);
    }

    public static String appVersion()
    {
        if (appVersion == null)
        {
            PackageManager packagemanager = application.getPackageManager();
            try
            {
                appVersion = packagemanager.getPackageInfo(application.getPackageName(), 0).versionName;
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                namenotfoundexception.printStackTrace();
            }
        }
        return appVersion;
    }

    public static void changeButtonImage(boolean flag)
    {
        ImageButton imagebutton = application.getAppHeader().getGlobalButton();
        ImageButton imagebutton1 = application.getAppHeader().getNavButton();
        if (!flag)
        {
            imagebutton.setImageResource(0x7f0200b1);
            imagebutton1.setImageResource(0x7f0200b8);
            return;
        } else
        {
            imagebutton.setImageResource(0x7f0200b0);
            imagebutton1.setImageResource(0x7f0200b7);
            return;
        }
    }

    public static void changeSignOut(int i)
    {
        runOnUiThread(new Runnable(i) {

            final int val$visibility;

            public void run()
            {
                AppHelper.application.findViewById(0x7f0800af).setVisibility(visibility);
            }

            
            {
                visibility = i;
                super();
            }
        });
    }

    private static Map createMap()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("360", "ThreeSixty.html");
        return Collections.unmodifiableMap(hashmap);
    }

    public static View findAppViewById(int i)
    {
        return findAppViewById(((Context) (application)), i);
    }

    public static View findAppViewById(Context context, int i)
    {
        return ((Activity)context).findViewById(i);
    }

    public static void fixupUserAgentString(WebView webview)
    {
        com/EnterpriseMobileBanking/AppHelper;
        JVM INSTR monitorenter ;
        if (webview == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        String s = webview.getSettings().getUserAgentString();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        if (!s.endsWith(getAppString(0x7f090117)))
        {
            webview.getSettings().setUserAgentString((new StringBuilder()).append(s).append(getAppString(0x7f090117)).toString());
        }
        com/EnterpriseMobileBanking/AppHelper;
        JVM INSTR monitorexit ;
        return;
        webview;
        throw webview;
    }

    public static void focusAppView()
    {
        application.getAppView().requestFocus();
    }

    public static void genericError(int i)
    {
        long l1 = Math.abs(i) * 100 + android.os.Build.VERSION.SDK_INT;
        long l = l1;
        if (i < 0)
        {
            l = l1 * -1L;
        }
        String s = String.format(application.getResources().getString(0x7f09014a), new Object[] {
            String.format(application.getString(0x7f090149), new Object[] {
                String.valueOf(l)
            })
        });
        application.runOnUiThread(new Runnable(s) {

            final String val$htmlError;

            public void run()
            {
                AppHelper.application.getAppView().loadData(htmlError, "text/html", "UTF-8");
            }

            
            {
                htmlError = s;
                super();
            }
        });
    }

    public static Context getAppContext()
    {
        return application.getContext();
    }

    public static String getAppString(int i)
    {
        return application.getString(i);
    }

    public static WebView getAppView()
    {
        if (application != null)
        {
            return application.getAppView();
        } else
        {
            return null;
        }
    }

    public static EnterpriseMobileBanking getApplicationLink()
    {
        return application;
    }

    public static float getDensity()
    {
        return myDensity;
    }

    public static boolean getIsFreezeCardFlow()
    {
        return isFreezeCardFlow;
    }

    public static int getLastLob()
    {
        return application.getLastLob();
    }

    public static int getLastMovement()
    {
        return lastMovement;
    }

    public static String getLobPage()
    {
        return application.getLastCarpet();
    }

    public static List getMenuItems()
    {
        return application.getMenuItems();
    }

    public static String getProductsUri()
    {
        if (application != null)
        {
            return (new StringBuilder()).append(application.getWebUrl()).append(application.getString(0x7f09011d)).toString();
        } else
        {
            return "";
        }
    }

    public static TransiteWebView getTransiteView()
    {
        return (TransiteWebView)application.findViewById(0x7f0800a1);
    }

    public static Typeface getTypeface()
    {
        return gothicFace;
    }

    public static WebViewHelper getURLAttributes(String s)
    {
        return (WebViewHelper)mURLAttributeTable.get(s);
    }

    public static boolean handleNative(String s)
    {
        byte byte0;
        boolean flag1;
        boolean flag2;
        byte0 = 8;
        flag1 = false;
        s = s.toLowerCase();
        flag2 = s.startsWith("cmd:");
        Log.d("AppHelper", (new StringBuilder()).append("handleNative: ").append(s).toString());
        if (!flag2) goto _L2; else goto _L1
_L1:
        s = s.replace("cmd:", "");
        if (!s.startsWith("switch:")) goto _L4; else goto _L3
_L3:
        String s1;
        String s2;
        boolean flag;
label0:
        {
            Log.d("AppHelper", "Switch command found");
            s2 = s.replace("switch:", "");
            s1 = NativeCache.staticRead(application.getString(0x7f0900f6));
            flag = flag1;
            if (!EnterpriseMobileBanking.getAuthenticated())
            {
                break label0;
            }
            if (s1 != null)
            {
                flag = flag1;
                if (s1.equals("1"))
                {
                    break label0;
                }
            }
            flag = true;
        }
        StringBuilder stringbuilder = (new StringBuilder()).append("authed: ").append(EnterpriseMobileBanking.getAuthenticated()).append(" -- ");
        s = s1;
        if (s1 == null)
        {
            s = "NULL";
        }
        Log.d("AppHelper", stringbuilder.append(s).toString());
        if (s2.startsWith("confirmation:"))
        {
            s = s2.replace("confirmation:", "");
            Log.d("AppHelper", (new StringBuilder()).append("Calling for confirmation: ").append(s).toString());
            switchLob("confirmSwitch", s);
        } else
        if (flag)
        {
            promptForLogout(application.getString(0x7f0900f6), s2);
        } else
        {
            Log.d("AppHelper", (new StringBuilder()).append("Going to switchLob: ").append(s2).toString());
            switchLob(s2);
        }
_L2:
        Log.v("AppHelper", (new StringBuilder()).append("isNative: ").append(flag2).toString());
        return flag2;
_L4:
label1:
        {
            if (!s.startsWith("contact:"))
            {
                continue; /* Loop/switch isn't completed */
            }
            hideMenu();
            s = s.replace("contact:", "");
            Log.d("AppHelper", (new StringBuilder()).append("Action: ").append(s).toString());
            application.initializeContactUs();
            application.findViewById(0x7f0800a2).setVisibility(0);
            application.hideBackButton();
            View view = application.findViewById(0x7f080039);
            int i;
            if (!s.equalsIgnoreCase("360") && !s.equalsIgnoreCase("threesixty"))
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
            view = application.findViewById(0x7f080045);
            if (!s.equalsIgnoreCase("360"))
            {
                i = byte0;
                if (!s.equalsIgnoreCase("threesixty"))
                {
                    break label1;
                }
            }
            i = 0;
        }
        view.setVisibility(i);
        if (true) goto _L2; else goto _L5
_L5:
    }

    public static void hideBackButton()
    {
        application.runOnUiThread(new Runnable() {

            public void run()
            {
                AppHelper.application.hideBackButton();
            }

        });
    }

    public static void hideConfirm()
    {
        if (logout != null)
        {
            logout.cancel();
            logout = null;
        }
    }

    public static void hideKeyboard()
    {
        runOnUiThread(new Runnable() {

            public void run()
            {
                WebView webview = AppHelper.getAppView();
                if (webview != null)
                {
                    View view = webview.getFocusedChild();
                    if (view != null && "android.webkit.WebTextView".equals(view.getClass().getCanonicalName()))
                    {
                        webview.removeView(view);
                    }
                }
                InputMethodManager inputmethodmanager = (InputMethodManager)AppHelper.application.getSystemService("input_method");
                if (AppHelper.application.getCurrentFocus() == null)
                {
                    if (webview != null)
                    {
                        inputmethodmanager.hideSoftInputFromWindow(webview.getRootView().getWindowToken(), 0);
                    }
                    return;
                } else
                {
                    inputmethodmanager.hideSoftInputFromWindow(AppHelper.application.getCurrentFocus().getWindowToken(), 0);
                    return;
                }
            }

        });
    }

    public static void hideMenu()
    {
        if (showingMenu())
        {
            application.runOnUiThread(new Runnable() {

                public void run()
                {
                    AppHelper.application.handleNavigation(AppHelper.application.getAppHeader().getNavButton());
                }

            });
        }
    }

    public static int hoursDiff(Date date, Date date1)
    {
        if (date == null || date1 == null)
        {
            return 0;
        } else
        {
            return (int)(date1.getTime() / 0x36ee80L - date.getTime() / 0x36ee80L);
        }
    }

    public static boolean isAuthenticated()
    {
        return EnterpriseMobileBanking.getAuthenticated();
    }

    public static boolean isCanadianApp()
    {
        return IS_CANADIAN_APP;
    }

    public static boolean isNewApp()
    {
        SharedPreferences sharedpreferences = application.getPreferences(0);
        long l;
        long l1;
        try
        {
            l = (new File(application.getPackageManager().getApplicationInfo(application.getPackageName(), 0).sourceDir)).lastModified();
            l1 = sharedpreferences.getLong("appInstallTime", 0L);
        }
        catch (Exception exception)
        {
            return true;
        }
        return l > l1;
    }

    public static boolean keyboardShowing()
    {
        return keyboard;
    }

    public static void logoutUser()
    {
        logoutUser("", "");
    }

    public static void logoutUser(String s, String s1)
    {
        Log.v("AppHelper", (new StringBuilder()).append("in logoutUser: ").append(s1).toString());
        if (s != null && !s.equals(""))
        {
            NativeCache.staticWrite(s, "1");
        }
        if (isAuthenticated())
        {
            sendJavascript((new StringBuilder()).append("lobDidDisappear( '").append(s1).append("' );").toString());
            return;
        } else
        {
            switchLobFinish(s1);
            return;
        }
    }

    public static void minimize()
    {
        application.sendJavascript("INGDirectApp.hideBusyIndicator();");
        application.moveTaskToBack(true);
    }

    public static void promptForLogout(String s, String s1)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(application);
        builder.setCancelable(true);
        builder.setTitle(0x7f0900f4);
        builder.setMessage(0x7f0900f5);
        builder.setPositiveButton(0x7f0900f6, new android.content.DialogInterface.OnClickListener(s, s1) {

            final String val$lob;
            final String val$save;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                AppHelper.logout = null;
                AppHelper.switchLob(save, lob);
            }

            
            {
                save = s;
                lob = s1;
                super();
            }
        });
        builder.setNegativeButton(0x7f0900f7, new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
                AppHelper.logout.cancel();
                AppHelper.logout = null;
            }

        });
        logout = builder.create();
        logout.show();
    }

    public static void removeSplash()
    {
    }

    public static void returnToHome()
    {
        application.runOnUiThread(new Runnable() {

            public void run()
            {
                AppHelper.application.returnToHome(null);
            }

        });
    }

    public static void runOnUiThread(Runnable runnable)
    {
        application.runOnUiThread(runnable);
    }

    public static void sendJavascript(String s)
    {
        s = (new StringBuilder()).append("(function() { try { ").append(s).append(" } catch( e ) { console.log( 'Error running: \"").append(TextUtils.htmlEncode(s)).append("\" -- ' + e ); } })()").toString();
        application.runOnUiThread(new Runnable(s) {

            final String val$js;

            public void run()
            {
                WebView webview = AppHelper.getAppView();
                if (webview != null && webview.getUrl() != null && !webview.getUrl().contains("about:blank"))
                {
                    Log.d("AppHelper", (new StringBuilder()).append("Javascript: ").append(js).toString());
                    AppHelper.application.sendJavascript(js);
                    return;
                } else
                {
                    Log.d("AppHelper", "No Target for JS!");
                    return;
                }
            }

            
            {
                js = s;
                super();
            }
        });
    }

    public static void setApplicationLink(EnterpriseMobileBanking enterprisemobilebanking)
    {
        application = enterprisemobilebanking;
        application.getWindowManager().getDefaultDisplay().getMetrics(metrics);
        Log.d("AppHelper", (new StringBuilder()).append("Density: ").append(metrics.widthPixels).toString());
        myDensity = (float)metrics.widthPixels / 320F;
        if (gothicFace == null)
        {
            gothicFace = Typeface.createFromAsset(application.getAssets(), "fonts/Trade-Gothic-LT-Bold.ttf");
        }
    }

    private static boolean setCanadianPreference()
    {
        return TextUtils.equals("canada", "us".toLowerCase());
    }

    public static void setCopyrightYear(TextView textview)
    {
        String s = textview.getText().toString();
        textview.setText((new StringBuilder()).append("\251 ").append(Calendar.getInstance().get(1)).append(s.substring(6)).toString());
    }

    public static void setIsFreezeCardFlow(boolean flag)
    {
        isFreezeCardFlow = flag;
    }

    public static void setLastItem(MenuItem menuitem)
    {
        application.setLastItem(menuitem);
    }

    public static void setLastMovement(int i)
    {
        lastMovement = i;
    }

    public static void setNavigationEnabled(boolean flag)
    {
        application.getAppHeader().getNavButton().setEnabled(flag);
        application.getAppHeader().getGlobalButton().setEnabled(flag);
        application.findViewById(0x7f080026).setEnabled(flag);
        application.findViewById(0x7f080021).setEnabled(flag);
        application.findViewById(0x7f0800a0).setEnabled(flag);
        application.findViewById(0x7f0800a1).setEnabled(flag);
        application.findViewById(0x7f080026).setClickable(flag);
        application.findViewById(0x7f080021).setClickable(flag);
        application.getAppHeader().getNavButton().setClickable(flag);
        application.getAppHeader().getGlobalButton().setClickable(flag);
    }

    public static void setSelectedMenuItem(int i)
    {
        application.setSelectedMenuItem(i);
    }

    public static void setSignOut(boolean flag)
    {
        Log.d("AppHelper", (new StringBuilder()).append("Signout: ").append(flag).toString());
        View view = application.findViewById(0x7f0800af);
        view.setEnabled(flag);
        Drawable drawable = view.getBackground();
        char c;
        if (flag)
        {
            c = '\377';
        } else
        {
            c = 'O';
        }
        drawable.setAlpha(c);
        view.postInvalidate();
    }

    public static void setupKeyboardListener()
    {
        updateRunnable.run();
    }

    public static void showBackButton()
    {
        application.runOnUiThread(new Runnable() {

            public void run()
            {
                AppHelper.application.showBackButton();
            }

        });
    }

    public static void showError(String s, String s1)
    {
        application.runOnUiThread(new Runnable(s, s1) {

            final String val$messageDialog;
            final String val$title;

            public void run()
            {
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(AppHelper.application);
                builder.setTitle(title);
                builder.setMessage(messageDialog);
                builder.setCancelable(true);
                builder.setNegativeButton("OK", new android.content.DialogInterface.OnClickListener() {

                    final _cls13 this$0;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        AppHelper.logout.cancel();
                        AppHelper.logout = null;
                    }

            
            {
                this$0 = _cls13.this;
                super();
            }
                });
                AppHelper.logout = builder.create();
                AppHelper.logout.show();
            }

            
            {
                title = s;
                messageDialog = s1;
                super();
            }
        });
    }

    public static void showRelContainer()
    {
        application.findViewById(0x7f080024).setVisibility(0);
        application.findViewById(0x7f08009c).setVisibility(8);
    }

    public static boolean showingMenu()
    {
        View view = application.findViewById(0x7f080024);
        return view.isEnabled() && view.getLeft() != 0;
    }

    public static void startActivity(Intent intent)
    {
        application.startActivity(intent);
    }

    public static void supressClick(boolean flag)
    {
        Log.d("AppHelper", (new StringBuilder()).append("Supressing: ").append(flag).toString());
        WebView webview = getAppView();
        if (webview != null)
        {
            android.view.View.OnClickListener onclicklistener;
            if (flag)
            {
                onclicklistener = new android.view.View.OnClickListener() {

                    public void onClick(View view)
                    {
                    }

                };
            } else
            {
                onclicklistener = null;
            }
            webview.setOnClickListener(onclicklistener);
        }
    }

    public static void switchATM(View view, boolean flag, boolean flag1, String s)
    {
        runOnUiThread(new Runnable(view, flag, flag1, s) {

            final boolean val$loadAsNewUrl;
            final boolean val$showBack;
            final String val$url;
            final View val$v;

            public void run()
            {
                AppHelper.application.switchATM(v, showBack, loadAsNewUrl, url);
            }

            
            {
                v = view;
                showBack = flag;
                loadAsNewUrl = flag1;
                url = s;
                super();
            }
        });
    }

    private static void switchLob(String s)
    {
        switchLob("confirmSwitch", s);
    }

    private static void switchLob(String s, String s1)
    {
        if (showingMenu())
        {
            WebView webview = getAppView();
            if (webview != null)
            {
                application.handleNavigation(webview.getRootView());
            }
        }
        Log.v("AppHelper", (new StringBuilder()).append("in SwitchLOB: ").append(s1).toString());
        logoutUser(s, s1);
    }

    public static void switchLobFinish(String s)
    {
        switchLobFinish(s, null);
    }

    public static void switchLobFinish(String s, String s1)
    {
        Log.v("AppHelper", (new StringBuilder()).append("in native.switchLobFinish: ").append(s).toString());
        application.runOnUiThread(new Runnable(s, s1) {

            final String val$actionLob;
            final String val$urlParams;

            public void run()
            {
                View view = null;
                if (actionLob.startsWith("card"))
                {
                    view = AppHelper.application.findViewById(0x7f08007f);
                } else
                if (actionLob.startsWith("bank"))
                {
                    view = AppHelper.application.findViewById(0x7f080080);
                } else
                if (actionLob.startsWith("360") || actionLob.startsWith("threesixty"))
                {
                    view = AppHelper.application.findViewById(0x7f080081);
                }
                if (view != null)
                {
                    Log.v("AppHelper", (new StringBuilder()).append("toLob not null: ").append(view.toString()).toString());
                    AppHelper.application.clearLastCarpet();
                    AppHelper.application.setNextCarpet(urlParams);
                    AppHelper.application.handleLob(view.findViewById(0x7f080099));
                    return;
                } else
                {
                    EnterpriseMobileBanking.setAuthenticated(false);
                    AppHelper.application.returnToHome(AppHelper.application.findViewById(0x7f080021));
                    return;
                }
            }

            
            {
                actionLob = s;
                urlParams = s1;
                super();
            }
        });
    }

    public static void switchProducts()
    {
        runOnUiThread(new Runnable() {

            public void run()
            {
                boolean flag;
                if (AppHelper.application.getLastLob() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                AppHelper.application.switchProducts(flag);
            }

        });
    }




/*
    static boolean access$102(boolean flag)
    {
        keyboard = flag;
        return flag;
    }

*/



/*
    static AlertDialog access$202(AlertDialog alertdialog)
    {
        logout = alertdialog;
        return alertdialog;
    }

*/

}
