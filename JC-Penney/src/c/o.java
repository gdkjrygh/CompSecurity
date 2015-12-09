// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.util.concurrent.TimeUnit;

// Referenced classes of package c:
//            ae

public class o extends ae
{

    private ae a;

    public o(ae ae1)
    {
        if (ae1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            a = ae1;
            return;
        }
    }

    public final ae a()
    {
        return a;
    }

    public final o a(ae ae1)
    {
        if (ae1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            a = ae1;
            return this;
        }
    }

    public ae clearDeadline()
    {
        return a.clearDeadline();
    }

    public ae clearTimeout()
    {
        return a.clearTimeout();
    }

    public long deadlineNanoTime()
    {
        return a.deadlineNanoTime();
    }

    public ae deadlineNanoTime(long l)
    {
        return a.deadlineNanoTime(l);
    }

    public boolean hasDeadline()
    {
        return a.hasDeadline();
    }

    public void throwIfReached()
    {
        a.throwIfReached();
    }

    public ae timeout(long l, TimeUnit timeunit)
    {
        return a.timeout(l, timeunit);
    }

    public long timeoutNanos()
    {
        return a.timeoutNanos();
    }
}
