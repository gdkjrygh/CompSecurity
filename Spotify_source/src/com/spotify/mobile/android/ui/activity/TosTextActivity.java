// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import aa;
import ah;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.framework.flag.NoFlags;
import fou;
import fpg;
import fph;
import ggn;

public class TosTextActivity extends fou
{

    private String d;
    private boolean i;

    public TosTextActivity()
    {
    }

    public void onBackPressed()
    {
        fph fph1 = (fph)a_().a(0x7f1102db);
        if (fph1 != null && fph1.y_())
        {
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag = false;
        super.onCreate(bundle);
        setContentView(0x7f030034);
        Intent intent = getIntent();
        d = intent.getStringExtra("license_url");
        i = intent.getBooleanExtra("log_external", false);
        if (bundle != null)
        {
            bundle.setClassLoader(getClassLoader());
            d = bundle.getString("license_url");
            i = bundle.getBoolean("log_external", false);
        }
        if (d == null)
        {
            i = true;
            getResources();
            String s = intent.getDataString();
            if (TextUtils.isEmpty(s))
            {
                Assertion.b((new StringBuilder("Intent Data String is invalid: ")).append(s).toString());
            } else
            {
                new fpg();
                if (s.startsWith("com.spotify.mobile.android.tos:spotify:internal:signup:tos"))
                {
                    s = getString(0x7f080627);
                    d = fpg.a(intent.getDataString(), s);
                } else
                if (s.startsWith("com.spotify.mobile.android.tos:spotify:internal:signup:policy"))
                {
                    s = getString(0x7f080626);
                    d = fpg.a(intent.getDataString(), s);
                } else
                {
                    Assertion.b((new StringBuilder("License url not supported ")).append(s).toString());
                }
            }
        } else
        {
            Uri uri = Uri.parse(d);
            if ("http".equals(uri.getScheme()) || "https".equals(uri.getScheme()))
            {
                flag = true;
            }
            if (!flag)
            {
                Assertion.a((new StringBuilder("License url has invalid scheme: ")).append(d).toString());
            }
            if (!uri.getHost().endsWith("spotify.com"))
            {
                Assertion.a((new StringBuilder("License url has invalid host: ")).append(d).toString());
            }
        }
        Assertion.a(d, "License url cannot be null.");
        Assertion.a(d, "License url cannot be empty.");
        findViewById(0x7f1102da).setOnClickListener(new android.view.View.OnClickListener() {

            private TosTextActivity a;

            public final void onClick(View view)
            {
                a.finish();
            }

            
            {
                a = TosTextActivity.this;
                super();
            }
        });
        if (bundle == null)
        {
            a_().a().a(0x7f1102db, fph.a(d, new NoFlags("Not logged in yet"))).c();
        }
        if (i)
        {
            bundle = ggn.b(this, ViewUri.aq);
        } else
        {
            bundle = ggn.a(this, ViewUri.aq);
        }
        super.e = bundle;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("license_url", d);
        bundle.putBoolean("log_external", i);
        super.onSaveInstanceState(bundle);
    }
}
