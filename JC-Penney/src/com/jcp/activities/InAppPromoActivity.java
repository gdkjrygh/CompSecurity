// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebSettings;
import butterknife.ButterKnife;
import com.jcp.util.ae;
import com.jcp.views.JCPWebView;

// Referenced classes of package com.jcp.activities:
//            an, t

public class InAppPromoActivity extends an
{

    private static final String a = com/jcp/activities/InAppPromoActivity.getName();
    protected JCPWebView webView;

    public InAppPromoActivity()
    {
    }

    protected String a()
    {
        return "INAPPPROMO";
    }

    protected void close()
    {
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().requestFeature(8);
        if (getActionBar() != null)
        {
            getActionBar().hide();
        }
        setContentView(0x7f030026);
        if (getIntent() != null)
        {
            bundle = getIntent().getStringExtra("key_url");
        } else
        {
            bundle = null;
        }
        if (bundle == null)
        {
            ae.a(a, "Activity started with no URL parameter, finishing");
            finish();
        }
        ButterKnife.inject(this);
        try
        {
            webView.setWebViewClient(new t(this));
            WebSettings websettings = webView.getSettings();
            websettings.setJavaScriptEnabled(true);
            websettings.setAppCacheEnabled(false);
            webView.loadUrl(bundle);
            return;
        }
        catch (Exception exception)
        {
            ae.a(a, (new StringBuilder()).append("Finishing: failed to load url: ").append(bundle).toString());
        }
    }

}
