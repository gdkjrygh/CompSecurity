// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.provider.PaymentState;
import com.spotify.mobile.android.service.LoginActivity;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.activityfeed.ActivityFeedFragment;
import com.spotify.mobile.android.ui.ActionBarManager;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.HashMap;

public final class fya extends al
    implements dwx, eda
{

    private static final String ai[] = {
        "capping_enabled", "total_playback_time", "should_show_remaining_time", "remaining_playback_time"
    };
    public fop Y;
    public Flags Z;
    public edk aa;
    public final edm ab = new edm() {

        private fya a;

        public final void a()
        {
            if (fya.a(a).containsKey(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.g))
            {
                ((ftd)fya.a(a).get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.g)).k = 0;
                fya.b(a).notifyDataSetChanged();
            }
        }

        public final void a(int i)
        {
            if (fya.a(a).containsKey(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.g))
            {
                ((ftd)fya.a(a).get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.g)).k = i;
                fya.b(a).notifyDataSetChanged();
            }
        }

            
            {
                a = fya.this;
                super();
            }
    };
    public an ac;
    private boolean ad;
    private View ae;
    private View af;
    private View ag;
    private TextView ah;
    private String aj;
    private PaymentState ak;
    private HashMap al;
    private fte am;
    private ftc an;
    private ftd ao;
    private fol ap;
    public Fragment b;

    public fya()
    {
        Y = (fop)dmz.a(fop);
        al = new HashMap();
        ac = new an() {

            private fya a;

            public final da a(Bundle bundle)
            {
                bundle = dtn.a;
                return new cu(a.k(), bundle, fya.H(), null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                if (((Cursor) (obj)).moveToFirst())
                {
                    fya fya1;
                    int i;
                    int j;
                    boolean flag;
                    if (((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("capping_enabled")) != 0)
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    if (((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("should_show_remaining_time")) != 0)
                    {
                        j = 1;
                    } else
                    {
                        j = 0;
                    }
                    fya1 = a;
                    if (i != 0 && j != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    fya.a(fya1, flag);
                    if (fya.d(a))
                    {
                        j = ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("remaining_playback_time"));
                        i = j / 3600;
                        j = (j - i * 3600) / 60;
                        obj = a.l();
                        fya.e(a).setText((new StringBuilder()).append(((Resources) (obj)).getString(0x7f08015e)).append(" ").append(((Resources) (obj)).getQuantityString(0x7f090004, i, new Object[] {
                            Integer.valueOf(i)
                        })).append(" ").append(((Resources) (obj)).getQuantityString(0x7f090005, j, new Object[] {
                            Integer.valueOf(j)
                        })).toString());
                    }
                    fya.f(a);
                }
            }

            
            {
                a = fya.this;
                super();
            }
        };
        ap = new fol() {

            private fya a;

            public final void a(Fragment fragment)
            {
                fya.a(a, fragment);
            }

            
            {
                a = fya.this;
                super();
            }
        };
    }

    static String[] H()
    {
        return ai;
    }

    private void I()
    {
        int i;
        i = 0x7f0801ae;
        if (am == null)
        {
            am = new fte(k(), an);
            a(am);
        }
        am.setNotifyOnChange(false);
        am.clear();
        if (!((Boolean)Z.a(fys.y)).booleanValue()) goto _L2; else goto _L1
_L1:
        Object obj = (String)Z.a(fys.z);
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 2: default 120
    //                   -1395042733: 613
    //                   -672254665: 628;
           goto _L3 _L4 _L5
_L3:
        byte byte0 = -1;
_L10:
        byte0;
        JVM INSTR tableswitch 0 1: default 148
    //                   0 643
    //                   1 783;
           goto _L6 _L7 _L8
_L6:
        obj = am;
        ftd ftd1 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.b);
        ftd1.i = false;
        ((fte) (obj)).add(ftd1);
        if (((Integer)Z.a(fys.ax)).intValue() == 2 || ((Integer)Z.a(fys.ax)).intValue() == 3 || ((Integer)Z.a(fys.ax)).intValue() == 1)
        {
            obj = am;
            ftd1 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.c);
            ftd1.j = false;
            ((fte) (obj)).add(ftd1);
        }
        if (((Boolean)Z.a(fys.N)).booleanValue())
        {
            obj = am;
            ftd1 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.r);
            ftd1.j = false;
            ((fte) (obj)).add(ftd1);
        }
        if (((Boolean)Z.a(fys.au)).booleanValue())
        {
            obj = am;
            ftd1 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.n);
            ftd1.j = false;
            ((fte) (obj)).add(ftd1);
        }
        if (((Boolean)Z.a(fys.at)).booleanValue())
        {
            obj = am;
            ftd1 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.o);
            ftd1.j = false;
            ((fte) (obj)).add(ftd1);
        }
        if (((Boolean)Z.a(fys.N)).booleanValue())
        {
            obj = am;
            ftd1 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.p);
            ftd1.j = false;
            ((fte) (obj)).add(ftd1);
            obj = am;
            ftd1 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.q);
            ftd1.j = false;
            ((fte) (obj)).add(ftd1);
        }
        if (!fiy.a(Z))
        {
            i = 0x7f0801ad;
        }
        obj = am;
        ftd1 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.j);
        ftd1.j = false;
        ftd1.g = i;
        ((fte) (obj)).add(ftd1);
        if (((String)Z.a(fys.aG)).equals("Enabled"))
        {
            obj = am;
            ftd1 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.t);
            ftd1.j = false;
            ((fte) (obj)).add(ftd1);
        }
_L12:
        am.setNotifyOnChange(true);
        am.notifyDataSetChanged();
        return;
_L4:
        if (!((String) (obj)).equals("Moments")) goto _L3; else goto _L9
_L9:
        byte0 = 0;
          goto _L10
_L5:
        if (!((String) (obj)).equals("Intents")) goto _L3; else goto _L11
_L11:
        byte0 = 1;
          goto _L10
_L7:
        obj = am;
        ftd1 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.b);
        ftd1.i = false;
        ((fte) (obj)).add(ftd1);
        obj = am;
        ftd1 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.w);
        ftd1.j = false;
        ((fte) (obj)).add(ftd1);
        obj = am;
        ftd1 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.u);
        ftd1.j = false;
        ((fte) (obj)).add(ftd1);
        if (!fiy.a(Z))
        {
            i = 0x7f0801ad;
        }
        obj = am;
        ftd1 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.j);
        ftd1.j = false;
        ftd1.g = i;
        ((fte) (obj)).add(ftd1);
        break MISSING_BLOCK_LABEL_597;
_L8:
        obj = am;
        ftd1 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.b);
        ftd1.i = false;
        ((fte) (obj)).add(ftd1);
        obj = am;
        ftd1 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.x);
        ftd1.j = false;
        ((fte) (obj)).add(ftd1);
        obj = am;
        ftd1 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.v);
        ftd1.j = false;
        ((fte) (obj)).add(ftd1);
        if (!fiy.a(Z))
        {
            i = 0x7f0801ad;
        }
        obj = am;
        ftd1 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.j);
        ftd1.j = false;
        ftd1.g = i;
        ((fte) (obj)).add(ftd1);
        break MISSING_BLOCK_LABEL_597;
_L2:
        fte fte1 = am;
        ftd ftd2 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.b);
        ftd2.i = true;
        fte1.add(ftd2);
        fte1 = am;
        ftd2 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.d);
        ftd2.j = true;
        fte1.add(ftd2);
        if (!evm.b(Z))
        {
            fte1 = am;
            ftd2 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.g);
            ftd2.j = true;
            fte1.add(ftd2);
        }
        fte1 = am;
        ftd2 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.i);
        ftd2.j = true;
        fte1.add(ftd2);
        if (((Boolean)Z.a(fys.au)).booleanValue())
        {
            fte1 = am;
            ftd2 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.n);
            ftd2.j = true;
            fte1.add(ftd2);
        }
        if (((Boolean)Z.a(fys.at)).booleanValue())
        {
            fte1 = am;
            ftd2 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.o);
            ftd2.j = true;
            fte1.add(ftd2);
        }
        if (!fiy.a(Z))
        {
            i = 0x7f0801ad;
        }
        fte1 = am;
        ftd2 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.j);
        ftd2.j = true;
        ftd2.g = i;
        fte1.add(ftd2);
        if (((String)Z.a(fys.aG)).equals("Enabled"))
        {
            fte fte2 = am;
            ftd ftd3 = (ftd)al.get(com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.t);
            ftd3.j = true;
            fte2.add(ftd3);
        }
          goto _L12
    }

    private void J()
    {
        Object obj = ah;
        int i;
        if (ad)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((TextView) (obj)).setVisibility(i);
        obj = ae;
        if (ad)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        af.setVisibility(0);
        ag.setVisibility(8);
    }

    static HashMap a(fya fya1)
    {
        return fya1.al;
    }

    private void a(Fragment fragment)
    {
        if (fragment instanceof NavigationItem)
        {
            fragment = ((NavigationItem)fragment).A_();
        } else
        {
            fragment = com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.a;
        }
        if (ao != null)
        {
            ao.d = false;
        }
        if (al.containsKey(fragment))
        {
            ao = (ftd)al.get(fragment);
            ftd ftd1 = ao;
            if (fragment == ftd1.b)
            {
                ftd1.d = true;
            } else
            {
                ftd1.d = false;
            }
        }
        am.notifyDataSetChanged();
    }

    private void a(ftd ftd1)
    {
        al.put(ftd1.b, ftd1);
    }

    static void a(fya fya1, Fragment fragment)
    {
        fya1.a(fragment);
    }

    static boolean a(fya fya1, boolean flag)
    {
        fya1.ad = flag;
        return flag;
    }

    static fte b(fya fya1)
    {
        return fya1.am;
    }

    public static fya b(Flags flags)
    {
        fya fya1 = new fya();
        fyw.a(fya1, flags);
        return fya1;
    }

    private void b(View view)
    {
        if (((Boolean)Z.a(fys.y)).booleanValue())
        {
            view.setBackgroundResource(0x7f0f0080);
        } else
        {
            android.graphics.drawable.Drawable drawable = dgo.a(k(), 0x7f0101ce);
            if (gcl.a)
            {
                view.setBackgroundDrawable(drawable);
            } else
            {
                view.setBackground(drawable);
            }
        }
        view.requestLayout();
    }

    private void b(SessionState sessionstate)
    {
        ak = sessionstate.l;
        aj = sessionstate.m;
    }

    private void c(View view)
    {
        if (((Boolean)Z.a(fys.y)).booleanValue())
        {
            int i;
            if (gfv.b(k()))
            {
                i = gfv.c(k());
            } else
            {
                i = 0;
            }
            view.setPadding(0, i, 0, 0);
        } else
        {
            view.setPadding(0, ActionBarManager.a(k()), 0, 0);
        }
        view.requestLayout();
    }

    static void c(fya fya1)
    {
        fop.a(fya1.k(), ViewUri.c, com.spotify.mobile.android.util.ClientEvent.SubEvent.A);
        Intent intent = gms.a(fya1.k()).a;
        intent.putExtra("extra_manual_login", true);
        fya1.a(LoginActivity.a(fya1.k(), intent));
        fya1.k().finish();
    }

    static boolean d(fya fya1)
    {
        return fya1.ad;
    }

    static TextView e(fya fya1)
    {
        return fya1.ah;
    }

    static void f(fya fya1)
    {
        fya1.J();
    }

    public final void A()
    {
        super.A();
        aa.b();
    }

    public final void B()
    {
        super.B();
        ((fpe)k()).R_().b(ap);
        am.clear();
        al.clear();
        aa.c();
    }

    public final am G()
    {
        return ((gnb)dmz.a(gnb)).a(this);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Z = fyw.a(this);
        layoutinflater = layoutinflater.inflate(0x7f0300e8, viewgroup, false);
        b(layoutinflater);
        c(layoutinflater);
        int i;
        if (bundle != null)
        {
            if (bundle.containsKey("key_current_product"))
            {
                aj = bundle.getString("key_current_product");
            }
            if (bundle.containsKey("key_current_payment_state"))
            {
                ak = new PaymentState(bundle.getString("key_current_payment_state"));
            }
            if (bundle.containsKey("key_current_flags_config"))
            {
                Z = (Flags)bundle.getParcelable("key_current_flags_config");
            }
        } else
        {
            viewgroup = edb.a(k());
            if (viewgroup != null && viewgroup.c())
            {
                b(viewgroup.h());
            }
        }
        aa = new edk(k());
        a(new ftd(0x7f1100cc, com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.b, SpotifyIcon.N, 0x7f080469, "spotify:search", ViewUri.T, false));
        a(new ftd(0x7f1100c4, com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.c, SpotifyIcon.bp, 0x7f08035d, ViewUri.j.toString(), ViewUri.j, false));
        a(new ftd(0x7f1100b9, com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.d, SpotifyIcon.g, 0x7f080159, "spotify:app:browse", ViewUri.r, false));
        a(new ftd(0x7f1100b8, com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.g, SpotifyIcon.t, 0x7f08004d, (String)ActivityFeedFragment.a.get(com.spotify.mobile.android.spotlets.activityfeed.ActivityFeedFragment.Type.a.mIndex), ViewUri.q, true));
        a(new ftd(0x7f1100d0, com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.h, SpotifyIcon.al, 0x7f08030f, "spotify:internal:startpage", ViewUri.i, false));
        a(new ftd(0x7f1100cb, com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.n, SpotifyIcon.bs, 0x7f080654, ViewUri.l.toString(), ViewUri.l, false));
        a(new ftd(0x7f1100c6, com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.o, SpotifyIcon.bv, 0x7f080314, ViewUri.m.toString(), ViewUri.m, false));
        viewgroup = com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.j;
        bundle = SpotifyIcon.o;
        if (fiy.a(Z))
        {
            i = 0x7f0801ae;
        } else
        {
            i = 0x7f0801ad;
        }
        a(new ftd(0x7f1100bb, viewgroup, bundle, i, ViewUri.bj.toString(), ViewUri.bj, false));
        a(new ftd(0x7f1100c0, com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.k, SpotifyIcon.w, 0x7f080322, "spotify:internal:inbox", ViewUri.G, false));
        a(new ftd(0x7f1100ca, com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.i, SpotifyIcon.K, 0x7f080442, "spotify:internal:radio", ViewUri.h, false));
        a(new ftd(0x7f1100bc, com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.m, SpotifyIcon.u, 0x7f0804b1, "spotify:internal:preferences", ViewUri.H, false));
        a(new ftd(0x7f1100c8, com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.s, SpotifyIcon.bt, 0x7f080319, "spotify:internal:premiuminappdestination", ViewUri.aT, false));
        a(new ftd(0x7f1100c2, com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.p, SpotifyIcon.g, 0x7f080313, "spotify:hub:music", ViewUri.z.a("spotify:hub:music"), false));
        a(new ftd(0x7f1100c3, com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.q, SpotifyIcon.aX, 0x7f080316, "spotify:hub:shows", ViewUri.A.a("spotify:hub:shows"), false));
        a(new ftd(0x7f1100c1, com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.r, SpotifyIcon.bc, 0x7f080311, "spotify:hub:moments", ViewUri.y.a("spotify:hub:moments"), false));
        a(new ftd(0x7f1100be, com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.t, SpotifyIcon.aq, 0x7f0802c5, ers.a, ViewUri.Q, false));
        a(new ftd(0x7f1100c5, com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.w, SpotifyIcon.bc, 0x7f08053d, "spotify:navigation:moods-moments", ViewUri.f, false));
        a(new ftd(0x7f1100ba, com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.u, SpotifyIcon.bc, 0x7f08052d, "spotify:navigation:categories-charts", ViewUri.d, false));
        a(new ftd(0x7f1100c7, com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.x, SpotifyIcon.bc, 0x7f08053f, "spotify:navigation:play-music", ViewUri.g, false));
        a(new ftd(0x7f1100bf, com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.v, SpotifyIcon.bc, 0x7f08052f, "spotify:navigation:genres-inspiration", ViewUri.e, false));
        I();
        viewgroup = (fpe)k();
        if (viewgroup != null)
        {
            a(viewgroup.R_().b());
        }
        ((fpe)k()).R_().a(ap);
        ae = layoutinflater.findViewById(0x7f110443);
        af = layoutinflater.findViewById(0x7f11043f);
        ag = layoutinflater.findViewById(0x7f110440);
        ah = (TextView)ae.findViewById(0x7f110444);
        return layoutinflater;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        Z = fyw.a(this);
        G().a(0x7f110068, null, ac);
        an = new ftc(Z);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        b = n().a(0x7f11043f);
        if ((b == null || b.q()) && b == null)
        {
            b = fkn.a(Z);
            n().a().b(0x7f11043f, b, "tag_profile_panel_fragment").c();
        }
        ((ImageView)ag.findViewById(0x7f110441)).setImageDrawable(dff.f(k()));
        ag.setOnClickListener(new android.view.View.OnClickListener() {

            private fya a;

            public final void onClick(View view1)
            {
                fya.c(a);
            }

            
            {
                a = fya.this;
                super();
            }
        });
        J();
    }

    public final void a(ListView listview, View view, int i, long l)
    {
        view = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.h);
        listview = (ftd)am.getItem(i);
        view.a("target", ((ftd) (listview)).f.toString());
        fop.a(k(), ViewUri.c, view);
        if (((ftd) (listview)).b == com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.g)
        {
            listview.k = 0;
        }
        view = ((ftd) (listview)).e;
        if (((ftd) (listview)).a == 0x7f1100cc || ((ftd) (listview)).a == 0x7f1100bc || ((ftd) (listview)).a == 0x7f1100ba || ((ftd) (listview)).a == 0x7f1100bf || ((ftd) (listview)).a == 0x7f1100c5 || ((ftd) (listview)).a == 0x7f1100c7 || ((ftd) (listview)).a == 0x7f1100bb && fzp.b(Z))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            a(gms.a(k(), view).a);
            return;
        } else
        {
            a(gms.a(k(), view).a().a);
            return;
        }
    }

    public final void a(SessionState sessionstate)
    {
        b(sessionstate);
        I();
    }

    public final void a(Flags flags)
    {
        Z = flags;
        an.a = flags;
        I();
        J();
        b(y());
        c(y());
    }

    public final void c()
    {
        super.c();
        G().b(0x7f110068, null, ac);
    }

    public final void d()
    {
        super.d();
        G().a(0x7f110068);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putString("key_current_product", aj);
        if (ak != null)
        {
            bundle.putString("key_current_payment_state", ak.toString());
        }
        if (Z != null)
        {
            bundle.putParcelable("key_current_flags_config", Z);
        }
    }

    public final void z()
    {
        super.z();
        aa.a();
    }

}
