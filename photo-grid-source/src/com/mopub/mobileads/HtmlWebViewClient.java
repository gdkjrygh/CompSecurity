// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mopub.common.MoPubBrowser;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Intents;
import com.mopub.exceptions.IntentNotResolvableException;
import com.mopub.exceptions.UrlParseException;

// Referenced classes of package com.mopub.mobileads:
//            BaseHtmlWebView, HtmlWebViewListener, MoPubErrorCode

class HtmlWebViewClient extends WebViewClient
{

    private final Context a;
    private HtmlWebViewListener b;
    private BaseHtmlWebView c;
    private final String d;
    private final String e;

    HtmlWebViewClient(HtmlWebViewListener htmlwebviewlistener, BaseHtmlWebView basehtmlwebview, String s, String s1)
    {
        b = htmlwebviewlistener;
        c = basehtmlwebview;
        d = s;
        e = s1;
        a = basehtmlwebview.getContext();
    }

    private void handleCustomIntentFromUri(Uri uri)
    {
        String s;
        String s1;
        try
        {
            s = uri.getQueryParameter("fnc");
            s1 = uri.getQueryParameter("data");
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            MoPubLog.w((new StringBuilder("Could not handle custom intent with uri: ")).append(uri).toString());
            return;
        }
        uri = new Intent(s);
        uri.addFlags(0x10000000);
        uri.putExtra("com.mopub.intent.extra.AD_CLICK_DATA", s1);
        s = (new StringBuilder("Could not handle custom intent: ")).append(s).append(". Is your intent spelled correctly?").toString();
        launchIntentForUserClick(a, uri, s);
    }

    private boolean handlePhoneScheme(String s)
    {
        if (!isPhoneScheme(s))
        {
            return false;
        } else
        {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
            intent.addFlags(0x10000000);
            s = (new StringBuilder("Could not handle intent with URI: ")).append(s).append(". Is this intent supported on your phone?").toString();
            launchIntentForUserClick(a, intent, s);
            return true;
        }
    }

    private boolean handleSpecialMoPubScheme(String s)
    {
        String s1;
        if (!isSpecialMoPubScheme(s))
        {
            return false;
        }
        s = Uri.parse(s);
        s1 = s.getHost();
        if (!"finishLoad".equals(s1)) goto _L2; else goto _L1
_L1:
        b.onLoaded(c);
_L4:
        return true;
_L2:
        if ("close".equals(s1))
        {
            b.onCollapsed();
        } else
        if ("failLoad".equals(s1))
        {
            b.onFailed(MoPubErrorCode.UNSPECIFIED);
        } else
        if ("custom".equals(s1))
        {
            handleCustomIntentFromUri(s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean isPhoneScheme(String s)
    {
        return s.startsWith("tel:") || s.startsWith("voicemail:") || s.startsWith("sms:") || s.startsWith("mailto:") || s.startsWith("geo:") || s.startsWith("google.streetview:");
    }

    private boolean isSpecialMoPubScheme(String s)
    {
        return s.startsWith("mopub://");
    }

    private boolean launchApplicationUrl(String s)
    {
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        s.addFlags(0x10000000);
        return launchIntentForUserClick(a, s, "Unable to open intent.");
    }

    private void showMoPubBrowserForUrl(String s)
    {
        String s1;
label0:
        {
            if (s != null)
            {
                s1 = s;
                if (!s.equals(""))
                {
                    break label0;
                }
            }
            s1 = "about:blank";
        }
        MoPubLog.d((new StringBuilder("Final URI to show in browser: ")).append(s1).toString());
        s = new Bundle();
        s.putString("URL", s1);
        s = Intents.getStartActivityIntent(a, com/mopub/common/MoPubBrowser, s);
        launchIntentForUserClick(a, s, "Could not handle intent action. . Perhaps you forgot to declare com.mopub.common.MoPubBrowser in your Android manifest file.");
    }

    boolean launchIntentForUserClick(Context context, Intent intent, String s)
    {
        com.mopub.common.Preconditions.NoThrow.checkNotNull(intent);
        if (context == null)
        {
            MoPubLog.d(s);
        } else
        if (c.wasClicked())
        {
            try
            {
                Intents.startActivity(context, intent);
                b.onClicked();
                c.onResetUserClick();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                MoPubLog.d(s);
                return false;
            }
            return true;
        }
        return false;
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        if (e != null && s.startsWith(e))
        {
            webview.stopLoading();
            showMoPubBrowserForUrl(s);
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        MoPubLog.d((new StringBuilder("Ad event URL: ")).append(s).toString());
        if (!handleSpecialMoPubScheme(s))
        {
            if (Intents.isAboutScheme(s))
            {
                MoPubLog.d("Link to about page ignored.");
                return true;
            }
            if (!handlePhoneScheme(s))
            {
                if (Intents.isNativeBrowserScheme(s))
                {
                    webview = (new StringBuilder("Unable to load mopub native browser url: ")).append(s).toString();
                    try
                    {
                        s = Intents.intentForNativeBrowserScheme(s);
                        launchIntentForUserClick(a, s, webview);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        MoPubLog.d((new StringBuilder()).append(webview).append(". ").append(s.getMessage()).toString());
                        return true;
                    }
                    return true;
                }
                if (Intents.isHttpUrl(s))
                {
                    showMoPubBrowserForUrl(s);
                    return true;
                }
                if (Intents.canHandleApplicationUrl(a, s))
                {
                    launchApplicationUrl(s);
                    return true;
                } else
                {
                    MoPubLog.d((new StringBuilder("Link ignored. Unable to handle url: ")).append(s).toString());
                    return true;
                }
            }
        }
        return true;
    }
}
