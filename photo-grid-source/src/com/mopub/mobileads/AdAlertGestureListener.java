// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.view.MotionEvent;
import android.view.View;
import com.mopub.common.AdReport;

// Referenced classes of package com.mopub.mobileads:
//            b, AdAlertReporter, a

public class AdAlertGestureListener extends android.view.GestureDetector.SimpleOnGestureListener
{

    private final AdReport a;
    private float b;
    private float c;
    private boolean d;
    private boolean e;
    private AdAlertReporter f;
    private int g;
    private float h;
    private int i;
    private View j;

    AdAlertGestureListener(View view, AdReport adreport)
    {
        b = 100F;
        i = b.UNSET$34b17a83;
        if (view != null && view.getWidth() > 0)
        {
            b = Math.min(100F, (float)view.getWidth() / 3F);
        }
        j = view;
        a = adreport;
    }

    final void a()
    {
        if (i == b.FINISHED$34b17a83)
        {
            f = new AdAlertReporter(j.getContext(), j, a);
            f.send();
        }
        b();
    }

    final void b()
    {
        g = 0;
        i = b.UNSET$34b17a83;
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        boolean flag3;
        boolean flag4;
        flag4 = true;
        flag3 = true;
        if (i == b.FINISHED$34b17a83)
        {
            return super.onScroll(motionevent, motionevent1, f1, f2);
        }
        float f3 = motionevent.getY();
        boolean flag;
        if (Math.abs(motionevent1.getY() - f3) > 100F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i = b.FAILED$34b17a83;
            return super.onScroll(motionevent, motionevent1, f1, f2);
        }
        a.a[i - 1];
        JVM INSTR tableswitch 1 3: default 116
    //                   1 134
    //                   2 164
    //                   3 263;
           goto _L1 _L2 _L3 _L4
_L1:
        c = motionevent1.getX();
        return super.onScroll(motionevent, motionevent1, f1, f2);
_L2:
        h = motionevent.getX();
        if (motionevent1.getX() > h)
        {
            i = b.GOING_RIGHT$34b17a83;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        float f4 = motionevent1.getX();
        boolean flag1;
        if (e)
        {
            flag1 = true;
        } else
        if (f4 >= h + b)
        {
            d = false;
            e = true;
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            if (f4 < c)
            {
                flag1 = flag3;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                i = b.GOING_LEFT$34b17a83;
                h = f4;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        float f5 = motionevent1.getX();
        boolean flag2;
        if (d)
        {
            flag2 = true;
        } else
        if (f5 <= h - b)
        {
            e = false;
            d = true;
            g = g + 1;
            if (g >= 4)
            {
                i = b.FINISHED$34b17a83;
            }
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2)
        {
            if (f5 > c)
            {
                flag2 = flag4;
            } else
            {
                flag2 = false;
            }
            if (flag2)
            {
                i = b.GOING_RIGHT$34b17a83;
                h = f5;
            }
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
