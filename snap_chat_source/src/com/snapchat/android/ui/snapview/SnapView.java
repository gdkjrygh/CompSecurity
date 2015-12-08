// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.snapview;

import AO;
import AT;
import CG;
import Cf;
import Cg;
import Ch;
import Co;
import Ds;
import Dx;
import Ei;
import GX;
import Ha;
import Hb;
import Hd;
import He;
import Hf;
import Hk;
import Ic;
import JY;
import Jo;
import Jr;
import Ka;
import Kj;
import Mf;
import NY;
import OA;
import Og;
import PG;
import PI;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.SnapViewEventAnalytics;
import com.snapchat.android.database.table.NotificationTable;
import com.snapchat.android.ui.SnapTimerView;
import com.snapchat.android.ui.StoryTimerView;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.squareup.otto.Bus;
import eB;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import lm;
import mt;
import sJ;
import sR;
import sS;
import sT;
import sU;
import tj;

// Referenced classes of package com.snapchat.android.ui.snapview:
//            SnapViewSessionStopReason, MultiLeveledSnapView

public class SnapView extends RelativeLayout
{
    /* member class not found */
    class a {}


    protected static final boolean a;
    private He A = new He() {

        private SnapView a;

        public final void a(Hd hd)
        {
            boolean flag;
            flag = true;
            Timber.c("SnapView", "SNAP-VIEW: session started for %s", new Object[] {
                hd.a()
            });
            SnapView.b(a).a(hd.c());
            SnapView.a(a, true);
            if (!SnapView.a) goto _L2; else goto _L1
_L1:
            Hb hb;
            AO ao;
            ao = hd.b();
            if (ao == null)
            {
                hb = null;
            } else
            {
                hb = ao.e();
            }
            if (hb == null) goto _L4; else goto _L3
_L3:
            if (!Ic.IS_GALAXY_S6 || !hb.ak())
            {
                flag = false;
            }
            if (!flag) goto _L6; else goto _L5
_L5:
            Timber.c("SnapView", "SNAP-VIEW: Skipping preload on S6", new Object[0]);
_L7:
            return;
_L6:
            Timber.c("SnapView", (new StringBuilder("SNAP-VIEW: Preloading next snap: ")).append(hb).toString(), new Object[0]);
            SnapView snapview = a;
            SnapView snapview1 = a;
            sS ss1 = a.g;
            SnapView.a(snapview, snapview1.a(hb, ao, sS.a(hb), a.h.a(hb, ao)));
            SnapView.c(a).h();
_L2:
            Iterator iterator = SnapView.d(a).iterator();
            while (iterator.hasNext()) 
            {
                ((sJ)iterator.next()).a(hd.a());
            }
            if (true) goto _L7; else goto _L4
_L4:
            Timber.c("SnapView", "SNAP-VIEW: No snap to pre-load", new Object[0]);
              goto _L2
        }

        public final void a(Hd hd, SnapViewSessionStopReason snapviewsessionstopreason)
        {
            if (a.i != hd) goto _L2; else goto _L1
_L1:
            Timber.c("SnapView", "SNAP-VIEW: primary session stopped for %s, reason %s", new Object[] {
                hd.a(), snapviewsessionstopreason
            });
            SnapView.a(a, false);
            if (snapviewsessionstopreason != SnapViewSessionStopReason.ERROR_STARTING_MEDIA_UNAVAILABLE_LOCALLY) goto _L4; else goto _L3
_L3:
            SnapView.a(hd.a());
            a.b.a(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.KICKED_OUT);
_L6:
            for (Iterator iterator = SnapView.d(a).iterator(); iterator.hasNext(); ((sJ)iterator.next()).a(hd.a(), snapviewsessionstopreason, 0)) { }
            break; /* Loop/switch isn't completed */
_L4:
            if (snapviewsessionstopreason == SnapViewSessionStopReason.ERROR_UNABLE_TO_SHOW_MEDIA)
            {
                if (ReleaseManager.f())
                {
                    SnapView.e(a).a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, "ALPHA-ONLY: Snap skipped, media player error"));
                }
                a.a(hd, snapviewsessionstopreason);
            } else
            if (snapviewsessionstopreason != SnapViewSessionStopReason.ABORT_REQUESTED && snapviewsessionstopreason != SnapViewSessionStopReason.TEMPORARY_ABORT_REQUEST)
            {
                a.a(hd, snapviewsessionstopreason);
            }
            if (true) goto _L6; else goto _L5
_L2:
            if (SnapView.c(a) == hd)
            {
                Timber.c("SnapView", "SNAP-VIEW: next session stopped for %s, reason %s", new Object[] {
                    hd.a(), snapviewsessionstopreason
                });
                if (snapviewsessionstopreason == SnapViewSessionStopReason.ERROR_STARTING_MEDIA_UNAVAILABLE_LOCALLY)
                {
                    SnapView.a(hd.a());
                }
                SnapView.c(a).j();
                SnapView.a(a, null);
            }
_L5:
        }

            
            {
                a = SnapView.this;
                super();
            }
    };
    private final He B;
    protected final MultiLeveledSnapView b;
    final Bus c;
    final ViewGroup d;
    final Ch e;
    final Set f;
    protected final sS g;
    protected final sU h;
    protected Hd i;
    Cf j;
    PI k;
    private SnapViewEventAnalytics l;
    private final Ha m;
    private StoryTimerView n;
    private SnapTimerView o;
    private final Ei p;
    private final Ds q;
    private final lm r;
    private final Jo s;
    private final int t;
    private final Cg u;
    private boolean v;
    private Hd w;
    private float x;
    private float y;
    private boolean z;

    public SnapView(Context context, MultiLeveledSnapView multileveledsnapview)
    {
        Bus bus = Mf.a();
        Ha ha = new Ha(context);
        SnapViewEventAnalytics snapvieweventanalytics = SnapViewEventAnalytics.a();
        lm lm1 = lm.a();
        Ei ei = Ei.a();
        Ds ds = new Ds(new Dx(context));
        new a();
        Ch ch = Ch.a();
        Jo jo = new Jo(context);
        Set set = b();
        sS ss = new sS();
        sU su = new sU();
        Cg cg = Cg.a();
        PreferenceManager.getDefaultSharedPreferences(context);
        this(context, multileveledsnapview, bus, ha, snapvieweventanalytics, lm1, ei, ds, ch, jo, set, ss, su, cg);
    }

    protected SnapView(Context context, MultiLeveledSnapView multileveledsnapview, Bus bus, Ha ha, SnapViewEventAnalytics snapvieweventanalytics, lm lm1, Ei ei, 
            Ds ds, Ch ch, Jo jo, Set set, sS ss, sU su, Cg cg)
    {
        super(context, null);
        v = false;
        j = null;
        x = -1F;
        y = -1F;
        z = false;
        B = new Hf(new Handler(Looper.getMainLooper()), A);
        b = multileveledsnapview;
        c = bus;
        m = ha;
        l = snapvieweventanalytics;
        p = ei;
        q = ds;
        e = ch;
        f = set;
        g = ss;
        h = su;
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f04010f, this, true);
        d = (ViewGroup)findViewById(0x7f0d0559);
        k = new PI(this, 0x7f0d055a, 0x7f0d04aa);
        q.a(d);
        r = lm1;
        s = jo;
        u = cg;
        t = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    static Hd a(SnapView snapview, Hd hd)
    {
        snapview.w = hd;
        return hd;
    }

    static PI a(SnapView snapview)
    {
        return snapview.k;
    }

    static void a(Hb hb)
    {
        if (hb instanceof AT)
        {
            hb = (AT)hb;
            hb.l();
            if (hb.ak())
            {
                Ka.SNAP_RECEIVED_VIDEO_CACHE.e(hb.i());
            } else
            {
                Ka.SNAP_RECEIVED_IMAGE_CACHE.e(hb.i());
            }
            (new mt(hb)).a();
        } else
        if (ReleaseManager.e())
        {
            throw new NullPointerException();
        }
    }

    private void a(MotionEvent motionevent)
    {
        boolean flag1 = true;
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 33
    //                   1 32
    //                   2 39;
           goto _L1 _L2 _L1 _L3
_L1:
        return;
_L2:
        z = true;
        return;
_L3:
        float f1;
        float f2;
        boolean flag;
        if (!z)
        {
            continue; /* Loop/switch isn't completed */
        }
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        if (x != -1F && y != -1F)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = false;
_L5:
        if (flag)
        {
            z = false;
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        flag = flag1;
        if (Math.abs(x - f1) <= (float)t)
        {
            flag = flag1;
            if (Math.abs(y - f2) <= (float)t)
            {
                flag = false;
            }
        }
          goto _L5
        if (true) goto _L1; else goto _L6
_L6:
    }

    static boolean a(SnapView snapview, boolean flag)
    {
        snapview.v = flag;
        return flag;
    }

    static Ds b(SnapView snapview)
    {
        return snapview.q;
    }

    private static String b(Hb hb)
    {
        if (hb instanceof AT)
        {
            return ((AT)hb).j();
        } else
        {
            return "PLACEHOLDER_CONTENT_PROVIDER";
        }
    }

    protected static Set b()
    {
        return eB.a(new sJ[] {
            new tj(), CG.a()
        });
    }

    private void b(Hb hb, AO ao, sR sr, sT st)
    {
        PG.a();
        Timber.c("SnapView", "SNAP-VIEW: Show snap %s", new Object[] {
            hb
        });
        if (i != null)
        {
            if (i.a() == hb)
            {
                Hd hd = i;
                Timber.e("SnapView", "SNAP-VIEW: Viewing previously viewed snap %s", new Object[] {
                    hb
                });
                Timber.c("SnapView", (new StringBuilder("SNAP-VIEW: Session active? ")).append(hd.g()).toString(), new Object[0]);
                if (hb instanceof AT)
                {
                    Timber.c("SnapView", "SNAP-VIEW: Session already has snap %s is being viewed / is viewed? %s / %s", new Object[] {
                        hb, Boolean.valueOf(((AT)hb).B()), Boolean.valueOf(((AT)hb).D())
                    });
                }
            }
            i.j();
            i = null;
        }
        Kj kj;
        if (w != null)
        {
            if (w.a() == hb)
            {
                Timber.c("SnapView", (new StringBuilder("SNAP-VIEW: Session preloaded for snap ")).append(w.a()).toString(), new Object[0]);
                i = w;
                w = null;
            } else
            {
                Timber.c("SnapView", (new StringBuilder("SNAP-VIEW: Session preloaded for different snap ")).append(w.a()).toString(), new Object[0]);
                w.j();
                w = null;
            }
        }
        kj = sr.a;
        if (kj.mKey != null)
        {
            String s1 = u.a(hb);
            e.a.a(s1, kj.mKey);
        }
        if (i == null)
        {
            Timber.c("SnapView", "SNAP-VIEW: There was no session preloaded", new Object[0]);
            i = a(hb, ao, sr, st);
            i.h();
        }
        if (i != null)
        {
            i.i();
            return;
        } else
        {
            Timber.d("SnapView", "SNAP-VIEW: Skipping start of %s, it likely failed during the prepare call.", new Object[] {
                hb
            });
            return;
        }
    }

    static Hd c(SnapView snapview)
    {
        return snapview.w;
    }

    static Set d(SnapView snapview)
    {
        return snapview.f;
    }

    static Bus e(SnapView snapview)
    {
        return snapview.c;
    }

    protected final Hd a(Hb hb, AO ao, sR sr, sT st)
    {
        boolean flag1 = ao.h();
        boolean flag = ao.r_();
        Object obj;
        ViewGroup viewgroup;
        com.snapchat.android.rendering.SnapMediaRenderer snapmediarenderer;
        He he;
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
            obj = n;
        } else
        {
            obj = o;
        }
        viewgroup = d;
        snapmediarenderer = q.a(hb.ak());
        he = B;
        list = Hk.a(hb, ao.r_(), ao.g());
        list.add(he);
        return new GX(hb, sr, st, ao, viewgroup, ((com.snapchat.android.ui.AbstractSnapTimerView) (obj)), flag, snapmediarenderer, list, null, null);
    }

    public final void a(Hb hb, AO ao)
    {
        sT st = h.a(hb, ao);
        if (j == null)
        {
            j = e.b();
            e.a(j.a(b(hb)));
        }
        if (k.b())
        {
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(k.a(), View.ALPHA, new float[] {
                1.0F, 0.0F
            });
            objectanimator.setDuration(800L);
            objectanimator.addListener(new Jr() {

                private SnapView a;

                public final void onAnimationEnd(Animator animator)
                {
                    SnapView.a(a).a(8);
                }

            
            {
                a = SnapView.this;
                super();
            }
            });
            objectanimator.start();
        }
        m.a(false);
        ao.a();
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((sJ)iterator.next()).a(hb, ao)) { }
        b(hb, ao, sS.a(hb), st);
        s.a(this, false);
        Jo.a(getContext(), this);
        NotificationTable.c(SnapchatApplication.get(), com.snapchat.android.notification.AndroidNotificationManager.Type.SNAP.name(), b(hb));
    }

    protected final void a(Hd hd, SnapViewSessionStopReason snapviewsessionstopreason)
    {
        static final class _cls3
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

        _cls3.a[snapviewsessionstopreason.ordinal()];
        JVM INSTR tableswitch 1 6: default 48
    //                   1 65
    //                   2 65
    //                   3 72
    //                   4 79
    //                   5 86
    //                   6 86;
           goto _L1 _L2 _L2 _L3 _L4 _L5 _L5
_L1:
        Object obj = com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.SWIPED_DOWN;
_L7:
        if (hd == null)
        {
            b.a(((com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason) (obj)));
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
        if (!hd.b().d()) goto _L9; else goto _L8
_L8:
        hd = l;
        boolean flag;
        if (snapviewsessionstopreason == SnapViewSessionStopReason.SKIP_REQUESTED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hd.a(flag);
        obj = i;
        hd = ((Hd) (obj)).b();
        snapviewsessionstopreason = hd.f();
        if (snapviewsessionstopreason != null) goto _L11; else goto _L10
_L10:
        Timber.c("SnapView", "SNAP-VIEW: Kicked out after %s, nextSnap is null", new Object[] {
            ((Hd) (obj)).a()
        });
_L12:
        b.a(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.KICKED_OUT);
        return;
_L11:
        if (snapviewsessionstopreason.O() || snapviewsessionstopreason.P())
        {
            if (snapviewsessionstopreason instanceof AT)
            {
                Timber.c("SnapView", "SNAP-VIEW: Moving from %s to nextSnap  %s", new Object[] {
                    ((Hd) (obj)).a(), ((AT)snapviewsessionstopreason).ab()
                });
            }
            obj = ((Hd) (obj)).a();
            if (obj != null && (obj instanceof AT) && (snapviewsessionstopreason instanceof AT))
            {
                obj = (AT)obj;
                AT at = (AT)snapviewsessionstopreason;
                if (((AT) (obj)).mStackId == null)
                {
                    obj.mStackId = UUID.randomUUID().toString();
                }
                at.mStackId = ((AT) (obj)).mStackId;
            }
            b(snapviewsessionstopreason, hd, sS.a(snapviewsessionstopreason), h.a(snapviewsessionstopreason, hd));
            return;
        }
        if (snapviewsessionstopreason instanceof AT)
        {
            Timber.c("SnapView", "SNAP-VIEW: Kicked out after %s, nextSnap is %s", new Object[] {
                ((Hd) (obj)).a(), ((AT)snapviewsessionstopreason).ab()
            });
        }
        if (!snapviewsessionstopreason.U())
        {
            (new mt((AT)snapviewsessionstopreason)).a();
        }
        if (true) goto _L12; else goto _L9
_L9:
        b.a(((com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason) (obj)));
        return;
    }

    final void a(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason endreason)
    {
        Object obj;
        AO ao;
        SnapViewEventAnalytics snapvieweventanalytics;
        boolean flag;
        if (i != null)
        {
            obj = i.a();
        } else
        {
            obj = null;
        }
        if (i != null)
        {
            ao = i.b();
        } else
        {
            ao = null;
        }
        Timber.c("SnapView", "SNAP-VIEW: Hide snap %s with snap provider %s and reason %s", new Object[] {
            obj, ao, endreason
        });
        snapvieweventanalytics = l;
        if (obj != null)
        {
            flag = ((Hb) (obj)).ak();
        } else
        {
            flag = false;
        }
        snapvieweventanalytics.a(flag, endreason);
        obj = r;
        if (endreason == com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.KICKED_OUT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((lm) (obj)).a(flag);
        m.b();
        q.a();
        if (i != null)
        {
            i.j();
            for (endreason = f.iterator(); endreason.hasNext(); ((sJ)endreason.next()).a(i.b())) { }
            i = null;
            s.a(this, true);
            p.a(SnapchatApplication.get());
            c.a(new NY(false));
            c.a(new Og(true));
        }
        if (w != null)
        {
            w.j();
            w = null;
        }
        if (ao != null)
        {
            ao.b();
        }
        l.b();
    }

    public final boolean a()
    {
        return i != null;
    }

    public final boolean c()
    {
        if (isShown())
        {
            b.a(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.BACK_PRESSED);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag1 = super.dispatchTouchEvent(motionevent);
        boolean flag = flag1;
        if (!flag1)
        {
            flag = flag1;
            if (motionevent.getActionMasked() == 1)
            {
                flag = onTouchEvent(motionevent);
            }
        }
        return flag;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        a(motionevent);
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = flag1;
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 1: default 32
    //                   0 34
    //                   1 41;
           goto _L1 _L2 _L3
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        flag = false;
_L5:
        a(motionevent);
        return flag;
_L3:
        if (!z)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (v)
        {
            if (i != null && m.a() && v)
            {
                i.l();
            }
            if (a())
            {
                c.a(new OA());
            }
        }
        if (k.c())
        {
            MotionEvent motionevent1 = MotionEvent.obtain(0L, 0L, 1, 0.0F, 0.0F, 0);
            ((RelativeLayout)k.a()).dispatchTouchEvent(motionevent1);
        }
        z = false;
        flag = flag1;
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void setTimerViews(StoryTimerView storytimerview, SnapTimerView snaptimerview)
    {
        n = storytimerview;
        o = snaptimerview;
    }

    static 
    {
        a = Ic.SUPPORTS_MEDIA_INFO_VIDEO_RENDERING_START;
    }
}
