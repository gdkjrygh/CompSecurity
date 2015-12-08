// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.management;


public interface InvocationStatistics
{

    public abstract long getAverageTime();

    public abstract long getCallCount();

    public abstract long getErrorCount();

    public abstract String getName();

    public abstract long getTotalTime();

    public abstract void reset();
}
