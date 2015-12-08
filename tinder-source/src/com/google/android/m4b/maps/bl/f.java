// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bl;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.google.android.m4b.maps.y.j;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bl:
//            i, g, e, d, 
//            c, b, n

public final class f
    implements i.b
{

    private i.a a;
    private i b;
    private boolean c;

    public f()
    {
    }

    public final void a(Context context, i.a a1)
    {
        a = a1;
        b = new i(context, this);
    }

    public final boolean a(MotionEvent motionevent)
    {
        float f1;
        float f3;
        Object obj;
        int k;
        boolean flag;
        int k2;
        int l2;
        flag = false;
        obj = b;
        int i1 = motionevent.getAction();
        int i2 = (0xff00 & i1) >> 8;
        if (!((i) (obj)).B)
        {
            if (i1 == 5 || i1 == 261 || i1 == 0)
            {
                DisplayMetrics displaymetrics = ((i) (obj)).a.getResources().getDisplayMetrics();
                obj.x = (float)displaymetrics.widthPixels - ((i) (obj)).w;
                obj.y = (float)displaymetrics.heightPixels - ((i) (obj)).w;
                ((i) (obj)).b();
                obj.b = MotionEvent.obtain(motionevent);
                obj.v = 0L;
                ((i) (obj)).b(motionevent);
                f1 = ((i) (obj)).w;
                f3 = ((i) (obj)).x;
                float f5 = ((i) (obj)).y;
                float f9 = motionevent.getRawX();
                float f12 = motionevent.getRawY();
                float f14 = com.google.android.m4b.maps.bl.i.a(motionevent, motionevent.getPointerCount() - 1);
                float f16 = com.google.android.m4b.maps.bl.i.b(motionevent, motionevent.getPointerCount() - 1);
                if (f9 < f1 || f12 < f1 || f9 > f3 || f12 > f5)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                if (f14 < f1 || f16 < f1 || f14 > f3 || f16 > f5)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (k != 0 && i1 != 0)
                {
                    obj.g = -1F;
                    obj.h = -1F;
                    obj.z = true;
                } else
                if (k != 0)
                {
                    obj.g = motionevent.getX(motionevent.getPointerCount() - 1);
                    obj.h = motionevent.getY(motionevent.getPointerCount() - 1);
                    obj.z = true;
                } else
                if (i1 != 0)
                {
                    obj.g = motionevent.getX(0);
                    obj.h = motionevent.getY(0);
                    obj.z = true;
                } else
                {
                    obj.B = true;
                }
            } else
            if (i1 == 2 && ((i) (obj)).z)
            {
                f1 = ((i) (obj)).w;
                f3 = ((i) (obj)).x;
                float f6 = ((i) (obj)).y;
                float f10 = motionevent.getRawX();
                float f13 = motionevent.getRawY();
                float f15 = com.google.android.m4b.maps.bl.i.a(motionevent, motionevent.getPointerCount() - 1);
                float f17 = com.google.android.m4b.maps.bl.i.b(motionevent, motionevent.getPointerCount() - 1);
                if (f10 < f1 || f13 < f1 || f10 > f3 || f13 > f6)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                if (f15 < f1 || f17 < f1 || f15 > f3 || f17 > f6)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (k != 0 && i1 != 0)
                {
                    obj.g = -1F;
                    obj.h = -1F;
                } else
                if (k != 0)
                {
                    obj.g = motionevent.getX(motionevent.getPointerCount() - 1);
                    obj.h = motionevent.getY(motionevent.getPointerCount() - 1);
                } else
                if (i1 != 0)
                {
                    obj.g = motionevent.getX(0);
                    obj.h = motionevent.getY(0);
                } else
                {
                    obj.z = false;
                    obj.B = true;
                }
            } else
            if ((i1 == 6 || i1 == 262 || i1 == 1) && ((i) (obj)).z)
            {
                if (i2 == 0)
                {
                    k = motionevent.getPointerCount() - 1;
                } else
                {
                    k = 0;
                }
                obj.g = motionevent.getX(k);
                obj.h = motionevent.getY(k);
            }
        } else
        {
            if (!((i) (obj)).d.isEmpty())
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (k == 0)
            {
                ((i) (obj)).a(MotionEvent.obtain(motionevent));
            } else
            {
                switch (i1)
                {
                case 1: // '\001'
                case 6: // '\006'
                case 262: 
                    ((i) (obj)).b(motionevent);
                    if (i2 == 0)
                    {
                        k = motionevent.getPointerCount() - 1;
                    } else
                    {
                        k = 0;
                    }
                    obj.g = motionevent.getX(k);
                    obj.h = motionevent.getY(k);
                    if (!((i) (obj)).z)
                    {
                        ((i) (obj)).a();
                    }
                    ((i) (obj)).b();
                    break;

                case 3: // '\003'
                    if (!((i) (obj)).z)
                    {
                        ((i) (obj)).a();
                    }
                    ((i) (obj)).b();
                    break;

                case 2: // '\002'
                    ((i) (obj)).b(motionevent);
                    ((i) (obj)).a(((i) (obj)).c);
                    if (((i) (obj)).t / ((i) (obj)).u > 0.67F)
                    {
                        Iterator iterator = ((i) (obj)).d.iterator();
                        e e1;
                        for (k = 0; iterator.hasNext(); k = e1.e(((i) (obj))) | k)
                        {
                            e1 = (e)iterator.next();
                            j.b(e1.b);
                        }

                        if (k != 0)
                        {
                            obj.b = MotionEvent.obtain(motionevent);
                        }
                    }
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
        }
_L18:
        obj = ((i) (obj)).C;
        l2 = motionevent.getAction();
        if (((g) (obj)).x == null)
        {
            obj.x = VelocityTracker.obtain();
        }
        ((g) (obj)).x.addMovement(motionevent);
        if ((l2 & 0xff) == 6)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            i1 = motionevent.getActionIndex();
        } else
        {
            i1 = -1;
        }
        f3 = 0.0F;
        f1 = 0.0F;
        k2 = motionevent.getPointerCount();
        for (i2 = 0; i2 < k2;)
        {
            f9 = f1;
            f5 = f3;
            if (i1 != i2)
            {
                f5 = f3 + motionevent.getX(i2);
                f9 = f1 + motionevent.getY(i2);
            }
            i2++;
            f1 = f9;
            f3 = f5;
        }

        if (k != 0)
        {
            k = k2 - 1;
        } else
        {
            k = k2;
        }
        f3 /= k;
        f1 /= k;
        l2 & 0xff;
        JVM INSTR tableswitch 0 6: default 1204
    //                   0 1454
    //                   1 2045
    //                   2 1815
    //                   3 2303
    //                   4 1204
    //                   5 1213
    //                   6 1298;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        return true;
_L6:
        obj.s = f3;
        obj.u = f3;
        obj.t = f1;
        obj.v = f1;
        ((g) (obj)).i.removeMessages(1);
        ((g) (obj)).i.removeMessages(2);
        ((g) (obj)).i.removeMessages(3);
        obj.r = false;
        obj.n = false;
        obj.o = false;
        if (((g) (obj)).m)
        {
            obj.m = false;
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        obj.s = f3;
        obj.u = f3;
        obj.t = f1;
        obj.v = f1;
        ((g) (obj)).x.computeCurrentVelocity(1000, ((g) (obj)).e);
        int j1 = motionevent.getActionIndex();
        k = motionevent.getPointerId(j1);
        f1 = ((g) (obj)).x.getXVelocity(k);
        f3 = ((g) (obj)).x.getYVelocity(k);
        k = ((flag) ? 1 : 0);
        while (k < k2) 
        {
            if (k != j1)
            {
                int j2 = motionevent.getPointerId(k);
                float f7 = ((g) (obj)).x.getXVelocity(j2);
                if (((g) (obj)).x.getYVelocity(j2) * f3 + f7 * f1 < 0.0F)
                {
                    ((g) (obj)).x.clear();
                    return true;
                }
            }
            k++;
        }
        if (true) goto _L1; else goto _L2
_L2:
        if (((g) (obj)).k == null) goto _L9; else goto _L8
_L8:
        MotionEvent motionevent1;
        MotionEvent motionevent3;
        boolean flag1 = ((g) (obj)).i.hasMessages(3);
        if (flag1)
        {
            ((g) (obj)).i.removeMessages(3);
        }
        if (((g) (obj)).p == null || ((g) (obj)).q == null || !flag1)
        {
            break MISSING_BLOCK_LABEL_1798;
        }
        motionevent1 = ((g) (obj)).p;
        motionevent3 = ((g) (obj)).q;
        if (!((g) (obj)).o || motionevent.getEventTime() - motionevent3.getEventTime() > (long)g.h) goto _L11; else goto _L10
_L10:
        int k1;
        k = (int)motionevent1.getX() - (int)motionevent.getX();
        k1 = (int)motionevent1.getY() - (int)motionevent.getY();
        if (k1 * k1 + k * k >= ((g) (obj)).c) goto _L11; else goto _L12
_L12:
        k = 1;
_L13:
        if (!k)
        {
            break MISSING_BLOCK_LABEL_1798;
        }
        obj.r = true;
        ((g) (obj)).k.onDoubleTap(((g) (obj)).p);
        ((g) (obj)).k.onDoubleTapEvent(motionevent);
_L9:
        obj.s = f3;
        obj.u = f3;
        obj.t = f1;
        obj.v = f1;
        if (((g) (obj)).p != null)
        {
            ((g) (obj)).p.recycle();
        }
        obj.p = MotionEvent.obtain(motionevent);
        obj.n = true;
        obj.o = true;
        obj.l = true;
        obj.m = false;
        if (((g) (obj)).w)
        {
            ((g) (obj)).i.removeMessages(2);
            ((g) (obj)).i.sendEmptyMessageAtTime(2, ((g) (obj)).p.getDownTime() + (long)g.g + (long)g.f);
        }
        ((g) (obj)).i.sendEmptyMessageAtTime(1, ((g) (obj)).p.getDownTime() + (long)g.g);
        ((g) (obj)).j.onDown(motionevent);
        return true;
_L11:
        k = 0;
          goto _L13
        ((g) (obj)).i.sendEmptyMessageDelayed(3, g.h);
          goto _L9
_L4:
        float f8;
        float f11;
        f8 = ((g) (obj)).s - f3;
        f11 = ((g) (obj)).t - f1;
        if (((g) (obj)).r)
        {
            ((g) (obj)).k.onDoubleTapEvent(motionevent);
            return true;
        }
        if (!((g) (obj)).n)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = (int)(f3 - ((g) (obj)).u);
        int l1 = (int)(f1 - ((g) (obj)).v);
        k = k * k + l1 * l1;
        if (k > ((g) (obj)).a)
        {
            ((g) (obj)).j.onScroll(((g) (obj)).p, motionevent, f8, f11);
            obj.s = f3;
            obj.t = f1;
            obj.n = false;
            ((g) (obj)).i.removeMessages(3);
            ((g) (obj)).i.removeMessages(1);
            ((g) (obj)).i.removeMessages(2);
        }
        if (k <= ((g) (obj)).b) goto _L1; else goto _L14
_L14:
        obj.o = false;
        return true;
        if (Math.abs(f8) < 1.0F && Math.abs(f11) < 1.0F) goto _L1; else goto _L15
_L15:
        ((g) (obj)).j.onScroll(((g) (obj)).p, motionevent, f8, f11);
        obj.s = f3;
        obj.t = f1;
        return true;
_L3:
        obj.l = false;
        MotionEvent motionevent2 = MotionEvent.obtain(motionevent);
        if (((g) (obj)).r)
        {
            ((g) (obj)).k.onDoubleTapEvent(motionevent);
        } else
        if (((g) (obj)).m)
        {
            ((g) (obj)).i.removeMessages(3);
            obj.m = false;
            ((g) (obj)).j.onSingleTapUp(motionevent);
        } else
        if (((g) (obj)).n)
        {
            ((g) (obj)).j.onSingleTapUp(motionevent);
        } else
        {
            VelocityTracker velocitytracker = ((g) (obj)).x;
            int l = motionevent.getPointerId(0);
            velocitytracker.computeCurrentVelocity(1000, ((g) (obj)).e);
            float f2 = velocitytracker.getYVelocity(l);
            float f4 = velocitytracker.getXVelocity(l);
            if (Math.abs(f2) > (float)((g) (obj)).d || Math.abs(f4) > (float)((g) (obj)).d)
            {
                ((g) (obj)).j.onFling(((g) (obj)).p, motionevent, f4, f2);
            }
        }
        if (((g) (obj)).q != null)
        {
            ((g) (obj)).q.recycle();
        }
        obj.q = motionevent2;
        if (((g) (obj)).x != null)
        {
            ((g) (obj)).x.recycle();
            obj.x = null;
        }
        obj.r = false;
        ((g) (obj)).i.removeMessages(1);
        ((g) (obj)).i.removeMessages(2);
        return true;
_L5:
        ((g) (obj)).i.removeMessages(1);
        ((g) (obj)).i.removeMessages(2);
        ((g) (obj)).i.removeMessages(3);
        ((g) (obj)).x.recycle();
        obj.x = null;
        obj.r = false;
        obj.l = false;
        obj.n = false;
        obj.o = false;
        if (!((g) (obj)).m) goto _L1; else goto _L16
_L16:
        obj.m = false;
        return true;
        if (true) goto _L18; else goto _L17
_L17:
    }

    public final boolean a(i k)
    {
        return a.a(new d(0, k));
    }

    public final boolean a(i k, boolean flag)
    {
        if (flag)
        {
            return true;
        } else
        {
            return a.a(new c(0, k));
        }
    }

    public final boolean b(i k)
    {
        boolean flag = a.a(new d(1, k));
        if (flag)
        {
            c = true;
        }
        return flag;
    }

    public final boolean b(i k, boolean flag)
    {
        if (flag)
        {
            return true;
        } else
        {
            return a.a(new c(1, k));
        }
    }

    public final void c(i k)
    {
        c = false;
        a.a(new d(2, k));
    }

    public final void c(i k, boolean flag)
    {
        if (flag)
        {
            a.a(new c(3, k));
            return;
        } else
        {
            a.a(new c(2, k));
            return;
        }
    }

    public final boolean d(i k)
    {
        return a.a(new b(0, k));
    }

    public final boolean e(i k)
    {
        return a.a(new b(1, k));
    }

    public final void f(i k)
    {
        a.a(new b(2, k));
    }

    public final boolean g(i k)
    {
        return a.a(new n(0, k));
    }

    public final boolean h(i k)
    {
        return a.a(new n(1, k));
    }

    public final void i(i k)
    {
        a.a(new n(2, k));
    }

    public final boolean onDoubleTap(MotionEvent motionevent)
    {
        return a.onDoubleTap(motionevent);
    }

    public final boolean onDoubleTapEvent(MotionEvent motionevent)
    {
        return a.onDoubleTapEvent(motionevent);
    }

    public final boolean onDown(MotionEvent motionevent)
    {
        return a.onDown(motionevent);
    }

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        return a.onFling(motionevent, motionevent1, f1, f2);
    }

    public final void onLongPress(MotionEvent motionevent)
    {
        a.onLongPress(motionevent);
    }

    public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        return !c && a.onScroll(motionevent, motionevent1, f1, f2);
    }

    public final void onShowPress(MotionEvent motionevent)
    {
        a.onShowPress(motionevent);
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        return a.onSingleTapConfirmed(motionevent);
    }

    public final boolean onSingleTapUp(MotionEvent motionevent)
    {
        return a.onSingleTapUp(motionevent);
    }
}
