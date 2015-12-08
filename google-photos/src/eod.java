// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class eod extends omp
    implements eop, eot, epp, fpl, iwk, jcq
{

    private static final ekk a = (new ekm()).a(hjr).a(hjt).a(hkf).a(hkd).a(elj).a(hpe).a(hjp).a(hkj).a();
    private fjf ag;
    private hyv ah;
    private dgk ai;
    private RecyclerView aj;
    private hgz ak;
    private List al;
    private final emi b;
    private final iwm c;
    private final eom d;
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    private mmr g;
    private mpk h;

    public eod()
    {
        b = new emi(this, af, s.g, new eoi(this));
        c = new iwm(this, af, this);
        d = new eom(af);
        (new msi(pwt.o)).a(ae);
        new dsu(af);
        new nuu(af, new eoj(this));
        new nuu(af, new eoh(this));
        new epn(af, this);
        new fpk(af, this);
    }

    public static eod a(boolean flag, boolean flag1, Collection collection)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_existing", flag);
        bundle.putBoolean("show_only_albums", flag1);
        if (collection == null || collection.isEmpty())
        {
            collection = null;
        } else
        {
            collection = new ArrayList(collection);
        }
        bundle.putParcelableArrayList("com.google.android.apps.photos.core.media_list", collection);
        collection = new eod();
        collection.f(bundle);
        return collection;
    }

    static hyv a(eod eod1)
    {
        return eod1.ah;
    }

    static List a(eod eod1, List list)
    {
        eod1.al = list;
        return list;
    }

    static eom b(eod eod1)
    {
        return eod1.d;
    }

    static void c(eod eod1)
    {
        eod1.u();
    }

    static olq d(eod eod1)
    {
        return eod1.ad;
    }

    static olq e(eod eod1)
    {
        return eod1.ad;
    }

    static mmr f(eod eod1)
    {
        return eod1.g;
    }

    static List g(eod eod1)
    {
        return eod1.al;
    }

    static iwm h(eod eod1)
    {
        return eod1.c;
    }

    private boolean r()
    {
        return super.q.getBoolean("show_existing");
    }

    private void t()
    {
        ArrayList arraylist = new ArrayList(e.size() + f.size() + 2);
        arraylist.add(new eov(a(b.mv)));
        arraylist.addAll(e);
        if (r() && !f.isEmpty())
        {
            arraylist.add(new eov(a(b.mu)));
            arraylist.addAll(f);
        }
        ak.a(arraylist);
        ag.a(aj);
    }

    private void u()
    {
        int k = 0;
        boolean flag2 = false;
        if (!b.w(ad))
        {
            ay ay1 = h();
            nuq nuq1 = new nuq();
            nuq1.a = d.c();
            nuq1.c = "offline_retry_tag_create_fragment";
            nuq1.e = true;
            nuo.a(ay1, nuq1);
        } else
        {
            if (!d.e())
            {
                mpk mpk1 = h;
                int i = s.l;
                eom eom1 = d;
                p.b(eom1.b(), "must set create/copy type");
                hee hee1 = new hee(eom1.a);
                hee1.i = true;
                if (eom1.a())
                {
                    epk epk1 = eom1.d.e;
                    k = epk1.a;
                    int l = epk1.b;
                    boolean flag1;
                    if (k > 0)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    p.a(flag1, "min must be >= 1");
                    flag1 = flag2;
                    if (l >= k)
                    {
                        flag1 = true;
                    }
                    p.a(flag1, "max must be >= min");
                    hee1.b = 1;
                    hee1.c = k;
                    hee1.d = l;
                    hee1.a = eom1.c.d();
                    hee1.e = epk1.c;
                }
                mpk1.a(i, hee1.a());
                return;
            }
            if (d.b())
            {
                boolean flag;
                if (d.d() != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    epj epj1 = d.d();
                    if (epj1.b)
                    {
                        dgg dgg1 = ai.a();
                        dgg1.d = epj1.a;
                        dgg1.a().c();
                    } else
                    {
                        env.a(epj1.a).a(h(), "add_to_album_dialog");
                    }
                    v();
                    return;
                }
                if (h().a("upload_fragment") == null)
                {
                    ay ay2 = h();
                    List list = d.e;
                    Object obj = d;
                    p.b(((eom) (obj)).b(), "must set type before getting upload handler");
                    if (((eom) (obj)).f != null)
                    {
                        obj = new eqh(((eom) (obj)).f);
                    } else
                    if (((eom) (obj)).d.b())
                    {
                        obj = new eqn(((eom) (obj)).b.getString(b.mw));
                    } else
                    {
                        int j = k;
                        if (((eom) (obj)).d.d == -200)
                        {
                            j = 1;
                        }
                        if (j != 0)
                        {
                            ihx ihx1 = new ihx();
                            ihx1.d = true;
                            ihx1.a = ((eom) (obj)).e;
                            obj = ihx1.a();
                        } else
                        if (((eom) (obj)).d.e())
                        {
                            ((eom) (obj)).i.a(19, 1);
                            obj = new eql(s.a, ((eom) (obj)).b.getString(b.mx));
                        } else
                        {
                            obj = new eqj(((eom) (obj)).d, ((eom) (obj)).g);
                        }
                    }
                    obj = jcm.a(list, ((jcp) (obj)));
                    ay2.a().a(((am) (obj)), "upload_fragment").b();
                    ay2.b();
                    return;
                }
            }
        }
    }

    private void v()
    {
        Object obj = d;
        obj.d = null;
        obj.f = null;
        obj = super.q.getParcelableArrayList("com.google.android.apps.photos.core.media_list");
        if (obj == null || ((List) (obj)).isEmpty())
        {
            d.e = null;
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        aj = (RecyclerView)layoutinflater.inflate(b.mn, null);
        aj.a(new adi(ad));
        aj.setBackgroundColor(g().getColor(b.ml));
        ak = new hgz(ad, false, new eog());
        aj.a(ak);
        if (r())
        {
            b.a(new dkp(g.d()), a);
        }
        return aj;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = super.q.getParcelableArrayList("com.google.android.apps.photos.core.media_list");
        if (bundle != null)
        {
            d.a(bundle);
        }
    }

    public final void a(ekq ekq1)
    {
        String s1 = ((hpe)ekq1.a(hpe)).a.a;
        eom eom1 = d;
        p.a(s1, "must provide non-empty albumMediaKey");
        eom1.f = s1;
        eom1.h = ekq1;
        eom1.d = null;
        u();
    }

    public final void a(epf epf1)
    {
        eom eom1 = d;
        p.b(epf1, "must provide non-null mediaBundleType");
        eom1.f = null;
        eom1.d = epf1;
        u();
    }

    public final void a(fpj fpj, Rect rect)
    {
        ag.a(aj, rect);
    }

    public final void a(Exception exception)
    {
        if (exception == null || nxx.a(exception))
        {
            exception = h();
            nuq nuq1 = new nuq();
            nuq1.a = d.c();
            nuq1.d = true;
            nuq1.c = "offline_retry_tag_create_fragment_dialog_close";
            nuo.a(exception, nuq1);
        }
        v();
        exception = h();
        jcm jcm1 = (jcm)exception.a("upload_fragment");
        if (jcm1 != null)
        {
            exception.a().a(jcm1).b();
            exception.b();
        }
    }

    public final void a(Object obj)
    {
        obj = (List)obj;
        f.clear();
        f.addAll(((Collection) (obj)));
        t();
    }

    public final void a(List list)
    {
        boolean flag = super.q.getBoolean("show_only_albums");
        e.clear();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            epf epf1 = (epf)iterator.next();
            if (!flag || epf1.b())
            {
                List list1 = e;
                if (epf1.e())
                {
                    list = pwt.n;
                } else
                if (epf1.c())
                {
                    list = pwt.p;
                } else
                if (epf1.b())
                {
                    list = pwt.l;
                } else
                {
                    list = pwt.m;
                }
                list1.add(new eon(epf1, list, g.d()));
            }
        } while (true);
        t();
    }

    public final void ak_()
    {
        super.ak_();
        aj = null;
    }

    public final void b(Intent intent)
    {
        O_().setResult(-1, intent);
        if (intent != null && intent.getBooleanExtra("async_result", false))
        {
            (new enx()).a(super.B, "collection_async_result_dialog");
            return;
        } else
        {
            O_().finish();
            return;
        }
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        g = (mmr)ae.a(mmr);
        ag = (fjf)ae.a(fjf);
        h = (mpk)ae.a(mpk);
        ah = (hyv)ae.a(hyv);
        ai = (dgk)ae.a(dgk);
        h.a(s.l, new eoe(this));
        h.a(s.k, new eof(this));
        bundle = ae;
        bundle.a(eot, this);
        bundle.a(eop, this);
        bundle.a(jcq, this);
    }

}
