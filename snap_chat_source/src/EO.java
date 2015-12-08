// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.support.v8.renderscript.RenderScript;
import android.view.ViewGroup;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.SnapViewEventAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.controller.stories.StoryLoadingContext;
import com.snapchat.android.model.StoryCollection;
import com.snapchat.android.stories.analytics.StoryLoadingStatus;
import com.snapchat.android.stories.ui.StorySnapViewGroup;
import com.snapchat.android.ui.SnapTimerView;
import com.snapchat.android.ui.SponsoredSlugView;
import com.snapchat.android.ui.StoryTimerView;
import com.snapchat.android.ui.TextureVideoView;
import com.snapchat.android.ui.snapview.SnapViewSessionStopReason;
import com.snapchat.android.util.debug.FeatureFlagManager;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.squareup.otto.Bus;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class EO
    implements Eq.a
{
    /* member class not found */
    class a {}


    protected static final boolean a;
    private EQ A;
    private final Eq B;
    private boolean C;
    private Hd D;
    private He E = new He() {

        private EO a;

        public final void a(Hd hd)
        {
            Timber.c("StoryPlaybackController", "SNAP-VIEW: session started for %s", new Object[] {
                hd.a()
            });
            a.f.a(hd.c());
            EO.a(a, true);
            if (EO.a)
            {
                AO ao = hd.b();
                Object obj;
                if (ao == null)
                {
                    obj = null;
                } else
                {
                    obj = ao.e();
                }
                if (obj != null)
                {
                    boolean flag;
                    if (Ic.IS_GALAXY_S6 && ((Hb) (obj)).ak())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        Timber.c("StoryPlaybackController", "SNAP-VIEW: Skipping preload on S6", new Object[0]);
                    } else
                    {
                        Timber.c("StoryPlaybackController", (new StringBuilder("SNAP-VIEW: Preloading next snap: ")).append(obj).toString(), new Object[0]);
                        EO eo = a;
                        EO eo1 = a;
                        sS ss1 = a.c;
                        EO.a(eo, eo1.a(((Hb) (obj)), ao, sS.a(((Hb) (obj))), a.d.a(((Hb) (obj)), ao)));
                        EO.a(a).h();
                    }
                } else
                {
                    Timber.c("StoryPlaybackController", "SNAP-VIEW: No snap to pre-load", new Object[0]);
                }
            }
            for (obj = a.g.iterator(); ((Iterator) (obj)).hasNext(); ((sJ)((Iterator) (obj)).next()).a(hd.a())) { }
            if (EO.b(hd.a()))
            {
                EO.a(a, (GX)hd);
            }
            a.e.a(new Ok());
            if (EO.b(a))
            {
                EO.c(a);
                EO.d(a).a(true);
            }
        }

        public final void a(Hd hd, SnapViewSessionStopReason snapviewsessionstopreason)
        {
            if (EO.d(a) != hd) goto _L2; else goto _L1
_L1:
            Timber.c("StoryPlaybackController", "SNAP-VIEW: primary session stopped for %s, reason %s", new Object[] {
                hd.a(), snapviewsessionstopreason
            });
            EO.a(a, false);
            if (snapviewsessionstopreason != SnapViewSessionStopReason.ERROR_STARTING_MEDIA_UNAVAILABLE_LOCALLY) goto _L4; else goto _L3
_L3:
            EO.a(a, hd.a());
_L6:
            a.i.a(hd.a().d(), StoryLoadingStatus.ABANDONED);
            for (Iterator iterator = a.g.iterator(); iterator.hasNext(); ((sJ)iterator.next()).a(hd.a(), snapviewsessionstopreason, 0)) { }
            break; /* Loop/switch isn't completed */
_L4:
            if (snapviewsessionstopreason == SnapViewSessionStopReason.ERROR_UNABLE_TO_SHOW_MEDIA)
            {
                if (ReleaseManager.f())
                {
                    a.e.a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, "ALPHA-ONLY: Snap skipped, media player error"));
                }
                a.a(hd, snapviewsessionstopreason);
            } else
            if (snapviewsessionstopreason != SnapViewSessionStopReason.ABORT_REQUESTED && snapviewsessionstopreason != SnapViewSessionStopReason.TEMPORARY_ABORT_REQUEST)
            {
                a.a(hd, snapviewsessionstopreason);
            }
            if (true) goto _L6; else goto _L5
_L2:
            if (EO.a(a) == hd)
            {
                Timber.c("StoryPlaybackController", "SNAP-VIEW: next session stopped for %s, reason %s", new Object[] {
                    hd.a(), snapviewsessionstopreason
                });
                if (snapviewsessionstopreason == SnapViewSessionStopReason.ERROR_STARTING_MEDIA_UNAVAILABLE_LOCALLY)
                {
                    snapviewsessionstopreason = hd.a();
                    if (snapviewsessionstopreason instanceof Bk)
                    {
                        a.b.a((Bk)snapviewsessionstopreason);
                    } else
                    {
                        EO.a(a, hd.a());
                    }
                }
                EO.a(a).j();
                EO.a(a, null);
            }
_L5:
        }

            
            {
                a = EO.this;
                super();
            }
    };
    private final He F;
    protected final sX b;
    protected final sS c;
    protected final sU d;
    protected final Bus e;
    protected final Ds f;
    protected final Set g;
    protected final Ey h;
    protected final Ev i;
    public int j;
    public boolean k;
    public StoryTimerView l;
    public SnapTimerView m;
    public Hd n;
    public Bitmap o;
    public Fl p;
    private StorySnapViewGroup q;
    private SnapViewEventAnalytics r;
    private Ha s;
    private ViewGroup t;
    private lm u;
    private Ch v;
    private Ew w;
    private SponsoredSlugView x;
    private Cg y;
    private Bj z;

    public EO(Context context, StorySnapViewGroup storysnapviewgroup, ViewGroup viewgroup, EQ eq, SponsoredSlugView sponsoredslugview)
    {
        Bus bus = Mf.a();
        Ha ha = new Ha(context);
        SnapViewEventAnalytics snapvieweventanalytics = SnapViewEventAnalytics.a();
        lm lm1 = lm.a();
        context = new Ds(new Dx(context));
        new a();
        sX sx = sX.a();
        Ch ch = Ch.a();
        Ew ew = Ew.a();
        java.util.HashSet hashset = eB.a(new sJ[] {
            new tj(), CG.a()
        });
        sS ss = new sS();
        sU su = new sU();
        Cg cg = Cg.a();
        FeatureFlagManager.a();
        Bj bj = Bj.a();
        new ta();
        this(storysnapviewgroup, viewgroup, bus, ha, snapvieweventanalytics, lm1, ((Ds) (context)), sx, ch, ew, ((Set) (hashset)), ss, su, cg, eq, bj, sponsoredslugview, new Ey(), Eq.a(), Ev.a());
    }

    private EO(StorySnapViewGroup storysnapviewgroup, ViewGroup viewgroup, Bus bus, Ha ha, SnapViewEventAnalytics snapvieweventanalytics, lm lm1, Ds ds, 
            sX sx, Ch ch, Ew ew, Set set, sS ss, sU su, Cg cg, 
            EQ eq, Bj bj, SponsoredSlugView sponsoredslugview, Ey ey, Eq eq1, Ev ev)
    {
        j = 0;
        k = false;
        C = false;
        o = null;
        p = new Fl(n);
        F = new Hf(new Handler(Looper.getMainLooper()), E);
        q = storysnapviewgroup;
        e = bus;
        s = ha;
        r = snapvieweventanalytics;
        f = ds;
        b = sx;
        v = ch;
        g = set;
        c = ss;
        d = su;
        t = viewgroup;
        u = lm1;
        w = ew;
        y = cg;
        A = eq;
        z = bj;
        x = sponsoredslugview;
        h = ey;
        f.a(t);
        B = eq1;
        i = ev;
        e.c(this);
    }

    static Hd a(EO eo)
    {
        return eo.D;
    }

    static Hd a(EO eo, Hd hd)
    {
        eo.D = hd;
        return hd;
    }

    public static String a(Hb hb)
    {
        if (hb instanceof AT)
        {
            return ((AT)hb).j();
        } else
        {
            return "PLACEHOLDER_CONTENT_PROVIDER";
        }
    }

    static void a(EO eo, GX gx)
    {
        Eq eq = eo.B;
        if (gx.c != null)
        {
            Timber.c(Eq.a, "start generating blurred image for: %s", new Object[] {
                gx.c.d()
            });
        }
        if (eq.f == null)
        {
            eq.f = RenderScript.create(eq.b);
        }
        Bitmap bitmap = eq.c.a(eq.d, eq.e, android.graphics.Bitmap.Config.ARGB_8888);
        if (bitmap == null)
        {
            bitmap = Bitmap.createBitmap(eq.d, eq.e, android.graphics.Bitmap.Config.ARGB_8888);
        }
        com.snapchat.android.rendering.SnapMediaRenderer snapmediarenderer = gx.g;
        if (snapmediarenderer != null)
        {
            Hb hb = gx.c;
            if (hb.ak())
            {
                gx = (DB)snapmediarenderer;
                if (((DB) (gx)).c instanceof TextureVideoView)
                {
                    gx = ((TextureVideoView)((DB) (gx)).c).getBitmap(bitmap);
                } else
                {
                    gx = null;
                }
            } else
            {
                gx = Bitmap.createScaledBitmap(((Dy)snapmediarenderer).e(), eq.d, eq.e, false);
            }
            if (gx != null)
            {
                PG.b(new Eq._cls1(eq, hb, snapmediarenderer, gx, eo));
            }
        }
    }

    static void a(EO eo, Hb hb)
    {
        if (hb instanceof Bk)
        {
            hb = (Bk)hb;
            hb.l();
            if (hb.ak())
            {
                Ka.STORY_RECEIVED_VIDEO_CACHE.e(hb.i());
            } else
            {
                Ka.STORY_RECEIVED_IMAGE_CACHE.e(hb.i());
            }
            eo.b.a(hb);
        } else
        {
            if (hb instanceof AT)
            {
                eo = (AT)hb;
                eo.l();
                if (eo.ak())
                {
                    Ka.SNAP_RECEIVED_VIDEO_CACHE.e(eo.i());
                } else
                {
                    Ka.SNAP_RECEIVED_IMAGE_CACHE.e(eo.i());
                }
                (new mt(eo)).a();
                return;
            }
            if (ReleaseManager.e())
            {
                throw new NullPointerException();
            }
        }
    }

    private void a(Hb hb, sZ sz, sR sr, sT st)
    {
        PG.a();
        Timber.c("StoryPlaybackController", "SNAP-VIEW: Show snap %s", new Object[] {
            hb
        });
        if (n != null)
        {
            if (n.a() == hb)
            {
                Hd hd = n;
                Timber.e("StoryPlaybackController", "SNAP-VIEW: Viewing previously viewed snap %s", new Object[] {
                    hb
                });
                Timber.c("StoryPlaybackController", (new StringBuilder("SNAP-VIEW: Session active? ")).append(hd.g()).toString(), new Object[0]);
                if (hb instanceof AT)
                {
                    Timber.c("StoryPlaybackController", "SNAP-VIEW: Session already has snap %s is being viewed / is viewed? %s / %s", new Object[] {
                        hb, Boolean.valueOf(((AT)hb).B()), Boolean.valueOf(((AT)hb).D())
                    });
                }
            }
            n.j();
            n = null;
            A.a = n;
            p.a = n;
        }
        Kj kj;
        if (D != null)
        {
            if (D.a() == hb)
            {
                Timber.c("StoryPlaybackController", (new StringBuilder("SNAP-VIEW: Session preloaded for snap ")).append(D.a()).toString(), new Object[0]);
                n = D;
                A.a = n;
                p.a = n;
                D = null;
            } else
            {
                Timber.c("StoryPlaybackController", (new StringBuilder("SNAP-VIEW: Session preloaded for different snap ")).append(D.a()).toString(), new Object[0]);
                D.j();
                D = null;
            }
        }
        kj = sr.a;
        if (kj.mKey != null)
        {
            String s1 = y.a(hb);
            v.a.a(s1, kj.mKey);
        }
        if (n == null)
        {
            Timber.c("StoryPlaybackController", "SNAP-VIEW: There was no session preloaded", new Object[0]);
            n = a(hb, ((AO) (sz)), sr, st);
            A.a = n;
            p.a = n;
            n.h();
        }
        if (n != null)
        {
            n.i();
            return;
        } else
        {
            Timber.d("StoryPlaybackController", "SNAP-VIEW: Skipping start of %s; it likely failed during the prepare call.", new Object[] {
                hb
            });
            return;
        }
    }

    static boolean a(EO eo, boolean flag)
    {
        eo.k = flag;
        return flag;
    }

    private void b(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason endreason)
    {
        q.a(endreason);
    }

    static boolean b(EO eo)
    {
        return eo.C;
    }

    public static boolean b(Hb hb)
    {
        return hb != null && !hb.Z() && (hb instanceof Bk) && FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.STORY_EXPLORER) && ((Bk)hb).mIsShared;
    }

    static boolean c(EO eo)
    {
        eo.C = false;
        return false;
    }

    static Hd d(EO eo)
    {
        return eo.n;
    }

    protected final Hd a(Hb hb, AO ao, sR sr, sT st)
    {
        boolean flag1 = ao.h();
        boolean flag = ao.r_();
        Object obj;
        ViewGroup viewgroup;
        com.snapchat.android.rendering.SnapMediaRenderer snapmediarenderer;
        He he;
        SponsoredSlugView sponsoredslugview;
        List list;
        if (flag1 && !flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag1)
        {
            obj = l;
        } else
        {
            obj = m;
        }
        viewgroup = t;
        snapmediarenderer = f.a(hb.ak());
        he = F;
        sponsoredslugview = x;
        list = Hk.a(hb, ao.r_(), ao.g());
        list.add(he);
        if ((hb instanceof Bh) && hb.Z() && sr.d)
        {
            return new Hg((Bh)hb, ao, list);
        } else
        {
            return new GX(hb, sr, st, ao, viewgroup, ((com.snapchat.android.ui.AbstractSnapTimerView) (obj)), flag, snapmediarenderer, list, sponsoredslugview, Bg.a());
        }
    }

    public final void a()
    {
        s.b();
        f.a();
        if (n != null)
        {
            n.k();
            A.a = null;
            p.a = null;
        }
        if (D != null)
        {
            D.j();
            D = null;
        }
    }

    public void a(Hb hb, Ey.a a1)
    {
        h.a(null);
    }

    protected void a(Hb hb, Hb hb1, sZ sz)
    {
        q.a(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.KICKED_OUT);
    }

    public void a(Hb hb, sZ sz, int i1)
    {
        if (b(hb))
        {
            String s1 = sz.u_().mSharedId;
            int j1 = sz.u_().c();
            int k1 = sz.k();
            i.a((Bk)hb, s1, j1 - k1 - 1, i1);
        }
        a(hb, sz, i1, d.a(hb, sz));
    }

    protected final void a(Hb hb, sZ sz, int i1, sT st)
    {
        j = i1;
        v.a(hb.ad());
        s.a(true);
        boolean flag = sz.r_();
        if (i1 == 0)
        {
            w.a(flag);
        }
        sz.a();
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((sJ)iterator.next()).a(hb, sz)) { }
        a(hb, sz, sS.a(hb), st);
    }

    public final void a(Hd hd, SnapViewSessionStopReason snapviewsessionstopreason)
    {
        static final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[SnapViewSessionStopReason.values().length];
                try
                {
                    a[SnapViewSessionStopReason.ERROR_UNABLE_TO_SHOW_MEDIA.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[SnapViewSessionStopReason.ERROR_STARTING_MEDIA_UNAVAILABLE_FROM_SERVER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[SnapViewSessionStopReason.ERROR_STARTING_MEDIA_UNAVAILABLE_LOCALLY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[SnapViewSessionStopReason.SKIP_REQUESTED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[SnapViewSessionStopReason.TIMER_EXPIRED.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[SnapViewSessionStopReason.UNFILLED_AD_PLACEHOLDER.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[SnapViewSessionStopReason.ABORT_REQUESTED.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[SnapViewSessionStopReason.TEMPORARY_ABORT_REQUEST.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.a[snapviewsessionstopreason.ordinal()];
        JVM INSTR tableswitch 1 6: default 48
    //                   1 62
    //                   2 62
    //                   3 69
    //                   4 76
    //                   5 83
    //                   6 83;
           goto _L1 _L2 _L2 _L3 _L4 _L5 _L5
_L1:
        Object obj = com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.SWIPED_DOWN;
_L7:
        if (hd == null)
        {
            b(((com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason) (obj)));
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        obj = com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.ERROR;
        continue; /* Loop/switch isn't completed */
_L3:
        obj = com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.KICKED_OUT;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.TAP_PAST_END;
        continue; /* Loop/switch isn't completed */
_L5:
        obj = com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.FINISHED_VIEWING;
        if (true) goto _L7; else goto _L6
_L6:
        AO ao = hd.b();
        ao.a(b.d(), hd.a());
        if (ao.d())
        {
            hd = r;
            boolean flag;
            if (snapviewsessionstopreason == SnapViewSessionStopReason.SKIP_REQUESTED)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hd.a(flag);
            hd = n;
            snapviewsessionstopreason = (sZ)hd.b();
            obj = snapviewsessionstopreason.f();
            if (obj == null)
            {
                Timber.c("StoryPlaybackController", "SNAP-VIEW: Kicked out after %s, nextSnap is null", new Object[] {
                    hd.a()
                });
                b(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.KICKED_OUT);
                return;
            }
            if (b(((Hb) (obj))))
            {
                String s1 = snapviewsessionstopreason.u_().mSharedId;
                int i1 = snapviewsessionstopreason.u_().c() - snapviewsessionstopreason.k() - 1;
                i.a((Bk)obj, s1, i1, j);
                if (j > 0)
                {
                    i.b((Bk)obj, s1, i1, j);
                }
            }
            if (((Hb) (obj)).O() || ((Hb) (obj)).P())
            {
                b(hd.a(), ((Hb) (obj)), snapviewsessionstopreason);
                return;
            }
            if (obj instanceof AT)
            {
                Timber.c("StoryPlaybackController", "SNAP-VIEW: Kicked out after %s, nextSnap is %s", new Object[] {
                    hd.a(), ((AT)obj).ab()
                });
            }
            if (!((Hb) (obj)).U())
            {
                b.a((Bk)obj, StoryLoadingContext.LOAD_FROM_VIEWING);
            }
            Timber.c("StoryPlaybackController", "next snap is not loaded, %s", new Object[] {
                ((Hb) (obj)).d()
            });
            a(hd.a(), ((Hb) (obj)), ((sZ) (snapviewsessionstopreason)));
            return;
        } else
        {
            Timber.c("StoryPlaybackController", "Level %d reached the end, hide this level.", new Object[] {
                Integer.valueOf(j)
            });
            b(((com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason) (obj)));
            return;
        }
    }

    public final void a(Bitmap bitmap)
    {
        o = bitmap;
    }

    public final void a(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason endreason)
    {
        if (!c())
        {
            for (endreason = g.iterator(); endreason.hasNext(); ((sJ)endreason.next()).a(null)) { }
        } else
        {
            AO ao;
            Object obj;
            SnapViewEventAnalytics snapvieweventanalytics;
            boolean flag1;
            if (n != null)
            {
                obj = n.a();
            } else
            {
                obj = null;
            }
            if (n != null)
            {
                ao = n.b();
            } else
            {
                ao = null;
            }
            if (obj != null)
            {
                i.a(((Hb) (obj)).d(), StoryLoadingStatus.ABANDONED);
            }
            Timber.c("StoryPlaybackController", "SNAP-VIEW: Hide snap %s with snap provider %s and reason %s", new Object[] {
                obj, ao, endreason
            });
            snapvieweventanalytics = r;
            if (obj != null && ((Hb) (obj)).ak())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            snapvieweventanalytics.a(flag1, endreason);
            obj = u;
            if (endreason == com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.KICKED_OUT)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ((lm) (obj)).a(flag1);
            s.b();
            f.a();
            if (n != null)
            {
                n.j();
                for (obj = g.iterator(); ((Iterator) (obj)).hasNext(); ((sJ)((Iterator) (obj)).next()).a(n.b())) { }
                n = null;
                A.a = n;
                p.a = n;
            }
            if (D != null)
            {
                D.j();
                D = null;
            }
            boolean flag;
            if (ao != null)
            {
                Ew ew;
                EasyMetric easymetric;
                boolean flag2;
                if (ao.e() != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj = ao.g();
            } else
            {
                flag = false;
                obj = null;
            }
            if (j == 0)
            {
                ew = w;
                if (!flag)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                if (ew.d != null && ew.d.f != 0.0D)
                {
                    ew.d.g = endreason.getExitEvent();
                    ew.d.a = flag2;
                    easymetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("VIEW_STORIES_END", 1.0D);
                    easymetric.a("view_location", ew.d.e);
                    easymetric.a("time_viewed", Double.valueOf(ew.d.f));
                    easymetric.a("full_view", Boolean.valueOf(ew.d.a));
                    easymetric.a("exit_event", endreason.getEventName());
                    easymetric.a("reachability", ew.c.f());
                    easymetric.a("bw_est", Long.valueOf(ew.f.b()));
                    easymetric.b(false);
                    endreason = new kg();
                    endreason.exitEvent = ew.d.g;
                    endreason.viewLocation = ew.d.e;
                    endreason.numSnapsViewed = ew.d.b;
                    endreason.explorerSnapCount = ew.d.c;
                    endreason.explorerSwipeCount = Long.valueOf(ew.d.d.size());
                    endreason.fullView = Boolean.valueOf(ew.d.a);
                    endreason.timeViewed = Double.valueOf(Ew.a(ew.d.f));
                    endreason.storyType = ew.d.h;
                    endreason.posterId = ew.d.i;
                    if (ew.d.k != -1L)
                    {
                        endreason.viewLocationPos = Long.valueOf(ew.d.k);
                    }
                    if (ew.d.j)
                    {
                        endreason.geoFence = "LOCAL";
                    }
                    if (obj != null)
                    {
                        endreason.source = ((MediaOpenOrigin) (obj)).getSourceType();
                        Timber.c("StoryUsageAnalytics", "LOG story story view: source: %s", new Object[] {
                            ((MediaOpenOrigin) (obj)).getSourceType().name()
                        });
                    }
                    ew.a.a(endreason);
                    ew.d = null;
                }
            }
            if (ao != null)
            {
                ao.b();
            }
            r.b();
        }
    }

    public final void a(SnapViewSessionStopReason snapviewsessionstopreason)
    {
        a(n, snapviewsessionstopreason);
    }

    public final void a(sJ sj)
    {
        g.add(sj);
    }

    public final void a(boolean flag)
    {
        if (n != null)
        {
            n.b(flag);
        }
    }

    public final void b(Hb hb, Hb hb1, sZ sz)
    {
        if (hb1 instanceof AT)
        {
            Timber.c("StoryPlaybackController", "SNAP-VIEW: Moving from %s to nextSnap  %s", new Object[] {
                hb, ((AT)hb1).ab()
            });
        }
        if (hb != null && (hb instanceof AT) && (hb1 instanceof AT))
        {
            hb = (AT)hb;
            AT at = (AT)hb1;
            if (((AT) (hb)).mStackId == null)
            {
                hb.mStackId = UUID.randomUUID().toString();
            }
            at.mStackId = ((AT) (hb)).mStackId;
        }
        a(hb1, sz, sS.a(hb1), d.a(hb1, sz));
    }

    public final void b(boolean flag)
    {
        if (n != null && n.d())
        {
            n.a(flag);
            return;
        } else
        {
            C = flag;
            return;
        }
    }

    public final void c(boolean flag)
    {
        if (n == null)
        {
            return;
        } else
        {
            n.a(flag);
            return;
        }
    }

    public final boolean c()
    {
        return n != null;
    }

    public final boolean e()
    {
        Hd hd;
        if (FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.STORY_EXPLORER))
        {
            if ((hd = n) != null && z.g(hd.a().d()) && !hd.a().Z())
            {
                return true;
            }
        }
        return false;
    }

    public final void f()
    {
        if (n != null && s.a() && k)
        {
            n.l();
        }
    }

    public final sZ g()
    {
        if (n == null)
        {
            return null;
        } else
        {
            return (sZ)n.b();
        }
    }

    public final Bk h()
    {
        if (n == null)
        {
            return null;
        } else
        {
            return (Bk)n.a();
        }
    }

    static 
    {
        a = Ic.SUPPORTS_MEDIA_INFO_VIDEO_RENDERING_START;
    }
}
