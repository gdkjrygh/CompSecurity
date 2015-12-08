// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;

public final class fme extends omp
    implements jhn, jhu, mso, mxe, nwn, omz
{

    private final jhm a;
    private mxe ag;
    private final fnh b;
    private final mxg c;
    private fmk d;
    private fba e;
    private hyh f;
    private omx g;
    private hyy h;

    public fme()
    {
        Object obj = new jhm(this, af, fnj, this, q.af, this);
        ae.a(jhm, obj);
        a = ((jhm) (obj));
        obj = new fnh(af);
        ae.a(fnh, obj);
        b = ((fnh) (obj));
        c = new mxg(af);
        new ghb(af, new fmf(this), 0);
        (new dhg(this, af, new fmj(this, fnj.d), q.ac, pwr.A)).a(ae);
        (new dhg(this, af, new fmj(this, fnj.c), q.ad, pwr.A)).a(ae);
        (new dhg(this, af, new fmj(this, fnj.b), q.ab, pwr.A)).a(ae);
        (new dhg(this, af, new fmj(this, fnj.a), q.ae, pwr.A)).a(ae);
    }

    private String A()
    {
        return super.q.getString("zoom_level_preference_key");
    }

    private boolean B()
    {
        return super.q.getBoolean("zoom_enabled", false);
    }

    private void C()
    {
        fnj fnj1 = (fnj)a.c;
        Object obj = b;
        if (((fnh) (obj)).d.a())
        {
            noy.a("viewType", fnj1);
        }
        for (Iterator iterator = ((fnh) (obj)).b.values().iterator(); iterator.hasNext();)
        {
            ((fni)iterator.next()).b = false;
        }

        ((fnh) (obj)).c.put(fnj1, Boolean.valueOf(true));
        ((fnh) (obj)).c(fnj1).b = true;
        ((fnh) (obj)).a.b();
        obj = h;
        boolean flag;
        if (fnj1 != fnj.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((hyy) (obj)).a(flag);
    }

    private void D()
    {
        jhm jhm1;
        boolean flag1;
        flag1 = true;
        jhm1 = a;
        if (!B()) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (c.d == mxj.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || !g.a || h.b()) goto _L2; else goto _L3
_L3:
        jhm1.d = flag1;
        return;
_L2:
        flag1 = false;
        if (true) goto _L3; else goto _L4
_L4:
    }

    private fnj E()
    {
        fnj fnj2 = fnj.c;
        fnj fnj1 = fnj2;
        if (B())
        {
            fnj1 = fnj2;
            if (!TextUtils.isEmpty(A()))
            {
                String s1 = PreferenceManager.getDefaultSharedPreferences(ad).getString(A(), null);
                fnj1 = fnj2;
                if (s1 != null)
                {
                    try
                    {
                        fnj1 = fnj.a(s1);
                    }
                    catch (IllegalArgumentException illegalargumentexception)
                    {
                        return fnj2;
                    }
                }
            }
        }
        return fnj1;
    }

    private void F()
    {
        if (e != null && e.b() == faz.b)
        {
            Object obj = e.c;
            if (f.a(((ekp) (obj))) && a.c == fnj.a)
            {
                a(fnj.b);
            } else
            {
                ekq ekq1 = (ekq)super.q.getParcelable("com.google.android.apps.photos.core.media_collection");
                hyh hyh1 = f;
                if (hyh1.a(((ekp) (obj))))
                {
                    hyh1.c = ((ekp) (obj));
                    obj = new ehr(ekq1);
                    obj = new hyj(((ehr) (obj)), hyh1.c, hyh1.a.d(((ehr) (obj))));
                    hyh1.b.a(((mtf) (obj)));
                    return;
                }
            }
        }
    }

    static void a(fme fme1)
    {
        fme1.D();
    }

    static void a(fme fme1, fnj fnj1)
    {
        fme1.a(fnj1);
    }

    private void a(fnj fnj1)
    {
        if (super.R == null)
        {
            return;
        } else
        {
            a.a(fnj1, new Point(super.R.getWidth() / 2, super.R.getHeight() / 2));
            return;
        }
    }

    static void b(fme fme1)
    {
        fme1.F();
    }

    static boolean c(fme fme1)
    {
        return fme1.B();
    }

    static jhm d(fme fme1)
    {
        return fme1.a;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(b.pF, null);
    }

    public final jhz a(Enum enum)
    {
        enum = (fnj)enum;
        am am1 = (am)a.b.get(enum);
        switch (fmh.a[enum.ordinal()])
        {
        default:
            enum = String.valueOf(enum);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(enum).length() + 20)).append("Invalid zoom level: ").append(enum).toString());

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return ((jia)am1).s();
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        D();
    }

    public final void a(boolean flag)
    {
        C();
        D();
    }

    public final boolean a(Enum enum, Enum enum1, Point point)
    {
        enum = (fnj)enum1;
        if (h.b())
        {
            return false;
        } else
        {
            b.b(enum);
            h.a(false);
            return true;
        }
    }

    public final am b(Enum enum)
    {
        enum = (fnj)enum;
        Object obj = (ekq)super.q.getParcelable("com.google.android.apps.photos.core.media_collection");
        ekw ekw1 = (ekw)super.q.getParcelable("com.google.android.apps.photos.core.query_options");
        switch (fmh.a[enum.ordinal()])
        {
        default:
            enum = String.valueOf(enum);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(enum).length() + 38)).append("Cannot create fragment for zoom level ").append(enum).toString());

        case 1: // '\001'
            p.a(d);
            return d.y();

        case 2: // '\002'
            return fmo.v().a(((ekq) (obj))).a(fnj.b).a(ekw1).a(hbg.a(ad)).a(eyz.b).a(false).a();

        case 3: // '\003'
            return fmo.v().a(((ekq) (obj))).a(fnj.c).a(ekw1).a(hbg.b(ad)).a(eyz.a).a(false).a();

        case 4: // '\004'
            enum = fmo.v().a(((ekq) (obj))).a(fnj.d).a(ekw1).a(hbg.b(ad) - 1);
            break;
        }
        obj = hap.c;
        ((fmx) (enum)).a.putSerializable("layout_type", ((java.io.Serializable) (obj)));
        return enum.a(eyz.a).a(true).a();
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        bundle = ae;
        bundle.a(mxg, c);
        bundle.a(mso, this);
        h = (hyy)ae.a(hyy);
        g = (omx)ae.a(omx);
        d = (fmk)ae.b(fmk);
        g.a(this);
        c.e = this;
        e = (fba)ae.b(fba);
        if (e != null)
        {
            bundle = new hyh(af);
            ae.a(hyh, bundle);
            f = bundle;
            new ghb(af, new fmg(this), null);
        }
        ag = (mxe)ae.b(mxe);
    }

    public final void l()
    {
        super.l();
        C();
    }

    public final msm r()
    {
        if (super.q.getBoolean("is_picker", false))
        {
            return new msm(pwx.b);
        } else
        {
            return new msm(pwt.f);
        }
    }

    public final void s()
    {
        b.b(null);
        hyy hyy1 = h;
        boolean flag;
        if (a.c != fnj.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hyy1.a(flag);
        F();
    }

    public final void t()
    {
        C();
        if (a.c != fnj.a && !TextUtils.isEmpty(A()))
        {
            PreferenceManager.getDefaultSharedPreferences(ad).edit().putString(A(), ((fnj)a.c).e).apply();
        }
    }

    public final am u()
    {
        return a.u();
    }

    public final void v()
    {
        if (ag != null)
        {
            ag.v();
        }
        D();
    }

    public final void w()
    {
        if (ag != null)
        {
            ag.w();
        }
        D();
    }

    public final void x()
    {
        if (ag != null)
        {
            ag.x();
        }
        D();
    }

    public final Enum y()
    {
        return E();
    }

    public final Enum[] z()
    {
        if (d != null)
        {
            return fnj.a();
        } else
        {
            return fnj.b();
        }
    }
}
