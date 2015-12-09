// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.ad;

import android.content.Context;
import android.database.SQLException;
import com.vungle.log.Logger;
import com.vungle.publisher.aa;
import com.vungle.publisher.ag;
import com.vungle.publisher.async.ScheduledPriorityExecutor;
import com.vungle.publisher.av;
import com.vungle.publisher.bt;
import com.vungle.publisher.bx;
import com.vungle.publisher.by;
import com.vungle.publisher.c;
import com.vungle.publisher.cp;
import com.vungle.publisher.cw;
import com.vungle.publisher.db.model.Ad;
import com.vungle.publisher.db.model.LocalAd;
import com.vungle.publisher.db.model.StreamingAd;
import com.vungle.publisher.env.SdkConfig;
import com.vungle.publisher.env.SdkState;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.f;
import com.vungle.publisher.protocol.ProtocolHttpGateway;
import com.vungle.publisher.protocol.message.RequestStreamingAdResponse;
import com.vungle.publisher.q;
import com.vungle.publisher.r;
import dagger.Lazy;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.ad:
//            AdPreparer

public class AdManager
{
    public static class AdAvailabilityEventListener extends by
    {

        AdManager a;

        public void onEvent(f f1)
        {
            a.b(false);
        }

        AdAvailabilityEventListener()
        {
        }
    }

    static class PlayAdEventListener extends by
    {

        final String a = "VunglePrepare";
        AdManager b;
        com.vungle.publisher.db.model.LoggedException.Factory c;

        public void onEvent(ag ag1)
        {
            try
            {
                ag1.a().b(com.vungle.publisher.db.model.Ad.a.f);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ag ag1)
            {
                c.a("VunglePrepare", "error processing start play ad event", ag1);
            }
        }

        public void onEvent(av av)
        {
            Logger.d("VunglePrepare", "play ad failure - unregistering play ad listener");
            unregister();
        }

        public void onEvent(q q1)
        {
            Logger.d("VunglePrepare", "sent ad report - unregistering play ad listener");
            unregister();
        }

        PlayAdEventListener()
        {
        }
    }

    static class PrepareStreamingAdEventListener extends by
    {

        final String a = "VunglePrepare";
        volatile boolean b;
        volatile StreamingAd c;
        final long d = System.currentTimeMillis();
        com.vungle.publisher.db.model.StreamingAd.Factory e;

        final void a()
        {
            b = true;
            this;
            JVM INSTR monitorenter ;
            notifyAll();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void onEvent(aa aa1)
        {
            RequestStreamingAdResponse requeststreamingadresponse;
            long l1;
            unregister();
            l1 = ((bx) (aa1)).e - d;
            requeststreamingadresponse = aa1.a;
            if (!Boolean.TRUE.equals(requeststreamingadresponse.r)) goto _L2; else goto _L1
_L1:
            Object obj;
            Logger.d("VunglePrepare", (new StringBuilder("received streaming ad ")).append(requeststreamingadresponse.f()).append(" after ").append(l1).append(" ms").toString());
            obj = requeststreamingadresponse.f();
            aa1 = (StreamingAd)e.a(obj);
            if (aa1 != null) goto _L4; else goto _L3
_L3:
            aa1 = e.a(requeststreamingadresponse);
            c = aa1;
            Logger.d("VunglePrepare", (new StringBuilder("inserting new ")).append(aa1.y()).toString());
            try
            {
                aa1.l();
            }
            // Misplaced declaration of an exception variable
            catch (aa aa1)
            {
                Logger.d("VunglePrepare", "did not insert streaming ad - possible duplicate");
            }
_L6:
            a();
            return;
_L4:
        /* anonymous class not found */
        class _anm3 {}

            try
            {
                e.a(aa1, requeststreamingadresponse);
            }
            catch (Exception exception)
            {
                Logger.w("VunglePrepare", (new StringBuilder("error updating ad ")).append(((String) (obj))).toString(), exception);
            }
            obj = aa1.i();
            switch (_cls3.a[((com.vungle.publisher.db.model.Ad.a) (obj)).ordinal()])
            {
            case 2: // '\002'
            case 3: // '\003'
            default:
                Logger.w("VunglePrepare", (new StringBuilder("existing ")).append(aa1.y()).append(" with status ").append(obj).append(" - ignoring").toString());
                break;

            case 1: // '\001'
                Logger.w("VunglePrepare", (new StringBuilder("unexpected ad status ")).append(obj).append(" for ").append(aa1.y()).toString());
                // fall through

            case 4: // '\004'
            case 5: // '\005'
                Logger.d("VunglePrepare", (new StringBuilder("existing ")).append(aa1.y()).append(" with status ").append(obj).toString());
                if (obj != com.vungle.publisher.db.model.Ad.a.e)
                {
                    aa1.b(com.vungle.publisher.db.model.Ad.a.e);
                }
                c = aa1;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L2:
            Logger.d("VunglePrepare", (new StringBuilder("no streaming ad to play after ")).append(l1).append(" ms").toString());
            if (true) goto _L6; else goto _L5
_L5:
        }

        public void onEvent(r r)
        {
            unregister();
            Logger.d("VunglePrepare", (new StringBuilder("request streaming ad failure after ")).append(((bx) (r)).e - d).append(" ms").toString());
            a();
        }

        PrepareStreamingAdEventListener()
        {
        }
    }


    public AdPreparer a;
    Context b;
    bt c;
    public EventBus d;
    Class e;
    public ScheduledPriorityExecutor f;
    public com.vungle.publisher.db.model.LocalAd.Factory g;
    cp h;
    Lazy i;
    public Lazy j;
    Provider k;
    ProtocolHttpGateway l;
    SdkConfig m;
    public com.vungle.publisher.db.model.StreamingAd.Factory n;
    public com.vungle.publisher.db.model.Viewable.Factory o;
    Lazy p;
    com.vungle.publisher.db.model.LoggedException.Factory q;

    public AdManager()
    {
    }

    public final LocalAd a(String s)
    {
        return g.a(s);
    }

    final LocalAd a(boolean flag)
    {
        if (c.o())
        {
            LocalAd localad;
            if (flag)
            {
                localad = g.a(new com.vungle.publisher.db.model.Ad.a[] {
                    com.vungle.publisher.db.model.Ad.a.e, com.vungle.publisher.db.model.Ad.a.d
                });
            } else
            {
                localad = g.f();
            }
            if (localad == null)
            {
                Logger.d("VunglePrepare", "no local ad available");
                l.a(new cw());
                return null;
            }
            com.vungle.publisher.db.model.Ad.a a1 = localad.i();
            if (a1 == com.vungle.publisher.db.model.Ad.a.d)
            {
                if (flag)
                {
                    Logger.d("VunglePrepare", (new StringBuilder("local ad partially prepared, restarting preparation for ")).append(localad.d()).toString());
                    a.a(localad.d());
                    return null;
                } else
                {
                    Logger.i("VunglePrepare", (new StringBuilder("local ad partially prepared, but not restarting preparation for ")).append(localad.d()).toString());
                    return null;
                }
            }
            if (a1 == com.vungle.publisher.db.model.Ad.a.e)
            {
                Logger.v("VunglePrepare", (new StringBuilder("local ad already available for ")).append(localad.d()).toString());
            }
            return localad;
        } else
        {
            Logger.w("VunglePrepare", "unable to fetch local ad -  no external storage available");
            return null;
        }
    }

    final StreamingAd a(String s, c c1)
    {
        Object obj1;
        boolean flag;
        obj1 = null;
        flag = false;
        if (!m.b) goto _L2; else goto _L1
_L1:
        Object obj2;
        StringBuilder stringbuilder;
        obj2 = h.a();
        flag = m.c.contains(obj2);
        stringbuilder = new StringBuilder("ad streaming ");
        Object obj;
        int i1;
        long l1;
        long l2;
        long l3;
        if (flag)
        {
            obj = "enabled";
        } else
        {
            obj = "disabled";
        }
        Logger.d("VunglePrepare", stringbuilder.append(((String) (obj))).append(" for ").append(obj2).append(" connectivity").toString());
_L9:
        if (!flag) goto _L4; else goto _L3
_L3:
        Logger.d("VunglePrepare", "requesting streaming ad");
        obj2 = (PrepareStreamingAdEventListener)k.get();
        ((PrepareStreamingAdEventListener) (obj2)).register();
        obj = l;
        ((ProtocolHttpGateway) (obj)).e.a(new com.vungle.publisher.protocol.ProtocolHttpGateway._cls4(((ProtocolHttpGateway) (obj)), s, c1), com.vungle.publisher.async.ScheduledPriorityExecutor.b.c);
        l1 = ((PrepareStreamingAdEventListener) (obj2)).d;
        i1 = m.d;
        Logger.d("VungleConfig", (new StringBuilder("streaming response timeout config ")).append(i1).append(" ms").toString());
        l2 = i1;
        obj2;
        JVM INSTR monitorenter ;
_L8:
        if (((PrepareStreamingAdEventListener) (obj2)).b) goto _L6; else goto _L5
_L5:
        l3 = System.currentTimeMillis();
        l3 = (l2 + l1) - l3;
        if (l3 <= 0L) goto _L6; else goto _L7
_L7:
        try
        {
            obj2.wait(l3);
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally
        {
            s = null;
        }
        if (true) goto _L8; else goto _L6
_L2:
        Logger.d("VunglePrepare", "ad streaming disabled");
          goto _L9
        c1;
        s = null;
_L14:
        q.a("VunglePrepare", "error getting streaming ad", c1);
        return s;
_L6:
        l1 = System.currentTimeMillis() - l1;
        if (!((PrepareStreamingAdEventListener) (obj2)).b) goto _L11; else goto _L10
_L10:
        s = ((PrepareStreamingAdEventListener) (obj2)).c;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        obj = s;
        Logger.d("VunglePrepare", (new StringBuilder("request streaming ad success after ")).append(l1).append(" ms ").append(s.y()).toString());
_L13:
        obj2;
        JVM INSTR monitorexit ;
        return s;
_L11:
        Logger.d("VunglePrepare", (new StringBuilder("request streaming ad timeout after ")).append(l1).append(" ms").toString());
        ((PrepareStreamingAdEventListener) (obj2)).a();
        s = obj1;
        if (true) goto _L13; else goto _L12
_L12:
        obj = s;
        obj2;
        JVM INSTR monitorexit ;
        try
        {
            throw c1;
        }
        // Misplaced declaration of an exception variable
        catch (c c1) { }
          goto _L14
_L4:
        return null;
        c1;
        s = ((String) (obj));
          goto _L12
        c1;
          goto _L12
    }

    public final boolean a()
    {
        SdkState sdkstate = (SdkState)p.get();
        if (!sdkstate.l.get() && sdkstate.b())
        {
            boolean flag;
            if (g.f() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public final void b(boolean flag)
    {
        a(flag);
        f.a(com.vungle.publisher.async.ScheduledPriorityExecutor.b.o);
        Long long1 = g.g();
        if (long1 != null)
        {
            f.a(new _cls2(), com.vungle.publisher.async.ScheduledPriorityExecutor.b.o, long1.longValue() - System.currentTimeMillis());
        }
    }

    /* member class not found */
    class _cls2 {}

}
