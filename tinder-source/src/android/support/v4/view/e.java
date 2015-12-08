// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

// Referenced classes of package android.support.v4.view:
//            n, w

public final class e
{
    static interface a
    {

        public abstract boolean a(MotionEvent motionevent);
    }

    static final class b
        implements a
    {

        private static final int e = ViewConfiguration.getLongPressTimeout();
        private static final int f = ViewConfiguration.getTapTimeout();
        private static final int g = ViewConfiguration.getDoubleTapTimeout();
        private int a;
        private int b;
        private int c;
        private int d;
        private final Handler h = new a(this);
        private final android.view.GestureDetector.OnGestureListener i;
        private android.view.GestureDetector.OnDoubleTapListener j;
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

        static MotionEvent a(b b1)
        {
            return b1.p;
        }

        static android.view.GestureDetector.OnGestureListener b(b b1)
        {
            return b1.i;
        }

        static void c(b b1)
        {
            b1.h.removeMessages(3);
            b1.l = false;
            b1.m = true;
            b1.i.onLongPress(b1.p);
        }

        static android.view.GestureDetector.OnDoubleTapListener d(b b1)
        {
            return b1.j;
        }

        static boolean e(b b1)
        {
            return b1.k;
        }

        static boolean f(b b1)
        {
            b1.l = true;
            return true;
        }

        public final boolean a(MotionEvent motionevent)
        {
            float f1;
            float f2;
            int k3;
            int l3 = motionevent.getAction();
            if (x == null)
            {
                x = VelocityTracker.obtain();
            }
            x.addMovement(motionevent);
            boolean flag;
            int i2;
            int i3;
            if ((l3 & 0xff) == 6)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                i2 = android.support.v4.view.n.b(motionevent);
            } else
            {
                i2 = -1;
            }
            k3 = android.support.v4.view.n.c(motionevent);
            i3 = 0;
            f1 = 0.0F;
            float f3;
            for (f2 = 0.0F; i3 < k3; f2 = f3)
            {
                float f6 = f1;
                f3 = f2;
                if (i2 != i3)
                {
                    f3 = f2 + android.support.v4.view.n.c(motionevent, i3);
                    f6 = f1 + android.support.v4.view.n.d(motionevent, i3);
                }
                i3++;
                f1 = f6;
            }

            int i1;
            if (flag)
            {
                i1 = k3 - 1;
            } else
            {
                i1 = k3;
            }
            f2 /= i1;
            f1 /= i1;
            l3 & 0xff;
            JVM INSTR tableswitch 0 6: default 204
        //                       0 435
        //                       1 995
        //                       2 776
        //                       3 1269
        //                       4 204
        //                       5 213
        //                       6 291;
               goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
            return false;
_L6:
            s = f2;
            u = f2;
            t = f1;
            v = f1;
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
                return false;
            }
            continue; /* Loop/switch isn't completed */
_L7:
            s = f2;
            u = f2;
            t = f1;
            v = f1;
            x.computeCurrentVelocity(1000, d);
            int j2 = android.support.v4.view.n.b(motionevent);
            int j1 = android.support.v4.view.n.b(motionevent, j2);
            f1 = android.support.v4.view.w.a(x, j1);
            f2 = android.support.v4.view.w.b(x, j1);
            j1 = 0;
            while (j1 < k3) 
            {
                if (j1 != j2)
                {
                    int j3 = android.support.v4.view.n.b(motionevent, j1);
                    float f4 = android.support.v4.view.w.a(x, j3);
                    if (android.support.v4.view.w.b(x, j3) * f2 + f4 * f1 < 0.0F)
                    {
                        x.clear();
                        return false;
                    }
                }
                j1++;
            }
            if (true) goto _L1; else goto _L2
_L2:
            boolean flag1;
            if (j == null)
            {
                break MISSING_BLOCK_LABEL_770;
            }
            flag1 = h.hasMessages(3);
            if (flag1)
            {
                h.removeMessages(3);
            }
            if (p == null || q == null || !flag1) goto _L9; else goto _L8
_L8:
            MotionEvent motionevent1;
            MotionEvent motionevent3;
            motionevent1 = p;
            motionevent3 = q;
            if (!o || motionevent.getEventTime() - motionevent3.getEventTime() > (long)g) goto _L11; else goto _L10
_L10:
            int k1;
            int k2;
            k1 = (int)motionevent1.getX() - (int)motionevent.getX();
            k2 = (int)motionevent1.getY() - (int)motionevent.getY();
            if (k2 * k2 + k1 * k1 >= b) goto _L11; else goto _L12
_L12:
            k1 = 1;
_L14:
            if (!k1) goto _L9; else goto _L13
_L13:
            r = true;
            k1 = j.onDoubleTap(p) | false | j.onDoubleTapEvent(motionevent);
_L15:
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
            return k1 | i.onDown(motionevent);
_L11:
            k1 = 0;
              goto _L14
_L9:
            h.sendEmptyMessageDelayed(3, g);
            k1 = 0;
              goto _L15
_L4:
            if (!m)
            {
                float f5 = s - f2;
                float f7 = t - f1;
                if (r)
                {
                    return j.onDoubleTapEvent(motionevent) | false;
                }
                if (n)
                {
                    int l1 = (int)(f2 - u);
                    int l2 = (int)(f1 - v);
                    l1 = l1 * l1 + l2 * l2;
                    MotionEvent motionevent2;
                    VelocityTracker velocitytracker;
                    boolean flag2;
                    boolean flag3;
                    if (l1 > a)
                    {
                        flag2 = i.onScroll(p, motionevent, f5, f7);
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
                    if (l1 > a)
                    {
                        o = false;
                    }
                    return flag2;
                }
                if (Math.abs(f5) >= 1.0F || Math.abs(f7) >= 1.0F)
                {
                    flag2 = i.onScroll(p, motionevent, f5, f7);
                    s = f2;
                    t = f1;
                    return flag2;
                }
            }
_L16:
            if (true) goto _L1; else goto _L3
_L3:
            k = false;
            motionevent2 = MotionEvent.obtain(motionevent);
            if (r)
            {
                flag2 = j.onDoubleTapEvent(motionevent) | false;
            } else
            if (m)
            {
                h.removeMessages(3);
                m = false;
                flag2 = false;
            } else
            if (n)
            {
                flag3 = i.onSingleTapUp(motionevent);
                flag2 = flag3;
                if (l)
                {
                    flag2 = flag3;
                    if (j != null)
                    {
                        j.onSingleTapConfirmed(motionevent);
                        flag2 = flag3;
                    }
                }
            } else
            {
                velocitytracker = x;
                l1 = android.support.v4.view.n.b(motionevent, 0);
                velocitytracker.computeCurrentVelocity(1000, d);
                f1 = android.support.v4.view.w.b(velocitytracker, l1);
                f2 = android.support.v4.view.w.a(velocitytracker, l1);
                if (Math.abs(f1) > (float)c || Math.abs(f2) > (float)c)
                {
                    flag2 = i.onFling(p, motionevent, f2, f1);
                } else
                {
                    flag2 = false;
                }
            }
            if (q != null)
            {
                q.recycle();
            }
            q = motionevent2;
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
                return false;
            }
              goto _L16
        }


        public b(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener)
        {
            i = ongesturelistener;
            if (ongesturelistener instanceof android.view.GestureDetector.OnDoubleTapListener)
            {
                j = (android.view.GestureDetector.OnDoubleTapListener)ongesturelistener;
            }
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
    }

    private final class b.a extends Handler
    {

        final b a;

        public final void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 1 3: default 32
        //                       1 56
        //                       2 76
        //                       3 84;
               goto _L1 _L2 _L3 _L4
_L1:
            throw new RuntimeException((new StringBuilder("Unknown message ")).append(message).toString());
_L2:
            b.b(a).onShowPress(b.a(a));
_L6:
            return;
_L3:
            b.c(a);
            return;
_L4:
            if (b.d(a) != null)
            {
                if (!b.e(a))
                {
                    b.d(a).onSingleTapConfirmed(b.a(a));
                    return;
                } else
                {
                    b.f(a);
                    return;
                }
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        b.a(b b1)
        {
            a = b1;
            super();
        }
    }

    static final class c
        implements a
    {

        private final GestureDetector a;

        public final boolean a(MotionEvent motionevent)
        {
            return a.onTouchEvent(motionevent);
        }

        public c(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener)
        {
            a = new GestureDetector(context, ongesturelistener, null);
        }
    }


    private final a a;

    public e(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener)
    {
        this(context, ongesturelistener, (byte)0);
    }

    private e(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, byte byte0)
    {
        if (android.os.Build.VERSION.SDK_INT > 17)
        {
            a = new c(context, ongesturelistener);
            return;
        } else
        {
            a = new b(context, ongesturelistener);
            return;
        }
    }

    public final boolean a(MotionEvent motionevent)
    {
        return a.a(motionevent);
    }
}
