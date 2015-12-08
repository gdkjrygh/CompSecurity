// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bl;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public final class g
{
    final class a extends Handler
    {

        private g a;

        public final void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 1 3: default 32
        //                       1 74
        //                       2 94
        //                       3 102;
               goto _L1 _L2 _L3 _L4
_L1:
            message = String.valueOf(message);
            throw new RuntimeException((new StringBuilder(String.valueOf(message).length() + 16)).append("Unknown message ").append(message).toString());
_L2:
            g.b(a).onShowPress(g.a(a));
_L6:
            return;
_L3:
            g.c(a);
            return;
_L4:
            if (g.d(a) != null && !g.e(a))
            {
                g.d(a).onSingleTapConfirmed(g.a(a));
                return;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        a(Handler handler)
        {
            a = g.this;
            super(handler.getLooper());
        }
    }


    static final int f = ViewConfiguration.getLongPressTimeout();
    static final int g = ViewConfiguration.getTapTimeout();
    static final int h = ViewConfiguration.getDoubleTapTimeout();
    int a;
    int b;
    int c;
    int d;
    int e;
    final Handler i;
    final android.view.GestureDetector.OnGestureListener j;
    android.view.GestureDetector.OnDoubleTapListener k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    MotionEvent p;
    MotionEvent q;
    boolean r;
    float s;
    float t;
    float u;
    float v;
    boolean w;
    VelocityTracker x;

    public g(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, Handler handler)
    {
        i = new a(handler);
        j = ongesturelistener;
        if (ongesturelistener instanceof android.view.GestureDetector.OnDoubleTapListener)
        {
            k = (android.view.GestureDetector.OnDoubleTapListener)ongesturelistener;
        }
        if (j == null)
        {
            throw new NullPointerException("OnGestureListener must not be null");
        }
        w = true;
        int i1;
        int j1;
        int k1;
        if (context == null)
        {
            i1 = ViewConfiguration.getTouchSlop();
            j1 = i1 * 2;
            d = ViewConfiguration.getMinimumFlingVelocity();
            e = ViewConfiguration.getMaximumFlingVelocity();
            k1 = i1;
        } else
        {
            context = ViewConfiguration.get(context);
            k1 = context.getScaledTouchSlop();
            i1 = context.getScaledTouchSlop();
            j1 = context.getScaledDoubleTapSlop();
            d = context.getScaledMinimumFlingVelocity();
            e = context.getScaledMaximumFlingVelocity();
        }
        a = k1 * k1;
        b = i1 * i1;
        c = j1 * j1;
    }

    static MotionEvent a(g g1)
    {
        return g1.p;
    }

    static android.view.GestureDetector.OnGestureListener b(g g1)
    {
        return g1.j;
    }

    static void c(g g1)
    {
        g1.i.removeMessages(3);
        g1.m = true;
        g1.j.onLongPress(g1.p);
    }

    static android.view.GestureDetector.OnDoubleTapListener d(g g1)
    {
        return g1.k;
    }

    static boolean e(g g1)
    {
        return g1.l;
    }

}
