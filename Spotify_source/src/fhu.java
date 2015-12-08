// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.spotify.mobile.android.spotlets.share.oauth.model.OAuthInfo;
import com.spotify.mobile.android.util.Assertion;

public class fhu extends WebViewClient
{

    private OAuthInfo a;
    private fhv b;
    private fhw c;

    public fhu(OAuthInfo oauthinfo, fhv fhv1, fhw fhw1)
    {
        Assertion.a(oauthinfo, "OAuthInfo cannot be empty");
        Assertion.a(fhv1, "AuthorizationListener cannot be empty");
        Assertion.a(fhw1, "InvalidUrlListener cannot be empty");
        a = oauthinfo;
        b = fhv1;
        c = fhw1;
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        String as[];
        int i;
        int j;
        super.shouldOverrideUrlLoading(webview, s);
        if (s.startsWith(a.mCallbackUrl))
        {
            webview = new fhy(Uri.parse(s).getQueryParameter("oauth_token"), Uri.parse(s).getQueryParameter("oauth_verifier"));
            if (webview.a())
            {
                b.a(webview);
                return true;
            } else
            {
                b.a();
                return true;
            }
        }
        webview = a;
        as = ((OAuthInfo) (webview)).mWhiteListedUrls;
        j = as.length;
        i = 0;
_L3:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        if (!s.startsWith(as[i])) goto _L2; else goto _L1
_L1:
        i = 1;
_L4:
        if (i == 0)
        {
            c.a(s);
            return true;
        } else
        {
            return false;
        }
_L2:
        i++;
          goto _L3
        if (s.startsWith(((OAuthInfo) (webview)).mRequestTokenUrl) || s.startsWith(((OAuthInfo) (webview)).mAuthorizeUrl) || s.startsWith(((OAuthInfo) (webview)).mAccessTokenUrl))
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L4
    }
}
