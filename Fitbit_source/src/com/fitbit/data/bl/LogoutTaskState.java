// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.FitBitApplication;

public final class LogoutTaskState
{
    public static final class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        public static final State d;
        private static final State e[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/fitbit/data/bl/LogoutTaskState$State, s);
        }

        public static State[] values()
        {
            return (State[])e.clone();
        }

        static 
        {
            a = new State("UNKNOWN", 0);
            b = new State("PROGRESS", 1);
            c = new State("IN_ERROR", 2);
            d = new State("COMPLETED", 3);
            e = (new State[] {
                a, b, c, d
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String a = "com.fitbit.data.bl.LOGOUT_TASK_STATE_CHANGED";
    private static LogoutTaskState b;
    private State c;
    private Exception d;

    private LogoutTaskState()
    {
        c = State.a;
    }

    public static State a()
    {
        return d().c;
    }

    protected static void a(State state)
    {
        if (d().c == state)
        {
            return;
        } else
        {
            d().c = state;
            e();
            return;
        }
    }

    protected static void a(Exception exception)
    {
        d().d = exception;
    }

    public static Exception b()
    {
        return d().d;
    }

    public static void c()
    {
        a(State.a);
    }

    private static LogoutTaskState d()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com/fitbit/data/bl/LogoutTaskState;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new LogoutTaskState();
        }
        com/fitbit/data/bl/LogoutTaskState;
        JVM INSTR monitorexit ;
_L2:
        return b;
        Exception exception;
        exception;
        com/fitbit/data/bl/LogoutTaskState;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static void e()
    {
        Intent intent = new Intent("com.fitbit.data.bl.LOGOUT_TASK_STATE_CHANGED");
        LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcast(intent);
    }
}
