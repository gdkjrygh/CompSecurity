// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class fyr extends omp
    implements emr, fgm, gac
{

    private static final ekk a = (new ekm()).a(fzu).b(gfn).b(fzz).b(hpg).a();
    private String ag;
    private String ah;
    private String ai;
    private noz aj;
    private mmr ak;
    private final emo b;
    private final gab c;
    private final fgf d;
    private hgz e;
    private List f;
    private fzf g;
    private fzg h;

    public fyr()
    {
        b = new emo(this, af, q.am, this);
        c = new gab(af, this);
        d = new fgf(af, this);
        f = Collections.emptyList();
        new nuu(af, new fyt(this));
    }

    static fgf a(fyr fyr1)
    {
        return fyr1.d;
    }

    public static fyr a(ekp ekp1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("photo", ekp1);
        ekp1 = new fyr();
        ekp1.f(bundle);
        return ekp1;
    }

    private static hpk b(ekp ekp1)
    {
        ekp1 = (hpg)ekp1.b(hpg);
        if (ekp1 != null)
        {
            return ekp1.b();
        } else
        {
            return null;
        }
    }

    private void b(String s)
    {
        d.d();
        Bundle bundle = new Bundle();
        bundle.putString("unsaved_caption", s);
        s = h();
        nuq nuq1 = new nuq();
        nuq1.a = nup.w;
        nuq1.c = "offline_retry_tag_edit_caption";
        nuq1.b = bundle;
        nuq1.d = true;
        nuq1.e = true;
        nuo.a(s, nuq1);
    }

    private void r()
    {
        ArrayList arraylist;
        boolean flag2;
        flag2 = true;
        arraylist = new ArrayList();
        if (g == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        Object obj = g;
        fgf fgf1;
        if (((fzf) (obj)).b && ((fzf) (obj)).a != null && !((fzf) (obj)).c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag || !ak.e()) goto _L2; else goto _L3
_L3:
        boolean flag1;
        if (ah != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (ai != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!(flag ^ flag1)) goto _L2; else goto _L4
_L4:
        if (h == null || !d.a())
        {
            obj = g;
            fgf1 = d;
            h = new fzg(((fzf) (obj)).a, fgf1);
        }
        arraylist.add(h);
        flag = false;
_L6:
        if (f != null && !f.isEmpty())
        {
            obj = ad.getString(b.rk);
            if (flag)
            {
                flag2 = false;
            }
            arraylist.add(new fyu(((String) (obj)), flag2));
            for (obj = f.iterator(); ((Iterator) (obj)).hasNext(); arraylist.add((hgo)(Parcelable)((Iterator) (obj)).next())) { }
        }
        e.a(arraylist);
        return;
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.re, null);
        viewgroup = (RecyclerView)layoutinflater.findViewById(q.ah);
        viewgroup.a(new adi(ad));
        e = new hgz(ad, false, new fys());
        viewgroup.a(e);
        viewgroup = (ekp)super.q.getParcelable("photo");
        b.a(viewgroup, a);
        r();
        return layoutinflater;
    }

    public final void a(Exception exception, String s)
    {
        if (nxx.a(exception))
        {
            ag = s;
            b(s);
            return;
        } else
        {
            d.d();
            ag = null;
            Toast.makeText(ad, b.rn, 1).show();
            return;
        }
    }

    public final void a(String s)
    {
        boolean flag;
        boolean flag2;
        flag2 = true;
        flag = true;
        if (ai != null || ah != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (ah == null)
        {
            break; /* Loop/switch isn't completed */
        }
        gab gab1 = c;
        String s1 = ah;
        if (TextUtils.isEmpty(s1))
        {
            flag = false;
        }
        p.a(flag);
        p.a(s);
        if (!gab1.b.a("com.google.android.apps.photos.mediadetails.mediacaption.PhotosEditCaptionTask"))
        {
            s = new gae(gab1.a, s, s1, null);
            gab1.b.a(s);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        gab gab2 = c;
        String s2 = ai;
        boolean flag1;
        if (!TextUtils.isEmpty(s2))
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        p.a(flag1);
        p.a(s);
        if (!gab2.b.a("com.google.android.apps.photos.mediadetails.mediacaption.PhotosEditCaptionTask"))
        {
            s = new gae(gab2.a, s, null, s2);
            gab2.b.a(s);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final boolean ah_()
    {
        if (!b.w(ad))
        {
            if (ag != null)
            {
                b(ag);
                return true;
            } else
            {
                ay ay = h();
                nuq nuq1 = new nuq();
                nuq1.a = nup.v;
                nuq1.c = "offline_retry_tag_edit_caption";
                nuq1.e = true;
                nuo.a(ay, nuq1);
                return true;
            }
        } else
        {
            ag = null;
            return false;
        }
    }

    public final void b(elb elb1)
    {
        ekp ekp1;
        fzd fzd1;
        fzw fzw1;
        olq olq1;
        ekp1 = (ekp)((List)elb1.a()).get(0);
        olq1 = ad;
        fzw1 = ((fzu)ekp1.a(fzu)).a;
        fzd1 = new fzd();
        if (fzw1 == null) goto _L2; else goto _L1
_L1:
        Object obj;
        if (fzd.a(fzw1.c))
        {
            break MISSING_BLOCK_LABEL_139;
        }
        obj = fzw1.r;
        elb1 = ((elb) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        elb1 = Long.valueOf(ivc.a(fzw1.c.longValue()));
        elb1 = ivc.b(ivc.a(fzw1.c.longValue(), elb1.longValue()));
        fzd1.a(b.a(olq1, elb1, false), b.a(olq1, elb1, true), b.rb);
        elb1 = new ArrayList();
        obj = fzw1.d;
        if (obj != null) goto _L4; else goto _L3
_L3:
        long l = 0L;
_L32:
        if (l == 0L) goto _L6; else goto _L5
_L5:
        obj = fzw1.e;
        if (obj != null) goto _L8; else goto _L7
_L7:
        l = 0L;
_L33:
        if (l == 0L) goto _L6; else goto _L9
_L9:
        elb1.add(String.format(olq1.getString(b.rm), new Object[] {
            Integer.valueOf((int)Math.round((double)(fzw1.d.longValue() * fzw1.e.longValue()) / 1000000D))
        }));
        elb1.add(String.format("%d x %d", new Object[] {
            fzw1.d, fzw1.e
        }));
_L6:
        if (!fzd.a(fzw1.i))
        {
            obj = new fze(olq1);
            Long long1 = fzw1.i;
            elb1.add(Formatter.formatShortFileSize(((fze) (obj)).a, long1.longValue()));
        }
        if (!TextUtils.isEmpty(fzw1.h)) goto _L11; else goto _L10
_L10:
        fzd1.a(fzw1.g, elb1, b.qZ);
_L34:
        ArrayList arraylist;
        if (!fzd.a(fzw1.s))
        {
            fzd1.a(fzw1.s, null, b.rc);
        }
        arraylist = new ArrayList();
        if (!fzd.a(fzw1.k))
        {
            b.a(olq1, "f/%.1f", fzw1.k, arraylist);
        }
        if (fzd.a(fzw1.l)) goto _L13; else goto _L12
_L12:
        if (fzw1.l.floatValue() <= 1.0F) goto _L15; else goto _L14
_L14:
        b.a(olq1, "%.2f", fzw1.l, arraylist);
_L13:
        if (!fzd.a(fzw1.j))
        {
            b.a(olq1, b.rj, fzw1.j, arraylist);
        }
        if (!fzd.a(fzw1.m))
        {
            b.a(olq1, "ISO%d", fzw1.m, arraylist);
        }
        elb1 = "";
        if (!fzd.a(fzw1.n))
        {
            elb1 = String.valueOf("");
            obj = String.valueOf(fzw1.n);
            elb1 = (new StringBuilder(String.valueOf(elb1).length() + 1 + String.valueOf(obj).length())).append(elb1).append(((String) (obj))).append(" ").toString();
        }
        obj = elb1;
        if (fzd.a(fzw1.o)) goto _L17; else goto _L16
_L16:
        elb1 = String.valueOf(elb1);
        obj = String.valueOf(fzw1.o);
        if (((String) (obj)).length() == 0) goto _L19; else goto _L18
_L18:
        obj = elb1.concat(((String) (obj)));
_L17:
        fzd1.a(((String) (obj)), arraylist, b.qY);
        elb1 = fzw1.a;
        if (elb1 != null) goto _L21; else goto _L20
_L20:
        double d1 = 0.0D;
_L35:
        if (d1 == 0.0D) goto _L2; else goto _L22
_L22:
        elb1 = fzw1.b;
        if (elb1 != null) goto _L24; else goto _L23
_L23:
        d1 = 0.0D;
_L36:
        if (d1 == 0.0D) goto _L2; else goto _L25
_L25:
        fzd1.a(olq1.getString(b.rl), String.format("%.3f, %.3f", new Object[] {
            fzw1.a, fzw1.b
        }), b.ra);
        elb1 = fzw1.a;
        obj = fzw1.b;
        if (!fzd.a(elb1) && !fzd.a(obj))
        {
            fzd1.a.add(new fyz(elb1, ((Double) (obj))));
        }
_L2:
        f = fzd1.a;
        g = new fzf(ekp1);
        elb1 = b(ekp1);
        if (elb1 == null) goto _L27; else goto _L26
_L26:
        if (elb1.f()) goto _L28; else goto _L27
_L37:
        ah = elb1;
        if (ah != null) goto _L30; else goto _L29
_L29:
        elb1 = b(ekp1);
        if (elb1 == null)
        {
            break MISSING_BLOCK_LABEL_989;
        }
        if (!elb1.a())
        {
            break MISSING_BLOCK_LABEL_989;
        }
          goto _L31
_L38:
        try
        {
            ai = elb1;
        }
        // Misplaced declaration of an exception variable
        catch (elb elb1)
        {
            elb1 = g().getString(b.ro);
            Toast.makeText(O_(), elb1, 0).show();
        }
        r();
        return;
_L4:
        l = ((Long) (obj)).longValue();
          goto _L32
_L8:
        l = ((Long) (obj)).longValue();
          goto _L33
_L11:
        fzd1.a(fzw1.h, elb1, b.qZ);
          goto _L34
_L15:
        b.a(olq1, "1/%d", Integer.valueOf((int)Math.round(1.0D / (double)fzw1.l.floatValue())), arraylist);
          goto _L13
_L19:
        obj = new String(elb1);
          goto _L17
_L21:
        d1 = elb1.doubleValue();
          goto _L35
_L24:
        d1 = elb1.doubleValue();
          goto _L36
_L28:
        elb1 = ((hpk) (elb1)).e;
          goto _L37
_L31:
        elb1 = ((hpk) (elb1)).c;
          goto _L38
_L30:
        elb1 = null;
          goto _L38
_L27:
        elb1 = null;
          goto _L37
        elb1 = null;
          goto _L38
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        ak = (mmr)ae.a(mmr);
        aj = noz.a(ad, 5, "DetailsFragment", new String[0]);
    }

}
