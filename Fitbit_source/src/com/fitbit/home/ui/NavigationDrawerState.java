// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;


public final class NavigationDrawerState
{
    public static final class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        public static final State d;
        public static final State e;
        private static final State f[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/fitbit/home/ui/NavigationDrawerState$State, s);
        }

        public static State[] values()
        {
            return (State[])f.clone();
        }

        static 
        {
            a = new State("OPEN", 0);
            b = new State("CLOSE", 1);
            c = new State("PROCESSING_OPEN", 2);
            d = new State("PROCESSING_CLOSE", 3);
            e = new State("UNKNOWN", 4);
            f = (new State[] {
                a, b, c, d, e
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    private static NavigationDrawerState a;
    private State b;

    public NavigationDrawerState()
    {
        b = State.e;
    }

    public static State a()
    {
        return d().b;
    }

    public static void a(State state)
    {
        com/fitbit/home/ui/NavigationDrawerState;
        JVM INSTR monitorenter ;
        d().b = state;
        com/fitbit/home/ui/NavigationDrawerState;
        JVM INSTR monitorexit ;
        return;
        state;
        throw state;
    }

    public static void b()
    {
        d().b = State.e;
    }

    public static void c()
    {
        if (d().b == State.b)
        {
            a(State.c);
        } else
        if (d().b == State.a)
        {
            a(State.d);
            return;
        }
    }

    private static NavigationDrawerState d()
    {
        if (a == null)
        {
            a = new NavigationDrawerState();
        }
        return a;
    }
}
