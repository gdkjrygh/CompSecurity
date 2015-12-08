// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;


// Referenced classes of package org.apache.commons.lang3.time:
//            DurationFormatUtils

public class StopWatch
{
    private static final class SplitState extends Enum
    {

        private static final SplitState $VALUES[];
        public static final SplitState SPLIT;
        public static final SplitState UNSPLIT;

        public static SplitState valueOf(String s)
        {
            return (SplitState)Enum.valueOf(org/apache/commons/lang3/time/StopWatch$SplitState, s);
        }

        public static SplitState[] values()
        {
            return (SplitState[])$VALUES.clone();
        }

        static 
        {
            SPLIT = new SplitState("SPLIT", 0);
            UNSPLIT = new SplitState("UNSPLIT", 1);
            $VALUES = (new SplitState[] {
                SPLIT, UNSPLIT
            });
        }

        private SplitState(String s, int i)
        {
            super(s, i);
        }
    }

    private static abstract class State extends Enum
    {

        private static final State $VALUES[];
        public static final State RUNNING;
        public static final State STOPPED;
        public static final State SUSPENDED;
        public static final State UNSTARTED;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(org/apache/commons/lang3/time/StopWatch$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        abstract boolean isStarted();

        abstract boolean isStopped();

        abstract boolean isSuspended();

        static 
        {
            UNSTARTED = new State("UNSTARTED", 0) {

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
            RUNNING = new State("RUNNING", 1) {

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
            STOPPED = new State("STOPPED", 2) {

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
            SUSPENDED = new State("SUSPENDED", 3) {

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
            $VALUES = (new State[] {
                UNSTARTED, RUNNING, STOPPED, SUSPENDED
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }

    }


    private State runningState;
    private long startTime;
    private long stopTime;

    public long getNanoTime()
    {
        if (runningState == State.STOPPED || runningState == State.SUSPENDED)
        {
            return stopTime - startTime;
        }
        if (runningState == State.UNSTARTED)
        {
            return 0L;
        }
        if (runningState == State.RUNNING)
        {
            return System.nanoTime() - startTime;
        } else
        {
            throw new RuntimeException("Illegal running state has occurred.");
        }
    }

    public long getTime()
    {
        return getNanoTime() / 0xf4240L;
    }

    public String toString()
    {
        return DurationFormatUtils.formatDurationHMS(getTime());
    }
}
