// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctz;
import cvh;
import java.util.NoSuchElementException;

public abstract class AbstractIterator extends cvh
{

    public State a;
    private Object b;

    public AbstractIterator()
    {
        a = State.b;
    }

    public abstract Object a();

    public final boolean hasNext()
    {
        boolean flag1 = false;
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[State.values().length];
                try
                {
                    a[State.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[State.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        boolean flag;
        if (a != State.d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.b(flag);
        flag = flag1;
        switch (_cls1.a[a.ordinal()])
        {
        default:
            a = State.d;
            b = a();
            flag = flag1;
            if (a != State.c)
            {
                a = State.a;
                flag = true;
            }
            // fall through

        case 1: // '\001'
            return flag;

        case 2: // '\002'
            return true;
        }
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            a = State.b;
            Object obj = b;
            b = null;
            return obj;
        }
    }

    private class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        public static final State d;
        private static final State e[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/google/common/collect/AbstractIterator$State, s);
        }

        public static State[] values()
        {
            return (State[])e.clone();
        }

        static 
        {
            a = new State("READY", 0);
            b = new State("NOT_READY", 1);
            c = new State("DONE", 2);
            d = new State("FAILED", 3);
            e = (new State[] {
                a, b, c, d
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }

}
