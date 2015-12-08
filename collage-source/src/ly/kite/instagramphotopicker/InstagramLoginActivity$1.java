// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.instagramphotopicker;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package ly.kite.instagramphotopicker:
//            InstagramLoginActivity

class this._cls0 extends WebViewClient
{

    final InstagramLoginActivity this$0;

    public void onLoadResource(WebView webview, String s)
    {
    }

    public void onPageFinished(WebView webview, String s)
    {
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s != null && s.startsWith(InstagramLoginActivity.access$000(InstagramLoginActivity.this)))
        {
            webview = Uri.parse(s);
            if (webview.getQueryParameter("error") != null)
            {
                webview = InstagramLoginActivity.access$100(InstagramLoginActivity.this, webview);
                InstagramLoginActivity.access$200(InstagramLoginActivity.this).stopLoading();
                InstagramLoginActivity.access$300(InstagramLoginActivity.this);
                InstagramLoginActivity.access$400(InstagramLoginActivity.this, webview);
            } else
            {
                webview = webview.getFragment().substring("access_token=".length());
                InstagramLoginActivity.access$500(InstagramLoginActivity.this, webview);
            }
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = InstagramLoginActivity.this;
        super();
    }
}
