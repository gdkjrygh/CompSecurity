// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;

// Referenced classes of package com.facebook.internal:
//            WebDialog, Utility

private class <init> extends WebViewClient
{

    final WebDialog this$0;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        if (!WebDialog.access$200(WebDialog.this))
        {
            WebDialog.access$300(WebDialog.this).dismiss();
        }
        WebDialog.access$400(WebDialog.this).setBackgroundColor(0);
        WebDialog.access$500(WebDialog.this).setVisibility(0);
        WebDialog.access$600(WebDialog.this).setVisibility(0);
        WebDialog.access$702(WebDialog.this, true);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        Utility.logd("FacebookSDK.WebDialog", (new StringBuilder()).append("Webview loading URL: ").append(s).toString());
        super.onPageStarted(webview, s, bitmap);
        if (!WebDialog.access$200(WebDialog.this))
        {
            WebDialog.access$300(WebDialog.this).show();
        }
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        sendErrorToListener(new FacebookDialogException(s, i, s1));
    }

    public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        super.onReceivedSslError(webview, sslerrorhandler, sslerror);
        sslerrorhandler.cancel();
        sendErrorToListener(new FacebookDialogException(null, -11, null));
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        boolean flag;
        flag = false;
        Utility.logd("FacebookSDK.WebDialog", (new StringBuilder()).append("Redirect URL: ").append(s).toString());
        if (!s.startsWith(WebDialog.access$100(WebDialog.this))) goto _L2; else goto _L1
_L1:
        Bundle bundle = parseResponseUri(s);
        webview = bundle.getString("error");
        s = webview;
        if (webview == null)
        {
            s = bundle.getString("error_type");
        }
        Object obj = bundle.getString("error_msg");
        webview = ((WebView) (obj));
        if (obj == null)
        {
            webview = bundle.getString("error_message");
        }
        obj = webview;
        if (webview == null)
        {
            obj = bundle.getString("error_description");
        }
        webview = bundle.getString("error_code");
        int i;
        if (!Utility.isNullOrEmpty(webview))
        {
            try
            {
                i = Integer.parseInt(webview);
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                i = -1;
            }
        } else
        {
            i = -1;
        }
        if (Utility.isNullOrEmpty(s) && Utility.isNullOrEmpty(((String) (obj))) && i == -1)
        {
            sendSuccessToListener(bundle);
        } else
        if (s != null && (s.equals("access_denied") || s.equals("OAuthAccessDeniedException")))
        {
            cancel();
        } else
        if (i == 4201)
        {
            cancel();
        } else
        {
            webview = new FacebookRequestError(i, s, ((String) (obj)));
            sendErrorToListener(new FacebookServiceException(webview, ((String) (obj))));
        }
        flag = true;
_L4:
        return flag;
_L2:
        if (s.startsWith("fbconnect://cancel"))
        {
            cancel();
            return true;
        }
        if (s.contains("touch")) goto _L4; else goto _L3
_L3:
        getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
        return true;
        webview;
        return false;
        if (true) goto _L6; else goto _L5
_L6:
        break MISSING_BLOCK_LABEL_159;
_L5:
    }

    private _cls9()
    {
        this$0 = WebDialog.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
