// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class eik
{

    private final hfk a;
    private final noz b;
    private final float c;
    private final long d;
    private final boolean e = false;

    public eik(Context context, eil eil1)
    {
        a = (hfk)olm.a(context, hfk);
        c = eil1.a;
        d = eil1.b;
        b = noz.a(context, 4, "SyncExecutor", new String[0]);
    }

    public final boolean a(Runnable runnable)
    {
        Object obj;
        if (b.a())
        {
            noy.a("executor", this);
        }
        obj = a.a();
        if (((hfi) (obj)).a > c) goto _L2; else goto _L1
_L1:
        if (b.a())
        {
            noy.a("minimumBatteryLevel", Float.valueOf(c));
            noy.a("currentBatteryCharge", Float.valueOf(((hfi) (obj)).a));
        }
_L4:
        return false;
_L2:
        if (e && !((hfi) (obj)).c) goto _L4; else goto _L3
_L3:
        long l;
        l = noy.a();
        obj = Executors.newCachedThreadPool();
        ((ExecutorService) (obj)).submit(runnable).get(d, TimeUnit.MILLISECONDS);
        ((ExecutorService) (obj)).shutdownNow();
        return true;
        runnable;
        ((ExecutorService) (obj)).shutdownNow();
        return false;
        runnable;
        ((ExecutorService) (obj)).shutdownNow();
        return false;
        runnable;
        ((ExecutorService) (obj)).shutdownNow();
        return false;
        runnable;
        if (b.a())
        {
            noy.a("elapsedTime", l);
        }
        ((ExecutorService) (obj)).shutdownNow();
        return false;
        runnable;
        ((ExecutorService) (obj)).shutdownNow();
        throw runnable;
    }

    public final String toString()
    {
        String s = String.valueOf("ConditionalTaskExecutor{minimumBatteryLevel: ");
        float f = c;
        long l = d;
        boolean flag = e;
        return (new StringBuilder(String.valueOf(s).length() + 79)).append(s).append(f).append(", timeoutMillis: ").append(l).append(", whileChargingOnly: ").append(flag).append("}").toString();
    }
}
