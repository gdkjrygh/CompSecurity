// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.ChatPerformanceAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.discover.analytics.DiscoverUsageAnalytics;
import com.snapchat.android.ui.ImageResourceView;
import com.squareup.otto.Bus;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

public class xh
    implements com.snapchat.android.ui.SnapchatResource.a, Observer, vN.a, xi
{

    private static String o = "ChatDiscoverViewingSession";
    protected final BD a;
    protected final vN b;
    protected final TextView c;
    protected final TextView d;
    protected final ImageView e;
    protected final View f;
    protected final ImageResourceView g;
    protected boolean h;
    protected vL i;
    protected int j;
    boolean k;
    protected boolean l;
    protected final ld m;
    protected final ChatPerformanceAnalytics n;
    private View p;
    private Bt q;
    private xu r;
    private String s;
    private long t;
    private Bus u;
    private Handler v;

    private xh(BD bd, vN vn, ImageResourceView imageresourceview, View view, TextView textview, TextView textview1, ImageView imageview, 
            View view1, ld ld1, ChatPerformanceAnalytics chatperformanceanalytics, Bus bus, boolean flag, Handler handler, Bt bt)
    {
        h = false;
        j = 0;
        a = bd;
        b = vn;
        p = view;
        c = textview;
        d = textview1;
        e = imageview;
        f = view1;
        g = imageresourceview;
        bd = g;
        if (this == null)
        {
            throw new NullPointerException("imageResourceLoadingCallback");
        } else
        {
            ((ImageResourceView) (bd)).b.add(this);
            m = ld1;
            n = chatperformanceanalytics;
            u = bus;
            l = flag;
            v = handler;
            q = bt;
            return;
        }
    }

    public xh(xo xo1, xu xu1, vN vn)
    {
        this((BD)xo1.a, vn, xo1.b, xu1.l, xu1.n, xu1.o, xu1.p, xu1.m, ld.a(), ChatPerformanceAnalytics.a(), Mf.a(), false, new Handler(), Bt.a());
    }

    public xh(xu xu1, vN vn)
    {
        this((BD)xu1.C, vn, xu1.r, xu1.l, xu1.n, xu1.o, xu1.p, xu1.m, ld.a(), ChatPerformanceAnalytics.a(), Mf.a(), true, new Handler(), Bt.a());
        r = xu1;
        a.addObserver(this);
        i();
    }

    static xu a(xh xh1)
    {
        return xh1.r;
    }

    private void a(boolean flag, boolean flag1)
    {
        String s1;
        String s2;
        if (j == 1)
        {
            s1 = c.getResources().getString(0x7f08001f);
        } else
        if (j == 2)
        {
            s1 = q.bS();
        } else
        {
            s1 = c.getResources().getString(0x7f080257);
        }
        if (flag)
        {
            s2 = d.getResources().getString(0x7f0802d4);
        } else
        if (flag1)
        {
            s2 = d.getResources().getString(0x7f0802d3, new Object[] {
                a.mPublisherFormalName
            });
        } else
        {
            s2 = d.getResources().getString(0x7f0802d5);
        }
        c.setText(s1);
        d.setText(s2);
    }

    static Bus b(xh xh1)
    {
        return xh1.u;
    }

    private void c()
    {
        h = false;
        if (Jo.d(e) && j())
        {
            f.setVisibility(8);
            p.setOnClickListener(new android.view.View.OnClickListener() {

                private xh a;

                public final void onClick(View view)
                {
                    xh.b(a).a(new My(a.a, xh.a(a), false, a));
                }

            
            {
                a = xh.this;
                super();
            }
            });
            p.setOnLongClickListener(new android.view.View.OnLongClickListener() {

                private xh a;

                public final boolean onLongClick(View view)
                {
                    if (xh.a(a) != null)
                    {
                        xh.b(a).a(new My(a.a, xh.a(a)));
                    }
                    return true;
                }

            
            {
                a = xh.this;
                super();
            }
            });
            if (r != null)
            {
                xu xu1 = r;
                xu1.n.setVisibility(0);
                xu1.o.setVisibility(0);
            }
        }
    }

    private void f()
    {
        h = false;
        if (k)
        {
            v.postDelayed(new Runnable() {

                private xh a;

                public final void run()
                {
                    a.i();
                }

            
            {
                a = xh.this;
                super();
            }
            }, 3000L);
        }
    }

    static String l()
    {
        return o;
    }

    public void a()
    {
        Timber.a(o, (new StringBuilder("Entered viewing session for Discover snap ")).append(a.d()).toString(), new Object[0]);
        k = true;
        t = SystemClock.elapsedRealtime();
    }

    public final void a(com.snapchat.android.ui.SnapchatResource.ResourceStatus resourcestatus)
    {
        if (resourcestatus == com.snapchat.android.ui.SnapchatResource.ResourceStatus.LOADED)
        {
            p.setVisibility(0);
        }
    }

    public final void a(vL vl, String s1)
    {
        boolean flag;
        if (s1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Timber.a(o, (new StringBuilder("Link status determined for Discover snap ")).append(a.d()).append(": ").append(vl).append(" isPublisherAvailable: ").append(flag).toString(), new Object[0]);
        if (!j()) goto _L2; else goto _L1
_L1:
        Timber.a(o, "Link status already successfully determined", new Object[0]);
_L9:
        return;
_L2:
        i = vl;
        s = s1;
        s1 = vl.mLinkStatus;
        j = vl.mAdType;
        static final class _cls5
        {

            static final int a[];

            static 
            {
                a = new int[TU.values().length];
                try
                {
                    a[TU.LINKABLE_LIVE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[TU.LINKABLE_ARCHIVED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[TU.NOT_LINKABLE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[TU.FAILED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls5.a[s1.ordinal()];
        JVM INSTR tableswitch 1 4: default 148
    //                   1 160
    //                   2 167
    //                   3 174
    //                   4 183;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_183;
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L10:
        if (s1 != TU.FAILED)
        {
            c();
            return;
        }
        if (true) goto _L9; else goto _L8
_L8:
        d();
          goto _L10
_L5:
        e();
          goto _L10
_L6:
        a(false, flag);
          goto _L10
        f();
          goto _L10
    }

    public final void a(boolean flag)
    {
        Timber.a(o, (new StringBuilder("Brand icon loaded for for Discover snap ")).append(a.d()).append(": brandIconLoadSuccess: ").append(flag).toString(), new Object[0]);
        if (Jo.d(e))
        {
            Timber.a(o, "Brand icon already loaded and showing", new Object[0]);
            return;
        }
        n.a(a.d(), flag, false);
        if (flag)
        {
            e.setVisibility(0);
            c();
            return;
        } else
        {
            f();
            return;
        }
    }

    public void b()
    {
        Timber.a(o, (new StringBuilder("Cleaning up viewing session for Discover snap ")).append(a.d()).toString(), new Object[0]);
        if (a.ak()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        vN vn;
        vO vo;
        if (i == null)
        {
            obj = null;
        } else
        {
            obj = i.mLinkStatus;
        }
        obj1 = Double.valueOf(Jk.a(SystemClock.elapsedRealtime() - t, 1));
        if (j != 1 || TextUtils.isEmpty(a.mAdId)) goto _L4; else goto _L3
_L3:
        m.b(a, j(), ((Double) (obj1)), ((TU) (obj)), null);
_L2:
        if (!Jo.d(e))
        {
            n.a(a.d(), false, true);
        }
        k = false;
        a.deleteObserver(this);
        vn = b;
        obj1 = a.d();
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        obj = vn.h;
        obj;
        JVM INSTR monitorenter ;
        Timber.a("DiscoverDeepLinkController", (new StringBuilder("DISCOVER-LINK: Cancelling link status ")).append(((String) (obj1))).toString(), new Object[0]);
        vn.i.remove(obj1);
        obj1 = (vO.a)vn.j.remove(obj1);
        vo = vn.c;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        synchronized (vo.a)
        {
            vo.b.remove(obj1);
            vo.c.remove(obj1);
        }
        obj;
        JVM INSTR monitorexit ;
_L6:
        h = false;
        i = null;
        s = null;
        return;
_L4:
        if (!TextUtils.isEmpty(a.mDSnapId))
        {
            m.a(a, j(), ((Double) (obj1)), ((TU) (obj)), null);
        }
        if (true) goto _L2; else goto _L7
_L7:
        exception;
        obj2;
        JVM INSTR monitorexit ;
        throw exception;
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    protected void d()
    {
        boolean flag;
        if (j != 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag, true);
    }

    protected void e()
    {
        boolean flag;
        if (j != 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag, true);
    }

    public final String g()
    {
        return a.d();
    }

    public final boolean h()
    {
        return k;
    }

    protected final void i()
    {
        PG.a(new Runnable(this) {

            private xh a;
            private xh b;

            public final void run()
            {
                if (b.h)
                {
                    Timber.a(xh.l(), (new StringBuilder("Load link status already loading ")).append(b.g()).toString(), new Object[0]);
                    return;
                }
                if (Jo.d(b.e)) goto _L2; else goto _L1
_L1:
                Object obj;
                String s2;
                Object obj2;
                String s3;
                String s4;
                String s5;
                Object obj3;
                xh xh1;
                obj = b.n;
                ((ChatPerformanceAnalytics) (obj)).a("DISCOVER_SHARE_BAR_ICON_LOAD", b.a.d(), com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("DISCOVER_SHARE_BAR_ICON_LOAD").a("reachability", ((ChatPerformanceAnalytics) (obj)).mNetworkStatusManager.f()).b());
                String s1;
                if (b.g.d())
                {
                    b.f.setVisibility(0);
                } else
                {
                    b.f.setVisibility(8);
                }
                s1 = b.a.mPublisherInternationalName;
                obj = s1;
                if (s1 == null)
                {
                    obj = b.a.mPublisherName;
                }
                if (obj == null) goto _L4; else goto _L3
_L3:
                Timber.a(xh.l(), (new StringBuilder("Loading link status for Discover snap ")).append(b.g()).append(" with publisher name ").append(((String) (obj))).toString(), new Object[0]);
                b.h = true;
                obj2 = b.b;
                s2 = b.a.d();
                obj3 = b.e;
                s3 = b.a.mPublisherName;
                s4 = b.a.mEditionId;
                s5 = b.a.mDSnapId;
                xh1 = a;
                if (s2 != null && obj3 != null && obj != null && s5 != null && s4 != null) goto _L6; else goto _L5
_L5:
                b.a.deleteObserver(a);
                return;
_L6:
                Object obj1 = ((vN) (obj2)).h;
                obj1;
                JVM INSTR monitorenter ;
                if (!((vN) (obj2)).m)
                {
                    ((vN) (obj2)).b.a(new ME());
                    obj2.m = true;
                }
                Timber.a("DiscoverDeepLinkController", "DISCOVER-LINK: %s start loading status and icon %s", new Object[] {
                    s2, obj
                });
                vN.c c1 = new vN.c();
                c1.e = xh1;
                ((vN) (obj2)).i.put(s2, c1);
                obj3 = new vN._cls1(((vN) (obj2)), s2, ((String) (obj)), ((ImageView) (obj3)));
                ((vN) (obj2)).j.put(s2, obj3);
                ((vN) (obj2)).c.a(((vO.a) (obj3)));
                ((vN) (obj2)).d.a(((vN) (obj2)).d.b().a(s3));
                if (!((vN) (obj2)).k.containsKey(s5))
                {
                    break MISSING_BLOCK_LABEL_572;
                }
                Timber.a("DiscoverDeepLinkController", "DISCOVER-LINK: %s - Using cached link status for %s - %s - %s", new Object[] {
                    s2, obj, s4, s5
                });
                obj = (vN.c)((vN) (obj2)).k.get(s5);
                ((vN) (obj2)).a(s2, ((vN.c) (obj)).d.mPublisherInternationalName, ((vN.c) (obj)).c);
                ((vN) (obj2)).a(s2, ((vN.c) (obj)).d);
_L7:
                continue; /* Loop/switch isn't completed */
                obj;
                obj1;
                JVM INSTR monitorexit ;
                throw obj;
                obj = new uK(s2, s5, s4, ((String) (obj)), ((vN) (obj2)).n, null);
                obj2 = ((vN) (obj2)).l;
                ((ChatPerformanceAnalytics) (obj2)).a("DISCOVER_SHARE_LINK_VALIDATION", s2, com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("DISCOVER_SHARE_LINK_VALIDATION").a("reachability", ((ChatPerformanceAnalytics) (obj2)).mNetworkStatusManager.f()).b());
                ((uK) (obj)).execute();
                if (true) goto _L7; else goto _L4
_L4:
                Timber.a(xh.l(), (new StringBuilder("Loading link status for Discover snap ")).append(b.g()).append(" but no publisher name yet").toString(), new Object[0]);
                return;
_L2:
                Timber.a(xh.l(), (new StringBuilder("Loading link status and icon for Discover snap ")).append(b.g()).append(" but already loaded").toString(), new Object[0]);
                return;
                if (true) goto _L5; else goto _L8
_L8:
            }

            
            {
                b = xh.this;
                a = xh2;
                super();
            }
        });
    }

    protected final boolean j()
    {
        return i != null && i.mLinkStatus != TU.FAILED;
    }

    public final void k()
    {
        String s1 = null;
        vN vn = b;
        vL vl = i;
        boolean flag = a.mLinkToLongform;
        String s3 = s;
        Object obj = vl.mLinkStatus;
        if (obj == TU.FAILED)
        {
            Timber.d("DiscoverDeepLinkController", "Trying to go back to Discover when linking failed!", new Object[0]);
            return;
        }
        String s2;
        DiscoverUsageAnalytics discoverusageanalytics;
        String s4;
        String s5;
        hg hg1;
        if (vl.mAdType != 1 && (obj == TU.LINKABLE_ARCHIVED || obj == TU.LINKABLE_LIVE))
        {
            s2 = vl.mDSnapId;
            s1 = vl.mEditionId;
        } else
        {
            s2 = null;
        }
        if (s2 == null)
        {
            flag = false;
        }
        Timber.a("DiscoverDeepLinkController", "DISCOVER-LINK: Going to Discover! Publisher: %s Edition: %s DSnap: %s", new Object[] {
            vl.mPublisherInternationalName, s1, s2
        });
        if (s2 != null)
        {
            if (flag)
            {
                obj = hQ.LONG_FORM;
            } else
            {
                obj = hQ.TOP_SNAP;
            }
        } else
        if (s3 != null)
        {
            obj = hQ.SPLASH;
        } else
        {
            obj = hQ.HOME;
        }
        discoverusageanalytics = vn.e;
        s4 = vl.mEditionId;
        s5 = vl.mDSnapId;
        hg1 = new hg();
        if (s3 != null)
        {
            hg1.publisherId = s3;
        }
        if (s5 != null)
        {
            hg1.dsnapId = s5;
        }
        hg1.editionId = s4;
        hg1.pageSection = ((hQ) (obj));
        discoverusageanalytics.a.a(hg1);
        vn.b.a(new wM(vl.mPublisherInternationalName, s1, s2, flag));
    }

    public void update(Observable observable, Object obj)
    {
        if (observable == a)
        {
            i();
        }
    }

}
