// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import android.view.MotionEvent;
import ggd;

// Referenced classes of package com.spotify.mobile.android.util:
//            TouchLifecycle

public abstract class <init> extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/spotify/mobile/android/util/TouchLifecycle$State, s);
    }

    public static <init>[] values()
    {
        return (<init>[])e.clone();
    }

    public abstract void a(TouchLifecycle touchlifecycle);

    public abstract void b(TouchLifecycle touchlifecycle);

    public abstract void c(TouchLifecycle touchlifecycle);

    public abstract boolean d(TouchLifecycle touchlifecycle);

    static 
    {
        a = new TouchLifecycle.State("IDLE") {

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
        b = new TouchLifecycle.State("UNDEFINED") {

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
        c = new TouchLifecycle.State("CAPTURED") {

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
        d = new TouchLifecycle.State("IGNORED") {

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
        e = (new e[] {
            a, b, c, d
        });
    }

    private _cls4(String s, int i)
    {
        super(s, i);
    }

    _cls4(String s, int i, byte byte0)
    {
        this(s, i);
    }
}
