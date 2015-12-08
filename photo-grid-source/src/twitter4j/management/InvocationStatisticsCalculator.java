// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.management;


// Referenced classes of package twitter4j.management:
//            InvocationStatistics

public class InvocationStatisticsCalculator
    implements InvocationStatistics
{

    private long callCount;
    private long errorCount;
    private int index;
    private String name;
    private long times[];
    private long totalTime;

    public InvocationStatisticsCalculator(String s, int i)
    {
        name = s;
        times = new long[i];
    }

    public long getAverageTime()
    {
        long l = 0L;
        this;
        JVM INSTR monitorenter ;
        int j = Math.min(Math.abs((int)callCount), times.length);
        if (j != 0) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        int i;
        l = 0L;
        i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        l += times[i];
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        l /= j;
        if (true) goto _L1; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public long getCallCount()
    {
        return callCount;
    }

    public long getErrorCount()
    {
        return errorCount;
    }

    public String getName()
    {
        return name;
    }

    public long getTotalTime()
    {
        return totalTime;
    }

    void increment(long l, boolean flag)
    {
        long l1 = 1L;
        callCount = callCount + 1L;
        long l2 = errorCount;
        if (flag)
        {
            l1 = 0L;
        }
        errorCount = l1 + l2;
        totalTime = totalTime + l;
        times[index] = l;
        int i = index + 1;
        index = i;
        if (i >= times.length)
        {
            index = 0;
        }
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        callCount = 0L;
        errorCount = 0L;
        totalTime = 0L;
        times = new long[times.length];
        index = 0;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("calls=").append(getCallCount()).append(",errors=").append(getErrorCount()).append(",totalTime=").append(getTotalTime()).append(",avgTime=").append(getAverageTime());
        return stringbuilder.toString();
    }
}
