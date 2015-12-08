// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Aa;
import Ab;
import Bt;
import Cl;
import De;
import Ei;
import IO;
import PB;
import PG;
import Ul;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class FindNearbyFriendsWorker
{
    public static final class InterruptReason extends Enum
    {

        private static final InterruptReason $VALUES[];
        public static final InterruptReason ERROR;
        public static final InterruptReason INITIAL_PROMPT;
        public static final InterruptReason INTENTIONAL;
        public static final InterruptReason LOCATION_ERROR;
        public static final InterruptReason LOCATION_PERMISSIONS;
        public static final InterruptReason NO_INTERNET_CONNECTION;

        public static InterruptReason valueOf(String s)
        {
            return (InterruptReason)Enum.valueOf(com/snapchat/android/fragments/addfriends/FindNearbyFriendsWorker$InterruptReason, s);
        }

        public static InterruptReason[] values()
        {
            return (InterruptReason[])$VALUES.clone();
        }

        static 
        {
            LOCATION_PERMISSIONS = new InterruptReason("LOCATION_PERMISSIONS", 0);
            INITIAL_PROMPT = new InterruptReason("INITIAL_PROMPT", 1);
            LOCATION_ERROR = new InterruptReason("LOCATION_ERROR", 2);
            ERROR = new InterruptReason("ERROR", 3);
            INTENTIONAL = new InterruptReason("INTENTIONAL", 4);
            NO_INTERNET_CONNECTION = new InterruptReason("NO_INTERNET_CONNECTION", 5);
            $VALUES = (new InterruptReason[] {
                LOCATION_PERMISSIONS, INITIAL_PROMPT, LOCATION_ERROR, ERROR, INTENTIONAL, NO_INTERNET_CONNECTION
            });
        }

        private InterruptReason(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static interface a
    {

        public abstract void a(InterruptReason interruptreason);

        public abstract void a(List list);

        public abstract void t();

        public abstract void u();
    }


    private static final long a;
    private static final long b;
    private static final long c;
    private Context d;
    private a e;
    private Ab f;
    private Handler g;
    private Ei h;
    private Cl i;
    private PB j;
    private boolean k;
    private int l;
    private long m;
    private boolean n;
    private float o;
    private long p;

    public FindNearbyFriendsWorker(Context context, a a1)
    {
        Handler handler = new Handler(Looper.getMainLooper());
        new Aa();
        Ab ab = Ab.a();
        Ei ei = Ei.a();
        Cl cl = Cl.a();
        PB pb = new PB();
        Bt.a();
        new com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory();
        this(context, a1, handler, ab, ei, cl, pb);
    }

    private FindNearbyFriendsWorker(Context context, a a1, Handler handler, Ab ab, Ei ei, Cl cl, PB pb)
    {
        o = -1F;
        p = -1L;
        d = context;
        e = a1;
        g = handler;
        f = ab;
        h = ei;
        j = pb;
        i = cl;
    }

    static a a(FindNearbyFriendsWorker findnearbyfriendsworker)
    {
        return findnearbyfriendsworker.e;
    }

    static void b(FindNearbyFriendsWorker findnearbyfriendsworker)
    {
        Object obj = null;
        do
        {
            if (findnearbyfriendsworker.k || findnearbyfriendsworker.l >= 3)
            {
                break;
            }
            long l1 = SystemClock.elapsedRealtime() - findnearbyfriendsworker.m;
            if (!findnearbyfriendsworker.n && l1 > b)
            {
                findnearbyfriendsworker.n = true;
                findnearbyfriendsworker.g.post(findnearbyfriendsworker. new Runnable() {

                    private FindNearbyFriendsWorker a;

                    public final void run()
                    {
                        FindNearbyFriendsWorker.a(a).u();
                    }

            
            {
                a = FindNearbyFriendsWorker.this;
                super();
            }
                });
            }
            obj = findnearbyfriendsworker.f.d();
            if (obj != null)
            {
                Timber.c("FindNearbyFriendsWorker", (new StringBuilder("Polling with location: ")).append(((Location) (obj)).toString()).append(" accuracy: ").append(((Location) (obj)).getAccuracy()).append("; totalDuration: ").append(l1).toString(), new Object[0]);
                com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("ANF_POLL_REQUEST").a("accuracy", Float.valueOf(((Location) (obj)).getAccuracy())).b(true);
                if (findnearbyfriendsworker.o == -1F || findnearbyfriendsworker.o > ((Location) (obj)).getAccuracy())
                {
                    findnearbyfriendsworker.o = ((Location) (obj)).getAccuracy();
                    findnearbyfriendsworker.p = SystemClock.elapsedRealtime() - findnearbyfriendsworker.m;
                }
                Object obj1;
                if (((Location) (obj)).hasAccuracy())
                {
                    obj1 = Float.valueOf(((Location) (obj)).getAccuracy());
                } else
                {
                    obj1 = null;
                }
                Timber.c("FindNearbyFriendsWorker", (new StringBuilder("Polling request with latitude: ")).append(((Location) (obj)).getLatitude()).append(", longitude: ").append(((Location) (obj)).getLongitude()).append("totalDuration: ").append(l1).toString(), new Object[0]);
                obj1 = new De(findnearbyfriendsworker.h.a(findnearbyfriendsworker.d, ((Location) (obj)).getLatitude(), ((Location) (obj)).getLongitude(), ((Float) (obj1)), l1, Uk.a.UPDATE));
                ((De) (obj1)).process(findnearbyfriendsworker.d);
                obj1 = ((De) (obj1)).a;
                if (obj1 != null)
                {
                    Timber.c("FindNearbyFriendsWorker", (new StringBuilder("Polling response received: ")).append(((Ul) (obj1)).toString()).toString(), new Object[0]);
                    findnearbyfriendsworker.l = 0;
                    if (((Ul) (obj1)).b() != null && !((Ul) (obj1)).b().isEmpty())
                    {
                        findnearbyfriendsworker.g.post(findnearbyfriendsworker. new Runnable(((Ul) (obj1))) {

                            private Ul a;
                            private FindNearbyFriendsWorker b;

                            public final void run()
                            {
                                FindNearbyFriendsWorker.a(b).a(a.b());
                            }

            
            {
                b = FindNearbyFriendsWorker.this;
                a = ul;
                super();
            }
                        });
                    }
                    l1 = a;
                    obj1 = ((Ul) (obj1)).a();
                    if (obj1 != null)
                    {
                        l1 = ((Long) (obj1)).longValue();
                    }
                    if (l1 > 0L)
                    {
                        Timber.c("FindNearbyFriendsWorker", "Worker thread sleeping", new Object[0]);
                        PG.a(l1);
                        Timber.c("FindNearbyFriendsWorker", "Worker thread awake", new Object[0]);
                    } else
                    {
                        Timber.c("FindNearbyFriendsWorker", "Interrupting worker as instructed by server", new Object[0]);
                        findnearbyfriendsworker.a(InterruptReason.INTENTIONAL);
                    }
                } else
                {
                    Timber.c("FindNearbyFriendsWorker", "Polling failure", new Object[0]);
                    findnearbyfriendsworker.l = findnearbyfriendsworker.l + 1;
                }
            } else
            {
                Timber.c("FindNearbyFriendsWorker", "No location found!", new Object[0]);
                PG.a(a);
                if (l1 > c)
                {
                    findnearbyfriendsworker.a(InterruptReason.LOCATION_ERROR);
                }
            }
        } while (true);
        if (findnearbyfriendsworker.l >= 3)
        {
            Timber.c("FindNearbyFriendsWorker", "Exceeded max failures, no longer polling", new Object[0]);
            if (!findnearbyfriendsworker.i.c())
            {
                obj = InterruptReason.NO_INTERNET_CONNECTION;
            } else
            if (obj == null)
            {
                obj = InterruptReason.LOCATION_ERROR;
            } else
            {
                obj = InterruptReason.ERROR;
            }
            findnearbyfriendsworker.a(((InterruptReason) (obj)));
        }
    }

    static Ab c(FindNearbyFriendsWorker findnearbyfriendsworker)
    {
        return findnearbyfriendsworker.f;
    }

    static PB d(FindNearbyFriendsWorker findnearbyfriendsworker)
    {
        return findnearbyfriendsworker.j;
    }

    static long e(FindNearbyFriendsWorker findnearbyfriendsworker)
    {
        return findnearbyfriendsworker.m;
    }

    static Context f(FindNearbyFriendsWorker findnearbyfriendsworker)
    {
        return findnearbyfriendsworker.d;
    }

    static Ei g(FindNearbyFriendsWorker findnearbyfriendsworker)
    {
        return findnearbyfriendsworker.h;
    }

    public final void a()
    {
        if (!Bt.bB())
        {
            a(InterruptReason.LOCATION_PERMISSIONS);
            return;
        }
        if (!Bt.bd())
        {
            a(InterruptReason.INITIAL_PROMPT);
            return;
        } else
        {
            f.b();
            Timber.c("FindNearbyFriendsWorker", "Begin polling", new Object[0]);
            k = false;
            l = 0;
            m = SystemClock.elapsedRealtime();
            n = false;
            g.post(new Runnable() {

                private FindNearbyFriendsWorker a;

                public final void run()
                {
                    FindNearbyFriendsWorker.a(a).t();
                }

            
            {
                a = FindNearbyFriendsWorker.this;
                super();
            }
            });
            IO.NETWORK_EXECUTOR.execute(new Runnable() {

                private FindNearbyFriendsWorker a;

                public final void run()
                {
                    FindNearbyFriendsWorker.b(a);
                }

            
            {
                a = FindNearbyFriendsWorker.this;
                super();
            }
            });
            return;
        }
    }

    public final void a(InterruptReason interruptreason)
    {
        Timber.c("FindNearbyFriendsWorker", (new StringBuilder("Polling interrupted with reason: ")).append(interruptreason.name()).toString(), new Object[0]);
        com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("ANF_INTERRUPT").a("reason", interruptreason.name()).a("bestAccuracy", Float.valueOf(o)).a("timeToAccuracy", Long.valueOf(p)).b(true);
        k = true;
        g.post(new Runnable(interruptreason) {

            private InterruptReason a;
            private FindNearbyFriendsWorker b;

            public final void run()
            {
                FindNearbyFriendsWorker.a(b).a(a);
            }

            
            {
                b = FindNearbyFriendsWorker.this;
                a = interruptreason;
                super();
            }
        });
        PG.b(new Runnable() {

            private FindNearbyFriendsWorker a;

            public final void run()
            {
                Location location = FindNearbyFriendsWorker.c(a).d();
                if (location == null)
                {
                    Timber.c("FindNearbyFriendsWorker", "Could not get location, can't cancel polling.", new Object[0]);
                    return;
                }
                FindNearbyFriendsWorker.d(a);
                long l1 = SystemClock.elapsedRealtime();
                long l2 = FindNearbyFriendsWorker.e(a);
                Float float1;
                if (location.hasAccuracy())
                {
                    float1 = Float.valueOf(location.getAccuracy());
                } else
                {
                    float1 = null;
                }
                (new De(FindNearbyFriendsWorker.g(a).a(FindNearbyFriendsWorker.f(a), location.getLatitude(), location.getLongitude(), float1, l1 - l2, Uk.a.DELETE))).process(FindNearbyFriendsWorker.f(a));
            }

            
            {
                a = FindNearbyFriendsWorker.this;
                super();
            }
        });
        if (!Bt.al())
        {
            f.c();
        }
    }

    public final boolean b()
    {
        return !k;
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(1L);
        b = TimeUnit.SECONDS.toMillis(10L);
        c = TimeUnit.SECONDS.toMillis(10L);
    }
}
