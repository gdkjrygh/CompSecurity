// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.webkit.WebView;
import com.pandora.android.ads.k;
import com.pandora.android.data.l;
import com.pandora.android.data.p;
import com.pandora.android.provider.b;
import com.pandora.radio.data.ad;
import java.util.HashMap;
import p.cp.d;
import p.cw.c;
import p.di.a;

// Referenced classes of package com.pandora.android.activity:
//            InterstitialAdActivity

class a extends d
{

    final InterstitialAdActivity a;

    protected HashMap a(HashMap hashmap)
    {
        a.onBackPressed();
        return null;
    }

    protected transient void a(p ap[])
    {
        if (!com.pandora.android.activity.InterstitialAdActivity.b(a))
        {
            com.pandora.android.activity.InterstitialAdActivity.a(a, true);
            ap = new k(com.pandora.android.util.k.a().e(), ap);
            (new a()).execute(new ad[] {
                ap
            });
        }
    }

    protected void c()
    {
        a.finish();
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        long l1;
        if (a.o.e() == null)
        {
            l1 = -1L;
        } else
        {
            l1 = a.o.e().longValue();
        }
        b.a.b().o().a(a.o.f(), System.currentTimeMillis() - com.pandora.android.activity.InterstitialAdActivity.a(a), l1);
    }

    (InterstitialAdActivity interstitialadactivity, Activity activity, WebView webview)
    {
        a = interstitialadactivity;
        super(activity, webview);
    }
}
