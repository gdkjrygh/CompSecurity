// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            o, f

class a extends WebChromeClient
{

    final o a;

    public void onProgressChanged(WebView webview, int i)
    {
        if (i == 100 && o.a(a) != null)
        {
            o.a(a).a(a);
        }
    }

    (o o1)
    {
        a = o1;
        super();
    }
}
