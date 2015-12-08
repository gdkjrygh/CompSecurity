// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;

import Bm;
import DR;
import Jk;
import Lz;
import Og;
import PB;
import SG;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.discover.analytics.DiscoverUsageAnalytics;
import com.snapchat.android.discover.model.ChannelPage;
import com.snapchat.android.discover.ui.media.DiscoverEditionPageView;
import com.snapchat.android.ui.SponsoredSlugView;
import com.snapchat.android.ui.TextureVideoView;
import com.squareup.otto.Bus;
import hl;
import kG;
import kH;
import kK;
import uL;
import uN;
import uP;
import uy;
import uz;
import vA;
import wD;
import wG;
import wy;

public class DSnapIntroVideoView extends DiscoverEditionPageView
{

    public final wD a;
    public View b;
    public TextureVideoView c;
    public SponsoredSlugView d;
    public ChannelPage e;
    public uz f;
    public wy g = new wy() {

        private DSnapIntroVideoView a;

        public final void C_()
        {
            if (DSnapIntroVideoView.a(a) != null)
            {
                DSnapIntroVideoView.a(a, com.snapchat.android.discover.analytics.DiscoverUsageAnalytics.ViewStatus.COMPLETED);
                DSnapIntroVideoView.b(a).a(true);
            }
        }

        public final void a(String s)
        {
            Timber.d("DSnapIntroVideoView", "Skipping intro video for %s because the media failed to load (%s).", new Object[] {
                DSnapIntroVideoView.e(a), s
            });
            String s1 = DSnapIntroVideoView.e(a).a;
            String s2 = DSnapIntroVideoView.e(a).d();
            com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("DISCOVER_INTRO_MEDIA_PLAYBACK_ERROR").a("publisher_name", s1).a("url", s2).a("description", s).b(false);
            C_();
            DSnapIntroVideoView.a(a, com.snapchat.android.discover.analytics.DiscoverUsageAnalytics.ViewStatus.ERROR);
        }

        public final void b()
        {
            DSnapIntroVideoView.c(a);
            DSnapIntroVideoView.d(a).setVisibility(8);
        }

            
            {
                a = DSnapIntroVideoView.this;
                super();
            }
    };
    private final uP h;
    private uN i;
    private boolean j;
    private long k;
    private boolean l;
    private com.snapchat.android.discover.analytics.DiscoverUsageAnalytics.ViewStatus m;

    public DSnapIntroVideoView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, new wD(false), Lz.a(), new uP());
    }

    protected DSnapIntroVideoView(Context context, AttributeSet attributeset, uL ul, uy uy, DiscoverUsageAnalytics discoverusageanalytics, vA va, PB pb, 
            Bus bus, wD wd, Lz lz, uP up, wG wg)
    {
        super(context, attributeset, ul, uy, discoverusageanalytics, va, lz, pb, bus, wg);
        j = false;
        k = 0L;
        l = false;
        m = com.snapchat.android.discover.analytics.DiscoverUsageAnalytics.ViewStatus.INCOMPLETE;
        a = wd;
        h = up;
    }

    private DSnapIntroVideoView(Context context, AttributeSet attributeset, wD wd, Lz lz, uP up)
    {
        super(context, attributeset);
        j = false;
        k = 0L;
        l = false;
        m = com.snapchat.android.discover.analytics.DiscoverUsageAnalytics.ViewStatus.INCOMPLETE;
        a = wd;
        h = up;
    }

    static com.snapchat.android.discover.analytics.DiscoverUsageAnalytics.ViewStatus a(DSnapIntroVideoView dsnapintrovideoview, com.snapchat.android.discover.analytics.DiscoverUsageAnalytics.ViewStatus viewstatus)
    {
        dsnapintrovideoview.m = viewstatus;
        return viewstatus;
    }

    static com.snapchat.android.discover.ui.media.DiscoverEditionPageView.a a(DSnapIntroVideoView dsnapintrovideoview)
    {
        return dsnapintrovideoview.v;
    }

    static com.snapchat.android.discover.ui.media.DiscoverEditionPageView.a b(DSnapIntroVideoView dsnapintrovideoview)
    {
        return dsnapintrovideoview.v;
    }

    static void c(DSnapIntroVideoView dsnapintrovideoview)
    {
        dsnapintrovideoview.h();
        ChannelPage channelpage = dsnapintrovideoview.e;
        dsnapintrovideoview.getResources();
        dsnapintrovideoview.i = new uN(channelpage, null, null, dsnapintrovideoview.f);
    }

    static View d(DSnapIntroVideoView dsnapintrovideoview)
    {
        return dsnapintrovideoview.b;
    }

    static ChannelPage e(DSnapIntroVideoView dsnapintrovideoview)
    {
        return dsnapintrovideoview.e;
    }

    private void h()
    {
        if (i != null)
        {
            i.c = System.currentTimeMillis();
        }
    }

    public final void B_()
    {
        super.B_();
        h();
        e = null;
        j = false;
        k = 0L;
        l = false;
        m = com.snapchat.android.discover.analytics.DiscoverUsageAnalytics.ViewStatus.INCOMPLETE;
    }

    public final void a()
    {
        if (!j)
        {
            return;
        }
        Timber.c("DSnapIntroVideoView", "Exited intro video page for channel %s", new Object[] {
            e
        });
        if (k != 0L)
        {
            if (e != null)
            {
                int i1 = c.getDuration();
                int k1 = Math.min(i1, c.getCurrentPosition());
                Object obj = r;
                long l1 = System.currentTimeMillis() - k;
                Object obj2 = m;
                String s1 = e.d();
                Object obj1 = e.d;
                String s = e.a;
                int j1 = p.d(e.d);
                com.snapchat.android.discover.model.DSnapPanel.MediaType mediatype = com.snapchat.android.discover.model.DSnapPanel.MediaType.VIDEO;
                long l2 = k1;
                long l3 = i1;
                jQ jq = f.c.getSourceType();
                if (obj2 != com.snapchat.android.discover.analytics.DiscoverUsageAnalytics.ViewStatus.ERROR)
                {
                    hl hl1 = new hl();
                    hl1.timeViewed = Double.valueOf(Jk.a(l1, 1));
                    hl1.fullView = Boolean.valueOf(((com.snapchat.android.discover.analytics.DiscoverUsageAnalytics.ViewStatus) (obj2)).wasFullView());
                    hl1.splashId = s1;
                    hl1.editionId = ((String) (obj1));
                    hl1.publisherId = s;
                    hl1.mediaType = DiscoverUsageAnalytics.a(mediatype);
                    hl1.source = jq;
                    if (l2 >= 0L)
                    {
                        hl1.mediaDisplayTimeSec = Double.valueOf(Jk.a(l2, 1));
                    }
                    if (l3 >= 0L)
                    {
                        hl1.snapTimeSec = Double.valueOf(Jk.a(l3, 1));
                    }
                    boolean flag;
                    if (j1 < 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (!flag)
                    {
                        hl1.snapIndexCount = Long.valueOf(j1);
                        hl1.snapIndexPos = Long.valueOf(0L);
                    }
                    ((DiscoverUsageAnalytics) (obj)).a.a(hl1);
                    obj2 = new kR.a();
                    obj2.mChannelName = s;
                    obj2.mEditionName = ((String) (obj1));
                    obj2.mPosition = 0;
                    obj1 = ((kR.a) (obj2)).a();
                    obj = ((DiscoverUsageAnalytics) (obj)).b;
                    s = ((kK) (obj1)).b();
                    Timber.c("AdManager", "EndAdSplash for adKey:%s, viewTime:%s ms", new Object[] {
                        s, Long.valueOf(l1)
                    });
                    l2 = ((kG) (obj)).mConfiguration.mStudySettings.a("AdManager", "ad_splash_impression_duration");
                    if (l1 >= l2)
                    {
                        ((kG) (obj)).mUIThreadHandler.post(new kG._cls2(((kG) (obj)), ((kK) (obj1)), s));
                    } else
                    {
                        Timber.c("AdManager", "endAdSplash(%s,%d) not shown long enough %d for recordImpression", new Object[] {
                            s, Long.valueOf(l1), Long.valueOf(l2)
                        });
                    }
                }
            }
            k = 0L;
        }
        a.b();
        h();
        setCanAdvance(true);
        j = false;
    }

    public final void a(int i1)
    {
        if (j)
        {
            return;
        }
        Timber.c("DSnapIntroVideoView", "Entering intro video page for channel %s", new Object[] {
            e
        });
        j = true;
        this.s.a(new Og(false));
        k = System.currentTimeMillis();
        Object obj = r;
        Object obj1 = e.l;
        java.util.Map map = e.m;
        String s = e.d;
        String s1 = e.a;
        kR.a a1 = new kR.a();
        a1.mChannelName = s1;
        a1.mEditionName = s;
        a1.mPosition = 0;
        a1.mAdUnitId = ((String) (obj1));
        a1.mTargetingParams = map;
        obj1 = a1.a();
        obj = ((DiscoverUsageAnalytics) (obj)).b;
        Timber.c("AdManager", "BeginAdSplash for adKey: ", new Object[] {
            ((kK) (obj1)).b()
        });
        ((kG) (obj)).a(((kK) (obj1)), null);
        q.a(e, null);
        if (d != null)
        {
            if (e.k)
            {
                d.setSponsoredSlugWithSponsoredChannelText();
                if (e.n != null && e.n.m())
                {
                    d.setPosAndText(e.n);
                }
                d.a(false);
                d.a();
            } else
            {
                d.b();
            }
        }
        a.c = e.g();
        a.a();
    }

    public final boolean c()
    {
        if (l)
        {
            return true;
        }
        if (e.k)
        {
            return false;
        } else
        {
            return h.a.a("DISCOVER_V2", "ALWAYS_ALLOW_SKIPPING_INTRO_VIDEO", true);
        }
    }

    public boolean canScrollVertically(int i1)
    {
        return false;
    }

    public final boolean d()
    {
        return false;
    }

    public final boolean e()
    {
        return false;
    }

    public final boolean f()
    {
        return false;
    }

    public final boolean g()
    {
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (c() && motionevent.getAction() == 1)
        {
            v.a(false);
        }
        return true;
    }

    public void setCanAdvance(boolean flag)
    {
        l = flag;
    }
}
