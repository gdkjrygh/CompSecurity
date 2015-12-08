// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;

// Referenced classes of package com.google.zxing.client.android:
//            LocaleManager

public final class HelpActivity extends Activity
{

    private static final String BASE_URL = (new StringBuilder()).append("file:///android_asset/html-").append(LocaleManager.getTranslatedAssetLanguage()).append('/').toString();
    private WebView webView;

    public HelpActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.help);
        webView = (WebView)findViewById(R.id.help_contents);
        if (bundle == null)
        {
            webView.loadUrl((new StringBuilder()).append(BASE_URL).append("index.html").toString());
            return;
        } else
        {
            webView.restoreState(bundle);
            return;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4 && webView.canGoBack())
        {
            webView.goBack();
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        String s = webView.getUrl();
        if (s != null && !s.isEmpty())
        {
            webView.saveState(bundle);
        }
    }

}
