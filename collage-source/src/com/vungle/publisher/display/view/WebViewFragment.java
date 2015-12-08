// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.display.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.vungle.log.Logger;
import com.vungle.publisher.bt;
import com.vungle.publisher.display.controller.AdWebViewClient;
import com.vungle.publisher.util.ViewUtils;

// Referenced classes of package com.vungle.publisher.display.view:
//            AdFragment, WebViewFactory

public abstract class WebViewFragment extends AdFragment
{

    protected String c;
    protected WebView d;
    bt e;
    AdWebViewClient f;
    WebViewFactory g;

    public WebViewFragment()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            c = bundle.getString("url");
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Logger.v("VungleAd", "creating webview");
        viewgroup = getActivity();
        layoutinflater = new WebView(g.a);
        d = layoutinflater;
        e.a(layoutinflater);
        layoutinflater.setWebViewClient(f);
        bundle = layoutinflater.getSettings();
        bundle.setBuiltInZoomControls(false);
        bundle.setJavaScriptEnabled(true);
        bundle.setLoadWithOverviewMode(true);
        bundle.setSaveFormData(true);
        bundle.setUseWideViewPort(false);
        layoutinflater.setBackgroundColor(0);
        layoutinflater.setBackgroundResource(0);
        layoutinflater.loadUrl(c);
        ViewUtils.a(layoutinflater);
        viewgroup = new FrameLayout(viewgroup);
        viewgroup.addView(layoutinflater);
        layoutinflater = layoutinflater.getLayoutParams();
        layoutinflater.width = -1;
        layoutinflater.height = -1;
        return viewgroup;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("url", c);
    }
}
