// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.f;

import rx.b.a;

final class j
    implements a
{

    private final a a;
    private final rx.R.a b;
    private final long c;

    public j(a a1, rx.R.a a2, long l)
    {
        a = a1;
        b = a2;
        c = l;
    }

    public final void call()
    {
        if (!b.isUnsubscribed()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (c <= System.currentTimeMillis())
        {
            continue; /* Loop/switch isn't completed */
        }
        long l = c - System.currentTimeMillis();
        if (l <= 0L)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            Thread.sleep(l);
        }
        catch (InterruptedException interruptedexception)
        {
            Thread.currentThread().interrupt();
            throw new RuntimeException(interruptedexception);
        }
        if (b.isUnsubscribed()) goto _L1; else goto _L3
_L3:
        a.call();
        return;
    }
}
