// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.android.paste.widget.ViewPagerIndicator;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.AutoScrollingViewPager;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import ctz;
import dgo;
import dmz;
import edb;
import fop;
import fou;
import frf;
import frh;
import fsc;
import fsd;
import fsr;
import fsv;
import fys;
import fyw;
import gaj;
import gaz;
import gcg;
import gcz;
import ggn;

// Referenced classes of package com.spotify.mobile.android.ui.activity.upsell:
//            Reason, UpsellDialogPagerAdapter, CheckOptInTrialEligibilityTask

public class UpsellDialogActivity extends fou
{

    private Uri d;
    private Button i;
    private Button j;
    private AutoScrollingViewPager k;
    private frf l;
    private Flags m;
    private fsc n;
    private final android.view.View.OnClickListener o = new android.view.View.OnClickListener() {

        private UpsellDialogActivity a;

        public final void onClick(View view)
        {
            UpsellDialogActivity.a(a);
            a.finish();
        }

            
            {
                a = UpsellDialogActivity.this;
                super();
            }
    };
    private final fsv p = new fsv() {

        private UpsellDialogActivity a;

        public final void a(int i1)
        {
            if (i1 == 0)
            {
                UpsellDialogActivity.a(UpsellDialogActivity.b(a));
                UpsellDialogActivity.a(UpsellDialogActivity.c(a));
            }
        }

        public final void a(String s)
        {
            UpsellDialogActivity.b(a).setText(s);
            UpsellDialogActivity.a(UpsellDialogActivity.b(a), UpsellDialogActivity.c(a));
        }

            
            {
                a = UpsellDialogActivity.this;
                super();
            }
    };

    public UpsellDialogActivity()
    {
        dmz.a(fop);
    }

    public static Intent a(Context context, Reason reason, String s, Flags flags, String s1)
    {
        ctz.a(context);
        context = new Intent(context, com/spotify/mobile/android/ui/activity/upsell/UpsellDialogActivity);
        context.putExtra("type", reason);
        context.putExtra("shuffle_content_uri", s);
        context.putExtra("country", s1);
        fyw.a(context, flags);
        return context;
    }

    static void a(View view)
    {
        if (view.getVisibility() != 0)
        {
            view.setAlpha(0.0F);
            view.setVisibility(0);
            view.animate().alpha(1.0F).setDuration(800L).start();
        }
    }

    static void a(TextView textview, TextView textview1)
    {
        a(textview, textview1, true);
    }

    private static void a(TextView textview, TextView textview1, boolean flag)
    {
        fsr.a(textview, textview1, "use-text-shrinking", flag);
    }

    static void a(UpsellDialogActivity upselldialogactivity)
    {
        upselldialogactivity.f();
    }

    static Button b(UpsellDialogActivity upselldialogactivity)
    {
        return upselldialogactivity.i;
    }

    static Button c(UpsellDialogActivity upselldialogactivity)
    {
        return upselldialogactivity.j;
    }

    private void f()
    {
        if (n != null)
        {
            n.a();
            return;
        } else
        {
            ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.Y);
            fop.a(this, ViewUri.aG, l.d, clientevent);
            return;
        }
    }

    private Verified g()
    {
        if (frh.a(this, Reason.d, m))
        {
            return ViewUri.aW;
        }
        if (((Boolean)m.a(fys.ag)).booleanValue())
        {
            return ViewUri.aV;
        } else
        {
            return ViewUri.aJ;
        }
    }

    public void onBackPressed()
    {
        f();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle)
    {
        Object obj;
        boolean flag;
        super.onCreate(bundle);
        setResult(0);
        m = fyw.a(this);
        getIntent().setExtrasClassLoader(com/spotify/mobile/android/ui/activity/upsell/Reason.getClassLoader());
        Reason reason = (Reason)getIntent().getSerializableExtra("type");
        Assertion.b(Reason.b, reason);
        Assertion.b(Reason.a, reason);
        obj = getIntent().getStringExtra("shuffle_content_uri");
        if (bundle != null)
        {
            obj = bundle.getString("shuffle_content_uri");
        }
        final class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[Reason.values().length];
                try
                {
                    a[Reason.d.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[Reason.l.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[Reason.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[Reason.f.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[Reason.g.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[Reason.c.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[Reason.h.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Reason.i.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Reason.j.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Reason.k.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        Object obj1;
        Flags flags;
        boolean flag3;
        if (obj != null)
        {
            obj = Uri.parse(((String) (obj)));
        } else
        {
            obj = null;
        }
        d = ((Uri) (obj));
        flag = true;
        _cls4.a[reason.ordinal()];
        JVM INSTR tableswitch 1 10: default 160
    //                   1 748
    //                   2 823
    //                   3 883
    //                   4 899
    //                   5 915
    //                   6 931
    //                   7 967
    //                   8 983
    //                   9 999
    //                   10 1015;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_1015;
_L1:
        Assertion.a((new StringBuilder("Bad upsell dialog reason ")).append(reason).toString());
        obj = null;
_L12:
        l = ((frf) (obj));
        obj = getIntent().getStringExtra("country");
        com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview;
        Verified verified;
        int i1;
        int j1;
        boolean flag1;
        boolean flag2;
        if (bundle == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle = l;
        setContentView(0x7f030038);
        if (((gcz)dmz.a(gcz)).c() >= getResources().getDimensionPixelSize(0x7f0c0163))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        bundle = new UpsellDialogPagerAdapter(this, flag1, ((frf) (bundle)).a, ((frf) (bundle)).b, reason, m, ((String) (obj)));
        k = (AutoScrollingViewPager)findViewById(0x7f1102e1);
        k.a(bundle);
        flag2 = UpsellDialogPagerAdapter.a(((UpsellDialogPagerAdapter) (bundle)).b);
        i1 = ((UpsellDialogPagerAdapter) (bundle)).b.length;
        bundle = (ViewPagerIndicator)findViewById(0x7f1102e2);
        bundle.a(k);
        if (flag2)
        {
            dgo.a(k, gcg.a(this, 0x7f020278));
        } else
        {
            gaz gaz1 = new gaz(i1, getResources().getDimensionPixelSize(0x7f0c0162));
            dgo.a(k, gaz1);
            bundle.a(gaz1);
        }
        if (!flag1)
        {
            obj = k.getLayoutParams();
            obj.height = ((android.view.ViewGroup.LayoutParams) (obj)).height - getResources().getDimensionPixelOffset(0x7f0c0166);
        }
        i = (Button)findViewById(0x7f1102ae);
        j = (Button)findViewById(0x7f1102e3);
        j.setOnClickListener(o);
        flag1 = ((ClientInfo)dmz.a(com/spotify/mobile/android/util/ClientInfo)).a();
        if (reason == Reason.d && ((Boolean)m.a(fys.ag)).booleanValue())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        flag3 = frh.a(this, reason, m);
        if (i1 != 0 && flag1 || flag3)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (CheckOptInTrialEligibilityTask.a() == CheckOptInTrialEligibilityTask.State.b || flag1 || i1 != 0)
        {
            obj = i;
            obj1 = p;
            flags = m;
            ((Button) (obj)).setVisibility(4);
            dmz.a(fsd);
            obj1 = fsd.a(this, "paywall", flag, ((fsv) (obj1)), flags, reason, l.c, l.d, "popup");
            ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener(((fsc) (obj1))) {

                private fsc a;
                private UpsellDialogActivity b;

                public final void onClick(View view)
                {
                    a.c();
                    b.finish();
                }

            
            {
                b = UpsellDialogActivity.this;
                a = fsc1;
                super();
            }
            });
            n = ((fsc) (obj1));
            i1 = 1;
        } else
        {
            i.setText(0x7f0805af);
            i.setOnClickListener(o);
            i1 = 0;
            a(i, j, false);
            i.setVisibility(0);
            j.setVisibility(0);
        }
        j1 = getResources().getDimensionPixelSize(0x7f0c0090);
        if (i1 != 0)
        {
            i1 = j1 / 2;
        } else
        {
            if (flag2)
            {
                i1 = j1 / 2;
                ((android.view.ViewGroup.MarginLayoutParams)i.getLayoutParams()).bottomMargin = j1 / 4;
            } else
            {
                i1 = getResources().getDimensionPixelOffset(0x7f0c0164) + j1;
                android.view.ViewGroup.LayoutParams layoutparams = k.getLayoutParams();
                layoutparams.height = layoutparams.height + i1;
            }
            j.setVisibility(8);
        }
        ((android.view.ViewGroup.MarginLayoutParams)i.getLayoutParams()).topMargin = -i1;
        obj = (android.view.ViewGroup.MarginLayoutParams)bundle.getLayoutParams();
        obj.bottomMargin = i1 + ((android.view.ViewGroup.MarginLayoutParams) (obj)).bottomMargin;
        k.setPadding(k.getPaddingLeft(), k.getPaddingTop(), k.getPaddingRight(), ((android.view.ViewGroup.MarginLayoutParams) (obj)).bottomMargin + bundle.a());
        super.e = ggn.a(this, l.c);
        if (flag && n == null)
        {
            bundle = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R);
            fop.a(this, ViewUri.aG, l.d, bundle);
        }
        return;
_L2:
        if (((Boolean)m.a(fys.ag)).booleanValue() || frh.a(this, Reason.d, m))
        {
            i1 = 0x7f0805de;
        } else
        {
            i1 = 0x7f0805dd;
        }
        obj = g();
        subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.j;
_L13:
        obj = new frf(flag, i1, ((Verified) (obj)), subview, (byte)0);
          goto _L12
_L3:
        if (((Boolean)m.a(fys.ag)).booleanValue() || frh.a(this, Reason.d, m))
        {
            i1 = 0x7f0805de;
        } else
        {
            i1 = 0x7f0805dd;
        }
        obj = g();
        subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.j;
          goto _L13
_L4:
        obj = ViewUri.aK;
        subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.l;
        i1 = 0x7f0805d2;
          goto _L13
_L5:
        obj = ViewUri.aL;
        subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.m;
        i1 = 0x7f0805d6;
          goto _L13
_L6:
        obj = ViewUri.aI;
        subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.q;
        i1 = 0x7f0805d4;
          goto _L13
_L7:
        i1 = 0x7f0805e3;
        verified = ViewUri.aI;
        if (d == null)
        {
            obj = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.n;
        } else
        {
            obj = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.q;
        }
        subview = ((com.spotify.mobile.android.util.viewuri.ViewUri.SubView) (obj));
        obj = verified;
          goto _L13
_L8:
        obj = ViewUri.aN;
        subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.o;
        i1 = 0x7f0805b7;
          goto _L13
_L9:
        obj = ViewUri.aH;
        subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.p;
        i1 = 0x7f0805be;
          goto _L13
_L10:
        obj = ViewUri.aO;
        subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.z;
        i1 = 0x7f0805e0;
          goto _L13
        flag = false;
        obj = ViewUri.aQ;
        subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.T;
        i1 = 0;
          goto _L13
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (k != null)
        {
            gaj.b(k.e);
        }
        if (n != null)
        {
            n.d();
        }
    }

    protected void onPause()
    {
        super.onPause();
        if (k != null)
        {
            gaj.a(k.e);
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (k != null)
        {
            k.e.a();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (d != null)
        {
            bundle.putString("shuffle_content_uri", d.toString());
        }
    }

    protected void onStart()
    {
        super.onStart();
        if (n != null)
        {
            h.a(n);
        }
    }

    protected void onStop()
    {
        if (h != null && n != null)
        {
            h.b(n);
        }
        super.onStop();
    }
}
