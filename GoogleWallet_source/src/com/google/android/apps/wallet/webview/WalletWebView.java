// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.webkit.ConsoleMessage;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.apps.wallet.webview:
//            WalletNativeInterface, HybridWebView, WalletWebViewFactory, HybridWebViewManager, 
//            HybridWebViewControl, ServiceAuthInfo, HybridWebChromeClient

public class WalletWebView
    implements WalletNativeInterface
{

    private static final String TAG = com/google/android/apps/wallet/webview/WalletWebView.getSimpleName();
    Activity activity;
    private final AtomicReference blacklistRegex = new AtomicReference();
    Handler handler;
    private OnActionListener onFailureListener;
    private OnActionListener onSuccessListener;
    FullScreenProgressSpinnerManager spinnerManager;
    private HybridWebViewControl webViewControl;
    WalletWebViewFactory webViewControlFactory;
    HybridWebViewManager webViewManager;
    private final AtomicReference whitelistRegex = new AtomicReference();

    public WalletWebView()
    {
    }

    private void addJavascriptInterface(HybridWebView hybridwebview)
    {
        WLog.d(TAG, "Adding javascript interface to WebView");
        hybridwebview.addJavascriptInterface(this, "WalletNativeInterface");
        hybridwebview.setWebChromeClient(new HybridWebChromeClient(hybridwebview) {

            final WalletWebView this$0;

            public final boolean onConsoleMessage(ConsoleMessage consolemessage)
            {
                String s = WalletWebView.TAG;
                int i = consolemessage.lineNumber();
                String s1 = String.valueOf(consolemessage.message());
                WLog.d(s, (new StringBuilder(String.valueOf(s1).length() + 23)).append("JSConsole ").append(i).append(": ").append(s1).toString());
                return super.onConsoleMessage(consolemessage);
            }

            
            {
                this$0 = WalletWebView.this;
                super(hybridwebview);
            }
        });
    }

    private boolean onShouldOverrideUrlLoading(String s)
    {
        if (blacklistRegex.get() == null && whitelistRegex.get() == null)
        {
            String s1 = TAG;
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Neither list is set - loading url: ".concat(s);
            } else
            {
                s = new String("Neither list is set - loading url: ");
            }
            WLog.d(s1, s);
            return false;
        }
        if (blacklistRegex.get() != null && Pattern.matches((String)blacklistRegex.get(), s))
        {
            String s5 = TAG;
            String s2 = String.valueOf(s);
            if (s2.length() != 0)
            {
                s2 = "Blackedlisted URL: ".concat(s2);
            } else
            {
                s2 = new String("Blackedlisted URL: ");
            }
            WLog.d(s5, s2);
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
            return true;
        }
        if (whitelistRegex.get() != null && Pattern.matches((String)whitelistRegex.get(), s))
        {
            String s3 = TAG;
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Whitelisted URL: ".concat(s);
            } else
            {
                s = new String("Whitelisted URL: ");
            }
            WLog.d(s3, s);
            return false;
        }
        String s6 = TAG;
        String s4 = String.valueOf(s);
        if (s4.length() != 0)
        {
            s4 = "Neither blacklisted, nor whitelisted URL: ".concat(s4);
        } else
        {
            s4 = new String("Neither blacklisted, nor whitelisted URL: ");
        }
        WLog.d(s6, s4);
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
        return true;
    }

    private void showInProgressIndicator(boolean flag)
    {
        if (flag)
        {
            spinnerManager.show();
            return;
        } else
        {
            spinnerManager.hide();
            return;
        }
    }

    public void clear()
    {
        webViewControlFactory.clearWebViews();
    }

    public View createContentView(String s, ServiceAuthInfo serviceauthinfo)
    {
        webViewManager.clearAllCookies();
        webViewControl = webViewControlFactory.createWebViewControl$2ee8f12b(s, new HybridWebViewManager.PostCreateHandler() {

            final WalletWebView this$0;

            public final void onWebViewCreated(HybridWebView hybridwebview)
            {
                addJavascriptInterface(hybridwebview);
            }

            public final void setWaitUiVisibility(HybridWebViewControl hybridwebviewcontrol, boolean flag)
            {
                showInProgressIndicator(flag);
            }

            public final boolean shouldOverrideUrlLoading(HybridWebViewControl hybridwebviewcontrol, HybridWebView hybridwebview, String s1)
            {
                return onShouldOverrideUrlLoading(s1);
            }

            
            {
                this$0 = WalletWebView.this;
                super();
            }
        }, serviceauthinfo);
        return webViewControl;
    }

    public boolean onBackPressed()
    {
        if (webViewControl.canGoBack())
        {
            webViewControl.goBack();
            return true;
        } else
        {
            return false;
        }
    }

    public void onFailure()
    {
        WLog.d(TAG, "onFailure() called");
        handler.post(new Runnable() {

            final WalletWebView this$0;

            public final void run()
            {
                if (onFailureListener != null)
                {
                    onFailureListener.onAction(null);
                }
            }

            
            {
                this$0 = WalletWebView.this;
                super();
            }
        });
    }

    public void onReceiveBlacklist(String s)
    {
        String s2 = TAG;
        String s1 = String.valueOf(s);
        if (s1.length() != 0)
        {
            s1 = "Received blacklist: ".concat(s1);
        } else
        {
            s1 = new String("Received blacklist: ");
        }
        WLog.d(s2, s1);
        blacklistRegex.set(s);
    }

    public void onReceiveWhitelist(String s)
    {
        String s2 = TAG;
        String s1 = String.valueOf(s);
        if (s1.length() != 0)
        {
            s1 = "Received whitelist: ".concat(s1);
        } else
        {
            s1 = new String("Received whitelist: ");
        }
        WLog.d(s2, s1);
        whitelistRegex.set(s);
    }

    public void onSuccess()
    {
        WLog.d(TAG, "onSuccess() called");
        handler.post(new Runnable() {

            final WalletWebView this$0;

            public final void run()
            {
                if (onSuccessListener != null)
                {
                    onSuccessListener.onAction(null);
                }
            }

            
            {
                this$0 = WalletWebView.this;
                super();
            }
        });
    }

    public void setOnFailureActionListener(OnActionListener onactionlistener)
    {
        onFailureListener = onactionlistener;
    }

    public void setOnSuccessActionListener(OnActionListener onactionlistener)
    {
        onSuccessListener = onactionlistener;
    }







}
