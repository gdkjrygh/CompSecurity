// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class hcx
{

    public static final hcx b = new hcx() {

        public final hcx a(long l)
        {
            return this;
        }

        public final hcx a(long l, TimeUnit timeunit)
        {
            return this;
        }

        public final void f()
        {
        }

    };
    private boolean a;
    private long c;
    private long d;

    public hcx()
    {
    }

    public long W_()
    {
        return d;
    }

    public boolean X_()
    {
        return a;
    }

    public hcx Y_()
    {
        a = false;
        return this;
    }

    public hcx a(long l)
    {
        a = true;
        c = l;
        return this;
    }

    public hcx a(long l, TimeUnit timeunit)
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

    public hcx d()
    {
        d = 0L;
        return this;
    }

    public void f()
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

}
