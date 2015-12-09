// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Pair;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.video.exo.DashManifestLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class glv extends HandlerThread
    implements android.os.Handler.Callback, gkx
{

    private final Handler a;
    private final glw b;
    private final CompletionService c = new ExecutorCompletionService(Executors.newFixedThreadPool(2));
    private final glt d;
    private final Context e;
    private final gkq f;
    private DashManifestLoader g;
    private Handler h;
    private Looper i;
    private bbn j;
    private String k;
    private Set l;

    public glv(Context context, glt glt, Handler handler, glw glw, gkq gkq1, Looper looper, bbn bbn, 
            String s)
    {
        super("VideoPrefetcherThread");
        e = context;
        a = handler;
        b = glw;
        d = glt;
        dmz.a(fop);
        f = gkq1;
        i = looper;
        j = bbn;
        l = new HashSet();
        k = s;
    }

    private long a(bat bat1)
    {
        long l1;
        ArrayList arraylist = new ArrayList();
        bat1 = (baw)bat1.e.get(0);
        int i1 = bat1.a(0);
        Iterator iterator = ((baq)((baw) (bat1)).a.get(i1)).b.iterator();
        i1 = -1;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bay bay1 = (bay)iterator.next();
            int j1 = i1;
            if (bay1.a.c <= 0xc3500)
            {
                j1 = i1;
                if (bay1.a.c > i1)
                {
                    arraylist.clear();
                    j1 = bay1.a.c;
                }
            }
            i1 = j1;
            if (bay1.a.c == j1)
            {
                arraylist.addAll(a(bay1));
                i1 = j1;
            }
        } while (true);
        for (bat1 = ((baq)((baw) (bat1)).a.get(bat1.a(1))).b.iterator(); bat1.hasNext(); arraylist.addAll(a((bay)bat1.next()))) { }
        bat1 = b(arraylist);
        l1 = 0L;
_L1:
        if (bat1.isEmpty())
        {
            break MISSING_BLOCK_LABEL_321;
        }
        Thread.currentThread().getId();
        bat1.size();
        Future future;
        try
        {
            future = c.poll(60L, TimeUnit.SECONDS);
        }
        catch (Exception exception)
        {
            a(((List) (bat1)));
            bat1.clear();
            throw exception;
        }
        if (future == null)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        bat1.remove(future);
        l1 = ((Long)future.get()).longValue() + l1;
          goto _L1
        throw new TimeoutException("Timeout waiting for segment to download.");
        return l1;
    }

    private static Collection a(bay bay1)
    {
        HashSet hashset = new HashSet();
        if (bay1.d() != null)
        {
            bax bax1 = bay1.d();
            hashset.add(new bde(bax1.a(), bax1.a, bax1.b, bay1.g()));
        }
        if (bay1.e() != null)
        {
            bax bax2 = bay1.e();
            hashset.add(new bde(bax2.a(), bax2.a, bax2.b, bay1.g()));
        }
        int i1 = bay1.f().a(0L);
        for (int j1 = Math.min(i1 + 4, bay1.f().b()); i1 < j1; i1++)
        {
            bax bax3 = bay1.f().c(i1);
            hashset.add(new bde(bax3.a(), bax3.a, bax3.b, bay1.g()));
        }

        return hashset;
    }

    static Set a(glv glv1)
    {
        return glv1.l;
    }

    private static void a(List list)
    {
        for (list = list.iterator(); list.hasNext(); ((Future)list.next()).cancel(true)) { }
    }

    static DashManifestLoader b(glv glv1)
    {
        return glv1.g;
    }

    private List b(List list)
    {
        ArrayList arraylist = new ArrayList();
        bde bde1;
        for (list = list.iterator(); list.hasNext(); arraylist.add(c.submit(new glu(d, bde1))))
        {
            bde1 = (bde)list.next();
        }

        return arraylist;
    }

    static gkq c(glv glv1)
    {
        return glv1.f;
    }

    static glw d(glv glv1)
    {
        return glv1.b;
    }

    public final void a(String s, bat bat1)
    {
        gkq gkq1;
        Object obj;
        bbn bbn;
        int i1;
        gkq1 = f;
        obj = i;
        bbn = j;
        if (!gkq1.b.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_76;
        }
        i1 = ((gkr)((Pair)gkq1.b.get(s)).first).f();
        if (i1 != 1 && i1 != 0)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        gkq1.b.remove(s);
        gkp gkp1;
        gkp1 = new gkp();
        obj = gkt.a(bat1, ((Looper) (obj)), gkq1.a, gkp1, bbn);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        ((gkr) (obj)).e();
        gkq1.b.put(s, new Pair(obj, gkp1));
        if (!l.contains(s))
        {
            break MISSING_BLOCK_LABEL_209;
        }
        long l1 = a(bat1);
        bat1 = new dnu(s.getBytes(), l1);
        fop.a(e, bat1);
        Thread.currentThread().getId();
        l.remove(s);
_L1:
        a.post(new Runnable() {

            public final void run()
            {
            }

        });
        return;
        try
        {
            Thread.currentThread().getId();
        }
        // Misplaced declaration of an exception variable
        catch (bat bat1)
        {
            Logger.b(bat1, "Download failed for %s.", new Object[] {
                s
            });
            a.post(new Runnable(s, bat1) {

                private String a;
                private Exception b;
                private glv c;

                public final void run()
                {
                    glv.d(c).a(a, b);
                }

            
            {
                c = glv.this;
                a = s;
                b = exception;
                super();
            }
            });
            return;
        }
          goto _L1
    }

    public final void a(String s, Exception exception)
    {
        a.post(new Runnable(s, exception) {

            private String a;
            private Exception b;
            private glv c;

            public final void run()
            {
                glv.d(c).a(a, b);
            }

            
            {
                c = glv.this;
                a = s;
                b = exception;
                super();
            }
        });
    }

    public final void a(Set set)
    {
        this;
        JVM INSTR monitorenter ;
        if (getLooper() != null) goto _L2; else goto _L1
_L1:
        Assertion.b("Can't prefetch until VideoPrefetcher is started");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        h.post(new Runnable(set) {

            private Set a;
            private glv b;

            public final void run()
            {
                HashSet hashset = new HashSet();
                do
                {
                    for (Iterator iterator = a.iterator(); iterator.hasNext();)
                    {
                        Object obj = (PlayerTrack)iterator.next();
                        if (!((PlayerTrack) (obj)).metadata().containsKey("media.manifest_id"))
                        {
                            Logger.c("Track does not contain manifest id", new Object[0]);
                        } else
                        {
                            String s = (String)((PlayerTrack) (obj)).metadata().get("media.manifest_id");
                            obj = (String)((PlayerTrack) (obj)).metadata().get("media.start_position");
                            int i1;
                            if (obj == null)
                            {
                                i1 = 0;
                            } else
                            {
                                i1 = Integer.parseInt(((String) (obj)));
                            }
                            if (i1 == 0)
                            {
                                i1 = 1;
                            } else
                            {
                                i1 = 0;
                            }
                            if (i1 != 0)
                            {
                                glv.a(b).add(s);
                            }
                            hashset.add(s);
                            glv.b(b).a(s, b);
                        }
                    }

                    glv.c(b).a(hashset);
                    return;
                } while (true);
            }

            
            {
                b = glv.this;
                a = set;
                super();
            }
        });
        if (true) goto _L4; else goto _L3
_L3:
        set;
        throw set;
    }

    public final boolean handleMessage(Message message)
    {
        return true;
    }

    protected final void onLooperPrepared()
    {
        super.onLooperPrepared();
        h = new Handler(getLooper(), this);
        dmz.a(gky);
        g = gky.a(getLooper());
        if (k != null)
        {
            g.a(k);
        }
        Process.setThreadPriority(10);
    }
}
