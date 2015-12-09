// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.j;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import p.cp.d;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity

public class PandoraWebDialogActivity extends BaseFragmentActivity
{

    private WebView o;
    private String p;
    private String q;
    private boolean z;

    public PandoraWebDialogActivity()
    {
        q = null;
        z = false;
    }

    protected void a(Context context, Intent intent, String s1)
    {
    }

    protected IntentFilter l()
    {
        return null;
    }

    public void onBackPressed()
    {
        if (z)
        {
            b.a.C().a(s.r());
        }
        super.onBackPressed();
    }

    public void onBackgroundClicked(View view)
    {
        onBackPressed();
    }

    public void onCreate(Bundle bundle)
    {
        requestWindowFeature(1);
        super.onCreate(bundle);
        setContentView(0x7f040075);
        bundle = getIntent();
        if (bundle != null)
        {
            p = bundle.getStringExtra("intent_uri");
            q = bundle.getStringExtra("intent_extra_key");
            z = bundle.getBooleanExtra("intent_start_next_activity", false);
        }
        o = (WebView)findViewById(0x7f1001a2);
        o.setBackgroundColor(0);
        s.a(o, false);
        o.getSettings().setCacheMode(2);
        new d(this, o) {

            final PandoraWebDialogActivity a;

            public void b()
            {
                a.onBackPressed();
            }

            protected void c()
            {
                a.onBackPressed();
            }

            
            {
                a = PandoraWebDialogActivity.this;
                super(activity, webview);
            }
        };
    }

    protected void onResume()
    {
        super.onResume();
        if (o != null && !s.a(p))
        {
            o.loadUrl(p);
        }
    }
}
