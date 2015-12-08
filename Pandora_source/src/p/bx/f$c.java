// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bx;

import android.net.Uri;
import android.webkit.WebView;

// Referenced classes of package p.bx:
//            f, d, e

public static class .String
    implements p.ca.
{

    public boolean a(WebView webview, String s)
    {
        if (s.startsWith("http://callback.twitter.pandora.com"))
        {
            Object obj = Uri.parse(s);
            if (((Uri) (obj)).getQueryParameter("denied") != null)
            {
                d.b().a(b);
            } else
            {
                s = ((Uri) (obj)).getQueryParameter("oauth_token");
                obj = ((Uri) (obj)).getQueryParameter("oauth_verifier");
                (new <init>(null)).execute(new String[] {
                    s, obj
                });
            }
            webview.setWebChromeClient(null);
            webview.stopLoading();
            return true;
        } else
        {
            return false;
        }
    }

    public .String()
    {
    }
}
