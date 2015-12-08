// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.pandora.android.data.l;
import com.pandora.android.data.p;
import com.pandora.android.provider.b;
import com.pandora.radio.data.ad;
import com.pandora.radio.data.af;
import com.pandora.radio.util.k;
import java.util.HashMap;
import p.cp.d;
import p.cw.c;
import p.di.a;

// Referenced classes of package com.pandora.android.activity:
//            InterstitialBaseActivity, b

public class InterstitialAdActivity extends InterstitialBaseActivity
{

    private long A;
    private boolean B;
    private long z;

    public InterstitialAdActivity()
    {
        z = 0x7fffffffffffffffL;
        B = false;
    }

    static long a(InterstitialAdActivity interstitialadactivity)
    {
        return interstitialadactivity.A;
    }

    static boolean a(InterstitialAdActivity interstitialadactivity, boolean flag)
    {
        interstitialadactivity.B = flag;
        return flag;
    }

    static boolean b(InterstitialAdActivity interstitialadactivity)
    {
        return interstitialadactivity.B;
    }

    private void o()
    {
        p = 0;
        onBackPressed();
    }

    protected d a(WebView webview)
    {
        return new d(this, webview) {

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
                    ap = new com.pandora.android.ads.k(com.pandora.android.util.k.a().e(), ap);
                    (new a()).execute(new ad[] {
                        ap
                    });
                }
            }

            protected void c()
            {
                a.finish();
            }

            public void onPageFinished(WebView webview1, String s)
            {
                super.onPageFinished(webview1, s);
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

            
            {
                a = InterstitialAdActivity.this;
                super(activity, webview);
            }
        };
    }

    public boolean a(com.pandora.android.util.k.a a1)
    {
        return false;
    }

    protected void k()
    {
    }

    protected int m()
    {
        return 0x7f040061;
    }

    public void onBackPressed()
    {
        b.a.b().o().a(o.f());
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            z = bundle.getLong("backgrounded_time_ms", 0x7fffffffffffffffL);
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    protected void onResume()
    {
        super.onResume();
        A = System.currentTimeMillis();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putLong("backgrounded_time_ms", z);
    }

    public void onSkipButtonClicked(View view)
    {
        onBackPressed();
    }

    protected void onStart()
    {
        super.onStart();
        if (System.currentTimeMillis() - z > 30000L)
        {
            f("InterstitialAdActivity auto-dismissed: too long in background");
            b.a.b().o().a(o.f(), 30000L);
            o();
            return;
        }
        if (b.a.d() != null && !b.a.d().a())
        {
            f("InterstitialAdActivity auto-dismissed: user no longer ad supported");
            o();
            return;
        } else
        {
            z = 0x7fffffffffffffffL;
            return;
        }
    }

    protected void onStop()
    {
        if (com.pandora.android.activity.b.a().d() == 1)
        {
            z = System.currentTimeMillis();
        }
        super.onStop();
    }
}
