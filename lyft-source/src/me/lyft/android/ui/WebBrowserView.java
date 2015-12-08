// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.settings.ISignUrlService;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import rx.Observable;
import rx.subjects.PublishSubject;

public class WebBrowserView extends RelativeLayout
{

    private Binder binder;
    View bottomShadow;
    private boolean didReceiveWebError;
    View loadProgressIndicator;
    private OverrideLoadingUrlListener overrideLoadingUrlListener;
    private boolean overviewMode;
    private int progressIndicatorBackgroundColor;
    View retryButton;
    private boolean shouldSignUrl;
    private boolean showBottomShadow;
    ISignUrlService signUrlService;
    private String url;
    WebView webView;
    PublishSubject webviewPageLoadComplete;

    public WebBrowserView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        webviewPageLoadComplete = PublishSubject.create();
        shouldSignUrl = false;
        showBottomShadow = true;
        progressIndicatorBackgroundColor = -1;
        overviewMode = false;
        didReceiveWebError = false;
        Scoop.a(this).b(this);
    }

    private void handleError()
    {
        loadProgressIndicator.setVisibility(8);
        didReceiveWebError = true;
        webView.setVisibility(8);
        retryButton.setVisibility(0);
        retryButton.setOnClickListener(new android.view.View.OnClickListener() {

            final WebBrowserView this$0;

            public void onClick(View view)
            {
                loadAndSignUrlIfNeeded();
            }

            
            {
                this$0 = WebBrowserView.this;
                super();
            }
        });
    }

    private void initWebview()
    {
        WebSettings websettings;
        if (getShowBottomShadow())
        {
            bottomShadow.setVisibility(0);
        } else
        {
            bottomShadow.setVisibility(8);
        }
        if (getProgressIndicatorBackgroundColor() != -1)
        {
            loadProgressIndicator.setBackgroundColor(getProgressIndicatorBackgroundColor());
        }
        websettings = webView.getSettings();
        websettings.setJavaScriptEnabled(true);
        websettings.setCacheMode(-1);
        websettings.setLoadsImagesAutomatically(true);
        if (getOverviewMode())
        {
            websettings.setLoadWithOverviewMode(true);
            websettings.setSupportZoom(true);
            websettings.setBuiltInZoomControls(true);
            websettings.setUseWideViewPort(true);
            webView.setInitialScale(10);
        }
        webView.setWebViewClient(new WebViewClient() {

            final WebBrowserView this$0;

            public void onPageFinished(WebView webview, String s)
            {
                loadProgressIndicator.setVisibility(8);
                webviewPageLoadComplete.onNext(Unit.create());
            }

            public void onReceivedError(WebView webview, int i, String s, String s1)
            {
                handleError();
            }

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                if (s.startsWith("tel:"))
                {
                    webview = new Intent("android.intent.action.DIAL", Uri.parse(s));
                    getContext().startActivity(webview);
                } else
                {
                    if (s.startsWith("mailto:"))
                    {
                        webview = new Intent("android.intent.action.SENDTO", Uri.parse(s));
                        getContext().startActivity(webview);
                        return true;
                    }
                    if (!onOverrideUrlLoading(s))
                    {
                        webView.loadUrl(s);
                        return true;
                    }
                }
                return true;
            }

            
            {
                this$0 = WebBrowserView.this;
                super();
            }
        });
        loadAndSignUrlIfNeeded();
    }

    private void loadAndSignUrlIfNeeded()
    {
        didReceiveWebError = false;
        loadProgressIndicator.setVisibility(0);
        webView.setVisibility(0);
        retryButton.setVisibility(8);
        String s = getTargetUrl();
        if (shouldSignUrl())
        {
            binder.bind(signUrlService.getSignedUrl(s), new AsyncCall() {

                final WebBrowserView this$0;

                public void onFail(Throwable throwable)
                {
                    super.onFail(throwable);
                    handleError();
                }

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((String)obj);
                }

                public void onSuccess(String s1)
                {
                    super.onSuccess(s1);
                    setTargetUrl(s1);
                    setShouldSignUrl(false);
                    webView.loadUrl(s1);
                }

            
            {
                this$0 = WebBrowserView.this;
                super();
            }
            });
            return;
        } else
        {
            webView.loadUrl(s);
            return;
        }
    }

    public boolean getOverviewMode()
    {
        return overviewMode;
    }

    public int getProgressIndicatorBackgroundColor()
    {
        return progressIndicatorBackgroundColor;
    }

    public boolean getShowBottomShadow()
    {
        return showBottomShadow;
    }

    public String getTargetUrl()
    {
        return url;
    }

    public void loadUrl(String s)
    {
        if (s != null)
        {
            setTargetUrl(s);
            loadAndSignUrlIfNeeded();
        }
    }

    public Observable observePageLoadComplete()
    {
        return webviewPageLoadComplete.asObservable();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        initWebview();
    }

    protected void onDetachedFromWindow()
    {
        webView.setVisibility(4);
        webView.setWebViewClient(null);
        webView.loadUrl("about:blank");
        webView.destroy();
        webView = null;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    protected boolean onOverrideUrlLoading(String s)
    {
        if (overrideLoadingUrlListener != null)
        {
            return overrideLoadingUrlListener.overrideUrlLoading(s);
        } else
        {
            return false;
        }
    }

    public void setOnOverrideUrlLoadingListener(OverrideLoadingUrlListener overrideloadingurllistener)
    {
        overrideLoadingUrlListener = overrideloadingurllistener;
    }

    public void setOverviewMode(boolean flag)
    {
        overviewMode = flag;
    }

    public void setProgressIndicatorBackgroundColor(int i)
    {
        progressIndicatorBackgroundColor = i;
    }

    public void setShouldSignUrl(boolean flag)
    {
        shouldSignUrl = flag;
    }

    public void setShowBottomShadow(boolean flag)
    {
        showBottomShadow = flag;
    }

    public void setTargetUrl(String s)
    {
        url = s;
        loadAndSignUrlIfNeeded();
    }

    public boolean shouldSignUrl()
    {
        return shouldSignUrl;
    }



    private class OverrideLoadingUrlListener
    {

        public abstract boolean overrideUrlLoading(String s);
    }

}
