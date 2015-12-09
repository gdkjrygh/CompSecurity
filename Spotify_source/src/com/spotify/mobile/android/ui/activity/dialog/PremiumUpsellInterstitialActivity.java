// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dialog;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dmz;
import dtx;
import edb;
import fop;
import fou;
import fsc;
import fsd;
import fsr;
import fsv;
import fyw;
import ggn;

public class PremiumUpsellInterstitialActivity extends fou
    implements fsv
{

    private Verified d;
    private String i;
    private View j;
    private TextView k;
    private TextView l;
    private fsc m;
    private Flags n;

    public PremiumUpsellInterstitialActivity()
    {
        dmz.a(fop);
    }

    public static Intent a(Context context, Flags flags)
    {
        context = new Intent(context, com/spotify/mobile/android/ui/activity/dialog/PremiumUpsellInterstitialActivity);
        context.putExtra("view_uri", ViewUri.aS);
        context.putExtra("reason", null);
        context.putExtra("30_days_eligible", false);
        context.putExtra("trial_eligibility", CheckOptInTrialEligibilityTask.a().ordinal());
        context.putExtra("trial_duration_days", CheckOptInTrialEligibilityTask.b());
        fyw.a(context, flags);
        return context;
    }

    public static Intent a(Context context, String s, Flags flags)
    {
        context = new Intent(context, com/spotify/mobile/android/ui/activity/dialog/PremiumUpsellInterstitialActivity);
        context.putExtra("view_uri", ViewUri.aR);
        context.putExtra("reason", s);
        context.putExtra("30_days_eligible", true);
        context.putExtra("set_setting_to_false_on_destroy", "should_show_trial_end_notice");
        fyw.a(context, flags);
        return context;
    }

    static void a(PremiumUpsellInterstitialActivity premiumupsellinterstitialactivity)
    {
        premiumupsellinterstitialactivity.dismiss();
    }

    static fsc b(PremiumUpsellInterstitialActivity premiumupsellinterstitialactivity)
    {
        return premiumupsellinterstitialactivity.m;
    }

    private void dismiss()
    {
        fop.a(this, d, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.g));
        finish();
    }

    public final void a(int i1)
    {
        k.setVisibility(i1);
        l.setVisibility(i1);
        if (i1 == 8)
        {
            ((android.widget.LinearLayout.LayoutParams)findViewById(0x7f1102b4).getLayoutParams()).topMargin = getResources().getDimensionPixelOffset(0x7f0c012e);
        }
    }

    public final void a(String s)
    {
        k.setText(s);
        l.setText(s);
        fsr.a(k, n);
        fsr.a(l, n);
    }

    public void finish()
    {
        if (!TextUtils.isEmpty(i))
        {
            Object obj = i;
            obj = new ContentValues();
            ((ContentValues) (obj)).put(i, Boolean.valueOf(false));
            getContentResolver().update(dtx.a, ((ContentValues) (obj)), null, null);
        }
        super.finish();
    }

    public void onBackPressed()
    {
        fop.a(this, d, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.ak));
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        int i1 = 0;
        super.onCreate(bundle);
        Object obj1 = getIntent();
        d = (Verified)((Intent) (obj1)).getParcelableExtra("view_uri");
        Object obj = ((Intent) (obj1)).getStringExtra("reason");
        i = ((Intent) (obj1)).getStringExtra("set_setting_to_false_on_destroy");
        setContentView(0x7f03002d);
        j = findViewById(0x7f1102b9);
        j.setOnClickListener(new android.view.View.OnClickListener() {

            private PremiumUpsellInterstitialActivity a;

            public final void onClick(View view)
            {
                PremiumUpsellInterstitialActivity.a(a);
            }

            
            {
                a = PremiumUpsellInterstitialActivity.this;
                super();
            }
        });
        obj1 = (TextView)findViewById(0x7f1102c4);
        boolean flag;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            ((TextView) (obj1)).setText(((CharSequence) (obj)));
        } else
        {
            ((TextView) (obj1)).setVisibility(8);
        }
        if (bundle == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            bundle = (ViewGroup)findViewById(0x7f1102b1);
            int j1 = bundle.getChildCount();
            long l2;
            for (long l1 = 300L; i1 < j1; l1 = l2)
            {
                obj = bundle.getChildAt(i1);
                l2 = l1;
                if (((View) (obj)).getVisibility() == 0)
                {
                    obj1 = new AlphaAnimation(0.0F, 1.0F);
                    ((AlphaAnimation) (obj1)).setStartOffset(l1);
                    ((AlphaAnimation) (obj1)).setDuration(300L);
                    ((View) (obj)).startAnimation(((android.view.animation.Animation) (obj1)));
                    l2 = l1 + 50L;
                }
                i1++;
            }

            n = fyw.a(this);
        } else
        {
            n = fyw.a(bundle);
        }
        bundle = d;
        obj = n;
        k = (TextView)findViewById(0x7f1102c7);
        l = (TextView)findViewById(0x7f1102ca);
        k.setVisibility(8);
        l.setVisibility(8);
        dmz.a(fsd);
        m = fsd.a(this, "info", flag, this, ((Flags) (obj)), Reason.m, bundle, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, "full-page");
        bundle = new android.view.View.OnClickListener() {

            private PremiumUpsellInterstitialActivity a;

            public final void onClick(View view)
            {
                PremiumUpsellInterstitialActivity.b(a).c();
            }

            
            {
                a = PremiumUpsellInterstitialActivity.this;
                super();
            }
        };
        k.setOnClickListener(bundle);
        l.setOnClickListener(bundle);
        super.e = ggn.a(this, d);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        m.d();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("FlagsArgumentHelper.Flags", n);
    }

    protected void onStart()
    {
        super.onStart();
        h.a(m);
    }

    protected void onStop()
    {
        if (h != null)
        {
            h.b(m);
        }
        super.onStop();
    }
}
