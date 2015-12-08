// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.h;
import android.support.v4.app.k;
import android.support.v4.content.j;
import android.widget.FrameLayout;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.o;
import com.pandora.radio.util.i;
import p.ca.ac;
import p.cw.c;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, PandoraIntent, a, PandoraIntentFilter

public class CapHitActivity extends BaseFragmentActivity
{

    private ac o;

    public CapHitActivity()
    {
    }

    public static Bundle a(String s1, String s2, int i1, boolean flag)
    {
        Bundle bundle = new Bundle(3);
        if (!s.a(s1))
        {
            bundle.putString("intent_uri", s1);
        }
        if (!s.a(s2))
        {
            bundle.putString("intent_html_content", s2);
        }
        bundle.putBoolean("intent_disable_webview_cache", flag);
        bundle.putInt("intent_color", i1);
        return bundle;
    }

    public static void b(String s1)
    {
        if (PandoraIntent.a("iap_complete").equals(s1) || PandoraIntent.a("iap_error").equals(s1))
        {
            Object obj = i.b();
            if (obj != null)
            {
                com.pandora.android.activity.a.a(((com.pandora.radio.data.y) (obj)), p.cw.b.b.c);
            } else
            {
                b.a.C().a(new PandoraIntent("show_no_station_selected"));
            }
            obj = b.a.b().j();
            ((o) (obj)).c();
            if (PandoraIntent.a("iap_complete").equals(s1) && ((o) (obj)).e())
            {
                ((o) (obj)).a(false);
            }
        }
    }

    protected void a(Context context, Intent intent, String s1)
    {
        b(s1);
        if (PandoraIntent.a("iap_complete").equals(s1) || PandoraIntent.a("iap_error").equals(s1))
        {
            finish();
        }
    }

    protected IntentFilter l()
    {
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("iap_complete");
        pandoraintentfilter.a("iap_error");
        return pandoraintentfilter;
    }

    public void onCreate(Bundle bundle)
    {
        Intent intent = getIntent();
        boolean flag = intent.getBooleanExtra("intent_disable_webview_cache", false);
        int i1 = intent.getIntExtra("intent_color", -1);
        Object obj = intent.getStringExtra("intent_uri");
        String s1 = ((String) (obj));
        if (s.a(((String) (obj))))
        {
            s1 = intent.getData().toString();
        }
        if (!s.u())
        {
            setTheme(0x7f0d0078);
        }
        super.onCreate(bundle);
        obj = new FrameLayout(this);
        ((FrameLayout) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        ((FrameLayout) (obj)).setId(3232);
        setContentView(((android.view.View) (obj)));
        if (bundle == null)
        {
            o = ac.b(s1, flag, i1);
            bundle = f().a();
            bundle.a(3232, o, null);
            bundle.b();
        }
    }
}
