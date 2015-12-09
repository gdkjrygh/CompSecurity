// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.auth;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cardinalblue.android.piccollage.activities.BaseWebActivity;
import com.cardinalblue.android.piccollage.controller.network.f;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class PicEditAccountActivity extends BaseWebActivity
{

    public PicEditAccountActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(new WebViewClient() {

            final PicEditAccountActivity a;

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                if (s.startsWith("cardinalblue://localhost/edited"))
                {
                    a.setResult(-1);
                    a.finish();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = PicEditAccountActivity.this;
                super();
            }
        });
    }

    protected void onStart()
    {
        super.onStart();
        Object obj = new ArrayList();
        ((List) (obj)).add(new BasicNameValuePair("redirect_uri", "cardinalblue://localhost/edited"));
        obj = f.a("/account/edit", ((List) (obj)));
        b.loadUrl(((String) (obj)));
    }
}
