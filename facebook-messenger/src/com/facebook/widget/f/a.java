// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.f;

import android.view.MotionEvent;

// Referenced classes of package com.facebook.widget.f:
//            b, c

public class a
{

    private b a[];
    private int b[];
    private android.view.MotionEvent.PointerCoords c[];
    private c d;

    public a()
    {
        this(false);
    }

    public a(boolean flag)
    {
        a = new b[6];
        b = new int[6];
        c = new android.view.MotionEvent.PointerCoords[6];
        for (int i = 0; i <= 5; i++)
        {
            a[i] = new b(flag);
            c[i] = new android.view.MotionEvent.PointerCoords();
        }

        d = new c(0.0F, 0.0F, 0L);
    }

    private final b a(int i)
    {
        if (i < 5)
        {
            return a[i];
        } else
        {
            return a[5];
        }
    }

    public final MotionEvent a(MotionEvent motionevent, int i, long l)
    {
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            int k = Math.min(motionevent.getPointerCount(), 5);
            for (int j = 0; j < k; j++)
            {
                int i1 = motionevent.getPointerId(j);
                b[j] = i1;
                a(i1).a(l, d);
                c[j].x = d.b();
                c[j].y = d.c();
            }

            return MotionEvent.obtain(motionevent.getDownTime(), l, i, k, b, c, motionevent.getMetaState(), motionevent.getXPrecision(), motionevent.getYPrecision(), motionevent.getDeviceId(), motionevent.getEdgeFlags(), motionevent.getSource(), motionevent.getFlags());
        } else
        {
            throw new ArrayIndexOutOfBoundsException("Cannot synthesize motion events on pre-GB devices");
        }
    }

    public void a(MotionEvent motionevent)
    {
        int i = 0;
        motionevent.getAction() & 0xff;
        JVM INSTR lookupswitch 2: default 36
    //                   0: 116
    //                   5: 116;
           goto _L1 _L2 _L2
_L1:
        int l;
        int i1;
        l = motionevent.getPointerCount();
        i1 = motionevent.getHistorySize();
        i = 0;
_L4:
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        b b1 = a(motionevent.getPointerId(i));
        float f;
        float f1;
        int k;
        long l1;
        for (int j = 0; j < i1; j++)
        {
            b1.a(motionevent.getHistoricalX(i, j), motionevent.getHistoricalY(i, j), motionevent.getHistoricalEventTime(j));
        }

        b1.a(motionevent.getX(i), motionevent.getY(i), motionevent.getEventTime());
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        for (k = motionevent.getPointerCount(); i < k; i++)
        {
            f = motionevent.getX(i);
            f1 = motionevent.getY(i);
            l1 = motionevent.getEventTime();
            b1 = a(motionevent.getPointerId(i));
            if (motionevent.getActionMasked() == 5 && motionevent.getActionIndex() == i || motionevent.getActionMasked() == 0)
            {
                b1.a();
            }
            b1.a(f, f1, l1);
        }

        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
    }
}
