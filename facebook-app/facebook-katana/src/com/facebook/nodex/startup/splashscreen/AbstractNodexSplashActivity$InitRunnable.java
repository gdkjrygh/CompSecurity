// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.util.Log;
import com.facebook.base.lwperf.LightWeightPerfState;
import com.facebook.nodex.startup.crashloop.CrashLoop;
import com.facebook.nodex.startup.warmup.NodexWarmupContentProvider;
import com.facebook.tools.dextr.runtime.detour.HandlerDetour;

// Referenced classes of package com.facebook.nodex.startup.splashscreen:
//            AbstractNodexSplashActivity, NodexInitializer

class <init>
    implements Runnable
{

    final AbstractNodexSplashActivity a;

    public void run()
    {
        Object obj;
        long l;
        l = System.nanoTime();
        if (AbstractNodexSplashActivity.c(a) != null)
        {
            HandlerDetour.b(a.b, AbstractNodexSplashActivity.c(a), 3000L, 0x3091437a);
        }
        if (AbstractNodexSplashActivity.f(a) != null)
        {
            HandlerDetour.b(a.b, AbstractNodexSplashActivity.f(a), 10000L, 0xa12b542a);
        }
        AbstractNodexSplashActivity.a(a, a.e());
        obj = AbstractNodexSplashActivity.g(a).a();
        if (obj != null)
        {
            AbstractNodexSplashActivity.a(a, ((NodexError) (obj)));
            return;
        }
        AbstractNodexSplashActivity.a(a, a.f());
        if (!AbstractNodexSplashActivity.h(a).d() || AbstractNodexSplashActivity.h(a).c())
        {
            AbstractNodexSplashActivity.h(a).b();
        }
        obj = AbstractNodexSplashActivity.i(a).acquireContentProviderClient(a.h());
        if (obj == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1 = com.facebook.nodex.startup.warmup.Init;
        boolean flag = AbstractNodexSplashActivity.g(a).b();
        LightWeightPerfState.a();
        obj1 = NodexWarmupContentProvider.a(((com.facebook.nodex.startup.warmup.nable.a) (obj1)), flag, LightWeightPerfState.c());
        ((ContentProviderClient) (obj)).insert(a.h(), ((android.content.ContentValues) (obj1)));
        ((ContentProviderClient) (obj)).release();
_L4:
        class _cls1
            implements Runnable
        {

            final long a;
            final AbstractNodexSplashActivity.InitRunnable b;

            public void run()
            {
                (new StringBuilder("InitRunnable ")).append((int)((double)(System.nanoTime() - a) / 1000000D)).append(" ms");
                AbstractNodexSplashActivity.j(b.a);
            }

            _cls1(long l)
            {
                b = AbstractNodexSplashActivity.InitRunnable.this;
                a = l;
                super();
            }
        }

        HandlerDetour.a(a.b, new _cls1(l), 0xf2d55ce);
        return;
        Object obj2;
        obj2;
        Log.e(AbstractNodexSplashActivity.e(a), "Remote exception from main process.", ((Throwable) (obj2)));
        ((ContentProviderClient) (obj)).release();
        continue; /* Loop/switch isn't completed */
        obj2;
        ((ContentProviderClient) (obj)).release();
        throw obj2;
_L2:
        Log.e(AbstractNodexSplashActivity.e(a), "Failed to acquire provider to warmup the main process.");
        if (true) goto _L4; else goto _L3
_L3:
    }

    private _cls1(AbstractNodexSplashActivity abstractnodexsplashactivity)
    {
        a = abstractnodexsplashactivity;
        super();
    }

    a(AbstractNodexSplashActivity abstractnodexsplashactivity, byte byte0)
    {
        this(abstractnodexsplashactivity);
    }
}
