// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.ad.prepare;

import com.vungle.log.Logger;
import com.vungle.publisher.ab;
import com.vungle.publisher.bk;
import com.vungle.publisher.cb;
import com.vungle.publisher.cw;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.w;
import javax.inject.Provider;

public class PrepareViewableRunnable
    implements Runnable
{
    public static class Factory
    {

        Provider a;

        public final PrepareViewableRunnable a(bk bk1, cw cw1)
        {
            PrepareViewableRunnable prepareviewablerunnable = (PrepareViewableRunnable)a.get();
            prepareviewablerunnable.a = bk1;
            prepareviewablerunnable.b = bk1.d();
            prepareviewablerunnable.c = cw1;
            return prepareviewablerunnable;
        }

        public Factory()
        {
        }
    }


    bk a;
    String b;
    cw c;
    EventBus d;
    com.vungle.publisher.db.model.LoggedException.Factory e;

    public PrepareViewableRunnable()
    {
    }

    private boolean a()
    {
        bk bk1;
        Object obj;
        com.vungle.publisher.bj.a a1;
        boolean flag;
        bk1 = a;
        flag = false;
        obj = bk1.f();
        a1 = bk1.e();
    /* anonymous class not found */
    class _anm1 {}

        _cls1.a[a1.ordinal()];
        JVM INSTR tableswitch 1 5: default 64
    //                   1 97
    //                   2 97
    //                   3 160
    //                   4 194
    //                   5 298;
           goto _L1 _L2 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalStateException((new StringBuilder("unexpected ")).append(obj).append(" status: ").append(a1).toString());
_L2:
        Logger.d("VunglePrepare", (new StringBuilder()).append(obj).append(" will begin downloading for ad_id ").append(b).toString());
        try
        {
            bk1.a(c);
        }
        catch (cb cb1)
        {
            throw new PrepareAdRunnable.a("external storage not available, could not download ad", cb1);
        }
_L7:
        bk1.m();
        return flag;
_L3:
        Logger.d("VunglePrepare", (new StringBuilder()).append(obj).append(" still downloading for ad_id ").append(b).toString());
        continue; /* Loop/switch isn't completed */
_L4:
        Logger.d("VunglePrepare", (new StringBuilder()).append(obj).append(" downloaded, continuing to postprocessing for ad_id ").append(b).toString());
        try
        {
            obj = a;
            if (!((bk) (obj)).l())
            {
                throw new PrepareAdRunnable.b((new StringBuilder()).append(((bk) (obj)).f()).append(" post processing failed for ad_id ").append(((bk) (obj)).d()).toString());
            }
        }
        catch (cb cb2)
        {
            throw new PrepareAdRunnable.a("external storage not available, could not post process ad", cb2);
        }
        flag = true;
        continue; /* Loop/switch isn't completed */
_L5:
        Logger.v("VunglePrepare", (new StringBuilder()).append(obj).append(" already ").append(a1).append(" for ad_id ").append(b).toString());
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void run()
    {
        Logger.d("VunglePrepare", (new StringBuilder("run PrepareViewableRunnable. adId = ")).append(b).append(". type = ").append(a.f()).toString());
        try
        {
            if (a())
            {
                d.a(new ab(b));
            }
            return;
        }
        catch (Exception exception)
        {
            e.a("VunglePrepare", (new StringBuilder("error processing ")).append(a.f()).append(" for ad ").append(b).append(". retryCount = ").append(c.b).toString(), exception);
        }
        a.b(com.vungle.publisher.bj.a.f);
        d.a(new w(c));
    }
}
