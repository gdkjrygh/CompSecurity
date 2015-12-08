// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.home;

import am;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import ar;
import ay;
import b;
import bp;
import c;
import com.google.android.apps.photos.drawermenu.DrawerMenuFragment;
import com.google.android.apps.photos.onboarding.AccountPickerActivity;
import com.google.android.apps.photos.onboarding.IntroActivity;
import dge;
import dgg;
import dgk;
import dhb;
import dtf;
import dth;
import dtl;
import dtn;
import eas;
import eem;
import ekk;
import ekm;
import esn;
import fau;
import faz;
import fba;
import fen;
import ffr;
import fnt;
import fny;
import fod;
import foe;
import fof;
import fog;
import foh;
import foi;
import fok;
import foq;
import fpg;
import fpj;
import fpv;
import fyb;
import fyf;
import fyh;
import gaj;
import gcg;
import gdd;
import gef;
import ggi;
import ghi;
import gie;
import gii;
import gik;
import gil;
import gnw;
import gog;
import gqy;
import hfg;
import hfo;
import hth;
import hti;
import hyu;
import hyy;
import hzr;
import hzv;
import iae;
import iwd;
import iwq;
import iwu;
import iyf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jcl;
import mmr;
import mms;
import mmt;
import mmv;
import mmx;
import mmz;
import mpk;
import msz;
import mtj;
import nfw;
import ngk;
import nud;
import nug;
import nwm;
import nwn;
import nws;
import oin;
import oka;
import olm;
import ome;
import onh;
import s;
import sa;

public class HomeActivity extends ome
    implements ffr, fyh, mmt, nwn, oin
{

    private static final onh d = new onh("debug.photos.dogfood");
    private static final ekk e;
    private final nfw h;
    private final gil i;
    private final gie j;
    private final fba k;
    private final gog l;
    private final nwm m;
    private final fyf n;
    private final nug o = new foe(this);
    private dgk p;
    private hyy q;
    private View r;
    private DrawerLayout s;
    private DrawerMenuFragment t;
    private sa u;
    private boolean v;

    public HomeActivity()
    {
        h = (new nfw(this, g)).a(f).b(this);
        i = new gil(this, g);
        Object obj = new gie(this, g, new fod(this), c.cW, i);
        olm olm1 = f;
        olm1.a(gie, obj);
        olm1.a(ngk, obj);
        olm1.a(gii, ((gie) (obj)).a);
        j = ((gie) (obj));
        obj = new fba(g);
        f.a(fba, obj);
        k = ((fba) (obj));
        l = (new gog(this, g, c.cS, c.cT)).a(f);
        m = (new nws(this, g, this)).a(f);
        n = new fyf(this, g, this);
        new iae(this, g);
        (new dhb(this, g)).a(f);
        new hfo(this, g);
        new gdd(g);
        new fpv(g);
        obj = new hfg(g, this);
        f.a(hfg, obj);
        new fny(this, g);
        (new hzr(this, g)).a(f);
        new esn(g);
        (new fpj(g)).a(f);
        new fpg(this, g, c.cS);
        new fen(this, g);
        (new fnt(this, g)).a(f);
        (new oka(this, g)).a(f);
        (new iwd(this, c.cW)).a(f);
        new gef(g);
        (new gaj(this, g, c.cU, e)).a(f);
        obj = new eem(g);
        f.a(eem, obj);
        new gcg(g, (byte)0);
        new ggi(this, g);
        (new gqy()).a(f);
        new jcl(this, g);
        new hyu(g);
        obj = new eas(this, g);
        f.a(eas, obj);
        obj = new hti(this, g, c.cT);
        f.a(hth, obj);
        new fau(g);
        new iyf(g);
    }

    private void a(int i1)
    {
        j.a(i1);
    }

    public static void a(HomeActivity homeactivity)
    {
        homeactivity.h();
    }

    public static void b(HomeActivity homeactivity)
    {
        homeactivity.t.r();
    }

    public static boolean c(HomeActivity homeactivity)
    {
        return homeactivity.v;
    }

    public static void d(HomeActivity homeactivity)
    {
        homeactivity.i();
    }

    public static DrawerLayout e(HomeActivity homeactivity)
    {
        return homeactivity.s;
    }

    public static sa f(HomeActivity homeactivity)
    {
        return homeactivity.u;
    }

    private int g()
    {
        if ((getIntent().getFlags() & 0x100000) == 0x100000)
        {
            return -1;
        } else
        {
            return getIntent().getIntExtra("account_id", -1);
        }
    }

    public static DrawerMenuFragment g(HomeActivity homeactivity)
    {
        return homeactivity.t;
    }

    private void h()
    {
        mtj.a(this, new foh(this, false));
        i();
    }

    private void i()
    {
        if (j.c())
        {
            v = true;
            return;
        } else
        {
            v = false;
            c().a().b(c.cS, new fok(), "DrawerFragment").b();
            m.c();
            return;
        }
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        p = (dgk)f.a(dgk);
        q = (hyy)f.a(hyy);
        bundle = f;
        bundle.a(iwq, new iwu(this, c.cV));
        bundle.a(hzv, new foi(this));
        bundle.a(foq, new fof(this));
        bundle.a(ffr, this);
        bundle.a(oin, this);
        bundle.a("hide_dogfood_opt_in_dialog_pref_key", "photos_hide_dogfood_opt_in_dialog_pref_key");
        oqd oqd = g;
        olm olm1 = f;
        faz faz1 = faz.a(getIntent());
        bundle = null;
        if (faz1 == null || faz1 == faz.b)
        {
            bundle = new dtf(oqd);
        }
        if (bundle != null)
        {
            bundle.a(olm1);
        }
    }

    public final void a(boolean flag, mms mms1, mms mms2, int i1, int j1)
    {
        if (!flag)
        {
            getIntent().removeExtra("account_id");
            getIntent().removeExtra("com.google.android.apps.photos.destination.Destination");
            return;
        }
        if (mms2 != mms.b && mms2 != mms.a) goto _L2; else goto _L1
_L1:
        h();
_L4:
        t.r();
        return;
_L2:
        mms2 = n;
        if (((fyf) (mms2)).c.e())
        {
            ((fyf) (mms2)).b.a(new fyb(((fyf) (mms2)).c.d()));
        }
        mtj.a(this, new foh(this, true));
        i();
        int k1 = g();
        if (k1 != -1 && k1 == j1 && k1 != i1)
        {
            mms2 = getString(b.pY, new Object[] {
                h.g().b("account_name")
            });
            dgg dgg1 = p.a();
            dgg1.d = mms2;
            dgg1.a().c();
            getIntent().removeExtra("account_id");
        }
        mms2 = faz.a(getIntent());
        if (mms2 != null)
        {
            k.a(mms2, null);
            getIntent().removeExtra("com.google.android.apps.photos.destination.Destination");
        } else
        if (mms1 == mms.c)
        {
            k.a(faz.b, null);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void ae_()
    {
        if (s != null)
        {
            s.a(false);
        }
    }

    public final void f()
    {
        gie gie1 = j;
        Intent intent = new Intent(gie1.b, com/google/android/apps/photos/onboarding/AccountPickerActivity);
        intent.putExtra("show_account_list_opened", true);
        gie1.f.a(s.I, intent);
    }

    public void onBackPressed()
    {
        if (s.f(r))
        {
            s.e(r);
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        configuration = u;
        configuration.c();
        configuration.a();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            v = bundle.getBoolean("needs_replace_home_fragment");
        }
        Object obj = (dtf)f.b(dtf);
        if (obj != null)
        {
            ((dtf) (obj)).b.b(SystemClock.elapsedRealtime());
        }
        setContentView(b.pR);
        t = (DrawerMenuFragment)c().a(c.cP);
        t.e(false);
        if (bundle == null)
        {
            t.g_(false);
        }
        r = findViewById(c.cN);
        s = (DrawerLayout)findViewById(c.cO);
        u = new fog(this, this, s, b.pX, b.pW);
        s.e = u;
        obj = faz.a(getIntent());
        if (obj != null)
        {
            k.b = ((faz) (obj));
        }
        int i1 = g();
        if (i1 != -1)
        {
            a(i1);
        } else
        if (bundle == null)
        {
            bundle = j;
            if (!((gie) (bundle)).g.a(true) || gie.a())
            {
                ((gie) (bundle)).c.a();
                return;
            }
            if (((gie) (bundle)).b.getSharedPreferences("onboarding_prefs", 0).contains("sign_in"))
            {
                bundle.e();
                ((gie) (bundle)).d.a();
                return;
            }
            ((gie) (bundle)).i.a();
            int j1;
            for (Iterator iterator = ((gie) (bundle)).e.a().iterator(); iterator.hasNext(); ((gie) (bundle)).e.b(j1).g("logged_out").d())
            {
                j1 = ((Integer)iterator.next()).intValue();
            }

            Intent intent = new Intent(((gie) (bundle)).b, com/google/android/apps/photos/onboarding/IntroActivity);
            ((gie) (bundle)).f.a(s.Y, intent);
            return;
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
        int i1 = g();
        if (i1 != -1)
        {
            a(i1);
        } else
        {
            gie gie1 = j;
            if (!gie1.g.a(true) || gie.a())
            {
                gie1.c.a();
            } else
            if (gie1.b.getSharedPreferences("onboarding_prefs", 0).contains("sign_in"))
            {
                gie1.e();
                gie1.d.a();
            } else
            {
                gie1.i.a();
                int j1;
                for (Iterator iterator = gie1.e.a().iterator(); iterator.hasNext(); gie1.e.b(j1).g("logged_out").d())
                {
                    j1 = ((Integer)iterator.next()).intValue();
                }

                Intent intent1 = new Intent(gie1.b, com/google/android/apps/photos/onboarding/IntroActivity);
                gie1.f.a(s.Y, intent1);
            }
        }
        intent = faz.a(intent);
        if (intent != null)
        {
            k.a(intent, null);
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        q.a.a(o, true);
        HashMap hashmap = new HashMap();
        hashmap.put("&t", "screenview");
        hashmap.put("&cd", "HomeActivity");
        mtj.a(this, new dtl(dtn.c, hashmap));
    }

    protected void onStop()
    {
        super.onStop();
        q.a.a(o);
    }

    public final am u()
    {
        if (j.c())
        {
            return j.d();
        } else
        {
            return l.u();
        }
    }

    static 
    {
        e = (new ekm()).a(gnw.a).a();
    }
}
