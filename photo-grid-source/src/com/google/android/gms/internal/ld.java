// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            lb, qa, le

public final class ld
    implements lb
{

    final Set a = Collections.synchronizedSet(new HashSet());
    private final Context b;

    public ld(Context context)
    {
        b = context;
    }

    public final WebView a()
    {
        WebView webview = new WebView(b);
        webview.getSettings().setJavaScriptEnabled(true);
        return webview;
    }

    public final void a(String s, String s1)
    {
        zzb.zzaF("Fetching assets for the given html");
        qa.a.post(new le(this, s, s1));
    }
}
