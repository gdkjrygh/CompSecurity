// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.analytics.AnalyticsMain;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.ui.toast.ToastUtility;
import com.kohls.mcommerce.opal.common.util.ConfigurationUpdateObserver;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.listener.IUpdateActionBarListener;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.wl.plugin.BackButtonPlugin;
import com.kohls.mcommerce.opal.wl.plugin.NativeHybridCommPlugin;
import com.worklight.androidgap.api.WL;
import com.worklight.androidgap.api.WLActionReceiver;
import com.worklight.androidgap.api.WLInitWebFrameworkListener;
import com.worklight.androidgap.api.WLInitWebFrameworkResult;
import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginManager;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kohls.mcommerce.opal.wl:
//            HybridScreen

public class WLActivity extends CordovaActivity
    implements WLInitWebFrameworkListener, IUpdateActionBarListener, WLActionReceiver, ConfigurationUpdateObserver
{

    private static final String BACK_BUTTON_PLUGIN = "BackButtonPlugin";
    private static final String IN_ACTION_PULSE = "IN_ACTION_PULSE";
    private static final String IN_ACTION_SET_ACTIONBAR = "IN_ACTION_SET_ACTIONBAR";
    private static final String IN_ACTION_SET_ACTIONBAR_DATA_URL = "url";
    private static final String STATE_PAGE_TITLE = "pageTitle";
    private static final String STATE_SHOPPING_BAG_ICON_VISIBLE_STATUS = "bagIcon";
    private static final String TAG = com/kohls/mcommerce/opal/wl/WLActivity.getSimpleName();
    private ActionBarHelper mActionBarHelper;
    private int mBagIconVisibilityStatus;
    private String mOrderStatusOrderId;
    private String mOrderStatusPostalCode;
    private String mPageTitle;
    private HybridScreen screen;

    public WLActivity()
    {
        screen = null;
        mOrderStatusOrderId = "";
        mOrderStatusPostalCode = "";
        mPageTitle = "";
        mBagIconVisibilityStatus = 8;
    }

    private void clearwebHistory()
    {
        WL.getInstance().removeActionReceiver(this);
        if (appView != null)
        {
            appView.clearHistory();
            appView.clearCache(true);
        }
    }

    private void handleFailure()
    {
        if (!isFinishing())
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
            builder.setNegativeButton(0x7f0800c9, new android.content.DialogInterface.OnClickListener() {

                final WLActivity this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface.dismiss();
                }

            
            {
                this$0 = WLActivity.this;
                super();
            }
            });
            builder.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                final WLActivity this$0;

                public void onDismiss(DialogInterface dialoginterface)
                {
                    endActivity();
                }

            
            {
                this$0 = WLActivity.this;
                super();
            }
            });
            builder.setTitle(screen.getScreenTitle());
            builder.setMessage(0x7f080165);
            builder.setCancelable(true).create().show();
        }
    }

    private void initializeActionBar()
    {
        Logger.debug(TAG, "Initializing Action Bar");
        if (getActionBar() == null)
        {
            Logger.error(TAG, "Unable to initialize Action Bar");
            return;
        }
        if (mActionBarHelper != null)
        {
            setActionBarTitle(mPageTitle);
            setShoppingBagIconVisibility(mBagIconVisibilityStatus);
            return;
        } else
        {
            mActionBarHelper = new ActionBarHelper(this, getActionBar());
            mActionBarHelper.initActionBarWithCustomView();
            mActionBarHelper.showActionBarForHybridScreens(mPageTitle);
            mActionBarHelper.getAppImageView().setVisibility(8);
            mActionBarHelper.getTitleTextView().setVisibility(0);
            mActionBarHelper.getBackButtonView().setOnClickListener(new android.view.View.OnClickListener() {

                final WLActivity this$0;

                public void onClick(View view)
                {
                    performBackPress();
                }

            
            {
                this$0 = WLActivity.this;
                super();
            }
            });
            return;
        }
    }

    private void performBackPress()
    {
        if (appView == null)
        {
            Logger.error(TAG, "Webview is not available");
            endActivity();
            return;
        }
        HybridScreen hybridscreen = HybridScreen.getScreenFromUrl(appView.getUrl());
        if (hybridscreen != null)
        {
            if (hybridscreen.isMoveToShoppingBag())
            {
                ((BackButtonPlugin)appView.pluginManager.getPlugin("BackButtonPlugin")).reportEvent();
                return;
            }
            if (hybridscreen == HybridScreen.SHOPPINGBAG || hybridscreen == HybridScreen.EMPTY_SHOPPINGBAG || hybridscreen == HybridScreen.MY_INFORMATION || hybridscreen == HybridScreen.ORDER_HISTORY || hybridscreen == HybridScreen.NO_ORDER_DETAILS || hybridscreen == HybridScreen.INVALID_ORDER_DETAILS || hybridscreen == HybridScreen.ORDER_DETAILS && (!KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn() || !KohlsPhoneApplication.getInstance().getAuthenticationUtils().checkUserSessionValid()))
            {
                endActivity();
                return;
            }
            if (hybridscreen == HybridScreen.CONFIRMATION)
            {
                NativeHybridCommPlugin nativehybridcommplugin = new NativeHybridCommPlugin();
                try
                {
                    nativehybridcommplugin.goToHomeScreen(this);
                    return;
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                }
                Logger.error(TAG, "Unable to perform back");
                return;
            } else
            {
                performHistoryBack(appView);
                return;
            }
        } else
        {
            performHistoryBack(appView);
            return;
        }
    }

    private void performHistoryBack(CordovaWebView cordovawebview)
    {
        cordovawebview = cordovawebview.copyBackForwardList();
        if (cordovawebview.getItemAtIndex(cordovawebview.getCurrentIndex() - 1) != null)
        {
            backHistory();
            return;
        } else
        {
            endActivity();
            return;
        }
    }

    private void setShoppingBagIconVisibility(int i)
    {
        if (mActionBarHelper == null)
        {
            return;
        } else
        {
            mActionBarHelper.getItemView().setVisibility(i);
            mActionBarHelper.getItemViewCountView().setVisibility(i);
            mBagIconVisibilityStatus = i;
            return;
        }
    }

    private void showProcessDialog()
    {
        UtilityMethods.showKohlsProgressDialog(4002, null, getActivity().getString(0x7f08052d), null, true, false, false, 0, this);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils() != null)
        {
            KohlsPhoneApplication.getInstance().getAuthenticationUtils().resetIdleTimer();
        }
        return super.dispatchTouchEvent(motionevent);
    }

    public String getOrderStatusOrderId()
    {
        return mOrderStatusOrderId;
    }

    public String getOrderStatusPostalCode()
    {
        return mOrderStatusPostalCode;
    }

    public HybridScreen getScreenName()
    {
        return screen;
    }

    public String getScreenUrl()
    {
        String s = "";
        if (screen != null)
        {
            s = screen.getScreenUrl();
        }
        return s;
    }

    public boolean isSecurePageShowing()
    {
        while (appView == null || HybridScreen.getScreenFromUrl(appView.getUrl()) == HybridScreen.SHOPPINGBAG) 
        {
            return false;
        }
        return true;
    }

    public void onActionReceived(final String screen, JSONObject jsonobject)
    {
label0:
        {
            KohlsPhoneApplication.getInstance().getAuthenticationUtils().resetIdleTimer();
            if (!"IN_ACTION_SET_ACTIONBAR".equalsIgnoreCase(screen))
            {
                break label0;
            }
            try
            {
                if (!jsonobject.has("url"))
                {
                    break MISSING_BLOCK_LABEL_57;
                }
                screen = HybridScreen.getScreenFromUrlPostfix(jsonobject.getString("url"));
            }
            // Misplaced declaration of an exception variable
            catch (final String screen)
            {
                Logger.error(TAG, (new StringBuilder()).append("").append(screen.getMessage()).toString());
                return;
            }
        }
        if (screen == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        getActivity().runOnUiThread(new Runnable() {

            final WLActivity this$0;
            final HybridScreen val$screen;

            public void run()
            {
                mPageTitle = screen.getScreenTitle();
                setActionBarTitle(mPageTitle);
                static class _cls7
                {

                    static final int $SwitchMap$com$kohls$mcommerce$opal$wl$HybridScreen[];

                    static 
                    {
                        $SwitchMap$com$kohls$mcommerce$opal$wl$HybridScreen = new int[HybridScreen.values().length];
                        try
                        {
                            $SwitchMap$com$kohls$mcommerce$opal$wl$HybridScreen[HybridScreen.EMPTY_SHOPPINGBAG.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror9) { }
                        try
                        {
                            $SwitchMap$com$kohls$mcommerce$opal$wl$HybridScreen[HybridScreen.SHOPPINGBAG.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror8) { }
                        try
                        {
                            $SwitchMap$com$kohls$mcommerce$opal$wl$HybridScreen[HybridScreen.CHECKOUT.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror7) { }
                        try
                        {
                            $SwitchMap$com$kohls$mcommerce$opal$wl$HybridScreen[HybridScreen.SHIPPING.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror6) { }
                        try
                        {
                            $SwitchMap$com$kohls$mcommerce$opal$wl$HybridScreen[HybridScreen.GIFTOPTIONS.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            $SwitchMap$com$kohls$mcommerce$opal$wl$HybridScreen[HybridScreen.PAYMENT.ordinal()] = 6;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            $SwitchMap$com$kohls$mcommerce$opal$wl$HybridScreen[HybridScreen.REVIEW.ordinal()] = 7;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$kohls$mcommerce$opal$wl$HybridScreen[HybridScreen.MY_INFORMATION.ordinal()] = 8;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$kohls$mcommerce$opal$wl$HybridScreen[HybridScreen.ORDER_HISTORY.ordinal()] = 9;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$kohls$mcommerce$opal$wl$HybridScreen[HybridScreen.ORDER_DETAILS.ordinal()] = 10;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                _cls7..SwitchMap.com.kohls.mcommerce.opal.wl.HybridScreen[screen.ordinal()];
                JVM INSTR tableswitch 1 10: default 96
            //                           1 121
            //                           2 121
            //                           3 133
            //                           4 133
            //                           5 133
            //                           6 133
            //                           7 133
            //                           8 133
            //                           9 133
            //                           10 133;
                   goto _L1 _L2 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3
_L1:
                mBagIconVisibilityStatus = 8;
_L5:
                setShoppingBagIconVisibility(mBagIconVisibilityStatus);
                return;
_L2:
                mBagIconVisibilityStatus = 0;
                continue; /* Loop/switch isn't completed */
_L3:
                mBagIconVisibilityStatus = 8;
                startIdleTimer();
                if (true) goto _L5; else goto _L4
_L4:
            }

            
            {
                this$0 = WLActivity.this;
                screen = hybridscreen;
                super();
            }
        });
_L1:
        return;
        if ("IN_ACTION_PULSE".equalsIgnoreCase(screen))
        {
            Logger.debug(TAG, "Pulse received");
            return;
        }
          goto _L1
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (intent != null && j == 7004 || j == 7004)
        {
            backHistory();
            showProcessDialog();
            (new Thread(new Runnable() {

                final WLActivity this$0;

                public void run()
                {
                    try
                    {
                        Thread.sleep(1000L);
                /* block-local class not found */
                class _cls1 {}

                        runOnUiThread(new _cls1());
                        return;
                    }
                    catch (InterruptedException interruptedexception)
                    {
                        interruptedexception.printStackTrace();
                    }
                }

            
            {
                this$0 = WLActivity.this;
                super();
            }
            })).start();
        }
        super.onActivityResult(i, j, intent);
    }

    public void onBackPressed()
    {
        super.onBackPressed();
    }

    public void onConfigUpdated()
    {
        com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config config = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig();
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("configData", new JSONObject(UtilityMethods.createJsonFromModel(config)));
            WL.getInstance().sendActionToJS("getConfigSuccess", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            WL.getInstance().sendActionToJS("getConfigSuccess");
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        WL.createInstance(this);
        WL.getInstance().initializeWebFramework(getApplicationContext(), this);
        WL.getInstance().addActionReceiver(this);
        if (android.os.Build.VERSION.SDK_INT < 19);
    }

    public void onDestroy()
    {
        super.onDestroy();
        finish();
    }

    public void onInitWebFrameworkComplete(WLInitWebFrameworkResult wlinitwebframeworkresult)
    {
        if (wlinitwebframeworkresult.getStatusCode() == WLInitWebFrameworkResult.SUCCESS)
        {
            try
            {
                loadUrl(WL.getInstance().getMainHtmlFilePath());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (WLInitWebFrameworkResult wlinitwebframeworkresult)
            {
                Logger.error(TAG, wlinitwebframeworkresult.getMessage());
            }
            handleFailure();
            return;
        } else
        {
            handleFailure();
            return;
        }
    }

    protected void onPause()
    {
        KohlsPhoneApplication.getInstance().setApplicationBackground();
        KohlsPhoneApplication.getInstance().getAnalytics().pauseCollectingLifeCycleData();
        KohlsPhoneApplication.getInstance().getConfigurationUtils().removeConfigUpdateObserver();
        ToastUtility.hideAllCustomToast();
        super.onPause();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        if (bundle != null)
        {
            if (bundle.containsKey("pageTitle"))
            {
                mPageTitle = bundle.getString("pageTitle");
            }
            if (bundle.containsKey("bagIcon"))
            {
                mBagIconVisibilityStatus = bundle.getInt("bagIcon");
            }
            initializeActionBar();
        }
    }

    protected void onResume()
    {
        if (mActionBarHelper != null)
        {
            mActionBarHelper.updateShopingBagCountAndVisibility(false);
        }
        if (!KohlsPhoneApplication.getInstance().isAppBackground()) goto _L2; else goto _L1
_L1:
        UtilityMethods.getFlushTimes();
        KohlsPhoneApplication.getInstance().getConfigurationUtils().fetchAppConfigFromApi(this);
_L4:
        KohlsPhoneApplication.getInstance().setApplicationForeground();
        KohlsPhoneApplication.getInstance().getAnalytics().startCollectingLifeCycleData(this);
        super.onResume();
        return;
_L2:
        if (isSecurePageShowing())
        {
            KohlsPhoneApplication.getInstance().getAuthenticationUtils().resetIdleTimer();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (bundle != null)
        {
            bundle.putString("pageTitle", mPageTitle);
            bundle.putInt("bagIcon", mBagIconVisibilityStatus);
        }
    }

    protected void onStart()
    {
        super.onStart();
        Bundle bundle = getIntent().getExtras();
        if (bundle.containsKey("screenToLoad"))
        {
            screen = (HybridScreen)bundle.get("screenToLoad");
            if ("".equals(mPageTitle))
            {
                mPageTitle = screen.getScreenTitle();
                if (HybridScreen.SHOPPINGBAG == screen)
                {
                    mBagIconVisibilityStatus = 0;
                }
                initializeActionBar();
            }
            if (isSecurePageShowing())
            {
                startIdleTimer();
            }
            Logger.debug(TAG, (new StringBuilder()).append("Screen is: ").append(screen).toString());
        }
        if (bundle.containsKey("orderId"))
        {
            mOrderStatusOrderId = bundle.getString("orderId");
        }
        if (bundle.containsKey("postalCode"))
        {
            mOrderStatusPostalCode = bundle.getString("postalCode");
        }
    }

    public void setActionBarTitle(String s)
    {
        if (mActionBarHelper == null)
        {
            return;
        } else
        {
            mActionBarHelper.getTitleTextView().setText(s);
            mPageTitle = s;
            return;
        }
    }

    protected void startIdleTimer()
    {
        KohlsPhoneApplication.getInstance().getAuthenticationUtils().startIdleTimer(this);
    }

    public void updateActionBarData()
    {
        runOnUiThread(new Runnable() {

            final WLActivity this$0;

            public void run()
            {
                mActionBarHelper.updateShopingBagCountAndVisibility(false);
            }

            
            {
                this$0 = WLActivity.this;
                super();
            }
        });
    }





/*
    static String access$102(WLActivity wlactivity, String s)
    {
        wlactivity.mPageTitle = s;
        return s;
    }

*/



/*
    static int access$202(WLActivity wlactivity, int i)
    {
        wlactivity.mBagIconVisibilityStatus = i;
        return i;
    }

*/


}
