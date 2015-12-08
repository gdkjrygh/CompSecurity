// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.listeners;

import aY;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import bE;

public class SwipeableRecyclerViewItemTouchListener
    implements android.view.View.OnTouchListener
{
    public static final class SwipeDirection extends Enum
    {

        private static final SwipeDirection $VALUES[];
        public static final SwipeDirection LEFT;
        public static final SwipeDirection RIGHT;

        public static SwipeDirection valueOf(String s1)
        {
            return (SwipeDirection)Enum.valueOf(com/snapchat/android/ui/listeners/SwipeableRecyclerViewItemTouchListener$SwipeDirection, s1);
        }

        public static SwipeDirection[] values()
        {
            return (SwipeDirection[])$VALUES.clone();
        }

        static 
        {
            LEFT = new SwipeDirection("LEFT", 0);
            RIGHT = new SwipeDirection("RIGHT", 1);
            $VALUES = (new SwipeDirection[] {
                LEFT, RIGHT
            });
        }

        private SwipeDirection(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static interface a
    {

        public abstract void f(android.support.v7.widget.RecyclerView.v v1);
    }

    public static interface b
    {

        public abstract void g(android.support.v7.widget.RecyclerView.v v1);
    }

    public static interface c
    {

        public abstract void h(android.support.v7.widget.RecyclerView.v v1);
    }

    public static interface d
    {

        public abstract int a(android.support.v7.widget.RecyclerView.v v1);

        public abstract void a(android.support.v7.widget.RecyclerView.v v1, MotionEvent motionevent);

        public abstract void a(android.support.v7.widget.RecyclerView.v v1, boolean flag);

        public abstract boolean a(android.support.v7.widget.RecyclerView.v v1, float f1, float f2, float f3, float f4);

        public abstract boolean b(android.support.v7.widget.RecyclerView.v v1);

        public abstract float c(android.support.v7.widget.RecyclerView.v v1);

        public abstract void d(android.support.v7.widget.RecyclerView.v v1);

        public abstract void e(android.support.v7.widget.RecyclerView.v v1);
    }


    private int a;
    public a b;
    public b c;
    public c d;
    private int e;
    private int f;
    private int g;
    private int h;
    private float i;
    private final RecyclerView j;
    private final d k;
    private final SwipeDirection l;
    private final Handler m = new Handler();
    private float n;
    private float o;
    private float p;
    private float q;
    private Integer r;
    private Integer s;
    private boolean t;
    private boolean u;
    private int v;
    private VelocityTracker w;
    private boolean x;
    private long y;
    private boolean z;

    public SwipeableRecyclerViewItemTouchListener(RecyclerView recyclerview, SwipeDirection swipedirection, d d1)
    {
        Resources resources = recyclerview.getContext().getResources();
        float f1 = resources.getDisplayMetrics().density;
        a = ViewConfiguration.get(recyclerview.getContext()).getScaledTouchSlop();
        e = (int)(400F * f1);
        f = (int)(f1 * 25F);
        g = resources.getInteger(0x10e0000);
        j = recyclerview;
        k = d1;
        l = swipedirection;
    }

    static float a(SwipeableRecyclerViewItemTouchListener swipeablerecyclerviewitemtouchlistener, float f1)
    {
        swipeablerecyclerviewitemtouchlistener.i = f1;
        return f1;
    }

    static RecyclerView a(SwipeableRecyclerViewItemTouchListener swipeablerecyclerviewitemtouchlistener)
    {
        return swipeablerecyclerviewitemtouchlistener.j;
    }

    private void a(Integer integer, int i1, int j1)
    {
        a(integer, i1, j1, ((Interpolator) (new LinearInterpolator())));
    }

    private void a(Integer integer, int i1, int j1, Interpolator interpolator)
    {
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            (int)i, i1
        }).setDuration(j1);
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(integer) {

            private Integer a;
            private SwipeableRecyclerViewItemTouchListener b;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                float f2 = 1.0F;
                android.support.v7.widget.RecyclerView.v v1 = SwipeableRecyclerViewItemTouchListener.a(b).c(a.intValue());
                if (v1 != null)
                {
                    SwipeableRecyclerViewItemTouchListener.a(b, ((Integer)valueanimator1.getAnimatedValue()).intValue());
                    int k1 = SwipeableRecyclerViewItemTouchListener.e(b).a(v1);
                    float f3 = -SwipeableRecyclerViewItemTouchListener.f(b) / (float)k1;
                    float f1 = f3;
                    if (f3 < 0.0F)
                    {
                        f1 = 0.0F;
                    }
                    if (f1 > 1.0F)
                    {
                        f1 = f2;
                    }
                    SwipeableRecyclerViewItemTouchListener.e(b).a(v1, SwipeableRecyclerViewItemTouchListener.f(b), f1, SwipeableRecyclerViewItemTouchListener.g(b), SwipeableRecyclerViewItemTouchListener.h(b));
                }
            }

            
            {
                b = SwipeableRecyclerViewItemTouchListener.this;
                a = integer;
                super();
            }
        });
        valueanimator.addListener(new android.animation.Animator.AnimatorListener(integer) {

            private Integer a;
            private SwipeableRecyclerViewItemTouchListener b;

            public final void onAnimationCancel(Animator animator)
            {
            }

            public final void onAnimationEnd(Animator animator)
            {
                if (SwipeableRecyclerViewItemTouchListener.e(b) != null && a.intValue() != -1)
                {
                    SwipeableRecyclerViewItemTouchListener.a(b).c(a.intValue());
                }
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
            }

            
            {
                b = SwipeableRecyclerViewItemTouchListener.this;
                a = integer;
                super();
            }
        });
        valueanimator.setInterpolator(interpolator);
        valueanimator.start();
    }

    static c b(SwipeableRecyclerViewItemTouchListener swipeablerecyclerviewitemtouchlistener)
    {
        return swipeablerecyclerviewitemtouchlistener.d;
    }

    static boolean c(SwipeableRecyclerViewItemTouchListener swipeablerecyclerviewitemtouchlistener)
    {
        swipeablerecyclerviewitemtouchlistener.z = true;
        return true;
    }

    static Integer d(SwipeableRecyclerViewItemTouchListener swipeablerecyclerviewitemtouchlistener)
    {
        swipeablerecyclerviewitemtouchlistener.s = null;
        return null;
    }

    static d e(SwipeableRecyclerViewItemTouchListener swipeablerecyclerviewitemtouchlistener)
    {
        return swipeablerecyclerviewitemtouchlistener.k;
    }

    static float f(SwipeableRecyclerViewItemTouchListener swipeablerecyclerviewitemtouchlistener)
    {
        return swipeablerecyclerviewitemtouchlistener.i;
    }

    static float g(SwipeableRecyclerViewItemTouchListener swipeablerecyclerviewitemtouchlistener)
    {
        return swipeablerecyclerviewitemtouchlistener.o;
    }

    static float h(SwipeableRecyclerViewItemTouchListener swipeablerecyclerviewitemtouchlistener)
    {
        return swipeablerecyclerviewitemtouchlistener.q;
    }

    public final void a(boolean flag)
    {
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        x = flag;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        float f1;
        boolean flag;
        boolean flag2;
        view = null;
        flag = true;
        flag2 = true;
        f1 = 0.0F;
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 44
    //                   0 46
    //                   1 1682
    //                   2 1005
    //                   3 334;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return false;
_L2:
        if (x) goto _L1; else goto _L6
_L6:
        float f2;
        RecyclerView recyclerview;
        int i1;
        recyclerview = j;
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        i1 = recyclerview.c.a() - 1;
_L11:
        if (i1 < 0) goto _L8; else goto _L7
_L7:
        float f5;
        float f7;
        view = recyclerview.c.b(i1);
        f5 = aY.k(view);
        f7 = aY.l(view);
        if (f1 < (float)view.getLeft() + f5 || f1 > f5 + (float)view.getRight() || f2 < (float)view.getTop() + f7 || f2 > (float)view.getBottom() + f7) goto _L10; else goto _L9
_L9:
        r = Integer.valueOf(RecyclerView.c(view));
        if (r.intValue() != -1)
        {
            n = motionevent.getRawX();
            p = motionevent.getRawY();
            o = motionevent.getX();
            q = motionevent.getY();
            view = j.c(r.intValue());
            k.a(view, motionevent);
            h = 0;
            i = h;
            w = VelocityTracker.obtain();
            w.addMovement(motionevent);
            y = SystemClock.uptimeMillis();
            if (d != null)
            {
                i1 = r.intValue();
                m.postDelayed(new Runnable(i1) {

                    private int a;
                    private SwipeableRecyclerViewItemTouchListener b;

                    public final void run()
                    {
                        android.support.v7.widget.RecyclerView.v v3 = SwipeableRecyclerViewItemTouchListener.a(b).c(a);
                        SwipeableRecyclerViewItemTouchListener.b(b).h(v3);
                        SwipeableRecyclerViewItemTouchListener.c(b);
                    }

            
            {
                b = SwipeableRecyclerViewItemTouchListener.this;
                a = i1;
                super();
            }
                }, ViewConfiguration.getLongPressTimeout());
                return false;
            }
        }
          goto _L1
_L10:
        i1--;
          goto _L11
_L8:
        view = null;
          goto _L9
_L5:
        int j1 = 1;
_L20:
        if (w == null || x || r.intValue() == -1) goto _L1; else goto _L12
_L12:
        m.removeCallbacksAndMessages(null);
        view = j.c(r.intValue());
        f1 = motionevent.getRawX() - n;
        w.addMovement(motionevent);
        w.computeCurrentVelocity(1000);
        f2 = w.getXVelocity();
        f5 = Math.abs(f2);
        f7 = Math.abs(w.getYVelocity());
        if (!k.b(view)) goto _L14; else goto _L13
_L13:
        if (Math.abs(f1) < (float)k.a(view)) goto _L16; else goto _L15
_L15:
        i1 = ((flag2) ? 1 : 0);
_L18:
        boolean flag1;
        if (i1 != 0)
        {
            if (j1 == 0 && f1 > 0.0F)
            {
                a(r, 0, g);
                k.d(view);
            } else
            if (u)
            {
                a(r, k.a(view), 50, new DecelerateInterpolator());
            } else
            {
                i = 0.0F;
            }
        } else
        {
            if (Math.abs(f1) <= (float)a && Math.abs(motionevent.getRawY() - p) <= (float)a)
            {
                if (b != null && SystemClock.uptimeMillis() - y < (long)ViewConfiguration.getLongPressTimeout() && r.intValue() != -1)
                {
                    b.f(view);
                }
                if (c != null)
                {
                    if (r != null && r.intValue() != -1 && r.equals(s))
                    {
                        c.g(view);
                        s = null;
                    } else
                    if (!z)
                    {
                        s = r;
                        (new Handler()).postDelayed(new Runnable() {

                            private SwipeableRecyclerViewItemTouchListener a;

                            public final void run()
                            {
                                SwipeableRecyclerViewItemTouchListener.d(a);
                            }

            
            {
                a = SwipeableRecyclerViewItemTouchListener.this;
                super();
            }
                        }, ViewConfiguration.getDoubleTapTimeout());
                    }
                }
            }
            motionevent = j.c(r.intValue());
            if (motionevent != null)
            {
                if (h != 0)
                {
                    f1 = (float)k.a(motionevent) / 2.0F;
                    if ((float)h > f1)
                    {
                        h = k.a(motionevent);
                        if (l.equals(SwipeDirection.LEFT))
                        {
                            h = -h;
                        }
                    } else
                    {
                        h = 0;
                    }
                }
                a(r, h, g);
            }
        }
        k.e(view);
        w.recycle();
        w = null;
        n = 0.0F;
        p = 0.0F;
        r = null;
        t = false;
        u = false;
        h = 0;
        i = 0.0F;
        y = 0L;
        z = false;
        return false;
_L16:
        i1 = ((flag2) ? 1 : 0);
        if ((float)e <= f2) goto _L18; else goto _L17
_L17:
        if ((float)e > f5 || f7 >= f5 || !t) goto _L14; else goto _L19
_L19:
        if (f2 < 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (f1 < 0.0F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i1 = ((flag2) ? 1 : 0);
        if (flag != flag1)
        {
            i1 = 0;
        }
          goto _L18
_L4:
        if (w != null && !x && r.intValue() != -1)
        {
            if (Math.abs(motionevent.getRawX() - n) > (float)a || Math.abs(motionevent.getRawY() - p) > (float)a)
            {
                m.removeCallbacksAndMessages(null);
            }
            w.addMovement(motionevent);
            float f6 = motionevent.getRawX() - n;
            float f3 = motionevent.getRawY();
            float f8 = p;
            if (!u)
            {
                w.computeCurrentVelocity(1000);
                float f9 = w.getXVelocity();
                android.support.v7.widget.RecyclerView.v v1;
                if (f9 > w.getYVelocity() && f9 > (float)e)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (f6 > (float)f)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                if (j1 != 0 && i1 != 0)
                {
                    u = true;
                }
            }
            v1 = j.c(r.intValue());
            if (k.b(v1))
            {
                android.support.v7.widget.RecyclerView.v v2 = j.c(r.intValue());
                if (f6 > 0.0F)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                j1 = (int)k.c(v2);
                if (j1 == 0 && i1 == 0 && l == SwipeDirection.RIGHT || j1 == 0 && i1 != 0 && l == SwipeDirection.LEFT)
                {
                    view = Boolean.valueOf(false);
                } else
                {
                    if (Math.abs(f6) > (float)a && Math.abs(f3 - f8) < Math.abs(f6) / 2.0F)
                    {
                        t = true;
                        MotionEvent motionevent1;
                        if (i1 != 0)
                        {
                            i1 = a;
                        } else
                        {
                            i1 = -a;
                        }
                        v = i1;
                        motionevent1 = MotionEvent.obtain(motionevent);
                        motionevent1.setAction(motionevent.getActionIndex() << 8 | 3);
                        j.onTouchEvent(motionevent1);
                        motionevent1.recycle();
                    }
                    if (t || u)
                    {
                        i = ((float)h + f6) - (float)v;
                        if (l == SwipeDirection.LEFT && i > 0.0F)
                        {
                            i = 0.0F;
                        }
                        if (l == SwipeDirection.RIGHT && i < 0.0F)
                        {
                            i = 0.0F;
                        }
                        i1 = k.a(v2);
                        float f4 = -i / (float)i1;
                        if (f4 >= 0.0F)
                        {
                            f1 = f4;
                        }
                        f4 = f1;
                        if (f1 > 1.0F)
                        {
                            f4 = 1.0F;
                        }
                        i1 = k.a(v2);
                        if (Math.abs(f6) >= (float)i1 && k.c(v2) >= (float)i1)
                        {
                            i1 = ((flag) ? 1 : 0);
                        } else
                        {
                            i1 = 0;
                        }
                        if (u || i1 != 0)
                        {
                            k.a(v2, u);
                        }
                        view = Boolean.valueOf(k.a(v2, i, f4, o, q));
                    }
                }
                if (view != null)
                {
                    return view.booleanValue();
                }
            }
        }
          goto _L1
_L14:
        i1 = 0;
          goto _L18
_L3:
        j1 = 0;
          goto _L20
    }

    // Unreferenced inner class com/snapchat/android/ui/listeners/SwipeableRecyclerViewItemTouchListener$1

/* anonymous class */
    public final class _cls1 extends android.support.v7.widget.RecyclerView.l
    {

        private SwipeableRecyclerViewItemTouchListener a;

        public final void a(RecyclerView recyclerview, int i1)
        {
            super.a(recyclerview, i1);
            recyclerview = a;
            boolean flag;
            if (i1 == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            recyclerview.a(flag);
        }

        public final void a(RecyclerView recyclerview, int i1, int j1)
        {
            super.a(recyclerview, i1, j1);
        }

            public 
            {
                a = SwipeableRecyclerViewItemTouchListener.this;
                super();
            }
    }

}
