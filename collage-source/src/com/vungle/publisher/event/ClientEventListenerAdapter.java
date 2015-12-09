// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.event;

import com.vungle.log.Logger;
import com.vungle.publisher.EventListener;
import com.vungle.publisher.ad;
import com.vungle.publisher.ad.AdManager;
import com.vungle.publisher.ag;
import com.vungle.publisher.async.ScheduledPriorityExecutor;
import com.vungle.publisher.at;
import com.vungle.publisher.au;
import com.vungle.publisher.aw;
import com.vungle.publisher.ax;
import com.vungle.publisher.ay;
import com.vungle.publisher.az;
import com.vungle.publisher.ba;
import com.vungle.publisher.bb;
import com.vungle.publisher.be;
import com.vungle.publisher.by;
import com.vungle.publisher.e;
import com.vungle.publisher.o;
import com.vungle.publisher.p;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;

public class ClientEventListenerAdapter extends by
{
    public static class Factory
    {

        public Provider a;

        public Factory()
        {
        }
    }


    public EventListener a;
    ScheduledPriorityExecutor b;
    AdManager c;
    private int d;
    private int e;
    private AtomicBoolean f;

    ClientEventListenerAdapter()
    {
        f = new AtomicBoolean();
    }

    private void a(Runnable runnable)
    {
        b.a(runnable, com.vungle.publisher.async.ScheduledPriorityExecutor.b.r);
    }

    private void a(String s)
    {
        a(((Runnable) (new _cls5(s))));
    }

    private void a(boolean flag)
    {
        int i = d;
        int j = e;
        boolean flag1;
        if ((float)i / (float)j > 0.8F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Logger.d("VungleEvent", (new StringBuilder("onVideoEnd(")).append(flag1).append(", ").append(i).append(", ").append(j).append(") callback").toString());
        a(((Runnable) (new _cls3(flag1, i, j))));
        Logger.d("VungleEvent", (new StringBuilder("onAdEnd(")).append(flag).append(") callback").toString());
        a(((Runnable) (new _cls4(flag))));
    }

    public void onEvent(ag ag)
    {
        Logger.d("VungleEvent", "onAdStart() callback");
        d = 0;
        e = 0;
        a(new _cls2());
    }

    public void onEvent(at at)
    {
        if (at instanceof bb)
        {
            Logger.d("VungleEvent", "onAdEnd() - activity destroyed");
        } else
        {
            Logger.d("VungleEvent", "onAdEnd() - error during playback");
        }
        a(false);
    }

    public void onEvent(au au)
    {
        Logger.d("VungleEvent", "onAdUnavailable(already playing) callback");
        a("Ad already playing");
    }

    public void onEvent(aw aw)
    {
        Logger.d("VungleEvent", "onAdUnavailable(error) callback");
        a("Error launching ad");
    }

    public void onEvent(ax ax)
    {
        Logger.d("VungleEvent", "onAdUnavailable(not initialized) callback");
        a("Vungle Publisher SDK was not successfully initialized - please check the logs");
    }

    public void onEvent(ay ay1)
    {
        Logger.d("VungleEvent", "onAdUnavailable(throttled) callback");
        a((new StringBuilder("Only ")).append(ay1.a).append(" of minimum ").append(ay1.b).append(" seconds elapsed between ads").toString());
    }

    public void onEvent(az az)
    {
        Logger.d("VungleEvent", "onAdUnavailable(unavailable) callback");
        a("No cached or streaming ad available");
    }

    public void onEvent(be be)
    {
        a(((ba) (be)).a);
    }

    public void onEvent(e e1)
    {
        boolean flag1 = c.a();
        e1 = f;
        boolean flag;
        if (!flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (e1.compareAndSet(flag, flag1))
        {
            a(new _cls1(flag1));
        }
    }

    public void onEvent(o o1)
    {
        e = o1.a;
    }

    public void onEvent(p p)
    {
        int i = ((ad) (p)).a;
        if (i > d)
        {
            Logger.d("VungleEvent", (new StringBuilder("new watched millis ")).append(i).toString());
            d = i;
            return;
        } else
        {
            Logger.d("VungleEvent", (new StringBuilder("shorter watched millis ")).append(i).toString());
            return;
        }
    }

    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
