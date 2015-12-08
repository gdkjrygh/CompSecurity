// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.fragment;

import Cf;
import Ch;
import Cl;
import IS;
import JA;
import JF;
import JG;
import Jk;
import Jo;
import Jw;
import Jx;
import MC;
import Mf;
import Mh;
import Mo;
import Mz;
import NT;
import OC;
import Og;
import PB;
import PG;
import PI;
import TU;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.deeplink.DeepLinkProcessorRegistry;
import com.snapchat.android.discover.analytics.DiscoverUsageAnalytics;
import com.snapchat.android.discover.analytics.EditionPerformanceAnalytics;
import com.snapchat.android.discover.model.ChannelPage;
import com.snapchat.android.discover.model.DSnapPage;
import com.snapchat.android.discover.model.MediaState;
import com.snapchat.android.discover.ui.EditionViewerMetadata;
import com.snapchat.android.discover.ui.FadeFullScreenAnimationView;
import com.snapchat.android.discover.ui.media.DiscoverEditionPageView;
import com.snapchat.android.ui.ClipCircleViewGroup;
import com.snapchat.android.ui.SwipeOutTracker;
import com.snapchat.android.util.eventbus.CameraDisplayState;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import gU;
import hn;
import jQ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import uL;
import uQ;
import uy;
import uz;
import vA;
import vJ;
import vK;
import vk;
import vz;
import wG;
import wJ;
import wn;
import wr;
import wt;
import wu;
import wv;

// Referenced classes of package com.snapchat.android.discover.ui.fragment:
//            EditionViewerPager

public class EditionViewerFragment extends SnapchatFragment
    implements IS.a, com.snapchat.android.ui.ClipCircleViewGroup.c, com.snapchat.android.ui.ClipCircleViewGroup.d, com.snapchat.android.ui.SwipeOutTracker.a, vJ.b
{

    protected EditionViewerMetadata a;
    private ClipCircleViewGroup b;
    private wt c;
    private final SwipeOutTracker d;
    private Bitmap e;
    private Paint f;
    private EditionViewerPager g;
    private FadeFullScreenAnimationView h;
    private final JA i;
    private final Bus j;
    private final uL k;
    private final DiscoverUsageAnalytics l;
    private final vA m;
    private final Ch n;
    private final vJ o;
    private final IS p;
    private final vk q;
    private wn r;
    private AudioManager s;
    private Jx t;
    private int u;
    private boolean v;
    private long w;
    private uz x;

    public EditionViewerFragment()
    {
        JA ja = new JA();
        Bus bus = Mf.a();
        uL ul = uL.a();
        new PB();
        this(ja, bus, ul, new DiscoverUsageAnalytics(), vA.a(), Ch.a(), vJ.a(), IS.a(), (vk)DeepLinkProcessorRegistry.DISCOVER.getProcessor(), new SwipeOutTracker());
    }

    private EditionViewerFragment(JA ja, Bus bus, uL ul, DiscoverUsageAnalytics discoverusageanalytics, vA va, Ch ch, vJ vj, 
            IS is, vk vk1, SwipeOutTracker swipeouttracker)
    {
        e = null;
        u = 0;
        w = 0L;
        j = bus;
        i = ja;
        k = ul;
        m = va;
        l = discoverusageanalytics;
        n = ch;
        o = vj;
        p = is;
        q = vk1;
        d = swipeouttracker;
    }

    static Bitmap a(EditionViewerFragment editionviewerfragment, Bitmap bitmap)
    {
        editionviewerfragment.e = bitmap;
        return bitmap;
    }

    static SwipeOutTracker a(EditionViewerFragment editionviewerfragment)
    {
        return editionviewerfragment.d;
    }

    private void a(com.snapchat.android.ui.SwipeOutTracker.SwipeToExitMethod swipetoexitmethod)
    {
        Object obj;
        Object obj1;
        gU gu;
        long l5;
        if (a.b == null || a.c == null || x == null || swipetoexitmethod == null)
        {
            break MISSING_BLOCK_LABEL_614;
        }
        obj = a.b;
        obj1 = l;
        long l1 = SystemClock.elapsedRealtime();
        long l2 = w;
        String s1 = a.c;
        String s3 = ((ChannelPage) (obj)).a;
        long l3 = x.a.size();
        long l4 = x.b.size();
        l5 = m.d(a.c);
        jQ jq = x.c.getSourceType();
        int i1 = a.g;
        gu = new gU();
        gu.timeViewed = Double.valueOf(Jk.a(l1 - l2, 1));
        gu.editionId = s1;
        gu.publisherId = s3;
        gu.numSnapsViewed = Long.valueOf(l3);
        gu.numLongformViewed = Long.valueOf(l4);
        gu.source = jq;
        if (jq == jQ.STORY)
        {
            gu.viewLocationPos = Long.valueOf(i1);
        }
        com.snapchat.android.discover.analytics.DiscoverUsageAnalytics._cls1.a[swipetoexitmethod.ordinal()];
        JVM INSTR tableswitch 1 6: default 272
    //                   1 437
    //                   2 448
    //                   3 459
    //                   4 470
    //                   5 481
    //                   6 492;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_492;
_L1:
        Timber.e("DiscoverAnalytics", "Unsupported Discover exit method, will leave as null in logged event.", new Object[0]);
_L8:
        boolean flag;
        if ((int)l5 < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            gu.snapIndexCount = Long.valueOf(l5);
        }
        ((DiscoverUsageAnalytics) (obj1)).a.a(gu);
        swipetoexitmethod = x.d;
        obj1 = ((EditionPerformanceAnalytics) (swipetoexitmethod)).c.entrySet().iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            Object obj2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
            if (((java.util.Map.Entry) (obj2)).getValue() == com.snapchat.android.discover.analytics.EditionPerformanceAnalytics.WaitTimeMetricState.TIMING)
            {
                uy uy2 = ((EditionPerformanceAnalytics) (swipetoexitmethod)).a;
                obj2 = uy2.a("DISCOVER_DSNAP_WAIT_TIME", (String)((java.util.Map.Entry) (obj2)).getKey());
                if (obj2 != null)
                {
                    ((EasyMetric) (obj2)).a("type", "abandoned").a("reachability", uy2.a.f()).b(false);
                }
            }
        } while (true);
        break MISSING_BLOCK_LABEL_509;
_L2:
        gu.exitEvent = hn.SWIPE_BEGINNING;
          goto _L8
_L3:
        gu.exitEvent = hn.SWIPE_END;
          goto _L8
_L4:
        gu.exitEvent = hn.ENTER_BACKGROUND;
          goto _L8
_L5:
        gu.exitEvent = hn.SWIPE_DOWN;
          goto _L8
_L6:
        gu.exitEvent = hn.AUTO_ADVANCE;
          goto _L8
        gu.exitEvent = hn.BACK_PRESSED;
          goto _L8
        uy uy1 = ((EditionPerformanceAnalytics) (swipetoexitmethod)).a;
        String s2 = ((EditionPerformanceAnalytics) (swipetoexitmethod)).d;
        String s4 = ((ChannelPage) (obj)).a;
        obj = ((ChannelPage) (obj)).d;
        int j1 = ((EditionPerformanceAnalytics) (swipetoexitmethod)).b.size();
        swipetoexitmethod = ((EditionPerformanceAnalytics) (swipetoexitmethod)).e;
        com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("DISCOVER_EDITION_VIEW_SUMMARY").a("session_id", s2).a("publisher_name", s4).a("edition_id", obj).a("reachability", uy1.a.f()).a("count", Integer.valueOf(j1)).a("source", swipetoexitmethod.toString()).b(false);
    }

    static wt b(EditionViewerFragment editionviewerfragment)
    {
        return editionviewerfragment.c;
    }

    private void b(List list)
    {
        if (q.d())
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                Object obj = (DSnapPage)list.next();
                if (TextUtils.equals(((DSnapPage) (obj)).a, q.e))
                {
                    obj = ((DSnapPage) (obj)).c();
                    if (!((MediaState) (obj)).isLoading())
                    {
                        if (((MediaState) (obj)).isError())
                        {
                            q.b("network_error");
                        } else
                        {
                            q.b("success");
                        }
                    }
                }
            }
        }
    }

    static EditionViewerPager c(EditionViewerFragment editionviewerfragment)
    {
        return editionviewerfragment.g;
    }

    static boolean d(EditionViewerFragment editionviewerfragment)
    {
        return editionviewerfragment.v;
    }

    static boolean e(EditionViewerFragment editionviewerfragment)
    {
        editionviewerfragment.v = true;
        return true;
    }

    static vk f(EditionViewerFragment editionviewerfragment)
    {
        return editionviewerfragment.q;
    }

    public final void a(float f1, float f2)
    {
        if (ClipCircleViewGroup.h && b.m == 2)
        {
            b.a(true);
            return;
        } else
        {
            b.b(f1, f2);
            return;
        }
    }

    public final void a(int i1)
    {
        if ((i1 & 0x1011) != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (g == null) goto _L4; else goto _L3
_L3:
        Object obj = g;
        if (((EditionViewerPager) (obj)).b != 0) goto _L6; else goto _L5
_L5:
        obj = ((EditionViewerPager) (obj)).d();
        if (obj == null) goto _L6; else goto _L7
_L7:
        boolean flag = ((DiscoverEditionPageView) (obj)).f();
_L13:
        if (!flag) goto _L4; else goto _L8
_L8:
        flag = true;
_L14:
        Timber.a("EditionViewerFragment", "onRotate %d with isLandscapeSupported %s", new Object[] {
            Integer.valueOf(i1), Boolean.valueOf(flag)
        });
        i1;
        JVM INSTR lookupswitch 3: default 112
    //                   1: 113
    //                   16: 140
    //                   4096: 161;
           goto _L9 _L10 _L11 _L12
_L12:
        continue; /* Loop/switch isn't completed */
_L9:
        return;
_L10:
        j.a(new Mo(1, true));
        return;
_L6:
        flag = false;
          goto _L13
_L4:
        flag = false;
          goto _L14
_L11:
        if (!flag) goto _L1; else goto _L15
_L15:
        j.a(new Mo(0, true));
        return;
        if (!flag) goto _L1; else goto _L16
_L16:
        j.a(new Mo(8, true));
        return;
    }

    public final void a(int i1, float f1)
    {
        if (i1 == 0)
        {
            h.setAlpha(0.0F);
            s.setStreamVolume(3, u, 0);
            return;
        }
        if (i1 == 1)
        {
            h.setAlpha(f1);
            s.setStreamVolume(3, (int)((float)u * (1.0F - f1)), 0);
            return;
        } else
        {
            h.setAlpha(1.0F);
            return;
        }
    }

    public final void a(int i1, int j1, int k1)
    {
        b.setUpFinalCircle(j1, i1, k1);
    }

    public final void a(Canvas canvas, float f1, float f2, float f3)
    {
        if (e != null && (b.m == 2 || b.m == 3))
        {
            f.setAlpha((int)(255F * b.n));
            canvas.drawBitmap(e, null, new Rect((int)(f1 - f3), (int)(f2 - f3), (int)(f1 + f3), (int)(f2 + f3)), f);
        }
    }

    public final void a(EditionViewerMetadata editionviewermetadata)
    {
        Map map;
        a = editionviewermetadata;
        Timber.c("EditionViewerFragment", "Binding edition %s to Fragment", new Object[] {
            editionviewermetadata
        });
        if (g == null)
        {
            return;
        }
        r.b = editionviewermetadata;
        if (editionviewermetadata.i != null)
        {
            if (editionviewermetadata.i == TU.LINKABLE_LIVE || editionviewermetadata.i == TU.LINKABLE_ARCHIVED)
            {
                if (editionviewermetadata.b == null || editionviewermetadata.c == null)
                {
                    Timber.d("EditionViewerFragment", "Attempted to bind validated but empty metadata.", new Object[0]);
                    return;
                }
            } else
            {
                if (editionviewermetadata.i == TU.LOADING)
                {
                    if (editionviewermetadata.l != 0 && editionviewermetadata.k != 0)
                    {
                        a(editionviewermetadata.l, editionviewermetadata.k, editionviewermetadata.m);
                    }
                    c = new wu();
                    g.setAdapter(c);
                    r.a();
                    return;
                }
                if (((ViewPager) (g)).mAdapter == null)
                {
                    c = new wu();
                    g.setAdapter(c);
                    r.a();
                }
                if (q.d())
                {
                    q.b("network_error");
                }
                editionviewermetadata = r;
                wn.a a1 = new wn.a(this) {

                    private SnapchatFragment a;
                    private EditionViewerFragment b;

                    public final void a()
                    {
                        Timber.a("EditionViewerFragment", "Retry clicked. Processing deep link %s again", new Object[] {
                            b.a.j
                        });
                        EditionViewerFragment.f(b).a(b.a.j, a, b.a.a);
                    }

            
            {
                b = EditionViewerFragment.this;
                a = snapchatfragment;
                super();
            }
                };
                editionviewermetadata.b();
                editionviewermetadata.h = a1;
                ((wn) (editionviewermetadata)).f.setVisibility(0);
                ((wn) (editionviewermetadata)).g.setVisibility(8);
                ((wn) (editionviewermetadata)).d.setVisibility(0);
                ((wn) (editionviewermetadata)).d.setImageResource(0x7f020216);
                ((wn) (editionviewermetadata)).d.setOnClickListener(((wn) (editionviewermetadata)).i);
                return;
            }
        }
        Object obj = r;
        Object obj1;
        if (((wn) (obj)).c.b() && ((wn) (obj)).c.c())
        {
            Timber.a("EditionLoadingStatePresenter", "Hiding Edition loading screen.", new Object[0]);
            ((wn) (obj)).d.setOnClickListener(null);
            ((wn) (obj)).a.a(((wn) (obj)).e);
            obj1 = ObjectAnimator.ofFloat(((wn) (obj)).c.a(), View.ALPHA, new float[] {
                1.0F, 0.0F
            });
            ((ObjectAnimator) (obj1)).setDuration(800L);
            ((ObjectAnimator) (obj1)).addListener(new wn._cls1(((wn) (obj))));
            ((ObjectAnimator) (obj1)).start();
        }
        k.a(editionviewermetadata.b, null);
        obj1 = k;
        obj = editionviewermetadata.c;
        if (obj != null)
        {
            Timber.c("DiscoverMediaManager", "DISCOVER-MEDIA: Fetching remote video urls for %s", new Object[] {
                obj
            });
            ((uL) (obj1)).d.a(((String) (obj)));
        }
        for (obj1 = ((uL) (obj1)).b.iterator(); ((Iterator) (obj1)).hasNext(); ((uQ)((Iterator) (obj1)).next()).a(((String) (obj)))) { }
        vJ vj;
        String s1;
        if (editionviewermetadata.d)
        {
            c = new wr(editionviewermetadata.b, editionviewermetadata.c, x);
        } else
        {
            c = new wv(editionviewermetadata.b, editionviewermetadata.c, x);
        }
        g.setAdapter(c);
        vj = o;
        s1 = editionviewermetadata.c;
        map = vj.b;
        map;
        JVM INSTR monitorenter ;
        obj1 = (vK)vj.b.get(s1);
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_597;
        }
        obj = new vK();
        vj.b.put(s1, obj);
        ((vK) (obj)).a(this, vj.e);
        map;
        JVM INSTR monitorexit ;
        obj = o;
        obj1 = a.c;
        ((vJ) (obj)).e.post(((vJ) (obj)).a(new vJ._cls7(((vJ) (obj)), ((String) (obj1)), this)));
        if (e == null && editionviewermetadata.b.e() && !ClipCircleViewGroup.h)
        {
            obj = (new JF.a()).a(editionviewermetadata.b.h()).a();
            obj1 = new JG() {

                private EditionViewerFragment a;

                public final void a(Jw jw, JF jf)
                {
                    EditionViewerFragment.a(a, jw.mBitmap);
                }

            
            {
                a = EditionViewerFragment.this;
                super();
            }
            };
            t.b(((JF) (obj)), new JG[] {
                obj1
            });
        }
        a(editionviewermetadata.l, editionviewermetadata.k, editionviewermetadata.m);
        return;
        editionviewermetadata;
        map;
        JVM INSTR monitorexit ;
        throw editionviewermetadata;
    }

    public final void a(List list)
    {
        list = new ArrayList(list);
        b(list);
        mFragmentLayout.post(new Runnable(list) {

            private List a;
            private EditionViewerFragment b;

            public final void run()
            {
                if (EditionViewerFragment.b(b) != null && EditionViewerFragment.c(b) != null)
                {
                    EditionViewerFragment.b(b).a(a);
                    int j1 = b.h();
                    if (!EditionViewerFragment.d(b) && j1 < EditionViewerFragment.b(b).c())
                    {
                        EditionViewerMetadata editionviewermetadata;
                        int i1;
                        if (b.a.f)
                        {
                            i1 = com.snapchat.android.discover.model.DSnapPage.Form.LONGFORM.getIndex();
                        } else
                        {
                            i1 = com.snapchat.android.discover.model.DSnapPage.Form.TOP_SNAP.getIndex();
                        }
                        EditionViewerFragment.c(b).setCurrentItem(j1, false);
                        EditionViewerFragment.c(b).setPanel(i1);
                        Timber.c("EditionViewerFragment", "Opening page to %d longform? %b - count: %d", new Object[] {
                            Integer.valueOf(j1), Boolean.valueOf(b.a.f), Integer.valueOf(EditionViewerFragment.b(b).c())
                        });
                        editionviewermetadata = b.a;
                        editionviewermetadata.e = null;
                        editionviewermetadata.f = false;
                        editionviewermetadata.h = false;
                        EditionViewerFragment.e(b);
                    }
                }
            }

            
            {
                b = EditionViewerFragment.this;
                a = list;
                super();
            }
        });
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BEHIND;
    }

    protected final void e()
    {
        p.b(this);
        j.a(new Mo(1));
        if (g != null)
        {
            g.a(((ViewPager) (g)).mCurItem);
        }
        if (q.d())
        {
            q.b("abandoned");
        }
    }

    public final boolean f()
    {
label0:
        {
            j.a(new Mo(1));
            if (g != null)
            {
                DiscoverEditionPageView discovereditionpageview = g.d();
                boolean flag;
                if (discovereditionpageview != null && discovereditionpageview.e())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    break label0;
                }
            }
            a(com.snapchat.android.ui.SwipeOutTracker.SwipeToExitMethod.BACK_PRESSED);
            mFragmentLayout.post(new Runnable() {

                private EditionViewerFragment a;

                public final void run()
                {
                    EditionViewerFragment.a(a).a(com.snapchat.android.ui.SwipeOutTracker.SwipeToExitMethod.BACK_PRESSED);
                }

            
            {
                a = EditionViewerFragment.this;
                super();
            }
            });
        }
        return true;
    }

    protected final Cf g()
    {
        String s1 = a.c;
        if (s1 != null)
        {
            return n.b().a(s1);
        } else
        {
            return n.b();
        }
    }

    protected final int h()
    {
        int i1;
        boolean flag;
        flag = false;
        i1 = ((flag) ? 1 : 0);
        if (a.h) goto _L2; else goto _L1
_L1:
        if (a.e == null) goto _L4; else goto _L3
_L3:
        i1 = Math.max(0, c.a(a.e));
_L2:
        return i1;
_L4:
        i1 = ((flag) ? 1 : 0);
        if (a.c == null) goto _L2; else goto _L5
_L5:
        String s1;
        Object obj;
        obj = a.c;
        s1 = m.a(((String) (obj)));
        i1 = ((flag) ? 1 : 0);
        if (m.b(((String) (obj)))) goto _L2; else goto _L6
_L6:
        i1 = ((flag) ? 1 : 0);
        if (s1 == null) goto _L2; else goto _L7
_L7:
        obj = c.d();
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = ((flag) ? 1 : 0);
        if (TextUtils.equals(((DSnapPage) (obj)).a, s1)) goto _L2; else goto _L8
_L8:
        return Math.max(0, c.a(s1));
    }

    public final boolean k_()
    {
        return true;
    }

    public final void l()
    {
        u = s.getStreamVolume(3);
    }

    public final void m()
    {
        if (a == null)
        {
            return;
        }
        a(d.i);
        Object obj = null;
        if (a.c != null)
        {
            obj = m;
            String s1 = a.c;
            obj = (List)((vA) (obj)).e.get(s1);
        }
        m.e.clear();
        s.setStreamVolume(3, u, 0);
        if (obj != null)
        {
            j.a(new wJ(a.a(), a.a, ((List) (obj))));
            return;
        } else
        {
            j.a(new wJ(a.a(), a.a));
            return;
        }
    }

    public final void m_()
    {
        super.m_();
        if (g != null)
        {
            DiscoverEditionPageView discovereditionpageview = g.d();
            if (discovereditionpageview != null)
            {
                discovereditionpageview.l();
            }
        }
    }

    public final void n()
    {
        int i1 = 0;
        static final class _cls5
        {

            static final int a[];

            static 
            {
                a = new int[com.snapchat.android.ui.SwipeOutTracker.SwipeToExitMethod.values().length];
                try
                {
                    a[com.snapchat.android.ui.SwipeOutTracker.SwipeToExitMethod.SWIPE_BEGINNING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.snapchat.android.ui.SwipeOutTracker.SwipeToExitMethod.SWIPE_END.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls5.a[d.i.ordinal()];
        JVM INSTR tableswitch 1 2: default 40
    //                   1 74
    //                   2 79;
           goto _L1 _L2 _L3
_L1:
        b.a((int)d.b, (int)d.c, i1, d.b());
        return;
_L2:
        i1 = 1;
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = 2;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void o()
    {
        if (d.a())
        {
            b.a(true);
            return;
        } else
        {
            b.f();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        j.c(this);
        bundle = null;
        Bundle bundle1 = getArguments();
        if (bundle1 != null)
        {
            bundle = (EditionViewerMetadata)bundle1.getParcelable("edition_viewer_metadata");
        }
        if (bundle == null)
        {
            bundle = (new com.snapchat.android.discover.ui.EditionViewerMetadata.a()).a();
        }
        a = bundle;
        v = false;
        x = new uz(a.a);
        p.a(this);
        t = new Jx(getActivity());
        f = new Paint();
        s = (AudioManager)c("audio");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        mFragmentLayout = layoutinflater.inflate(0x7f040060, viewgroup, false);
        b = (ClipCircleViewGroup)mFragmentLayout;
        b.a(this);
        if (!ClipCircleViewGroup.h)
        {
            layoutinflater = b;
            PG.a();
            ((ClipCircleViewGroup) (layoutinflater)).j.add(this);
        }
        g = (EditionViewerPager)d(0x7f0d0267);
        g.setSwipeOutTracker(d);
        d.a.add(this);
        r = new wn(getActivity(), mFragmentLayout);
        a(a);
        g.setBackgroundColor(a.a(getResources()));
        h = (FadeFullScreenAnimationView)d(0x7f0d0268);
        h.setColorFilter(a.a(getResources()));
        return mFragmentLayout;
    }

    public void onDestroy()
    {
        if (a.c != null)
        {
            vJ vj = o;
            String s1 = a.c;
            synchronized (vj.b)
            {
                vj.b.remove(s1);
            }
        }
        if (h != null)
        {
            i.a(h, true);
        }
        if (e != null)
        {
            i.a(e);
        }
        if (g != null)
        {
            obj = g;
            ((wt)((ViewPager) (obj)).mAdapter).a(((ViewGroup) (obj)));
            g = null;
            c = null;
        }
        j.b(this);
        super.onDestroy();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onDisplayDiscoverTapAndHoldToShareOverlayEvent(Mz mz)
    {
label0:
        {
label1:
            {
                if (g == null)
                {
                    break label0;
                }
                Object obj = g;
                mz = ((EditionViewerPager) (obj)).d();
                if (mz == null)
                {
                    Timber.d("EditionViewerPager", "currentView is Null. Can't display the overlay. EditionViewerPager: %s", new Object[] {
                        obj
                    });
                    return;
                }
                if (((DiscoverEditionPageView) (mz)).t != null)
                {
                    break label1;
                }
                obj = (ViewStub)mz.findViewById(0x7f0d029a);
                if (obj == null)
                {
                    Timber.d("DiscoverEditionPageView", "overlayStub is null. Cannot render the share overlay.", new Object[0]);
                    return;
                }
                mz.t = (LinearLayout)((ViewStub) (obj)).inflate();
                if (((DiscoverEditionPageView) (mz)).t != null)
                {
                    TextView textview = (TextView)((DiscoverEditionPageView) (mz)).t.findViewById(0x7f0d027e);
                    boolean flag;
                    if (textview == null)
                    {
                        Timber.d("DiscoverEditionPageView", "the textView for the message portion of the Overlay was null. Cannot render the overlay.", new Object[0]);
                        flag = false;
                    } else
                    {
                        if (((DiscoverEditionPageView) (mz)).u.a())
                        {
                            textview.setText(mz.getContext().getString(0x7f08010d));
                        } else
                        {
                            textview.setText(mz.getContext().getString(0x7f08010e));
                        }
                        flag = true;
                    }
                    if (flag)
                    {
                        break label1;
                    }
                }
                Timber.d("DiscoverEditionPageView", "Cannot render the share overlay.", new Object[0]);
                return;
            }
            Timber.c("DiscoverEditionPageView", "Displaying the tap and hold to save or share overlay", new Object[0]);
            ((DiscoverEditionPageView) (mz)).t.setVisibility(0);
            return;
        }
        Timber.d("EditionViewerFragment", "mPager was null. Could not display the tap to hold and share overlay.", new Object[0]);
    }

    public void onStart()
    {
        super.onStart();
        j.a(new MC());
    }

    protected void onVisible()
    {
        boolean flag = true;
        j.a(new Mo(1));
        j.a(new OC(com.snapchat.android.util.TitleBarManager.Visibility.HIDDEN));
        j.a(new NT(false));
        j.a(new Mh(CameraDisplayState.CLOSE));
        Bus bus = j;
        DiscoverEditionPageView discovereditionpageview = g.d();
        if (discovereditionpageview == null || !discovereditionpageview.g())
        {
            flag = false;
        }
        bus.a(new Og(flag));
        Jo.a(getActivity(), g);
        p.a(this);
        w = SystemClock.elapsedRealtime();
        if (g != null)
        {
            g.a(((ViewPager) (g)).mCurItem, -1);
        }
    }

    public final void p()
    {
        ClipCircleViewGroup clipcircleviewgroup = b;
        clipcircleviewgroup.a(clipcircleviewgroup.e());
    }

    public final void q()
    {
label0:
        {
            if (a != null)
            {
                EditionViewerMetadata editionviewermetadata = a;
                boolean flag;
                if (editionviewermetadata.b != null && editionviewermetadata.c != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    break label0;
                }
            }
            Timber.a("EditionViewerFragment", "Metadata, channel page, or pager was null when logging app background", new Object[0]);
            return;
        }
        a(com.snapchat.android.ui.SwipeOutTracker.SwipeToExitMethod.ENTER_BACKGROUND);
    }

    public final long r()
    {
        return 60000L;
    }

    public final EditionViewerMetadata s()
    {
        return a;
    }
}
