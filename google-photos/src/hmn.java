// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.photos.list.PhotoTileView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class hmn extends omp
    implements dhc, emm, frm, gak, gph, hoc, hqp, iwk, jcq, mso, mti, nwn
{

    public static final ekk a = (new ekm()).a(elt).a(eev).a(gtg).a(hpg).a(hjx).b(gaf).b(hkh).b(jdv).a();
    private static final ekk b;
    private ekq aA;
    private hbg aB;
    private hgz aC;
    private dhw aD;
    private ifj aE;
    private mmr aF;
    private mtj aG;
    private myf aH;
    private noz aI;
    private Long aJ;
    private String aK;
    private String aL;
    private boolean aM;
    private boolean aN;
    private boolean aO;
    private hhq aP;
    private dyx aQ;
    private hqv aR;
    private gog aS;
    private dhk aT;
    private dha aU;
    private ehr aV;
    private gaj aW;
    private hkl aX;
    private boolean aY;
    private final hmm ag = new hmm(this);
    private final fhu ah = new fhu();
    private final hmv ai = new hmv(this);
    private final hme aj = new hme(this);
    private final fhz ak = new fhz();
    private final iwm al;
    private final hoe am;
    private final fpj an;
    private final dje ao;
    private final hoa ap = new hoa();
    private final hba aq = new hba();
    private final hlk ar;
    private final hog as = new hog();
    private final hnb at = new hnb();
    private final dfu au;
    private final hgd av;
    private final hnc aw = new hnc(this);
    private final fho ax;
    private hnd ay;
    private ekq az;
    private final eml c;
    private final mxg d;
    private fgp e;
    private final hmy f = new hmy();
    private final hzc g = new hzc();
    private final hnw h;

    public hmn()
    {
        c = new eml(this, af, ag.M, this);
        d = new mxg(af);
        h = new hnw(this, af);
        al = new iwm(this, af, this);
        am = new hoe(af);
        an = (new fpj(af, (byte)0)).a(ae);
        Object obj = new dje();
        ae.a(dje, obj);
        ao = ((dje) (obj));
        obj = new hlk(af);
        ae.a(hlk, obj);
        ar = ((hlk) (obj));
        au = new dfu(this, af);
        av = new hgd(this, af, new hmo(this));
        ax = new fho(this, af);
        aM = true;
        new nuu(af, ag);
        new nuu(af, aj);
        new nuu(af, new hmr(this));
        new nuu(af, new hmu(this));
        (new hqr()).a(ae);
        (new hqv(this, af)).a(ae);
        (new dhj(this, Integer.valueOf(b.wR), ag.Z)).a(ae);
        (new hbs(af)).a(ae);
        (new egf(af, (byte)0)).a(ae);
    }

    static hgz a(hmn hmn1)
    {
        return hmn1.aC;
    }

    public static hmn a(ekq ekq1, hmz hmz1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.apps.photos.core.media_collection", ekq1);
        bundle.putParcelable("album_fragment_options", hmz1);
        ekq1 = new hmn();
        ekq1.f(bundle);
        return ekq1;
    }

    static void a(hmn hmn1, boolean flag)
    {
        hmn1.a(flag);
    }

    private void a(boolean flag)
    {
        if (w().f)
        {
            e.a = false;
        }
        if (!x())
        {
            d.a(mxj.a);
            return;
        }
        if (((hjr)aA.a(hjr)).a == 0)
        {
            d.a(mxj.c);
            return;
        }
        if (!flag)
        {
            d.a(mxj.a);
            return;
        } else
        {
            d.a(mxj.b);
            return;
        }
    }

    static fhu b(hmn hmn1)
    {
        return hmn1.ah;
    }

    public static gob b(ekq ekq1, hmz hmz1)
    {
        boolean flag1 = false;
        ekq1 = gnw.v().a(ekq1).h(true);
        boolean flag;
        if (!hmz1.h)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ekq1 = ekq1.m(flag);
        if (!hmz1.k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ekq1 = ekq1.j(flag);
        if (!hmz1.i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ekq1 = ekq1.o(flag);
        flag = flag1;
        if (!hmz1.j)
        {
            flag = true;
        }
        ekq1 = ekq1.q(flag);
        flag = hmz1.a;
        ((gob) (ekq1)).a.putBoolean("com.google.android.apps.photos.pager.allow_envelope_save", flag);
        ekq1 = ekq1.e(hmz1.l);
        flag = hmz1.m;
        ((gob) (ekq1)).a.putBoolean("com.google.android.apps.photos.pager.allow_report_abuse", flag);
        return ekq1.g(hmz1.s).a(true);
    }

    private boolean b(eke eke1)
    {
        return w().f && nzb.a(eke1.a, "invalid");
    }

    static boolean b(hmn hmn1, boolean flag)
    {
        hmn1.aY = true;
        return true;
    }

    static hnd c(hmn hmn1)
    {
        return hmn1.ay;
    }

    static fgp d(hmn hmn1)
    {
        return hmn1.e;
    }

    static void e(hmn hmn1)
    {
        if (!b.w(hmn1.ad))
        {
            hmn1 = hmn1.h();
            nuq nuq1 = new nuq();
            nuq1.a = nup.n;
            nuq1.c = "offline_retry_tag_delete_album";
            nuq1.e = true;
            nuo.a(hmn1, nuq1);
            return;
        } else
        {
            hoi hoi1 = new hoi();
            hmn1 = hmn1.h().a();
            hmn1.a(hoi1, "confirm_album_deletion");
            hmn1.c();
            return;
        }
    }

    static boolean f(hmn hmn1)
    {
        return hmn1.aM;
    }

    static boolean g(hmn hmn1)
    {
        return hmn1.x();
    }

    static boolean h(hmn hmn1)
    {
        p.a(hmn1.aA);
        hmn1 = (gsn)hmn1.aA.b(gsn);
        if (hmn1 == null)
        {
            return false;
        } else
        {
            return hmn1.a();
        }
    }

    static dhk i(hmn hmn1)
    {
        return hmn1.aT;
    }

    static void j(hmn hmn1)
    {
        hmn1.aG.b.a(hmn1.a(c.eo), "AddPendingMedia");
        hmn1.aQ.a(nup.q, hmn1.az, -1L);
    }

    static hmz k(hmn hmn1)
    {
        return hmn1.w();
    }

    static dhw l(hmn hmn1)
    {
        return hmn1.aD;
    }

    private hmz w()
    {
        return (hmz)super.q.getParcelable("album_fragment_options");
    }

    private boolean x()
    {
        return aA != null;
    }

    private void y()
    {
        ay ay1 = h.a.h();
        jcm jcm1 = (jcm)ay1.a("com.google.android.apps.photos.remotemedia.ui.EditAlbumPhotosMixin.upload_fragment_from_album");
        if (jcm1 != null)
        {
            ay1.a().a(jcm1).b();
        }
        ay1 = aj.a.h();
        jcm1 = (jcm)ay1.a("com.google.android.apps.photos.remotemedia.ui.AddToEnvelopeMenuItemHandler.upload_fragment_tag");
        if (jcm1 != null)
        {
            ay1.a().a(jcm1).b();
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(layoutinflater, viewgroup, bundle);
        layoutinflater = layoutinflater.inflate(b.wK, null);
        if (w().d)
        {
            viewgroup = aR;
            bundle = layoutinflater.findViewById(ag.Y);
            int i1 = g().getDimensionPixelSize(b.wF);
            View view = layoutinflater.findViewById(ag.L);
            viewgroup.c = bundle;
            viewgroup.a = i1;
            viewgroup.b = view;
        } else
        {
            layoutinflater.findViewById(ag.Y).setVisibility(8);
        }
        if (w().f)
        {
            e = new fgp(layoutinflater.findViewById(ag.W), layoutinflater.findViewById(ag.X));
            d.e = new hmp(this);
        }
        c.a(az, b);
        a(false);
        ar.e = new hll(layoutinflater.findViewById(ag.i));
        return layoutinflater;
    }

    public final void a(float f1, float f2)
    {
        f.b = 5F * f1;
        aU.a();
    }

    public final void a(Activity activity)
    {
        boolean flag1 = false;
        super.a(activity);
        activity = O_().getIntent();
        boolean flag = flag1;
        if (aM)
        {
            flag = flag1;
            if (activity.getBooleanExtra("focus_edit_title", false))
            {
                flag = true;
            }
        }
        aM = flag;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle == null)
        {
            aY = false;
            h().a().a(ag.z, new hae(), "grid_fragment").b();
            if (w().a)
            {
                av.a(aK, aL, true);
            }
            return;
        } else
        {
            aN = true;
            aY = bundle.getBoolean("upgrade_dialog_dismissed");
            return;
        }
    }

    public final void a(PhotoTileView phototileview, ekp ekp)
    {
        if (aX != null && aX.b)
        {
            if (c.a(super.ad) && PhotoTileView.d() && phototileview.n != null)
            {
                phototileview.n.b(phototileview);
            }
            return;
        } else
        {
            aS.a(ekp, phototileview, t());
            return;
        }
    }

    public final void a(eke eke1)
    {
        if (Log.isLoggable("AlbumFragment", 5))
        {
            Log.w("AlbumFragment", "Failed loading photos", eke1);
        }
        if (b(eke1))
        {
            e.a = true;
            d.a(mxj.c);
            return;
        } else
        {
            Toast.makeText(ad, c.ep, 0).show();
            return;
        }
    }

    public final void a(elb elb1)
    {
        boolean flag1 = true;
        if (!aP.a) goto _L2; else goto _L1
_L1:
        return;
_L2:
        aA = (ekq)elb1.a();
        aA.b(him);
        elb1 = hik.b;
        if (((hjp)aA.a(hjp)).a.c)
        {
            f.a = true;
        }
        if (!w().a) goto _L4; else goto _L3
_L3:
        ah.a = aA;
        if (!aE.a(aF.d())) goto _L4; else goto _L5
_L5:
        Object obj;
        Object obj1;
        elj elj1;
        int i1;
        int j1;
        boolean flag;
        elb1 = ap;
        obj = aA;
        elb1.b = ((hpe)((ekq) (obj)).a(hpe)).a.a;
        ekq ekq1;
        if (!TextUtils.isEmpty(((hoa) (elb1)).b))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        obj1 = (ikw)((ekq) (obj)).b(ikw);
        if (obj1 != null && ((ikw) (obj1)).b)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        obj = (hjv)((ekq) (obj)).b(hjv);
        if (obj != null) goto _L7; else goto _L6
_L6:
        flag = false;
_L22:
        elb1.c = flag;
        elb1 = as;
        obj = aA;
        elb1.d = ((hpe)((ekq) (obj)).a(hpe)).a.a;
        obj = (ikw)((ekq) (obj)).b(ikw);
        if (obj != null && ((ikw) (obj)).a)
        {
            elb1.b = false;
        }
_L4:
        elb1 = (hjn)aA.b(hjn);
        if (elb1 != null)
        {
            if (((hjn) (elb1)).a && ((hjn) (elb1)).b.contains(Integer.valueOf(11)))
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                aj.f = true;
            }
        }
        if (!w().d) goto _L9; else goto _L8
_L8:
        obj1 = ay;
        ekq1 = aA;
        if (aN) goto _L11; else goto _L10
_L10:
        if (!TextUtils.isEmpty(ay.e))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0) goto _L11; else goto _L12
_L12:
        i1 = 1;
_L23:
        flag = w().e;
        elj1 = (elj)ekq1.b(elj);
        if (i1 != 0 && elj1 != null)
        {
            ((hnd) (obj1)).a(elj1.a);
        }
        elb1 = (hkd)ekq1.b(hkd);
        if (((hjr)ekq1.a(hjr)).a == 0)
        {
            ((hnd) (obj1)).b(((hnd) (obj1)).a.getResources().getString(c.dU));
        } else
        if (elb1 != null)
        {
            ((hnd) (obj1)).b(elb1.a(((hnd) (obj1)).a));
        }
        elb1 = (hjv)ekq1.b(hjv);
        obj = (hjz)ekq1.b(hjz);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1656;
        }
        if (((hnd) (obj1)).c.a(((hnd) (obj1)).b.d()) && obj != null)
        {
            obj = Collections.unmodifiableList(((hjz) (obj)).a);
            elb1 = ((elb) (obj));
            if (obj != null)
            {
                ((hnd) (obj1)).a(((List) (obj)));
                ((hnd) (obj1)).a(new hni(((hnd) (obj1)), ekq1));
                elb1 = ((elb) (obj));
            }
        } else
        {
            if (elb1 == null)
            {
                break MISSING_BLOCK_LABEL_1656;
            }
            elb1 = Collections.singletonList(((hjv) (elb1)).a);
            ((hnd) (obj1)).a(elb1);
        }
_L28:
        if (elj1 == null && elb1 == null)
        {
            obj1.f = hnp.a;
        } else
        if (elj1 != null && elb1 != null)
        {
            obj1.f = hnp.d;
        } else
        if (elj1 != null)
        {
            obj1.f = hnp.c;
        } else
        {
            obj1.f = hnp.b;
        }
        ((hnd) (obj1)).a(new hnh(((hnd) (obj1))));
        if (aO) goto _L9; else goto _L13
_L13:
        elb1 = new Rect(an.b);
        j1 = ((Rect) (elb1)).top;
        obj = ay;
        hnf.a[((hnd) (obj)).f - 1];
        JVM INSTR tableswitch 1 2: default 652
    //                   1 1365
    //                   2 1371;
           goto _L14 _L15 _L16
_L14:
        i1 = ((hnd) (obj)).a.getResources().getDimensionPixelSize(b.wF);
_L24:
        elb1.top = i1 + j1;
        an.a(elb1);
        aO = true;
        if (super.R != null)
        {
            if (android.os.Build.VERSION.SDK_INT > 19)
            {
                super.R.requestApplyInsets();
            } else
            if (android.os.Build.VERSION.SDK_INT == 19)
            {
                super.R.requestFitSystemWindows();
            }
        }
        if (!aN && h().a("grid_fragment") != null)
        {
            ((hae)h().a("grid_fragment")).r().scrollToPosition(0);
        }
_L9:
        elb1 = (him)aA.b(him);
        flag = aH.a(hoj.a, aF.d());
        if (elb1 != null)
        {
            if (!((him) (elb1)).a.isEmpty())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0 && !aY && flag)
            {
                elb1 = O_();
                obj = new hmq(this);
                obj1 = new android.app.AlertDialog.Builder(elb1);
                ((android.app.AlertDialog.Builder) (obj1)).setTitle(c.dX).setIcon(b.wH).setMessage(c.dW).setPositiveButton(c.dY, new hnu(((hnv) (obj)), elb1)).setNegativeButton(c.dV, new hnt(((hnv) (obj)))).setOnCancelListener(new hns(((hnv) (obj))));
                ((android.app.AlertDialog.Builder) (obj1)).create().show();
            }
        }
        elb1 = (hjz)aA.b(hjz);
        obj = ao;
        if (aE.a(aF.d()) && elb1 != null && ((hjz) (elb1)).b > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj.a = flag;
        if (!w().a) goto _L18; else goto _L17
_L17:
        j1 = ag.A;
        obj = ax;
        elb1 = aA;
        obj1 = (ikw)elb1.b(ikw);
        elb1 = (iks)elb1.b(iks);
        if (elb1 == null)
        {
            elb1 = null;
        } else
        {
            elb1 = ((iks) (elb1)).a;
        }
        if (obj1 != null && ((ikw) (obj1)).b)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (!((fho) (obj)).d.a(((fho) (obj)).e.d()) || i1 != 0) goto _L20; else goto _L19
_L19:
        p.b(elb1, "Must have non-null auth key.");
        obj1 = new Bundle();
        ((Bundle) (obj1)).putString("auth_key", elb1);
        elb1 = new fhp();
        elb1.f(((Bundle) (obj1)));
        ((fho) (obj)).b.h().a().b(j1, elb1, "join_banner_fragment").b();
        if (!((fho) (obj)).g)
        {
            elb1 = new Rect(((fho) (obj)).c.b);
            elb1.bottom = ((Rect) (elb1)).bottom + ((fho) (obj)).f;
            ((fho) (obj)).c.a(elb1);
            obj.g = true;
            ((fho) (obj)).a();
        }
        i1 = 0;
_L27:
        if (!aN)
        {
            elb1 = au.b();
            if (elb1.getIntent() != null && elb1.getIntent().getIntExtra("account_id", -1) != -1)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (j1 == 0 && i1 != 0)
            {
                elb1 = au;
                if (!((dfu) (elb1)).a)
                {
                    elb1.a();
                }
            }
        }
        aU.a();
        if (aC.a() > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        a(flag);
        return;
        elb1;
        if (!b(elb1))
        {
            Toast.makeText(ad, c.ei, 1).show();
            return;
        }
          goto _L1
_L7:
        flag = ((hjv) (obj)).a.a(((hoa) (elb1)).e.g());
        if (i1 == 0 || j1 == 0 || flag) goto _L6; else goto _L21
_L21:
        flag = true;
          goto _L22
_L11:
        i1 = 0;
          goto _L23
_L15:
        i1 = 0;
          goto _L24
_L16:
        i1 = ((hnd) (obj)).a.getResources().getDimensionPixelSize(b.wC);
          goto _L24
_L20:
        obj.g = false;
        elb1 = ((fho) (obj)).b.h().a("join_banner_fragment");
        if (elb1 == null) goto _L26; else goto _L25
_L25:
        obj1 = new Rect(((fho) (obj)).c.b);
        obj1.bottom = ((Rect) (obj1)).bottom - ((fho) (obj)).f;
        if (((Rect) (obj1)).bottom < 0)
        {
            i1 = 0;
        } else
        {
            i1 = ((Rect) (obj1)).bottom;
        }
        obj1.bottom = i1;
        ((fho) (obj)).c.a(((Rect) (obj1)));
        ((fho) (obj)).a();
        ((fho) (obj)).b.h().a().a(elb1).b();
_L18:
        i1 = 0;
          goto _L27
_L26:
        i1 = 1;
          goto _L27
        elb1 = null;
          goto _L28
    }

    public final void a(gai gai1)
    {
        at.a = gai1;
        al.a(aw, at);
        if (aL == null)
        {
            av.a(aK, null, w().a);
            if (w().n)
            {
                h.c = gai1.b();
            }
        }
    }

    public final void a(Exception exception)
    {
        y();
        if (!nuo.a(this, exception, nup.c))
        {
            Toast.makeText(O_(), c.dZ, 1).show();
        }
    }

    public final void a(Object obj)
    {
        Object obj1;
        obj = (List)obj;
        hgz hgz1;
        boolean flag;
        boolean flag1;
        if (((List) (obj)).size() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a(flag1);
        if (av.e && flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            ((List) (obj)).add(new fre(aC.a()));
        }
        hgz1 = aC;
        obj1 = am;
        if (((hoe) (obj1)).b != null) goto _L2; else goto _L1
_L1:
        hgz1.a(((List) (obj)));
        aq.a();
        d.c = true;
        aU.a();
        if (aM && !aN)
        {
            ay.b(aM);
            aM = false;
        }
        return;
_L2:
        hgo ahgo[] = new hgo[((hoe) (obj1)).b.size()];
        ArrayList arraylist = new ArrayList();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            hgo hgo1 = (hgo)((Iterator) (obj)).next();
            if (((hoe) (obj1)).b.containsKey(Long.valueOf(hgo1.b())))
            {
                ahgo[((Integer)((hoe) (obj1)).b.get(Long.valueOf(hgo1.b()))).intValue()] = hgo1;
            } else
            {
                arraylist.add(hgo1);
            }
        }

        obj1 = new ArrayList(Arrays.asList(ahgo));
        ((List) (obj1)).addAll(arraylist);
        int i1 = 0;
        do
        {
            obj = obj1;
            if (i1 >= ((List) (obj1)).size())
            {
                continue;
            }
            int j1 = i1;
            if (((List) (obj1)).get(i1) == null)
            {
                ((List) (obj1)).remove(i1);
                j1 = i1 - 1;
            }
            i1 = j1 + 1;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void a(String s1)
    {
        Toast.makeText(O_(), c.en, 0).show();
        p.a(aJ);
        s1 = new hln(ad, aF.d(), aJ.longValue(), aK, s1);
        aG.a(s1);
    }

    public final void a(String s1, mue mue1, mua mua1)
    {
        if (!"ChangeAlbumTitleTask".equals(s1)) goto _L2; else goto _L1
_L1:
        if (mue1 != null && !mue1.c()) goto _L4; else goto _L3
_L3:
        if (mue1 != null)
        {
            s1 = mue1.c;
        }
        nuo.a(this, nup.o);
        s1 = ay;
        s1.a(((hnd) (s1)).d);
_L6:
        return;
_L4:
        Toast.makeText(O_(), c.el, 0).show();
        return;
_L2:
        if ("AddPendingMedia".equals(s1))
        {
            aG.b.a("AddPendingMedia");
            if (mue.a(mue1))
            {
                nuo.a(this, nup.q);
                return;
            }
            if (mue1 != null)
            {
                Toast.makeText(O_(), a(c.dT), 0).show();
                aU.a();
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(rv rv1)
    {
    }

    public final void a(rv rv1, boolean flag)
    {
        b.a(rv1, true);
        rv1.b(true);
        rv1.c(false);
    }

    public final void aj_()
    {
        super.aj_();
        aW.b(aV, this);
    }

    public final void au_()
    {
        super.au_();
        aW.a(aV, this);
    }

    public final void b(Intent intent)
    {
        y();
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        az = (ekq)super.q.getParcelable("com.google.android.apps.photos.core.media_collection");
        aE = (ifj)ae.a(ifj);
        aF = (mmr)ae.a(mmr);
        aH = (myf)ae.a(myf);
        aI = noz.a(ad, "AlbumFragment", new String[0]);
        if (w().g)
        {
            f.a = false;
            (new dhg(this, af, f, ag.m, null)).a(ae);
        }
        if (w().q)
        {
            (new dhg(this, af, g, ag.U, pwr.v)).a(ae);
        }
        if (w().o)
        {
            (new dhg(this, af, ag, ag.v, null)).a(ae);
        }
        if (w().k)
        {
            (new dhg(this, af, new hmx(this), ag.V, pwr.y)).a(ae);
        }
        if (w().p)
        {
            (new dhg(this, af, new hms(this), ag.s, pwr.f)).a(ae);
        }
        if (w().r)
        {
            (new dhg(this, af, new hmt(this), ag.u, pwr.i)).a(ae);
        }
        if (w().a)
        {
            (new dhg(this, af, ah, ag.T, pwz.g)).a(ae);
            if (!w().b)
            {
                (new dhg(this, af, new hoz(), ag.S, pwz.f)).a(ae);
            }
        }
        if (aE.a(aF.d()))
        {
            if (w().a)
            {
                (new dhg(this, af, as, ag.Q, pwz.n)).a(ae);
                (new dhg(this, af, aj, ag.k, pwr.a)).a(ae);
                aj.f = false;
                (new dhg(this, af, ap, ag.B, pwz.e)).a(ae);
            }
            if (w().a)
            {
                bundle = ak;
                ekq ekq1 = az;
                p.b(ekq1, "Envelope media collection must not be null.");
                bundle.a = ekq1;
                (new dhg(this, af, ak, ag.P, pwz.l)).a(ae);
            }
        }
        bundle = hik.b;
        (new dhg(this, af, new fnn(fnl.d), ag.y, pwr.k)).a(ae);
        (new dhg(this, af, new egn(q.au, q.at, pwr.d), ag.j, null)).a(ae);
        aC = new hgz(ad, true, new hnr());
        bundle = am;
        Object obj = aC;
        bundle.a = ((hgz) (obj));
        ((hgz) (obj)).a(((hoe) (bundle)).c);
        bundle = (hls)ae.a(hls);
        obj = aC;
        bundle.b = ((hgz) (obj));
        if (((hls) (bundle)).c)
        {
            ((hgz) (obj)).a(((hls) (bundle)).d);
        }
        obj = hbg.c(ad);
        if (w().c)
        {
            bundle = hap.d;
        } else
        {
            bundle = hap.c;
        }
        obj.b = bundle;
        obj.f = false;
        aB = ((hbh) (obj)).a();
        aV = new ehr(az, ekw.a);
        bundle = (hpe)az.a(hpe);
        aJ = ((hpe) (bundle)).a.b;
        aK = ((hpe) (bundle)).a.a;
        bundle = (iks)az.b(iks);
        if (bundle != null)
        {
            aL = ((iks) (bundle)).a;
            as.c = aL;
        }
        aD = (dhw)ae.a(dhw);
        aG = ((mtj)ae.a(mtj)).a(this);
        aQ = (dyx)ae.a(dyx);
        ((hyy)ae.a(hyy)).a(w().q);
        aP = (hhq)ae.a(hhq);
        aR = (hqv)ae.a(hqv);
        aS = (gog)ae.a(gog);
        aT = (dhk)ae.a(dhk);
        aU = (dha)ae.a(dha);
        aX = (hkl)ae.a(hkl);
        aW = (gaj)ae.a(gaj);
        bundle = ae;
        bundle.a(flj, flj.a);
        bundle.a(frm, this);
        bundle.a(hoc, this);
        bundle.a(hba, aq);
        bundle.a(hgz, aC);
        bundle.a(hbg, aB);
        bundle.a(mso, this);
        bundle.a(jcq, this);
        bundle.a(hqq, aR);
        bundle.a(fsl, new fsl(ad, az, aF.d()));
        bundle.b(dhc, this);
        bundle.a(enu, new enu());
        bundle.a(eno, new eno(ad, aX));
        bundle = (hlj)ae.b(hlj);
        if (bundle != null)
        {
            hgz hgz1 = aC;
            bundle.b = hgz1;
            hgz1.a(((hlj) (bundle)).a);
        }
        if (w().d)
        {
            ay = new hnd(af, w().r);
            aR.a(this);
        }
        (new gpg(this, af, this, aS)).a(ae);
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("upgrade_dialog_dismissed", aY);
        super.e(bundle);
    }

    public final void n()
    {
        aR.b(this);
        super.n();
    }

    public final msm r()
    {
        msp msp;
        if (w().a)
        {
            msp = pwz.i;
        } else
        {
            msp = pwt.a;
        }
        return new ogu(msp, new String[] {
            aK
        });
    }

    public final void s()
    {
    }

    public final gob t()
    {
        return b(az, w());
    }

    public final am u()
    {
        return h().a(ag.z);
    }

    public final boolean v()
    {
        boolean flag = true;
        if (!b.w(ad))
        {
            ay ay1 = h();
            nuq nuq1 = new nuq();
            nuq1.a = nup.o;
            nuq1.c = "offline_retry_tag_rename_album";
            nuq1.e = true;
            nuo.a(ay1, nuq1);
            flag = false;
        }
        return flag;
    }

    static 
    {
        b = (new ekm()).a(hjp).a(hjr).a(hpe).b(him).b(hjn).b(iks).b(hjv).b(ikw).b(hkd).b(elj).b(hjz).b(iku).b(gsn).b(him).a(fho.a).a();
    }
}
