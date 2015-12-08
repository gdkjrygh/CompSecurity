// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class s
{

    public static final s b = new s() {

        public final s a(long l)
        {
            return this;
        }

        public final s a(long l, TimeUnit timeunit)
        {
            return this;
        }

        public final void f()
            throws IOException
        {
        }

    };
    private boolean a;
    private long c;
    private long d;

    public s()
    {
    }

    public s a(long l)
    {
        a = true;
        c = l;
        return this;
    }

    public s a(long l, TimeUnit timeunit)
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
            d = timeunit.toNanos(l);
            return this;
        }
    }

    public long c()
    {
        if (!a)
        {
            throw new IllegalStateException("No deadline");
        } else
        {
            return c;
        }
    }

    public s d()
    {
        d = 0L;
        return this;
    }

    public void f()
        throws IOException
    {
        if (Thread.interrupted())
        {
            throw new InterruptedIOException("thread interrupted");
        }
        if (a && c - System.nanoTime() <= 0L)
        {
            throw new InterruptedIOException("deadline reached");
        } else
        {
            return;
        }
    }

    public long t_()
    {
        return d;
    }

    public boolean u_()
    {
        return a;
    }

    public s v_()
    {
        a = false;
        return this;
    }

}
