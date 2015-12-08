// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import com.amobee.adsdk.AdManager;
import com.amobee.adsdk.IAmobeeListener;
import com.amobee.adsdk.Log;

// Referenced classes of package com.amobee.richmedia.view:
//            Browser

class this._cls0 extends WebViewClient
{

    final Browser this$0;

    public void onPageFinished(WebView webview, String s)
    {
        ImageButton imagebutton;
        Activity activity;
label0:
        {
            super.onPageFinished(webview, s);
            imagebutton = (ImageButton)findViewById(102);
            activity = (Activity)webview.getContext();
            String s1 = webview.getTitle();
            if (s1 != null)
            {
                s = s1;
                if (!s1.equals(""))
                {
                    break label0;
                }
            }
            s = webview.getUrl();
        }
        activity.setTitle(s);
        if (webview.canGoForward())
        {
            imagebutton.setImageBitmap(Browser.bitmapFromJar(Browser.getUrlForScreenWithUrl("bitmaps/amobee_rightarrow.png", Browser.access$0(Browser.this))));
            return;
        } else
        {
            imagebutton.setImageBitmap(Browser.bitmapFromJar(Browser.getUrlForScreenWithUrl("bitmaps/amobee_unrightarrow.png", Browser.access$0(Browser.this))));
            return;
        }
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        ((ImageButton)findViewById(102)).setImageBitmap(Browser.bitmapFromJar(Browser.getUrlForScreenWithUrl("bitmaps/amobee_unrightarrow.png", Browser.access$0(Browser.this))));
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        Log.d("Amobee internal browser Error: ", (new StringBuilder(String.valueOf(s))).append(" :").append(s1).toString());
        finish();
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        String s1;
        String s2;
        IAmobeeListener iamobeelistener;
        iamobeelistener = AdManager.getInstance(null).getAmobeeListener();
        s2 = s.toLowerCase();
        s1 = s2;
        if (s2.startsWith("wtai://wp/mc;"))
        {
            s1 = s2.replace("wtai://wp/mc;", "tel:");
        }
        if (!s1.startsWith("tel:"))
        {
            break MISSING_BLOCK_LABEL_96;
        }
        webview = new Intent("android.intent.action.DIAL");
        webview.setData(Uri.parse(s1));
        if (iamobeelistener == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        iamobeelistener.amobeeOnLeavingApplication(null);
        startActivity(webview);
        finish();
        return true;
        if (!s1.startsWith("sms:"))
        {
            break MISSING_BLOCK_LABEL_171;
        }
        webview = new Intent("android.intent.action.VIEW");
        if (iamobeelistener == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        iamobeelistener.amobeeOnLeavingApplication(null);
        webview.setData(Uri.parse(s));
        startActivity(webview);
        finish();
        return true;
        if (!s1.startsWith("mailto:"))
        {
            break MISSING_BLOCK_LABEL_229;
        }
        webview = new Intent("android.intent.action.VIEW");
        webview.setData(Uri.parse(s));
        startActivity(webview);
        finish();
        if (iamobeelistener != null)
        {
            try
            {
                iamobeelistener.amobeeOnLeavingApplication(null);
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                Log.d("OrmmaBrowser Error: ", "click interaction is not supported ");
                finish();
                return true;
            }
            return true;
        }
        break MISSING_BLOCK_LABEL_318;
        if (!s1.startsWith("market://") && !s1.contains("play.google.com/store/apps/details?id="))
        {
            break MISSING_BLOCK_LABEL_313;
        }
        webview = new Intent("android.intent.action.VIEW");
        webview.setData(Uri.parse(s));
        startActivity(webview);
        finish();
        if (iamobeelistener == null)
        {
            break MISSING_BLOCK_LABEL_318;
        }
        iamobeelistener.amobeeOnLeavingApplication(null);
        return true;
        webview;
        Log.d("OrmmaBrowser Error", "");
        finish();
        return true;
        webview.loadUrl(s);
        return true;
    }

    ()
    {
        this$0 = Browser.this;
        super();
    }
}
