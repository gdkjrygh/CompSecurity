// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;


// Referenced classes of package org.apache.commons.lang3.time:
//            StopWatch

private static abstract class <init> extends Enum
{

    private static final SUSPENDED $VALUES[];
    public static final SUSPENDED RUNNING;
    public static final SUSPENDED STOPPED;
    public static final SUSPENDED SUSPENDED;
    public static final SUSPENDED UNSTARTED;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(org/apache/commons/lang3/time/StopWatch$State, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    abstract boolean isStarted();

    abstract boolean isStopped();

    abstract boolean isSuspended();

    static 
    {
        UNSTARTED = new StopWatch.State("UNSTARTED", 0) {

            boolean isStarted()
            {
                return false;
            }

            boolean isStopped()
            {
                return true;
            }

            boolean isSuspended()
            {
                return false;
            }

        };
        RUNNING = new StopWatch.State("RUNNING", 1) {

            boolean isStarted()
            {
                return true;
            }

            boolean isStopped()
            {
                return false;
            }

            boolean isSuspended()
            {
                return false;
            }

        };
        STOPPED = new StopWatch.State("STOPPED", 2) {

            boolean isStarted()
            {
                return false;
            }

            boolean isStopped()
            {
                return true;
            }

            boolean isSuspended()
            {
                return false;
            }

        };
        SUSPENDED = new StopWatch.State("SUSPENDED", 3) {

            boolean isStarted()
            {
                return true;
            }

            boolean isStopped()
            {
                return false;
            }

            boolean isSuspended()
            {
                return true;
            }

        };
        $VALUES = (new .VALUES[] {
            UNSTARTED, RUNNING, STOPPED, SUSPENDED
        });
    }

    private _cls4(String s, int i)
    {
        super(s, i);
    }

    _cls4(String s, int i, _cls4 _pcls4)
    {
        this(s, i);
    }
}
