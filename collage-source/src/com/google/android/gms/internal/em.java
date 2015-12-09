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
//            ek, gw

public class em
    implements ek
{

    final Set a = Collections.synchronizedSet(new HashSet());
    private final Context b;

    public em(Context context)
    {
        b = context;
    }

    public WebView a()
    {
        WebView webview = new WebView(b);
        webview.getSettings().setJavaScriptEnabled(true);
        return webview;
    }

    public void a(String s, String s1, String s2)
    {
        zzb.zzaC("Fetching assets for the given html");
        gw.a.post(new zzfk._cls1(this, s1, s2));
    }
}
