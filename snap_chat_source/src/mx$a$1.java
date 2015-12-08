// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

final class ng.Object
    implements Runnable
{

    final ng.Object this$1;
    final mx val$this$0;

    public final void run()
    {
        do
        {
            if (!sRunning)
            {
                break;
            }
            int i = ounter.getAndIncrement();
            if (i >= mx.a(_fld0))
            {
                break;
            }
            try
            {
                ng.Object obj = this._cls1.this;
                ct ct = new <init>(obj, i);
                mx.c(obj._fld0).execute(new <init>(obj, ct));
                PG.a(mx.b(_fld0) * 1000L);
            }
            catch (Exception exception) { }
        } while (true);
        Timber.a("PingServerController", "Stop ping request", new Object[0]);
    }

    ption()
    {
        this$1 = final_ption;
        val$this$0 = mx.this;
        super();
    }
}
