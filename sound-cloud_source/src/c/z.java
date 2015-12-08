// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package c:
//            A

public class z
{

    public static final z b = new A();
    private long a;
    public boolean c;
    long d;

    public z()
    {
    }

    public z a(long l)
    {
        c = true;
        a = l;
        return this;
    }

    public z a(long l, TimeUnit timeunit)
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

    public final long f()
    {
        if (!c)
        {
            throw new IllegalStateException("No deadline");
        } else
        {
            return a;
        }
    }

    public void g()
        throws IOException
    {
        if (Thread.interrupted())
        {
            throw new InterruptedIOException();
        }
        if (c && System.nanoTime() > a)
        {
            throw new IOException("deadline reached");
        } else
        {
            return;
        }
    }

}
