// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;


// Referenced classes of package org.apache.commons.lang3.time:
//            DurationFormatUtils

public class StopWatch
{

    private static final long NANO_2_MILLIS = 0xf4240L;
    private static final int STATE_RUNNING = 1;
    private static final int STATE_SPLIT = 11;
    private static final int STATE_STOPPED = 2;
    private static final int STATE_SUSPENDED = 3;
    private static final int STATE_UNSPLIT = 10;
    private static final int STATE_UNSTARTED = 0;
    private int runningState;
    private int splitState;
    private long startTime;
    private long startTimeMillis;
    private long stopTime;

    public StopWatch()
    {
        runningState = 0;
        splitState = 10;
    }

    public long getNanoTime()
    {
        if (runningState == 2 || runningState == 3)
        {
            return stopTime - startTime;
        }
        if (runningState == 0)
        {
            return 0L;
        }
        if (runningState == 1)
        {
            return System.nanoTime() - startTime;
        } else
        {
            throw new RuntimeException("Illegal running state has occured. ");
        }
    }

    public long getSplitNanoTime()
    {
        if (splitState != 11)
        {
            throw new IllegalStateException("Stopwatch must be split to get the split time. ");
        } else
        {
            return stopTime - startTime;
        }
    }

    public long getSplitTime()
    {
        return getSplitNanoTime() / 0xf4240L;
    }

    public long getStartTime()
    {
        if (runningState == 0)
        {
            throw new IllegalStateException("Stopwatch has not been started");
        } else
        {
            return startTimeMillis;
        }
    }

    public long getTime()
    {
        return getNanoTime() / 0xf4240L;
    }

    public void reset()
    {
        runningState = 0;
        splitState = 10;
    }

    public void resume()
    {
        if (runningState != 3)
        {
            throw new IllegalStateException("Stopwatch must be suspended to resume. ");
        } else
        {
            startTime = startTime + (System.nanoTime() - stopTime);
            runningState = 1;
            return;
        }
    }

    public void split()
    {
        if (runningState != 1)
        {
            throw new IllegalStateException("Stopwatch is not running. ");
        } else
        {
            stopTime = System.nanoTime();
            splitState = 11;
            return;
        }
    }

    public void start()
    {
        if (runningState == 2)
        {
            throw new IllegalStateException("Stopwatch must be reset before being restarted. ");
        }
        if (runningState != 0)
        {
            throw new IllegalStateException("Stopwatch already started. ");
        } else
        {
            startTime = System.nanoTime();
            startTimeMillis = System.currentTimeMillis();
            runningState = 1;
            return;
        }
    }

    public void stop()
    {
        if (runningState != 1 && runningState != 3)
        {
            throw new IllegalStateException("Stopwatch is not running. ");
        }
        if (runningState == 1)
        {
            stopTime = System.nanoTime();
        }
        runningState = 2;
    }

    public void suspend()
    {
        if (runningState != 1)
        {
            throw new IllegalStateException("Stopwatch must be running to suspend. ");
        } else
        {
            stopTime = System.nanoTime();
            runningState = 3;
            return;
        }
    }

    public String toSplitString()
    {
        return DurationFormatUtils.formatDurationHMS(getSplitTime());
    }

    public String toString()
    {
        return DurationFormatUtils.formatDurationHMS(getTime());
    }

    public void unsplit()
    {
        if (splitState != 11)
        {
            throw new IllegalStateException("Stopwatch has not been split. ");
        } else
        {
            splitState = 10;
            return;
        }
    }
}
