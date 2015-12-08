// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.ActionBar;
import android.os.Bundle;
import android.webkit.WebSettings;
import butterknife.ButterKnife;
import com.jcp.b.b;
import com.jcp.c.f;
import com.jcp.e.m;
import com.jcp.views.JCPWebView;

// Referenced classes of package com.jcp.activities:
//            an, r

public class GiftCardActivity extends an
    implements m
{

    private static final String a = com/jcp/activities/GiftCardActivity.getSimpleName();
    protected JCPWebView webView;

    public GiftCardActivity()
    {
    }

    protected String a()
    {
        return "GIFTCARDS";
    }

    public void a(String s)
    {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new r(this));
        webView.loadDataWithBaseURL(b.e, String.format("<html><body>%s</body></html>", new Object[] {
            s
        }), "text/html", "utf-8", null);
    }

    public void closeGiftCardActivity()
    {
        setResult(0);
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030024);
        ButterKnife.inject(this);
        if (getActionBar() != null)
        {
            getActionBar().hide();
        }
        bundle = new f(this);
        bundle.a(this);
        bundle.a();
    }

}
