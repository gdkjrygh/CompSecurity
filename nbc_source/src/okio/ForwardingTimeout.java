// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package okio:
//            Timeout

public class ForwardingTimeout extends Timeout
{

    private Timeout _flddelegate;

    public ForwardingTimeout(Timeout timeout1)
    {
        if (timeout1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            _flddelegate = timeout1;
            return;
        }
    }

    public Timeout clearDeadline()
    {
        return _flddelegate.clearDeadline();
    }

    public Timeout clearTimeout()
    {
        return _flddelegate.clearTimeout();
    }

    public long deadlineNanoTime()
    {
        return _flddelegate.deadlineNanoTime();
    }

    public Timeout deadlineNanoTime(long l)
    {
        return _flddelegate.deadlineNanoTime(l);
    }

    public final Timeout _mthdelegate()
    {
        return _flddelegate;
    }

    public boolean hasDeadline()
    {
        return _flddelegate.hasDeadline();
    }

    public final ForwardingTimeout setDelegate(Timeout timeout1)
    {
        if (timeout1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            _flddelegate = timeout1;
            return this;
        }
    }

    public void throwIfReached()
        throws IOException
    {
        _flddelegate.throwIfReached();
    }

    public Timeout timeout(long l, TimeUnit timeunit)
    {
        return _flddelegate.timeout(l, timeunit);
    }

    public long timeoutNanos()
    {
        return _flddelegate.timeoutNanos();
    }
}
