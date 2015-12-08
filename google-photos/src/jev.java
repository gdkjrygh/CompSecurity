// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.photos.videoplayer.view.VideoViewHolder;
import java.util.List;

public class jev extends omp
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener, android.view.View.OnClickListener, fph, gqx, gzk, jej
{

    private static final ekk a = (new ekm()).b(jdy).b(jdv).b(hpg).b(jgl).b(jgi).a();
    private boolean aA;
    private jfo aB;
    private gxr aC;
    private gpu aD;
    private gqw aE;
    private final jfg aF = new jfg(this);
    private mtj aG;
    private noz aH;
    private int aI;
    private egp aJ;
    private final nug aK = new jex(this);
    private grl ag;
    private jdq ah;
    private jfq ai;
    private jgf aj;
    private jgd ak;
    private mwx al;
    private mwz am;
    private int an;
    private int ao;
    private jdy ap;
    private jea aq;
    private jed ar;
    private mmr as;
    private int at;
    private FrameLayout au;
    private jhb av;
    private VideoViewHolder aw;
    private boolean ax;
    private boolean ay;
    private boolean az;
    private final jdp b;
    private final jet c = new jet();
    private final jdu d = new jdu();
    private grn e;
    private jgc f;
    private jfz g;
    private jgl h;

    public jev()
    {
        b = new jdp(af);
        aG = (new mtj(this, af)).a("RequestMediaItemTask", new jew(this));
        new ghb(af, new jey(this), (short)0);
        new ghb(af, new jez(this), null);
        new ghb(af, new jfa(this), false);
        new ghb(af, new jfb(this), null);
        new fpi(this, af, ad);
    }

    private void A()
    {
        if (au.getVisibility() == 0)
        {
            int i1 = g().getInteger(0x10e0001);
            au.animate().alpha(0.0F).setDuration(i1).setListener(new jfc(this)).start();
        }
        jek jek1;
        jdu jdu1;
        if (ai.isPlaying())
        {
            aw.b(true);
            av.a(4);
        } else
        if (ay && ai.f())
        {
            aw.b(true);
            if (!aw.e() && av.a())
            {
                av.a(0);
            } else
            {
                av.a(4);
            }
        } else
        if ((!ay || av.a()) && av.a())
        {
            av.a(0);
            aw.b(false);
        } else
        {
            av.a(4);
            aw.b(false);
        }
        jdu1 = d;
        if (ai.isPlaying())
        {
            jek1 = jek.b;
        } else
        {
            jek1 = jek.a;
        }
        jdu1.a(jek1);
    }

    private void B()
    {
        if (am != null)
        {
            al.a(am);
        }
        if (c.a(ad))
        {
            return;
        } else
        {
            aD.b(gxi.a);
            return;
        }
    }

    private boolean C()
    {
        return !jee.a.equals(ap.d) || ai == null || !ai.e() || ai.f;
    }

    private void D()
    {
        int i1 = g().getInteger(0x10e0000);
        au.setAlpha(0.0F);
        au.setVisibility(0);
        au.animate().alpha(1.0F).setDuration(i1).setListener(null);
    }

    private void E()
    {
        while (ai == null || ai.getDuration() <= 0 || jga.c(g.b) || h == null) 
        {
            return;
        }
        float f1 = (float)h.a / (float)ai.getDuration();
        float f2 = (float)h.b / (float)ai.getDuration();
        g.a(f1, f2, false);
    }

    static mwz a(jev jev1, mwz mwz)
    {
        jev1.am = null;
        return null;
    }

    static noz a(jev jev1)
    {
        return jev1.aH;
    }

    private void a(int i1, boolean flag)
    {
        f.a(ak.a(i1), false);
    }

    private static void a(View view, int i1)
    {
        ((TextView)view.findViewById(b.Cl)).setText(i1);
    }

    private void a(String s)
    {
        jfo jfo1;
        if (O_().isFinishing() || aq == null || !ay)
        {
            return;
        }
        if (aH.a())
        {
            noy.a("reason", s);
        }
        if (aq == null)
        {
            s = null;
        } else
        {
            s = aq.a;
        }
        if (aH.a())
        {
            noy.a("mediaPlayer", ai);
            noy.a("videoTextureViewHolder", aw);
            noy.a("videoUri", s);
        }
        ai = aB.a(s);
        if (ai != null && !ai.i()) goto _L2; else goto _L1
_L1:
        Object obj;
        jfo1 = aB;
        boolean flag = ap.c();
        p.b(s, "uri must not be null");
        if (flag && !nkj.a(s.toString()))
        {
            s = String.valueOf(s);
            throw new IllegalStateException((new StringBuilder(String.valueOf(s).length() + 51)).append("Security exception: requiresAuth for non-fife Uri: ").append(s).toString());
        }
        obj = jfo1.b;
        Uri uri;
        if (((jfn) (obj)).a(s) && !((jfn) (obj)).a.i())
        {
            obj = ((jfn) (obj)).a;
        } else
        {
            if (((jfn) (obj)).a != null)
            {
                ((jfn) (obj)).a(true);
            }
            obj.a = new jfq(((jfn) (obj)).O_().getApplicationContext(), s, flag);
            obj = ((jfn) (obj)).a;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        java.util.Map map;
        int i1;
        uri = ((jfq) (obj)).c;
        if (b.e(uri) && !b.f(uri))
        {
            throw new IllegalStateException("Security exception: video urls must be proxied for streaming.");
        }
        i1 = jfo1.e.d();
        map = jfo1.d.b(i1);
        if (map == null) goto _L6; else goto _L5
_L5:
        jfo1.a(((jfq) (obj)), map);
_L8:
        ai = ((jfq) (obj));
_L2:
        c.a = ai;
        obj = ai;
        obj.i = this;
        obj.j = this;
        obj.l = this;
        obj.k = this;
        ((jfq) (obj)).a(aw);
        w();
        aw.a(ai);
        if (aH.a())
        {
            noy.a("mediaPlayer", ai);
            noy.a("videoTextureViewHolder", aw);
            noy.a("videoUri", s);
        }
        s = f;
        boolean flag1;
        if (ai.e() && !ai.f)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        s.a(flag1);
        if (ai.e())
        {
            v();
            if (ai.isPlaying())
            {
                aw.setKeepScreenOn(true);
                aw.a(aE.a());
                ag.a(true);
                c.a();
            }
        }
        if (ai.isPlaying())
        {
            b.a();
        }
        if (aH.a())
        {
            noy.a("videoTextureViewHolder", aw);
            noy.a("mediaPlayer", ai);
        }
        y();
        return;
_L6:
        jfo1.a.add(obj);
        if (!jfo1.c.a("com.google.android.apps.photos.httpauth.LoadAuthHeadersTask"))
        {
            jfo1.c.a(new nan(i1));
        }
        continue; /* Loop/switch isn't completed */
_L4:
        jfo1.a(((jfq) (obj)), jfo1.d.a());
        if (true) goto _L8; else goto _L7
_L7:
    }

    static void a(jev jev1, String s)
    {
        jev1.a(s);
    }

    static void a(jev jev1, mue mue1)
    {
        if (mue1 == null || mue1.c())
        {
            return;
        } else
        {
            jev1.ap = (jdy)mue1.a().getParcelable("videoFeature");
            jev1.az = true;
            jev1.r();
            jev1.a("onBackgroundTaskFinished");
            jev1.u();
            return;
        }
    }

    private void a(jff jff1, String s)
    {
        while (aJ.b() || !b.a()) 
        {
            return;
        }
        if (aH.a())
        {
            noy.a("reason", s);
            noy.a("transition", jff1);
        }
        aw.setKeepScreenOn(true);
        d.a(jek.b);
        if (ai.getCurrentPosition() >= ai.getDuration())
        {
            ai.seekTo(0);
        }
        ai.start();
        ag.a(true);
        ai.a(jfw.a);
        c.a();
        if (!aE.a())
        {
            switch (jfd.a[jff1.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                c(2000);
                return;

            case 2: // '\002'
                B();
                break;
            }
            return;
        } else
        {
            aw.a(true);
            return;
        }
    }

    static boolean a(jev jev1, boolean flag)
    {
        jev1.ay = flag;
        return flag;
    }

    private void b(int i1)
    {
        ao = i1;
        ak.a = ao;
        f.a(ao);
        aj.a(ao);
    }

    private void b(String s)
    {
        if (ai == null)
        {
            return;
        }
        Object obj;
        boolean flag;
        if (!O_().isChangingConfigurations())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (aH.a())
        {
            noy.a("reason", s);
            noy.a("VideoViewFragment", this);
            noy.a("destroyMediaPlayerOnUnregister", Boolean.valueOf(flag));
            noy.a("videoTextureViewHolder", aw);
            noy.a("mediaPlayer", ai);
        }
        s = e.b;
        break MISSING_BLOCK_LABEL_87;
        if (ai != null && ai.e() && s != null && g.c && jga.c(g.b))
        {
            mtj.a(ad, new jdt(s, (int)(jga.a(g.b) * (float)ai.getDuration()), (int)(jga.b(g.b) * (float)ai.getDuration())));
        }
        at = ai.getCurrentPosition();
        s = ai;
        s.i = null;
        s.j = null;
        s.l = null;
        s.k = null;
        s.a(null);
        ai.b();
        if (flag)
        {
            aw.f();
            obj = aB;
            s = ai;
            ((jfo) (obj)).a.remove(s);
            obj = ((jfo) (obj)).b;
            if (((jfn) (obj)).a(((jfq) (s)).b))
            {
                ((jfn) (obj)).a(false);
                obj.a = null;
            }
        }
        ai = null;
        c.a = null;
        return;
    }

    static void b(jev jev1)
    {
        jev1.x();
    }

    static void b(jev jev1, String s)
    {
        jev1.b(s);
    }

    static boolean b(jev jev1, boolean flag)
    {
        jev1.ax = flag;
        return flag;
    }

    private void c(int i1)
    {
        if (am != null)
        {
            al.a(am);
        }
        if (c.a(ad))
        {
            return;
        } else
        {
            am = al.a(new jfe(this), 2000L);
            return;
        }
    }

    private void c(String s)
    {
        a(jff.a, s);
    }

    static void c(jev jev1)
    {
        jgi jgi1 = (jgi)jev1.e.b.b(jgi);
        if (jgi1 != null)
        {
            jev1.aj.a(jgi1);
            jev1.g.a(jev1.aj.a());
        }
        jev1.h = (jgl)jev1.e.b.b(jgl);
        jev1.E();
    }

    static jdy d(jev jev1)
    {
        return jev1.ap;
    }

    static grn e(jev jev1)
    {
        return jev1.e;
    }

    static void f(jev jev1)
    {
        jev1.r();
    }

    static void g(jev jev1)
    {
        jev1.u();
    }

    static void h(jev jev1)
    {
        if (jev1.ai != null)
        {
            if (jev1.f.e)
            {
                int i1 = jev1.ak.b(jev1.f.c);
                if (jev1.ai.f())
                {
                    jev1.ai.seekTo(i1);
                } else
                {
                    jev1.ai.a(jfw.c);
                    jev1.ai.start();
                    jev1.ai.pause();
                    jev1.ai.seekTo(i1);
                }
                if (jev1.ai.isPlaying())
                {
                    jev1.c(2000);
                }
            }
            jev1.y();
        }
    }

    static jgf i(jev jev1)
    {
        return jev1.aj;
    }

    static FrameLayout j(jev jev1)
    {
        return jev1.au;
    }

    static void k(jev jev1)
    {
        jev1.w();
    }

    static void l(jev jev1)
    {
        jev1.y();
    }

    static jfq m(jev jev1)
    {
        return jev1.ai;
    }

    static VideoViewHolder n(jev jev1)
    {
        return jev1.aw;
    }

    static jhb o(jev jev1)
    {
        return jev1.av;
    }

    static void p(jev jev1)
    {
        jev1.B();
    }

    private void r()
    {
        if (aH.a())
        {
            noy.a("videoTextureViewHolder", aw);
        }
        if (ap == null && (e.c || ah.a(e.b)))
        {
            ap = (jdy)e.b.b(jdy);
        }
        if (ap != null) goto _L2; else goto _L1
_L1:
        if (aH.a())
        {
            noy.a("videoTextureViewHolder", aw);
        }
_L4:
        return;
_L2:
        if (ap.a() || ap.b())
        {
            break; /* Loop/switch isn't completed */
        }
        if (jee.b.equals(ap.d))
        {
            a(super.R, c.fD);
            z();
        }
        if (aH.a())
        {
            noy.a("videoTextureViewHolder", aw);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (ar == null)
        {
            ar = new jed(ap, (npk)ae.a(npk), (jdr)ae.a(jdr));
        }
        if (aq == null)
        {
            aq = ar.a();
        }
        if (aH.a())
        {
            noy.a("currentStream", aq);
            noy.a("videoTextureViewHolder", aw);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private void u()
    {
        jdv jdv1 = (jdv)e.b.b(jdv);
        if (jdv1 != null)
        {
            int i1 = (int)jdv1.p();
            if (i1 != 0)
            {
                b(i1);
            }
        }
    }

    private void v()
    {
        int i1 = ai.getDuration();
        ak.b = i1;
        if (ao == 0)
        {
            b(i1);
        }
        a(ai.getCurrentPosition(), false);
    }

    private void w()
    {
        if (ay && !ax)
        {
            aw.b();
        }
    }

    private void x()
    {
        if (aH.a())
        {
            noy.a("mediaPlayer", ai);
        }
        if (ai == null)
        {
            return;
        }
        aw.setKeepScreenOn(false);
        aw.a(false);
        d.a(jek.a);
        if (ai.isPlaying())
        {
            ai.pause();
        }
        at = ai.getCurrentPosition();
        ag.a(false);
        b.b();
        if (ai.f())
        {
            ai.a(jfw.c);
            ai.seekTo(at);
        }
        y();
    }

    private void y()
    {
        if (ap == null)
        {
            return;
        }
        boolean flag = jee.a.equals(ap.d);
        if (!jee.b.equals(ap.d))
        {
            if (ai == null || ai.e != jfv.a && (!ai.e() || ai.f))
            {
                if (C())
                {
                    au.findViewById(b.Cu).setVisibility(8);
                    au.findViewById(b.Cl).setVisibility(8);
                    au.findViewById(b.Ck).setVisibility(0);
                    if (au.getVisibility() == 8)
                    {
                        D();
                    }
                }
                d.a(jek.c);
                return;
            }
            if (flag && ai.e != jfv.a)
            {
                A();
                return;
            }
        }
        z();
    }

    private void z()
    {
        if (C())
        {
            if (jee.b.equals(ap.d))
            {
                au.findViewById(b.Cu).setVisibility(0);
                au.findViewById(b.Cl).setVisibility(8);
                au.findViewById(b.Ck).setVisibility(8);
            } else
            {
                au.findViewById(b.Cu).setVisibility(8);
                au.findViewById(b.Cl).setVisibility(0);
                au.findViewById(b.Ck).setVisibility(8);
            }
            if (au.getVisibility() == 8)
            {
                D();
            }
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.CB, null);
        layoutinflater.findViewById(b.Ct).setOnClickListener(this);
        av = new jhb(ad, (ImageView)layoutinflater.findViewById(b.Cs));
        aw = VideoViewHolder.a(layoutinflater);
        c.a(f, aw, aj, ak);
        au = (FrameLayout)layoutinflater.findViewById(0x1020004);
        an = au.getPaddingRight();
        aI = au.findViewById(b.Cu).getPaddingLeft();
        return layoutinflater;
    }

    public final void a(int i1, int j1)
    {
        au.setPadding(au.getPaddingLeft(), au.getPaddingTop(), an + i1, au.getPaddingBottom());
        TextView textview = (TextView)au.findViewById(b.Cu);
        textview.setPadding(aI + i1, textview.getPaddingTop(), textview.getPaddingRight(), textview.getPaddingBottom());
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        Bundle bundle1 = super.q;
        if (bundle == null)
        {
            if (bundle1 != null && bundle1.containsKey("videoFeature"))
            {
                ap = (jdy)bundle1.getParcelable("videoFeature");
            }
        } else
        {
            ap = (jdy)bundle.getParcelable("videoFeature");
            at = bundle.getInt("position", 0);
            az = bundle.getBoolean("performedRefetch", false);
        }
        if (bundle1 != null)
        {
            aA = bundle1.getBoolean("android.intent.extra.finishOnCompletion", false);
        }
        aj = new jgf(ad);
        aj.a(new jge(jga.a(g.b), jga.b(g.b)));
        ak = new jgd();
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        a(view, c.fz);
    }

    public final void a(jel jel)
    {
        d.a(jel);
        if (ai != null)
        {
            A();
        }
    }

    public final void a(jfw jfw1)
    {
        if (ai == null)
        {
            return;
        } else
        {
            ai.a(jfw1);
            return;
        }
    }

    public final void a(boolean flag)
    {
        if (ag.a)
        {
            aw.a(flag);
            y();
        }
    }

    public final boolean a()
    {
        return ai != null && ai.isPlaying();
    }

    public final void aj_()
    {
        super.aj_();
        if (aH.a())
        {
            noy.a("videoTextureViewHolder", aw);
            noy.a("mediaPlayer", ai);
        }
        c.b();
        aJ.a().a(aK);
    }

    public final void au_()
    {
        super.au_();
        aJ.a().a(aK, false);
    }

    public final void b()
    {
        if (ai == null)
        {
            return;
        } else
        {
            c("public play method");
            return;
        }
    }

    public final void c()
    {
        x();
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        e = (grn)ae.a(grn);
        f = (jgc)ae.a(jgc);
        g = (jfz)ae.a(jfz);
        ag = (grl)ae.a(grl);
        ah = (jdq)ae.a(jdq);
        aB = (jfo)ae.a(jfo);
        al = (mwx)ae.a(mwx);
        aC = (gxr)ae.a(gxr);
        aD = (gpu)ae.a(gpu);
        aE = (gqw)ae.a(gqw);
        as = (mmr)ae.a(mmr);
        aH = noz.a(ad, 2, "VideoViewFragment", new String[0]);
        aJ = (egp)ae.a(egp);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("position", az);
        bundle.putInt("position", at);
        bundle.putParcelable("videoFeature", ap);
    }

    public final void l()
    {
        super.l();
        if (aH.a())
        {
            noy.a("videoTextureViewHolder", aw);
            noy.a("mediaPlayer", ai);
        }
        aE.a(this);
        r();
        aC.a(aF);
        y();
    }

    public final void m()
    {
        super.m();
        if (aH.a())
        {
            noy.a("videoTextureViewHolder", aw);
            noy.a("mediaPlayer", ai);
        }
        aE.b(this);
        aC.b(aF);
        ag.a(false);
        if (ai != null && aq != null)
        {
            at = ai.getCurrentPosition();
            if (!O_().isChangingConfigurations())
            {
                x();
            }
        }
        b("onPause");
        b.b();
    }

    public void onClick(View view)
    {
        if (view.getId() == b.Ct)
        {
            B();
        }
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        if (aH.a())
        {
            noy.a("mp", mediaplayer);
            noy.a("mediaPlayer", ai);
        }
        c.b();
        if (ai == null) goto _L2; else goto _L1
_L1:
        if (!PreferenceManager.getDefaultSharedPreferences(ad).getBoolean("com.google.android.apps.photos.videoplayer.loop_video", true)) goto _L4; else goto _L3
_L3:
        mediaplayer = super.R;
        if (jee.a.equals(ap.d))
        {
            if (aq != null)
            {
                a(jff.c, "onCompletion");
            } else
            {
                a(mediaplayer, c.fC);
            }
        } else
        {
            a(mediaplayer, c.fz);
        }
        y();
_L6:
        return;
_L4:
        ai.seekTo(ai.getDuration());
        a(ai.getDuration(), false);
_L2:
        x();
        if (aA)
        {
            O_().finish();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onError(MediaPlayer mediaplayer, int i1, int j1)
    {
        Object obj = null;
        if (az || i1 != 1 || !ap.b()) goto _L2; else goto _L1
_L1:
        if (aH.a())
        {
            noy.a("videoTextureViewHolder", aw);
            noy.a("mediaPlayer", ai);
        }
        mediaplayer = (hpg)e.b.b(hpg);
        if (mediaplayer != null) goto _L4; else goto _L3
_L3:
        mediaplayer = obj;
_L8:
        if (mediaplayer != null)
        {
            mediaplayer = new jfh(as.d(), mediaplayer, ap, (jdr)ae.a(jdr));
            aG.a(mediaplayer);
        }
_L6:
        return true;
_L4:
        hpk hpk1 = mediaplayer.b();
        mediaplayer = obj;
        if (hpk1 != null)
        {
            mediaplayer = obj;
            if (hpk1.a())
            {
                mediaplayer = hpk1.c;
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        mediaplayer = super.R;
        if (mediaplayer == null) goto _L6; else goto _L5
_L5:
        a(mediaplayer, c.fC);
        y();
        return true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean onInfo(MediaPlayer mediaplayer, int i1, int j1)
    {
        y();
        return true;
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        while (ai == null || super.R == null) 
        {
            return;
        }
        ai.seekTo(at);
        v();
        E();
        f.a(true);
        if (ay && ah.a(e.b))
        {
            mediaplayer = ah;
            mediaplayer.c = true;
            ((jdq) (mediaplayer)).a.b();
            c("onPrepared");
        }
        y();
    }

    public final ekk t()
    {
        return a;
    }

}
