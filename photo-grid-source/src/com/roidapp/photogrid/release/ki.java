// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.MotionEvent;

// Referenced classes of package com.roidapp.photogrid.release:
//            kg, ImageSelector, ig

final class ki
    implements android.view.GestureDetector.OnGestureListener
{

    final kg a;

    ki(kg kg1)
    {
        a = kg1;
        super();
    }

    public final boolean onDown(MotionEvent motionevent)
    {
        return false;
    }

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (kg.a(a))
        {
            if (motionevent.getX() - motionevent1.getX() >= 100F)
            {
                if (kg.b(a) == kg.c(a).b.length - 1)
                {
                    kg.a(a, 0);
                } else
                {
                    kg.a(a, kg.b(a) + 1);
                }
                kg.a(a, new ig(kg.c(a).b[kg.b(a)]));
                kg.a(a, kg.c(a).b[kg.b(a)]);
                kg.b(a, kg.c(a).c[kg.b(a)]);
                kg.a(a, kg.d(a), kg.e(a), kg.f(a));
                return true;
            }
            if (motionevent1.getX() - motionevent.getX() >= 100F)
            {
                if (kg.b(a) == 0)
                {
                    kg.a(a, kg.c(a).b.length - 1);
                } else
                {
                    kg.a(a, kg.b(a) - 1);
                }
                kg.a(a, new ig(kg.c(a).b[kg.b(a)]));
                kg.a(a, kg.c(a).b[kg.b(a)]);
                kg.b(a, kg.c(a).c[kg.b(a)]);
                kg.a(a, kg.d(a), kg.e(a), kg.f(a));
                return true;
            }
        }
        return false;
    }

    public final void onLongPress(MotionEvent motionevent)
    {
    }

    public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return false;
    }

    public final void onShowPress(MotionEvent motionevent)
    {
    }

    public final boolean onSingleTapUp(MotionEvent motionevent)
    {
        return false;
    }
}
