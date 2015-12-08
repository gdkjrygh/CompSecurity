// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.util;

import com.google.common.base.Preconditions;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.libraries.commerce.ocr.util:
//            Ticker

public final class Stopwatch
{

    private long elapsedNanos;
    private boolean isRunning;
    private long startTick;
    private final Ticker ticker;

    private Stopwatch()
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
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MICROSECONDS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MILLISECONDS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.SECONDS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MINUTES.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.HOURS.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.DAYS.ordinal()] = 7;
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
