// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.deeplink;

import Bj;
import Br;
import Er;
import Ew;
import Ex;
import Ey;
import Ez;
import Mf;
import Mw;
import Ni;
import OH;
import PB;
import PG;
import QW;
import Rv;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.controller.stories.StoryLoadingContext;
import com.snapchat.android.model.StoryCollection;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import dv;
import eB;
import en;
import gs;
import jY;
import jZ;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;
import ki;
import org.apache.commons.lang3.StringUtils;
import sX;
import sZ;
import ta;
import tb;
import up;

public final class StoriesDeepLinkProcessor extends up
    implements Ex, Ey.a, Ez.b
{
    public static final class StoryRetryableBreakPoint extends Enum
    {

        private static final StoryRetryableBreakPoint $VALUES[];
        public static final StoryRetryableBreakPoint GETTING_METADATA_ERROR;
        public static final StoryRetryableBreakPoint PREFETCH_ERROR;
        public static final StoryRetryableBreakPoint UNKNOWN;

        public static StoryRetryableBreakPoint valueOf(String s)
        {
            return (StoryRetryableBreakPoint)Enum.valueOf(com/snapchat/android/stories/deeplink/StoriesDeepLinkProcessor$StoryRetryableBreakPoint, s);
        }

        public static StoryRetryableBreakPoint[] values()
        {
            return (StoryRetryableBreakPoint[])$VALUES.clone();
        }

        static 
        {
            GETTING_METADATA_ERROR = new StoryRetryableBreakPoint("GETTING_METADATA_ERROR", 0);
            PREFETCH_ERROR = new StoryRetryableBreakPoint("PREFETCH_ERROR", 1);
            UNKNOWN = new StoryRetryableBreakPoint("UNKNOWN", 2);
            $VALUES = (new StoryRetryableBreakPoint[] {
                GETTING_METADATA_ERROR, PREFETCH_ERROR, UNKNOWN
            });
        }

        private StoryRetryableBreakPoint(String s, int i1)
        {
            super(s, i1);
        }
    }


    private static final StoryLoadingContext b;
    private final Er c;
    private final sX d;
    private final Bj e;
    private final Provider f;
    private final Bus g;
    private final Ey h;
    private final Ew i;
    private final ta j;
    private StoryRetryableBreakPoint k;
    private Uri l;
    private Uri m;
    private long n;
    private MediaOpenOrigin o;
    private long p;
    private boolean q;
    private String r;

    public StoriesDeepLinkProcessor()
    {
        Er er = Er.a();
        sX sx = sX.a();
        Bj bj = Bj.a();
        Provider provider = Br.UNSAFE_USER_PROVIDER;
        new Ez.a();
        Bus bus = Mf.a();
        Ey ey = new Ey();
        Ew ew = Ew.a();
        new tb();
        new PB();
        this(er, sx, bj, provider, bus, ey, ew, new ta());
    }

    private StoriesDeepLinkProcessor(Er er, sX sx, Bj bj, Provider provider, Bus bus, Ey ey, Ew ew, 
            ta ta1)
    {
        p = 0L;
        q = false;
        r = "";
        c = er;
        d = sx;
        e = bj;
        f = provider;
        g = bus;
        h = ey;
        i = ew;
        j = ta1;
        g.c(this);
    }

    static MediaOpenOrigin a(StoriesDeepLinkProcessor storiesdeeplinkprocessor)
    {
        return storiesdeeplinkprocessor.o;
    }

    static String a(StoriesDeepLinkProcessor storiesdeeplinkprocessor, String s)
    {
        storiesdeeplinkprocessor.r = s;
        return s;
    }

    private void a(Uri uri, long l1)
    {
        if (uri == null)
        {
            return;
        } else
        {
            String s = uri.getQueryParameter("username");
            uri = uri.getQueryParameter("shared_id");
            Timber.c("StoriesDeepLinkProcessor", "executeDeepLinkUrl shared_id: %s, task_id: %d", new Object[] {
                uri, Long.valueOf(l1)
            });
            (new Ez(uri, s, l1, this)).execute();
            return;
        }
    }

    private void a(StoryCollection storycollection)
    {
        sZ sz = ta.a(storycollection.i(), storycollection, false, o);
        if (sz.t_())
        {
            a(sz);
            return;
        } else
        {
            Timber.c("StoriesDeepLinkProcessor", "hasn't got enough snaps to play", new Object[0]);
            k = StoryRetryableBreakPoint.PREFETCH_ERROR;
            a(1, storycollection.mUsername, "network_error");
            return;
        }
    }

    private void a(String s, String s1)
    {
        long l1 = SystemClock.elapsedRealtime() - n;
        if (b == StoryLoadingContext.EXTERNAL)
        {
            EasyMetric easymetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("STORY_LIVE_DEEP_LINK_WAIT_TIME");
            easymetric.a("poster_id", s);
            easymetric.a("result", s1);
            easymetric.a(l1);
            easymetric.a(false);
        }
        Timber.c("StoriesDeepLinkProcessor", "report wait time: posterId: %s, result: %s, durationMs: %d", new Object[] {
            s, s1, Long.valueOf(l1)
        });
    }

    private boolean a(String s, long l1)
    {
        StoryCollection storycollection = e.c(s);
        if (storycollection != null && !storycollection.n())
        {
            Timber.a("StoriesDeepLinkProcessor", "Cannot process friend story %s, only live stories allowed.", new Object[] {
                s
            });
            a(0, s, "invalid");
            return false;
        }
        if (storycollection != null)
        {
            Timber.c("StoriesDeepLinkProcessor", "fetch metadata complete", new Object[0]);
            Timber.c("StoriesDeepLinkProcessor", "prefetching live stories", new Object[0]);
            q = false;
            r = "";
            PG.a(new Runnable(storycollection, l1) {

                private StoryCollection a;
                private long b;
                private StoriesDeepLinkProcessor c;

                public final void run()
                {
                    sZ sz;
label0:
                    {
                        StoriesDeepLinkProcessor.b(c);
                        sz = ta.a(a.i(), a, false, StoriesDeepLinkProcessor.a(c));
                        int i1 = StoriesDeepLinkProcessor.c(c).a(sz, StoriesDeepLinkProcessor.c(c).c(), null, 0, false, StoryLoadingContext.EXTERNAL, b);
                        Timber.c("StoriesDeepLinkProcessor", "number of snaps in loading is: %d", new Object[] {
                            Integer.valueOf(i1)
                        });
                        if (i1 == 0)
                        {
                            if (!sz.l())
                            {
                                break label0;
                            }
                            Timber.c("StoriesDeepLinkProcessor", "Snaps are loading by other tasks", new Object[0]);
                            StoriesDeepLinkProcessor.d(c);
                            StoriesDeepLinkProcessor.a(c, a.mUsername);
                        }
                        return;
                    }
                    if (sz.t_())
                    {
                        c.a(sz);
                        return;
                    } else
                    {
                        c.a(0, a.mUsername, "unknown");
                        return;
                    }
                }

            
            {
                c = StoriesDeepLinkProcessor.this;
                a = storycollection;
                b = l1;
                super();
            }
            });
            return true;
        } else
        {
            Timber.c("StoriesDeepLinkProcessor", "story no longer available for viewing", new Object[0]);
            a(0, s, "expired");
            return false;
        }
    }

    static ta b(StoriesDeepLinkProcessor storiesdeeplinkprocessor)
    {
        return storiesdeeplinkprocessor.j;
    }

    static sX c(StoriesDeepLinkProcessor storiesdeeplinkprocessor)
    {
        return storiesdeeplinkprocessor.d;
    }

    static boolean d(StoriesDeepLinkProcessor storiesdeeplinkprocessor)
    {
        storiesdeeplinkprocessor.q = true;
        return true;
    }

    public final int a(Uri uri, MediaOpenOrigin mediaopenorigin)
    {
        return 3;
    }

    public final gs a()
    {
        return gs.STORY_LIVE;
    }

    protected final void a(int i1, String s, String s1)
    {
        a(s, s1);
        switch (i1)
        {
        default:
            return;

        case 1: // '\001'
            h.a(this);
            return;

        case 0: // '\0'
            s = h;
            PG.a(new Ey._cls3(s, s, this));
            return;
        }
    }

    public final void a(Rv rv, String s, long l1)
    {
        if (p == l1)
        {
            Timber.c("StoriesDeepLinkProcessor", "get metadata success, task id: %d", new Object[] {
                Long.valueOf(l1)
            });
            Object obj = h;
            obj.f = rv.b();
            PG.a(new Ey._cls4(((Ey) (obj)), ((Ey) (obj)), this));
            Bj bj = e;
            obj = (new QW()).a(rv.a()).a(rv.i()).a(rv.h()).a(rv.g()).b(rv.e());
            if (((QW) (obj)).b().size() == 0)
            {
                obj = null;
            } else
            {
                obj = en.a(new QW[] {
                    obj
                });
            }
            bj.a(((List) (obj)), true, true);
            obj = e.c(s);
            if (obj != null)
            {
                obj.mLiveDisplayName = rv.b();
            }
            g.a(new Mw(s));
            a(s, l1);
            return;
        } else
        {
            Timber.c("StoriesDeepLinkProcessor", "the task was cancelled before onSuccess", new Object[0]);
            return;
        }
    }

    public final void a(Rv rv, String s, long l1, String s1, int i1)
    {
        if (p == l1)
        {
            Object obj;
            if (rv == null)
            {
                obj = "null";
            } else
            {
                obj = rv.toString();
            }
            Timber.c("StoriesDeepLinkProcessor", "errorMsg: %s, statusCode: %d, response: %s", new Object[] {
                s1, Integer.valueOf(i1), obj
            });
            if (rv == null)
            {
                Timber.c("StoriesDeepLinkProcessor", "ERROR MSG: %s", new Object[] {
                    s1
                });
                k = StoryRetryableBreakPoint.GETTING_METADATA_ERROR;
                a(1, s, "network_error");
            } else
            {
                a(0, s, s1);
            }
            if (TextUtils.equals(s1, "expired"))
            {
                s1 = i;
                obj = jY.EXPIRED;
                ki ki1 = ki.OUR;
                boolean flag;
                if (rv.f() == null)
                {
                    flag = false;
                } else
                {
                    flag = rv.f().booleanValue();
                }
                rv = new jZ();
                rv.denyReason = ((jY) (obj));
                rv.posterId = s;
                rv.storyType = ki1;
                if (flag)
                {
                    rv.geoFence = "LOCAL";
                }
                ((Ew) (s1)).a.a(rv);
            }
            return;
        } else
        {
            Timber.c("StoriesDeepLinkProcessor", "the task was cancelled before onFail", new Object[0]);
            return;
        }
    }

    public final void a(Uri uri, SnapchatFragment snapchatfragment, MediaOpenOrigin mediaopenorigin)
    {
        o = mediaopenorigin;
        n = SystemClock.elapsedRealtime();
        h.a(this);
        l = uri;
        p = System.currentTimeMillis();
        if (f.get() == null || !((Br)f.get()).mInitialized)
        {
            Timber.a("StoriesDeepLinkProcessor", "User not ready. Delay processing deep link.", new Object[0]);
            m = uri;
            return;
        } else
        {
            a(uri, p);
            m = null;
            return;
        }
    }

    public final void a(sZ sz)
    {
        a(((StoryCollection)dv.a(sz.u_())).mUsername, "success");
        c.a(sz, null);
    }

    public final boolean a(Uri uri)
    {
        if (uri.getPathSegments().equals(en.a(new String[] {
    "live"
})) && uri.getQueryParameterNames().equals(eB.a(new String[] {
    "shared_id", "username"
})))
        {
            String s = uri.getQueryParameter("username");
            uri = uri.getQueryParameter("shared_id");
            if (!StringUtils.isBlank(s) && !StringUtils.isBlank(uri))
            {
                return true;
            }
        }
        return false;
    }

    public final void b()
    {
        Timber.c("StoriesDeepLinkProcessor", "Dismiss loading screen", new Object[0]);
        p = 0L;
        if (h.g)
        {
            a(l.getQueryParameter("username"), "abandoned");
        }
    }

    public final void d()
    {
        n = SystemClock.elapsedRealtime();
        if (k == null) goto _L2; else goto _L1
_L1:
        Timber.c("StoriesDeepLinkProcessor", "onRetry: %s", new Object[] {
            k.name()
        });
        static final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[StoryRetryableBreakPoint.values().length];
                try
                {
                    a[StoryRetryableBreakPoint.GETTING_METADATA_ERROR.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[StoryRetryableBreakPoint.PREFETCH_ERROR.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.a[k.ordinal()];
        JVM INSTR tableswitch 1 2: default 68
    //                   1 69
    //                   2 87;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        k = null;
        a(l, p);
        return;
_L4:
        k = null;
        a(l.getQueryParameter("username"), p);
        return;
    }

    public final void onLoadStoryMediaCompleteEvent(Ni ni)
    {
        StoryCollection storycollection = ni.mStoryCollection;
        if (storycollection == null) goto _L2; else goto _L1
_L1:
        if (ni.mStoryLoadingContext != StoryLoadingContext.EXTERNAL) goto _L4; else goto _L3
_L3:
        if (ni.mTaskId != p) goto _L6; else goto _L5
_L5:
        a(storycollection);
_L2:
        return;
_L6:
        Timber.c("StoriesDeepLinkProcessor", "the task was cancelled before onComplete", new Object[0]);
        return;
_L4:
        if (q && r.equals(storycollection.mUsername))
        {
            Timber.c("StoriesDeepLinkProcessor", "launch story view since snap loaded by other task", new Object[0]);
            a(storycollection);
            r = "";
            return;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    public final void onUserLoadedEvent(OH oh)
    {
        a(m, p);
        m = null;
    }

    static 
    {
        b = StoryLoadingContext.EXTERNAL;
    }
}
