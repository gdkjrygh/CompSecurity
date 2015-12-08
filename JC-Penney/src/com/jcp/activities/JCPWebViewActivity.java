// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.widget.TextView;
import com.jcp.h.g;
import com.jcp.views.JCPWebView;

// Referenced classes of package com.jcp.activities:
//            an, v

public class JCPWebViewActivity extends an
{

    private JCPWebView a;

    public JCPWebViewActivity()
    {
    }

    static JCPWebView a(JCPWebViewActivity jcpwebviewactivity)
    {
        return jcpwebviewactivity.a;
    }

    protected String a()
    {
        return null;
    }

    protected boolean b()
    {
        return false;
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
        setContentView(0x7f030027);
        if (getActionBar() != null)
        {
            getActionBar().hide();
        }
        bundle = getIntent().getExtras();
        String s = bundle.getString("title");
        g.a(s, null);
        ((TextView)findViewById(0x7f0e0157)).setText(s);
        a = (JCPWebView)findViewById(0x7f0e0158);
        a.setVisibility(8);
        a.getSettings().setJavaScriptEnabled(true);
        a.setWebViewClient(new v(this, null));
        a.loadUrl(bundle.getString("weburl"));
    }
}
