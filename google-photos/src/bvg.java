// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.concurrent.atomic.AtomicLong;

final class bvg
    implements Runnable
{

    private AtomicLong a;
    private bvf b;

    bvg(bvf bvf1, AtomicLong atomiclong)
    {
        b = bvf1;
        a = atomiclong;
        super();
    }

    public final void run()
    {
        try
        {
            a.set(bvd.b(b.b, b.a));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.w(bvd.a(), "interrupted while encoding");
            return;
        }
        catch (cri cri1)
        {
            bvd.b(b.b, true);
            bvd.a(b.b, true);
            return;
        }
        catch (Exception exception)
        {
            Log.e(bvd.a(), "exception while encoding", exception);
        }
        bvd.a(b.b, true);
    }
}
