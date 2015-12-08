// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

final class bvj
    implements buy
{

    private bvd a;

    bvj(bvd bvd1)
    {
        a = bvd1;
        super();
    }

    public final void a(Exception exception)
    {
        Log.e(bvd.a(), "exception in muxer feeder", exception);
        bvd.a(a, true);
        synchronized (bvd.a(a))
        {
            if (bvd.b(a) != null)
            {
                bvd.b(a).interrupt();
            }
        }
        return;
        exception1;
        exception;
        JVM INSTR monitorexit ;
        throw exception1;
    }
}
