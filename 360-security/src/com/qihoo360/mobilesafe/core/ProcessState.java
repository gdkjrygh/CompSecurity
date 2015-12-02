// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core;


public class ProcessState
{
    public static final class State extends Enum
    {

        public static final State STATE_CANCEL;
        public static final State STATE_DOING;
        public static final State STATE_FINISH;
        public static final State STATE_NULL;
        public static final State STATE_PREPARE;
        private static final State a[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/qihoo360/mobilesafe/core/ProcessState$State, s);
        }

        public static State[] values()
        {
            State astate[] = a;
            int i = astate.length;
            State astate1[] = new State[i];
            System.arraycopy(astate, 0, astate1, 0, i);
            return astate1;
        }

        static 
        {
            STATE_NULL = new State("STATE_NULL", 0);
            STATE_PREPARE = new State("STATE_PREPARE", 1);
            STATE_DOING = new State("STATE_DOING", 2);
            STATE_FINISH = new State("STATE_FINISH", 3);
            STATE_CANCEL = new State("STATE_CANCEL", 4);
            a = (new State[] {
                STATE_NULL, STATE_PREPARE, STATE_DOING, STATE_FINISH, STATE_CANCEL
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    protected volatile State b;

    public ProcessState()
    {
    }

    protected void b()
    {
        b = State.STATE_DOING;
    }

    protected void c()
    {
        b = State.STATE_FINISH;
    }

    protected void d()
    {
        b = State.STATE_PREPARE;
    }

    public boolean e()
    {
        boolean flag = false;
        if (b == State.STATE_DOING || b == State.STATE_PREPARE)
        {
            flag = true;
        }
        return flag;
    }
}
