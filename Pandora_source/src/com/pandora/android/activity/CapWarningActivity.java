// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.pandora.android.Main;
import com.pandora.android.iap.c;
import com.pandora.android.iap.d;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.o;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, PandoraIntent, PandoraIntentFilter, c

public class CapWarningActivity extends BaseFragmentActivity
{

    private WebView o;
    private float p;
    private int q;
    private boolean z;

    public CapWarningActivity()
    {
        z = false;
    }

    static float a(CapWarningActivity capwarningactivity)
    {
        return capwarningactivity.p;
    }

    static boolean a(CapWarningActivity capwarningactivity, boolean flag)
    {
        capwarningactivity.z = flag;
        return flag;
    }

    static int b(CapWarningActivity capwarningactivity)
    {
        return capwarningactivity.q;
    }

    static boolean c(CapWarningActivity capwarningactivity)
    {
        return capwarningactivity.z;
    }

    protected void a(Context context, Intent intent, String s)
    {
        if (PandoraIntent.a("iap_complete").equals(s) || PandoraIntent.a("iap_error").equals(s))
        {
            z = false;
        }
    }

    protected IntentFilter l()
    {
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("iap_complete");
        pandoraintentfilter.a("iap_error");
        return pandoraintentfilter;
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
        z = false;
        com.pandora.android.iap.d.d.a().d().a(i, j, intent);
        if (j != 0)
        {
            onBackPressed();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onBackPressed()
    {
        b.a.b().j().a(q, System.currentTimeMillis());
        super.onBackPressed();
    }

    public void onBackgroundClicked(View view)
    {
        onBackPressed();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        p = 0.0F;
        q = 0;
        setContentView(0x7f040075);
        o = (WebView)findViewById(0x7f1001a2);
        o.setBackgroundColor(0);
        o.getSettings().setCacheMode(2);
        new p.cp.d(this, o) {

            final CapWarningActivity a;

            public void a(String s1, com.pandora.android.iap.d.b b1)
            {
                if (s.l())
                {
                    s1 = new Bundle(1);
                    s1.putFloat("remaining_hours", CapWarningActivity.a(a));
                    s1.putInt("cap_warning_percent", com.pandora.android.activity.CapWarningActivity.b(a));
                    com.pandora.android.activity.c.a().a(a, com/pandora/android/Main);
                    a.finish();
                    return;
                } else
                {
                    CapWarningActivity.a(a, true);
                    com.pandora.android.iap.d.d.a().a(a, s1, b1);
                    return;
                }
            }

            public boolean a(Uri uri, p.cp.d.a a1)
            {
                return false;
            }

            public void b()
            {
                a.onBackPressed();
            }

            protected void c()
            {
                if (!com.pandora.android.activity.CapWarningActivity.c(a))
                {
                    a.onBackPressed();
                }
            }

            
            {
                a = CapWarningActivity.this;
                super(activity, webview);
            }
        };
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void onResume()
    {
        super.onResume();
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            p = bundle.getFloat("remaining_hours", 0.0F);
            q = bundle.getInt("cap_warning_percent", 0);
        }
        if (p <= 0.0F)
        {
            f((new StringBuilder()).append("Remaining time was ").append(p).append(". Failing silently.").toString());
            finish();
            return;
        } else
        {
            o.loadUrl(p.cp.b.a(p));
            return;
        }
    }

    public boolean onSearchRequested()
    {
        return false;
    }
}
