// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import de;
import dmz;
import edb;
import fou;
import frx;
import fry;
import frz;
import fsa;
import fsb;
import fsf;
import fsi;
import fsr;
import fys;
import fyw;
import ggn;

public class PremiumInAppDestinationActivity extends fou
    implements fsb
{

    private Verified d;
    private View i;
    private TextView j;
    private TextView k;
    private fsa l;
    private TextView m;
    private TextView n;
    private TextView o;
    private Flags p;

    public PremiumInAppDestinationActivity()
    {
        d = ViewUri.aT;
    }

    public static Intent a(Context context, Flags flags)
    {
        context = new Intent(context, com/spotify/mobile/android/ui/activity/upsell/premiumdestination/PremiumInAppDestinationActivity);
        fyw.a(context, flags);
        return context;
    }

    static fsa a(PremiumInAppDestinationActivity premiuminappdestinationactivity)
    {
        return premiuminappdestinationactivity.l;
    }

    public final void a(int i1)
    {
        j.setVisibility(i1);
        k.setVisibility(i1);
        if (i1 == 8)
        {
            ((android.widget.LinearLayout.LayoutParams)findViewById(0x7f1102b4).getLayoutParams()).topMargin = getResources().getDimensionPixelOffset(0x7f0c012e);
        }
    }

    public final void a(String s)
    {
        j.setText(s);
        k.setText(s);
        fsr.a(j, p);
        fsr.a(k, p);
    }

    public final void b(int i1)
    {
        m.setVisibility(i1);
    }

    public final void b(String s)
    {
        m.setText(s);
    }

    public final void c(String s)
    {
        n.setText(s);
    }

    public final void d(String s)
    {
        o.setText(s);
    }

    public void dismiss()
    {
        finish();
    }

    public void onBackPressed()
    {
        l.b();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03002d);
        i = findViewById(0x7f1102b9);
        m = (TextView)findViewById(0x7f1102c4);
        View view = findViewById(0x7f1102c5);
        View view1 = findViewById(0x7f1102c8);
        TextView textview = (TextView)findViewById(0x7f1102c6);
        TextView textview1 = (TextView)findViewById(0x7f1102c9);
        j = (TextView)findViewById(0x7f1102c7);
        k = (TextView)findViewById(0x7f1102ca);
        n = (TextView)findViewById(0x7f1102ad);
        o = (TextView)findViewById(0x7f1102a3);
        p = null;
        Object obj;
        Object obj1;
        fsf fsf1;
        boolean flag;
        if (bundle != null)
        {
            p = fyw.a(bundle);
        } else
        {
            p = fyw.a(this);
        }
        obj = new fry(this);
        p.a(fys.aM);
        obj1 = com.spotify.mobile.android.ui.activity.dialog.trialactivation.TrialActivationActivity.OptInTrialActivationFlow.b;
        obj1 = new frx(this, p);
        fsf1 = new fsf(Cosmos.getResolver(this), de.a(this));
        dmz.a(fsi);
        obj1 = new frz(((frx) (obj1)), fsf1, fsi.a(this));
        if (bundle == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = new fsa(this, ((frz) (obj1)), flag, d, ((fry) (obj)));
        i.setOnClickListener(new android.view.View.OnClickListener() {

            private PremiumInAppDestinationActivity a;

            public final void onClick(View view3)
            {
                PremiumInAppDestinationActivity.a(a).a();
            }

            
            {
                a = PremiumInAppDestinationActivity.this;
                super();
            }
        });
        obj = new android.view.View.OnClickListener() {

            private PremiumInAppDestinationActivity a;

            public final void onClick(View view3)
            {
                PremiumInAppDestinationActivity.a(a).c();
            }

            
            {
                a = PremiumInAppDestinationActivity.this;
                super();
            }
        };
        j.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        k.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        if (bundle == null)
        {
            bundle = (ViewGroup)findViewById(0x7f1102b1);
            long l1 = 300L;
            int j1 = bundle.getChildCount();
            for (int i1 = 0; i1 < j1;)
            {
                View view2 = bundle.getChildAt(i1);
                long l2 = l1;
                if (view2.getVisibility() == 0)
                {
                    AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
                    alphaanimation.setStartOffset(l1);
                    alphaanimation.setDuration(300L);
                    view2.startAnimation(alphaanimation);
                    l2 = l1 + 50L;
                }
                i1++;
                l1 = l2;
            }

        }
        textview.setVisibility(8);
        textview1.setVisibility(8);
        view.setVisibility(8);
        view1.setVisibility(8);
        j.setVisibility(8);
        k.setVisibility(8);
        super.e = ggn.a(this, d);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        l.d();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putParcelable("FlagsArgumentHelper.Flags", p);
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        h.a(l);
    }

    protected void onStop()
    {
        super.onStop();
        if (h != null)
        {
            h.b(l);
        }
    }
}
