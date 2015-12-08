// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public final class o
{
    final class a extends Handler
    {

        private o a;

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
            o.b(a).onShowPress(o.a(a));
_L6:
            return;
_L3:
            o.c(a);
            return;
_L4:
            if (o.d(a) != null && !o.e(a))
            {
                o.d(a).onSingleTapConfirmed(o.a(a));
                return;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        a()
        {
            a = o.this;
            super();
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

    public o(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener)
    {
        this(context, ongesturelistener, (byte)0);
    }

    private o(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, byte byte0)
    {
        i = new a();
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
        if (context == null)
        {
            byte0 = ViewConfiguration.getTouchSlop();
            i1 = byte0 * 2;
            d = ViewConfiguration.getMinimumFlingVelocity();
            e = ViewConfiguration.getMaximumFlingVelocity();
            j1 = byte0;
        } else
        {
            context = ViewConfiguration.get(context);
            j1 = context.getScaledTouchSlop();
            byte0 = context.getScaledTouchSlop();
            i1 = context.getScaledDoubleTapSlop();
            d = context.getScaledMinimumFlingVelocity();
            e = context.getScaledMaximumFlingVelocity();
        }
        a = j1 * j1;
        b = byte0 * byte0;
        c = i1 * i1;
    }

    static MotionEvent a(o o1)
    {
        return o1.p;
    }

    static android.view.GestureDetector.OnGestureListener b(o o1)
    {
        return o1.j;
    }

    static void c(o o1)
    {
        o1.i.removeMessages(3);
        o1.m = true;
        o1.j.onLongPress(o1.p);
    }

    static android.view.GestureDetector.OnDoubleTapListener d(o o1)
    {
        return o1.k;
    }

    static boolean e(o o1)
    {
        return o1.l;
    }

}
