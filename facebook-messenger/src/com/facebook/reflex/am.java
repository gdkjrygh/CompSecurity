// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import android.view.MotionEvent;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.reflex:
//            Widget

class am
{

    final Widget a;
    private long b;
    private long c;
    private int d;
    private int e;
    private float f;
    private float g;
    private int h[];
    private android.view.MotionEvent.PointerCoords i[];
    private int j;

    public am(Widget widget)
    {
        a = widget;
        super();
        h = new int[1];
        i = new android.view.MotionEvent.PointerCoords[1];
        i[0] = new android.view.MotionEvent.PointerCoords();
        j = -1;
    }

    public MotionEvent a()
    {
        MotionEvent motionevent;
        boolean flag;
        if (j > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        motionevent = MotionEvent.obtain(b, c, e, j, h, i, 0, f, g, 0, d, 4098, 0);
        j = -1;
        return motionevent;
    }

    public void a(int k, float f1, float f2)
    {
        boolean flag;
        if (j >= 0 && j < i.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        if (j >= i.length)
        {
            int ai[] = new int[h.length * 2];
            System.arraycopy(h, 0, ai, 0, h.length);
            android.view.MotionEvent.PointerCoords apointercoords[] = new android.view.MotionEvent.PointerCoords[i.length * 2];
            System.arraycopy(i, 0, apointercoords, 0, i.length);
            for (int l = i.length; l < apointercoords.length; l++)
            {
                apointercoords[l] = new android.view.MotionEvent.PointerCoords();
            }

            h = ai;
            i = apointercoords;
        }
        h[j] = k;
        i[j].x = f1 - (float)Widget.m();
        i[j].y = f2 - (float)Widget.n();
        j = j + 1;
    }

    public void a(long l, long l1, int k, int i1, int j1, 
            float f1, float f2)
    {
        boolean flag = false;
        b = l;
        c = l1;
        d = k;
        e = i1;
        j = 0;
        f = f1;
        g = f2;
        if (j1 > i.length)
        {
            h = new int[j1];
            i = new android.view.MotionEvent.PointerCoords[j1];
            for (k = ((flag) ? 1 : 0); k < i.length; k++)
            {
                i[k] = new android.view.MotionEvent.PointerCoords();
            }

        }
    }
}
