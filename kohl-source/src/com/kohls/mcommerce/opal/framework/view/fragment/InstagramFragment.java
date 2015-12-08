// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.kohls.mcommerce.opal.common.util.Logger;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.fragment:
//            BaseFragment

public class InstagramFragment extends BaseFragment
{

    private static final String CODE = "code";
    private static final String ERROR_ACCESS_DENIED = "access_denied";
    private static final String ERROR_KEY = "error";
    private static final String ERROR_REASON_KEY = "error_reason";
    private static final String ERROR_REASON_USER_DENIED = "user_denied";
    private static final String KOHLS = "kohls.com";
    private static final String LOG_TAG = "InstagramFragment";
    private static final int PADDING = 60;
    private static final String PARAM_ACCESS_TOKEN = "&access_token=";
    private static final String PARAM_CLIENT_ID = "client_id";
    private static final String PARAM_CLIENT_SECRET = "client_secret";
    private static final String PARAM_CODE = "code";
    private static final String PARAM_GRANT_TYPE = "grant_type";
    private static final String PARAM_GRANT_TYPE_VALUE = "authorization_code";
    private static final String PARAM_QUERY = "q=kohls&count=1";
    private static final String PARAM_REDIRECT_URI = "redirect_uri";
    private static final String URL_ACCESS_TOKEN = "https://api.instagram.com/oauth/access_token";
    private static final String URL_AUTHORIZATION = "https://api.instagram.com/oauth/authorize/?client_id=CLIENT_ID_PLACEHOLDER&redirect_uri=REDIRECT_URI_PLACEHOLDER&response_type=code&scope=relationships";
    private static final String URL_FOLLOW = "https://api.instagram.com/v1/users/USER_ID_PLACEHOLDER/relationship?access_token=";
    private static final String URL_SEARCH = "https://api.instagram.com/v1/users/search?";
    private String mRedirectUri;
    private WebChromeClient mWebChromeClient;
    private WebViewClient mWebViewClient;

    public InstagramFragment()
    {
        mRedirectUri = null;
        mWebChromeClient = new _cls1();
        mWebViewClient = new _cls2();
    }

    protected void initializeAttributes()
    {
    }

    protected void initializeController()
    {
    }

    protected void initializeViews(Bundle bundle)
    {
        Logger.debug("InstagramFragment", "initializeViews() START");
        bundle = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(bundle);
        int i = (int)((float)((DisplayMetrics) (bundle)).heightPixels - 2.0F * (60F * ((DisplayMetrics) (bundle)).density));
        bundle = (RelativeLayout)getFragmentView().findViewById(0x7f0d027c);
        android.view.ViewGroup.LayoutParams layoutparams = bundle.getLayoutParams();
        layoutparams.height = i;
        bundle.setLayoutParams(layoutparams);
        bundle = (WebView)bundle.findViewById(0x7f0d027e);
        bundle.getSettings().setJavaScriptEnabled(true);
        bundle.getSettings().setLoadsImagesAutomatically(true);
        bundle.setWebViewClient(mWebViewClient);
        bundle.setWebChromeClient(mWebChromeClient);
        mRedirectUri = getString(0x7f080247);
        bundle.loadUrl("https://api.instagram.com/oauth/authorize/?client_id=CLIENT_ID_PLACEHOLDER&redirect_uri=REDIRECT_URI_PLACEHOLDER&response_type=code&scope=relationships".replace("CLIENT_ID_PLACEHOLDER", getString(0x7f080245)).replace("REDIRECT_URI_PLACEHOLDER", mRedirectUri));
        Logger.debug("InstagramFragment", "initializeViews() END");
    }

    protected int intializaLayoutId()
    {
        return 0x7f030071;
    }

    protected void loadContent()
    {
    }

    public boolean onBackPress()
    {
        return false;
    }

    public void onClick(View view)
    {
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
    }


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/view/fragment/InstagramFragment$InstagramResponse
    /* block-local class not found */
    class InstagramResponse {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/view/fragment/InstagramFragment$InstagramResponseUsers
    /* block-local class not found */
    class InstagramResponseUsers {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/view/fragment/InstagramFragment$InstagramUser
    /* block-local class not found */
    class InstagramUser {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/view/fragment/InstagramFragment$Task
    /* block-local class not found */
    class Task {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
