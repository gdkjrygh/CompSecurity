// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;

public final class ab
    implements android.support.v7.widget.RecyclerView.OnItemTouchListener
{
    public static interface a
    {

        public abstract void a(int i);
    }


    private a a;
    private boolean b;
    private GestureDetector c;

    public ab(Context context, a a1)
    {
        b = true;
        a = a1;
        c = new GestureDetector(context, new android.view.GestureDetector.SimpleOnGestureListener() {

            long a;
            long b;
            final ab c;

            public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
            {
                if (motionevent != null)
                {
                    a = motionevent.getEventTime();
                }
                if (motionevent1 != null)
                {
                    b = motionevent1.getEventTime();
                }
                (new StringBuilder("Fling detected: ")).append(a).append(", end: ").append(b);
                return false;
            }

            public final boolean onSingleTapUp(MotionEvent motionevent)
            {
                long l = motionevent.getEventTime();
                if (b > -1L && l - b < 700L)
                {
                    (new StringBuilder("Fling Ended: ")).append(b).append(", tap time: ").append(l).append(", diff: ").append(l - b).append(", return: false");
                    return false;
                } else
                {
                    (new StringBuilder("Fling Ended: ")).append(b).append(", tap time: ").append(l).append(", diff: ").append(l - b).append(", return: true");
                    return true;
                }
            }

            
            {
                c = ab.this;
                super();
                a = -1L;
                b = -1L;
            }
        });
    }

    public final boolean onInterceptTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
    {
        android.view.View view;
        if (b)
        {
            if ((view = recyclerview.findChildViewUnder(motionevent.getX(), motionevent.getY())) != null && a != null && c.onTouchEvent(motionevent))
            {
                a.a(recyclerview.getChildAdapterPosition(view));
                return true;
            }
        }
        return false;
    }

    public final void onRequestDisallowInterceptTouchEvent(boolean flag)
    {
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }

    public final void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
    {
        int i = motionevent.getActionMasked();
        c.onTouchEvent(motionevent);
        switch (i)
        {
        case 2: // '\002'
        default:
            return;

        case 0: // '\0'
            b = true;
            return;

        case 3: // '\003'
            b = false;
            return;

        case 1: // '\001'
            b = false;
            return;
        }
    }
}
