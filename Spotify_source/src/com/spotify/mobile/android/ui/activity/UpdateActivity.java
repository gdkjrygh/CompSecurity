// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dmz;
import for;
import fou;
import ggn;

public class UpdateActivity extends fou
{

    private Uri d;

    public UpdateActivity()
    {
        dmz.a(for);
    }

    static Uri a(UpdateActivity updateactivity)
    {
        return updateactivity.d;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = getIntent().getData();
        if (bundle != null)
        {
            bundle.setClassLoader(getClassLoader());
            d = Uri.parse(bundle.getString("update_uri"));
        }
        setContentView(0x7f030142);
        super.e = ggn.a(this, ViewUri.bf);
        for.a(this, ViewUri.bf, true);
        ((Button)findViewById(0x7f110022)).setOnClickListener(new android.view.View.OnClickListener() {

            private UpdateActivity a;

            public final void onClick(View view)
            {
                a.startActivity((new Intent("android.intent.action.VIEW", UpdateActivity.a(a))).addFlags(0x10000000));
                a.finish();
            }

            
            {
                a = UpdateActivity.this;
                super();
            }
        });
        ((Button)findViewById(0x7f110023)).setOnClickListener(new android.view.View.OnClickListener() {

            private UpdateActivity a;

            public final void onClick(View view)
            {
                a.finish();
            }

            
            {
                a = UpdateActivity.this;
                super();
            }
        });
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("update_uri", d.toString());
    }
}
