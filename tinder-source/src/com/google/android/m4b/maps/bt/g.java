// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bt;

import android.graphics.Rect;
import android.view.MotionEvent;
import com.google.android.m4b.maps.cg.aa;
import com.google.android.m4b.maps.cg.ac;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bt:
//            d, h

public final class g extends android.view.GestureDetector.SimpleOnGestureListener
{

    private d a;
    private h b;

    g(d d1, h h1)
    {
        a = d1;
        b = h1;
    }

    public final boolean onDown(MotionEvent motionevent)
    {
        return true;
    }

    public final void onLongPress(MotionEvent motionevent)
    {
        a.b(motionevent);
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        h h1 = b;
        float f2 = motionevent.getX();
        float f3 = motionevent.getY();
        boolean flag1;
        boolean flag2;
        if (h1.e != null && f2 >= h1.f && f2 <= h1.f + h1.h && f3 >= h1.g && f3 <= h1.g + h1.i)
        {
            h1.e.a.c(h1.e);
            flag1 = true;
        } else
        {
            float f = 1E+30F;
            Iterator iterator = h1.c.iterator();
            aa aa1 = null;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                aa aa2 = (aa)iterator.next();
                if (aa2.u())
                {
                    Rect rect1 = aa2.D();
                    float f1 = f2 - rect1.exactCenterX();
                    float f4 = f3 - rect1.exactCenterY();
                    f1 = f4 * f4 + f1 * f1;
                    if (f1 < f)
                    {
                        f = f1;
                        aa1 = aa2;
                    }
                }
            } while (true);
            boolean flag;
            if (aa1 == null || !aa1.u())
            {
                flag = false;
            } else
            {
                Rect rect = aa1.D();
                rect = new Rect(rect.left - 10, rect.top - 10, rect.right + 10, rect.bottom + 10);
                if (f2 >= (float)rect.left && f2 <= (float)rect.right && f3 >= (float)rect.top && f3 <= (float)rect.bottom)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            if (flag)
            {
                aa1.r();
                aa1.a.b(aa1);
                if (h1.e != null && h1.e != aa1)
                {
                    h1.e.s();
                }
                h1.e = aa1;
                h1.d.invalidate();
                flag1 = true;
            } else
            if (h1.e != null)
            {
                h1.e.s();
                h1.e = null;
                h1.d.invalidate();
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        flag2 = flag1;
        if (!flag1)
        {
            flag2 = a.a(motionevent);
        }
        return flag2;
    }
}
