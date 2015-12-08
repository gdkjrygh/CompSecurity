// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.photos.photoeditor.contentprovider.EditMediaContentProvider;
import java.util.List;

public class gxx extends omp
    implements emm, emr, gtn, gxu, gzk
{

    private static final ekk a = (new ekm()).b(gtg).b(fzu).a();
    private static final ekk b = (new ekm()).a(elt).a(hpg).b(gtk).b(fzu).b(gfn).b(gtg).b(fwd).b(jdy).a();
    private static final ekk c = (new ekm()).b(hjp).b(hkb).a();
    private mpk ag;
    private grn ah;
    private gtp ai;
    private ejn aj;
    private grg ak;
    private mmr al;
    private grr am;
    private npk an;
    private jdr ao;
    private noe ap;
    private ekp aq;
    private ekq ar;
    private boolean as;
    private noz at;
    private final emo d;
    private final eml e;
    private final gtm f;
    private final hft g;
    private final gxv h;

    public gxx()
    {
        d = new emo(this, af, b.uK, this);
        e = new eml(this, af, b.uJ, this);
        f = new gtm(af, this);
        g = new hft(this, af);
        h = new gxv(af);
        new gpq(af, gye.c, new gxy(this));
    }

    static void a(gxx gxx1)
    {
        if (gxx1.w())
        {
            gxx1.r();
            return;
        }
        hft hft1 = gxx1.g;
        int i = b.uS;
        if (hft1.c)
        {
            Resources resources;
            if (hft1.a != null)
            {
                resources = hft1.a.getResources();
            } else
            {
                resources = hft1.b.g();
            }
            hft1.a(resources.getString(i));
        }
        gxx1.as = true;
    }

    static void a(gxx gxx1, Intent intent)
    {
        gxx1.h.a.s().setVisibility(0);
        gvl gvl1;
        Uri uri;
        if (gxx1.ai.a(gxx1.al.d(), gxx1.aq))
        {
            uri = Uri.parse(intent.getStringExtra("com.google.android.apps.photos.photoeditor.contract.original_for_edit_list"));
            gug gug1;
            if (intent.getBooleanExtra("com.google.android.apps.photos.photoeditor.contract.save_as_copy", false))
            {
                gvl1 = gvl.a;
            } else
            {
                gvl1 = gvl.b;
            }
        } else
        {
            uri = intent.getData();
            gvl1 = gvl.a;
        }
        gug1 = new gug();
        gug1.a = gxx1.al.d();
        gug1.b = gxx1.ar;
        gug1.c = gxx1.aq;
        gug1.e = intent.getData();
        gug1.f = intent.getByteArrayExtra("com.google.android.apps.photos.photoeditor.contract.edit_list");
        gug1.h = gvl1;
        gug1.d = uri;
        intent = gug1.a();
        gxx1.f.a(intent);
    }

    private void a(String s, Exception exception)
    {
        if (as)
        {
            g.c();
            as = false;
            Toast.makeText(ad, b.uR, 0).show();
        }
    }

    static olq b(gxx gxx1)
    {
        return gxx1.ad;
    }

    static mmr c(gxx gxx1)
    {
        return gxx1.al;
    }

    private void r()
    {
label0:
        {
            {
                Object obj = aq;
                Object obj1;
                boolean flag;
                if (!ap.b() || !ap.a())
                {
                    flag = false;
                } else
                {
                    obj = (gfn)((ekp) (obj)).b(gfn);
                    if (obj != null && ((gfn) (obj)).g())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                }
                if (!flag)
                {
                    break label0;
                }
                obj = aq;
                obj1 = ((hpg)((ekp) (obj)).a(hpg)).b().c;
                obj = (new jed((jdy)((ekp) (obj)).a(jdy), an, ao)).a();
                if (obj != null)
                {
                    obj = ((jea) (obj)).a;
                } else
                {
                    obj = null;
                }
                obj = (new nog(ad)).a().a(((String) (obj1))).a(((Uri) (obj))).b(al.d()).a(b.uL).b("Photos oneup").b();
                ag.a(b.uN, ((Intent) (obj)));
            }
            return;
        }
        obj = aq;
        obj1 = (fzu)((ekp) (obj)).b(fzu);
        if (obj1 == null || !b.k(((fzu) (obj1)).a.g))
        {
            break; /* Loop/switch isn't completed */
        }
        gyb.b(b.uP).a(h(), null);
        flag = false;
_L4:
        if (flag)
        {
            u();
            return;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_154;
_L1:
        if (obj1 != null && ((fzu) (obj1)).a.d != null && ((fzu) (obj1)).a.e != null && ((ekp) (obj)).c() == euv.b && b.c(((fzu) (obj1)).a.d.intValue(), ((fzu) (obj1)).a.e.intValue()))
        {
            gyb.b(b.uO).a(h(), null);
            flag = false;
        } else
        {
label1:
            {
                if (((ekp) (obj)).c() != euv.c)
                {
                    break label1;
                }
                obj = (hkb)ar.b(hkb);
                if (obj == null || !((hkb) (obj)).a)
                {
                    break label1;
                }
                gyb.b(b.uQ).a(h(), null);
                flag = false;
            }
        }
        continue; /* Loop/switch isn't completed */
        obj = (hjp)ar.b(hjp);
        if (obj != null && ((hjp) (obj)).a.c)
        {
            (new gxt()).a(h(), "ConfirmSharedAlbumEditingDialog");
            flag = false;
        } else
        {
            flag = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void u()
    {
        Object obj1;
        ekp ekp1;
        guw guw1;
        fwd fwd1;
        jdy jdy1;
        ekp1 = aq;
        String s;
        Object obj2;
        if (ai.a(al.d(), aq))
        {
            obj1 = ((gtk)aq.a(gtk)).a;
        } else
        {
            obj1 = null;
        }
        s = ejv.a(ekp1.c());
        obj2 = (hpg)ekp1.a(hpg);
        fwd1 = (fwd)ekp1.b(fwd);
        jdy1 = (jdy)ekp1.b(jdy);
        guw1 = new guw();
        guw1.a = s;
        guw1.g = al.d();
        obj2 = ((hpg) (obj2)).b();
        if (((hpk) (obj2)).a())
        {
            guw1.h = ((hpk) (obj2)).c;
        } else
        {
            guw1.i = ((hpk) (obj2)).e;
        }
        if (!ejv.b(s)) goto _L2; else goto _L1
_L1:
        if (!jdy1.a())
        {
            throw new UnsupportedOperationException("Remote video editing not supported.");
        }
        if (fwd1 == null || b.c(fwd1.a))
        {
            throw new UnsupportedOperationException("Local video file not found.");
        }
        guw1.b(jdy1.a.a);
        String s1 = String.valueOf(fwd1.a);
        guw1.c(Uri.parse((new StringBuilder(String.valueOf(s1).length() + 4)).append(s1).append(".tmp").toString()));
_L4:
        Intent intent = guw1.a();
        intent.addFlags(1);
        ag.a(b.uM, intent);
        return;
_L2:
        Object obj;
        if (obj1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((elt)ekp1.a(elt)).e();
        obj1 = aj.a(ekp1, ejm.c);
_L5:
        guw1.a(((Uri) (obj1)));
        obj1 = (fzu)ekp1.a(fzu);
        guw1.c = ((gap) (obj));
        long l = ((fzu) (obj1)).a.d.longValue();
        long l1 = ((fzu) (obj1)).a.e.longValue();
        guw1.d = l;
        guw1.e = l1;
        if (true) goto _L4; else goto _L3
_L3:
        p.b(ai.a(al.d(), ekp1), "Edits should be loaded only when non-destructive saving is enabled");
        guw1.f = ((gum) (obj1)).g;
        obj = ((gum) (obj1)).b;
        gtu gtu1;
        if (oql.b(((Uri) (obj))) || oql.a(((Uri) (obj))))
        {
            obj = new gan(((Uri) (obj)));
        } else
        {
            obj = new gat(((Uri) (obj)).toString(), al.d());
        }
        gtu1 = new gtu();
        gtu1.a = al.d();
        gtu1.b = ejm.c;
        obj1 = gtu1.a(((gum) (obj1)).a).a().a(EditMediaContentProvider.a(ad));
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    private void v()
    {
        while (!w() || !as) 
        {
            return;
        }
        g.c();
        as = false;
        r();
    }

    private boolean w()
    {
        return ar != null && aq != null;
    }

    public final void a()
    {
        u();
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            as = bundle.getBoolean("edit_pressed_during_load");
        }
        d.a(ah.b, b);
        e.a(ak.f.a, c);
    }

    public final void a(elb elb1)
    {
        try
        {
            ar = (ekq)elb1.a();
        }
        // Misplaced declaration of an exception variable
        catch (elb elb1)
        {
            a("Error loading collection", ((Exception) (elb1)));
            return;
        }
        v();
    }

    public final void a(boolean flag, ekp ekp1)
    {
        if (flag)
        {
            aq = null;
            am.a(ekp1);
            ak.a(ekp1);
            h.a(ekp1);
            return;
        } else
        {
            h.a();
            return;
        }
    }

    public final void b(elb elb1)
    {
        try
        {
            aq = (ekp)((List)elb1.a()).get(0);
        }
        // Misplaced declaration of an exception variable
        catch (elb elb1)
        {
            a("Error loading media", elb1);
            return;
        }
        v();
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        al = (mmr)ae.a(mmr);
        ag = ((mpk)ae.a(mpk)).a(b.uM, new gya(this)).a(b.uN, new gxz(this));
        ak = (grg)ae.a(grg);
        ah = (grn)ae.a(grn);
        ai = (gtp)ae.a(gtp);
        aj = (ejn)ae.a(ejn);
        am = (grr)ae.a(grr);
        an = (npk)ae.a(npk);
        ao = (jdr)ae.a(jdr);
        ap = (noe)ae.a(noe);
        ae.a(gxu, this);
        at = noz.a(ad, "PhotoEdit", new String[0]);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("edit_pressed_during_load", as);
    }

    public final ekk t()
    {
        return a;
    }

}
