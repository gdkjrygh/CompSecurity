// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.content.res.Resources;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.jcp.util.au;

// Referenced classes of package com.jcp.activities:
//            GiftCardActivity

class r extends WebViewClient
{

    final GiftCardActivity a;

    r(GiftCardActivity giftcardactivity)
    {
        a = giftcardactivity;
        super();
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        String s1 = s.toLowerCase();
        if (s1.equalsIgnoreCase(a.getResources().getString(0x7f070201)))
        {
            au.b(a, a.getResources().getString(0x7f070200), a.getResources().getString(0x7f070201));
            return true;
        }
        if (s1.contains("cat100300156"))
        {
            a.setResult(-1);
            a.finish();
            return true;
        }
        if (s1.equalsIgnoreCase(a.getResources().getString(0x7f0701ff)))
        {
            au.b(a, a.getResources().getString(0x7f0701fe), a.getResources().getString(0x7f0701ff));
            return true;
        } else
        {
            return super.shouldOverrideUrlLoading(webview, s);
        }
    }
}
