// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.networkmanager;

import Cl;
import IO;
import android.net.NetworkInfo;
import com.snapchat.android.Timber;
import dv;
import eb;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import oV;
import pi;

public final class NetworkManager
{
    public static final class Priority extends Enum
    {

        private static final Priority $VALUES[];
        public static final Priority HIGH;
        public static final Priority LOW;
        public static final Priority NORMAL;

        public static Priority valueOf(String s)
        {
            return (Priority)Enum.valueOf(com/snapchat/android/networkmanager/NetworkManager$Priority, s);
        }

        public static Priority[] values()
        {
            return (Priority[])$VALUES.clone();
        }

        static 
        {
            HIGH = new Priority("HIGH", 0);
            NORMAL = new Priority("NORMAL", 1);
            LOW = new Priority("LOW", 2);
            $VALUES = (new Priority[] {
                HIGH, NORMAL, LOW
            });
        }

        private Priority(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface a
    {

        public abstract void a(oV ov, pi pi);
    }


    private static final NetworkManager a = new NetworkManager();
    private final Cl b;
    private final ConcurrentHashMap c;
    private final ConcurrentHashMap d;
    private Executor e;
    private Executor f;

    public NetworkManager()
    {
        this(((Executor) (IO.NETWORK_EXECUTOR)), ((Executor) (IO.MISCELLANEOUS_EXECUTOR)), Cl.a());
    }

    private NetworkManager(Executor executor, Executor executor1, Cl cl)
    {
        c = new ConcurrentHashMap();
        d = new ConcurrentHashMap(eb.a(Priority.HIGH, new AtomicInteger(0), Priority.NORMAL, new AtomicInteger(0), Priority.LOW, new AtomicInteger(0)));
        e = executor;
        f = executor1;
        b = cl;
    }

    public static NetworkManager a()
    {
        return a;
    }

    static ConcurrentHashMap a(NetworkManager networkmanager)
    {
        return networkmanager.c;
    }

    static ConcurrentHashMap b(NetworkManager networkmanager)
    {
        return networkmanager.d;
    }

    static Cl c(NetworkManager networkmanager)
    {
        return networkmanager.b;
    }

    public final void a(String s)
    {
        s = (oV)c.get(s);
        if (s != null)
        {
            f.execute(new Runnable(s) {

                private oV a;

                public final void run()
                {
                    a.cancel();
                    Timber.c("NetworkManager", "NETWORK-MANAGER: Canceled request to %s %s", new Object[] {
                        a.getUrl(), a.getRequestTag()
                    });
                }

            
            {
                a = ov;
                super();
            }
            });
        }
    }

    public final void a(oV ov, a a1)
    {
        oV ov1 = (oV)c.putIfAbsent(ov.getRequestTag(), ov);
        if (ov1 != null && !ov.allowDuplicateRequests() && !ov1.allowDuplicateRequests())
        {
            Timber.c("NetworkManager", "NETWORK-MANAGER: Not starting %s because one already is in flight", new Object[] {
                ov.getUrl()
            });
            return;
        }
        if (ov.getPriority() == Priority.LOW && ((AtomicInteger)d.get(Priority.HIGH)).get() > 0)
        {
            Timber.c("NetworkManager", "NETWORK-MANAGER: Not starting %s because there are high priority requests", new Object[] {
                ov.getUrl()
            });
            return;
        } else
        {
            ((AtomicInteger)d.get(ov.getPriority())).incrementAndGet();
            a1 = new a(a1) {

                private a a;
                private NetworkManager b;

                public final void a(oV ov2, pi pi)
                {
                    NetworkManager.a(b).remove(ov2.getRequestTag());
                    ((AtomicInteger)NetworkManager.b(b).get(ov2.getPriority())).decrementAndGet();
                    ov2.onResult(pi);
                    if (a != null)
                    {
                        a.a(ov2, pi);
                    }
                }

            
            {
                b = NetworkManager.this;
                a = a1;
                super();
            }
            };
            e.execute(new Runnable(ov, a1) {

                private oV a;
                private a b;
                private NetworkManager c;

                public final void run()
                {
                    Object obj;
                    obj = NetworkManager.c(c).b();
                    pi pi;
                    if (obj != null)
                    {
                        obj = ((NetworkInfo) (obj)).getTypeName();
                    } else
                    {
                        obj = "Unknown";
                    }
                    pi = a.executeSynchronously();
                    obj = pi;
_L2:
                    dv.a(obj, (new StringBuilder("NetworkResult from ")).append(a.getUrl()).append(" should not be null").toString());
                    b.a(a, ((pi) (obj)));
                    return;
                    Exception exception;
                    exception;
                    Timber.e("NetworkManager", "NETWORK-MANAGER: Exception caught executing request %s: %s", new Object[] {
                        a.getUrl(), exception
                    });
                    obj = new pi.a(a.getUrl(), ((String) (obj)));
                    obj.mCaughtException = exception;
                    obj = ((pi.a) (obj)).a();
                    if (true) goto _L2; else goto _L1
_L1:
                }

            
            {
                c = NetworkManager.this;
                a = ov;
                b = a1;
                super();
            }
            });
            return;
        }
    }

}
