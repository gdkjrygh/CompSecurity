// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;

import Bm;
import Bt;
import Cl;
import DR;
import IC;
import Jk;
import Jr;
import KL;
import Lz;
import NV;
import Na;
import Og;
import PB;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.database.OnboardingTooltip;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.discover.analytics.DiscoverUsageAnalytics;
import com.snapchat.android.discover.analytics.EditionPerformanceAnalytics;
import com.snapchat.android.discover.model.ChannelPage;
import com.snapchat.android.discover.model.DSnapPage;
import com.snapchat.android.discover.model.DSnapPanel;
import com.snapchat.android.discover.model.MediaState;
import com.snapchat.android.discover.ui.media.DiscoverEditionPageView;
import com.snapchat.android.ui.VerticalSwipeLayout;
import com.snapchat.android.util.eventbus.SnapCaptureContext;
import com.squareup.otto.Bus;
import fU;
import gF;
import gI;
import gL;
import gP;
import gQ;
import gY;
import hb;
import he;
import hj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kG;
import kT;
import uL;
import uN;
import uP;
import uy;
import uz;
import vA;
import vV;
import vW;
import vX;
import vY;
import vZ;
import vv;
import wG;
import wH;
import wK;
import wa;
import wb;
import wc;
import wd;
import wf;
import wg;
import wh;
import wi;
import wj;
import wk;
import wq;
import wy;

public class DSnapView extends DiscoverEditionPageView
    implements com.snapchat.android.ui.VerticalSwipeLayout.a, wy
{
    final class a
        implements Runnable
    {

        float a;
        float b;
        private DSnapView c;
        private DSnapView d;

        public final void run()
        {
            if (DSnapView.b(d) != null && DSnapView.c(d))
            {
                DSnapView.d(d).a(new wK(c, a, b));
            }
            DSnapView.e(d);
        }

        public a(DSnapView dsnapview1)
        {
            d = DSnapView.this;
            super();
            c = dsnapview1;
        }
    }


    private final a A;
    private final int B;
    private float C;
    private float D;
    private float E;
    private float F;
    private long G;
    private uN H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private MediaState M;
    private DSnapPage N;
    private int O;
    private wi.a P = new wi.a() {

        private DSnapView a;

        public final void a()
        {
            DSnapView.a(a).b();
        }

            
            {
                a = DSnapView.this;
                super();
            }
    };
    public final wi a;
    public final kT b;
    public VerticalSwipeLayout c;
    LinearLayout d;
    public wq e;
    wk f;
    public uz g;
    public DSnapPage h;
    public ChannelPage i;
    boolean j;
    boolean k;
    public int l;
    public long m;
    public int n;
    public long o;
    private final Map w;
    private final wG x;
    private final uP y;
    private final Handler z;

    public DSnapView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, new wf(), new wi(context), Bt.a(), new Handler(), ViewConfiguration.get(context).getScaledTouchSlop(), new DiscoverUsageAnalytics(), new wH(), new wq(), new IC(), new wG(), new uP(), kT.a());
    }

    DSnapView(Context context, AttributeSet attributeset, uL ul, uy uy1, DiscoverUsageAnalytics discoverusageanalytics, vA va, PB pb, 
            Bus bus, wf wf1, wi wi1, Bt bt, Handler handler, int i1, wH wh1, 
            wq wq1, IC ic, Lz lz, wG wg1, uP up, kT kt)
    {
        super(context, attributeset, ul, uy1, discoverusageanalytics, va, lz, pb, bus, wg1);
        j = false;
        k = false;
        I = false;
        K = false;
        l = -1;
        M = MediaState.NOT_STARTED;
        m = 0L;
        O = -1;
        n = 0;
        o = 0L;
        w = new HashMap();
        a = wi1;
        z = handler;
        A = new a(this);
        B = i1;
        e = wq1;
        x = wg1;
        y = up;
        b = kt;
    }

    private DSnapView(Context context, AttributeSet attributeset, wf wf1, wi wi1, Bt bt, Handler handler, int i1, 
            DiscoverUsageAnalytics discoverusageanalytics, wH wh1, wq wq1, IC ic, wG wg1, uP up, kT kt)
    {
        super(context, attributeset);
        j = false;
        k = false;
        I = false;
        K = false;
        l = -1;
        M = MediaState.NOT_STARTED;
        m = 0L;
        O = -1;
        n = 0;
        o = 0L;
        w = new HashMap();
        a = wi1;
        z = handler;
        A = new a(this);
        B = i1;
        e = wq1;
        x = wg1;
        y = up;
        b = kt;
    }

    static uL a(DSnapView dsnapview)
    {
        return dsnapview.q;
    }

    private void a(DSnapPage dsnappage, DSnapPanel dsnappanel, com.snapchat.android.discover.model.DSnapPage.Form form)
    {
_L2:
        return;
        if (dsnappanel == null || M != MediaState.SUCCESS) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        LinkedList linkedlist;
        obj = b(form.getIndex());
        obj1 = obj;
        if (obj != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = getContext();
        linkedlist = new LinkedList();
        obj = dsnappanel.g;
        wf._cls1.a[((com.snapchat.android.discover.model.DSnapPanel.MediaType) (obj)).ordinal()];
        JVM INSTR tableswitch 1 4: default 96
    //                   1 263
    //                   2 277
    //                   3 300
    //                   4 314;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        obj = null;
_L9:
        linkedlist.add(obj);
        if (linkedlist.size() == 0)
        {
            Timber.e("DSnapItemViewAdapterFactory", "Failed to create the main adapter for %s, %s", new Object[] {
                dsnappage, dsnappanel
            });
            obj = null;
        } else
        {
            if (!dsnappage.g() && !TextUtils.isEmpty(dsnappanel.c) && dsnappanel.d.isScreenDocking())
            {
                linkedlist.add(new vZ(((Context) (obj1))));
            }
            if (dsnappanel == dsnappage.d() && dsnappage.f() > 1)
            {
                linkedlist.add(new vV(((Context) (obj1))));
            }
            if (dsnappanel == dsnappage.d() && dsnappage.g())
            {
                linkedlist.add(new wa(((Context) (obj1))));
            }
            if (linkedlist.size() > 1)
            {
                obj1 = new vW(((Context) (obj1)), linkedlist);
            } else
            {
label0:
                {
                    if (linkedlist.size() != 1)
                    {
                        break label0;
                    }
                    obj1 = (wd)linkedlist.get(0);
                }
            }
            obj = obj1;
            if (!((wd) (obj1)).a(this, dsnappage, dsnappanel))
            {
                Timber.e("DSnapItemViewAdapterFactory", "Failed to prepare %s for %s, %s", new Object[] {
                    obj1, dsnappage, dsnappanel
                });
                obj = null;
            }
        }
_L10:
        obj1 = obj;
        if (obj != null)
        {
            ((wd) (obj)).a(this);
            w.put(Integer.valueOf(form.getIndex()), obj);
            if (c.getChildCount() > form.getIndex())
            {
                c.removeViewAt(form.getIndex());
            }
            obj1 = ((wd) (obj)).a();
            if (form.getIndex() == com.snapchat.android.discover.model.DSnapPage.Form.TOP_SNAP.getIndex())
            {
                ((View) (obj1)).setOnClickListener(new android.view.View.OnClickListener() {

                    private DSnapView a;

                    public final void onClick(View view)
                    {
                        if (DSnapView.f(a) < 400L && Math.abs(DSnapView.g(a) - DSnapView.h(a)) < (float)DSnapView.i(a) && Math.abs(DSnapView.j(a) - DSnapView.k(a)) < (float)DSnapView.i(a))
                        {
                            view = a;
                            if (((DSnapView) (view)).k && view.c())
                            {
                                ((DSnapView) (view)).v.a(false);
                            }
                        }
                    }

            
            {
                a = DSnapView.this;
                super();
            }
                });
            }
            c.addView(((View) (obj1)), form.getIndex());
            obj1 = obj;
        }
        if (obj1 == null) goto _L2; else goto _L8
_L8:
        ((wd) (obj1)).a(dsnappage, dsnappanel);
        return;
_L4:
        obj = new vX(((Context) (obj1)));
          goto _L9
_L5:
        obj = new wc(((Context) (obj1)), new wg(((Context) (obj1))));
          goto _L9
_L6:
        obj = new wb(((Context) (obj1)));
          goto _L9
_L7:
        obj = new vY(((Context) (obj1)));
          goto _L9
        Timber.e("DSnapItemViewAdapterFactory", "No adapters were created for %s, %s", new Object[] {
            dsnappage, dsnappanel
        });
        obj = null;
          goto _L10
    }

    static void a(DSnapView dsnapview, float f1, float f2, wd wd1, boolean flag, com.snapchat.android.discover.model.DSnapPanel.MediaType mediatype, long l1)
    {
        dsnapview.a(f1, f2, wd1, flag, mediatype, l1);
    }

    private static boolean a(List list, int i1)
    {
        if (i1 < list.size() - 1)
        {
            return ((DSnapPage)list.get(i1 + 1)).g();
        } else
        {
            return false;
        }
    }

    static DSnapPage b(DSnapView dsnapview)
    {
        return dsnapview.h;
    }

    static boolean c(DSnapView dsnapview)
    {
        return dsnapview.L;
    }

    static Bus d(DSnapView dsnapview)
    {
        return dsnapview.s;
    }

    private void d(int i1)
    {
        Timber.c("DSnapView", "Enter %s panel %d", new Object[] {
            h, Integer.valueOf(i1)
        });
        boolean flag;
        if (j && !Bt.bb())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (d == null)
            {
                d = (LinearLayout)((ViewStub)findViewById(0x7f0d0299)).inflate();
                TextView textview = (TextView)findViewById(0x7f0d0294);
                if (textview != null)
                {
                    if (x.a())
                    {
                        textview.setText(0x7f08010d);
                    } else
                    {
                        textview.setText(0x7f08010e);
                    }
                }
            }
            d.setVisibility(0);
            d.animate().alpha(1.0F).setDuration(300L);
            if (!Bt.bb())
            {
                Bt.a(OnboardingTooltip.DISCOVER_ONBOARDING);
            }
            SharedPreferenceKey.DISCOVER_SEEN_ONBOARDING.putBoolean(true);
        }
        if (!o())
        {
            if (M != MediaState.SUCCESS)
            {
                Timber.c("DSnapView", "Cannot enter %s panel %d yet, loading state is %s", new Object[] {
                    h, Integer.valueOf(i1), M.name()
                });
                return;
            }
            boolean flag1;
            if (com.snapchat.android.discover.model.DSnapPage.Form.LONGFORM.getIndex() == i1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                uz uz1 = g;
                DSnapPage dsnappage = h;
                uz1.b.add(dsnappage.a);
            } else
            {
                obj = g;
                DSnapPage dsnappage1 = h;
                ((uz) (obj)).a.add(dsnappage1.a);
            }
            this.s.a(new Og(false));
            if (!K)
            {
                Object obj = b(i1);
                if (obj != null)
                {
                    ((wd) (obj)).z_();
                    if (h.g())
                    {
                        obj = r;
                        Object obj1 = h.i;
                        String s = h.j;
                        i1 = h.g;
                        kR.a a1 = new kR.a();
                        a1.mChannelName = s;
                        a1.mEditionName = ((String) (obj1));
                        a1.mPosition = i1;
                        obj1 = a1.a();
                        ((DiscoverUsageAnalytics) (obj)).b.a(((kK) (obj1)));
                    }
                }
                m = SystemClock.elapsedRealtime();
                K = true;
                ChannelPage channelpage = i;
                DSnapPage dsnappage2 = h;
                if (flag1)
                {
                    obj = h.e();
                } else
                {
                    obj = h.d();
                }
                p();
                getResources();
                H = new uN(channelpage, dsnappage2, ((DSnapPanel) (obj)), g);
                return;
            }
        }
    }

    private void e(int i1)
    {
        wd wd1;
        Timber.c("DSnapView", "Leaving %s panel %d", new Object[] {
            h, Integer.valueOf(i1)
        });
        c.setScrollableInBothDirections(false);
        wd1 = b(i1);
        if (wd1 == null) goto _L2; else goto _L1
_L1:
        if (!K || m == 0L) goto _L4; else goto _L3
_L3:
        long l3 = SystemClock.elapsedRealtime() - m;
        if (!h.g()) goto _L6; else goto _L5
_L5:
        if (com.snapchat.android.discover.model.DSnapPage.Form.TOP_SNAP.getIndex() != i1) goto _L8; else goto _L7
_L7:
        DiscoverUsageAnalytics discoverusageanalytics = r;
        Object obj1 = wd1.a(l3);
        String s8 = h.d;
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info1 = b.b();
        String s12 = h.e;
        String s14 = h.f;
        String s15 = h.p;
        String s16 = h.h();
        Object obj = h.i;
        String s2 = h.j;
        int j1 = h.h.intValue();
        int j2 = p.d(h.i);
        int j3 = h.g;
        int k3 = p.e(h.i);
        com.snapchat.android.discover.model.DSnapPanel.MediaType mediatype3 = wd1.h();
        long l4 = wd1.e();
        long l7 = wd1.f();
        jQ jq3 = g.c.getSourceType();
        if (obj1 != com.snapchat.android.discover.analytics.DiscoverUsageAnalytics.ViewStatus.ERROR)
        {
            gQ gq = new gQ();
            gq.userAdId = DiscoverUsageAnalytics.a(info1);
            gq.timeViewed = Double.valueOf(Jk.a(l3, 1));
            gq.fullView = Boolean.valueOf(((com.snapchat.android.discover.analytics.DiscoverUsageAnalytics.ViewStatus) (obj1)).wasFullView());
            gq.adsnapId = s8;
            gq.adsnapPlacementId = s12;
            gq.adsnapLineItemId = s14;
            gq.editionId = ((String) (obj));
            gq.publisherId = s2;
            gq.mediaType = DiscoverUsageAnalytics.a(mediatype3);
            gq.source = jq3;
            gq.adUnitId = s15;
            gq.adRequestClientId = s16;
            if (l4 >= 0L)
            {
                gq.mediaDisplayTimeSec = Double.valueOf(Jk.a(l4, 1));
            }
            if (l7 >= 0L)
            {
                gq.snapTimeSec = Double.valueOf(Jk.a(l7, 1));
            }
            if (j2 < 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 == 0)
            {
                gq.snapIndexPos = Long.valueOf(j1 + 1);
                gq.snapIndexCount = Long.valueOf(j2);
                gq.adIndexPos = Long.valueOf(j3);
                gq.adIndexCount = Long.valueOf(k3);
            }
            discoverusageanalytics.a.a(gq);
            obj1 = new kR.a();
            obj1.mChannelName = s2;
            obj1.mEditionName = ((String) (obj));
            obj1.mPosition = j3;
            obj = ((kR.a) (obj1)).a();
            discoverusageanalytics.b.a(((kK) (obj)), l3);
        }
_L4:
        wd1.c();
        p();
_L2:
        n();
        m = 0L;
        K = false;
        n = 0;
        o = 0L;
        return;
_L8:
        if (com.snapchat.android.discover.model.DSnapPage.Form.LONGFORM.getIndex() == i1)
        {
            DiscoverUsageAnalytics discoverusageanalytics1 = r;
            String s = h.d;
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = b.b();
            String s5 = h.e;
            String s9 = h.f;
            String s11 = h.i;
            String s13 = h.j;
            com.snapchat.android.discover.model.DSnapPanel.MediaType mediatype2 = wd1.h();
            int k1 = h.h.intValue();
            int k2 = p.d(h.i);
            jQ jq2 = g.c.getSourceType();
            gI gi = new gI();
            gi.timeViewed = Double.valueOf(Jk.a(l3, 1));
            gi.adsnapId = s;
            gi.userAdId = DiscoverUsageAnalytics.a(info);
            gi.adsnapPlacementId = s5;
            gi.adsnapLineItemId = s9;
            gi.editionId = s11;
            gi.publisherId = s13;
            gi.longformType = DiscoverUsageAnalytics.b(mediatype2);
            gi.source = jq2;
            if (k2 < 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 == 0)
            {
                gi.snapIndexPos = Long.valueOf(k1 + 1);
                gi.snapIndexCount = Long.valueOf(k2);
            }
            discoverusageanalytics1.a.a(gi);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (com.snapchat.android.discover.model.DSnapPage.Form.TOP_SNAP.getIndex() == i1)
        {
            DiscoverUsageAnalytics discoverusageanalytics2 = r;
            com.snapchat.android.discover.analytics.DiscoverUsageAnalytics.ViewStatus viewstatus = wd1.a(l3);
            String s3 = h.a;
            String s6 = h.i;
            String s10 = h.j;
            int l1 = h.h.intValue();
            int l2 = p.d(h.i);
            jQ jq = g.c.getSourceType();
            com.snapchat.android.discover.model.DSnapPanel.MediaType mediatype1 = wd1.h();
            long l5 = wd1.e();
            long l8 = wd1.f();
            if (viewstatus != com.snapchat.android.discover.analytics.DiscoverUsageAnalytics.ViewStatus.ERROR)
            {
                hj hj1 = new hj();
                hj1.timeViewed = Double.valueOf(Jk.a(l3, 1));
                hj1.fullView = Boolean.valueOf(viewstatus.wasFullView());
                hj1.dsnapId = s3;
                hj1.editionId = s6;
                hj1.publisherId = s10;
                hj1.source = jq;
                hj1.mediaType = DiscoverUsageAnalytics.a(mediatype1);
                if (l5 >= 0L)
                {
                    hj1.mediaDisplayTimeSec = Double.valueOf(Jk.a(l5, 1));
                }
                if (l8 >= 0L)
                {
                    hj1.snapTimeSec = Double.valueOf(Jk.a(l8, 1));
                }
                if (l2 < 0)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (i1 == 0)
                {
                    hj1.snapIndexCount = Long.valueOf(l2);
                    hj1.snapIndexPos = Long.valueOf(l1 + 1);
                }
                discoverusageanalytics2.a.a(hj1);
            }
        } else
        if (com.snapchat.android.discover.model.DSnapPage.Form.LONGFORM.getIndex() == i1)
        {
            DiscoverUsageAnalytics discoverusageanalytics3 = r;
            String s1 = h.a;
            String s4 = h.i;
            String s7 = h.j;
            com.snapchat.android.discover.model.DSnapPanel.MediaType mediatype = wd1.h();
            int i2 = h.h.intValue();
            int i3 = p.d(h.i);
            jQ jq1 = g.c.getSourceType();
            i1 = n;
            long l6 = o;
            hb hb1 = new hb();
            hb1.timeViewed = Double.valueOf(Jk.a(l3, 1));
            hb1.dsnapId = s1;
            hb1.editionId = s4;
            hb1.publisherId = s7;
            hb1.longformType = DiscoverUsageAnalytics.b(mediatype);
            hb1.source = jq1;
            hb1.inlineVideoTimeViewed = Double.valueOf(Jk.a(l6, 1));
            hb1.inlineVideoViewCount = Long.valueOf(i1);
            if (i3 < 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 == 0)
            {
                hb1.snapIndexPos = Long.valueOf(i2 + 1);
                hb1.snapIndexCount = Long.valueOf(i3);
            }
            discoverusageanalytics3.a.a(hb1);
        }
        if (true) goto _L4; else goto _L9
_L9:
    }

    static boolean e(DSnapView dsnapview)
    {
        dsnapview.J = false;
        return false;
    }

    static long f(DSnapView dsnapview)
    {
        return dsnapview.G;
    }

    static float g(DSnapView dsnapview)
    {
        return dsnapview.F;
    }

    static float h(DSnapView dsnapview)
    {
        return dsnapview.D;
    }

    static int i(DSnapView dsnapview)
    {
        return dsnapview.B;
    }

    static float j(DSnapView dsnapview)
    {
        return dsnapview.E;
    }

    static float k(DSnapView dsnapview)
    {
        return dsnapview.C;
    }

    private void n()
    {
        z.removeCallbacks(A);
        J = false;
    }

    private boolean o()
    {
        return d != null && d.isShown();
    }

    private void p()
    {
        if (H != null)
        {
            H.c = System.currentTimeMillis();
        }
    }

    public final void B_()
    {
        m();
        super.B_();
        Timber.a("DSnapView", (new StringBuilder("Resetting view containing ")).append(h).toString(), new Object[0]);
        wi wi1 = a;
        if (wi1.c != null)
        {
            wj wj1 = wi1.c;
            wj1.b();
            wj1.a();
        }
        if (wi1.d != null)
        {
            wh wh1 = wi1.d;
            wh1.a();
            wh1.b();
        }
        wi1.i = null;
        wi1.j = 0;
        wi1.g = MediaState.NOT_STARTED;
        wi1.h = MediaState.NOT_STARTED;
        wi1.e = true;
        wi1.f = false;
        for (Iterator iterator = w.values().iterator(); iterator.hasNext(); ((wd)iterator.next()).d()) { }
        w.clear();
        c.removeAllViews();
        c.d();
        c.setScrollableInBothDirections(false);
        h = null;
        i = null;
        H = null;
        I = false;
        J = false;
        j = false;
        k = false;
        K = false;
        M = MediaState.NOT_STARTED;
        m = 0L;
        O = -1;
        n = 0;
        o = 0L;
    }

    public final void C_()
    {
        if (v != null && TextUtils.equals(h.b, "auto_advancing"))
        {
            v.a(true);
        }
    }

    public final void a()
    {
        if (!k)
        {
            return;
        } else
        {
            n();
            int i1 = k();
            Timber.c("DSnapView", "Exit page %s with current panel %d", new Object[] {
                h, Integer.valueOf(i1)
            });
            e(i1);
            k = false;
            s.a(new Na(j()));
            return;
        }
    }

    public final void a(float f1, float f2, wd wd1, boolean flag, com.snapchat.android.discover.model.DSnapPanel.MediaType mediatype, long l1)
    {
        wk wk1;
        boolean flag1;
        if (wd1.h() == com.snapchat.android.discover.model.DSnapPanel.MediaType.VIDEO)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        wk1 = f;
        wd1 = new Jr(wd1, flag, mediatype, l1) {

            private wd a;
            private boolean b;
            private com.snapchat.android.discover.model.DSnapPanel.MediaType c;
            private long d;
            private DSnapView e;

            public final void onAnimationEnd(Animator animator)
            {
                Object obj1 = e;
                Object obj2 = a;
                boolean flag6 = b;
                Object obj = c;
                long l2 = d;
                Object obj3 = ((DSnapView) (obj1)).h;
                ChannelPage channelpage = ((DSnapView) (obj1)).i;
                if (obj3 != null && channelpage != null)
                {
                    int j1 = ((DSnapView) (obj1)).p.d(((DSnapPage) (obj3)).i);
                    int i2 = ((DSnapView) (obj1)).p.e(((DSnapPage) (obj3)).i);
                    animator = null;
                    if (!flag6)
                    {
                        animator = ((Animator) (obj));
                    }
                    com.snapchat.android.discover.model.DSnapPanel.MediaType mediatype1 = ((wd) (obj2)).h();
                    jQ jq = ((DSnapView) (obj1)).g.c.getSourceType();
                    vv vv1 = new vv();
                    vv1.a = channelpage.a;
                    vv1.b = channelpage.b;
                    vv1.c = channelpage.c;
                    vv1.e = ((DSnapPage) (obj3)).a;
                    vv1.d = ((DSnapPage) (obj3)).i;
                    vv1.a(KL.a());
                    vv1.b(KL.b());
                    if (animator == com.snapchat.android.discover.model.DSnapPanel.MediaType.LOCAL_WEBPAGE)
                    {
                        vv1.l = true;
                    }
                    vv1.m = channelpage.g;
                    vv1.n = channelpage.h;
                    vv1.s = ((DSnapPage) (obj3)).h.intValue();
                    vv1.t = j1;
                    vv1.u = ((DSnapPage) (obj3)).m.intValue();
                    vv1.v = ((DSnapPage) (obj3)).d;
                    vv1.w = ((DSnapPage) (obj3)).g;
                    vv1.x = i2;
                    vv1.y = mediatype1;
                    vv1.z = animator;
                    vv1.A = flag6;
                    vv1.B = l2;
                    vv1.C = jq;
                    if (obj == com.snapchat.android.discover.model.DSnapPanel.MediaType.LOCAL_WEBPAGE)
                    {
                        ((DSnapView) (obj1)).f.b();
                        obj = ((DSnapView) (obj1)).getRootView();
                    } else
                    {
                        obj = ((DSnapView) (obj1)).c.getChildAt(((DSnapView) (obj1)).k());
                    }
                    obj = ((wd) (obj2)).a(((View) (obj)), vv1, new LinkedList());
                    if (obj != null)
                    {
                        ((DSnapView) (obj1)).s.a(new NV(((AA) (obj)), SnapCaptureContext.DISCOVER, ((wd) (obj2)).p()));
                        obj = ((DSnapView) (obj1)).r;
                        String s = ((DSnapPage) (obj3)).j;
                        String s1 = ((DSnapPage) (obj3)).i;
                        String s2 = ((DSnapPage) (obj3)).a;
                        int k1 = ((DSnapPage) (obj3)).h.intValue();
                        int i1 = ((DSnapPage) (obj3)).m.intValue();
                        String s3 = ((DSnapPage) (obj3)).d;
                        int j2 = ((DSnapPage) (obj3)).g;
                        obj2 = ((wd) (obj2)).h();
                        obj1 = ((DSnapView) (obj1)).g.c.getSourceType();
                        if (i1 == 0)
                        {
                            if (flag6)
                            {
                                animator = new he();
                                animator.publisherId = s;
                                animator.dsnapId = s2;
                                animator.editionId = s1;
                                animator.mediaType = DiscoverUsageAnalytics.a(((com.snapchat.android.discover.model.DSnapPanel.MediaType) (obj2)), false);
                                animator.timeViewed = Double.valueOf(Jk.a(l2, 1));
                                animator.source = ((jQ) (obj1));
                                boolean flag2;
                                if (j1 < 0)
                                {
                                    flag2 = true;
                                } else
                                {
                                    flag2 = false;
                                }
                                if (!flag2)
                                {
                                    animator.snapIndexCount = Long.valueOf(j1);
                                    animator.snapIndexPos = Long.valueOf(k1 + 1);
                                }
                                ((DiscoverUsageAnalytics) (obj)).a.a(animator);
                                return;
                            }
                            obj3 = new gY();
                            obj3.publisherId = s;
                            obj3.dsnapId = s2;
                            obj3.editionId = s1;
                            obj3.mediaType = DiscoverUsageAnalytics.a(((com.snapchat.android.discover.model.DSnapPanel.MediaType) (obj2)), false);
                            obj3.longformType = DiscoverUsageAnalytics.b(animator);
                            obj3.timeViewed = Double.valueOf(Jk.a(l2, 1));
                            obj3.source = ((jQ) (obj1));
                            boolean flag3;
                            if (j1 < 0)
                            {
                                flag3 = true;
                            } else
                            {
                                flag3 = false;
                            }
                            if (!flag3)
                            {
                                obj3.snapIndexCount = Long.valueOf(j1);
                                obj3.snapIndexPos = Long.valueOf(k1 + 1);
                            }
                            ((DiscoverUsageAnalytics) (obj)).a.a(((kl) (obj3)));
                            return;
                        }
                        if (flag6)
                        {
                            animator = new gL();
                            animator.publisherId = s;
                            animator.adsnapId = s3;
                            animator.editionId = s1;
                            animator.mediaType = DiscoverUsageAnalytics.a(((com.snapchat.android.discover.model.DSnapPanel.MediaType) (obj2)), false);
                            animator.timeViewed = Double.valueOf(Jk.a(l2, 1));
                            animator.source = ((jQ) (obj1));
                            boolean flag4;
                            if (j1 < 0)
                            {
                                flag4 = true;
                            } else
                            {
                                flag4 = false;
                            }
                            if (!flag4)
                            {
                                animator.snapIndexCount = Long.valueOf(j1);
                                animator.snapIndexPos = Long.valueOf(k1 + 1);
                                animator.adIndexPos = Long.valueOf(j2);
                                animator.adIndexCount = Long.valueOf(i2);
                            }
                            ((DiscoverUsageAnalytics) (obj)).a.a(animator);
                            return;
                        }
                        obj3 = new gF();
                        obj3.publisherId = s;
                        obj3.adsnapId = s3;
                        obj3.editionId = s1;
                        obj3.mediaType = DiscoverUsageAnalytics.a(((com.snapchat.android.discover.model.DSnapPanel.MediaType) (obj2)), false);
                        obj3.timeViewed = Double.valueOf(Jk.a(l2, 1));
                        obj3.longformType = DiscoverUsageAnalytics.b(animator);
                        obj3.source = ((jQ) (obj1));
                        boolean flag5;
                        if (j1 < 0)
                        {
                            flag5 = true;
                        } else
                        {
                            flag5 = false;
                        }
                        if (!flag5)
                        {
                            obj3.snapIndexCount = Long.valueOf(j1);
                            obj3.snapIndexPos = Long.valueOf(k1 + 1);
                            obj3.adIndexPos = Long.valueOf(j2);
                            obj3.adIndexCount = Long.valueOf(i2);
                        }
                        ((DiscoverUsageAnalytics) (obj)).a.a(((kl) (obj3)));
                        return;
                    }
                }
            }

            
            {
                e = DSnapView.this;
                a = wd1;
                b = flag;
                c = mediatype;
                d = l1;
                super();
            }
        };
        wk1.a();
        if (wk1.e == null)
        {
            Timber.e("DSnapPreviewToolPresenter", "Inflation failed!", new Object[0]);
            return;
        }
        wk1.f.setVisibility(0);
        wk1.d.setAlpha(0.0F);
        wk1.e.setVisibility(0);
        wk1.d.setVisibility(0);
        mediatype = wk1.d.findViewById(0x7f0d0270);
        float f3;
        ArrayList arraylist;
        if (flag1)
        {
            mediatype.setVisibility(0);
        } else
        {
            mediatype.setVisibility(8);
        }
        if (wk1.a.a())
        {
            wk1.d.findViewById(0x7f0d027a).setVisibility(0);
        }
        f3 = Math.max(Math.max((float)wk1.b - f1, f2), Math.max((float)wk1.c - f1, f2)) * 1.1F;
        wk1.f.setX(f1 - f3);
        wk1.f.setY(f2 - f3);
        mediatype = wk1.f.getLayoutParams();
        mediatype.width = (int)f3 << 1;
        mediatype.height = (int)f3 << 1;
        wk1.f.setLayoutParams(mediatype);
        mediatype = new AnimatorSet();
        mediatype.setDuration(350L);
        mediatype.setInterpolator(new AccelerateDecelerateInterpolator());
        arraylist = new ArrayList(8);
        arraylist.add(ObjectAnimator.ofFloat(wk1.f, View.SCALE_X, new float[] {
            0.0F, 1.0F
        }));
        arraylist.add(ObjectAnimator.ofFloat(wk1.f, View.SCALE_Y, new float[] {
            0.0F, 1.0F
        }));
        arraylist.add(ObjectAnimator.ofFloat(wk1.f, View.ALPHA, new float[] {
            0.5F, 0.0F
        }));
        arraylist.add(ObjectAnimator.ofFloat(wk1.d, View.SCALE_X, new float[] {
            0.0F, 1.0F
        }));
        arraylist.add(ObjectAnimator.ofFloat(wk1.d, View.SCALE_Y, new float[] {
            0.0F, 1.0F
        }));
        arraylist.add(ObjectAnimator.ofFloat(wk1.d, View.ALPHA, new float[] {
            0.0F, 1.0F
        }));
        arraylist.add(ObjectAnimator.ofFloat(wk1.d, View.TRANSLATION_X, new float[] {
            f1 - 0.5F * (float)wk1.b, 0.0F
        }));
        arraylist.add(ObjectAnimator.ofFloat(wk1.d, View.TRANSLATION_Y, new float[] {
            f2 - 0.5F * (float)wk1.c, 0.0F
        }));
        mediatype.addListener(new wk._cls1(wd1));
        mediatype.playTogether(arraylist);
        mediatype.start();
    }

    public final void a(int i1)
    {
        Object obj1;
        Object obj2;
        if (k)
        {
            c(i1);
            return;
        }
        f.b();
        wq wq1 = e;
        obj1 = c;
        if (wq1.a != null)
        {
            wq1.a.clearAnimation();
            ViewGroup viewgroup = (ViewGroup)wq1.a.getParent();
            if (viewgroup != null)
            {
                viewgroup.removeView(wq1.a);
            }
            ((VerticalSwipeLayout) (obj1)).addView(wq1.a, 0);
            wq1.a = null;
        }
        k = true;
        q.a(i, h);
        obj1 = p;
        obj2 = h.i;
        ((vA) (obj1)).b(h.a, System.currentTimeMillis());
        Object obj = ((vA) (obj1)).b;
        obj;
        JVM INSTR monitorenter ;
        Object obj3 = (vA.c)((vA) (obj1)).b.get(obj2);
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_1136;
        }
        boolean flag = ((vA) (obj1)).a(((vA.c) (obj3)).f);
_L12:
        ((vA) (obj1)).a(((String) (obj2)), flag);
        obj;
        JVM INSTR monitorexit ;
        if (N != null && N.g()) goto _L2; else goto _L1
_L1:
        obj = g.d;
        obj1 = h;
        flag = I;
        obj2 = g.c;
        obj3 = (com.snapchat.android.discover.analytics.EditionPerformanceAnalytics.WaitTimeMetricState)((EditionPerformanceAnalytics) (obj)).c.get(((DSnapPage) (obj1)).a);
        if (obj3 != null && obj3 != com.snapchat.android.discover.analytics.EditionPerformanceAnalytics.WaitTimeMetricState.NOT_STARTED) goto _L4; else goto _L3
_L3:
        if (!((DSnapPage) (obj1)).c().isLoading()) goto _L6; else goto _L5
_L5:
        obj3 = ((EditionPerformanceAnalytics) (obj)).a;
        String s = ((DSnapPage) (obj1)).a;
        String s2 = ((EditionPerformanceAnalytics) (obj)).d;
        String s5 = ((DSnapPage) (obj1)).j;
        String s8 = ((DSnapPage) (obj1)).i;
        String s11 = ((DSnapPage) (obj1)).a;
        String s13 = ((DSnapPage) (obj1)).b();
        int j1 = ((DSnapPage) (obj1)).h.intValue();
        int i2 = ((EditionPerformanceAnalytics) (obj)).f;
        ((uy) (obj3)).a("DISCOVER_DSNAP_WAIT_TIME", s, com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("DISCOVER_DSNAP_WAIT_TIME").a("session_id", s2).a("publisher_name", s5).a("edition_id", s8).a("dsnap_id", s11).a("has_ad", Boolean.valueOf(flag)).a("hash", s13).a("snap_index_pos", Integer.toString(j1)).a("source", ((MediaOpenOrigin) (obj2)).toString()).a("snap_index_count", Integer.toString(i2)).b());
        ((EditionPerformanceAnalytics) (obj)).c.put(((DSnapPage) (obj1)).a, com.snapchat.android.discover.analytics.EditionPerformanceAnalytics.WaitTimeMetricState.TIMING);
        ((EditionPerformanceAnalytics) (obj)).b.add(((DSnapPage) (obj1)).a);
_L4:
        p.a(h.i, h.a);
        c(i1);
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L2:
        obj = N.c();
        if (!((MediaState) (obj)).isError()) goto _L1; else goto _L7
_L7:
        gP gp;
        int l2;
        obj1 = r;
        String s3 = N.a;
        String s6 = N.p;
        String s9 = N.h();
        obj2 = N.i;
        obj3 = N.j;
        int k1 = N.h.intValue();
        int j2 = p.d(N.i);
        l2 = N.g;
        int i3 = p.e(N.i);
        jQ jq = g.c.getSourceType();
        long l3 = k1 + 1;
        gp = new gP();
        gp.adsnapId = s3;
        gp.editionId = ((String) (obj2));
        gp.publisherId = ((String) (obj3));
        gp.snapIndexPos = Long.valueOf(l3);
        gp.snapIndexCount = Long.valueOf(j2);
        gp.adIndexPos = Long.valueOf(l2);
        gp.adIndexCount = Long.valueOf(i3);
        gp.source = jq;
        gp.adUnitId = s6;
        gp.adRequestClientId = s9;
        if (obj != null && ((MediaState) (obj)).isError()) goto _L9; else goto _L8
_L8:
        obj = fU.FAILED;
_L11:
        gp.additionalInfo = ((fU) (obj));
        ((DiscoverUsageAnalytics) (obj1)).a.a(gp);
        obj = new kR.a();
        obj.mChannelName = ((String) (obj3));
        obj.mEditionName = ((String) (obj2));
        obj.mPosition = l2;
        obj = ((kR.a) (obj)).a();
        ((DiscoverUsageAnalytics) (obj1)).b.b(((kK) (obj)));
          goto _L1
_L9:
        switch (com.snapchat.android.discover.analytics.DiscoverUsageAnalytics._cls1.b[((MediaState) (obj)).ordinal()])
        {
        default:
            obj = fU.FAILED;
            break;

        case 1: // '\001'
            obj = fU.SERVER_INTERNAL_ERROR;
            break;

        case 2: // '\002'
            obj = fU.SERVER_INVALID_REQUEST_ERROR;
            break;

        case 3: // '\003'
            obj = fU.SERVER_NETWORK_ERROR;
            break;

        case 4: // '\004'
            obj = fU.SERVER_NO_FILL_ERROR;
            break;

        case 5: // '\005'
            obj = fU.SERVER_OTHER_ERROR;
            break;

        case 6: // '\006'
            obj = fU.CONTENT_NO_FILL;
            break;

        case 7: // '\007'
            obj = fU.TIMEOUT;
            break;

        case 8: // '\b'
            obj = fU.CLIENT_ERROR;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        uy uy1 = ((EditionPerformanceAnalytics) (obj)).a;
        String s1 = ((DSnapPage) (obj1)).a;
        String s4 = ((EditionPerformanceAnalytics) (obj)).d;
        String s7 = ((DSnapPage) (obj1)).j;
        String s10 = ((DSnapPage) (obj1)).i;
        String s12 = ((DSnapPage) (obj1)).a;
        String s14 = ((DSnapPage) (obj1)).b();
        int l1 = ((DSnapPage) (obj1)).h.intValue();
        int k2 = ((EditionPerformanceAnalytics) (obj)).f;
        MediaState mediastate = ((DSnapPage) (obj1)).c();
        if (!uy1.b.contains(s1))
        {
            com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("DISCOVER_DSNAP_WAIT_TIME").a("session_id", s4).a("publisher_name", s7).a("edition_id", s10).a("dsnap_id", s12).a("has_ad", Boolean.valueOf(flag)).a("hash", s14).a("type", mediastate.toString().toLowerCase(Locale.ENGLISH)).a("snap_index_pos", Integer.toString(l1)).a("snap_index_count", Integer.toString(k2)).a("source", ((MediaOpenOrigin) (obj2)).toString()).a("reachability", uy1.a.f()).a(0L).b(false);
        }
        break MISSING_BLOCK_LABEL_1116;
        if (true) goto _L11; else goto _L10
_L10:
        ((EditionPerformanceAnalytics) (obj)).c.put(((DSnapPage) (obj1)).a, com.snapchat.android.discover.analytics.EditionPerformanceAnalytics.WaitTimeMetricState.REPORTED);
          goto _L4
        flag = false;
          goto _L12
    }

    public final void a(int i1, int j1, int k1)
    {
        if (h != null && k)
        {
            if (i1 == 2 && j1 != k1)
            {
                e(j1);
                O = k1;
                d(k1);
                return;
            }
            if (i1 == 1)
            {
                wd wd1 = b(j1);
                if (wd1 != null)
                {
                    wd1.i();
                    return;
                }
            }
        }
    }

    public final void a(int i1, boolean flag)
    {
        if (c == null)
        {
            return;
        }
        if (flag)
        {
            c.a(i1, 1.0D);
            return;
        } else
        {
            c.a(i1, 0.0D);
            return;
        }
    }

    public final void a(String s)
    {
        if (k)
        {
            Timber.e("DSnapView", "Error playing DSnap %s (%s)", new Object[] {
                h, s
            });
            String s1 = h.j;
            String s2 = h.i;
            String s3 = h.a;
            String s4 = h.b();
            com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("DISCOVER_DSNAP_MEDIA_PLAYBACK_ERROR").a("publisher_name", s1).a("dsnap_id", s3).a("edition_id", s2).a("hash", s4).a("description", s).b(false);
            a.a(MediaState.GENERIC_ERROR);
            L = false;
        }
    }

    public final void a(List list, DSnapPage dsnappage, int i1, DSnapPage dsnappage1)
    {
        this;
        JVM INSTR monitorenter ;
        h = dsnappage;
        I = a(list, i1);
        N = dsnappage1;
        dsnappage1 = a;
        int j1 = Color.parseColor(h.l);
        if (j1 != ((wi) (dsnappage1)).j)
        {
            dsnappage1.j = j1;
            dsnappage1.e = true;
            dsnappage1.a(((wi) (dsnappage1)).g);
        }
        if (!y.a.a("DISCOVER_V2", "SHOW_LOADING_SCREEN_FOR_PRE_AD_DNAP_WHEN_AD_LOADING", true) || !a(list, i1))
        {
            break MISSING_BLOCK_LABEL_260;
        }
        list = (DSnapPage)list.get(i1 + 1);
        if (!list.c().isLoading())
        {
            break MISSING_BLOCK_LABEL_260;
        }
        list = list.c();
_L1:
        Timber.c("DSnapView", "currentLoadingState: %s, adjusted: %s for %s", new Object[] {
            h.c(), list, h
        });
        if (M != MediaState.SUCCESS && list == MediaState.SUCCESS)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        M = list;
        list = h.d();
        a(h, ((DSnapPanel) (list)), com.snapchat.android.discover.model.DSnapPage.Form.TOP_SNAP);
        list = h.e();
        a(h, ((DSnapPanel) (list)), com.snapchat.android.discover.model.DSnapPage.Form.LONGFORM);
        a.a(M);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        if (k)
        {
            c(O);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        list = dsnappage.c();
          goto _L1
        list;
        throw list;
    }

    public final wd b(int i1)
    {
        return (wd)w.get(Integer.valueOf(i1));
    }

    public final void b()
    {
        if (!M.isLoading() && !M.isError())
        {
            Object obj = a;
            Timber.a("DSnapLoadingStatePresenter", "LOADING-STATE %s: Hiding loading state quickly.", new Object[] {
                ((wi) (obj)).a()
            });
            wh wh1 = ((wi) (obj)).d;
            if (!wh1.e)
            {
                wh1.e = true;
                float f2;
                long l2;
                if (wh1.f != null)
                {
                    wh1.f.cancel();
                    float f1 = wh1.a.getAlpha();
                    long l1 = (long)Math.abs(300F * f1);
                    Timber.a("DSnapLoadingErrorViewHolder", (new StringBuilder("LOADING-STATE: Cancel slow and hide fast with duration: ")).append(l1).toString(), new Object[0]);
                    wh1.a(l1, f1, false);
                } else
                {
                    Timber.a("DSnapLoadingErrorViewHolder", "LOADING-STATE: Hiding fast", new Object[0]);
                    wh1.a(300);
                }
            }
            obj = ((wi) (obj)).c;
            if (!((wj) (obj)).f)
            {
                obj.f = true;
                if (((wj) (obj)).g != null)
                {
                    ((wj) (obj)).g.cancel();
                    f2 = ((wj) (obj)).a.getAlpha();
                    l2 = (long)Math.abs(300F * f2);
                    Timber.a("DSnapLoadingViewHolder", (new StringBuilder("LOADING-STATE: Cancel slow and hide fast with duration: ")).append(l2).toString(), new Object[0]);
                    ((wj) (obj)).a(l2, f2, false);
                } else
                {
                    Timber.a("DSnapLoadingViewHolder", "LOADING-STATE: Hiding fast", new Object[0]);
                    ((wj) (obj)).a(300);
                }
            }
            c.setScrollableInBothDirections(true);
            L = true;
        }
    }

    public final void b(int i1, int j1, int k1)
    {
    }

    public final void b_(int i1)
    {
    }

    final void c(int i1)
    {
        int j1 = i1;
        if (i1 == -1)
        {
            j1 = i1;
            if (l != -1)
            {
                j1 = l;
                l = -1;
            }
        }
        if (j1 >= 0)
        {
            if (j1 != k())
            {
                a(j1, false);
            }
            O = j1;
            d(j1);
            return;
        } else
        {
            d(k());
            return;
        }
    }

    public final boolean c()
    {
        return h != null && (M == MediaState.SUCCESS || K) && !o();
    }

    public boolean canScrollVertically(int i1)
    {
        if (c.getChildCount() > 0)
        {
            return c.canScrollVertically(i1);
        } else
        {
            return super.canScrollVertically(i1);
        }
    }

    public final boolean d()
    {
        if (o())
        {
            return true;
        }
        wd wd1 = b(k());
        if (wd1 != null)
        {
            return wd1.o();
        } else
        {
            return false;
        }
    }

    public final boolean e()
    {
        if (k() == com.snapchat.android.discover.model.DSnapPage.Form.LONGFORM.getIndex())
        {
            a(com.snapchat.android.discover.model.DSnapPage.Form.TOP_SNAP.getIndex(), true);
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean f()
    {
        wd wd1;
        if (c != null && !c.e())
        {
            if ((wd1 = b(k())) != null)
            {
                return wd1.g();
            }
        }
        return false;
    }

    public final boolean g()
    {
        if (h != null)
        {
            boolean flag;
            if (com.snapchat.android.discover.model.DSnapPage.Form.LONGFORM.getIndex() == k())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && h.e().g == com.snapchat.android.discover.model.DSnapPanel.MediaType.REMOTE_VIDEO)
            {
                return true;
            }
        }
        return false;
    }

    public final int h()
    {
        if (i != null)
        {
            return i.g;
        } else
        {
            return 0xff000000;
        }
    }

    public final int i()
    {
        if (i != null)
        {
            return i.h;
        } else
        {
            return -1;
        }
    }

    public final String j()
    {
        DSnapPage dsnappage = h;
        return (new StringBuilder("DSnapPage")).append(dsnappage.a).toString();
    }

    public final int k()
    {
        if (c != null)
        {
            return c.c;
        } else
        {
            return 0;
        }
    }

    public final void l()
    {
        wd wd1 = b(k());
        if (wd1 != null)
        {
            wd1.j();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        wd wd1 = b(k());
        if (wd1 != null)
        {
            wd1.a_(configuration.orientation);
        }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        c = (VerticalSwipeLayout)findViewById(0x7f0d0295);
        a.k = P;
        c.g();
        c.a(this);
        f = new wk(getContext(), this);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (d == null || !d.isShown()) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        wd wd1;
        boolean flag;
        if (super.t != null && super.t.isShown())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L1; else goto _L3
_L3:
        wd1 = b(k());
        if (wd1 != null)
        {
            VerticalSwipeLayout verticalswipelayout = c;
            boolean flag1;
            if (!wd1.o())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            verticalswipelayout.setScrollableInBothDirections(flag1);
        }
        if (M != MediaState.SUCCESS) goto _L5; else goto _L4
_L4:
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 128
    //                   0 142
    //                   1 278
    //                   2 305
    //                   3 264;
           goto _L5 _L6 _L7 _L8 _L9
_L5:
        return false;
_L6:
        if (wd1.a(motionevent))
        {
            return false;
        }
        if (!J)
        {
            Object obj = f;
            motionevent.getX();
            motionevent.getY();
            ((wk) (obj)).a();
            obj = A;
            float f1 = motionevent.getX();
            float f2 = motionevent.getY();
            obj.a = f1;
            obj.b = f2;
            z.postDelayed(A, 400L);
            C = motionevent.getX();
            D = motionevent.getY();
            E = motionevent.getX();
            F = motionevent.getY();
            J = true;
        }
        if (true) goto _L5; else goto _L9
_L9:
        if (!J) goto _L5; else goto _L10
_L10:
        n();
        break; /* Loop/switch isn't completed */
_L7:
        if (J)
        {
            n();
        }
        G = motionevent.getEventTime() - motionevent.getDownTime();
        break; /* Loop/switch isn't completed */
_L8:
        E = motionevent.getX();
        F = motionevent.getY();
        if (!J || Math.abs(motionevent.getRawY() - D) <= (float)B && Math.abs(motionevent.getRawX() - C) <= (float)B) goto _L5; else goto _L10
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (d != null && d.isShown())
        {
            if (motionevent.getAction() == 1)
            {
                d.animate().alpha(0.0F).setDuration(300L).setListener(new Jr() {

                    private DSnapView a;

                    public final void onAnimationEnd(Animator animator)
                    {
                        animator = a;
                        if (((DSnapView) (animator)).d != null)
                        {
                            ((DSnapView) (animator)).d.setVisibility(8);
                        }
                        animator.j = false;
                        animator.c(animator.k());
                    }

            
            {
                a = DSnapView.this;
                super();
            }
                });
            }
        } else
        if (!m())
        {
            wd wd1 = b(k());
            if (wd1 != null)
            {
                return wd1.a().dispatchTouchEvent(motionevent);
            } else
            {
                return false;
            }
        }
        return true;
    }

    public void setOnboardingEnabled(boolean flag)
    {
        j = flag;
    }

    // Unreferenced inner class com/snapchat/android/discover/ui/DSnapView$3

/* anonymous class */
    public final class _cls3 extends Jr
    {

        private float a;
        private float b;
        private wd c;
        private boolean d;
        private com.snapchat.android.discover.model.DSnapPanel.MediaType e;
        private long f;
        private DSnapView g;

        public final void onAnimationEnd(Animator animator)
        {
            DSnapView.a(g, a, b, c, d, e, f);
        }

            public 
            {
                g = DSnapView.this;
                a = f1;
                b = f2;
                c = wd1;
                d = flag;
                e = mediatype;
                f = l1;
                super();
            }
    }

}
