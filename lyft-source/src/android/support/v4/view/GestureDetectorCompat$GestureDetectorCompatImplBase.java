// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

// Referenced classes of package android.support.v4.view:
//            MotionEventCompat, VelocityTrackerCompat

class a
    implements a
{

    private static final int e = ViewConfiguration.getLongPressTimeout();
    private static final int f = ViewConfiguration.getTapTimeout();
    private static final int g = ViewConfiguration.getDoubleTapTimeout();
    private int a;
    private int b;
    private int c;
    private int d;
    private final Handler h;
    private final android.view.atImplBase.a i;
    private android.view.atImplBase.a j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private MotionEvent p;
    private MotionEvent q;
    private boolean r;
    private float s;
    private float t;
    private float u;
    private float v;
    private boolean w;
    private VelocityTracker x;

    static MotionEvent a(a a1)
    {
        return a1.p;
    }

    private void a()
    {
        h.removeMessages(1);
        h.removeMessages(2);
        h.removeMessages(3);
        x.recycle();
        x = null;
        r = false;
        k = false;
        n = false;
        o = false;
        l = false;
        if (m)
        {
            m = false;
        }
    }

    private void a(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("Context must not be null");
        }
        if (i == null)
        {
            throw new IllegalArgumentException("OnGestureListener must not be null");
        } else
        {
            w = true;
            context = ViewConfiguration.get(context);
            int i1 = context.getScaledTouchSlop();
            int j1 = context.getScaledDoubleTapSlop();
            c = context.getScaledMinimumFlingVelocity();
            d = context.getScaledMaximumFlingVelocity();
            a = i1 * i1;
            b = j1 * j1;
            return;
        }
    }

    static boolean a(b b1, boolean flag)
    {
        b1.l = flag;
        return flag;
    }

    private boolean a(MotionEvent motionevent, MotionEvent motionevent1, MotionEvent motionevent2)
    {
        if (o && motionevent2.getEventTime() - motionevent1.getEventTime() <= (long)g)
        {
            int i1 = (int)motionevent.getX() - (int)motionevent2.getX();
            int j1 = (int)motionevent.getY() - (int)motionevent2.getY();
            if (i1 * i1 + j1 * j1 < b)
            {
                return true;
            }
        }
        return false;
    }

    static android.view.atImplBase b(b b1)
    {
        return b1.i;
    }

    private void b()
    {
        h.removeMessages(1);
        h.removeMessages(2);
        h.removeMessages(3);
        r = false;
        n = false;
        o = false;
        l = false;
        if (m)
        {
            m = false;
        }
    }

    private void c()
    {
        h.removeMessages(3);
        l = false;
        m = true;
        i.i(p);
    }

    static void c(p p1)
    {
        p1.c();
    }

    static android.view.atImplBase d(c c1)
    {
        return c1.j;
    }

    static boolean e(j j1)
    {
        return j1.k;
    }

    public void a(android.view.atImplBase atimplbase)
    {
        j = atimplbase;
    }

    public void a(boolean flag)
    {
        w = flag;
    }

    public boolean a(MotionEvent motionevent)
    {
        float f1;
        float f2;
        int i3;
        int j3 = motionevent.getAction();
        if (x == null)
        {
            x = VelocityTracker.obtain();
        }
        x.addMovement(motionevent);
        boolean flag;
        int l1;
        int k2;
        if ((j3 & 0xff) == 6)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            l1 = MotionEventCompat.b(motionevent);
        } else
        {
            l1 = -1;
        }
        i3 = MotionEventCompat.c(motionevent);
        k2 = 0;
        f1 = 0.0F;
        f2 = 0.0F;
        while (k2 < i3) 
        {
            if (l1 != k2)
            {
                f2 += MotionEventCompat.c(motionevent, k2);
                f1 += MotionEventCompat.d(motionevent, k2);
            }
            k2++;
        }
        int i1;
        if (flag)
        {
            i1 = i3 - 1;
        } else
        {
            i1 = i3;
        }
        f2 /= i1;
        f1 /= i1;
        j3 & 0xff;
        JVM INSTR tableswitch 0 6: default 192
    //                   0 371
    //                   1 850
    //                   2 631
    //                   3 1124
    //                   4 192
    //                   5 201
    //                   6 227;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        return false;
_L6:
        s = f2;
        u = f2;
        t = f1;
        v = f1;
        b();
        return false;
_L7:
        int j1;
        int i2;
        s = f2;
        u = f2;
        t = f1;
        v = f1;
        x.computeCurrentVelocity(1000, d);
        i2 = MotionEventCompat.b(motionevent);
        j1 = MotionEventCompat.b(motionevent, i2);
        f1 = VelocityTrackerCompat.a(x, j1);
        f2 = VelocityTrackerCompat.b(x, j1);
        j1 = 0;
_L11:
        if (j1 >= i3) goto _L1; else goto _L8
_L8:
        if (j1 != i2) goto _L10; else goto _L9
_L9:
        j1++;
          goto _L11
_L10:
        float f3;
        int l2;
        l2 = MotionEventCompat.b(motionevent, j1);
        f3 = VelocityTrackerCompat.a(x, l2);
        if (VelocityTrackerCompat.b(x, l2) * f2 + f3 * f1 >= 0.0F) goto _L9; else goto _L12
_L12:
        x.clear();
        return false;
_L2:
        if (j == null) goto _L14; else goto _L13
_L13:
        boolean flag1;
        flag1 = h.hasMessages(3);
        if (flag1)
        {
            h.removeMessages(3);
        }
        if (p == null || q == null || !flag1 || !a(p, q, motionevent)) goto _L16; else goto _L15
_L15:
        r = true;
        j1 = j.j(p) | false | j.(motionevent);
_L17:
        s = f2;
        u = f2;
        t = f1;
        v = f1;
        if (p != null)
        {
            p.recycle();
        }
        p = MotionEvent.obtain(motionevent);
        n = true;
        o = true;
        k = true;
        m = false;
        l = false;
        if (w)
        {
            h.removeMessages(2);
            h.sendEmptyMessageAtTime(2, p.getDownTime() + (long)f + (long)e);
        }
        h.sendEmptyMessageAtTime(1, p.getDownTime() + (long)f);
        return j1 | i.i(motionevent);
_L16:
        h.sendEmptyMessageDelayed(3, g);
_L14:
        j1 = 0;
          goto _L17
_L4:
        if (!m)
        {
            float f4 = s - f2;
            float f5 = t - f1;
            if (r)
            {
                return false | j.(motionevent);
            }
            if (n)
            {
                int k1 = (int)(f2 - u);
                int j2 = (int)(f1 - v);
                k1 = k1 * k1 + j2 * j2;
                MotionEvent motionevent1;
                VelocityTracker velocitytracker;
                boolean flag2;
                boolean flag3;
                if (k1 > a)
                {
                    flag2 = i.i(p, motionevent, f4, f5);
                    s = f2;
                    t = f1;
                    n = false;
                    h.removeMessages(3);
                    h.removeMessages(1);
                    h.removeMessages(2);
                } else
                {
                    flag2 = false;
                }
                if (k1 > a)
                {
                    o = false;
                }
                return flag2;
            }
            if (Math.abs(f4) >= 1.0F || Math.abs(f5) >= 1.0F)
            {
                flag2 = i.i(p, motionevent, f4, f5);
                s = f2;
                t = f1;
                return flag2;
            }
        }
          goto _L1
_L3:
        k = false;
        motionevent1 = MotionEvent.obtain(motionevent);
        if (r)
        {
            flag2 = j.(motionevent) | false;
        } else
        if (m)
        {
            h.removeMessages(3);
            m = false;
            flag2 = false;
        } else
        if (n)
        {
            flag3 = i.i(motionevent);
            flag2 = flag3;
            if (l)
            {
                flag2 = flag3;
                if (j != null)
                {
                    j.rmed(motionevent);
                    flag2 = flag3;
                }
            }
        } else
        {
            velocitytracker = x;
            k1 = MotionEventCompat.b(motionevent, 0);
            velocitytracker.computeCurrentVelocity(1000, d);
            f1 = VelocityTrackerCompat.b(velocitytracker, k1);
            f2 = VelocityTrackerCompat.a(velocitytracker, k1);
            if (Math.abs(f1) > (float)c || Math.abs(f2) > (float)c)
            {
                flag2 = i.i(p, motionevent, f2, f1);
            } else
            {
                flag2 = false;
            }
        }
        if (q != null)
        {
            q.recycle();
        }
        q = motionevent1;
        if (x != null)
        {
            x.recycle();
            x = null;
        }
        r = false;
        l = false;
        h.removeMessages(1);
        h.removeMessages(2);
        return flag2;
_L5:
        a();
        return false;
    }


    public GestureHandler.a(Context context, android.view.atImplBase atimplbase, Handler handler)
    {
        class GestureHandler extends Handler
        {

            final GestureDetectorCompat.GestureDetectorCompatImplBase a;

            public void handleMessage(Message message)
            {
                message.what;
                JVM INSTR tableswitch 1 3: default 32
            //                           1 59
            //                           2 79
            //                           3 87;
                   goto _L1 _L2 _L3 _L4
_L1:
                throw new RuntimeException((new StringBuilder()).append("Unknown message ").append(message).toString());
_L2:
                GestureDetectorCompat.GestureDetectorCompatImplBase.b(a).onShowPress(GestureDetectorCompat.GestureDetectorCompatImplBase.a(a));
_L6:
                return;
_L3:
                GestureDetectorCompat.GestureDetectorCompatImplBase.c(a);
                return;
_L4:
                if (GestureDetectorCompat.GestureDetectorCompatImplBase.d(a) != null)
                {
                    if (!GestureDetectorCompat.GestureDetectorCompatImplBase.e(a))
                    {
                        GestureDetectorCompat.GestureDetectorCompatImplBase.d(a).onSingleTapConfirmed(GestureDetectorCompat.GestureDetectorCompatImplBase.a(a));
                        return;
                    } else
                    {
                        GestureDetectorCompat.GestureDetectorCompatImplBase.a(a, true);
                        return;
                    }
                }
                if (true) goto _L6; else goto _L5
_L5:
            }

            GestureHandler()
            {
                a = GestureDetectorCompat.GestureDetectorCompatImplBase.this;
                super();
            }

            GestureHandler(Handler handler)
            {
                a = GestureDetectorCompat.GestureDetectorCompatImplBase.this;
                super(handler.getLooper());
            }
        }

        if (handler != null)
        {
            h = new GestureHandler(handler);
        } else
        {
            h = new GestureHandler();
        }
        i = atimplbase;
        if (atimplbase instanceof android.view.atImplBase.i)
        {
            a((android.view.atImplBase.a)atimplbase);
        }
        a(context);
    }
}
