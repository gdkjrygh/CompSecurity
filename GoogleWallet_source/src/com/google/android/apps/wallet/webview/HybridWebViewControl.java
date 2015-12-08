// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.apps.wallet.ui.toast.Toasts;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.apps.wallet.webview:
//            HybridWebViewResources, HybridWebViewManager, HybridWebView, ServiceAuthInfo

public class HybridWebViewControl extends FrameLayout
    implements HybridWebView.UiClient
{

    private static HybridWebViewResources resources = new HybridWebViewResources("Could not load due to internal error. Details: %1$s", "Could not log in. Please check you have a working account set up.", "Could not load. Please check your network connection and try again");
    private final Account account;
    public HybridWebViewManager.PostCreateHandler client$1dc6b637;
    private Handler handler;
    private ProgressBar waitUi;
    private HybridWebViewManager webViewManager;
    private ViewGroup webViewParent;
    private ArrayList webViews;

    public HybridWebViewControl(Context context, Account account1, HybridWebViewManager hybridwebviewmanager, HybridWebViewManager.PostCreateHandler postcreatehandler)
    {
        super(context);
        webViews = new ArrayList();
        handler = new Handler(Looper.getMainLooper());
        context = postcreatehandler;
        if (postcreatehandler == null)
        {
            context = new HybridWebViewManager.PostCreateHandler();
        }
        setClient$45c60bec(context);
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        waitUi = new ProgressBar(getContext(), null, 0x101007a);
        context = new android.widget.FrameLayout.LayoutParams(-2, -2);
        context.gravity = 17;
        waitUi.setLayoutParams(context);
        waitUi.setIndeterminate(true);
        waitUi.setVisibility(4);
        addView(waitUi);
        webViewParent = new FrameLayout(getContext());
        webViewParent.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        webViewParent.setVisibility(0);
        addView(webViewParent);
        webViewManager = hybridwebviewmanager;
        account = account1;
        createWebView();
    }

    private HybridWebView createWebView()
    {
        HybridWebView hybridwebview = webViewManager.createWebView(getContext(), account);
        webViewParent.addView(hybridwebview);
        hybridwebview.setHybridWebViewUiClient(this);
        webViews.add(hybridwebview);
        client$1dc6b637.onWebViewCreated(hybridwebview);
        return hybridwebview;
    }

    private boolean handleGoBack(boolean flag)
    {
        boolean flag1 = true;
        if (webViews != null && !webViews.isEmpty()) goto _L2; else goto _L1
_L1:
        flag1 = false;
_L4:
        return flag1;
_L2:
        HybridWebView hybridwebview;
        hybridwebview = (HybridWebView)webViews.get(webViews.size() - 1);
        if (hybridwebview.wasIn(3) || !hybridwebview.canGoBack() || android.os.Build.VERSION.SDK_INT <= 7)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!flag)
        {
            hybridwebview.goBack();
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (webViews.size() > 1)
        {
            if (!flag)
            {
                closeWindow(hybridwebview);
                return true;
            }
        } else
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final boolean canGoBack()
    {
        return handleGoBack(true);
    }

    public final void closeWindow(WebView webview)
    {
        int i = webViews.indexOf(webview);
        if (i < 0)
        {
            return;
        }
        webViews.remove(i);
        webViewParent.removeView(webview);
        webview.destroy();
        if (!webViews.isEmpty())
        {
            ((HybridWebView)webViews.get(0)).setVisibility(0);
        }
        webview = client$1dc6b637;
    }

    public final void destroy()
    {
        removeAllViews();
        handler = null;
        for (Iterator iterator = webViews.iterator(); iterator.hasNext(); ((WebView)iterator.next()).destroy()) { }
        webViews.clear();
        webViews = null;
        webViewParent = null;
        waitUi = null;
        webViewManager = null;
        client$1dc6b637 = null;
        destroyDrawingCache();
    }

    public final void goBack()
    {
        handleGoBack(false);
    }

    public final WebView handleOpenNewWindow(HybridWebView hybridwebview)
    {
        hybridwebview.setVisibility(4);
        return createWebView();
    }

    public final void loadUrlAuthenticated(String s, ServiceAuthInfo serviceauthinfo, HybridWebView hybridwebview)
    {
        HybridWebView hybridwebview1 = hybridwebview;
        if (hybridwebview == null)
        {
            if (webViews.isEmpty())
            {
                hybridwebview1 = createWebView();
            } else
            {
                hybridwebview1 = (HybridWebView)webViews.get(0);
            }
        }
        hybridwebview = webViews.iterator();
        do
        {
            if (!hybridwebview.hasNext())
            {
                break;
            }
            WebView webview = (WebView)hybridwebview.next();
            if (webview != hybridwebview1)
            {
                webview.setVisibility(4);
            }
        } while (true);
        hybridwebview1.loadUrlAuthenticated(s, serviceauthinfo);
    }

    public final void onPageFinished(HybridWebView hybridwebview, String s)
    {
        hybridwebview = client$1dc6b637;
    }

    public final void onPageStarted(HybridWebView hybridwebview, String s)
    {
        hybridwebview = client$1dc6b637;
    }

    public void setClient$45c60bec(HybridWebViewManager.PostCreateHandler postcreatehandler)
    {
        client$1dc6b637 = postcreatehandler;
    }

    public void setWaitUiVisibility(boolean flag)
    {
        ProgressBar progressbar = waitUi;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        progressbar.setVisibility(i);
    }

    public void setWebViewVisibility(boolean flag)
    {
        ViewGroup viewgroup = webViewParent;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        viewgroup.setVisibility(i);
    }

    public final boolean shouldOverrideUrlLoading(HybridWebView hybridwebview, String s)
    {
        return client$1dc6b637.shouldOverrideUrlLoading(this, hybridwebview, s);
    }

    public final void showError(final HybridWebView webView, final int derivedErrorCode, final String description, final int errorCode)
    {
        handler.post(new Runnable() {

            final HybridWebViewControl this$0;
            final int val$derivedErrorCode;
            final String val$description;
            final int val$errorCode;
            final HybridWebView val$webView;

            public final void run()
            {
                showErrorOnUiThread(webView, derivedErrorCode, description, errorCode);
            }

            
            {
                this$0 = HybridWebViewControl.this;
                webView = hybridwebview;
                derivedErrorCode = i;
                description = s;
                errorCode = j;
                super();
            }
        });
    }

    protected final void showErrorOnUiThread(HybridWebView hybridwebview, int i, String s, int j)
    {
        hybridwebview = resources.fatalErrorTemplate;
        i;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 87
    //                   2 97
    //                   3 107;
           goto _L1 _L2 _L3 _L4
_L1:
        hybridwebview = String.format(hybridwebview, new Object[] {
            s, Integer.valueOf(j)
        });
        if (client$1dc6b637 != null)
        {
            client$1dc6b637.setWebViewVisibility(this, false);
            client$1dc6b637.showError(this, i, hybridwebview, j, s);
        }
        return;
_L2:
        hybridwebview = resources.connectionErrorTemplate;
        continue; /* Loop/switch isn't completed */
_L3:
        hybridwebview = resources.authErrorTemplate;
        continue; /* Loop/switch isn't completed */
_L4:
        hybridwebview = resources.fatalErrorTemplate;
        if (true) goto _L1; else goto _L5
_L5:
    }

    final void showErrorToast(String s)
    {
        Toasts.show(getContext(), s);
    }

    public final void updateWebViewLoadingState(final HybridWebView webView, final boolean webViewFinishedLoading, final int progress, final String url)
    {
        handler.post(new Runnable() {

            final HybridWebViewControl this$0;
            final int val$progress;
            final String val$url;
            final HybridWebView val$webView;
            final boolean val$webViewFinishedLoading;

            public final void run()
            {
                updateWebViewLoadingStateOnUiThread(webView, webViewFinishedLoading, progress, url);
            }

            
            {
                this$0 = HybridWebViewControl.this;
                webView = hybridwebview;
                webViewFinishedLoading = flag;
                progress = i;
                url = s;
                super();
            }
        });
    }

    protected final void updateWebViewLoadingStateOnUiThread(HybridWebView hybridwebview, boolean flag, int i, String s)
    {
        boolean flag1;
        if (flag)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        flag1 = hybridwebview.shouldBeVisible();
        if (client$1dc6b637 != null)
        {
            client$1dc6b637.setWaitUiVisibility(this, flag);
            client$1dc6b637.setWebViewVisibility(this, flag1);
            hybridwebview = client$1dc6b637;
        }
    }

}
