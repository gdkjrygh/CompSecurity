// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.ActionBar;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.widget.ImageView;
import android.widget.TextView;
import com.jcp.b.b;
import com.jcp.util.z;
import com.jcp.views.JCPWebView;

// Referenced classes of package com.jcp.activities:
//            an, aq, ap

public class PrivacyPolicyActivity extends an
{

    private JCPWebView a;

    public PrivacyPolicyActivity()
    {
    }

    static JCPWebView a(PrivacyPolicyActivity privacypolicyactivity)
    {
        return privacypolicyactivity.a;
    }

    protected String a()
    {
        return "PRIVACYPOLICY";
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
        setContentView(0x7f030070);
        if (getActionBar() != null)
        {
            getActionBar().hide();
        }
        bundle = (TextView)findViewById(0x7f0e0284);
        a = (JCPWebView)findViewById(0x7f0e0285);
        a.getSettings().setJavaScriptEnabled(true);
        a.setWebViewClient(new aq(this, null));
        a.loadUrl(b.m());
        ImageView imageview = (ImageView)findViewById(0x7f0e0095);
        bundle.setTypeface(z.a(this, 5));
        a.setVisibility(8);
        imageview.setOnClickListener(new ap(this));
    }
}
