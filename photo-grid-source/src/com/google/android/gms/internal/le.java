// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ld

final class le
    implements Runnable
{

    final String a;
    final String b;
    final ld c;

    le(ld ld1, String s, String s1)
    {
        c = ld1;
        a = s;
        b = s1;
        super();
    }

    public final void run()
    {
        WebView webview = c.a();
        webview.setWebViewClient(new zzfq._cls1._cls1(this, webview));
        c.a.add(webview);
        webview.loadDataWithBaseURL(a, b, "text/html", "UTF-8", null);
        zzb.zzaF("Fetching assets finished.");
    }
}
