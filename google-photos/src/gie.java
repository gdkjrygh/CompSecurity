// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.List;

public class gie
    implements mti, ngk, nwn, omb, opl, ops, opt, opv
{

    public final gii a = new gii();
    public final ar b;
    public final gik c;
    public final gil d;
    public mmv e;
    public mpk f;
    public hfg g;
    nwm h;
    public ghi i;
    boolean j;
    private final ngk k = new nia();
    private final int l;
    private nfw m;
    private mtj n;
    private noz o;
    private int p;
    private String q;

    public gie(ar ar1, opd opd1, gik gik1, int i1, gil gil)
    {
        p = -1;
        b = ar1;
        c = gik1;
        l = i1;
        d = gil;
        opd1.a(this);
    }

    static ar a(gie gie1)
    {
        return gie1.b;
    }

    static void a(gie gie1, Intent intent)
    {
        int i1;
        if (intent == null)
        {
            i1 = -1;
        } else
        {
            i1 = intent.getIntExtra("account_id", -1);
        }
        gie1.p = i1;
        gie1.a(gie1.p);
        if (gie1.p != -1 && intent != null)
        {
            Object obj = gie1.e.a(gie1.p);
            gie1 = gie1.n;
            obj = new gic(((mmx) (obj)).b("account_name"));
            obj.b = intent.getBooleanExtra("auto_backup", false);
            obj.c = intent.getBooleanExtra("auto_backup_wifi", true);
            obj.d = intent.getBooleanExtra("upload_full_resolution", false);
            gie1.a(new gib(((gic) (obj))));
        }
    }

    public static boolean a()
    {
        return "true".equals(oqv.a("debug.photos.onboarding.disable", "false"));
    }

    static void b(gie gie1)
    {
        gie1.b.getSharedPreferences("onboarding_prefs", 0).edit().putBoolean("sign_in", true).apply();
    }

    static void c(gie gie1)
    {
        gie1.b.c().a().a(gie1.l, new giw(), "com.google.android.apps.photos.onboarding.OnboardingMixin.tutorial").b();
        gie1.b.c().b();
        gie1.h.c();
    }

    static mpk d(gie gie1)
    {
        return gie1.f;
    }

    static mmv e(gie gie1)
    {
        return gie1.e;
    }

    static ghi f(gie gie1)
    {
        return gie1.i;
    }

    private void g()
    {
        j = false;
        am am1 = a.a;
        if (am1 != null)
        {
            nhz.a(am1.h());
            am1.E.h().a().a(am1).c();
        }
    }

    public final void X_()
    {
        if (!n.a("RefreshDeviceAccountsTask"))
        {
            n.a(new gio());
        }
    }

    public final void a(int i1)
    {
        if (i1 == -1)
        {
            c.a();
            return;
        } else
        {
            nfw nfw1 = m;
            ngg ngg1 = new ngg();
            ngg1.g = true;
            ngg1.c = i1;
            nfw1.a(ngg1);
            return;
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        e = (mmv)olm1.a(mmv);
        f = (mpk)olm1.a(mpk);
        m = (nfw)olm1.a(nfw);
        g = (hfg)olm1.a(hfg);
        n = ((mtj)olm1.a(mtj)).a(this);
        h = (nwm)olm1.a(nwm);
        i = new ghi(e, noz.a(b, 3, "OnboardingMixin", new String[0]));
        o = noz.a(context, 5, "OnboardingMixin", new String[0]);
        f.a(s.Y, new gih(this)).a(s.av, new gig(this)).a(s.I, new gif(this));
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            p = bundle.getInt("com.google.android.apps.photos.onboarding.OnboardingMixin.onboarding_account");
            j = bundle.getBoolean("com.google.android.apps.photos.onboarding.OnboardingMixin.show_login_progress");
            q = bundle.getString("com.google.android.apps.photos.onboarding.OnboardingMixin.login_progress_title");
        }
        if (!m.h())
        {
            g();
        }
    }

    public final void a(ay ay1)
    {
        g();
    }

    public final void a(ay ay1, String s1, boolean flag)
    {
        if (!j)
        {
            j = true;
            q = s1;
            ay1.a().a(new gij(), null).b();
            ay1.b();
            if (!c())
            {
                f();
                return;
            }
        }
    }

    public final void a(String s1, mue mue1, mua mua)
    {
        if (s1.equals("RefreshDeviceAccountsTask"))
        {
            c.c();
        } else
        if (s1.equals("OnboardAutoBackupBackgroundTask") && mue1 != null)
        {
            mue1.c();
            return;
        }
    }

    public final void b(ay ay1)
    {
        k.b(ay1);
    }

    public final void c(ay ay1)
    {
        k.c(ay1);
    }

    public final boolean c()
    {
        return d() != null;
    }

    public am d()
    {
        return b.c().a("com.google.android.apps.photos.onboarding.OnboardingMixin.tutorial");
    }

    public final void e()
    {
        if (e.a(new String[] {
    "logged_in"
}).isEmpty())
        {
            c.a();
            return;
        } else
        {
            nfw nfw1 = m;
            ngg ngg1 = new ngg();
            ngg1.j = true;
            ngg1.a = b.getResources().getString(b.si);
            ngg1.f = true;
            ngg1.g = true;
            nfw1.a(ngg1);
            return;
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putInt("com.google.android.apps.photos.onboarding.OnboardingMixin.onboarding_account", p);
        bundle.putBoolean("com.google.android.apps.photos.onboarding.OnboardingMixin.show_login_progress", j);
        bundle.putString("com.google.android.apps.photos.onboarding.OnboardingMixin.login_progress_title", q);
    }

    void f()
    {
        nhz.a(a.a.h(), q, false);
    }

    public final am u()
    {
        return d();
    }
}
