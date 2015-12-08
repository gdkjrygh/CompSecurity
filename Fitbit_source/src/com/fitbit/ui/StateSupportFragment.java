// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.view.View;
import android.widget.TextView;
import com.fitbit.ui.fragments.FitbitFragment;

// Referenced classes of package com.fitbit.ui:
//            b

public abstract class StateSupportFragment extends FitbitFragment
{
    protected static final class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        public static final State d;
        public static final State e;
        private static final State f[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/fitbit/ui/StateSupportFragment$State, s);
        }

        public static State[] values()
        {
            return (State[])f.clone();
        }

        static 
        {
            a = new State("NONE", 0);
            b = new State("NORMAL", 1);
            c = new State("EMPTY", 2);
            d = new State("PROGRESS", 3);
            e = new State("ERROR", 4);
            f = (new State[] {
                a, b, c, d, e
            });
        }

        private State(String s, int k)
        {
            super(s, k);
        }
    }


    private boolean a;
    private boolean b;
    private boolean c;
    private CharSequence d;
    protected TextView g;
    protected View h;
    protected View i;
    protected View j;

    public StateSupportFragment()
    {
        a = false;
        b = false;
        c = false;
    }

    private void a()
    {
        if (b && !c)
        {
            a(State.b);
            return;
        }
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.savedstate.LoadSavedState.Status.values().length];
                try
                {
                    a[com.fitbit.savedstate.LoadSavedState.Status.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.savedstate.LoadSavedState.Status.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.savedstate.LoadSavedState.Status.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[d().ordinal()])
        {
        default:
            throw new IllegalArgumentException("Unsupported data state");

        case 1: // '\001'
            if (b)
            {
                State state;
                if (c)
                {
                    state = State.c;
                } else
                {
                    state = State.b;
                }
                a(state);
                return;
            } else
            {
                a(State.a);
                return;
            }

        case 2: // '\002'
            State state1;
            if (a)
            {
                state1 = State.d;
            } else
            {
                state1 = State.c;
            }
            a(state1);
            return;

        case 3: // '\003'
            break;
        }
        State state2;
        if (a)
        {
            state2 = State.d;
        } else
        {
            state2 = State.e;
        }
        a(state2);
    }

    protected void a(State state)
    {
        boolean flag = false;
        Object obj = h;
        int k;
        if (state == State.b)
        {
            k = 0;
        } else
        {
            k = 4;
        }
        ((View) (obj)).setVisibility(k);
        obj = g;
        if (state == State.c)
        {
            k = 0;
        } else
        {
            k = 4;
        }
        ((TextView) (obj)).setVisibility(k);
        obj = i;
        if (state == State.d)
        {
            k = 0;
        } else
        {
            k = 4;
        }
        ((View) (obj)).setVisibility(k);
        obj = j;
        if (state == State.e)
        {
            k = ((flag) ? 1 : 0);
        } else
        {
            k = 4;
        }
        ((View) (obj)).setVisibility(k);
        if (b(state))
        {
            g.setText(0x7f080189);
            return;
        } else
        {
            g.setText(d);
            return;
        }
    }

    protected void a(boolean flag)
    {
        a = flag;
        a();
    }

    protected void b(boolean flag)
    {
        b = flag;
        a();
    }

    protected boolean b(State state)
    {
        return d() == com.fitbit.savedstate.LoadSavedState.Status.a && state == State.c && !com.fitbit.ui.b.c(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.c);
    }

    protected void c(boolean flag)
    {
        c = flag;
        a();
    }

    protected abstract com.fitbit.savedstate.LoadSavedState.Status d();

    protected void f()
    {
        Object obj;
        if (g != null)
        {
            obj = g.getText();
        } else
        {
            obj = "";
        }
        d = ((CharSequence) (obj));
    }
}
