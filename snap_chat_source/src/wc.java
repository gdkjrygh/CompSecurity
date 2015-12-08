// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.brightcove.player.view.BrightcoveTextureVideoView;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.discover.analytics.DiscoverUsageAnalytics;
import com.snapchat.android.discover.model.DSnapPage;
import com.snapchat.android.discover.model.DSnapPanel;
import com.snapchat.android.discover.ui.DSnapView;
import com.snapchat.android.discover.ui.media.DiscoverMediaController;
import com.snapchat.android.ui.RotateLayout;
import com.snapchat.android.ui.VerticalSwipeLayout;
import com.squareup.otto.Bus;
import java.util.Map;

public final class wc extends we
    implements com.snapchat.android.ui.VerticalSwipeLayout.a
{

    final Map a;
    String b;
    VerticalSwipeLayout c;
    private final LayoutInflater f;
    private final vY g;
    private final Bus h;
    private final View i;
    private RotateLayout j;
    private DSnapView k;
    private DSnapPage l;
    private long m;
    private boolean n;
    private android.view.View.OnClickListener o = new android.view.View.OnClickListener() {

        private wc a;

        public final void onClick(View view1)
        {
            a.l();
        }

            
            {
                a = wc.this;
                super();
            }
    };

    public wc(Context context, wd wd)
    {
        LayoutInflater layoutinflater = (LayoutInflater)context.getSystemService("layout_inflater");
        vY vy = new vY(context);
        Bus bus = Mf.a();
        new PB();
        this(wd, layoutinflater, vy, bus, new View(context));
    }

    private wc(wd wd, LayoutInflater layoutinflater, vY vy, Bus bus, View view)
    {
        super(wd);
        a = ep.a();
        m = 0L;
        n = false;
        f = layoutinflater;
        g = vy;
        h = bus;
        i = view;
        p = new wy() {

            private wc a;

            public final void C_()
            {
                a.l();
                a.a.put(a.b, Integer.valueOf(0));
            }

            public final void a(String s)
            {
            }

            public final void b()
            {
            }

            
            {
                a = wc.this;
                super();
            }
        };
    }

    public final void a(int i1, int j1, int k1)
    {
        if (i1 == 2 && k1 == 0)
        {
            l();
        }
    }

    public final void a(DSnapPage dsnappage, DSnapPanel dsnappanel)
    {
        super.a(dsnappage, dsnappanel);
        l = dsnappage;
    }

    public final boolean a(MotionEvent motionevent)
    {
        return g.a(motionevent);
    }

    public final boolean a(DSnapView dsnapview, DSnapPage dsnappage, DSnapPanel dsnappanel)
    {
        if (!super.a(dsnapview, dsnappage, dsnappanel))
        {
            return false;
        } else
        {
            k = dsnapview;
            h.c(this);
            l = dsnappage;
            d = f.inflate(0x7f04006e, null);
            e = (FrameLayout)d.findViewById(0x7f0d02a8);
            c = (VerticalSwipeLayout)d.findViewById(0x7f0d0295);
            c.a(this);
            j = (RotateLayout)f.inflate(0x7f04006d, null);
            c.addView(i);
            c.addView(j);
            g.l = true;
            dsnappanel = g;
            dsnappanel.o = o;
            ((vY) (dsnappanel)).a.setCloseSignOnClickListener(((vY) (dsnappanel)).o);
            g.a(j, dsnapview, dsnappage);
            g.a(p);
            c.setVisibility(8);
            n = false;
            return true;
        }
    }

    public final void a_(int i1)
    {
        boolean flag = true;
        if (i1 != 1)
        {
            flag = false;
        }
        c.setScrollableInBothDirections(flag);
        if (n)
        {
            g.a_(i1);
        }
    }

    public final void b(int i1, int j1, int k1)
    {
    }

    public final void b_(int i1)
    {
        if (i1 == 0)
        {
            c.setVisibility(8);
        } else
        if (i1 == 1 && !n)
        {
            g.z_();
            n = true;
            m = System.currentTimeMillis();
            return;
        }
    }

    public final void c()
    {
        Timber.c("DSnapItemVideoPlayerAdapterDecorator", "Leaving the inline video view.", new Object[0]);
        super.c();
        l();
        a.clear();
    }

    public final void d()
    {
        super.d();
        h.b(this);
    }

    public final boolean g()
    {
        return n;
    }

    public final void j()
    {
        Timber.c("DSnapItemVideoPlayerAdapterDecorator", "hiddenFromPause called, hiding any visible video views.", new Object[0]);
        super.c();
        l();
    }

    public final void k()
    {
        l();
    }

    final void l()
    {
        if (n)
        {
            long l1 = g.f();
            long l2 = g.e();
            int i1 = g.e.getCurrentPosition();
            a.put(b, Integer.valueOf(i1));
            g.c();
            n = false;
            Object obj = k;
            String s = b;
            long l3 = System.currentTimeMillis() - m;
            if (((DSnapView) (obj)).h == null)
            {
                Timber.e("DSnapView", "onInlineVideoViewed called when DSnap is null", new Object[0]);
            } else
            {
                obj.n = ((DSnapView) (obj)).n + 1;
                obj.o = ((DSnapView) (obj)).o + l3;
                Timber.c("DSnapView", "Inline video view recorded. num inline videos viewed: %d, total time: %dms", new Object[] {
                    Integer.valueOf(((DSnapView) (obj)).n), Long.valueOf(((DSnapView) (obj)).o)
                });
                DiscoverUsageAnalytics discoverusageanalytics = ((DSnapView) (obj)).r;
                String s1 = ((DSnapView) (obj)).h.a;
                String s2 = ((DSnapView) (obj)).h.j;
                String s3 = ((DSnapView) (obj)).h.i;
                int j1 = ((DSnapView) (obj)).h.h.intValue();
                int k1 = ((DSnapView) (obj)).p.d(((DSnapView) (obj)).h.i);
                double d1 = Jk.a(l3, 1);
                double d2 = Jk.a(l2, 1);
                double d3 = Jk.a(l1, 1);
                obj = new gV();
                obj.inlineVideoId = s;
                obj.dsnapId = s1;
                obj.publisherId = s2;
                obj.editionId = s3;
                obj.timeViewed = Double.valueOf(d1);
                obj.mediaDisplayTimeSec = Double.valueOf(d2);
                obj.mediaTotalTimeSec = Double.valueOf(d3);
                obj.snapIndexCount = Long.valueOf(k1);
                obj.snapIndexPos = Long.valueOf(j1 + 1);
                discoverusageanalytics.a.a(((kl) (obj)));
            }
            c.post(new Runnable() {

                private wc a;

                public final void run()
                {
                    a.c.a(0, 1.0D);
                }

            
            {
                a = wc.this;
                super();
            }
            });
        }
    }

    public final boolean o()
    {
        return n;
    }

    public final void onPlayRemoteVideoRequestEvent(Nr nr)
    {
        if (!nr.mDSnapPageId.equals(l.a))
        {
            Timber.b("DSnapItemVideoPlayerAdapterDecorator", "Page with Id %s requested the video, while this decorator represents page %s. Ignoring request to play video", new Object[] {
                nr.mDSnapPageId, l
            });
        } else
        {
            nr = nr.mVideoId;
            Timber.b("DSnapItemVideoPlayerAdapterDecorator", "Received request for video playback with id: %s", new Object[] {
                nr
            });
            if (j == null)
            {
                Timber.d("DSnapItemVideoPlayerAdapterDecorator", "The video view is null. Not playing the inline video %s", new Object[] {
                    nr
                });
                return;
            }
            if (!n)
            {
                Object obj = (Integer)a.get(nr);
                int i1;
                if (obj == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = ((Integer) (obj)).intValue();
                }
                obj = g;
                i1 = Integer.valueOf(i1).intValue();
                Timber.c("DSnapItemRemoteVideoAdapter", "Setting start position to %dms", new Object[] {
                    Integer.valueOf(i1)
                });
                obj.m = i1;
                g.j = nr;
                c.setVisibility(0);
                c.post(new Runnable() {

                    private wc a;

                    public final void run()
                    {
                        a.c.a(1, 1.0D);
                    }

            
            {
                a = wc.this;
                super();
            }
                });
                b = nr;
                return;
            }
        }
    }
}
