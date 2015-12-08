// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cardinalblue.android.piccollage.controller.a.e;
import com.cardinalblue.android.piccollage.model.j;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            KddiActivity

private class <init> extends WebViewClient
{

    final KddiActivity a;

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        if (!s.startsWith("https://pic-collage.com")) goto _L2; else goto _L1
_L1:
        bitmap = Uri.parse(s);
        s = bitmap.getQueryParameter("code");
        if (TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
        webview = j.a(a);
        (new e(a, webview)).a(new String[] {
            s
        });
_L2:
        return;
_L4:
        s = bitmap.getQueryParameter("error_description");
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L5
_L5:
        webview.setVisibility(8);
        if (!s.equalsIgnoreCase("HNY31004")) goto _L7; else goto _L6
_L6:
        webview = a.getString(0x7f0701f2);
_L9:
        a.a(webview);
        return;
_L7:
        if (s.equalsIgnoreCase("HNY30001"))
        {
            webview = a.getString(0x7f0701f3);
        } else
        {
            webview = s;
            if (s.equalsIgnoreCase("HNY90000"))
            {
                webview = a.getString(0x7f0701f1);
            }
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    private (KddiActivity kddiactivity)
    {
        a = kddiactivity;
        super();
    }

    a(KddiActivity kddiactivity, a a1)
    {
        this(kddiactivity);
    }
}
