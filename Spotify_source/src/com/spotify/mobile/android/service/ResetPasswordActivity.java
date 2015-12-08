// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import aa;
import ah;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.spotify.music.framework.flag.NoFlags;
import dvj;
import fou;
import fyl;

public class ResetPasswordActivity extends fou
{

    private fyl d;

    public ResetPasswordActivity()
    {
    }

    public static Intent a(Context context)
    {
        context = new Intent(context, com/spotify/mobile/android/service/ResetPasswordActivity);
        context.addFlags(0x20000000);
        return context;
    }

    public void onBackPressed()
    {
        if (!d.y_())
        {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03002e);
        findViewById(0x7f1102b9).setOnClickListener(new android.view.View.OnClickListener() {

            private ResetPasswordActivity a;

            public final void onClick(View view)
            {
                a.finish();
            }

            
            {
                a = ResetPasswordActivity.this;
                super();
            }
        });
        d = dvj.a(new NoFlags("Not logged in yet"));
        if (bundle == null)
        {
            a_().a().a(0x7f1102cb, d).c();
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("saveDummyState", true);
        super.onSaveInstanceState(bundle);
    }
}
