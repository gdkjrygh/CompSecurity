// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import android.view.MotionEvent;
import ggd;

public final class TouchLifecycle
{

    public final ggd a;
    public State b;
    public float c;
    public float d;
    public MotionEvent e;
    public boolean f;

    public TouchLifecycle(ggd ggd1)
    {
        a = ggd1;
        b = State.a;
    }

    static boolean a(TouchLifecycle touchlifecycle)
    {
        int i = touchlifecycle.e.getActionMasked();
        return i == 1 || i == 3;
    }

    static void b(TouchLifecycle touchlifecycle)
    {
        touchlifecycle.a.d();
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
            return (State)Enum.valueOf(com/spotify/mobile/android/util/TouchLifecycle$State, s);
        }

        public static State[] values()
        {
            return (State[])e.clone();
        }

        public abstract void a(TouchLifecycle touchlifecycle);

        public abstract void b(TouchLifecycle touchlifecycle);

        public abstract void c(TouchLifecycle touchlifecycle);

        public abstract boolean d(TouchLifecycle touchlifecycle);

        static 
        {
            a = new State("IDLE") {

                final void a(TouchLifecycle touchlifecycle)
                {
                    touchlifecycle.a.a();
                    touchlifecycle.b = b;
                }

                final void b(TouchLifecycle touchlifecycle)
                {
                    throw new IllegalStateException();
                }

                final void c(TouchLifecycle touchlifecycle)
                {
                    throw new IllegalStateException();
                }

                final boolean d(TouchLifecycle touchlifecycle)
                {
                    throw new IllegalStateException();
                }

            };
            b = new State("UNDEFINED") {

                final void a(TouchLifecycle touchlifecycle)
                {
                }

                final void b(TouchLifecycle touchlifecycle)
                {
                    touchlifecycle.b = c;
                }

                final void c(TouchLifecycle touchlifecycle)
                {
                    touchlifecycle.a.b();
                    touchlifecycle.b = d;
                }

                final boolean d(TouchLifecycle touchlifecycle)
                {
                    boolean flag = true;
                    boolean flag1 = touchlifecycle.a.a(touchlifecycle.e);
                    if (TouchLifecycle.a(touchlifecycle))
                    {
                        if (touchlifecycle.e.getActionMasked() != 1)
                        {
                            flag = false;
                        }
                        if (flag)
                        {
                            touchlifecycle.a.c();
                        }
                        TouchLifecycle.b(touchlifecycle);
                        touchlifecycle.b = a;
                    }
                    return flag1;
                }

            };
            c = new State("CAPTURED") {

                final void a(TouchLifecycle touchlifecycle)
                {
                    throw new IllegalStateException();
                }

                final void b(TouchLifecycle touchlifecycle)
                {
                }

                final void c(TouchLifecycle touchlifecycle)
                {
                }

                final boolean d(TouchLifecycle touchlifecycle)
                {
                    boolean flag = touchlifecycle.a.b(touchlifecycle.e);
                    if (TouchLifecycle.a(touchlifecycle))
                    {
                        TouchLifecycle.b(touchlifecycle);
                        touchlifecycle.b = a;
                    }
                    return flag;
                }

            };
            d = new State("IGNORED") {

                final void a(TouchLifecycle touchlifecycle)
                {
                    throw new IllegalStateException();
                }

                final void b(TouchLifecycle touchlifecycle)
                {
                }

                final void c(TouchLifecycle touchlifecycle)
                {
                }

                final boolean d(TouchLifecycle touchlifecycle)
                {
                    if (TouchLifecycle.a(touchlifecycle))
                    {
                        TouchLifecycle.b(touchlifecycle);
                        touchlifecycle.b = a;
                    }
                    return false;
                }

            };
            e = (new State[] {
                a, b, c, d
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }

        State(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }

}
