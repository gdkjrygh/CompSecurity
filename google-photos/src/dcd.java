// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public abstract class dcd extends dcc
{

    boolean b;
    private final float c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private VelocityTracker h;
    private boolean i;
    private int j;

    public dcd(dbc dbc1, boolean flag)
    {
        this(dbc1, true, 1.0F);
    }

    private dcd(dbc dbc1, boolean flag, float f1)
    {
        super(dbc1);
        b.a(1.0F, "slopModifier");
        dbc1 = dbc1.e();
        d = (int)(float)ViewConfiguration.get(dbc1).getScaledTouchSlop();
        c = (float)Math.atan(1.0D);
        e = ViewConfiguration.get(dbc1).getScaledMinimumFlingVelocity();
        f = ViewConfiguration.get(dbc1).getScaledMaximumFlingVelocity();
        g = flag;
    }

    private void a(dbd dbd1, boolean flag)
    {
        if (b == flag) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        dbd1.g = this;
_L6:
        b = flag;
_L2:
        return;
_L4:
        if (dbd1.g == this)
        {
            dbd1.g = null;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void b(dbd dbd1)
    {
        if (b)
        {
            a(dbd1, false);
            b();
        }
        i = false;
        if (h != null)
        {
            h.recycle();
            h = null;
        }
    }

    protected abstract void a();

    protected abstract boolean a(dbd dbd1, int k, int l);

    public final boolean a(dbd dbd1, MotionEvent motionevent)
    {
        int k;
        float f1;
        if (g ^ dbd1.a)
        {
            f1 = motionevent.getY();
        } else
        {
            f1 = motionevent.getX();
        }
        k = (int)f1;
        if (h != null)
        {
            h.addMovement(motionevent);
        }
        if (dbd1.g == null || dbd1.g == this) goto _L2; else goto _L1
_L1:
        b(dbd1);
_L4:
        return false;
_L2:
        switch (motionevent.getAction())
        {
        default:
            return false;

        case 0: // '\0'
            if (!i)
            {
                a(dbd1, (int)motionevent.getX(), (int)motionevent.getY());
                j = k;
                h = VelocityTracker.obtain();
                i = true;
                return false;
            }
            break;

        case 2: // '\002'
            if (i)
            {
                int l = j;
                if (!b && Math.abs(k - l) > d)
                {
                    a();
                    a(dbd1, true);
                }
                float f2;
                float f3;
                float f4;
                boolean flag;
                boolean flag1;
                boolean flag2;
                if (b)
                {
                    d(dbd1, k - j);
                    j = k;
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                return flag1;
            }
            break;

        case 1: // '\001'
            if (i)
            {
                flag1 = b;
                h.computeCurrentVelocity(1000, f);
                f3 = h.getXVelocity();
                f4 = h.getYVelocity();
                h.recycle();
                h = null;
                flag2 = g;
                flag = dbd1.a ^ flag2;
                if (flag)
                {
                    f2 = f4;
                } else
                {
                    f2 = f3;
                }
                if (!flag)
                {
                    f3 = f4;
                }
                if (f2 != 0.0F)
                {
                    f3 = (float)Math.atan(f3 / f2);
                } else
                {
                    f3 = 0.0F;
                }
                if (Math.abs(f2) > (float)e && Math.abs(f3) < c)
                {
                    c(dbd1, (int)f2);
                } else
                if (flag1)
                {
                    b();
                }
                a(dbd1, false);
                flag2 = b;
                i = false;
                return flag2 | flag1;
            }
            break;

        case 3: // '\003'
            b(dbd1);
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected abstract void b();

    protected abstract void c(dbd dbd1, int k);

    protected abstract void d(dbd dbd1, int k);
}
