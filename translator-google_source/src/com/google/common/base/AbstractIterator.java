// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.base:
//            p, a

abstract class AbstractIterator
    implements Iterator
{

    State a;
    private Object b;

    protected AbstractIterator()
    {
        a = State.NOT_READY;
    }

    protected abstract Object a();

    public final boolean hasNext()
    {
        boolean flag1 = false;
        boolean flag;
        if (a != State.FAILED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        flag = flag1;
        switch (a.a[a.ordinal()])
        {
        default:
            a = State.FAILED;
            b = a();
            flag = flag1;
            if (a != State.DONE)
            {
                a = State.READY;
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
            a = State.NOT_READY;
            Object obj = b;
            b = null;
            return obj;
        }
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }

    private class State extends Enum
    {

        public static final State DONE;
        public static final State FAILED;
        public static final State NOT_READY;
        public static final State READY;
        private static final State a[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/google/common/base/AbstractIterator$State, s);
        }

        public static State[] values()
        {
            return (State[])a.clone();
        }

        static 
        {
            READY = new State("READY", 0);
            NOT_READY = new State("NOT_READY", 1);
            DONE = new State("DONE", 2);
            FAILED = new State("FAILED", 3);
            a = (new State[] {
                READY, NOT_READY, DONE, FAILED
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }

}
