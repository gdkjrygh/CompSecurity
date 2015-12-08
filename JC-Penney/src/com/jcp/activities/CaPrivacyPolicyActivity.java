// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.ActionBar;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.widget.ImageView;
import com.jcp.b.b;
import com.jcp.views.JCPWebView;

// Referenced classes of package com.jcp.activities:
//            an, d, c

public class CaPrivacyPolicyActivity extends an
{

    private JCPWebView a;

    public CaPrivacyPolicyActivity()
    {
    }

    static JCPWebView a(CaPrivacyPolicyActivity caprivacypolicyactivity)
    {
        return caprivacypolicyactivity.a;
    }

    protected String a()
    {
        return "CAPRIVACYPOLICY";
    }

    public void onBackPressed()
    {
        if (a.canGoBack())
        {
            a.goBack();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030063);
        if (getActionBar() != null)
        {
            getActionBar().hide();
        }
        bundle = (ImageView)findViewById(0x7f0e0095);
        a = (JCPWebView)findViewById(0x7f0e0266);
        a.setVisibility(8);
        a.getSettings().setJavaScriptEnabled(true);
        a.loadUrl(b.l());
        a.setWebViewClient(new d(this, null));
        bundle.setOnClickListener(new c(this));
    }
}
