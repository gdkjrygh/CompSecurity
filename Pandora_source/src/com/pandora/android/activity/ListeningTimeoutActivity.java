// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.pandora.android.Main;
import com.pandora.android.iap.c;
import com.pandora.android.iap.d;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import p.cx.p;
import p.dd.bh;
import p.dd.bp;
import p.dd.e;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, PandoraIntent, PandoraIntentFilter, c

public class ListeningTimeoutActivity extends BaseFragmentActivity
    implements android.view.View.OnTouchListener
{

    private boolean A;
    private WebView o;
    private boolean p;
    private p q;
    private boolean z;

    public ListeningTimeoutActivity()
    {
        A = false;
    }

    static boolean a(ListeningTimeoutActivity listeningtimeoutactivity)
    {
        return listeningtimeoutactivity.A;
    }

    static boolean a(ListeningTimeoutActivity listeningtimeoutactivity, boolean flag)
    {
        listeningtimeoutactivity.A = flag;
        return flag;
    }

    static WebView b(ListeningTimeoutActivity listeningtimeoutactivity)
    {
        return listeningtimeoutactivity.o;
    }

    static void c(ListeningTimeoutActivity listeningtimeoutactivity)
    {
        listeningtimeoutactivity.n();
    }

    private void n()
    {
        if (!p && !isFinishing())
        {
            q.e();
            finish();
            p = true;
            if (z)
            {
                s.s();
            }
        }
    }

    protected void a(Context context, Intent intent, String s1)
    {
        if (PandoraIntent.a("iap_complete").equals(s1) || PandoraIntent.a("iap_error").equals(s1))
        {
            A = false;
        }
    }

    protected IntentFilter l()
    {
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("iap_complete");
        pandoraintentfilter.a("iap_error");
        return pandoraintentfilter;
    }

    public String m()
    {
        return s.b(b.a.h(), 0x7f070000);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        i;
        JVM INSTR tableswitch 130 130: default 20
    //                   130 28;
           goto _L1 _L2
_L1:
        super.onActivityResult(i, j, intent);
_L4:
        return;
_L2:
        A = false;
        com.pandora.android.iap.d.d.a().d().a(i, j, intent);
        if (j != 0)
        {
            onBackPressed();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onAutomotiveAccessory(e e1)
    {
        if (e1.a == p.dd.e.a.a)
        {
            n();
        }
    }

    public void onBackPressed()
    {
        n();
    }

    public void onCreate(Bundle bundle)
    {
        requestWindowFeature(1);
        super.onCreate(bundle);
        z = getIntent().getBooleanExtra("intent_show_next_activity_when_finished", false);
        v = true;
        setContentView(0x7f040064);
        findViewById(0x7f1001a4).setOnTouchListener(this);
        q = b.a.b().z();
        if (!q.b())
        {
            finish();
        }
        bundle = q.f();
        if (s.a(bundle))
        {
            bundle = m();
        }
        o = (WebView)findViewById(0x7f1001a2);
        s.a(o, false);
        o.setBackgroundColor(0);
        o.getSettings().setCacheMode(2);
        p.cp.d d1 = new p.cp.d(this, o) {

            final ListeningTimeoutActivity a;

            public void a(int i)
            {
                DisplayMetrics displaymetrics = new DisplayMetrics();
                a.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
                if (i > 0)
                {
                    android.view.ViewGroup.LayoutParams layoutparams = com.pandora.android.activity.ListeningTimeoutActivity.b(a).getLayoutParams();
                    float f1 = i;
                    layoutparams.height = (int)(displaymetrics.density * f1);
                    com.pandora.android.activity.ListeningTimeoutActivity.b(a).setLayoutParams(layoutparams);
                    return;
                } else
                {
                    f();
                    return;
                }
            }

            public void a(String s1, com.pandora.android.iap.d.b b1)
            {
                if (s.l())
                {
                    com.pandora.android.activity.c.a().a(a, com/pandora/android/Main);
                    a.finish();
                    return;
                } else
                {
                    ListeningTimeoutActivity.a(a, true);
                    com.pandora.android.iap.d.d.a().a(a, s1, b1);
                    return;
                }
            }

            public boolean a(boolean flag)
            {
                return false;
            }

            protected void c()
            {
                if (!ListeningTimeoutActivity.a(a))
                {
                    d();
                }
            }

            public void d()
            {
                com.pandora.android.activity.ListeningTimeoutActivity.c(a);
            }

            public void e()
            {
            }

            public void f()
            {
                a.finish();
            }

            
            {
                a = ListeningTimeoutActivity.this;
                super(activity, webview);
            }
        };
        d1.d(true);
        bundle = (new StringBuilder()).append(d1.a(p.cp.d.b.b)).append(bundle).toString();
        o.loadDataWithBaseURL(null, bundle, "text/html", "utf-8", null);
    }

    public boolean onSearchRequested()
    {
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        view = new Rect();
        o.getHitRect(view);
        int i = Math.round(motionevent.getX());
        int j = Math.round(motionevent.getY());
        boolean flag;
        if (o != null && view.contains(i, j))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            n();
            return true;
        } else
        {
            return false;
        }
    }

    public void onTrackState(bh bh1)
    {
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[p.dd.bh.a.values().length];
                try
                {
                    a[p.dd.bh.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[p.dd.bh.a.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.dd.bh.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.dd.bh.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.dd.bh.a.b.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.a[bh1.a.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("onTrackState: unknown event type ").append(bh1.a).toString());

        case 5: // '\005'
            finish();
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return;
        }
    }

    public void onUserStateChange(bp bp)
    {
        n();
    }
}
