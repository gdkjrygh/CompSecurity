// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dmz;
import dtx;
import fop;
import fou;
import fyz;
import ggn;
import gin;
import gio;
import giq;

public class MarketingOptInActivity extends fou
{

    private Verified d;

    public MarketingOptInActivity()
    {
        dmz.a(fop);
        d = ViewUri.bI;
    }

    public static Intent a(Context context, String s)
    {
        context = new Intent(context, com/spotify/mobile/android/ui/activity/upsell/MarketingOptInActivity);
        context.putExtra("contactUsUrl", s);
        return context;
    }

    static void a(MarketingOptInActivity marketingoptinactivity, boolean flag)
    {
        Object obj = new ContentValues();
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ((ContentValues) (obj)).put("send_email", Integer.valueOf(i));
        marketingoptinactivity.getContentResolver().update(dtx.a, ((ContentValues) (obj)), null, null);
        if (flag)
        {
            obj = com.spotify.mobile.android.util.ClientEvent.SubEvent.bC;
        } else
        {
            obj = com.spotify.mobile.android.util.ClientEvent.SubEvent.Z;
        }
        obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, ((com.spotify.mobile.android.util.ClientEvent.SubEvent) (obj)));
        fop.a(marketingoptinactivity, marketingoptinactivity.d, ((ClientEvent) (obj)));
        marketingoptinactivity.f();
    }

    private void f()
    {
        ((giq)dmz.a(giq)).b(this).b().a(fyz.a, false).b();
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        f();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new DialogLayout(this);
        setContentView(bundle);
        setResult(-1);
        View view = LayoutInflater.from(this).inflate(0x7f030026, null);
        TextView textview = (TextView)view.findViewById(0x7f1102bb);
        String s = getIntent().getStringExtra("contactUsUrl");
        if (TextUtils.isEmpty(s))
        {
            textview.setVisibility(8);
        } else
        {
            String s1 = getString(0x7f08033d);
            s = (new StringBuilder("<a href=\"")).append(s).append("\">").append(s1).append("</a>").toString();
            textview.setMovementMethod(LinkMovementMethod.getInstance());
            textview.setText(Html.fromHtml(s));
        }
        bundle.a(view);
        bundle.b(0x7f08033e, new android.view.View.OnClickListener() {

            private MarketingOptInActivity a;

            public final void onClick(View view1)
            {
                MarketingOptInActivity.a(a, false);
                a.finish();
            }

            
            {
                a = MarketingOptInActivity.this;
                super();
            }
        });
        bundle.a(0x7f08033b, new android.view.View.OnClickListener() {

            private MarketingOptInActivity a;

            public final void onClick(View view1)
            {
                MarketingOptInActivity.a(a, true);
                a.finish();
            }

            
            {
                a = MarketingOptInActivity.this;
                super();
            }
        });
        super.e = ggn.a(this, d);
    }
}
