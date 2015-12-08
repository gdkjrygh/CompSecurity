// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class Timeout
{

    public static final Timeout NONE = new Timeout() {

        public final Timeout deadlineNanoTime(long l)
        {
            return this;
        }

        public final void throwIfReached()
            throws IOException
        {
        }

        public final Timeout timeout(long l, TimeUnit timeunit)
        {
            return this;
        }

    };
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public Timeout()
    {
    }

    public final Timeout clearDeadline()
    {
        hasDeadline = false;
        return this;
    }

    public final long deadlineNanoTime()
    {
        if (!hasDeadline)
        {
            throw new IllegalStateException("No deadline");
        } else
        {
            return deadlineNanoTime;
        }
    }

    public Timeout deadlineNanoTime(long l)
    {
        hasDeadline = true;
        deadlineNanoTime = l;
        return this;
    }

    public final boolean hasDeadline()
    {
        return hasDeadline;
    }

    public void throwIfReached()
        throws IOException
    {
        if (Thread.interrupted())
        {
            throw new InterruptedIOException();
        }
        if (hasDeadline && System.nanoTime() > deadlineNanoTime)
        {
            throw new IOException("deadline reached");
        } else
        {
            return;
        }
    }

    public Timeout timeout(long l, TimeUnit timeunit)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("timeout < 0: ")).append(l).toString());
        }
        if (timeunit == null)
        {
            throw new IllegalArgumentException("unit == null");
        } else
        {
            timeoutNanos = timeunit.toNanos(l);
            return this;
        }
    }

    public final long timeoutNanos()
    {
        return timeoutNanos;
    }

}
