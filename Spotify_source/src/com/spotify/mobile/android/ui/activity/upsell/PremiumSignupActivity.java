// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell;

import aa;
import ah;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dkb;
import dkl;
import dmz;
import dwx;
import dxc;
import fop;
import fou;
import fqi;
import fqj;
import fqz;
import fra;
import fyw;
import ggn;

public class PremiumSignupActivity extends fou
    implements fqj
{

    private com.spotify.mobile.android.util.viewuri.ViewUri.SubView d;
    private dxc i;
    private Flags j;
    private fqi k;
    private dwx l;

    public PremiumSignupActivity()
    {
        dmz.a(fop);
        l = new dwx() {

            private PremiumSignupActivity a;

            public final void a(Flags flags)
            {
                PremiumSignupActivity.a(a, flags);
            }

            
            {
                a = PremiumSignupActivity.this;
                super();
            }
        };
    }

    static Flags a(PremiumSignupActivity premiumsignupactivity, Flags flags)
    {
        premiumsignupactivity.j = flags;
        return flags;
    }

    public static fqz a(Context context)
    {
        return new fqz(context, (byte)0);
    }

    static void a(PremiumSignupActivity premiumsignupactivity)
    {
        fop.a(premiumsignupactivity, ViewUri.aZ, premiumsignupactivity.d, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.g));
        premiumsignupactivity.finish();
    }

    private void b(String s)
    {
        findViewById(0x7f1102c3).setVisibility(8);
        s = fra.a(j, d, s);
        a_().a().a(0x7f1102c2, s, "premium_signup").c();
    }

    private fra f()
    {
        return (fra)a_().a("premium_signup");
    }

    public final void a()
    {
        b(null);
    }

    public final void a(String s)
    {
        b(s);
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i1 == 1)
        {
            fra fra1 = f();
            if (fra1 != null)
            {
                fra1.a(i1, j1, intent);
                return;
            }
        }
        super.onActivityResult(i1, j1, intent);
    }

    public void onBackPressed()
    {
        fra fra1 = f();
        if (fra1 != null && fra1.y_())
        {
            fop.a(this, ViewUri.aZ, d, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.ak));
            return;
        } else
        {
            fop.a(this, ViewUri.aZ, d, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.g));
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
label0:
        {
label1:
            {
                super.onCreate(bundle);
                setContentView(0x7f03002c);
                d = (com.spotify.mobile.android.util.viewuri.ViewUri.SubView)getIntent().getSerializableExtra("sub_view");
                String s = getIntent().getStringExtra("extra_title");
                if (s != null)
                {
                    ((TextView)findViewById(0x7f1102c1)).setText(s);
                }
                if (getIntent().getBooleanExtra("extra_can_observe_flags", false))
                {
                    i = new dxc(this);
                }
                if (bundle == null)
                {
                    j = fyw.a(this);
                    fop.a(this, ViewUri.aZ, d, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R));
                } else
                {
                    bundle.setClassLoader(getClassLoader());
                    j = fyw.a(bundle);
                }
                findViewById(0x7f1102b9).setOnClickListener(new android.view.View.OnClickListener() {

                    private PremiumSignupActivity a;

                    public final void onClick(View view)
                    {
                        PremiumSignupActivity.a(a);
                    }

            
            {
                a = PremiumSignupActivity.this;
                super();
            }
                });
                super.e = ggn.a(this, ViewUri.aZ);
                if (f() == null)
                {
                    if (!dkb.a(this).a())
                    {
                        break label0;
                    }
                    k = new fqi(this, this);
                    bundle = k;
                    if (((fqi) (bundle)).c.a())
                    {
                        break label1;
                    }
                    ((fqi) (bundle)).a.a();
                    bundle.b = true;
                }
                return;
            }
            if (!((fqi) (bundle)).d.a())
            {
                ((fqi) (bundle)).a.a();
                bundle.b = true;
                return;
            } else
            {
                ((fqi) (bundle)).e.a();
                return;
            }
        }
        b(null);
    }

    protected void onDestroy()
    {
        if (k != null)
        {
            fqi fqi1 = k;
            fqi1.b = true;
            fqi1.e.b();
            k = null;
        }
        super.onDestroy();
    }

    public void onPause()
    {
        if (i != null)
        {
            i.b(l);
            i.b();
        }
        super.onPause();
    }

    public void onResume()
    {
        if (i != null)
        {
            i.a();
            i.a(l);
        }
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("FlagsArgumentHelper.Flags", j);
    }
}
