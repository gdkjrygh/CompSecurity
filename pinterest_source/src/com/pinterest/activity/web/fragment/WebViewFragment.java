// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.web.fragment;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewStub;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.PinterestActivity;
import com.pinterest.activity.pin.view.modules.util.VerifiedDomainUtil;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.web.view.WebViewOpeninAppBar;
import com.pinterest.activity.web.view.WebViewPinItBar;
import com.pinterest.activity.webhook.WebhookActivity;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.WebViewUtils;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.ui.progress.LoadingView;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

public class WebViewFragment extends BaseFragment
{

    private static final String PINTEREST_MOBILE_URL = "http://m.pinterest.com";
    private static final String PWD_RESET_COMPLETE = "password/reset/complete/";
    private static final String TAG_EXTRACTION_JAVASCRIPT = "javascript:webViewResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:android:'.length) === 'al:android:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())";
    private static final String WEBVIEW_RESULT = "webViewResult";
    private WebViewPinItBar _browserPinBar;
    private String _displayTitle;
    com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private boolean _isCsrRepin;
    private boolean _isWebPagePinnable;
    private WebViewOpeninAppBar _openInAppBar;
    private Pin _pin;
    private String _pinId;
    private LoadingView _progressVw;
    private String _url;
    private Runnable _verifiedDomainToastRunnable;
    private WebChromeClient _webChromeClient;
    private WebView _webView;
    private WebViewClient _webViewClient;
    private ApiResponseHandler onZenDeskSso;

    public WebViewFragment()
    {
        _url = "http://m.pinterest.com";
        _eventsSubscriber = new _cls2();
        onZenDeskSso = new _cls3();
        _webChromeClient = new _cls4();
        _webViewClient = new _cls5();
        _menuId = -1;
        _isCsrRepin = false;
    }

    private void addFollowModuleToastRunnable()
    {
        while (_verifiedDomainToastRunnable != null || _webView == null || !VerifiedDomainUtil.shouldShowFollowModule(_pin)) 
        {
            return;
        }
        _verifiedDomainToastRunnable = new _cls6();
        _webView.postDelayed(_verifiedDomainToastRunnable, 0L);
    }

    private void enableLinkFeedback(View view)
    {
        _browserPinBar.showFeedbackButton(view);
    }

    private boolean handledByMarket(WebView webview, String s)
    {
label0:
        {
            if ("market".equals(Uri.parse(s).getScheme()))
            {
                webview.stopLoading();
                webview = getActivity();
                if (webview != null)
                {
                    break label0;
                }
            }
            return false;
        }
        if (!s.startsWith("market://details?id=com.pinterest") || s.length() <= 33) goto _L2; else goto _L1
_L1:
        s = new Intent(webview, com/pinterest/activity/PinterestActivity);
        ActivityHelper.setSingleClearTop(s);
        webview.finish();
        webview.startActivity(s);
_L4:
        return true;
_L2:
        Intent intent = new Intent("android.intent.action.VIEW");
        try
        {
            intent.setData(Uri.parse(s));
            webview.startActivity(intent);
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            intent.setData(Uri.parse(s.replaceFirst("market://", "http://play.google.com/store/apps/")));
            webview.startActivity(intent);
        }
        webview.finish();
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void removeFollowModuleToastRunnable()
    {
        if (_webView != null && _verifiedDomainToastRunnable != null)
        {
            _webView.removeCallbacks(_verifiedDomainToastRunnable);
        }
        _verifiedDomainToastRunnable = null;
    }

    private boolean shouldHandledByWebhook(String s)
    {
        Intent intent;
        if (getActivity() != null)
        {
            if ((intent = getActivity().getIntent()) != null && intent.getBooleanExtra("com.pinterest.EXTRA_ALLOW_REDIRECT_BACK", false) && !intent.getBooleanExtra("com.pinterest.EXTRA_CATCH_BY_WEBHOOK", false) && !s.contains("/secure/") && !s.contains("/login/") && (!shouldHandledInWebview(s) || s.startsWith("pinterest://") || s.startsWith("pinit")))
            {
                return true;
            }
        }
        return false;
    }

    private boolean shouldHandledInWebview(String s)
    {
        boolean flag;
        try
        {
            flag = WebhookActivity.shouldHandleInWebView((new URI(s)).getHost());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            CrashReporting.a(s);
            return true;
        }
        return flag;
    }

    protected void onActivate()
    {
        super.onActivate();
        if (_webView != null)
        {
            _webView.onResume();
            addFollowModuleToastRunnable();
        }
    }

    public boolean onBackPressed()
    {
        if (_webView.canGoBack())
        {
            _webView.goBack();
            return true;
        } else
        {
            return super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f030120;
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        if (menu != null)
        {
            menu.clear();
        }
    }

    protected void onDeactivate()
    {
        if (_webView != null)
        {
            _webView.onPause();
            removeFollowModuleToastRunnable();
        }
        super.onDeactivate();
    }

    public void onDestroy()
    {
        WebViewUtils.safeDestroyWebView(_webView);
        _webView = null;
        super.onDestroy();
    }

    public void onDestroyView()
    {
        if (_isCsrRepin)
        {
            Events.unregister(_eventsSubscriber);
        }
        if (_webView != null)
        {
            _webView.setWebViewClient(null);
            _webView.removeJavascriptInterface("webViewResult");
        }
        _webView.setWebChromeClient(null);
        if (_progressVw != null)
        {
            _progressVw.setState(2);
            _progressVw = null;
        }
        StopWatch.get().complete("webview_pageload");
        super.onDestroyView();
    }

    public void onPause()
    {
        super.onPause();
        StopWatch.get().pause("webview_pageload");
    }

    public void onResume()
    {
        super.onResume();
        StopWatch.get().resume("webview_pageload");
    }

    public void onViewCreated(final View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (_isWebPagePinnable)
        {
            _browserPinBar = (WebViewPinItBar)((ViewStub)view.findViewById(0x7f0f02ed)).inflate();
            _browserPinBar.init(_browserPinBar);
        }
        bundle = getActivity().getIntent();
        _progressVw = new LoadingView(view.getContext());
        _progressVw.setState(0);
        _progressVw.setLoadingBackground(null);
        android.support.v7.widget.Toolbar.LayoutParams layoutparams = new android.support.v7.widget.Toolbar.LayoutParams(-2, -2, 21);
        _actionBar.addView(_progressVw, layoutparams);
        if (_webView != null)
        {
            try
            {
                _webView.destroy();
            }
            catch (Exception exception) { }
        }
        _webView = (WebView)view.findViewById(0x7f0f0097);
        WebViewUtils.setupCookieManager(_webView);
        _webView.setWebChromeClient(_webChromeClient);
        _webView.setWebViewClient(_webViewClient);
        _webView.addJavascriptInterface(new _cls1(), "webViewResult");
        if (bundle.getBooleanExtra("com.pinterest.EXTRA_REMOVE_COOKIE", false))
        {
            WebViewUtils.clearCookies(_webView);
        }
        WebViewUtils.setupWebView(_webView, false);
        if (bundle.hasExtra("com.pinterest.EXTRA_WEB_TITLE"))
        {
            _displayTitle = getString(bundle.getExtras().getInt("com.pinterest.EXTRA_WEB_TITLE"));
        } else
        if (bundle.hasExtra("com.pinterest.EXTRA_WEB_TITLE_STRING"))
        {
            _displayTitle = bundle.getExtras().getString("com.pinterest.EXTRA_WEB_TITLE_STRING");
        }
        _actionBar.setTitle(_displayTitle);
        if (_url != null && !bundle.hasExtra("com.pinterest.EXTRA_HAS_URL")) goto _L2; else goto _L1
_L1:
        view = bundle.getData();
        if (view != null)
        {
            view = view.toString();
        } else
        {
            view = _url;
        }
        _url = view;
        if (!StringUtils.isEmpty(_url)) goto _L2; else goto _L3
_L3:
        getActivity().finish();
_L5:
        return;
_L2:
        if (_navigation == null)
        {
            break; /* Loop/switch isn't completed */
        }
        bundle = ((Bundle) (_navigation.getExtra("Referer")));
        if (!(bundle instanceof String))
        {
            break; /* Loop/switch isn't completed */
        }
        view = new HashMap();
        view.put("Referer", (String)bundle);
_L6:
        if (StringUtils.isEmpty(_url))
        {
            getActivity().onBackPressed();
            return;
        }
        if (!_url.equalsIgnoreCase(Resources.string(0x7f07074e)) && view != null)
        {
            _webView.loadUrl(_url, view);
        } else
        {
            _webView.loadUrl(_url);
        }
        if (_browserPinBar != null)
        {
            _browserPinBar.setUrl(_url);
            _browserPinBar.setPinId(_pinId);
        }
        if (_isWebPagePinnable && Experiments.m())
        {
            enableLinkFeedback(_browserPinBar);
        }
        if (_isCsrRepin)
        {
            view = ActivityHelper.getCreatePinIntent(getContext());
            view.putExtra("com.pinterest.EXTRA_SOURCE", "com.pinterest.EXTRA_SOURCE_CSR");
            view.putExtra("com.pinterest.EXTRA_CSR_ID", _pin.getUid());
            view.putExtra("com.pinterest.EXTRA_IMAGE", _pin.getImageLargeUrl());
            view.putExtra("com.pinterest.EXTRA_URL", _pin.getLink());
            getActivity().startActivityForResult(view, 10500);
            Events.register(_eventsSubscriber, com/pinterest/activity/pin/fragment/CsrPickerFragment$CsrSelectEvent, new Class[0]);
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
        view = null;
          goto _L6
        if (true) goto _L5; else goto _L7
_L7:
    }

    public void refresh()
    {
        _webView.reload();
    }

    public void scrollTo(int i, int j)
    {
        if (_webView != null)
        {
            _webView.scrollTo(i, j);
        }
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _url = navigation.getId();
        Object obj;
        Object obj1;
        boolean flag;
        if (navigation.getExtra("com.pinterest.EXTRA_WEBPAGE_PINNABLE") == Boolean.TRUE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _isWebPagePinnable = flag;
        obj = navigation.getExtra("com.pinterest.EXTRA_WEB_TITLE");
        obj1 = navigation.getExtra("CLOSEUP_PIN_ID");
        navigation = ((Navigation) (navigation.getExtra("com.pinterest.IS_CSR_REPIN")));
        if (obj instanceof String)
        {
            _displayTitle = (String)obj;
        }
        if (obj1 instanceof String)
        {
            _pinId = (String)obj1;
            _pin = ModelHelper.getPin(_pinId);
        }
        if (navigation instanceof Boolean)
        {
            _isCsrRepin = ((Boolean)navigation).booleanValue();
        }
    }



/*
    static WebViewOpeninAppBar access$002(WebViewFragment webviewfragment, WebViewOpeninAppBar webviewopeninappbar)
    {
        webviewfragment._openInAppBar = webviewopeninappbar;
        return webviewopeninappbar;
    }

*/













    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final WebViewFragment this$0;

        public void onEventMainThread(com.pinterest.activity.pin.fragment.CsrPickerFragment.CsrSelectEvent csrselectevent)
        {
            _webView.loadUrl(csrselectevent.getUrl());
        }

        _cls2()
        {
            this$0 = WebViewFragment.this;
            super();
        }
    }


    private class _cls3 extends ApiResponseHandler
    {

        final WebViewFragment this$0;

        public void onSuccess(PinterestJsonObject pinterestjsonobject)
        {
            super.onSuccess(pinterestjsonobject);
            if (_webView == null)
            {
                return;
            }
            if (pinterestjsonobject != null)
            {
                pinterestjsonobject = pinterestjsonobject.c("data");
                if (pinterestjsonobject != null)
                {
                    String s = pinterestjsonobject.a("sso_url", null);
                    pinterestjsonobject = s;
                    if (s == null)
                    {
                        pinterestjsonobject = _url;
                    }
                    _webView.loadUrl(pinterestjsonobject);
                    return;
                }
            }
            _webView.loadUrl(_url);
        }

        _cls3()
        {
            this$0 = WebViewFragment.this;
            super();
        }
    }


    private class _cls4 extends WebChromeClient
    {

        final WebViewFragment this$0;

        public void onProgressChanged(WebView webview, int i)
        {
            if (webview != null)
            {
                webview = StopWatch.get();
                if (webview.getAuxData("webview_pageload", "100p_loaded") == null)
                {
                    if (i >= 25 && i < 50)
                    {
                        webview.logTimeStamp("webview_pageload", "25p_loaded");
                        return;
                    }
                    if (i >= 50 && i < 75)
                    {
                        webview.logTimeStamp("webview_pageload", "50p_loaded");
                        return;
                    }
                    if (i >= 75 && i < 100)
                    {
                        webview.logTimeStamp("webview_pageload", "75p_loaded");
                        return;
                    }
                }
            }
        }

        _cls4()
        {
            this$0 = WebViewFragment.this;
            super();
        }
    }


    private class _cls5 extends WebViewClient
    {

        final WebViewFragment this$0;

        public void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            StopWatch.get().logTimeStamp("webview_pageload", "100p_loaded");
            _webView.setWebChromeClient(null);
            if (getActivity() != null && s != null && s.contains("password/reset/complete/"))
            {
                ActivityHelper.goSplashLogin(getActivity());
            }
            if (_progressVw != null)
            {
                _progressVw.setVisibility(8);
            }
            if (
// JavaClassFileOutputException: get_constant: invalid tag

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            onPageStarted(webview, s, bitmap);
            StopWatch.get().logTimeStamp("webview_pageload", "0p_loaded");
            if (!shouldHandledByWebhook(s)) goto _L2; else goto _L1
_L1:
            bitmap = getActivity();
            if (bitmap != null) goto _L4; else goto _L3
_L3:
            return;
_L4:
            Intent intent = new Intent(bitmap, com/pinterest/activity/webhook/WebhookActivity);
            intent.setData(Uri.parse(s));
            bitmap.startActivity(intent);
            webview.stopLoading();
            getActivity().finish();
            return;
_L2:
            if (_browserPinBar != null)
            {
                _browserPinBar.setUrl(s);
            }
            if (_progressVw != null)
            {
                _progressVw.setVisibility(0);
                _progressVw.setState(0);
            }
            if (
// JavaClassFileOutputException: get_constant: invalid tag

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            return handledByMarket(webview, s);
        }

        _cls5()
        {
            this$0 = WebViewFragment.this;
            super();
        }
    }


    private class _cls6
        implements Runnable
    {

        final WebViewFragment this$0;

        public void run()
        {
            VerifiedDomainUtil.showToastIfNecessary(_pin);
        }

        _cls6()
        {
            this$0 = WebViewFragment.this;
            super();
        }
    }


    private class _cls1
    {

        final WebViewFragment this$0;
        final View val$view;

        public void setValue(String s)
        {
            if (!StringUtils.isNotEmpty(s)) goto _L2; else goto _L1
_L1:
            final HashMap dataMap;
            dataMap = new HashMap();
            s = new PinterestJsonArray(s);
            int i = 0;
_L6:
            PinterestJsonObject pinterestjsonobject;
            if (i < s.a())
            {
                pinterestjsonobject = s.c(i);
                break MISSING_BLOCK_LABEL_43;
            }
            if (dataMap.isEmpty()) goto _L2; else goto _L3
_L3:
            intent = AppUtils.getAppLinkIntent(dataMap);
            pinterestjsonobject = null;
            s = pinterestjsonobject;
            if (getActivity() == null)
            {
                break MISSING_BLOCK_LABEL_139;
            }
            packagemanager = getActivity().getPackageManager();
            s = pinterestjsonobject;
            if (packagemanager == null)
            {
                break MISSING_BLOCK_LABEL_139;
            }
            s = packagemanager.resolveActivity(intent, 0x10000);
            if (s == null) goto _L2; else goto _L4
_L4:
            getActivity().runOnUiThread(new _cls1());
_L2:
            return;
            class _cls1
                implements Runnable
            {

                final _cls1 this$1;
                final HashMap val$dataMap;
                final Intent val$intent;

                public void run()
                {
                    Object obj;
                    if (view != null)
                    {
                        if ((obj = (ViewStub)view.findViewById(0x7f0f02eb)) != null)
                        {
                            _openInAppBar = (WebViewOpeninAppBar)((ViewStub) (obj)).inflate();
                            String s2 = (String)dataMap.get("al:android:app_name");
                            Button button = (Button)_openInAppBar.findViewById(0x7f0f030a);
                            obj = s2;
                            if (StringUtils.isEmpty(s2))
                            {
                                obj = "";
                            }
                            button.setText(Resources.string(0x7f0703d9, new Object[] {
                                obj
                            }));
                            _openInAppBar.setIntent(intent);
                            return;
                        }
                    }
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    dataMap = hashmap;
                    intent = intent1;
                    super();
                }
            }

            final Intent intent;
            PackageManager packagemanager;
            if (pinterestjsonobject != null)
            {
                try
                {
                    String s1 = pinterestjsonobject.a("property", "");
                    if (StringUtils.isNotEmpty(s1))
                    {
                        dataMap.put(s1, pinterestjsonobject.a("content", ""));
                    }
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    CrashReporting.a(s);
                    return;
                }
            }
            i++;
            if (true) goto _L6; else goto _L5
_L5:
        }

        _cls1()
        {
            this$0 = WebViewFragment.this;
            view = view1;
            super();
        }
    }

}
