// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            le, ld

class a extends WebViewClient
{

    final WebView a;
    final le b;

    public void onPageFinished(WebView webview, String s)
    {
        zzb.zzaF("Loading assets have finished");
        b.c.a.remove(a);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        zzb.zzaH("Loading assets have failed.");
        b.c.a.remove(a);
    }

    client.zzb(le le1, WebView webview)
    {
        b = le1;
        a = webview;
        super();
    }
}
