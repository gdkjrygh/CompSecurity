// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.util.Pair;
import com.fitbit.e.a;
import com.fitbit.runtrack.data.ExerciseSegment;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            f

public class ExerciseSessionStateBroadcaster
{
    private static final class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        private static final State d[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/fitbit/runtrack/ui/ExerciseSessionStateBroadcaster$State, s);
        }

        public static State[] values()
        {
            return (State[])d.clone();
        }

        static 
        {
            a = new State("FINISH", 0);
            b = new State("PAUSE", 1);
            c = new State("RESUME", 2);
            d = (new State[] {
                a, b, c
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String a = com/fitbit/runtrack/ui/ExerciseSessionStateBroadcaster.getSimpleName();
    private final List b = new LinkedList();
    private State c;
    private Pair d;

    public ExerciseSessionStateBroadcaster(ExerciseSession exercisesession, ExerciseSegment exercisesegment)
    {
        d = Pair.create(exercisesession, exercisesegment);
    }

    private void a(State state, ExerciseSession exercisesession, ExerciseSegment exercisesegment)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); a(state, (f)iterator.next(), exercisesession, exercisesegment)) { }
        c = state;
        d = Pair.create(exercisesession, exercisesegment);
    }

    private void a(State state, f f1, ExerciseSession exercisesession, ExerciseSegment exercisesegment)
    {
        if (state == null)
        {
            return;
        }
        String s = a;
        java.util.UUID uuid = exercisesession.getUuid();
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[State.values().length];
                try
                {
                    a[com.fitbit.runtrack.ui.State.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.runtrack.ui.State.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[State.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        Object obj;
        if (exercisesegment != null)
        {
            obj = Long.valueOf(exercisesegment.startEvent);
        } else
        {
            obj = "";
        }
        com.fitbit.e.a.a(s, String.format("Dispatching %s to %s for Session[%s:%s]", new Object[] {
            state, f1, uuid, obj
        }), new Object[0]);
        com.fitbit.runtrack.ui._cls1.a[state.ordinal()];
        JVM INSTR tableswitch 1 3: default 100
    //                   1 123
    //                   2 133
    //                   3 145;
           goto _L1 _L2 _L3 _L4
_L1:
        c = state;
        d = Pair.create(exercisesession, exercisesegment);
        return;
_L2:
        f1.a(exercisesession);
        continue; /* Loop/switch isn't completed */
_L3:
        f1.a(exercisesession, exercisesegment);
        continue; /* Loop/switch isn't completed */
_L4:
        f1.b(exercisesession, exercisesegment);
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void a()
    {
        b.clear();
    }

    public void a(ExerciseSession exercisesession)
    {
        a(com.fitbit.runtrack.ui.State.a, exercisesession, null);
    }

    public void a(ExerciseSession exercisesession, ExerciseSegment exercisesegment)
    {
        a(State.c, exercisesession, exercisesegment);
    }

    public void a(f f1, b b1)
    {
        b.add(f1);
        com.fitbit.e.a.a(a, String.format("Callback being registered, %s=%s", new Object[] {
            f1, c
        }), new Object[0]);
        if (d != null)
        {
            f1.a((ExerciseSession)d.first, b1);
        }
        if (c != null)
        {
            a(c, f1, (ExerciseSession)d.first, (ExerciseSegment)d.second);
        }
    }

    public void b(ExerciseSession exercisesession, ExerciseSegment exercisesegment)
    {
        a(com.fitbit.runtrack.ui.State.b, exercisesession, exercisesegment);
    }

}
