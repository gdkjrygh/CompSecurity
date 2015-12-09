// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class RoughGauge extends ImageView
{
    public static final class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        private static final State d[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/fitbit/customui/RoughGauge$State, s);
        }

        public static State[] values()
        {
            return (State[])d.clone();
        }

        static 
        {
            a = new State("UNDER", 0);
            b = new State("ZONE", 1);
            c = new State("OVER", 2);
            d = (new State[] {
                a, b, c
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    public RoughGauge(Context context)
    {
        super(context);
        a();
    }

    public RoughGauge(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public RoughGauge(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        setImageResource(0x7f020203);
    }

    public void a(State state)
    {
    /* anonymous class not found */
    class _anm1 {}

        switch (_cls1.a[state.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            setImageResource(0x7f020203);
            return;

        case 2: // '\002'
            setImageResource(0x7f020204);
            return;

        case 3: // '\003'
            setImageResource(0x7f020202);
            break;
        }
    }
}
