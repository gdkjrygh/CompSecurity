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

public class PinterestFragment extends BaseFragment
{

    private static final String FOLLOW_URL = "https://www.pinterest.com/resource/UserFollowResource/create/";
    private static final String LOG_TAG = "PinterestFragment";
    private static final int PADDING = 60;
    private static final String UNFOLLOW_URL = "https://www.pinterest.com/resource/UserFollowResource/delete/";
    private static final String URL = "https://www.pinterest.com/kohls/pins/follow/";
    private WebChromeClient mWebChromeClient;
    private WebViewClient mWebViewClient;

    public PinterestFragment()
    {
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
        Logger.debug("PinterestFragment", "initializeViews() START");
        bundle = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(bundle);
        int i = (int)((float)((DisplayMetrics) (bundle)).heightPixels - 2.0F * (60F * ((DisplayMetrics) (bundle)).density));
        bundle = (RelativeLayout)getFragmentView().findViewById(0x7f0d02b0);
        android.view.ViewGroup.LayoutParams layoutparams = bundle.getLayoutParams();
        layoutparams.height = i;
        bundle.setLayoutParams(layoutparams);
        bundle = (WebView)bundle.findViewById(0x7f0d02b2);
        bundle.getSettings().setJavaScriptEnabled(true);
        bundle.getSettings().setLoadsImagesAutomatically(true);
        bundle.setWebViewClient(mWebViewClient);
        bundle.setWebChromeClient(mWebChromeClient);
        bundle.loadUrl("https://www.pinterest.com/kohls/pins/follow/");
        Logger.debug("PinterestFragment", "initializeViews() END");
    }

    protected int intializaLayoutId()
    {
        return 0x7f030076;
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

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
