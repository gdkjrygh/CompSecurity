// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.qihoo360.mobilesafe.share.d;
import java.net.URLDecoder;

// Referenced classes of package com.qihoo.security.ui.result:
//            a

public class b extends WebViewClient
{

    private String a;
    private int b;
    private String c;

    public b(String s, String s1)
    {
        b = 0;
        a = s;
        c = s1;
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        com.qihoo.security.support.b.a(25011, a, String.valueOf(i), s);
        if (webview != null)
        {
            webview.stopLoading();
            webview.destroy();
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        b = b + 1;
        String as[];
        if (!com.qihoo.security.ui.result.a.a().a(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        as = Uri.parse(s).getEncodedQuery().split("&");
        if (as == null) goto _L1; else goto _L3
_L3:
        String s1;
        String s2;
        int i;
        s2 = "";
        s1 = "";
        i = 0;
_L12:
        String as1[];
        if (i >= as.length)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        as1 = as[i].split("=");
        if (as1 == null) goto _L1; else goto _L4
_L4:
        String s3;
        String s4;
        s3 = s2;
        s4 = s1;
        if (as1.length <= 1)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        String s5 = as1[0];
        if (s5.equals("id"))
        {
            s1 = as1[1];
        }
        s3 = s2;
        s4 = s1;
        if (s5.equals("referrer"))
        {
            s3 = as1[1];
            s4 = s1;
        }
        break MISSING_BLOCK_LABEL_234;
        boolean flag;
        try
        {
            flag = TextUtils.isEmpty(s2);
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            return true;
        }
        if (flag) goto _L6; else goto _L5
_L5:
        s = URLDecoder.decode(s2, "utf-8");
        if (TextUtils.isEmpty(s1)) goto _L8; else goto _L7
_L7:
        d.a("sp_name_adv_referrer", s1, s);
_L11:
        if (b <= 3);
        if (webview == null) goto _L1; else goto _L9
_L9:
        webview.stopLoading();
        webview.destroy();
        return true;
_L8:
        s1 = c;
          goto _L7
_L6:
        if (!TextUtils.isEmpty(s2));
        if (webview == null) goto _L1; else goto _L10
_L10:
        webview.loadUrl(s);
        return true;
        s;
          goto _L11
        i++;
        s2 = s3;
        s1 = s4;
          goto _L12
    }
}
