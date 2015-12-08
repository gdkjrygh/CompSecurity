// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.TypedValue;
import android.view.MotionEvent;

public final class gpd
    implements iwe
{

    private final float a;
    private final nwm b;
    private final gpe c;
    private final PointF d = new PointF();
    private final PointF e = new PointF();
    private final PointF f = new PointF();
    private boolean g;
    private boolean h;
    private float i;
    private boolean j;
    private int k;
    private int l;
    private boolean m;

    public gpd(Context context, nwm nwm1, gpe gpe1)
    {
        k = -1;
        l = -1;
        b = nwm1;
        a = TypedValue.applyDimension(1, 12F, context.getResources().getDisplayMetrics());
        c = gpe1;
    }

    private float b()
    {
        return (float)b.a(e.x, e.y, f.x, f.y);
    }

    private void b(MotionEvent motionevent)
    {
        boolean flag = false;
        if (k == -1) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L8:
        if (i1 >= motionevent.getPointerCount()) goto _L2; else goto _L3
_L3:
        if (motionevent.getPointerId(i1) != k) goto _L5; else goto _L4
_L4:
        e.set(motionevent.getX(i1), motionevent.getY(i1));
_L2:
        if (l == -1) goto _L7; else goto _L6
_L6:
        i1 = ((flag) ? 1 : 0);
_L9:
        if (i1 < motionevent.getPointerCount())
        {
            if (motionevent.getPointerId(i1) != l)
            {
                break MISSING_BLOCK_LABEL_104;
            }
            f.set(motionevent.getX(i1), motionevent.getY(i1));
        }
_L7:
        return;
_L5:
        i1++;
          goto _L8
        i1++;
          goto _L9
    }

    private float c()
    {
        if (k != -1 && l != -1)
        {
            return (float)Math.toDegrees(Math.atan2(e.y - f.y, e.x - f.x));
        } else
        {
            return 0.0F;
        }
    }

    private PointF d()
    {
        return new PointF((e.x + f.x) / 2.0F, (e.y + f.y) / 2.0F);
    }

    public final void a()
    {
        g = false;
        k = -1;
        l = -1;
        PointF pointf = d();
        float f1 = b();
        float f2 = c();
        if (h)
        {
            c.d(pointf, f1, f2);
            h = false;
        }
    }

    public final boolean a(MotionEvent motionevent)
    {
        boolean flag = false;
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 6: default 48
    //                   0 53
    //                   1 134
    //                   2 178
    //                   3 48
    //                   4 48
    //                   5 53
    //                   6 134;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L2 _L3
_L1:
        return h;
_L2:
        if (motionevent.getPointerCount() == 1)
        {
            k = motionevent.getPointerId(motionevent.getActionIndex());
            b(motionevent);
            m = true;
        } else
        if (motionevent.getPointerCount() == 2 && m)
        {
            m = false;
            l = motionevent.getPointerId(motionevent.getActionIndex());
            b(motionevent);
            i = b();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (g && (motionevent.getPointerId(motionevent.getActionIndex()) == k || motionevent.getPointerId(motionevent.getActionIndex()) == l))
        {
            a();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (motionevent.getPointerCount() >= 2)
        {
            b(motionevent);
            float f1 = b();
            if (f1 > i)
            {
                flag = true;
            }
            j = flag;
            if (!g && motionevent.getPointerCount() >= 2 && Math.abs(f1 - i) > a)
            {
                g = true;
                motionevent = d();
                float f2 = c();
                d.set(((PointF) (motionevent)).x, ((PointF) (motionevent)).y);
                if (c.p() && j && !h)
                {
                    gpf gpf1 = (gpf)b.ai_().b(gpf);
                    if (gpf1 != null)
                    {
                        h = gpf1.a(motionevent, f1, f2);
                    }
                } else
                if (c.q() && !j && c.az_() && !h)
                {
                    h = true;
                    c.b(d, f1, f2);
                }
            } else
            if (g)
            {
                motionevent = d();
                float f3 = c();
                if (h)
                {
                    c.c(motionevent, f1, f3);
                }
                boolean flag1 = h;
            }
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
