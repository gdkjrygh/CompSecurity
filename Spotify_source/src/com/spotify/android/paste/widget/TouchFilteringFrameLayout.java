// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import dgh;
import dgy;

public class TouchFilteringFrameLayout extends FrameLayout
{

    private dgy a;
    private dgh b;

    public TouchFilteringFrameLayout(Context context)
    {
        this(context, null);
    }

    public TouchFilteringFrameLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TouchFilteringFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new dgh();
    }

    public final void a(dgy dgy1)
    {
        a = dgy1;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        int i;
        int j;
        int k;
        i = motionevent.getActionIndex();
        j = motionevent.getPointerId(i);
        k = motionevent.getActionMasked();
        if (k != 0 && k != 5) goto _L2; else goto _L1
_L1:
        Object obj;
        if (!b.a(j))
        {
            boolean flag;
            if (a != null)
            {
                flag = a.a(motionevent, i);
            } else
            {
                flag = false;
            }
            if (flag)
            {
                dgh dgh1 = b;
                dgh1.d = 1 << j | dgh1.d;
            }
        }
_L4:
        obj = b;
        if (~((dgh) (obj)).d == 0)
        {
            throw new IllegalArgumentException("must keep at least one pointer id");
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (k == 1 || k == 3)
        {
            b.d = 0;
        }
        if (true) goto _L4; else goto _L3
_L3:
        android.view.MotionEvent.PointerProperties apointerproperties[];
        android.view.MotionEvent.PointerCoords apointercoords[];
        int ai[];
        int l1;
        int i2;
        int j2 = motionevent.getPointerCount();
        ((dgh) (obj)).b(j2);
        apointerproperties = ((dgh) (obj)).a;
        apointercoords = ((dgh) (obj)).b;
        ai = ((dgh) (obj)).c;
        l1 = motionevent.getAction();
        i2 = motionevent.getActionMasked();
        int k2 = motionevent.getActionIndex();
        j = 0;
        k = -1;
        for (i = 0; i < j2;)
        {
            motionevent.getPointerProperties(i, apointerproperties[j]);
            int j1 = k;
            int l = j;
            if (!((dgh) (obj)).a(apointerproperties[j].id))
            {
                if (i == k2)
                {
                    k = j;
                }
                ai[j] = i;
                l = j + 1;
                j1 = k;
            }
            i++;
            k = j1;
            j = l;
        }

        if (j != 0) goto _L6; else goto _L5
_L5:
        MotionEvent motionevent1 = null;
_L8:
        if (motionevent1 != null)
        {
            return super.dispatchTouchEvent(motionevent1);
        } else
        {
            return true;
        }
_L6:
label0:
        {
            if (i2 != 5)
            {
                i = l1;
                if (i2 != 6)
                {
                    break label0;
                }
            }
            int k1;
            if (k < 0)
            {
                i = 2;
            } else
            if (j == 1)
            {
                if (i2 == 5)
                {
                    i = 0;
                } else
                {
                    i = 1;
                }
            } else
            {
                i = i2 | k << 8;
            }
        }
        obj = null;
        k1 = motionevent.getHistorySize();
        k = 0;
_L9:
        motionevent1 = ((MotionEvent) (obj));
        if (k > k1) goto _L8; else goto _L7
_L7:
        int i1;
        long l2;
        if (k == k1)
        {
            l2 = motionevent.getEventTime();
        } else
        {
            l2 = motionevent.getHistoricalEventTime(k);
        }
        i1 = 0;
        while (i1 < j) 
        {
            if (k == k1)
            {
                motionevent.getPointerCoords(i1, apointercoords[i1]);
            } else
            {
                motionevent.getHistoricalPointerCoords(ai[i1], k, apointercoords[i1]);
            }
            i1++;
        }
        if (k == 0)
        {
            obj = MotionEvent.obtain(motionevent.getDownTime(), l2, i, j, apointerproperties, apointercoords, motionevent.getMetaState(), motionevent.getButtonState(), motionevent.getXPrecision(), motionevent.getYPrecision(), motionevent.getDeviceId(), motionevent.getEdgeFlags(), motionevent.getSource(), motionevent.getFlags());
        } else
        {
            ((MotionEvent) (obj)).addBatch(l2, apointercoords, 0);
        }
        k++;
          goto _L9
    }
}
