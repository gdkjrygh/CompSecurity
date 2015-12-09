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
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import dmz;
import ers;
import fou;
import fpd;
import gin;
import gio;
import gip;
import giq;

public class ShowcaseConcertsActivity extends fou
{

    private static final gip d = gip.b("concerts_showcase_displayed");
    private static final gip i = gip.b("concerts_showcase_disabled_for_new_user");

    public ShowcaseConcertsActivity()
    {
    }

    public static void a(Context context, boolean flag)
    {
        ((giq)dmz.a(giq)).b(context).b().a(i, flag).b();
    }

    public static boolean a(Context context)
    {
        context = ((giq)dmz.a(giq)).b(context);
        return !context.a(d, false) && !context.a(i, false);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030031);
        ((Button)findViewById(0x7f1102d5)).setOnClickListener(new android.view.View.OnClickListener() {

            private ShowcaseConcertsActivity a;

            public final void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW", Uri.parse(ers.a));
                a.startActivity(view);
                a.finish();
            }

            
            {
                a = ShowcaseConcertsActivity.this;
                super();
            }
        });
        ((TextView)findViewById(0x7f1102d4)).setOnClickListener(new android.view.View.OnClickListener() {

            private ShowcaseConcertsActivity a;

            public final void onClick(View view)
            {
                a.finish();
            }

            
            {
                a = ShowcaseConcertsActivity.this;
                super();
            }
        });
        a_().a().a(0x7f1102b1, new fpd()).c();
        ((giq)dmz.a(giq)).b(this).b().a(d, true).b();
    }

}
