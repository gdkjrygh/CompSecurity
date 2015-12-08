// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.base:
//            Ticker, Preconditions

public final class Stopwatch
{

    private long elapsedNanos;
    private boolean isRunning;
    private long startTick;
    private final Ticker ticker;

    Stopwatch()
    {
        this(Ticker.systemTicker());
    }

    Stopwatch(Ticker ticker1)
    {
        ticker = (Ticker)Preconditions.checkNotNull(ticker1, "ticker");
    }

    private static String abbreviate(TimeUnit timeunit)
    {
        switch (_cls1..SwitchMap.java.util.concurrent.TimeUnit[timeunit.ordinal()])
        {
        default:
            throw new AssertionError();

        case 1: // '\001'
            return "ns";

        case 2: // '\002'
            return "\u03BCs";

        case 3: // '\003'
            return "ms";

        case 4: // '\004'
            return "s";

        case 5: // '\005'
            return "min";

        case 6: // '\006'
            return "h";

        case 7: // '\007'
            return "d";
        }
    }

    private static TimeUnit chooseUnit(long l)
    {
        if (TimeUnit.DAYS.convert(l, TimeUnit.NANOSECONDS) > 0L)
        {
            return TimeUnit.DAYS;
        }
        if (TimeUnit.HOURS.convert(l, TimeUnit.NANOSECONDS) > 0L)
        {
            return TimeUnit.HOURS;
        }
        if (TimeUnit.MINUTES.convert(l, TimeUnit.NANOSECONDS) > 0L)
        {
            return TimeUnit.MINUTES;
        }
        if (TimeUnit.SECONDS.convert(l, TimeUnit.NANOSECONDS) > 0L)
        {
            return TimeUnit.SECONDS;
        }
        if (TimeUnit.MILLISECONDS.convert(l, TimeUnit.NANOSECONDS) > 0L)
        {
            return TimeUnit.MILLISECONDS;
        }
        if (TimeUnit.MICROSECONDS.convert(l, TimeUnit.NANOSECONDS) > 0L)
        {
            return TimeUnit.MICROSECONDS;
        } else
        {
            return TimeUnit.NANOSECONDS;
        }
    }

    public static Stopwatch createStarted()
    {
        return (new Stopwatch()).start();
    }

    public static Stopwatch createStarted(Ticker ticker1)
    {
        return (new Stopwatch(ticker1)).start();
    }

    public static Stopwatch createUnstarted()
    {
        return new Stopwatch();
    }

    public static Stopwatch createUnstarted(Ticker ticker1)
    {
        return new Stopwatch(ticker1);
    }

    private long elapsedNanos()
    {
        if (isRunning)
        {
            return (ticker.read() - startTick) + elapsedNanos;
        } else
        {
            return elapsedNanos;
        }
    }

    public final long elapsed(TimeUnit timeunit)
    {
        return timeunit.convert(elapsedNanos(), TimeUnit.NANOSECONDS);
    }

    public final boolean isRunning()
    {
        return isRunning;
    }

    public final Stopwatch reset()
    {
        elapsedNanos = 0L;
        isRunning = false;
        return this;
    }

    public final Stopwatch start()
    {
        boolean flag;
        if (!isRunning)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "This stopwatch is already running.");
        isRunning = true;
        startTick = ticker.read();
        return this;
    }

    public final Stopwatch stop()
    {
        long l = ticker.read();
        Preconditions.checkState(isRunning, "This stopwatch is already stopped.");
        isRunning = false;
        long l1 = elapsedNanos;
        elapsedNanos = (l - startTick) + l1;
        return this;
    }

    public final String toString()
    {
        long l = elapsedNanos();
        TimeUnit timeunit = chooseUnit(l);
        return String.format("%.4g %s", new Object[] {
            Double.valueOf((double)l / (double)TimeUnit.NANOSECONDS.convert(1L, timeunit)), abbreviate(timeunit)
        });
    }

    /* member class not found */
    class _cls1 {}

}
