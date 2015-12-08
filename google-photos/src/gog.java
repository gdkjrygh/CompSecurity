// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import com.google.android.apps.photos.pager.ClippingImageView;
import com.google.android.apps.photos.photofragment.components.photoview.PhotoView;
import com.google.android.apps.photos.touchcapture.TouchCaptureView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class gog
    implements fua, gni, gpc, gpe, gyw, nug, nwn, omb, ood, ooi, opl, opn, opp, opr, ops, opv
{

    private static final oni f = new oni("debug.pager.state_exceptions");
    private static final ColorDrawable g = new ColorDrawable(-1);
    private static final ColorDrawable h = new ColorDrawable(0xff000000);
    private static final onj i = new onj("pager.enable_scale_transition");
    private static final List j;
    private boolean A;
    private boolean B;
    private boolean C;
    private mwz D;
    private boolean E;
    private boolean F;
    private boolean G;
    public gon a;
    ekp b;
    goq c;
    gnw d;
    public View e;
    private final ar k;
    private final int l;
    private final int m;
    private noz n;
    private nwm o;
    private mwx p;
    private ekp q;
    private int r;
    private grg s;
    private iwc t;
    private gnh u;
    private gpd v;
    private hyy w;
    private boolean x;
    private boolean y;
    private gqw z;

    public gog(ar ar1, opd opd1, int i1, int j1)
    {
        a = gon.a;
        r = -1;
        k = ar1;
        l = i1;
        m = j1;
        opd1.a(this);
    }

    private static am a(am am1)
    {
        am am2 = null;
        while (am2 != am1 && am1 != null) 
        {
            am am3;
            if (am1 instanceof nwn)
            {
                am2 = ((nwn)am1).u();
            } else
            {
                am2 = null;
            }
            am3 = am2;
            am2 = am1;
            am1 = am3;
        }
        return am2;
    }

    static am a(gog gog1, am am1)
    {
        return a(am1);
    }

    static goq a(gog gog1)
    {
        return gog1.c;
    }

    private void a(Drawable drawable)
    {
        if (e != null)
        {
            e.setBackgroundDrawable(drawable);
            return;
        } else
        {
            k.getWindow().getDecorView().setBackgroundDrawable(drawable);
            return;
        }
    }

    private void a(ekp ekp1, int i1, hyk hyk)
    {
        p.a(new gol(this, ekp1, i1, hyk));
    }

    private void a(ekp ekp1, View view, gob gob1, gon gon1)
    {
        a = gon1;
        b = ekp1;
        q = ekp1;
        gpa gpa1 = goq.x();
        gpa1.a.putParcelable("com.google.android.apps.photos.core.media", ekp1);
        gpa1.b = view;
        gpa1.c = this;
        boolean flag;
        if (gon1 == gon.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gpa1.d = Boolean.valueOf(flag);
        view = new goq();
        view.f(gpa1.a);
        goq.a(view, gpa1.b);
        if (b.a(gpa1.d, false))
        {
            goq.e(view, false);
            goq.d(view, true);
        } else
        {
            goq.e(view, true);
        }
        view.a = gpa1.c;
        c = view;
        d = gob1.a(ekp1).a();
        ekp1 = k.c();
        ekp1.a().a(m, c, "com.google.android.apps.photos.pager.PhotoPagerManager.photo_transition").b();
        ekp1.a().a(m, d, "com.google.android.apps.photos.pager.PhotoPagerManager.photo_pager").b();
        view = aly.a(ekp1.a(l));
        bag.a();
        view.a();
        for (view = ((amh) (view)).d.a().iterator(); view.hasNext(); ((amh)view.next()).a()) { }
        ekp1.b();
        a(gon1);
        s = (grg)olm.a(k, a(((am) (d)))).a(grg);
        s.a.a(this, false);
    }

    private void a(gon gon1)
    {
        boolean flag;
        flag = false;
        z.a(j.contains(gon1));
        gom.a[a.ordinal()];
        JVM INSTR tableswitch 3 3: default 48
    //                   3 89;
           goto _L1 _L2
_L1:
        a = gon1;
        if (w != null)
        {
            hyy hyy1 = w;
            if (gon1 == gon.a)
            {
                flag = true;
            }
            hyy1.a(flag);
        }
        o.c();
        return;
_L2:
        u.a = false;
        if (true) goto _L1; else goto _L3
_L3:
    }

    static noz b(gog gog1)
    {
        return gog1.n;
    }

    static boolean c(gog gog1)
    {
        return gog1.E;
    }

    static ar d(gog gog1)
    {
        return gog1.k;
    }

    static int e(gog gog1)
    {
        return gog1.l;
    }

    private void r()
    {
        boolean flag;
        if (F && !y)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !G)
        {
            t.a().a(v);
            G = true;
        } else
        if (!flag && G)
        {
            t.a().b(v);
            G = false;
            return;
        }
    }

    private void s()
    {
        ay ay1 = k.c();
        ay1.a().c(ay1.a(l)).c();
        aly.a(ay1.a(l)).b();
        ay1.b();
        z.b(false);
        a(g);
    }

    private void t()
    {
        ay ay1 = k.c();
        bp bp1 = ay1.a();
        if (d != null)
        {
            bp1.a(d);
        }
        if (c != null)
        {
            bp1.a(c);
        }
        bp1.b();
        ay1.b();
        aly.a(ay1.a(l)).b();
        c = null;
        d = null;
        if (s != null)
        {
            s.a.a(this);
        }
        s = null;
        q = null;
        r = -1;
    }

    private void v()
    {
        ay ay1 = k.c();
        if (a == gon.b)
        {
            ay1.a().b(ay1.a(l)).b();
            ay1.b();
            a(h);
            d.a(true);
            d.a(1.0F);
            a(gon.e);
            return;
        } else
        {
            t();
            a(gon.a);
            return;
        }
    }

    private void w()
    {
        b = null;
        D = p.a(new gok(this));
    }

    private void x()
    {
        s();
        p.a(D);
        ay ay1 = k.c();
        ay1.a().c(c).b();
        ay1.b();
        c.a = this;
    }

    public final gog a(olm olm1)
    {
        olm1.a(gog, this);
        olm1.b(gyw, this);
        return this;
    }

    public final void a(float f1)
    {
        d.a(f1);
    }

    public final void a(int i1, float f1)
    {
        if (b != null)
        {
            w();
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        o = (nwm)olm1.a(nwm);
        p = (mwx)olm1.a(mwx);
        t = (iwc)olm1.a(iwc);
        w = (hyy)olm1.b(hyy);
        n = noz.a(context, 5, "PhotoPagerManager", new String[0]);
        z = (gqw)olm1.a(gqw);
    }

    public final void a(PointF pointf, float f1, float f2)
    {
        ekp ekp1 = q;
        int i1 = r;
        goq goq1 = c;
        goq1.b(gpb.b);
        goq1.h = 1.0F;
        goq1.f.a(pointf, f1, f2);
        if (a == gon.e)
        {
            x();
        }
        a(gon.f);
        a(ekp1, i1, ((hyk) (new goi(this, ekp1))));
    }

    public final void a(Bundle bundle)
    {
        E = false;
        u = new gnh(this, k.getResources(), 60F);
        v = new gpd(k, o, this);
    }

    public final void a(ViewPager viewpager, int i1)
    {
    }

    public final void a(PhotoView photoview, ekp ekp1)
    {
        if (a == gon.e && ekp1.equals(b))
        {
            w();
        }
    }

    public final void a(ekp ekp1, View view, gob gob1)
    {
        if (ekp1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (a != gon.b && a != gon.e && a != gon.f)
        {
            break; /* Loop/switch isn't completed */
        }
        if (d != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (n.a())
        {
            noy.a("state", a);
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        a(ekp1, view, gob1, gon.b);
        return;
    }

    public final void a(ekp ekp1, View view, gph gph1, PointF pointf, float f1, float f2)
    {
        a(ekp1, view, gph1.t(), gon.c);
        c.a(ekp1, view, pointf, f1, f2, gpb.a);
    }

    public final void a(boolean flag)
    {
        y = flag;
        r();
    }

    public final boolean a(MotionEvent motionevent)
    {
        return c.onTouch(((am) (c)).R, motionevent);
    }

    public final void al_()
    {
        A = false;
        F = true;
        if (B)
        {
            j();
            B = false;
        }
        if (C)
        {
            o();
            C = false;
        }
        r();
        t.a().a(u);
    }

    public final void am_()
    {
        F = false;
        r();
        t.a().b(u);
    }

    public final boolean ay_()
    {
        return d == null || x;
    }

    public final boolean az_()
    {
        Object obj = d;
        am am1 = ((gnw) (obj)).b.b;
        boolean flag;
        if (am1 != null && (am1 instanceof gwu))
        {
            obj = (gwu)((gnw) (obj)).b.b;
            if (((gwu) (obj)).a != null && ((gwu) (obj)).a.b.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        return !flag;
    }

    public final void b(PointF pointf, float f1, float f2)
    {
        ekp ekp1 = q;
        int i1 = r;
        if (a == gon.e)
        {
            x();
        }
        a(gon.d);
        a(ekp1, i1, new goj(this, ekp1, pointf, f1, f2));
    }

    public final void b(boolean flag)
    {
        x = true;
        u.a = false;
        if (flag)
        {
            a(gon.g);
            gnw gnw1 = d;
            if (((am) (gnw1)).R != null)
            {
                gnw1.c.setVisibility(8);
                gnw1.d.setVisibility(8);
            }
            return;
        } else
        {
            a(gon.b);
            return;
        }
    }

    public final void b_(Bundle bundle)
    {
        if (bundle != null)
        {
            ay ay1 = k.c();
            c = (goq)ay1.a("com.google.android.apps.photos.pager.PhotoPagerManager.photo_transition");
            d = (gnw)ay1.a("com.google.android.apps.photos.pager.PhotoPagerManager.photo_pager");
            q = (ekp)bundle.getParcelable("com.google.android.apps.photos.pager.PhotoPagerManager.current_media");
            r = bundle.getInt("com.google.android.apps.photos.pager.PhotoPagerManager.current_media_index", -1);
            a((gon)bundle.getSerializable("com.google.android.apps.photos.pager.PhotoPagerManager.state"));
            if (a == gon.e)
            {
                ay1.a().b(ay1.a(l)).b(c).b();
                a(h);
                s = (grg)olm.a(k, a(d)).a(grg);
                s.a.a(this, false);
            } else
            if (c != null || d != null)
            {
                bundle = ay1.a();
                if (c != null)
                {
                    bundle.a(c);
                    c = null;
                }
                if (d != null)
                {
                    bundle.a(d);
                    d = null;
                }
                bundle.b();
                return;
            }
        }
    }

    public final void b_(Object obj)
    {
        obj = (grg)obj;
        q = ((grg) (obj)).h;
        r = ((grg) (obj)).j;
    }

    public final void c()
    {
        E = true;
    }

    public final void c(PointF pointf, float f1, float f2)
    {
        gpi gpi1 = c.g;
        if (gpi1.h != null)
        {
            float f3 = gpi1.h.x;
            float f4 = pointf.x;
            float f5 = gpi1.e.x;
            float f6 = gpi1.h.y;
            float f7 = pointf.y;
            float f8 = gpi1.e.y;
            gpi1.a.setTranslationX(f3 + (f4 - f5));
            gpi1.a.setTranslationY(f6 + (f7 - f8));
            f3 = (f1 / gpi1.f) * gpi1.i;
            f1 = gpi1.a(f1);
            int i1 = Color.argb(Math.round(255F * f1), Color.red(gpi1.c), Color.green(gpi1.c), Color.blue(gpi1.c));
            gpi1.b.setBackgroundColor(i1);
            if (gpi1.d.v())
            {
                gpi1.d.b(f1);
            }
            gpi1.a.setScaleX(f3);
            gpi1.a.setScaleY(f3);
            gpi1.a.setRotation(f2 - gpi1.g);
        }
    }

    public final void c(boolean flag)
    {
        if (flag)
        {
            a(gon.b);
            return;
        } else
        {
            a(gon.g);
            return;
        }
    }

    public final void d(PointF pointf, float f1, float f2)
    {
        pointf = c.g;
        if (pointf.a(f1) >= 0.5F)
        {
            ((gpi) (pointf)).d.t();
            return;
        } else
        {
            ((gpi) (pointf)).d.u();
            return;
        }
    }

    public final boolean d()
    {
        if (a != gon.e) goto _L2; else goto _L1
_L1:
        Object obj;
        int i1;
        obj = q;
        i1 = r;
        if (a != gon.g && a != gon.a) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        if (obj == null)
        {
            s();
            t();
            a(gon.a);
            return true;
        } else
        {
            a(gon.g);
            c.b(gpb.b);
            x();
            a(((ekp) (obj)), i1, new goh(this, ((ekp) (obj))));
            return true;
        }
_L2:
        if (a != gon.b && a != gon.f)
        {
            continue; /* Loop/switch isn't completed */
        }
        a(gon.g);
        obj = c;
        obj.c = gpb.b;
        if (((goq) (obj)).b.getDrawable() == null) goto _L3; else goto _L5
_L5:
        ((goq) (obj)).s();
        return true;
        if (a == gon.d || a == gon.c) goto _L3; else goto _L6
_L6:
        return false;
    }

    public final void e()
    {
    }

    public final void e(Bundle bundle)
    {
        gom.a[a.ordinal()];
        JVM INSTR tableswitch 1 7: default 52
    //                   1 98
    //                   2 98
    //                   3 98
    //                   4 98
    //                   5 167
    //                   6 167
    //                   7 167;
           goto _L1 _L2 _L2 _L2 _L2 _L3 _L3 _L3
_L1:
        bundle = String.valueOf(a);
        throw new IllegalStateException((new StringBuilder(String.valueOf(bundle).length() + 15)).append("Unknown state: ").append(bundle).toString());
_L2:
        gon gon1 = gon.e;
_L5:
        gon gon2 = gon1;
        if (gon1 == gon.e)
        {
            gon2 = gon1;
            if (d == null)
            {
                gon2 = gon.a;
            }
        }
        bundle.putSerializable("com.google.android.apps.photos.pager.PhotoPagerManager.state", gon2);
        if (gon2 != gon.a)
        {
            bundle.putParcelable("com.google.android.apps.photos.pager.PhotoPagerManager.current_media", q);
            bundle.putInt("com.google.android.apps.photos.pager.PhotoPagerManager.current_media_index", r);
        }
        A = true;
        return;
_L3:
        gon1 = gon.a;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void f()
    {
    }

    public final void g()
    {
    }

    public final void j()
    {
        if (A)
        {
            B = true;
        } else
        if (a == gon.g)
        {
            d.a(false);
            return;
        }
    }

    public final void k()
    {
        d.a(false);
    }

    public final void l()
    {
        v();
        if (a == gon.e && b == null)
        {
            w();
        }
        x = false;
    }

    public final void m()
    {
        if (a == gon.d)
        {
            d.a(false);
        }
    }

    public final void n()
    {
        v();
        if (a == gon.e && b == null)
        {
            w();
        }
    }

    public final void o()
    {
        v.a();
        if (A)
        {
            C = true;
            return;
        } else
        {
            v();
            return;
        }
    }

    public final boolean p()
    {
        return a == gon.a;
    }

    public final boolean q()
    {
        return a == gon.e;
    }

    public final am u()
    {
        if (a != gon.a && a != gon.g && d == null)
        {
            if (n.a())
            {
                noy.a("state", a);
            }
            return k.c().a(l);
        }
        if (a == gon.a || a == gon.g)
        {
            return k.c().a(l);
        } else
        {
            return d;
        }
    }

    static 
    {
        j = Collections.unmodifiableList(Collections.singletonList(gon.e));
    }
}
