// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.ad.prepare;

import com.vungle.log.Logger;
import com.vungle.publisher.ad.AdManager;
import com.vungle.publisher.ai;
import com.vungle.publisher.async.ScheduledPriorityExecutor;
import com.vungle.publisher.bk;
import com.vungle.publisher.cw;
import com.vungle.publisher.db.model.LocalAd;
import com.vungle.publisher.db.model.LocalAdReport;
import com.vungle.publisher.db.model.LocalArchive;
import com.vungle.publisher.db.model.LocalVideo;
import com.vungle.publisher.db.model.LocalViewableDelegate;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.reporting.AdReportManager;
import com.vungle.publisher.u;
import com.vungle.publisher.w;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Provider;

public class PrepareAdRunnable
    implements Runnable
{
    public static class Factory
    {

        public Provider a;

        public Factory()
        {
        }
    }

    static class RetryMap
    {

        final Map a = new HashMap();

        final cw a(String s)
        {
            return (cw)a.get(s);
        }

        public RetryMap()
        {
        }
    }


    private static final Object h = new Object();
    EventBus a;
    AdManager b;
    AdReportManager c;
    ScheduledPriorityExecutor d;
    PrepareViewableRunnable.Factory e;
    RetryMap f;
    com.vungle.publisher.db.model.LoggedException.Factory g;
    private String i;

    public PrepareAdRunnable()
    {
    }

    private LocalAd a()
    {
        LocalAd localad;
        Object obj;
        String s;
        s = i;
        localad = b.a(s);
        if (localad == null)
        {
            throw new IllegalArgumentException((new StringBuilder("no ad ")).append(s).toString());
        }
        obj = localad.i();
    /* anonymous class not found */
    class _anm1 {}

        _cls1.a[((com.vungle.publisher.db.model.Ad.a) (obj)).ordinal()];
        JVM INSTR tableswitch 1 3: default 80
    //                   1 117
    //                   2 117
    //                   3 141;
           goto _L1 _L2 _L2 _L3
_L1:
        obj = a(localad);
    /* block-local class not found */
    class a {}

        try
        {
            localad.m();
            if (((LocalAd) (obj)).i() == com.vungle.publisher.db.model.Ad.a.e)
            {
                a.a(new u());
            }
        }
        catch (Exception exception1)
        {
            g.a("VunglePrepare", (new StringBuilder("error saving ad ")).append(localad.d()).append(" to database").toString(), exception1);
        }
        return ((LocalAd) (obj));
_L2:
        throw new a((new StringBuilder("ad status: ")).append(obj).toString());
_L3:
        Logger.d("VunglePrepare", (new StringBuilder("ad already ")).append(com.vungle.publisher.db.model.Ad.a.e).append(": ").append(s).toString());
        return localad;
        Exception exception;
        exception;
        try
        {
            localad.m();
            throw new NullPointerException();
        }
        catch (Exception exception2)
        {
            g.a("VunglePrepare", (new StringBuilder("error saving ad ")).append(localad.d()).append(" to database").toString(), exception2);
        }
        throw exception;
    }

    private LocalAd a(LocalAd localad)
    {
        int j;
        Object obj = localad.d();
        Object obj1 = localad.i();
        if (obj1 == com.vungle.publisher.db.model.Ad.a.b)
        {
            com.vungle.publisher.db.model.Ad.a a1 = com.vungle.publisher.db.model.Ad.a.d;
            long l = System.currentTimeMillis();
            long l1 = localad.j();
    /* block-local class not found */
    class b {}

            if (l < l1)
            {
                Logger.d("VunglePrepare", (new StringBuilder("clock change detected; updating ad.id ")).append(((String) (obj))).append(" status from ").append(obj1).append(" to ").append(a1).toString());
                localad.a(a1);
            } else
            {
                l = (l - l1) / 60000L;
                if (l >= 1440L)
                {
                    Logger.d("VunglePrepare", (new StringBuilder("retrying ")).append(com.vungle.publisher.db.model.Ad.a.b).append(" ad.id ").append(((String) (obj))).append(" after ").append(l).append("/1440 minutes; updating status from ").append(obj1).append(" to ").append(a1).toString());
                    localad.a(a1);
                } else
                {
                    throw new a((new StringBuilder("ad marked failed ")).append(l).append(" minutes ago").toString());
                }
            }
        }
        obj = com.vungle.publisher.db.model.Ad.a.b;
        obj = localad.i();
        j = localad.z;
        if (j >= 3) goto _L2; else goto _L1
_L1:
        _cls1.a[((com.vungle.publisher.db.model.Ad.a) (obj)).ordinal()];
        JVM INSTR tableswitch 5 7: default 437
    //                   5 336
    //                   6 352
    //                   7 393;
           goto _L3 _L4 _L5 _L6
_L3:
        throw new IllegalStateException((new StringBuilder("unexpected ad.status: ")).append(obj).toString());
_L4:
        c.a(localad);
        localad.a(com.vungle.publisher.db.model.Ad.a.d);
_L5:
        Logger.d("VunglePrepare", (new StringBuilder("prepare_retry_count ")).append(j).append(" for ad ").append(i).toString());
        b(localad);
        return localad;
_L6:
        try
        {
            c(localad);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Logger.w("VunglePrepare", (new StringBuilder()).append(((b) (obj1)).getMessage()).append(" for ad.id: ").append(i).toString());
            localad.z = localad.z + 1;
            break MISSING_BLOCK_LABEL_96;
        }
        return localad;
_L2:
        localad.a(com.vungle.publisher.db.model.Ad.a.b);
        throw new a((new StringBuilder("failed to prepare ad after ")).append(j).append(" attempts").toString());
    }

    public static String a(PrepareAdRunnable prepareadrunnable, String s)
    {
        prepareadrunnable.i = s;
        return s;
    }

    private void b(LocalAd localad)
    {
        d(localad);
        bk abk[] = localad.B();
        int k = abk.length;
        int j = 0;
        boolean flag = true;
        while (j < k) 
        {
            bk bk1 = abk[j];
            com.vungle.publisher.bj.a a1 = bk1.e();
            Logger.v("VunglePrepare", (new StringBuilder()).append(bk1.f()).append(" has status ").append(a1).toString());
            if (a1 == com.vungle.publisher.bj.a.a || a1 == com.vungle.publisher.bj.a.f)
            {
                bk1.b(com.vungle.publisher.bj.a.b);
                Object obj = i;
                obj = f.a(((String) (obj)));
                Logger.d("VunglePrepare", (new StringBuilder("begin preparing ")).append(bk1.f()).toString());
                d.a(e.a(bk1, ((cw) (obj))), com.vungle.publisher.async.ScheduledPriorityExecutor.b.h);
            }
            boolean flag1;
            if (a1 == com.vungle.publisher.bj.a.e)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag1)
            {
                flag = false;
            }
            j++;
        }
        if (flag)
        {
            Logger.i("VunglePrepare", (new StringBuilder("ad ready ")).append(localad.d()).toString());
            localad.a(com.vungle.publisher.db.model.Ad.a.e);
            ((LocalAdReport)c.c.b(localad)).d(Long.valueOf(System.currentTimeMillis()));
            return;
        } else
        {
            Logger.d("VunglePrepare", (new StringBuilder("ad not ready ")).append(localad.d()).toString());
            return;
        }
    }

    private void c(LocalAd localad)
    {
        String s = localad.d();
        Logger.d("VunglePrepare", (new StringBuilder("re-verify prepare_retry_count ")).append(localad.z).append(" for ad ").append(s).toString());
        d(localad);
        bk abk[] = localad.B();
        int k = abk.length;
        for (int j = 0; j < k; j++)
        {
            bk bk1 = abk[j];
            if (!bk1.t())
            {
                throw new b((new StringBuilder()).append(bk1.f()).append(" re-verification failed for ad_id ").append(bk1.d()).toString());
            }
        }

        com.vungle.publisher.db.model.Ad.a a1 = com.vungle.publisher.db.model.Ad.a.e;
        Logger.i("VunglePrepare", (new StringBuilder("re-verified ad and set to ")).append(a1).append(": ").append(s).toString());
        c.a(localad).d(Long.valueOf(-1L));
        localad.a(a1);
    }

    private static void d(LocalAd localad)
        throws a
    {
        boolean flag3 = false;
        LocalArchive localarchive = localad.A();
        LocalVideo localvideo = (LocalVideo)localad.k();
        LocalArchive localarchive1 = localad.u();
        String s;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (localarchive != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (localvideo != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (localarchive1 != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag || flag1 || flag2)
        {
            flag3 = true;
        }
        s = localad.y();
        if (flag3)
        {
            if (flag)
            {
                Logger.v("VunglePrepare", (new StringBuilder()).append(s).append(" has ").append(com.vungle.publisher.bj.b.c).append(": ").append(localarchive.i.b).toString());
            }
            if (flag1)
            {
                Logger.v("VunglePrepare", (new StringBuilder()).append(s).append(" has ").append(com.vungle.publisher.bj.b.a).append(": ").append(localvideo.b.b).toString());
            }
            if (flag2)
            {
                Logger.v("VunglePrepare", (new StringBuilder()).append(s).append(" has ").append(com.vungle.publisher.bj.b.b).append(": ").append(localarchive1.i.b).toString());
            }
        } else
        {
            localad.a(com.vungle.publisher.db.model.Ad.a.c);
        }
        if (!flag3)
        {
            throw new a("invalid ad - no viewables");
        } else
        {
            return;
        }
    }

    public void run()
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        Logger.d("VunglePrepare", (new StringBuilder("run PrepareAdRunnable. adId = ")).append(i).toString());
        obj1 = f;
        String s = i;
        if (!((RetryMap) (obj1)).a.containsKey(s))
        {
            ((RetryMap) (obj1)).a.put(s, new cw());
        }
        if (a().i() == com.vungle.publisher.db.model.Ad.a.e)
        {
            String s1 = i;
            ((RetryMap) (obj1)).a.remove(s1);
            a.a(new ai());
        }
_L1:
        return;
        Object obj2;
        obj2;
        Logger.w("VunglePrepare", (new StringBuilder()).append(((a) (obj2)).getMessage()).append(" for ad.id ").append(i).append(". retryCount = ").append(((RetryMap) (obj1)).a(i).b).toString());
        a.a(new w(((RetryMap) (obj1)).a(i)));
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj2;
        g.a("VunglePrepare", (new StringBuilder("error processing ad.id: ")).append(i).toString(), ((Throwable) (obj2)));
        a.a(new w(((RetryMap) (obj1)).a(i)));
          goto _L1
    }

}
