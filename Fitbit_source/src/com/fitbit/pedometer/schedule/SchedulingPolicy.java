// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.schedule;


public interface SchedulingPolicy
{
    public static final class ApplicationState extends Enum
    {

        public static final ApplicationState a;
        public static final ApplicationState b;
        public static final ApplicationState c;
        private static final ApplicationState d[];

        public static ApplicationState valueOf(String s)
        {
            return (ApplicationState)Enum.valueOf(com/fitbit/pedometer/schedule/SchedulingPolicy$ApplicationState, s);
        }

        public static ApplicationState[] values()
        {
            return (ApplicationState[])d.clone();
        }

        static 
        {
            a = new ApplicationState("FOREGROUND", 0);
            b = new ApplicationState("BACKGROUND", 1);
            c = new ApplicationState("SCREEN_OFF", 2);
            d = (new ApplicationState[] {
                a, b, c
            });
        }

        private ApplicationState(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract long a(ApplicationState applicationstate);

    public abstract boolean a();
}
