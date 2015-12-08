// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Message;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.facebook.a.e;
import com.facebook.a.g;
import com.tinder.model.SparksEvent;
import com.tinder.utils.a;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.activities:
//            ActivityCallToActionBrowser

final class a
    implements g
{

    final a a;

    public final void onSpringActivate(e e1)
    {
        ActivityCallToActionBrowser.h(a.a.a).setVisibility(0);
        com.tinder.activities.ActivityCallToActionBrowser.g(a.a.a).setVisibility(0);
    }

    public final void onSpringAtRest(e e1)
    {
        ActivityCallToActionBrowser.h(a.a.a).setVisibility(8);
        com.tinder.activities.ActivityCallToActionBrowser.g(a.a.a).setVisibility(8);
    }

    public final void onSpringEndStateChange(e e1)
    {
    }

    public final void onSpringUpdate(e e1)
    {
        ad.a(com.tinder.activities.ActivityCallToActionBrowser.g(a.a.a), (float)Math.min(1.0D, e1.d.a));
    }

    LoadReason(LoadReason loadreason)
    {
        a = loadreason;
        super();
    }

    // Unreferenced inner class com/tinder/activities/ActivityCallToActionBrowser$3

/* anonymous class */
    final class ActivityCallToActionBrowser._cls3 extends WebViewClient
    {

        final ActivityCallToActionBrowser a;
        private final String b[] = {
            "http", "https", "ftp"
        };

        public final void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            if (!com.tinder.activities.ActivityCallToActionBrowser.e(a))
            {
                ActivityCallToActionBrowser.f(a);
                ActivityCallToActionBrowser.i(a).post(new ActivityCallToActionBrowser._cls3._cls1(this));
                ActivityCallToActionBrowser.h(a).setVisibility(8);
            }
            ActivityCallToActionBrowser.c(a, "AdDetails.BrowseEnd").put("url", s).fire();
        }

        public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            super.onPageStarted(webview, s, bitmap);
            if (ActivityCallToActionBrowser.c(a) == null)
            {
                com.tinder.activities.ActivityCallToActionBrowser.a(a, s);
            }
            ActivityCallToActionBrowser.b(a, s);
            a.onPrepareOptionsMenu(ActivityCallToActionBrowser.d(a));
            if (ActivityCallToActionBrowser.b(a).copyBackForwardList().getSize() == 1)
            {
                com.tinder.activities.ActivityCallToActionBrowser.a(a, System.currentTimeMillis());
                ActivityCallToActionBrowser.c(a, "AdDetails.Open").fire();
                return;
            } else
            {
                ActivityCallToActionBrowser.c(a, "AdDetails.BrowseStart").put("url", s).fire();
                return;
            }
        }

        public final void onReceivedError(WebView webview, int i, String s, String s1)
        {
            com.tinder.activities.ActivityCallToActionBrowser.a(a, ActivityCallToActionBrowser.FailToLoadReason.d);
        }

        public final void onReceivedHttpAuthRequest(WebView webview, HttpAuthHandler httpauthhandler, String s, String s1)
        {
            com.tinder.activities.ActivityCallToActionBrowser.a(a, com.tinder.activities.ActivityCallToActionBrowser.FailToLoadReason.e);
        }

        public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
        {
            com.tinder.activities.ActivityCallToActionBrowser.a(a, ActivityCallToActionBrowser.FailToLoadReason.f);
        }

        public final void onTooManyRedirects(WebView webview, Message message, Message message1)
        {
            com.tinder.activities.ActivityCallToActionBrowser.a(a, com.tinder.activities.ActivityCallToActionBrowser.FailToLoadReason.g);
        }

        public final boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            String s1;
            String as[];
            int i;
            int j;
            s1 = Uri.parse(s).getScheme();
            as = b;
            j = as.length;
            i = 0;
_L5:
            if (i >= j)
            {
                break MISSING_BLOCK_LABEL_114;
            }
            if (!s1.equals(as[i])) goto _L2; else goto _L1
_L1:
            i = 1;
_L3:
            boolean flag;
            if (com.tinder.activities.ActivityCallToActionBrowser.a(a) != null && s != null && s.equals(com.tinder.activities.ActivityCallToActionBrowser.a(a)))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && ActivityCallToActionBrowser.b(a).canGoBack())
            {
                ActivityCallToActionBrowser.b(a).goBack();
                return false;
            }
            break MISSING_BLOCK_LABEL_126;
_L2:
            i++;
            continue; /* Loop/switch isn't completed */
            i = 0;
              goto _L3
            if (i != 0)
            {
                webview.loadUrl(s);
                return true;
            }
            webview = new Intent("android.intent.action.VIEW");
            webview.setData(Uri.parse(s));
            a.startActivity(webview);
            return true;
            webview;
            webview = Uri.parse(s).getScheme();
            webview = (new StringBuilder()).append(Character.toUpperCase(webview.charAt(0))).append(webview.substring(1)).toString();
            Toast.makeText(a, String.format(a.getResources().getString(0x7f060253), new Object[] {
                webview
            }), 0).show();
            return true;
            if (true) goto _L5; else goto _L4
_L4:
        }

            
            {
                a = activitycalltoactionbrowser;
                super();
            }
    }


    // Unreferenced inner class com/tinder/activities/ActivityCallToActionBrowser$3$1

/* anonymous class */
    final class ActivityCallToActionBrowser._cls3._cls1
        implements Runnable
    {

        final ActivityCallToActionBrowser._cls3 a;

        public final void run()
        {
            com.tinder.utils.a.a().a(1.0D).b(0.0D).a(new ActivityCallToActionBrowser._cls3._cls1._cls1(this));
        }

            
            {
                a = _pcls3;
                super();
            }
    }

}
