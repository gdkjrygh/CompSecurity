// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.roidapp.photogrid.common.o;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.release:
//            HelpActivity

class a extends WebViewClient
{

    private final WeakReference a;

    private void openBrowser(Context context, String s)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(s));
        try
        {
            context.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public void onPageFinished(WebView webview, String s)
    {
        webview = (HelpActivity)a.get();
        if (webview != null && !webview.isFinishing() && HelpActivity.a(webview) != null && HelpActivity.a(webview).getVisibility() == 0)
        {
            HelpActivity.a(webview).setVisibility(8);
        }
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        HelpActivity helpactivity = (HelpActivity)a.get();
        if (helpactivity != null && !helpactivity.isFinishing() && s != null && s.startsWith("http"))
        {
            HelpActivity.a(helpactivity, s);
        }
        super.onPageStarted(webview, s, bitmap);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        s = (HelpActivity)a.get();
        if (s != null && !s.isFinishing())
        {
            if (webview != null)
            {
                webview.loadData("", "text/plain", "UTF-8");
            }
            if (HelpActivity.a(s) != null && HelpActivity.a(s).getVisibility() == 0)
            {
                HelpActivity.a(s).setVisibility(8);
            }
            if (HelpActivity.b(s) != null && HelpActivity.b(s).getVisibility() != 0)
            {
                HelpActivity.b(s).setVisibility(0);
            }
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        Activity activity;
label0:
        {
label1:
            {
                activity = (Activity)a.get();
                if (activity != null && !activity.isFinishing())
                {
                    if (s == null)
                    {
                        break label0;
                    }
                    if (!s.startsWith("http://dl.pg.ksmobile.com/help/"))
                    {
                        break label1;
                    }
                    webview.loadUrl(s);
                }
                return true;
            }
            if (s.startsWith("mailto:"))
            {
                (new o(activity)).b();
                return true;
            }
        }
        openBrowser(activity, s);
        return true;
    }

    public (HelpActivity helpactivity)
    {
        a = new WeakReference(helpactivity);
    }
}
