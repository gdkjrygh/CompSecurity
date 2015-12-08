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

    public Stopwatch()
    {
        this(Ticker.systemTicker());
    }

    private Stopwatch(Ticker ticker1)
    {
        ticker = (Ticker)Preconditions.checkNotNull(ticker1, "ticker");
    }

    private static String abbreviate(TimeUnit timeunit)
    {
        static final class _cls1
        {

            static final int $SwitchMap$java$util$concurrent$TimeUnit[];

            static 
            {
                $SwitchMap$java$util$concurrent$TimeUnit = new int[TimeUnit.values().length];
                try
                {
                    $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.NANOSECONDS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MICROSECONDS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MILLISECONDS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.SECONDS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

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
        }
    }

    private static TimeUnit chooseUnit(long l)
    {
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

    public static Stopwatch createUnstarted()
    {
        return new Stopwatch();
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
        elapsedNanos = elapsedNanos + (l - startTick);
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
}
